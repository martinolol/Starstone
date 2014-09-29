package com.starstone;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.starstone.Utils.SSContext;
import com.starstone.adapter.CardLibraryListAdapter;
import com.starstone.heroes.Hero;
import com.starstone.widget.HorizontalListView;

public class MainActivity extends Activity {

    HorizontalListView cardList;

    CardLibraryListAdapter listAdapter;

    Button protossButton = null;
    Button terranButton = null;
    Button zergButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SSContext.createInstance(this);

        cardList = (HorizontalListView)findViewById(R.id.cardList);

        protossButton = (Button)findViewById(R.id.protoss);
        terranButton = (Button)findViewById(R.id.terran);
        zergButton = (Button)findViewById(R.id.zerg);

        listAdapter = new CardLibraryListAdapter();

        listAdapter.setHero(Hero.PROTOSS);

        cardList.setAdapter(listAdapter);

        protossButton.setOnClickListener(clickProtoss);
        terranButton.setOnClickListener(clickTerran);
        zergButton.setOnClickListener(clickZerg);
    }

    private View.OnClickListener clickProtoss = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            listAdapter.setHero(Hero.PROTOSS);
        }
    };

    private View.OnClickListener clickTerran = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            listAdapter.setHero(Hero.TERRAN);
        }
    };

    private View.OnClickListener clickZerg = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            listAdapter.setHero(Hero.ZERG);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
