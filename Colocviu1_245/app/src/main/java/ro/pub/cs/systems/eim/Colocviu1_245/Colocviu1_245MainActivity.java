package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Colocviu1_245MainActivity extends AppCompatActivity {

    private EditText nextTermEditText ;
    private Button addButton;
    private EditText allTermsTextView;
    private Button computeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_245_main);

        nextTermEditText = (EditText)findViewById(R.id.next_term_edit_text);
        addButton =(Button)findViewById(R.id.add_button);
        allTermsTextView = (EditText) findViewById(R.id.all_terms_edit_text);
        computeButton = (Button)findViewById(R.id.compute_button);

    }
}
