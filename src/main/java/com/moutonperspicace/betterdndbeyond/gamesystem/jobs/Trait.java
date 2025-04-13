package com.moutonperspicace.betterdndbeyond.gamesystem.jobs;

import com.moutonperspicace.betterdndbeyond.gamesystem.GameElement;
import com.moutonperspicace.betterdndbeyond.gamesystem.magic.Spell;

import java.util.List;

public interface Trait extends GameElement {

    public int requiredCharacterLevel();

    public List<Spell> spells();

}
