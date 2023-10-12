package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.DrumOfCybeleItem;

public class DrumOfCybeleRenderer extends GeoItemRenderer<DrumOfCybeleItem> {
    public DrumOfCybeleRenderer() {
        super(new DrumOfCybeleModel());
    }
}