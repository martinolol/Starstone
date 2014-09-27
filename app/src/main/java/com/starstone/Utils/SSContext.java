package com.starstone.Utils;

import android.content.Context;

public class SSContext {

    private Context context;

    private static SSContext instance;

    public static void createInstance(Context context){
        instance = new SSContext();
        instance.setContext(context);
    }

    public static SSContext getInstance(){
        return instance;
    }

    private void setContext(Context context){
        this.context = context;
    }

    public Context getContext(){
        return context;
    }
}
