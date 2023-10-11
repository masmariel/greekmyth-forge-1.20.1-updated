package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.BidentOfHadesItem;

public class BidentOfHadesRenderer extends GeoItemRenderer<BidentOfHadesItem> {
    public BidentOfHadesRenderer() {
        super(new BidentOfHadesModel());
    }
}