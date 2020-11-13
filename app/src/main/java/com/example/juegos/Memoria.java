package com.example.juegos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Memoria extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewScore1;
    private TextView textViewScore2;
    private TextView textViewTurno;
    private TextView textViewLoser;
    private Button buttonA;
    private Button buttonB;
    private Button buttonC;
    private Button buttonD;
    private Button buttonE;
    private Button buttonF;
    private Button buttonG;
    private Button buttonH;
    private Button buttonI;
    private Button buttonRestart;
    private Button buttonMenu2;
    private int teclas = 0;
    private int turno = 0;
    private String player1, player2;
    private List<Button> letrasp1 = new ArrayList<>();
    private List<Button> letrasp2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria);

        this.textViewScore1 = findViewById(R.id.textViewScore1);
        this.textViewScore2 = findViewById(R.id.textViewScore2);
        this.textViewTurno = findViewById(R.id.textViewTurno);
        this.textViewLoser = findViewById(R.id.textViewLoser);

        this.buttonA = findViewById(R.id.buttonA);
        this.buttonB = findViewById(R.id.buttonB);
        this.buttonC = findViewById(R.id.buttonC);
        this.buttonD = findViewById(R.id.buttonD);
        this.buttonE = findViewById(R.id.buttonE);
        this.buttonF = findViewById(R.id.buttonF);
        this.buttonG = findViewById(R.id.buttonG);
        this.buttonH = findViewById(R.id.buttonH);
        this.buttonI = findViewById(R.id.buttonI);
        this.buttonRestart = findViewById(R.id.buttonRestart);
        this.buttonMenu2 = findViewById(R.id.buttonMenu2);

        Bundle bundle= getIntent().getExtras();
        if(bundle != null){
            player1 = bundle.getString("name1");
            player2 = bundle.getString("name2");
        }

        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonG.setOnClickListener(this);
        buttonH.setOnClickListener(this);
        buttonI.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        teclas++;
        System.out.println(teclas);
        if(teclas == 1){
            game(teclas, player1, v);
        }else if (teclas == 2 || teclas == 3){
            game(teclas, player2, v);
        }

    }

    public void game (int c, String name, View view){

        if (name == player1){
            switch (view.getId()){
                case R.id.buttonA:{
                    letrasp1.add(buttonA);
                    System.out.println("A");
                    break;
                }
                case R.id.buttonB:{
                    letrasp1.add(buttonB);
                    System.out.println("B");
                    break;
                }
                case R.id.buttonC:{
                    letrasp1.add(buttonC);
                    System.out.println("C");
                    break;
                }
                case R.id.buttonD:{
                    letrasp1.add(buttonD);
                    System.out.println("D");
                    break;
                }
                case R.id.buttonE:{
                    letrasp1.add(buttonE);
                    System.out.println("E");
                    break;
                }
                case R.id.buttonF:{
                    letrasp1.add(buttonF);
                    System.out.println("F");
                    break;
                }
                case R.id.buttonG:{
                    letrasp1.add(buttonG);
                    System.out.println("G");
                    break;
                }
                case R.id.buttonH:{
                    letrasp1.add(buttonH);
                    System.out.println("H");
                    break;
                }
                case R.id.buttonI:{
                    letrasp1.add(buttonI);
                    System.out.println("I");
                    break;
                }
                default:break;

            }
            for (int i = 0; i<letrasp1.size(); i++){
                System.out.println(letrasp1);
            }
        }else if(name == player2){
            switch (view.getId()){
                case R.id.buttonA:{
                    letrasp2.add(buttonA);
                    System.out.println("A");
                    break;
                }
                case R.id.buttonB:{
                    letrasp2.add(buttonB);
                    break;
                }
                case R.id.buttonC:{
                    letrasp2.add(buttonC);
                    break;
                }
                case R.id.buttonD:{
                    letrasp2.add(buttonD);
                    break;
                }
                case R.id.buttonE:{
                    letrasp2.add(buttonE);
                    break;
                }
                case R.id.buttonF:{
                    letrasp2.add(buttonF);
                    break;
                }
                case R.id.buttonG:{
                    letrasp2.add(buttonG);
                    break;
                }
                case R.id.buttonH:{
                    letrasp2.add(buttonH);
                    break;
                }
                case R.id.buttonI:{
                    letrasp2.add(buttonI);
                    break;
                }
                default:break;
            }
        }

    }
}