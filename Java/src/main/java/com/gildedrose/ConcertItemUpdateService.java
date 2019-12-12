package com.gildedrose;

public class ConcertItemUpdateService implements ItemUpdateServiceInterface {
    private Item item;

    public ConcertItemUpdateService(Item item) {
        this.item = item;
    }


    @Override
    public void update() {
        ItemUtils.decreaseSellIn(item);

        if (!ItemUtils.checkItemName(item, ItemUtils.CONCERT)) {
            return;
        }

        ItemUtils.updateItemQuality(item, 1);

        if (item.sellIn < 0) {
            item.quality = 0;
            return;
        }
        if (item.sellIn < 5) {
            ItemUtils.updateItemQuality(item, 1);
        }
        if (item.sellIn < 10) {
            ItemUtils.updateItemQuality(item, 1);
        }
    }
}
