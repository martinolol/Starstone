package com.starstone.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.starstone.R;
import com.starstone.Utils.SSContext;
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

    private byte hero;

    private LayoutInflater inflater = null;

    public CardLibraryPagerAdapter() {
        inflater = (LayoutInflater) SSContext.getInstance().getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 1;
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
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View v = inflater.inflate(R.layout.item_pager_card_library, null);

        CardView card1 = (CardView)v.findViewById(R.id.card1);
        CardView card2 = (CardView)v.findViewById(R.id.card2);
        CardView card3 = (CardView)v.findViewById(R.id.card3);

        if(hero == Hero.PROTOSS) {

            card1.setCard(new Zealot());
            card2.setCard(new Stalker());
            /* setCard(new Sentry(); */
            card3.setCard(new Voidray());

        }else if(hero == Hero.TERRAN){
            card1.setCard(new Marine());
            card2.setCard(new Marauder());
            card3.setCard(new Ghost());

        }else if(hero == Hero.ZERG){
            card1.setCard(new Zergling());
            card2.setCard(new Roach());
            card3.setCard(new Baneling());

        }

        container.addView(v, 0);

        return v;
    }

    public void setHero(byte hero){
        Log.d("CardLibraryPagerAdapter", "setHero - hero id : " + hero);
        this.hero = hero;
        notifyDataSetChanged();
    }
}
