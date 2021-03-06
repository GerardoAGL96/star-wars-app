package com.example.myfirstapp.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myfirstapp.R;
import com.example.myfirstapp.SwApplication;
import com.example.myfirstapp.dagger.componets.MoviesComponent;
import com.example.myfirstapp.dagger.scopes.ActivityScope;

@ActivityScope
public class MainActivity extends AppCompatActivity {
    public MoviesComponent moviesComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesComponent = ((SwApplication) getApplication()).appComponent
                .moviesComponent()
                .create(this);
    }
}
