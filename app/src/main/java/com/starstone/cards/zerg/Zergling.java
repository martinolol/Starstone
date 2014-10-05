package com.starstone.cards.zerg;

import com.starstone.R;
import com.starstone.cards.effects.Agressive;

public class Zergling extends ZergCard {

    public Zergling(){
        super();

        setPriceDamageAndLife(1, 1, 2);
        addEffect(new Agressive());
        setPortrait(R.drawable.zerg_portrait_zergling);

    }
}
