public class Univer {

    private String name;
    private int kol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }
    public Univer(){}

    @Override
    public String toString() {
        return  "Имя :" + name+
                "Количество : " + kol;
    }
}

