package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
            switch (view.getId()) {
                case R.id.add_button:
                    if (nextTermEditText.getText().toString().matches("")) {
                        return;
                    } else {
                        if (allTermsTextView.getText().toString().matches("")) {
                            allTermsTextView.setText(nextTermEditText.getText().toString());
                        } else {
                            allTermsTextView.setText(allTermsTextView.getText().toString() + " + " + nextTermEditText.getText().toString());
                        }
                    }
                    break;
                case R.id.compute_button:
                    Intent intent = new Intent(getApplicationContext(), Colocviu1_245MainActivity.class);
                    int sum = Integer.parseInt(allTermsTextView.getText().toString());
                    intent.putExtra("compute", sum);
                    startActivityForResult(intent, 10);
                    break;
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
        computeButton.setOnClickListener(addButtonClickListener);

        if (savedInstanceState != null){
            if (savedInstanceState.containsKey("allterms")){
                allTermsTextView.setText(savedInstanceState.getString("allterms"));
            }
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("allterms", allTermsTextView.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null){
            if (savedInstanceState.containsKey("allterms")){
                allTermsTextView.setText(savedInstanceState.getString("allterms"));
            }
        }
    }
}
