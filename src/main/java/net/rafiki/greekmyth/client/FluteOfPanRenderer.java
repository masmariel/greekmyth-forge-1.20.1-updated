package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.FluteOfPanItem;

public class FluteOfPanRenderer extends GeoItemRenderer<FluteOfPanItem> {
    public FluteOfPanRenderer() {
        super(new FluteOfPanModel());
    }
}