package com.starstone.cards.zerg;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;
import com.starstone.cards.Card;
import com.starstone.cards.effects.CardEffect;
import com.starstone.heroes.Hero;

public class Zergling extends ZergCard {

    public static final int DEFAULT_PRICE = 1;
    public static final int DEFAULT_LIFE = 1;
    public static final int DEFAULT_DAMAGE = 1;

    public static Integer[] DEFAULT_EFFECT = {CardEffect.AGRESSIVE};

    public Zergling(){
        super();

        price = DEFAULT_PRICE;
        life = DEFAULT_LIFE;
        damage = DEFAULT_DAMAGE;

        portrait = BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.zerg_portrait_zergling);

        setEffects(DEFAULT_EFFECT);

    }
}
