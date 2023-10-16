package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AolusItem;
import net.rafiki.greekmyth.item.custom.BowOfErosItem;

public class BowOfErosRenderer extends GeoItemRenderer<BowOfErosItem> {
    public BowOfErosRenderer() {
        super(new BowOfErosModel());
    }
}