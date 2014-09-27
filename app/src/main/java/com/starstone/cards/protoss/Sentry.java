package com.starstone.cards.protoss;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;

public class Sentry extends ProtossCard {

    public static final int DEFAULT_PRICE = 3;
    public static final int DEFAULT_LIFE = 2;
    public static final int DEFAULT_DAMAGE = 4;

    public static Integer[] DEFAULT_EFFECT = {};

    public Sentry(){
        super();

        price = DEFAULT_PRICE;
        life = DEFAULT_LIFE;
        damage = DEFAULT_DAMAGE;

        portrait = BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.protoss_portrait_sentry);

        setEffects(DEFAULT_EFFECT);

    }

}
