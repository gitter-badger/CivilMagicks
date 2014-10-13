/**
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
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
package us.illyohs.civilmagicks.api.civilregistry;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;

import us.illyohs.civilmagicks.common.core.CivilObject;

public class CivilRegistry {

    public static HashMap<Object, CivilObject> civilRegistry = new HashMap<Object, CivilObject>();

    /**
     * This registers the status of a blocks/item in the civilRegistry Only
     * BLOCkS, ITEMS, and FLUIDS my be registered in the civilRegistry the game
     * will crash if you don't register things correctly
     * 
     * @param object Blocks/Items/Fluid
     * @param meta value of a block/item
     * @param CivilStatus
     * @see CivilStatus
     */

    private static void registerStatus(Object object, int meta, CivilStatus civilstatus) {
        if (object instanceof Block || object instanceof Item || object instanceof Fluid) {
            civilRegistry.put(civilstatus, new CivilObject(object, meta));
        } else {
            throw new IllegalArgumentException();
        }

    }

    public static void registerBlock(Block block, int meta, CivilStatus civilstatus) {
        registerStatus(block, meta, civilstatus);
    }

    public static void registerItem(Item item, int meta, CivilStatus civilstatus) {
        registerStatus(item, meta, civilstatus);
    }

}