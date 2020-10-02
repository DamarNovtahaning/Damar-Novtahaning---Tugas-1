package com.example.dts_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String[] huruf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
    private Button tes1;
    private Button tes2;
    private Button tes3;
    private Button tes4;
    private Button tes5;
    private Button tes6;
    private Button tes7;
    private Button tes8;
    private Button tes9;
    private Button tes10;
    private Button tes11;
    private Button tes12;
    private Button tes13;
    private Button tes14;
    private Button tes15;
    private Button tes16;
    private Button kosong;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            tes1 = findViewById(R.id.tes1);
            tes2 = findViewById(R.id.tes2);
            tes3 = findViewById(R.id.tes3);
            tes4 = findViewById(R.id.tes4);
            tes5 = findViewById(R.id.tes5);
            tes6 = findViewById(R.id.tes6);
            tes7 = findViewById(R.id.tes7);
            tes8 = findViewById(R.id.tes8);
            tes9 = findViewById(R.id.tes9);
            tes10 = findViewById(R.id.tes10);
            tes11 = findViewById(R.id.tes11);
            tes12 = findViewById(R.id.tes12);
            tes13 = findViewById(R.id.tes13);
            tes14 = findViewById(R.id.tes14);
            tes15 = findViewById(R.id.tes15);
            tes16 = findViewById(R.id.kosong);
            kosong = kosong;

            tes1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes2 || kosong == tes5){
                            ganti(tes1);
                        }
                    }
                });

                tes2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes1 || kosong == tes3 || kosong == tes6){
                            ganti(tes2);
                        }
                    }
                });

                tes3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes2 || kosong == tes4 || kosong == tes7){
                            ganti(tes3);
                        }
                    }
                });

                tes4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes3 || kosong == tes8){
                            ganti(tes4);
                        }
                    }
                });

                tes5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes1 || kosong == tes6 || kosong == tes9){
                            ganti(tes5);
                        }
                    }
                });

                tes6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes2 || kosong == tes5 || kosong == tes7 || kosong == tes10){
                            ganti(tes6);
                        }
                    }
                });

                tes7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes3 || kosong == tes6 || kosong == tes8 || kosong == tes11){
                            ganti(tes7);
                        }
                    }
                });

                tes8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes4 || kosong == tes7 || kosong == tes12){
                            ganti(tes8);
                        }
                    }
                });

                tes9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes5 || kosong == tes10 || kosong == tes13){
                            ganti(tes9);
                        }
                    }
                });

                tes10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes6 || kosong == tes9 || kosong == tes11 || kosong == tes14){
                            ganti(tes10);
                        }
                    }
                });

                tes11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes7 || kosong == tes10 || kosong == tes12 || kosong == tes15){
                            ganti(tes11);
                        }
                    }
                });

                tes12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes8 || kosong == tes11 || kosong == tes16){
                            ganti(tes12);
                        }
                    }
                });

                tes13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes9 || kosong == tes14){
                            ganti(tes13);
                        }
                    }
                });

                tes14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes10 || kosong == tes13 || kosong == tes15){
                            ganti(tes14);
                        }
                    }
                });

                tes15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes11 || kosong == tes14 || kosong == tes16){
                            ganti(tes15);
                        }
                    }
                });

                tes16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(kosong == tes12 || kosong == tes15){
                            ganti(tes16);
                        }
                    }
                });
    }

    private void ganti(Button button){
        kosong.setText(button.getText());
        button.setText("");
        kosong = button;

        if(tes1.getText().equals("A") && tes2.getText().equals("B") && tes3.getText().equals("C") && tes4.getText().equals("D") && tes5.getText().equals("E") && tes6.getText().equals("F") && tes7.getText().equals("G") && tes8.getText().equals("H") && tes9.getText().equals("I") && tes10.getText().equals("J") && tes11.getText().equals("K") && tes12.getText().equals("L") && tes13.getText().equals("M") && tes14.getText().equals("N") && tes15.getText().equals("O")){
            Toast.makeText(getApplicationContext(), "You Win", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId()==R.id.ulang){
                Random();
            } else if (item.getItemId() == R.id.keluar){
                finish();
                System.exit(0);
            }
        return true;
    }

    private void Random(){
        for (int i = huruf.length - 2; i >= 0; i--) {
            Random r = new Random();
            int index = r.nextInt(i + 1);
            String a = huruf[index];
            huruf[index] = huruf[i];
            huruf[i] = a;
        }

        tes1.setText(huruf[0]);
        tes2.setText(huruf[1]);
        tes3.setText(huruf[2]);
        tes4.setText(huruf[3]);
        tes5.setText(huruf[4]);
        tes6.setText(huruf[5]);
        tes7.setText(huruf[6]);
        tes8.setText(huruf[7]);
        tes9.setText(huruf[8]);
        tes10.setText(huruf[9]);
        tes11.setText(huruf[10]);
        tes12.setText(huruf[11]);
        tes13.setText(huruf[12]);
        tes14.setText(huruf[13]);
        tes15.setText(huruf[14]);
        tes16.setText("");

        kosong = kosong;
    }

}
