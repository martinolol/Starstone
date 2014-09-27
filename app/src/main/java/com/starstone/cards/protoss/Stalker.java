package com.starstone.cards.protoss;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;
import com.starstone.cards.Card;
import com.starstone.cards.effects.CardEffect;
import com.starstone.heroes.Hero;

public class Stalker extends ProtossCard {

    public static final int DEFAULT_PRICE = 3;
    public static final int DEFAULT_LIFE = 3;
    public static final int DEFAULT_DAMAGE = 4;

    public static Integer[] DEFAULT_EFFECT = {};

    public Stalker(){
        super();

        price = DEFAULT_PRICE;
        life = DEFAULT_LIFE;
        damage = DEFAULT_DAMAGE;

        portrait = BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.protoss_stalker_portrait);

        setEffects(DEFAULT_EFFECT);

    }

}
