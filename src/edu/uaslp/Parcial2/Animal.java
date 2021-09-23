package edu.uaslp.Parcial2;

class Animal{
    private String color;
    private int size;
    private int numpatas;

    public void eat(){
        System.out.println("busca comida");
        System.out.println("atrapa comida");
        System.out.println("engulle");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumpatas() {
        return numpatas;
    }

    public void setNumpatas(int numpatas) {
        this.numpatas = numpatas;
    }
}
