package com.starstone.heroes;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;

public class Terran extends Hero {

    public Terran(){
        cardBackground = BitmapFactory.decodeResource(SSContext.getInstance().getContext().getResources(), R.drawable.terran_card_background);
    }
}
