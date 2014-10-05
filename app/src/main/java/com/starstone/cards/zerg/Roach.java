package com.starstone.cards.zerg;

import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;
import com.starstone.cards.effects.Range;

public class Roach extends ZergCard {

    public Roach(){
        super();

        setPriceDamageAndLife(3, 2, 3);
        addEffect(new Range());
        setPortrait(R.drawable.zerg_portrait_roach);
    }
}
