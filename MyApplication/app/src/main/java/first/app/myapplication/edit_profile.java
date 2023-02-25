package first.app.myapplication;

import static first.app.myapplication.R.*;
import static first.app.myapplication.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;

import first.app.myapplication.R.id;

public class edit_profile extends AppCompatActivity {
    public static boolean is_male;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.edit_profile);


        EditText txt_edit_description=findViewById(R.id.txt_edit_description);
        EditText txt_edit=findViewById(id.txt_edit);
        Button save_edit=findViewById(id.save_edit);
        RadioGroup gender=findViewById(gender_radio);
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
              public void onCheckedChanged(RadioGroup radioGroup, int idchecked) {

                if (idchecked== male_radio){
                    is_male=true;


                }
                if (idchecked== female_raidio){
            is_male=false;

                }


            }
        });
        save_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname1=txt_edit.getText().toString();
                String description=txt_edit_description.getText().toString();
                Intent intent =new Intent();
                intent.putExtra("fullname1",fullname1);
                intent.putExtra("description",description);
                 setResult(Activity.RESULT_OK,intent);
                 finish();
            }
        });

    }
}