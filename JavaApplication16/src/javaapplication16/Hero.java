package javaapplication16;

import java.math.*;

abstract class Hero {

    public String name;
    
    Hero(String name){
        this.name=name;
    }
    
    abstract int attack();
    abstract int waiting();
    abstract void helthyPlus();
    abstract void getDamage(int Damage);
    abstract boolean False();
    abstract int getXP();
    abstract int getPower();
}

class Men extends Hero{

    public int XP = 100;
    int maxPower = 15;

    public Men(String name) {
        super(name);
    }
    
    
    @Override
    int attack() {
        //Random randPower = new Random(System.currentTimeMillis());
        //maxPower = Math.abs(maxPower-5+randPower.nextInt(7));
        return maxPower;
    }

    @Override
    int waiting() {
        return 0;
    }

    @Override
    void helthyPlus() {
        XP=XP+10;
    }

    @Override
    void getDamage(int Damage) {
        XP=XP-Damage;
    }
    
    @Override
    boolean False() {
        boolean TF = false;
        if(XP<=0) TF = true;
        return TF;
    }

    @Override
    int getXP() {
        return XP;
    }

    @Override
    int getPower() {
        return maxPower;
    }
}

class Elf extends Hero{
    public int XP = 110;
    int maxPower = 20;

    public Elf(String name) {
        super(name);
    }
    
    
    @Override
    int attack() {
        //Random randPower = new Random(System.currentTimeMillis());
        //maxPower = Math.abs(maxPower-5+randPower.nextInt(7));
        return maxPower;
    }

    @Override
    int waiting() {
        return 0;
    }

    @Override
    void helthyPlus() {
        XP=XP+10;
    }

    @Override
    void getDamage(int Damage) {
        XP=XP-Damage;
    }    

    @Override
    boolean False() {
        boolean TF = false;
        if(XP<=0) TF = true;
        return TF;
    }

    @Override
    int getXP() {
        return XP;
    }

    @Override
    int getPower() {
        return maxPower;
    }
}

class Necromancer extends Hero{
    public int XP = 150;
    int maxPower = 10;
    int n=0;

    public Necromancer(String name) {
        super(name);
    }
    
    void getReinforcement(){
        maxPower =+10;
        n=5;
    }
    
    @Override
    int attack() {
        //Random randPower = new Random(System.currentTimeMillis());
        //maxPower = Math.abs(maxPower-5+randPower.nextInt(7));
        return maxPower;
    }

    @Override
    int waiting() {
        return 0;
    }

    @Override
    void helthyPlus() {
        XP=XP+10;
    }

    @Override
    void getDamage(int Damage) {
        XP=XP-Damage;
    }    

    @Override
    boolean False() {
        boolean TF = false;
        if(XP<=0) TF = true;
        return TF;
    }

    @Override
    int getXP() {
        return XP;
    }

    @Override
    int getPower() {
        return maxPower;
    }
}


class Wizard extends Hero{
    public int XP = 70;
    int maxPower = 35;

    public Wizard(String name) {
        super(name);
    }
    
    
    @Override
    int attack() {
        //Random randPower = new Random(System.currentTimeMillis());
        //maxPower = Math.abs(maxPower-5+randPower.nextInt(7));
        return maxPower;
    }

    @Override
    int waiting() {
        return 0;
    }

    @Override
    void helthyPlus() {
        XP=XP+10;
    }

    @Override
    void getDamage(int Damage) {
        XP=XP-Damage;
    }    

    @Override
    boolean False() {
        boolean TF = false;
        if(XP<=0) TF = true;
        return TF;
    }

    @Override
    int getXP() {
        return XP;
    }

    @Override
    int getPower() {
        return maxPower;
    }
}
