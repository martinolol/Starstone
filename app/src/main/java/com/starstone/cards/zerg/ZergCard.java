package com.starstone.cards.zerg;

import android.graphics.Color;

import com.starstone.R;
import com.starstone.Utils.SSContext;
import com.starstone.cards.Card;
import com.starstone.heroes.Hero;

public class ZergCard extends Card {

    public ZergCard(){
        super();
        setHero(Hero.ZERG);
        circleColor = SSContext.getContext().getResources().getColor(R.color.zerg_circle_color);
        textColor = SSContext.getContext().getResources().getColor(R.color.zerg_text_color);
    }
}
