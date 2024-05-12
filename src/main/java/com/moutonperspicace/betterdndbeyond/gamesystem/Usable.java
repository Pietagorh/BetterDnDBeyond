package com.moutonperspicace.betterdndbeyond.gamesystem;

import com.moutonperspicace.betterdndbeyond.stock.Stockable;

public interface Usable extends GameElement {
    Stockable stock();

    void use();

}
