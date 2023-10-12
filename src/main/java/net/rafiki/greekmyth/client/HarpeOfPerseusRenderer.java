package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.HarpeOfPerseusItem;

public class HarpeOfPerseusRenderer extends GeoItemRenderer<HarpeOfPerseusItem> {
    public HarpeOfPerseusRenderer() {
        super(new HarpeOfPerseusModel());
    }
}