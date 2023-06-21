package com.sparklingcup;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SparklingCupTest {
    @Test
    void updateQualityTest() {
        Item[] items = new Item[] { new Item("Conjured Produit", 2, 10)}; // test for only Conjured product
        SparklingCup app = new SparklingCup(items);
        // day 1 : reduce quality by 2
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
        // day 2  : reduce quality by 2
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        // day 3  : reduce quality by 2 * 2
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
        // day 4 :  : reduce quality by 2 * 2 -> 0 since quality cannot be negative 
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
    }
}