package com.starstone.cards.protoss;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;

public class Voidray extends ProtossCard{

    public static final int DEFAULT_PRICE = 5;
    public static final int DEFAULT_LIFE = 6;
    public static final int DEFAULT_DAMAGE = 4;

    public static Integer[] DEFAULT_EFFECT = {};

    public Voidray(){
        super();

        price = DEFAULT_PRICE;
        life = DEFAULT_LIFE;
        damage = DEFAULT_DAMAGE;

        portrait = BitmapFactory.decodeResource(SSContext.getInstance().getContext().getResources(), R.drawable.protoss_portrait_voidray);

        setEffects(DEFAULT_EFFECT);

    }
}
