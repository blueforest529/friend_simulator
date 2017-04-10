package kr.hs.e_mirim.cheong.yebonlee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "이예본 : Main";
    private ImageView mimageViewFriendVisual;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "메소드 호출");
        setContentView(R.layout.activity_main);
        mimageViewFriendVisual = (ImageView)findViewById(R.id.friend_visual);
        Log.d(TAG, "레이아웃 세팅");

    }
    void onClick(View view){
        Log.d(TAG, "메소드 호출");
        Log.d(TAG, "클릭된 view id"+view.getId());
        switch (view.getId()){
            case  R.id.button1 :
                Log.d(TAG, "1 호출");
                Toast.makeText(this,"이이~!~",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.button2 :
                Log.d(TAG, "2 호출");
                Toast.makeText(this,"방구마려워",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.button3 :
                Log.d(TAG, "3 호출");
                Toast.makeText(this,"집가고 싶다",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.button4 :
                Log.d(TAG, "4 호출");
                Toast.makeText(this,"청아 뭐해?",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.button5 :
                Log.d(TAG, "5 호출");
                Toast.makeText(this,"예보니아",Toast.LENGTH_SHORT).show();
                break;
           default:
               Log.d(TAG, "모르는 녀석 클릭");
               Toast.makeText(this,"뭐라는 지 모르겠음~",Toast.LENGTH_SHORT).show();

        }

    }
}