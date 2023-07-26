package com.qa.classes.classExercise.weapons;

public class Weapon {
    private int damageOutput;
    private int durability;
    private int price;
    private boolean isOneHanded;
    private boolean singleOperator;
    private boolean isBroken;
    private String name;
    private String damageType;

    private static boolean peacefulMode = false;

    public Weapon(String name, int damageOutput, int durability, int price,
                  boolean isOneHanded, boolean singleOperator, boolean isBroken,
                  String damageType) {
        super();
        this.name = name;
        this.damageOutput = damageOutput;
        this.durability = durability;
        this.price = price;
        this.isOneHanded = isOneHanded;
        this.singleOperator = singleOperator;
        this.isBroken = isBroken;
        this.damageType = damageType;
    }

    public Weapon(String name, int damageOutput, int price){
        this(name, damageOutput, 100, price, true, true, false, "Normal");
    }

    public Weapon(){
        super();
    }

    public static boolean togglePeacefulMode(){
        peacefulMode = !peacefulMode;
        return peacefulMode;
    }

    public static boolean getPeacefulMode(){
        return peacefulMode;
    }

    public static void setPeacefulMode(boolean turnOnPeacefulMode){
        peacefulMode = turnOnPeacefulMode;
    }

    public void drawWeapon(){

    }

    public int attack(){
        if (isBroken) return 0;

        if (durability > 2){
            durability--;
            return damageOutput;
        } else {
            durability = 0;
            isBroken = true;
            return damageOutput;
        }
    }

    public int getDamageOutput() {
        return damageOutput;
    }

    public void setDamageOutput(int damageOutput) {
        this.damageOutput = damageOutput;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOneHanded() {
        return isOneHanded;
    }

    public void setOneHanded(boolean oneHanded) {
        isOneHanded = oneHanded;
    }

    public boolean isSingleOperator() {
        return singleOperator;
    }

    public void setSingleOperator(boolean singleOperator) {
        this.singleOperator = singleOperator;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damageOutput=" + damageOutput +
                ", durability=" + durability +
                ", price=" + price +
                ", isBroken=" + isBroken +
                '}';
    }
}
