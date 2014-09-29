package com.starstone.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.starstone.cards.Card;
import com.starstone.cards.CardDrawer;

public class CardView extends View {

    CardDrawer drawer;

    private Card card;

    public CardView(Context context) {
        super(context);
        init();
    }

    public CardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        drawer = new CardDrawer(card);
    }

    public void setCard(Card card){
        this.card = card;
        drawer.setCard(card);
        invalidate();
    }



    @Override
    public void onDraw(Canvas canvas){

        drawer.drawCard(canvas);

    }

    /* Pour obtenir un ratio de cinq huitième (5/8) */
    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec){

        int height = MeasureSpec.getSize(heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);

        //int measuredWidth = (int)(height * 0.625);
        //int measuredHeight = height;

        //if(measuredWidth > width){
        int measuredHeight = (int)(width * 1.6);
        int measuredWidth = width;
        //}

        setMeasuredDimension(measuredWidth, measuredHeight);
    }


}
