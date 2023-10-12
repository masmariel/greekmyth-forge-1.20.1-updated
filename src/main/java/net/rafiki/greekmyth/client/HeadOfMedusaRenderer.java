package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.HeadOfMedusaItem;

public class HeadOfMedusaRenderer extends GeoItemRenderer<HeadOfMedusaItem> {
    public HeadOfMedusaRenderer() {
        super(new HeadOfMedusaModel());
    }
}