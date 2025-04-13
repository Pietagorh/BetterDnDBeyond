package com.moutonperspicace.betterdndbeyond.gamesystem.beings;

import com.moutonperspicace.betterdndbeyond.gamesystem.jobs.Trait;

import java.util.List;

public interface Species extends Entity {

    public List<Trait> traits();
    // TODO: options

}
