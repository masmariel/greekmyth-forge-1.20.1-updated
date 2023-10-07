package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PouchOfAeolusItem extends Item {
    public PouchOfAeolusItem(Properties pProperties) {
        super(pProperties);
    }

    /* CRASHES GAME
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        Vec3 lookVec = player.getLookAngle();

        double radius = 3.0D;
        List<Entity> entities = world.getEntities(player, player.getBoundingBox().inflate(radius), null);
        for (Entity entity : entities) {
            if (!entity.equals(player)) {
                if (entity.distanceTo(player) <= radius) {
                    Vec3 pushVec = lookVec.normalize().scale(1);
                    entity.push(pushVec.x, pushVec.y, pushVec.z);
                }
            }
        }

        return InteractionResultHolder.success(player.getItemInHand(hand));
    }
     */
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.pouch_of_aeolus_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.pouch_of_aeolus"));
        }if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.pouch_of_aeolus_ctrl"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}