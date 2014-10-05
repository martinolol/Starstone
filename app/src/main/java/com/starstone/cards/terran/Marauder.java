package com.starstone.cards.terran;

import com.starstone.R;
import com.starstone.cards.effects.Imposition;

public class Marauder extends TerranCard {

    public Marauder(){
        super();

        setPriceDamageAndLife(3, 2, 3);
        addEffect(new Imposition());
        setPortrait(R.drawable.terran_portrait_marauder);

    }

}
