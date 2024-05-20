package com.moutonperspicace.betterdndbeyond.gamesystem.inventory;

import com.moutonperspicace.betterdndbeyond.gamesystem.inventory.items.Armor;

import java.util.Optional;

public interface PlayerInventory extends Inventory {

    Optional<Armor> armorSlot();

}
