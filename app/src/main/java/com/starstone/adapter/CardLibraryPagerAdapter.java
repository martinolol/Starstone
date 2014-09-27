package com.starstone.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.starstone.R;
import com.starstone.Utils.SSContext;
import com.starstone.cards.Card;
import com.starstone.cards.protoss.Sentry;
import com.starstone.cards.protoss.Stalker;
import com.starstone.cards.protoss.Voidray;
import com.starstone.cards.protoss.Zealot;
import com.starstone.cards.terran.Ghost;
import com.starstone.cards.terran.Marauder;
import com.starstone.cards.terran.Marine;
import com.starstone.cards.zerg.Baneling;
import com.starstone.cards.zerg.Roach;
import com.starstone.cards.zerg.Zergling;
import com.starstone.heroes.Hero;
import com.starstone.widget.CardView;

public class CardLibraryPagerAdapter extends PagerAdapter {

    private LayoutInflater inflater;

    private byte hero;

    private Card[] protossCards;
    private Card[] terranCards;
    private Card[] zergCards;

    public CardLibraryPagerAdapter() {
        inflater = (LayoutInflater)SSContext.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        protossCards = new Card[]{new Zealot(), new Stalker(), new Sentry(), new Voidray()};
        terranCards = new Card[]{new Marine(), new Marauder(), new Ghost()};
        zergCards = new Card[]{new Zergling(), new Roach(), new Baneling()};
    }

    @Override
    public int getCount() {
        if(hero == Hero.PROTOSS) {

            return protossCards.length / 3;

        }else if(hero == Hero.TERRAN){

            return terranCards.length / 3;

        }else if(hero == Hero.ZERG){

            return zergCards.length / 3;

        }else{
            return 0;
        }
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View v = inflater.inflate(R.layout.item_pager_card_library, container, false);

        CardView card1 = (CardView)v.findViewById(R.id.card1);
        CardView card2 = (CardView)v.findViewById(R.id.card2);
        CardView card3 = (CardView)v.findViewById(R.id.card3);

        if(hero == Hero.PROTOSS) {

            card1.setCard(protossCards[position + position * 3]);
            card2.setCard(protossCards[position + 1 + position * 3]);
            card3.setCard(protossCards[position + 2 + position * 3]);

        }else if(hero == Hero.TERRAN){

            card1.setCard(terranCards[position + position * 3]);
            card2.setCard(terranCards[position + 1 + position * 3]);
            card3.setCard(terranCards[position + 2 + position * 3]);

        }else if(hero == Hero.ZERG){

            card1.setCard(zergCards[position + position * 3]);
            card2.setCard(zergCards[position + 1 + position * 3]);
            card3.setCard(zergCards[position + 2 + position * 3]);

        }

        container.addView(v);

        return v;
    }

    public void setHero(byte hero){
        Log.d("CardLibraryPagerAdapter", "setHero - hero id : " + hero);
        this.hero = hero;
        notifyDataSetChanged();
    }
}
