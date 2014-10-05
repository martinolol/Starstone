package com.starstone.cards.protoss;

import com.starstone.R;
import com.starstone.cards.effects.Fly;

public class Voidray extends ProtossCard{

    public Voidray(){
        super();

        setPriceDamageAndLife(5, 6, 4);
        addEffect(new Fly());
        setPortrait(R.drawable.protoss_portrait_voidray);

    }
}
