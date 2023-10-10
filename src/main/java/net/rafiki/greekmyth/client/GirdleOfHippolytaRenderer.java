package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.EmperorsCrownItem;
import net.rafiki.greekmyth.item.custom.GirdleOfHippolytaItem;

public class GirdleOfHippolytaRenderer extends GeoArmorRenderer<GirdleOfHippolytaItem> {
    public GirdleOfHippolytaRenderer() {
        super(new GirdleOfHippolytaModel());
    }
}
