package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AolusItem;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;

public class AolusRenderer extends GeoItemRenderer<AolusItem> {
    public AolusRenderer() {
        super(new AolusModel());
    }
}