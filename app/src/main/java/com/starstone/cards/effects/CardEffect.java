package com.starstone.cards.effects;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.starstone.R;
import com.starstone.Utils.SSContext;

public class CardEffect {

    private int id;

    protected CardEffect(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static Bitmap getImage(int effectId){

        switch (effectId){
            case Imposition.ID :
                return BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.imposition);
            case Agressive.ID :
                return BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.agressive);
            case Invisibility.ID :
                return BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.invisibility);
            case Poisoned.ID :
                return BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.poisoned);
            case Fly.ID :
                return BitmapFactory.decodeResource(SSContext.getContext().getResources(), R.drawable.fly);


        }

        return null;

    }

}
