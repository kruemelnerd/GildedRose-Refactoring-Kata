package com.gildedrose;

public class ItemUpdateServiceFactory {

    public ItemUpdateServiceInterface create(Item item) {

        if (ItemUtils.checkItemName(item, ItemUtils.AGED_CHEESE)) {
            return new AgedCheeseItemUpdateService(item);
        } else if (ItemUtils.checkItemName(item, ItemUtils.LEGENDARY_ITEM)) {
            return new LegendaryItemUpdateService(item);
        } else if (ItemUtils.checkItemName(item, ItemUtils.CONCERT)) {
            return new ConcertItemUpdateService(item);
        } else {
            return new DefaultItemUpdateService(item);
        }
    }
}
