package com.qaprosoft.carina.demo.gui.rozetka.enums;

public enum ProductBrands {

    ASUS("ASUS"),
    ACER("Acer"),
    APPLE("Apple"),
    DELL("Dell"),
    HP("HP"),
    HONOR("Honor"),
    HUAWEI("Huawei"),
    LENOVO("Lenovo"),
    MSI("MSI"),
    MICROSOFT("Microsoft"),
    SAMSUNG("Samsung"),
    XIAOMI("Xiaomi");

    private final String brand;

    ProductBrands(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
