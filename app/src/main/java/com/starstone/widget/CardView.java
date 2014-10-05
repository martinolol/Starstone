package com.starstone.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
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

    public CardView(Context context, Card card){
        super(context);
        this.card = card;
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

        int measuredWidth = (int)(height * 0.625);
        int measuredHeight = (int)(width * 1.6);


        Log.d("CardView", "onMeasure - height : " + height + " || measuredHeight : " + measuredHeight);
        Log.d("CardView", "onMeasure - width : " + width + " || measuredWidth : " + measuredWidth);

        if(width > height && height != 0){
            setMeasuredDimension(measuredWidth, height);
            return;
        }

        if(measuredHeight > height){
            setMeasuredDimension(width, measuredHeight);
        }else{
            setMeasuredDimension(measuredWidth, height);
        }

    }


}
