package com.moutonperspicace.betterdndbeyond.gamesystem;

import com.moutonperspicace.betterdndbeyond.gamesystem.jobs.GameClass;
import com.moutonperspicace.betterdndbeyond.gamesystem.jobs.History;
import com.moutonperspicace.betterdndbeyond.gamesystem.beings.Species;
import com.moutonperspicace.betterdndbeyond.gamesystem.inventory.PlayerInventory;
import com.moutonperspicace.betterdndbeyond.statistics.BlockStat;

import java.util.List;

public class Player {

    private String characterName;
    private History history;
    private List<GameClass> classes;
    private List<Proficiency> proficiencies;
    private Species species;
    private PlayerInventory inventory;
    private BlockStat blockStat;

    private String characterName() {
        return characterName;
    }

    private History history() {
        return history;
    }

    public List<GameClass> classes() {
        return classes;
    }

    public List<Proficiency> proficiencies() {
        return proficiencies;
    }

    public Species race() {
        return species;
    }

    public PlayerInventory inventory() {
        return inventory;
    }

    public BlockStat blockStat() {
        return blockStat;
    }

}
