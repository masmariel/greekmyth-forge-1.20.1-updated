package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.CaduceusItem;

public class AxeOfPerdixRenderer extends GeoItemRenderer<AxeOfPerdixItem> {
    public AxeOfPerdixRenderer() {
        super(new AxeOfPerdixModel());
    }
}