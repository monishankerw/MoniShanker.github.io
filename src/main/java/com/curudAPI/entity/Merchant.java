package com.curudAPI.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL) // Exclude null fields
@Table(name = "merchant")
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Integer tradeLicenceNumber;
    private String businessName;
    private String ownerName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "merchant_id")
    private List<Product> products;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Entity
    @Table(name = "contactNumbers")
    @JsonInclude(JsonInclude.Include.NON_NULL) // Exclude null fields
    public static class Contact {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String home;
        private String office;
        private String mobile;
    }

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Table(name = "address")
    @JsonInclude(JsonInclude.Include.NON_NULL) // Exclude null fields
    public static class Address {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String street;
        private String city;
        private String zipCode;
    }

    @Entity
    @Table(name = "products")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @JsonInclude(JsonInclude.Include.NON_NULL) // Exclude null fields
    public static class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private Integer productId;
        private String productName;
        private Double price;
    }
}