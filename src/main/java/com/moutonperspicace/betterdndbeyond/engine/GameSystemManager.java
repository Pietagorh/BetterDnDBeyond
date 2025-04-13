package com.moutonperspicace.betterdndbeyond.engine;

import com.moutonperspicace.betterdndbeyond.gamesystem.beings.Species;
import com.moutonperspicace.betterdndbeyond.gamesystem.jobs.GameClass;
import com.moutonperspicace.betterdndbeyond.gamesystem.jobs.History;
import com.moutonperspicace.betterdndbeyond.gamesystem.jobs.Trait;
import com.moutonperspicace.betterdndbeyond.gamesystem.magic.Spell;

import java.util.List;

public class GameSystemManager {

    private final List<Species> species;
    private final List<GameClass> classes;
    private final List<Spell> spells;
    private final List<History> histories;
    private final List<Trait> traits;
    //TODO a potentiellement replacer par un système de cache

    public GameSystemManager() {
    }

    public void loadData() {
        //TODO implementation
    }

    public GameClass getGameClassByName() {
        return null; //TODO potentiellement utiliser autre chose que le nom, et faire le meme schema de methodes pour les autres données
    }

}
