package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
            sum = Integer.parseInt(allTermsTextView.getText().toString());
        }
    }
}
