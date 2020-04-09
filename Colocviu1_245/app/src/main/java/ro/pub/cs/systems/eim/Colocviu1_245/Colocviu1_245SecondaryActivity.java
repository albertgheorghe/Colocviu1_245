package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Colocviu1_245SecondaryActivity extends AppCompatActivity {

    private TextView allTermsTextView;
    private Button computeButton;
    Integer sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_245_main);

        allTermsTextView = (EditText) findViewById(R.id.all_terms_edit_text);
        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey("compute")) {
            int sum = intent.getIntExtra("compute", -1);
            setResult(sum,null);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            Toast.makeText(this, "The activity returned with result " + resultCode, Toast.LENGTH_LONG).show();
        }
    }
}
