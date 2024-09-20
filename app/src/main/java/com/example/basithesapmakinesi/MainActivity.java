package com.example.basithesapmakinesi;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtbirincisayi, editTxtikincisayi;
    private TextView textviewsonuc;
    String sayibir, sayiiki; // bunula gelen nesnenin boş olup olmadığını kontrol et.
    Integer s1,s2, sonuc;
    private hesapla hesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtbirincisayi=findViewById(R.id.editTextbirincisayi);
        editTxtikincisayi=  findViewById(R.id.editTxtikincisayi);
        textviewsonuc= findViewById(R.id.textviewsonuc);




    }
    public void btnhesapla(View v){

        // kullanıcının girmiş olduğu değerleri al
        sayibir= editTxtbirincisayi.getText().toString();
        sayiiki= editTxtikincisayi.getText().toString();

        // boş olup olmadığını kontrol et.birinci ve ikinci sayı boş değilse bunun içine gir.
        if(!TextUtils.isEmpty(sayibir) && !TextUtils.isEmpty(sayiiki)) {
            s1=Integer.valueOf(sayibir);
            s2= Integer.valueOf(sayiiki);
            hesapla= new hesapla(s1,s2);

            // hoca burda switch kullandı ve hata verdi o yüzden if else
            if(v.getId()==R.id.btntopla){
                sonuc=hesapla.toplam();

            }
            else if(v.getId()==R.id.btncikar){
                sonuc=hesapla.cikar();
            }

            else if(v.getId()==R.id.btnböl){
                sonuc=hesapla.böl();
            }
            else if(v.getId()==R.id.btncarp){
                sonuc=hesapla.carp();
            }


            textviewsonuc.setText("sonuc=" +sonuc);




        }
        else
            textviewsonuc.setText("girilen değerler boş olamaz");



    }
}