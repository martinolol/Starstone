package com.starstone.cards.terran;

import android.graphics.Color;

import com.starstone.R;
import com.starstone.Utils.SSContext;
import com.starstone.cards.Card;
import com.starstone.heroes.Hero;

public class TerranCard extends Card {

    public TerranCard(){
        super();
        setHero(Hero.TERRAN);
        circleColor = SSContext.getContext().getResources().getColor(R.color.terran_circle_color);
        textColor = SSContext.getContext().getResources().getColor(R.color.terran_text_color);
    }
}
