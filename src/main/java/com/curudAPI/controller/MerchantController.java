package com.curudAPI.controller;

import com.curudAPI.entity.Merchant;
import com.curudAPI.service.MerchantService;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/merchants")
public class MerchantController {

    private final MerchantService merchantService;

    public MerchantController(MerchantService merchantService) {
        this.merchantService = merchantService;
    }

    @PostMapping("/save")
    public ResponseEntity<Merchant> saveMerchant(@RequestBody String payload) {
        log.info("Received payload for saving Merchant: {}", payload);
        JSONObject jsonObject = new JSONObject(payload); // Parse incoming JSON string
        Merchant savedMerchant = merchantService.saveMerchantDetails(jsonObject);
        log.info("Merchant successfully saved: {}", savedMerchant);
        return ResponseEntity.ok(savedMerchant);
    }

    @GetMapping("/merchants")
    public ResponseEntity<List<Merchant>> getAllMerchants() {
        List<Merchant> merchants = merchantService.fetchAllMerchants();
        return ResponseEntity.ok(merchants);
    }
}