package javaapplication16;

import java.util.Random;

abstract class Enemy {
    
    abstract int attack();
    abstract int waiting();
    abstract void helthyPlus();
    abstract void getDamage(int Damage);
    abstract int getXP();
    abstract int getPower();
}

class MenEnemy extends Enemy{

    public int XP = 100;
    public int maxPower = 15;
    
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
    int getXP() {
        return XP;
    }

    @Override
    int getPower() {
        return maxPower;
    }
    
}

class ElfEnemy extends Enemy{
    public int XP = 110;
    public int maxPower = 20;
    
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
    int getXP() {
        return XP;
    }

    @Override
    int getPower() {
        return maxPower;
    }
}

class NecromancerEnemy extends Enemy{
    public int XP = 150;
    public int maxPower = 5;
    int n=0;
    
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
    int getXP() {
        return XP;
    }

    @Override
    int getPower() {
        return maxPower;
    }
}


class WizardEnemy extends Enemy{
    public int XP = 70;
    public int maxPower = 35;
    
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
    int getXP() {
        return XP;
    }

    @Override
    int getPower() {
        return maxPower;
    }
}
