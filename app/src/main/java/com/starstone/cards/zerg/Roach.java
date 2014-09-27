package com.starstone.cards.zerg;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;

public class Roach extends ZergCard {

    public static final int DEFAULT_PRICE = 2;
    public static final int DEFAULT_LIFE = 2;
    public static final int DEFAULT_DAMAGE = 3;

    public static Integer[] DEFAULT_EFFECT = {};

    public Roach(){
        super();

        price = DEFAULT_PRICE;
        life = DEFAULT_LIFE;
        damage = DEFAULT_DAMAGE;

        portrait = BitmapFactory.decodeResource(SSContext.getInstance().getContext().getResources(), R.drawable.zerg_portrait_roach);

        setEffects(DEFAULT_EFFECT);

    }
}
