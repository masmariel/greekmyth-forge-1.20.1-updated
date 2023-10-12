package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.SpearOfAchillesItem;

public class SpearOfAchillesRenderer extends GeoItemRenderer<SpearOfAchillesItem> {
    public SpearOfAchillesRenderer() {
        super(new SpearOfAchillesModel());
    }
}