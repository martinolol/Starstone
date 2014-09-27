package com.starstone.cards.terran;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;
import com.starstone.cards.effects.CardEffect;

public class Ghost extends TerranCard {

    public static final int DEFAULT_PRICE = 4;
    public static final int DEFAULT_LIFE = 2;
    public static final int DEFAULT_DAMAGE = 4;

    public static Integer[] DEFAULT_EFFECT = {CardEffect.INVISIBILITY};

    public Ghost(){
        super();

        price = DEFAULT_PRICE;
        life = DEFAULT_LIFE;
        damage = DEFAULT_DAMAGE;

        portrait = BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.terran_portrait_ghost);

        setEffects(DEFAULT_EFFECT);

    }

}
