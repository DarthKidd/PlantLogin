package fck2068.example.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button loginBtn;
    private Button createAccBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.loginButton);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLandingPage();
            }
        });

        createAccBtn = findViewById(R.id.createAccButton);
        createAccBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterPage();
            }
        });
    }

    public void openRegisterPage() {
        Intent regIntent = new Intent(this, RegisterActivity.class);
        startActivity(regIntent);
    }

    public void openLandingPage() {
        Intent loginIntent = new Intent(this, LandingPageActivity.class);
        startActivity(loginIntent);
    }
}
