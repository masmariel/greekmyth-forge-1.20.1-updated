package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.SpearOfDiomedesItem;

public class SpearOfDiomedesRenderer extends GeoItemRenderer<SpearOfDiomedesItem> {
    public SpearOfDiomedesRenderer() {
        super(new SpearOfDiomedesModel());
    }
}