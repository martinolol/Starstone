package com.starstone.heroes;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;

public class Zerg extends Hero {

    public Zerg(){
        cardBackground = BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.zerg_card_background);
    }

}
