package com.example.messagesspj;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.messagesspj.db.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login newFragment = new Login();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction().replace(R.id.flActivity, newFragment)
                .addToBackStack(null)
                .commit();

        db = new DatabaseHelper(this);

    }

}
