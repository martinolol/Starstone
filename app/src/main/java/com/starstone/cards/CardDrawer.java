package com.starstone.cards;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.starstone.cards.effects.CardEffect;

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

        textPaint.setTextSize(40f);
        textPaint.setTextAlign(Paint.Align.CENTER);

        if(card != null) {
            circlePaint.setColor(card.getCircleColor());
            textPaint.setColor(card.getTextColor());
        }
    }

    public void setCard(Card card){
        this.card = card;
        circlePaint.setColor(card.getCircleColor());
        textPaint.setColor(card.getTextColor());
    }

    public void drawCard(Canvas canvas){
        if(card != null) {

            final int circleRadius = canvas.getWidth() / 8;

            int effectPosY = circleRadius;

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
            if(card.isEffect(CardEffect.IMPOSITION)) {
                canvas.drawCircle((canvas.getWidth() - circleRadius), effectPosY, circleRadius, circlePaint);
                final int impositionTextPosY = (int)(effectPosY - ((textPaint.descent() + textPaint.ascent()) / 2));
                canvas.drawText("I", (canvas.getWidth() - circleRadius), impositionTextPosY, textPaint);
                effectPosY += (circleRadius * 2.5);
            }

            if(card.isEffect(CardEffect.AGRESSIVE)) {
                canvas.drawCircle((canvas.getWidth() - circleRadius), effectPosY, circleRadius, circlePaint);
                final int agressiveTextPosY = (int)(effectPosY - ((textPaint.descent() + textPaint.ascent()) / 2));
                canvas.drawText("A", (canvas.getWidth() - circleRadius), agressiveTextPosY, textPaint);
                effectPosY += (circleRadius * 2.5);
            }

            if(card.isEffect(CardEffect.INVISIBILITY)) {
                canvas.drawCircle((canvas.getWidth() - circleRadius), effectPosY, circleRadius, circlePaint);
                final int impositionTextPosY = (int)(effectPosY - ((textPaint.descent() + textPaint.ascent()) / 2));
                canvas.drawText("O", (canvas.getWidth() - circleRadius), impositionTextPosY, textPaint);
                effectPosY += (circleRadius * 2.5);
            }

            if(card.isEffect(CardEffect.POISONED)) {
                canvas.drawCircle((canvas.getWidth() - circleRadius), effectPosY, circleRadius, circlePaint);
                final int impositionTextPosY = (int)(effectPosY - ((textPaint.descent() + textPaint.ascent()) / 2));
                canvas.drawText("P", (canvas.getWidth() - circleRadius), impositionTextPosY, textPaint);
                /* effectPosY += (circleRadius * 2.5); */
            }

        }
    }
}
