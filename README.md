# PacketFix
Fix Minecraft 1.12.2 Right click
===LB+===
使用方法：
把FixEngine放到net/ccbluex/liquidbounce/utils文件夹里，
把MixinMixinC08PacketPlayerBlockPlacement放到net/ccbluex/liquidbounce/injection/forge/mixins/packets文件夹里，
然后在liquidbounce.forge.mixins.json文件夹里，"packets.MixinC00Handshake"（一般是第60行）后面，加入一串"packets.MixinC08PacketPlayerBlockPlacement",，然后就大功告成。
===LB===
使用方法：
把MixinMixinC08PacketPlayerBlockPlacement放到net/ccbluex/liquidbounce/injection/forge/mixins/packets文件夹里，
写一个Module，名字随意起，然后把MixinMixinC08PacketPlayerBlockPlacement里报错的import删了，把下面的两串FixEngine.fixRightClick()改成LiquidBounce.moduleManager.getModule("你起的Module名字").getState();   (这里的分号要加进去)
记住要import一下LiquidBounce和你写的Module
===使用申明===
我们只负责写此模块，
使用此模块的所有责任归使用者，
模块的最终解释权归HacketMC Team。


                                     ---By HacketMC Team
