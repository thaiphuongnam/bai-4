package com.example.student.bai4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButtonTrungCap, radioButtonCaoDang, radioButtonDaiHoc;
    EditText editTextName, editTextCMND, editTextNote;
    CheckBox checkBoxDocBao, checkBoxDocSach, checkBoxDocCode;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButtonTrungCap = findViewById(R.id.radioButtonTrungCap);
        radioButtonCaoDang = findViewById(R.id.radioButtonCaoDang);
        radioButtonDaiHoc = findViewById(R.id.radioButtonDaiHoc);
        checkBoxDocBao = findViewById(R.id.checkBoxDocBao);
        checkBoxDocSach = findViewById(R.id.checkBoxDocSach);
        checkBoxDocCode = findViewById(R.id.checkBoxDocCode);
        editTextName = findViewById(R.id.editTextName);
        editTextCMND = findViewById(R.id.editTextCMND);
        editTextNote = findViewById(R.id.editTextNote);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                String cmnd = editTextCMND.getText().toString();
                String bangCap = "";
                if (radioButtonTrungCap.isChecked())
                    bangCap = radioButtonTrungCap.getText().toString();
                else if (radioButtonCaoDang.isChecked())
                    bangCap = radioButtonCaoDang.getText().toString();
                else if (radioButtonDaiHoc.isChecked())
                    bangCap = radioButtonDaiHoc.getText().toString();

                String soThich = "";
                if (checkBoxDocBao.isChecked())
                    soThich += checkBoxDocBao.getText().toString();
                if (checkBoxDocSach.isChecked())
                    soThich += ", " + checkBoxDocBao.getText().toString();
                if (checkBoxDocCode.isChecked())
                    soThich += ", " + checkBoxDocCode.getText().toString();

                String note = editTextNote.getText().toString();

                Profile profile = new Profile(name, cmnd, bangCap, soThich, note);

                Toast.makeText(MainActivity.this, profile.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
