package net.rafiki.greekmyth.client;

import net.rafiki.greekmyth.item.custom.StygianArmor;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class StygianArmorRenderer extends GeoArmorRenderer<StygianArmor> {
    public StygianArmorRenderer() {
        super(new StygianArmorModel());
    }
}
