package my.project.a2appuidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class class3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class3);
    }


    public void click(View view) {
        Intent intent = new Intent(this, Animations6.class);
        startActivity(intent);
    }
}