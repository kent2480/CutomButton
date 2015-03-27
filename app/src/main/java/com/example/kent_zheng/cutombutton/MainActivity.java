package com.example.kent_zheng.cutombutton;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {
    private ListView mListView;
    private Myadapter mMyadapter;
    private String[] data = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

//        ArrayAdapter<String> list1 = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, data);
//        mListView.setAdapter(list1);
//        mListView.setCacheColorHint(00000000);
//        mListView.setFastScrollEnabled(true);
//        mListView.setFadingEdgeLength(100);

        mListView.setAdapter(mMyadapter);
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.ListView);

        mMyadapter = new Myadapter(this);
    }


    public class Myadapter extends BaseAdapter {

        Myadapter(Context context) {

        }
        @Override
        public int getCount() {
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
            return null;
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
