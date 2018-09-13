package fck2068.example.loginpage.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import fck2068.example.loginpage.R;

//CLASS to get the extras that we passed
public class UsersActivity extends AppCompatActivity{
    private TextView textViewUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        textViewUsername = (TextView) findViewById(R.id.text1);
        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewUsername.setText("Welcome "+nameFromIntent);
    }
}
