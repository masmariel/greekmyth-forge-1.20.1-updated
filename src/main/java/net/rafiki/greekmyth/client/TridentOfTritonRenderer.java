package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.TridentOfTritonItem;

public class TridentOfTritonRenderer extends GeoItemRenderer<TridentOfTritonItem> {
    public TridentOfTritonRenderer() {
        super(new TridentOfTritonModel());
    }
}