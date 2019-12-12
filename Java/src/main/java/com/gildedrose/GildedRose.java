package com.gildedrose;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
class GildedRose {

    Item[] items;
    List<ItemUpdateServiceInterface> itemWrappers;

    public GildedRose(Item[] items) {

        this.items = items;

        itemWrappers = new ArrayList<>();

        ItemUpdateServiceFactory factory = new ItemUpdateServiceFactory();

        Arrays.stream(items).forEach(item ->
                itemWrappers.add(factory.create(item))
        );
    }

    public void updateQuality() {
        itemWrappers.forEach(ItemUpdateServiceInterface::update);
    }
}