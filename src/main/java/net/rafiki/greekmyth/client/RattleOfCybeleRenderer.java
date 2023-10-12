package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.DrumOfCybeleItem;
import net.rafiki.greekmyth.item.custom.RattleOfCybeleItem;

public class RattleOfCybeleRenderer extends GeoItemRenderer<RattleOfCybeleItem> {
    public RattleOfCybeleRenderer() {
        super(new RattleOfCybeleModel());
    }
}