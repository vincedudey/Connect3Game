package com.example.connect3game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean player1 = true;
    ImageView red1, red2, red3, red4, red5, red6, red7, red8, red9;
    ImageView yellow1, yellow2, yellow3, yellow4, yellow5, yellow6, yellow7, yellow8, yellow9;
    char [] setCell = {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'};
    TextView txt;
    Button b;
    boolean winOrTie = false;

    public void toastNotice(){
        if(winOrTie)
            Toast.makeText(this, "Please start a new game!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Please select a new cell!", Toast.LENGTH_SHORT).show();
    }

    public void isWinner(boolean player){
        if(setCell[0]!='X' && setCell[0] == setCell[1] && setCell[1] == setCell[2])declareWinner(player);
        else if(setCell[3]!='X' && setCell[3] == setCell[4] && setCell[4] == setCell[5])declareWinner(player);
        else if(setCell[6]!='X' && setCell[6] == setCell[7] && setCell[7] == setCell[8])declareWinner(player);
        else if(setCell[0]!='X' && setCell[0] == setCell[3] && setCell[3] == setCell[6])declareWinner(player);
        else if(setCell[1]!='X' && setCell[1] == setCell[4] && setCell[4] == setCell[7])declareWinner(player);
        else if(setCell[2]!='X' && setCell[2] == setCell[5] && setCell[5] == setCell[8])declareWinner(player);
        else if(setCell[0]!='X' && setCell[0] == setCell[4] && setCell[4] == setCell[8])declareWinner(player);
        else if(setCell[2]!='X' && setCell[2] == setCell[4] && setCell[4] == setCell[6])declareWinner(player);
    }

    public void declareWinner(boolean player){
        if(player) txt.setText("Red has won!");
        else txt.setText("Yellow has won!");
        txt.animate().alpha(1).setDuration(3000);//.setAlpha(1);
        b.animate().alpha(1).setDuration(3000);
        winOrTie = true;
    }

    public void isTie(){
        int filled = 0;
        for(char c: setCell){
            if(c != 'X')++filled;
        }

        if(filled==9){
            txt.setText("Tie!");
            txt.animate().alpha(1).setDuration(3000);
            b.animate().alpha(1).setDuration(3000);
            winOrTie = true;
        }
    }

    public void update00(View view){
        if(setCell[0]=='X' && !winOrTie){
            if(player1)red1.animate().alpha(1).translationY(0).setDuration(1000);
            else yellow1.animate().alpha(1).translationY(0).setDuration(1000);

            if(player1) setCell[0]='R';
            else setCell[0]='Y';

            isWinner(player1);
            isTie();
            player1 = !player1;
        }
        else toastNotice();
    }

    public void update01(View view){
        if(setCell[1]=='X' && !winOrTie){
            if(player1)red2.animate().alpha(1).translationY(0).setDuration(1000);
            else yellow2.animate().alpha(1).translationY(0).setDuration(1000);

            if(player1) setCell[1]='R';
            else setCell[1]='Y';

            isWinner(player1);
            isTie();
            player1 = !player1;
        }
        else toastNotice();
    }

    public void update02(View view){
        if(setCell[2]=='X' && !winOrTie){
            if(player1)red3.animate().alpha(1).translationY(0).setDuration(1000);
            else yellow3.animate().alpha(1).translationY(0).setDuration(1000);

            if(player1) setCell[2]='R';
            else setCell[2]='Y';

            isWinner(player1);
            isTie();
            player1 = !player1;
        }
        else toastNotice();
    }

    public void update10(View view){
        if(setCell[3]=='X' && !winOrTie){
            if(player1)red4.animate().alpha(1).translationY(0).setDuration(1000);
            else yellow4.animate().alpha(1).translationY(0).setDuration(1000);

            if(player1) setCell[3]='R';
            else setCell[3]='Y';

            isWinner(player1);
            isTie();
            player1 = !player1;
        }
        else toastNotice();
    }

    public void update11(View view){
        if(setCell[4]=='X' && !winOrTie){
            if(player1)red5.animate().alpha(1).translationY(0).setDuration(1000);
            else yellow5.animate().alpha(1).translationY(0).setDuration(1000);

            if(player1) setCell[4]='R';
            else setCell[4]='Y';

            isWinner(player1);
            isTie();
            player1 = !player1;
        }
        else toastNotice();
    }

    public void update12(View view){
        if(setCell[5]=='X' && !winOrTie){
            if(player1)red6.animate().alpha(1).translationY(0).setDuration(1000);
            else yellow6.animate().alpha(1).translationY(0).setDuration(1000);

            if(player1) setCell[5]='R';
            else setCell[5]='Y';

            isWinner(player1);
            isTie();
            player1 = !player1;
        }
        else toastNotice();
    }

    public void update20(View view){
        if(setCell[6]=='X' && !winOrTie){
            if(player1)red7.animate().alpha(1).translationY(0).setDuration(1000);
            else yellow7.animate().alpha(1).translationY(0).setDuration(1000);

            if(player1) setCell[6]='R';
            else setCell[6]='Y';

            isWinner(player1);
            isTie();
            player1 = !player1;
        }
        else toastNotice();
    }

    public void update21(View view){
        if(setCell[7]=='X' && !winOrTie){
            if(player1)red8.animate().alpha(1).translationY(0).setDuration(1000);
            else yellow8.animate().alpha(1).translationY(0).setDuration(1000);

            if(player1) setCell[7]='R';
            else setCell[7]='Y';

            isWinner(player1);
            isTie();
            player1 = !player1;
        }
        else toastNotice();
    }

    public void update22(View view) {
        if (setCell[8] == 'X' && !winOrTie) {
            if (player1) red9.animate().alpha(1).translationY(0).setDuration(1000);
            else yellow9.animate().alpha(1).translationY(0).setDuration(1000);

            if (player1) setCell[8] = 'R';
            else setCell[8] = 'Y';

            isWinner(player1);
            isTie();
            player1 = !player1;
        } else toastNotice();
    }

    public void resetBoard(View view){
        red1 = (ImageView)findViewById(R.id.imageView1); red1.animate().translationY(-1500).setDuration(1000);
        red2 = (ImageView)findViewById(R.id.imageView2); red2.animate().translationY(-1500).setDuration(1000);
        red3 = (ImageView)findViewById(R.id.imageView3); red3.animate().translationY(-1500).setDuration(1000);
        red4 = (ImageView)findViewById(R.id.imageView4); red4.animate().translationY(-1500).setDuration(1000);
        red5 = (ImageView)findViewById(R.id.imageView5); red5.animate().translationY(-1500).setDuration(1000);
        red6 = (ImageView)findViewById(R.id.imageView6); red6.animate().translationY(-1500).setDuration(1000);
        red7 = (ImageView)findViewById(R.id.imageView7); red7.animate().translationY(-1500).setDuration(1000);
        red8 = (ImageView)findViewById(R.id.imageView8); red8.animate().translationY(-1500).setDuration(1000);
        red9 = (ImageView)findViewById(R.id.imageView9); red9.animate().translationY(-1500).setDuration(1000);

        yellow1 = (ImageView)findViewById(R.id.imageView11); yellow1.animate().translationY(-1500).setDuration(1000);
        yellow2 = (ImageView)findViewById(R.id.imageView12); yellow2.animate().translationY(-1500).setDuration(1000);
        yellow3 = (ImageView)findViewById(R.id.imageView13); yellow3.animate().translationY(-1500).setDuration(1000);
        yellow4 = (ImageView)findViewById(R.id.imageView14); yellow4.animate().translationY(-1500).setDuration(1000);
        yellow5 = (ImageView)findViewById(R.id.imageView15); yellow5.animate().translationY(-1500).setDuration(1000);
        yellow6 = (ImageView)findViewById(R.id.imageView16); yellow6.animate().translationY(-1500).setDuration(1000);
        yellow7 = (ImageView)findViewById(R.id.imageView17); yellow7.animate().translationY(-1500).setDuration(1000);
        yellow8 = (ImageView)findViewById(R.id.imageView18); yellow8.animate().translationY(-1500).setDuration(1000);
        yellow9 = (ImageView)findViewById(R.id.imageView19); yellow9.animate().translationY(-1500).setDuration(1000);

        for(int i=0; i<setCell.length; ++i)
            setCell[i] = 'X';

        txt.setAlpha(0);
        b.setAlpha(0);
        winOrTie = false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.textView);
        b = (Button)findViewById(R.id.button);

        red1 = (ImageView)findViewById(R.id.imageView1); red1.setY(-1500);
        red2 = (ImageView)findViewById(R.id.imageView2); red2.setY(-1500);
        red3 = (ImageView)findViewById(R.id.imageView3); red3.setY(-1500);
        red4 = (ImageView)findViewById(R.id.imageView4); red4.setY(-1500);
        red5 = (ImageView)findViewById(R.id.imageView5); red5.setY(-1500);
        red6 = (ImageView)findViewById(R.id.imageView6); red6.setY(-1500);
        red7 = (ImageView)findViewById(R.id.imageView7); red7.setY(-1500);
        red8 = (ImageView)findViewById(R.id.imageView8); red8.setY(-1500);
        red9 = (ImageView)findViewById(R.id.imageView9); red9.setY(-1500);

        yellow1 = (ImageView)findViewById(R.id.imageView11); yellow1.setY(-1500);
        yellow2 = (ImageView)findViewById(R.id.imageView12); yellow2.setY(-1500);
        yellow3 = (ImageView)findViewById(R.id.imageView13); yellow3.setY(-1500);
        yellow4 = (ImageView)findViewById(R.id.imageView14); yellow4.setY(-1500);
        yellow5 = (ImageView)findViewById(R.id.imageView15); yellow5.setY(-1500);
        yellow6 = (ImageView)findViewById(R.id.imageView16); yellow6.setY(-1500);
        yellow7 = (ImageView)findViewById(R.id.imageView17); yellow7.setY(-1500);
        yellow8 = (ImageView)findViewById(R.id.imageView18); yellow8.setY(-1500);
        yellow9 = (ImageView)findViewById(R.id.imageView19); yellow9.setY(-1500);
    }
}
