package com.starstone.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

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

public class CardLibraryListAdapter extends BaseAdapter {

    private LayoutInflater inflater;

    private byte heroId;

    private Card[] protossCards;
    private Card[] terranCards;
    private Card[] zergCards;

    public CardLibraryListAdapter() {
        inflater = (LayoutInflater)SSContext.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        protossCards = new Card[]{new Zealot(), new Stalker(), new Sentry(), new Voidray()};
        terranCards = new Card[]{new Marine(), new Marauder(), new Ghost()};
        zergCards = new Card[]{new Zergling(), new Roach(), new Baneling()};
    }

    @Override
    public int getCount() {

        if(heroId == Hero.PROTOSS){
            Log.d("CardLibraryListAdapter", "getCount - (PROTOSS) count = " + protossCards.length);
            return protossCards.length;

        }else if(heroId == Hero.TERRAN){
            Log.d("CardLibraryListAdapter", "getCount - (TERRAN) count = " + terranCards.length);
            return terranCards.length;

        }else if(heroId == Hero.ZERG){
            Log.d("CardLibraryListAdapter", "getCount - (ZERG) count = " + zergCards.length);
            return zergCards.length;

        }

        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CardView cardView = new CardView(SSContext.getContext());


        if(heroId == Hero.PROTOSS){
            cardView.setCard(protossCards[position]);

        }else if(heroId == Hero.TERRAN){
            cardView.setCard(terranCards[position]);

        }else if(heroId == Hero.ZERG){
            cardView.setCard(zergCards[position]);

        }

        return cardView;
    }

    public void setHero(byte heroId){
        this.heroId = heroId;
        notifyDataSetChanged();
    }
}

