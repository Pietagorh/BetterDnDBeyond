package com.moutonperspicace.betterdndbeyond.gamesystem;

import java.util.List;

public interface Race extends GameElement{

    Size size();

    CreatureType type();

    int speed(SpeedType speedType);

    List<Usable> traits();//peut etre rendre plus specifique quand on aura implémenté les traits

}
