package com.curudAPI.service;

import com.curudAPI.entity.Merchant;
import com.curudAPI.repository.AddressRepository;
import com.curudAPI.repository.ContactRepository;
import com.curudAPI.repository.MerchantRepository;
import com.curudAPI.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class MerchantService {

    private final MerchantRepository merchantRepository;
    private final ContactRepository contactRepository;
    private final AddressRepository addressRepository;
    private final ProductRepository productRepository;

    public MerchantService(MerchantRepository merchantRepository,
                           ContactRepository contactRepository,
                           AddressRepository addressRepository,
                           ProductRepository productRepository) {
        this.merchantRepository = merchantRepository;
        this.contactRepository = contactRepository;
        this.addressRepository = addressRepository;
        this.productRepository = productRepository;
    }

    public Merchant saveMerchantDetails(JSONObject jsonObject) {
        log.info("Received JSON payload: {}", jsonObject);

        Merchant merchant = new Merchant();
        merchant.setTradeLicenceNumber(jsonObject.optInt("tradeLicenceNumber"));
        merchant.setBusinessName(jsonObject.optString("businessName", "N/A"));
        merchant.setOwnerName(jsonObject.optString("ownerName", "N/A"));
        log.info("Mapped Merchant basic details: {}", merchant);

        // Handle contact details
        JSONObject jsonContact = jsonObject.optJSONObject("contactNumbers");
        if (jsonContact != null) {
            Merchant.Contact contact = new Merchant.Contact();
            contact.setHome(jsonContact.optString("home", "N/A"));
            contact.setOffice(jsonContact.optString("office", "N/A"));
            contact.setMobile(jsonContact.optString("mobile", "N/A"));
            contact = contactRepository.save(contact); // Save and update contact with generated ID
            log.info("Saved Contact details: {}", contact);
            merchant.setContact(contact);
        }

        // Handle address details
        JSONObject jsonAddress = jsonObject.optJSONObject("address");
        if (jsonAddress != null) {
            Merchant.Address address = new Merchant.Address();
            address.setStreet(jsonAddress.optString("street", "N/A"));
            address.setCity(jsonAddress.optString("city", "N/A"));
            address.setZipCode(jsonAddress.optString("zipCode", "N/A"));
            address = addressRepository.save(address); // Save and update address with generated ID
            log.info("Saved Address details: {}", address);
            merchant.setAddress(address);
        }

        // Handle products list
        JSONArray productsJson = jsonObject.optJSONArray("products");
        if (productsJson != null) {
            List<Merchant.Product> productList = new ArrayList<>();
            for (int i = 0; i < productsJson.length(); i++) {
                JSONObject productJson = productsJson.getJSONObject(i);
                Merchant.Product product = new Merchant.Product();
                product.setProductId(productJson.optInt("productId", 0));
                product.setProductName(productJson.optString("productName", "Unknown Product"));
                product.setPrice(productJson.optDouble("price", 0.0));
                product = productRepository.save(product); // Save and update product with generated ID
                log.info("Saved Product details: {}", product);
                productList.add(product);
            }
            merchant.setProducts(productList);
        }

        Merchant savedMerchant = merchantRepository.save(merchant); // Save the merchant and generate its ID
        log.info("Saved Merchant with ID: {}", savedMerchant.getId());

        return savedMerchant;
    }
    public List<Merchant> fetchAllMerchants() {
        List<Merchant> merchants = merchantRepository.findAll();
        if (merchants.isEmpty()) {
            log.info("No merchants found in the database.");
        } else {
            log.info("Fetched all merchants: {}", merchants);
        }
        return merchants;
    }
}