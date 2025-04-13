package com.moutonperspicace.betterdndbeyond.gamesystem.beings;

import com.moutonperspicace.betterdndbeyond.gamesystem.GameElement;

import java.util.List;

public interface Entity extends GameElement {

    public Size size();

    public List<SpeedType> speedTypes();

}
