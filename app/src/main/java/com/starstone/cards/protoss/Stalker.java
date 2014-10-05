package com.starstone.cards.protoss;

import com.starstone.R;
import com.starstone.cards.effects.Range;

public class Stalker extends ProtossCard {

    public Stalker(){
        super();

        setPriceDamageAndLife(3, 2, 4);
        addEffect(new Range());
        setPortrait(R.drawable.protoss_portrait_stalker);
    }

}
