package com.sonogong.studynugu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    TodoFragment Todo;
    DdayFragment Dday;
    TimerFragment Timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Todo = new TodoFragment();
        Dday = new DdayFragment();
        Timer = new TimerFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, Todo).commit();

        bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.TodoF: {
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, Todo).commit();

                                return true;
                            }
                            case R.id.DdayF: {
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, Dday).commit();

                                return true;
                            }
                            case R.id.TimerF: {
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, Timer).commit();

                                return true;
                            }
                        }
                        return false;
                    }
                }
        );
    }
}