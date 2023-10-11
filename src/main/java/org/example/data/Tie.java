package org.example.data;

public class Tie extends Drink{
    private String tieName;
    private final String TIE = "Чай";

    public Tie(String tieName, int volume, int temp) {
        super(volume, temp);
        this.tieName = tieName;
    }

    public String getTIE() {
        return TIE;
    }

    public String getTieName() {
        return tieName;
    }

    public void setTieName(String tieName) {
        this.tieName = tieName;
    }

    @Override
    public String getTypeDrink() {
        return TIE;
    }

    @Override
    public String toString() {
        return "\n" + TIE + ": "+ tieName +
                "\nid " + id +
                "\nОбъем " + volume +
                "\nтемпература " + temp +
                "\n_____________________";
    }


}
