public class Person {
    private String name;
    private int aga;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAga() {
        return aga;
    }

    public void setAga(int aga) {
        this.aga = aga;
    }

    @Override
    public String toString() {
        return  "Имя :" + name+
                "Возраст : " + aga;
    }
}
