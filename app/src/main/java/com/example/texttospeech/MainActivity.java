package com.example.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6;
    TextView textView1, textView2, textView3, textView4, textView5, textView6;
    TextToSpeech textToSpeech;


    @Override
    protected void onDestroy() {

        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }

        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        /*button6 = findViewById(R.id.btn6);*/

        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
        textView3 = findViewById(R.id.text3);
        textView4 = findViewById(R.id.text4);
        textView5 = findViewById(R.id.text5);
        /*textView6 = findViewById(R.id.text6);*/


        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.UK);

                }
            }
        });
        // For first text to speach

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tospeak = textView1.getText().toString();
                /*Toast.makeText(getApplicationContext(), tospeak, Toast.LENGTH_LONG).show();*/
                textToSpeech.speak(tospeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // For second text to speach

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tospeak = textView2.getText().toString();
                /*Toast.makeText(getApplicationContext(), tospeak, Toast.LENGTH_LONG).show();*/
                textToSpeech.speak(tospeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        // For third text to speach

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tospeak = textView3.getText().toString();
               /* Toast.makeText(getApplicationContext(), tospeak, Toast.LENGTH_LONG).show();*/
                textToSpeech.speak(tospeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // For 4th text to speach

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tospeak = textView4.getText().toString();
               /* Toast.makeText(getApplicationContext(), tospeak, Toast.LENGTH_LONG).show();*/
                textToSpeech.speak(tospeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        // For 5th text to speach

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tospeak = textView5.getText().toString();
              /*  Toast.makeText(getApplicationContext(), tospeak, Toast.LENGTH_LONG).show();*/
                textToSpeech.speak(tospeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }}