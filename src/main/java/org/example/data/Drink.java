package org.example.data;

public abstract class Drink {
    protected int id;
    protected int volume;
    protected int temp;
    protected static int count;

    public Drink(int volume, int temp) {
        this.volume = volume;
        this.temp = temp;
        this.count++;
        this.id = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    public abstract String getTypeDrink();
}
