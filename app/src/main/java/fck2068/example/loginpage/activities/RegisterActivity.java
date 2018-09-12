package fck2068.example.loginpage.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fck2068.example.loginpage.R;
import fck2068.example.loginpage.activities.LoginActivity;

public class RegisterActivity extends AppCompatActivity {
    private Button loginRegBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        loginRegBtn = (Button) findViewById(R.id.loginRegButton);
        loginRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
            }
        });
    }

    public void openLoginPage() {
        Intent loginOpenIntent = new Intent(this, LoginActivity.class);
        startActivity(loginOpenIntent);
    }
}
