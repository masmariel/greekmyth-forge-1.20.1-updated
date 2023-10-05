package net.rafiki.greekmyth;

import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.rafiki.greekmyth.item.custom.SpearOfDiomedesItem;

public class EventHandlerClass {
    @SubscribeEvent
    public <DamageSource> void onLivingHurt(LivingHurtEvent event) {
        DamageSource source = (DamageSource) event.getSource();
        if (source.getImmediateSource() instanceof TridentEntity) {
            TridentEntity trident = (TridentEntity) source.getImmediateSource();
            if (trident.getItem().getItem() instanceof SpearOfDiomedesItem) {
                event.setAmount(10);
            }
        }
    }
}
