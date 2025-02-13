package com.gildedrose;


import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class TexttestFixture {

    @Test
    public void goldenMaster() {
        StringBuffer output = new StringBuffer();
        output.append("OMGHAI!");
        output.append(System.lineSeparator());

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 25;

        for (int i = 0; i < days; i++) {
            output.append("-------- day " + i + " --------");
            output.append(System.lineSeparator());
            output.append("name, sellIn, quality");
            output.append(System.lineSeparator());
            for (Item item : items) {
                output.append(item);
                output.append(System.lineSeparator());
            }
            output.append(System.lineSeparator());
            app.updateQuality();
        }

        Approvals.verify(output.toString());
    }

}
