package com.starstone.heroes;

import android.graphics.Bitmap;

public class Hero {
    public static final byte PROTOSS = 1;
    public static final byte TERRAN = 2;
    public static final byte ZERG = 3;

    protected Bitmap cardBackground;

    public Hero(){

    }

    public Bitmap getCardBackground(){
        return cardBackground;
    }

    public static Hero getHero(int hero){
        if(hero == PROTOSS){
            return new Protoss();
        }else if(hero == TERRAN){
            return new Terran();
        }else if(hero == ZERG){
            return new Zerg();
        }

        return null;
    }

}
