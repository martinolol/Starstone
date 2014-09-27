package com.starstone.cards.protoss;

import android.graphics.Color;

import com.starstone.R;
import com.starstone.Utils.SSContext;
import com.starstone.cards.Card;
import com.starstone.heroes.Hero;

public class ProtossCard extends Card {

    public ProtossCard(){
        super();
        setHero(Hero.PROTOSS);
        circleColor = SSContext.getContext().getResources().getColor(R.color.protoss_circle_color);
        textColor = SSContext.getContext().getResources().getColor(R.color.protoss_text_color);
    }
}
