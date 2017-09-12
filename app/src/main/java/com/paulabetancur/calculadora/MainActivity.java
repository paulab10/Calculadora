package com.paulabetancur.calculadora;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button bN0, bN1, bN2, bN3, bN4, bN5, bN6, bN7, bN8, bN9, bS, bR, bM, bD, bI, bP, bB;
    private TextView tResult;
    private String num="", Result;
    float  sum, res, mul, div, num2=0, num3=0, flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bN0 = (Button) findViewById(R.id.bN0);
        bN1 = (Button) findViewById(R.id.bN1);
        bN2 = (Button) findViewById(R.id.bN2);
        bN3 = (Button) findViewById(R.id.bN3);
        bN4 = (Button) findViewById(R.id.bN4);
        bN5 = (Button) findViewById(R.id.bN5);
        bN6 = (Button) findViewById(R.id.bN6);
        bN7 = (Button) findViewById(R.id.bN7);
        bN8 = (Button) findViewById(R.id.bN8);
        bN9 = (Button) findViewById(R.id.bN9);
        bS = (Button) findViewById(R.id.bS);
        bR = (Button) findViewById(R.id.bR);
        bM = (Button) findViewById(R.id.bM);
        bD = (Button) findViewById(R.id.bD);
        bI = (Button) findViewById(R.id.bI);
        bP = (Button) findViewById(R.id.bP);
        bB = (Button) findViewById(R.id.bB);
        tResult = (TextView) findViewById(R.id.tResult) ;



        bN0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            num+= "0";
                tResult.setText(" "+num);
            }
        });

      bN1.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v) {
            num+= "1";
              tResult.setText(" "+num);
          }
      });

        bN2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num+= "2";
                tResult.setText(" "+num);
            }
        });

        bN3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num+= "3";
                tResult.setText(" "+num);
            }
        });

        bN4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num+= "4";
                tResult.setText(" "+num);
            }
        });

        bN5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num+= "5";
                tResult.setText(" "+num);
            }
        });

        bN6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num+= "6";
                tResult.setText(" "+num);
            }
        });

        bN7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num+= "7";
                tResult.setText(" "+num);
            }
        });

        bN8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num+= "8";
                tResult.setText(" "+num);
            }
        });

        bN9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num+= "9";
                tResult.setText(" "+num);
            }
        });

        bP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num+= ".";
                tResult.setText(" "+num);
            }
        });


        bB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num="";
                num2=0;
                num3=0;
                tResult.setText(" ");
            }
        });


        bS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(num== "") {
                    flag = 1;
                }
                else {
                    num2+= Float.parseFloat(num);
                    num="";
                    flag= 1;
                }
            }
        });

        bR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(num== "") {
                    flag = 2;
                }
                else {
                    if(num2== 0) {
                        num2 = Float.parseFloat(num);
                        num = "";
                        flag = 2;
                    }
                    else {
                        num2 = num2 - Float.parseFloat(num);
                        num = "";
                        flag = 2;
                    }
                }
            }
        });




        bM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(num== "") {
                    flag = 3;
                }
                else {
                    if(num2== 0) {
                        num2 = Float.parseFloat(num);
                        num = "";
                        flag = 3;
                    }
                    else {
                        num2 = num2 * Float.parseFloat(num);
                        num = "";
                        flag = 3;
                    }
                }
            }
        });



        bD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(num== "") {
                    flag = 4;
                }
                else {
                    if(num2== 0) {
                        num2 = Float.parseFloat(num);
                        num = "";
                        flag = 4;
                    }
                    else {
                        num2 = num2 / Float.parseFloat(num);
                        num = "";
                        flag = 4;
                    }
                }
            }
        });



        bI.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(flag==1){
                    num3 = Float.parseFloat(num);
                    sum= num2 + num3;
                    tResult.setText(""+sum);
                }

                if(flag==2){
                    num3 = Float.parseFloat(num);
                    res= num2 - num3;
                    tResult.setText(""+res);
                }

                if(flag==3){
                    num3 = Float.parseFloat(num);
                    mul= num2 * num3;
                    tResult.setText(""+mul);
                }

                if(flag==4){
                    num3 = Float.parseFloat(num);
                    div= num2 / num3;
                    tResult.setText(""+div);
                }
            }
        });



    }
}
