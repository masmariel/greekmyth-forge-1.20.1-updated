package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.TuskOfTheCalydonianBoarItem;

public class TuskOfTheCalydonianBoarRenderer extends GeoItemRenderer<TuskOfTheCalydonianBoarItem> {
    public TuskOfTheCalydonianBoarRenderer() {
        super(new TuskOfTheCalydonianBoarModel());
    }
}