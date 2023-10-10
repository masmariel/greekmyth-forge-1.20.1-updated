package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.CaduceusItem;
import net.rafiki.greekmyth.item.custom.HammerOfHephaestusItem;

public class HammerOfHephaestusRenderer extends GeoItemRenderer<HammerOfHephaestusItem> {
    public HammerOfHephaestusRenderer() {
        super(new HammerOfHephaestusModel());
    }
}