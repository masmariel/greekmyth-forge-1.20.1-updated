package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.SpearOfAthenaItem;

public class SpearOfAthenaRenderer extends GeoItemRenderer<SpearOfAthenaItem> {
    public SpearOfAthenaRenderer() {
        super(new SpearOfAthenaModel());
    }
}