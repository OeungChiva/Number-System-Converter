package vn.hust.edu.numbersystemconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText NumberToBeConverted;
    EditText NumberConverted;
    Spinner ConvertFromDropdown;
    Spinner ConvertToDropdown;
    String list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumberConverted = (EditText) findViewById(R.id.edit_result);
        NumberToBeConverted = (EditText) findViewById(R.id.edit_num);
        ConvertFromDropdown = (Spinner) findViewById(R.id.spinner_convert_from);
        ConvertToDropdown = (Spinner) findViewById(R.id.spinner_convert_to);
        button = (Button) findViewById(R.id.btn_convert);

        String[] dropDownList = {"DEC","BIN","OCT","HEX"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, dropDownList);
        ConvertFromDropdown.setAdapter(adapter);
        ConvertToDropdown.setAdapter(adapter);


    }

}