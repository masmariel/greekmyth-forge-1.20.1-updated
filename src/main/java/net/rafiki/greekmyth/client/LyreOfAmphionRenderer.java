package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.LyreOfAmphionItem;

public class LyreOfAmphionRenderer extends GeoItemRenderer<LyreOfAmphionItem> {
    public LyreOfAmphionRenderer() {
        super(new LyreOfAmphionModel());
    }
}