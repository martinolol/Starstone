package com.starstone.cards.protoss;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;
import com.starstone.cards.effects.CardEffect;

public class Zealot extends ProtossCard {

    public static final int DEFAULT_PRICE = 2;
    public static final int DEFAULT_LIFE = 3;
    public static final int DEFAULT_DAMAGE = 2;

    public static Integer[] DEFAULT_EFFECT = {};

    public Zealot(){
        super();

        price = DEFAULT_PRICE;
        life = DEFAULT_LIFE;
        damage = DEFAULT_DAMAGE;

        portrait = BitmapFactory.decodeResource(SSContext.getInstance().getContext().getResources(), R.drawable.protoss_zealot_portrait);

        setEffects(DEFAULT_EFFECT);

    }
}
