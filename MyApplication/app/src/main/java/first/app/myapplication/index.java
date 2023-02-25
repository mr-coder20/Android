package first.app.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class index extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        Button save = findViewById(R.id.btn_save);
        save.setOnClickListener(new View.OnClickListener() {












            @Override
            public void onClick(View v) {
                Toast.makeText(index.this, "save done", Toast.LENGTH_LONG).show();
            }
        });


        CheckBox computer = findViewById(R.id.Computer);
      computer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
              if (isChecked)
              {
                  Toast.makeText(index.this,"computer is checked",Toast.LENGTH_SHORT ).show();

              }
              else {
                  Toast.makeText(index.this,"computer is not checked",Toast.LENGTH_SHORT ).show();

              }

          }
      });

        CheckBox Accounting=findViewById(R.id.Accounting);
        Accounting.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked)
                {
                    Toast.makeText(index.this,"Accounting is checked",Toast.LENGTH_SHORT ).show();

                }
                else {
                    Toast.makeText(index.this, "Accounting is not checked", Toast.LENGTH_SHORT).show();
                }
            }
        });



        CheckBox Architecture=findViewById(R.id.Architecture);
        Architecture.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                Toast.makeText(index.this,"Architecture is checked",Toast.LENGTH_SHORT).show();

            }else {
Toast.makeText(index.this,"Architecture is not checked",Toast.LENGTH_SHORT).show();
                }
            }
        });




        CheckBox Mechanic=findViewById(R.id.Mechanic);
        Mechanic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){

                    Toast.makeText(index.this,"Mechanic is checked",Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(index.this,"Mechanic is not checked",Toast.LENGTH_SHORT).show();
                }

            }
        });


        CheckBox Electrical=findViewById(R.id.Electrical);
        Electrical.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {


                if(isChecked){

                    Toast.makeText(index.this,"Electrical is checked",Toast.LENGTH_SHORT).show();

                }



                else{

                    Toast.makeText(index.this,"Electrical is not checked",Toast.LENGTH_SHORT).show();
                }
            }
        });

        RadioGroup Province=findViewById(R.id.radioGroup_Province);
        Province.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int idCkecked) {
                switch (idCkecked) {
                    case R.id.Tehran:
                        Toast.makeText(index.this, "Tehran Is Checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Gilan:
                        Toast.makeText(index.this,"Gilan Is Checked",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.Markazi:
                            Toast.makeText(index.this,"Markazi Is Checked",Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });


Button editbutton=findViewById(R.id.Edit_profile);
editbutton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(index.this, edit_profile.class);


        startActivityForResult(intent,100);


    }
});
        }


    @SuppressLint("MissingSuperCall")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 100 && resultCode == Activity.RESULT_OK && data != null) {
            String fullname1 = data.getStringExtra("fullname1");
            String description = data.getStringExtra("description");
            TextView textView_name = findViewById(R.id.textView_index_name);
            TextView textView_description = findViewById(R.id.txt_description);
            textView_description.setText(description);
            textView_name.setText(fullname1);
        }



Button btn_view_website=findViewById(R.id.btn_view_website);
        btn_view_website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/mr-coder20"));
                startActivity(intent);
            }
        });
        edit_profile edit_profile=new edit_profile();

        if(edit_profile.is_male==true){

            ImageView imageView=findViewById(R.id.imageuser);
imageView.setImageResource(R.drawable.male);
        }
        if(edit_profile.is_male==false)
   {
            ImageView imageView=findViewById(R.id.imageuser);
            imageView.setImageResource(R.drawable.female);



        }

    }
}




