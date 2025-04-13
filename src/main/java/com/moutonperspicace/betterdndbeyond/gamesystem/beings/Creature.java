package com.moutonperspicace.betterdndbeyond.gamesystem.beings;

import com.moutonperspicace.betterdndbeyond.statistics.life.ArmorClass;

public interface Creature extends Entity, Damageable {

    CreatureType type();

    int challengeRate();

}
