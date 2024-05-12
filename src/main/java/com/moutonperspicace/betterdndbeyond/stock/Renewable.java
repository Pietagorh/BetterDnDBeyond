package com.moutonperspicace.betterdndbeyond.stock;

public interface Renewable {
    void renew();

    default void listen() {
        return;
    }
}
