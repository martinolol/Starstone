package com.starstone.cards.terran;

import com.starstone.R;
import com.starstone.cards.effects.Range;

public class Marine extends TerranCard {

    public Marine(){
        super();

        setPriceDamageAndLife(1, 1, 2);
        addEffect(new Range());
        setPortrait(R.drawable.terran_portrait_marine);

    }

}
