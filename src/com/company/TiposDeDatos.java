package com.company;

public class TiposDeDatos {
    public byte num1;
    public short num2;
    public int num3;
    public long num4;
    public float num5;
    public double num6;
    public boolean bool;
    public char carcter;
    public String string;

    public TiposDeDatos(byte num1, short num2, int num3, long num4, float num5, double num6, boolean bool, char carcter, String string) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
        this.bool = bool;
        this.carcter = carcter;
        this.string = string;
    }

    @Override
    public String toString(){
        return "\nTipos de dato: \n{ " +
                "\n-byte: " + num1 +
                "\n-short: " + num2 +
                "\n-int: " + num3 +
                "\n-long: " + num4 +
                "\n-float: " + num5 +
                "\n-double: " + num6 +
                "\n-boolean: " + bool +
                "\n-char: " + carcter +
                "\n-string: " + string +
                "\n}";
    }

    public static void main(String[] args){
        TiposDeDatos type = new TiposDeDatos((byte) 1, (short) 2,3,4L,5.5f,6.6,true,'A',"Cadena");


        System.out.println(type);
    }

}
