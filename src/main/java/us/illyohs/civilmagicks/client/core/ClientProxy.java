/**
 * Copyright (c) 2015, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.civilmagicks.client.core;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import us.illyohs.civilmagicks.client.core.helper.FXHelper;
import us.illyohs.civilmagicks.client.render.tile.RenderGeneralStar;
import us.illyohs.civilmagicks.client.render.tile.RenderSigil;
import us.illyohs.civilmagicks.client.render.tile.RenderTileManaRing;
import us.illyohs.civilmagicks.common.block.ModBlocks;
import us.illyohs.civilmagicks.common.block.tile.TileSigil;
import us.illyohs.civilmagicks.common.block.tile.node.TileGeneralStar;
import us.illyohs.civilmagicks.common.block.tile.node.TileNodeManaRing;
import us.illyohs.civilmagicks.common.core.lib.IProxy;

public class ClientProxy implements IProxy {

    @Override
    public void bindModelsAndTextures() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileNodeManaRing.class, new RenderTileManaRing());
        ClientRegistry.bindTileEntitySpecialRenderer(TileGeneralStar.class, new RenderGeneralStar());
        ClientRegistry.bindTileEntitySpecialRenderer(TileSigil.class, new RenderSigil());
    }

    @Override
    public void registerTileEntitys() {
        //NO-OP
    }

    @Override
    public void registerMobs() {
        //NO-OP
    }

    @Override
    public void renderBlockItems() {
        FXHelper.renderItemsBlocks(ModBlocks.blockManaStone, "manastone");
        FXHelper.renderItemsBlocks(ModBlocks.nodeCivilAnalyzer, "civilanalyzer");
//        FXHelper.renderItemsBlocks(ModBlocks.blockGeneralStar);
    }

}
