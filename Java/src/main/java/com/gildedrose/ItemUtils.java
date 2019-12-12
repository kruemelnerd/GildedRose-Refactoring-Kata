package com.gildedrose;

public class ItemUtils {
    private ItemUtils() {
    }

    public static final String CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_CHEESE = "Aged Brie";
    public static final String LEGENDARY_ITEM = "Sulfuras, Hand of Ragnaros";

    static boolean checkItemName(Item item, String name) {
        return name.equals(item.name);
    }

    static void updateItemQuality(Item item, int updateInterval) {
        item.quality = item.quality + updateInterval;

        if (item.quality > 50) {
            item.quality = 50;
        } else if (item.quality < 0) {
            item.quality = 0;
        }
    }

    static void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }
}