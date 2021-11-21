package com.example.caloriesparjour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 Spinner sp1,sp2;
 EditText EdAge,EdPoids;
 TextView TvMessage,TvCal,TvDep;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1=findViewById(R.id.sp1);
        sp2=findViewById(R.id.sp2);
        EdAge=findViewById(R.id.Edage);
        EdPoids=findViewById(R.id.EdPoids);
        TvMessage=findViewById(R.id.TvMessage);
        TvCal=findViewById(R.id.TvCal);
        TvDep=findViewById(R.id.TvDep);
        TextWatcher textWatcher =new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


                if(!EdAge.getText().toString().equals("") && !EdPoids.getText().toString().equals("") && !sp1.getSelectedItem().toString().equals("") && !sp2.getSelectedItem().toString().equals("") )
                {
                    int age=Integer.parseInt(EdAge.getText().toString());
                    int poids=Integer.parseInt(EdPoids.getText().toString());

                    if(sp1.getSelectedItem().toString().equals("Homme"))
                    {
                        if(sp2.getSelectedItem().toString().equals("Légére"))

                        {
                            Double p =((10*poids)+(6.25*174.7)-(5*age)+5+331);
                            TvCal.setText(String.valueOf(p));
                        }
                        else if (sp2.getSelectedItem().toString().equals("Modérée"))
                        {
                            Double p =((10*poids)+(6.25*174.7)-(5*age)+5+910);
                            TvCal.setText(String.valueOf(p));
                        }
                        else if (sp2.getSelectedItem().toString().equals("Intense"))
                        {
                            Double p =((10*poids)+(6.25*174.7)-(5*age)+5+1490);
                            TvCal.setText(String.valueOf(p));
                        }

                    }
                    else
                    {
                        if(sp2.getSelectedItem().toString().equals("Légére"))

                        {
                            Double p =((10*poids)+(6.25*161.3)-(5*age)-161+331);
                            TvCal.setText(String.valueOf(p));
                        }
                        else if (sp2.getSelectedItem().toString().equals("Modérée"))
                        {
                            Double p =((10*poids)+(6.25*161.3)-(5*age)-161+910);
                            TvCal.setText(String.valueOf(p));
                        }
                        else if (sp2.getSelectedItem().toString().equals("Intense"))
                        {
                            Double p =((10*poids)+(6.25*161.3)-(5*age)-161+1490);
                            TvCal.setText(String.valueOf(p));
                        }

                    }



                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        EdAge.addTextChangedListener(textWatcher);
        EdPoids.addTextChangedListener(textWatcher);



    }
}