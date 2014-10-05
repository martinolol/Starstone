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

    public static Hero getHero(int heroId){
        if(heroId == PROTOSS){
            return new Protoss();
        }else if(heroId == TERRAN){
            return new Terran();
        }else if(heroId == ZERG){
            return new Zerg();
        }

        return null;
    }

}
