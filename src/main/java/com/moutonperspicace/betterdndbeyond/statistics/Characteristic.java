package com.moutonperspicace.betterdndbeyond.statistics;

public abstract class Characteristic {

    private int value;

    public Characteristic (int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public double bonus() {
        return Math.floor((value - 10) / 2);
    }

    public abstract String name();

}
