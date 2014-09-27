package com.starstone.cards;

import android.content.Context;
import android.graphics.Bitmap;

import com.starstone.cards.effects.CardEffect;
import com.starstone.heroes.Hero;
import com.starstone.widget.CardView;

import java.util.ArrayList;
import java.util.Arrays;

public class Card {

    protected Hero hero;

    protected int price;
    protected int life;
    protected int damage;

    protected Bitmap portrait;

    protected int circleColor;
    protected int textColor;

    protected ArrayList<Integer> effects;

    protected Card(){
        effects = new ArrayList<Integer>();
    }

    public void setHero(int hero){
        this.hero = Hero.getHero(hero);
    }

    public void setEffects(Integer[] effects){
        this.effects.addAll(Arrays.asList(effects));
    }

    public CardView toCardView(Context context){
        CardView cardView = new CardView(context);

        cardView.setCard(this);

        return cardView;
    }

    public Hero getHero(){
        return hero;
    }

    public Bitmap getPortrait(){
        return portrait;
    }

    public int getCircleColor(){
        return circleColor;
    }

    public int getTextColor(){
        return textColor;
    }

    public int getPrice() {
        return price;
    }

    public int getLife() {
        return life;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isEffect(int effectId){
        return effects.contains(effectId);
    }
}
