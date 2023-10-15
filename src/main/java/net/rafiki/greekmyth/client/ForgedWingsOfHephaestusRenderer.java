package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.DrakonBoneWingsItem;
import net.rafiki.greekmyth.item.custom.ForgedWingsOfHephaestusItem;

public class ForgedWingsOfHephaestusRenderer extends GeoArmorRenderer<ForgedWingsOfHephaestusItem> {
    public ForgedWingsOfHephaestusRenderer() {
        super(new ForgedWingsOfHephaestusModel());
    }
}