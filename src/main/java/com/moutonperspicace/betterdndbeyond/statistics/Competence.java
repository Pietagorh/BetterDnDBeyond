package com.moutonperspicace.betterdndbeyond.statistics;

public abstract class Competence {

    private Characteristic characteristic;
    private boolean isProficient;

    public Competence (Characteristic characteristic, boolean isProficient) {//TODO avoir acces au bonus de maitrise
        this.characteristic = characteristic;
        this.isProficient = isProficient;
    }

    public Characteristic baseCharacteristic() {
        return characteristic;
    }

    public double bonus() {
        return characteristic.bonus(); //TODO + proficiency bonus
    }

    public boolean isProficient() {
        return isProficient;
    }

    public void setProficient(boolean isProficient) {
        this.isProficient = isProficient;
    }

}
