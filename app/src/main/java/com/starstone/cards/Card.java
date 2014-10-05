package com.starstone.cards;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.effect.Effect;

import com.starstone.Utils.SSContext;
import com.starstone.cards.effects.CardEffect;
import com.starstone.heroes.Hero;
import com.starstone.widget.CardView;

import java.util.ArrayList;
import java.util.Arrays;

public class Card {

    private Hero hero;

    private int price;
    private int life;
    private int damage;

    private Bitmap portrait;

    private int circleColor;
    private int textColor;

    protected ArrayList<CardEffect> effects;

    protected Card(){
        effects = new ArrayList<CardEffect>();
    }

    public Hero getHero(){
        return hero;
    }

    public void setHero(int heroId){
        this.hero = Hero.getHero(heroId);
    }

    public void addEffect(CardEffect effect) { this.effects.add(effect); }

    public CardView toCardView(Context context){
        CardView cardView = new CardView(context);

        cardView.setCard(this);

        return cardView;
    }

    public Bitmap getPortrait(){
        return portrait;
    }

    public void setPortrait(int portraitResId) {
        this.portrait = BitmapFactory.decodeResource(SSContext.getContext().getResources(), portraitResId);
    }

    public int getCircleColor(){
        return circleColor;
    }

    public void setCircleColor(int circleColor){
        this.circleColor = circleColor;
    }

    public int getTextColor(){
        return textColor;
    }

    public void setTextColor(int textColor){
        this.textColor = textColor;
    }

    public void setPriceDamageAndLife(int price, int damage, int life){
        this.price = price;
        this.damage = damage;
        this.life = life;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isEffect(int effectId){
        for(CardEffect effect : effects){
            if(effect.getId() == effectId){
                return true;
            }
        }
        return false;
    }
}
