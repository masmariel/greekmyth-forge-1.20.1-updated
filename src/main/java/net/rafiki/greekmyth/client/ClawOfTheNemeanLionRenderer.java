package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.ClawOfTheNemeanLionItem;

public class ClawOfTheNemeanLionRenderer extends GeoItemRenderer<ClawOfTheNemeanLionItem> {
    public ClawOfTheNemeanLionRenderer() {
        super(new ClawOfTheNemeanLionModel());
    }
}