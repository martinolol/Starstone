package com.starstone.heroes;

import android.content.Context;
import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;

public class Protoss extends Hero {

    public Protoss(){
        cardBackground = BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.protoss_card_background);
    }
}
