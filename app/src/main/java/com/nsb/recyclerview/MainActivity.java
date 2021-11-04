package com.nsb.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.audiofx.Equalizer;
import android.os.Bundle;
import android.util.Log;

import com.nsb.recyclerview.Adapter.SettingsAdapter;
import com.nsb.recyclerview.Model.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvSetting;
    private ArrayList<Menu> menus = new ArrayList<>();
    private SettingsAdapter settingsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvSetting = findViewById(R.id.rcvSetting);
        settingsAdapter = new SettingsAdapter(this, menus, R.layout.item_menu);
        rcvSetting.setAdapter(settingsAdapter);


        // dạng cuộn dọc
        rcvSetting.setLayoutManager(new LinearLayoutManager(this));
        settingsAdapter.setOnItemClickListener(new SettingsAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Log.d("NSB","CICKKK" + position);
            }

            @Override
            public void onItemLongClick(int position) {
                Log.d("NSB","CICKKK" + position);
              //  menus.remove(position);
              //  settingsAdapter.notifyItemMoved(position);

            }
        });


        initMockData();

    }

    private void initMockData() {
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                " devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "h"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Conneces", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Conneices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));
        menus.add(new Menu(R.mipmap.ic_launcher_round,
                "Connected devices", "Bluetooth"));

        settingsAdapter.notifyDataSetChanged();
    }
}