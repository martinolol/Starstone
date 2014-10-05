package com.starstone.cards.effects;

/* Equivalent à charge dans Hearthstone */
public class Agressive extends CardEffect{

    public static final int ID = 2;

    public Agressive(){
        super(ID);
    }

    public int getId(){
        return ID;
    }

    public String toString(){
        return "Agressif";
    }
}
