package xyz.htmlcsjs.camsnapping;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy {
    @SubscribeEvent
    public static void keyPressEvent(InputEvent.KeyInputEvent event) {
        EntityPlayerSP player = Minecraft.getMinecraft().player;
        if (CamSnapping.horizontalBind.isKeyDown()) {
            player.rotationYaw = Math.round(player.rotationYaw / 90f) * 90f;
            CamSnapping.LOGGER.info(player.rotationYaw);
        } else if (CamSnapping.verticalBind.isKeyDown()) {
            player.rotationPitch = Math.round(player.rotationPitch / 90f) * 90f;
            CamSnapping.LOGGER.info(player.rotationPitch);
        } else if (CamSnapping.rotateLeft.isKeyDown()) {
            float direction = Math.round(player.rotationYaw / 90f) - 1;
            if (direction == -3) {
                direction = 1;
            }
            player.rotationYaw = direction % 3f * 90f;
        } else if (CamSnapping.rotateRight.isKeyDown()) {
            float direction = Math.round(player.rotationYaw / 90f) + 1;
            if (direction == 3) {
                direction = -1;
            }
            player.rotationYaw = direction % 3f * 90f;
        }
    }
}
