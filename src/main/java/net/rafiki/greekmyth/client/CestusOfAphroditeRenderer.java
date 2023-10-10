package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.CestusOfAphroditeItem;
import net.rafiki.greekmyth.item.custom.GirdleOfHippolytaItem;

public class CestusOfAphroditeRenderer extends GeoArmorRenderer<CestusOfAphroditeItem> {
    public CestusOfAphroditeRenderer() {
        super(new CestusOfAphroditeModel());
    }
}
