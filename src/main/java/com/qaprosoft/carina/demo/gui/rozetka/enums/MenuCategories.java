package com.qaprosoft.carina.demo.gui.rozetka.enums;

public enum MenuCategories {

    COMPUTERS_NOTEBOOKS("computers-notebooks"),
    PHONES_ELECTRONICS("telefony-tv-i-ehlektronika"),
    PRODUCT_GAMERS("game-zone"),
    TECHNICS(""),
    PRODUCT_HOME("tovary-dlya-doma"),
    INSTRUMENTS_AUTO_PRODUCTS("instrumenty-i-avtotovary"),
    SANTEHNIKA_REMONT("santekhnika-i-remont");

    private final String categories;

    MenuCategories(String categories) {
        this.categories = categories;
    }

    public String getCategories() {
        return categories;
    }

}
