package org.example.data;

public class Cofe extends Drink{
    private String cofeName;
    private final String COFE = "Кофе";

    public Cofe(String cofeName, int volume, int temp) {
        super(volume, temp);

        this.cofeName = cofeName;
    }

    public String getCOFE() {
        return COFE;
    }

    public void setCofeName(String cofeName) {
        this.cofeName = cofeName;
    }

    @Override
    public String getTypeDrink() {
        return COFE;
    }

    @Override
    public String toString() {
        return "\n" + COFE + ": " + cofeName +
                "\nid " + id +
                "\nОбъем " + volume +
                "\nтемпература " + temp +
                "\n_____________________";
    }
}
