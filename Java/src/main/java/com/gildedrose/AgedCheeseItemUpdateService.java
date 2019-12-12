package com.gildedrose;

public class AgedCheeseItemUpdateService implements ItemUpdateServiceInterface {
    private Item item;

    public AgedCheeseItemUpdateService(Item item) {
        this.item = item;
    }


    @Override
    public void update() {
        // updat(Item item)
        // if(item != AgedCheese)
        this.decreaseSellIn();
        this.updateQuality();
    }

    private void updateQuality() {
        int updateInterval = 1;
        if (item.sellIn < 0) {
            updateInterval = 2;
        }
        ItemUtils.updateItemQuality(item, updateInterval);
    }

    private void decreaseSellIn() {
        // item.decreaseSellIn()
        ItemUtils.decreaseSellIn(item);
    }


}
