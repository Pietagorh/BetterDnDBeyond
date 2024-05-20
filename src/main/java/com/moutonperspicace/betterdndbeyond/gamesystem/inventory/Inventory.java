package com.moutonperspicace.betterdndbeyond.gamesystem.inventory;

import com.moutonperspicace.betterdndbeyond.gamesystem.inventory.items.Item;

import java.util.List;

public interface Inventory {

    List<Item> items();
    default List<Item> ofType(Class<? extends Item> itemType) {
        return items().stream().filter(i -> i.getClass().equals(itemType)).toList(); //potentiellement à refacto
    }

}
