package kr.hs.e_mirim.cheong.yebonlee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    void onClick(View view){
        switch (view.getId()){
            case  R.id.button1 :
                Toast.makeText(this,"이이~!~",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.button2 :
                Toast.makeText(this,"방구마려워",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.button3 :
                Toast.makeText(this,"집가고 싶다",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.button4 :
                Toast.makeText(this,"청아 뭐해?",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.button5 :
                Toast.makeText(this,"예보니아",Toast.LENGTH_SHORT).show();
                break;
           default: Toast.makeText(this,"뭐라는 지 모르겠음~",Toast.LENGTH_SHORT).show();

        }

    }
}