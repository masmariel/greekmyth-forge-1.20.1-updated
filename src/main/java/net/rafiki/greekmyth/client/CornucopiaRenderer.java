package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.CornucopiaItem;

public class CornucopiaRenderer extends GeoItemRenderer<CornucopiaItem> {
    public CornucopiaRenderer() {
        super(new CornucopiaModel());
    }
}