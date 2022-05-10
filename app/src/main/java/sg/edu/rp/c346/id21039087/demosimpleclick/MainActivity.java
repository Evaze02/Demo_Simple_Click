package sg.edu.rp.c346.id21039087.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code for action
                Toast.makeText(MainActivity.this, "Display button clicked",
                        Toast.LENGTH_SHORT).show();
                String stringResponse = etInput.getText().toString();
                int checkedRadioID = rgGender.getCheckedRadioButtonId();
                if(checkedRadioID == R.id.radioButtonMale){
                    //Write the code when male selected
                    stringResponse = "He says " + stringResponse;
                }
                else{
                    //Write the code when female selected
                    stringResponse = "She says " + stringResponse;
                }
                tvDisplay.setText(stringResponse);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                // add your code for action
                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }

            }
        });


    }
}
