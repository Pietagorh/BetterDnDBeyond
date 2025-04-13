package com.moutonperspicace.betterdndbeyond.gamesystem.magic;

import com.moutonperspicace.betterdndbeyond.gamesystem.GameElement;
import com.moutonperspicace.betterdndbeyond.gamesystem.inventory.items.Item;
import com.moutonperspicace.betterdndbeyond.gamesystem.utils.time.Duration;

import java.util.List;

public class Spell implements GameElement {

    private int level;
    private SchoolOfMagic school;
    private List<Item> materialComponents;
    private Duration castingDuration;
    private Duration duration;
    private boolean isRitual;
    private String name;
    private String description;

    public int level() {
        return level;
    }

    public SchoolOfMagic school() {
        return school;
    }

    public List<Item> getMaterialComponents() {
        return materialComponents;
    }

    public Duration castingDuration() {
        return castingDuration;
    }

    public Duration duration() {
        return duration;
    }

    public boolean isRitual() {
        return isRitual;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    // TODO: higher scaling, available classes
}
