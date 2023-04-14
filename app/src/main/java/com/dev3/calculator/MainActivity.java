package com.dev3.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    AppCompatButton add,minus,multiply,division,clear,mod,dot,equal;
    TextView intxt,outtxt;
    float res1,res2,finalRes=0;
    boolean ADD,MUL,SUB,DIV,MOD;
    List<Character> res ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findIds();
        click();
    }
    private void setFalse(){
        ADD=MOD=MUL=SUB=DIV=false;
    }
    private void res11(){
       res1=Float.parseFloat(intxt.getText().toString());
    }
    private void res22(){
        res2=Float.parseFloat(intxt.getText().toString());
    }
    private void findIds(){
        btn0 =findViewById(R.id.zero);
        btn1 =findViewById(R.id.one);
        btn2 =findViewById(R.id.two);
        btn3 =findViewById(R.id.three);
        btn4 =findViewById(R.id.four);
        btn5 =findViewById(R.id.five);
        btn6 =findViewById(R.id.six);
        btn7 =findViewById(R.id.seven);
        btn8 =findViewById(R.id.eight);
        btn9 =findViewById(R.id.nine);
        add =findViewById(R.id.add);
        multiply =findViewById(R.id.multiply);
        minus =findViewById(R.id.minus);
        division=findViewById(R.id.division);
        mod =findViewById(R.id.mod);
        clear=findViewById(R.id.clear);
        dot=findViewById(R.id.dot);
        equal=findViewById(R.id.equal);
        intxt =findViewById(R.id.intxt);
        outtxt =findViewById(R.id.outtxt);


    }
    private void click(){

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intxt.setText("");
                outtxt.setText("");
            }
        });
//           numbers
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + "9");
            }
        });
//             operations
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
             //   intxt.setText(input + "+");
               if(!(intxt.getText().toString()).equals("")){
                   setFalse();
                   ADD=true;
                   res11();
                   intxt.setText(input + "+");
                 //  intxt.setText("");
               }
               else{
                   Toast.makeText(MainActivity.this, "invalid syntax", Toast.LENGTH_SHORT).show();
               }

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
//                intxt.setText(input + "-");
                if(!(intxt.getText().toString()).equals("")){
                    setFalse();
                    SUB=true;
                    res11();
                    intxt.setText(input + "-");
                }
                else{
                    Toast.makeText(MainActivity.this, "invalid syntax", Toast.LENGTH_SHORT).show();
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String input = intxt.getText().toString();
//                intxt.setText(input + "*");
                if(!(intxt.getText().toString()).equals("")){
                    setFalse();
                    MUL=true;
                    res11();
                    intxt.setText(input + "x");
                }
                else{
                    Toast.makeText(MainActivity.this, "invalid syntax", Toast.LENGTH_SHORT).show();
                }
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String input = intxt.getText().toString();
//                intxt.setText(input + "/");
                if(!(intxt.getText().toString()).equals("")){
                    setFalse();
                    DIV=true;
                    res11();
                    intxt.setText(input + "/");
                }
                else{
                    Toast.makeText(MainActivity.this, "invalid syntax", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String input = intxt.getText().toString();
//                intxt.setText(input + "%");
                if(!(intxt.getText().toString()).equals("")){
                    setFalse();
                    MOD=true;
                    res11();
                    intxt.setText(input + "%");
                }
                else{
                    Toast.makeText(MainActivity.this, "invalid syntax", Toast.LENGTH_SHORT).show();
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = intxt.getText().toString();
                intxt.setText(input + ".");
            }
        });

        //main funtioning of equal method
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  String input = intxt.getText().toString();
                String input =secRes((intxt.getText().toString()).toCharArray());
                Log.d("hellllllllllll0",input);

                if(ADD){
                    finalRes = res1+Integer.parseInt(input);
                    outtxt.setText(String.valueOf(finalRes));
                    setFalse();
                }
                else if (SUB){
                    finalRes = res1-Integer.parseInt(input);
                    outtxt.setText(String.valueOf(finalRes));
                    setFalse();
                }
                else if (MUL){
                    finalRes = res1*Integer.parseInt(input);
                    outtxt.setText(String.valueOf(finalRes));
                    setFalse();
                }
                else if (DIV){
                    finalRes = res1/Float.parseFloat(input);
                    outtxt.setText(String.valueOf(finalRes));
                    setFalse();
                }
                else if (MOD){

                    finalRes = (res1)/100;
                    outtxt.setText(String.valueOf(finalRes));
                    setFalse();
                }
                else{
                    intxt.setText(outtxt.getText().toString());
                }


            }
        });

    }
    String secRes(char[] a) {

        res = new ArrayList<Character>();
        char[] secPart;
        String s;

        boolean bl=false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '+' || a[i] == '-' || a[i] == 'x' ||a[i] == '/'||a[i] == '%') {
                bl=true;
                continue;
            }
            if (bl){
                res.add(a[i]);
               }
        }
        secPart = new char[res.size()];
        for (int i = 0; i < res.size(); i++) {
            secPart[i]=res.get(i);
        }
         s = new String(secPart);
        Log.d("string inside ",s);
         return s ;
    }


}