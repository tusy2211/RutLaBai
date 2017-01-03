package helloworld.cse.khanh.rutlabai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgLaBai;
    Button btnRutBai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgLaBai = (ImageView) findViewById(R.id.imageViewLaBai);
        btnRutBai = (Button) findViewById(R.id.buttonRutBai);

        btnRutBai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> mangLaBai = new ArrayList<Integer>();
                mangLaBai.add(R.drawable.c1);
                mangLaBai.add(R.drawable.c2);
                mangLaBai.add(R.drawable.c3);
                mangLaBai.add(R.drawable.c4);
                mangLaBai.add(R.drawable.c5);
                mangLaBai.add(R.drawable.c6);
                mangLaBai.add(R.drawable.c7);
                mangLaBai.add(R.drawable.c8);
                mangLaBai.add(R.drawable.c9);
                mangLaBai.add(R.drawable.c10);
                mangLaBai.add(R.drawable.cj);
                mangLaBai.add(R.drawable.ck);
                mangLaBai.add(R.drawable.cq);
                mangLaBai.add(R.drawable.b1fv);
                Random r = new Random();
                int batky = r.nextInt(mangLaBai.size());
                imgLaBai.setImageResource(mangLaBai.get(batky));

            }
        });
    }
}
