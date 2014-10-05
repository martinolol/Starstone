package com.starstone.cards.terran;

import com.starstone.R;
import com.starstone.cards.effects.Invisibility;

public class Ghost extends TerranCard {

    public Ghost(){
        super();

        setPriceDamageAndLife(4, 2, 3);
        addEffect(new Invisibility());
        setPortrait(R.drawable.terran_portrait_ghost);
    }

}
