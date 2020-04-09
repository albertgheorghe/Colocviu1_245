package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Colocviu1_245MainActivity extends AppCompatActivity {

    private EditText nextTermEditText;
    private Button addButton;
    private EditText allTermsTextView;
    private Button computeButton;


    private addButtonClickListener addButtonClickListener = new addButtonClickListener();

    private class addButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (nextTermEditText.getText().toString().matches("")) {
                return;
            } else {
                if (allTermsTextView.getText().toString().matches("")) {
                    allTermsTextView.setText(nextTermEditText.getText().toString());
                } else {
                    allTermsTextView.setText(allTermsTextView.getText().toString() + " + " + nextTermEditText.getText().toString());
                }
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_245_main);

        nextTermEditText = (EditText) findViewById(R.id.next_term_edit_text);
        addButton = (Button) findViewById(R.id.add_button);
        addButton.setOnClickListener(addButtonClickListener);
        allTermsTextView = (EditText) findViewById(R.id.all_terms_edit_text);
        computeButton = (Button) findViewById(R.id.compute_button);

    }
}
