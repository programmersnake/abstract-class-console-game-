package javaapplication16;

import java.util.Scanner;
import java.util.Random;

public class Brain {
    
    void Start (){
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Приветствуем в игре! Дайте имя вашему герою");
        String nameHero;
        nameHero = scan.nextLine();
        System.out.println(ANSI_BLUE+"Выбери персонажа: (1-Человек)(2-Эльф)(3-Некромант)(4-Маг)");       
        short heronumber;
        heronumber=scan.nextShort();
        switch(heronumber){
            case 1:{
                System.out.println(ANSI_GREEN+"Вы выбрали человека");       
                Hero me = new Men(nameHero);
                System.out.println(ANSI_GREEN+"У вас "+ me.getXP()+" единиц жизней."+" У вас "+me.getPower()+" максимального урона");   
                Hod(me, ChooseOpponent());
                break;
            } 
            case 2:{
                System.out.println(ANSI_GREEN+"Вы выбрали эльфа");       
                Hero me = new Elf(nameHero);
                System.out.println(ANSI_GREEN+"У вас "+ me.getXP()+" единиц жизней."+" У вас "+me.getPower()+" максимального урона");   
                Hod(me, ChooseOpponent());
                break;
            } 
            case 3:{
                System.out.println(ANSI_GREEN+"Вы выбрали некроманта");
                Hero me = new Necromancer(nameHero);
                System.out.println(ANSI_GREEN+"У вас "+ me.getXP()+" единиц жизней."+" У вас "+me.getPower()+" максимального урона");   
                Hod(me, ChooseOpponent());
                break;
            } 
            case 4:{
                System.out.println(ANSI_GREEN+"Вы выбрали мага");
                Hero me = new Wizard(nameHero);
                System.out.println(ANSI_GREEN+"У вас "+ me.getXP()+" единиц жизней."+" У вас "+me.getPower()+" максимального урона");   
                Hod(me, ChooseOpponent());
                break;
            }
            default:{
                System.out.println(ANSI_RED+"Не верно!");
                System.exit(0);
            }
        }        
    }
    
    void Hod(Hero me, Enemy enemy){    
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        for(int i=0;i<1000;i++){
            if(i%2==0){
                System.out.println(ANSI_BLUE+"Вы ходите");
                // Выбор хода игрока
                //switch(...){
                // case 1 : enemy.getDamage(me.arrack); continue;
                // case 2 : me.wait(); continue;
                System.out.println(ANSI_BLUE+"1- атака, 2 - ожидание, 3 - лечение");
                int hod;
                Scanner scan = new Scanner(System.in);
                hod = scan.nextShort();
                switch(hod){
                    case 1:{
                        me.attack();
                        enemy.getDamage(me.attack());
                        System.out.println(ANSI_GREEN+me.name+" нападает на Bot и наносит "+me.attack()+" урона");
                        System.out.println(ANSI_GREEN+"У Bot-а осталось "+enemy.getXP()+" XP");
                        break;
                    }
                    case 2:{
                        me.waiting();
                        enemy.getDamage(me.waiting());
                        System.out.println(ANSI_GREEN+me.name+" ожидает");
                        break;                        
                    }
                    case 3:{
                        me.helthyPlus();
                        System.out.println(ANSI_GREEN+me.name+" востанавливает себе 10 ед здоровья. "+"Стало "+me.getXP()+" жизней");
                        break;
                    }
                    default:{
                        
                    }
                }
            }
            else{
                //  Метод хода Противника. 
                // Им управляет компьютер   
                if((enemy.getXP()>=30)&&(me.getXP()<=30)){
                    enemy.attack();
                    me.getDamage(enemy.attack());                    
                    System.out.println(ANSI_PURPLE+"Bot нападает на "+me.name+" и наносит "+enemy.attack()+" урона");
                    System.out.println(ANSI_PURPLE+"У "+me.name+" осталось " + me.getXP()+" единиц здоровья");
                }
                else if((enemy.getXP()<=30)&&(me.getXP()>30)){
                    enemy.helthyPlus();
                    System.out.println(ANSI_PURPLE+"Bot лечит 10 единиц здоровья"); 
                    System.out.println(ANSI_PURPLE+"У Bota стало "+enemy.getXP()+" XP"); 
                }
                else if(enemy.getXP()<15){
                    enemy.helthyPlus();
                    System.out.println(ANSI_PURPLE+"Bot лечит 10 единиц здоровья"); 
                    System.out.println(ANSI_PURPLE+"У Bota стало "+enemy.getXP()+" XP"); 
                }
                else if((enemy.getXP()<10)&&(me.getXP()>80)){
                    enemy.waiting();
                    System.out.println(ANSI_PURPLE+"Bot ожидает"); 
                }
                else{
                    enemy.attack();
                    me.getDamage(enemy.attack());                    
                    System.out.println(ANSI_PURPLE+"Bot нападает на "+me.name+" и наносит "+enemy.attack()+" урона");
                    System.out.println(ANSI_PURPLE+"У "+me.name+" осталось " + me.getXP()+" единиц здоровья");
                }
                
            }
            False(me, enemy);
        }
    }
    
    Enemy ChooseOpponent(){
        final String ANSI_PURPLE = "\u001B[35m";
        boolean j = true;
        while(j){
            Random opponentRandom = new Random(System.currentTimeMillis());
            int opponent = opponentRandom.nextInt(5);
                switch((int)opponent){
                    case 1:{                    
                        System.out.println(ANSI_PURPLE+"Противник - Человек");
                        Enemy enemy= new MenEnemy();
                        System.out.println(ANSI_PURPLE+"У Bota "+enemy.getXP()+" единиц здоровья. "+"У Bota "+ enemy.getPower()+" максимального урона");
                        return enemy;
                    } 
                    case 2:{
                        System.out.println(ANSI_PURPLE+"Противник - Эльф");
                        Enemy enemy = new ElfEnemy();
                        System.out.println(ANSI_PURPLE+"У Bota "+enemy.getXP()+" единиц здоровья. "+"У Bota "+ enemy.getPower()+" максимального урона");
                        return enemy;
                    } 
                    case 3:{
                        System.out.println(ANSI_PURPLE+"Противник - Некромант");
                        Enemy enemy = new NecromancerEnemy();
                        System.out.println(ANSI_PURPLE+"У Bota "+enemy.getXP()+" единиц здоровья. "+"У Bota "+ enemy.getPower()+" максимального урона");
                        return enemy;
                    } 
                    case 4:{
                        System.out.println(ANSI_PURPLE+"Противник - Маг");
                        Enemy enemy = new WizardEnemy();
                        System.out.println(ANSI_PURPLE+"У Bota "+enemy.getXP()+" единиц здоровья. "+"У Bota "+ enemy.getPower()+" максимального урона");
                        return enemy;
                    }
                    default:{
                        //System.out.println(opponent);
                        continue;
                    }
                }                    
        }
        return null;
    }
    
    void False (Hero me, Enemy enemy){
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        if(me.getXP()<=0){
            System.out.println(ANSI_RED+"You are FAILED! Enemy Won!");
            System.exit(0);
        }
        else if(enemy.getXP()<=0){
            System.out.println(ANSI_GREEN+"You are WON! Enemy Failed!");
            System.exit(0);
        }
    }
    
}
