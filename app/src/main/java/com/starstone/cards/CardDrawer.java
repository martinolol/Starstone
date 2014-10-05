package com.starstone.cards;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

import com.starstone.cards.effects.Agressive;
import com.starstone.cards.effects.CardEffect;
import com.starstone.cards.effects.Fly;
import com.starstone.cards.effects.Imposition;
import com.starstone.cards.effects.Invisibility;
import com.starstone.cards.effects.Poisoned;

public class CardDrawer {

    Card card;

    Paint paint;
    Paint circlePaint;
    Paint textPaint;

    public CardDrawer(Card card){
        this.card = card;

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

        textPaint.setTextAlign(Paint.Align.CENTER);

        initCard();
    }

    public void setCard(Card card){
        this.card = card;
        initCard();
    }

    private void initCard(){
        if(card != null) {
            circlePaint.setColor(card.getCircleColor());
            textPaint.setColor(card.getTextColor());
        }
    }

    public void drawCard(Canvas canvas){
        if(card != null) {

            final int circleRadius = canvas.getWidth() / 8;

            textPaint.setTextSize((int)(circleRadius * 1.5));

            final RectF effectRect = new RectF(
                    (canvas.getWidth() - (2 * circleRadius)),
                    0,
                    canvas.getWidth(),
                    circleRadius * 2);

            final Rect backgroundRect = new Rect(0, 0, canvas.getWidth(), canvas.getHeight());
            final Rect portraitRect = new Rect(backgroundRect.top + 5, backgroundRect.left + 5, backgroundRect.right - 5, backgroundRect.bottom - 5);

            /* Draw the background */
            canvas.drawBitmap(card.getHero().getCardBackground(), null, backgroundRect, paint);

            /* Draw the portrait */
            canvas.drawBitmap(card.getPortrait(), null, portraitRect, paint);

            /* Draw the price */
            canvas.drawCircle(circleRadius, circleRadius, circleRadius, circlePaint);
            final int priceTextPosY = (int)(circleRadius - ((textPaint.descent() + textPaint.ascent()) / 2)) ;
            canvas.drawText(String.valueOf(card.getPrice()), circleRadius, priceTextPosY, textPaint);

            /* Draw the damage */
            canvas.drawCircle(circleRadius, (canvas.getHeight() - circleRadius), circleRadius, circlePaint);
            final int damageTextPosY = (int)((canvas.getHeight() - circleRadius) - ((textPaint.descent() + textPaint.ascent()) / 2)) ;
            canvas.drawText(String.valueOf(card.getDamage()), circleRadius, damageTextPosY, textPaint);

            /* Draw the life */
            canvas.drawCircle((canvas.getWidth() - circleRadius), (canvas.getHeight() - circleRadius), circleRadius, circlePaint);
            final int lifeTextPosY = (int)((canvas.getHeight() - circleRadius) - ((textPaint.descent() + textPaint.ascent()) / 2)) ;
            canvas.drawText(String.valueOf(card.getLife()), (canvas.getWidth() - circleRadius), lifeTextPosY, textPaint);

            /* Draw effect imposition */
            if(card.isEffect(Imposition.ID)) {

                canvas.drawOval(effectRect, circlePaint);
                canvas.drawBitmap(CardEffect.getImage(Imposition.ID), null, effectRect, paint);
                effectRect.top += circleRadius * 2.1;
                effectRect.bottom += circleRadius * 2.1;
            }

            if(card.isEffect(Agressive.ID)) {
                canvas.drawOval(effectRect, circlePaint);
                canvas.drawBitmap(CardEffect.getImage(Agressive.ID), null, effectRect, paint);
                effectRect.top += circleRadius * 2.1;
                effectRect.bottom += circleRadius * 2.1;
            }

            if(card.isEffect(Invisibility.ID)) {
                canvas.drawOval(effectRect, circlePaint);
                canvas.drawBitmap(CardEffect.getImage(Invisibility.ID), null, effectRect, paint);
                effectRect.top += circleRadius * 2.1;
                effectRect.bottom += circleRadius * 2.1;
            }

            if(card.isEffect(Poisoned.ID)) {
                canvas.drawOval(effectRect, circlePaint);
                canvas.drawBitmap(CardEffect.getImage(Poisoned.ID), null, effectRect, paint);
                effectRect.top += circleRadius * 2.1;
                effectRect.bottom += circleRadius * 2.1;
            }

            if(card.isEffect(Fly.ID)) {
                canvas.drawOval(effectRect, circlePaint);
                canvas.drawBitmap(CardEffect.getImage(Fly.ID), null, effectRect, paint);
                effectRect.top += circleRadius * 2.1;
                effectRect.bottom += circleRadius * 2.1;
            }

        }
    }
}
