package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.LabrysItem;

public class LabrysRenderer extends GeoItemRenderer<LabrysItem> {
    public LabrysRenderer() {
        super(new LabrysModel());
    }
}