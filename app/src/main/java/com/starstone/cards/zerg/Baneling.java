package com.starstone.cards.zerg;

import com.starstone.R;
import com.starstone.cards.effects.Agressive;
import com.starstone.cards.effects.Poisoned;

public class Baneling extends ZergCard{

    public Baneling(){
        super();

        setPriceDamageAndLife(3, 1, 1);
        addEffect(new Agressive());
        addEffect(new Poisoned());
        setPortrait(R.drawable.zerg_portrait_baneling);
    }
}
