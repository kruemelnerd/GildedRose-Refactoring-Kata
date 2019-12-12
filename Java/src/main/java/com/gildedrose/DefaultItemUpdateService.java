package com.gildedrose;

public class DefaultItemUpdateService implements ItemUpdateServiceInterface {
    private Item item;

    public DefaultItemUpdateService(Item item) {
        this.item = item;
    }


    @Override
    public void update() {
        ItemUtils.decreaseSellIn(item);

        ItemUtils.updateItemQuality(item, -1);
        if (item.sellIn < 0) {
            ItemUtils.updateItemQuality(item, -1);
        }
    }
}
