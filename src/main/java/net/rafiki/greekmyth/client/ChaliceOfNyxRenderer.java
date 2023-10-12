package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.ChaliceOfNyxItem;

public class ChaliceOfNyxRenderer extends GeoItemRenderer<ChaliceOfNyxItem> {
    public ChaliceOfNyxRenderer() {
        super(new ChaliceOfNyxModel());
    }
}