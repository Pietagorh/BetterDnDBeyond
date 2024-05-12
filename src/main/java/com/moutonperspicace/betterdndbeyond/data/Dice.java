package com.moutonperspicace.betterdndbeyond.data;

import java.util.Random;

public class Dice {

    private int faceNumber;

    public Dice(int faceNumber) {
        this.faceNumber = faceNumber;
    }

    public int generate() {
        return new Random().nextInt(faceNumber) + 1;
    }

    @Override
    public String toString() {
        return "d" + faceNumber;
    }
}
