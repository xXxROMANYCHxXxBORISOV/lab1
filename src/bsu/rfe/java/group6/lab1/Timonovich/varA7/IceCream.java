package bsu.rfe.java.group6.lab1.Timonovich.varA7;

public class IceCream extends Food {

    private String syrup;
    public String getSyrup() {
        return syrup;
    }
    public void setSyrup(){
        this.syrup=syrup;
    }
    public IceCream(String syrup) {
        super("Ice cream");
        this.syrup=syrup;
    }
    @Override
    public void consume() {
        System.out.println(this + "is eaten");
    }
    public String toString() {
        return super.toString() + " with '" + syrup.toUpperCase() + "'";

    }
    //public boolean equals(Object arg0) {
    //  if (super.equals(arg0)) {
    //    if (!(arg0 instanceof IceCream)) return false;
    //  return syrup.equals(((IceCream)arg0).syrup);
    //} else
    //  return false;
    //}

}