package com.example.kent_zheng.cutombutton;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private ListView mListView;
    private Myadapter mMyadapter;
    private LayoutInflater mLayoutInflater;
    private int[] mButton;
    private String[] mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        fillArray();

        mListView.setAdapter(mMyadapter);
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.ListView);

        mMyadapter = new Myadapter(this);
    }

    private void fillArray() {

        mButton = new int[] {R.drawable.custom_btn_acapulco, R.drawable.custom_btn_arsenic,
        R.drawable.custom_btn_beige, R.drawable.custom_btn_black_pearl,
        R.drawable.custom_btn_breaker_bay, R.drawable.custom_btn_dark_khaki,
        R.drawable.custom_btn_genoa, R.drawable.custom_btn_haiti,
        R.drawable.custom_btn_lemon_chiffon, R.drawable.custom_btn_livid_brown,
        R.drawable.custom_btn_medium_wood, R.drawable.custom_btn_opal,
        R.drawable.custom_btn_orange, R.drawable.custom_btn_pale_brown,
        R.drawable.custom_btn_paprika, R.drawable.custom_btn_sandrift,
        R.drawable.custom_btn_seagull, R.drawable.custom_btn_shakespeare,
        R.drawable.custom_btn_sorbus, R.drawable.custom_btn_whiskey};

        mTextView = new String[]{"Acapulco", "Arsenic", "Beige", "Black_pearl", "Breaker_bay",
        "Dark_khaki", "Genoa", "Haiti", "Lemon_chiffon", "Livid_brown", "Medium_wood", "Opal",
        "Orange", "Pale_brown", "Paprika", "Sandrift", "Seagull", "Shakespeare", "Sorbus",
        "Whiskey"};

    }


    public class Myadapter extends BaseAdapter {

        Myadapter(Context context) {
            mLayoutInflater = LayoutInflater.from(context);

        }
        @Override
        public int getCount() {
            return mTextView.length;
        }

        @Override
        public Object getItem(int position) {
            return mTextView[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = mLayoutInflater.inflate(R.layout.custom_listview, null);

            Button CustomButton = (Button) convertView.findViewById(R.id.btn);
            TextView CustomText = (TextView) convertView.findViewById(R.id.tv);

            for(int i = 0; i < mButton.length; i++) {
                CustomButton.setBackgroundResource(mButton[position]);
                CustomText.setText(mTextView[position]);
            }

            return convertView;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
