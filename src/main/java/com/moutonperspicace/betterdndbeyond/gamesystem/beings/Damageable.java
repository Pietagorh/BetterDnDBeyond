package com.moutonperspicace.betterdndbeyond.gamesystem.beings;

import com.moutonperspicace.betterdndbeyond.gamesystem.GameElement;
import com.moutonperspicace.betterdndbeyond.statistics.life.ArmorClass;
import com.moutonperspicace.betterdndbeyond.statistics.life.HitPoints;

public interface Damageable extends GameElement {

    ArmorClass armorClass();

    HitPoints hitPoints();

}
