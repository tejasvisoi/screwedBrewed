package com.example.screwedbrewed;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import org.w3c.dom.Text;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int i = 1, j = 1, k = 1, l = 1, m = 1;
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnice();
        addListenerOnbrew();
    }

    private void addListenerOnButton() {

        final Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Button button01 = (Button) findViewById(R.id.button01);
                Button minus = (Button) findViewById(R.id.minus);
                Button plus = (Button) findViewById(R.id.plus);
                TextView myTextView = (TextView) findViewById(R.id.myTextView1);
                myTextView.setVisibility(View.VISIBLE);
                minus.setVisibility(View.VISIBLE);
                plus.setVisibility(View.VISIBLE);
                button01.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
                myTextView.setText("" + 1);
                addListenerOnplus();
                addListenerOnminus();
                addListenerOnice();
                addListenerOnbrew();
            }

        });
    }

    private void addListenerOnplus() {

        Button plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView1);
                i++;
                myTextView.setText("" + i);
            }
        });
    }

    private void addListenerOnminus() {

        Button plus = (Button) findViewById(R.id.minus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView1);
                if (i != 0) {
                i--;
                myTextView.setText("" + i);
            }
            }
        });
    }

    private void addListenerOnButton1() {

        final Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Button button02 = (Button) findViewById(R.id.button02);
                Button minus = (Button) findViewById(R.id.minus1);
                Button plus = (Button) findViewById(R.id.plus1);
                TextView myTextView = (TextView) findViewById(R.id.myTextView2);
                myTextView.setVisibility(View.VISIBLE);
                minus.setVisibility(View.VISIBLE);
                plus.setVisibility(View.VISIBLE);
                button02.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
                myTextView.setText("" + 1);
                addListenerOnplus1();
                addListenerOnminus1();
            }

        });
    }

    private void addListenerOnplus1() {

        Button plus = (Button) findViewById(R.id.plus1);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView2);
                j++;
                myTextView.setText("" + j);
            }
        });
    }

    private void addListenerOnminus1() {

        Button plus = (Button) findViewById(R.id.minus1);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView2);
                j--;
                myTextView.setText("" + j);
            }
        });
    }

    private void addListenerOnButton2() {
        final Button button = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Button button02 = (Button) findViewById(R.id.button03);
                Button minus = (Button) findViewById(R.id.minus2);
                Button plus = (Button) findViewById(R.id.plus2);
                TextView myTextView = (TextView) findViewById(R.id.myTextView3);
                myTextView.setVisibility(View.VISIBLE);
                minus.setVisibility(View.VISIBLE);
                plus.setVisibility(View.VISIBLE);
                button02.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
                myTextView.setText("" + 1);
                addListenerOnplus2();
                addListenerOnminus2();
            }

        });
    }

    private void addListenerOnplus2() {

        Button plus = (Button) findViewById(R.id.plus2);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView3);
                k++;
                myTextView.setText("" + k);
            }
        });
    }

    private void addListenerOnminus2() {

        Button plus = (Button) findViewById(R.id.minus2);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView3);
                k--;
                myTextView.setText("" + k);
            }
        });
    }

    private void addListenerOnButton3() {
        final Button button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Button button02 = (Button) findViewById(R.id.button04);
                Button minus = (Button) findViewById(R.id.minus3);
                Button plus = (Button) findViewById(R.id.plus3);
                TextView myTextView = (TextView) findViewById(R.id.myTextView4);
                myTextView.setVisibility(View.VISIBLE);
                minus.setVisibility(View.VISIBLE);
                plus.setVisibility(View.VISIBLE);
                button02.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
                myTextView.setText("" + 1);
                addListenerOnplus3();
                addListenerOnminus3();
            }

        });
    }

    private void addListenerOnplus3() {

        Button plus = (Button) findViewById(R.id.plus3);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView4);
                l++;
                myTextView.setText("" + l);
            }
        });
    }

    private void addListenerOnminus3() {

        Button plus = (Button) findViewById(R.id.minus3);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView4);
                l--;
                myTextView.setText("" + l);
            }
        });
    }

    private void addListenerOnButton4() {

        final Button button = (Button) findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Button button02 = (Button) findViewById(R.id.button05);
                Button minus = (Button) findViewById(R.id.minus4);
                Button plus = (Button) findViewById(R.id.plus4);
                TextView myTextView = (TextView) findViewById(R.id.myTextView5);
                myTextView.setVisibility(View.VISIBLE);
                minus.setVisibility(View.VISIBLE);
                plus.setVisibility(View.VISIBLE);
                button02.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
                myTextView.setText("" + 1);
                addListenerOnplus4();
                addListenerOnminus4();
            }

        });
    }

    private void addListenerOnplus4() {

        Button plus = (Button) findViewById(R.id.plus4);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView5);
                m++;
                myTextView.setText("" + m);
            }
        });
    }

    private void addListenerOnminus4() {

        Button plus = (Button) findViewById(R.id.minus4);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView myTextView = (TextView) findViewById(R.id.myTextView5);
                m--;
                myTextView.setText("" + m);
            }
        });
    }

    public void move(){

        ImageView image = (ImageView)findViewById(R.id.yello);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        image.startAnimation(animation1);

    }
    public void move1(){

        ImageView image = (ImageView)findViewById(R.id.yello1);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move1);
        image.startAnimation(animation1);
    }
    private void addListenerOnice() {

        final Button button = (Button) findViewById(R.id.ice);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                View hot1 = (View) findViewById(R.id.hot1);
                View hot = (View) findViewById(R.id.hot);
                View cold1 = (View) findViewById(R.id.cold1);
                View cold = (View) findViewById(R.id.cold);
                View dark1 = (View) findViewById(R.id.dark1);
                ImageView yello = (ImageView) findViewById(R.id.yello);
                ImageView yello1 = (ImageView) findViewById(R.id.yello1);
                View bottom = (View) findViewById(R.id.bottom);
                View bottom1 = (View) findViewById(R.id.bottom1);
                bottom1.setVisibility(View.VISIBLE);
                bottom.setVisibility(View.INVISIBLE);
                yello.setVisibility(View.INVISIBLE);
                yello1.setVisibility(View.VISIBLE);
                dark1.setVisibility(View.VISIBLE);
                hot.setVisibility(View.INVISIBLE);
                hot1.setVisibility(View.VISIBLE);
                cold1.setVisibility(View.VISIBLE);
                cold.setVisibility(View.INVISIBLE);
                move();
            }
        });
    }
    private void addListenerOnbrew() {

        final Button button = (Button) findViewById(R.id.brew);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                View hot1 = (View) findViewById(R.id.hot1);
                View hot = (View) findViewById(R.id.hot);
                View dark = (View) findViewById(R.id.dark);
                View cold1 = (View) findViewById(R.id.cold1);
                View cold = (View) findViewById(R.id.cold);
                ImageView yello = (ImageView) findViewById(R.id.yello);
                ImageView yello1 = (ImageView) findViewById(R.id.yello1);
                View bottom = (View) findViewById(R.id.bottom);
                View bottom1 = (View) findViewById(R.id.bottom1);
                hot1.setVisibility(View.INVISIBLE);
                hot.setVisibility(View.VISIBLE);
                cold1.setVisibility(View.INVISIBLE);
                cold.setVisibility(View.VISIBLE);
                bottom1.setVisibility(View.INVISIBLE);
                bottom.setVisibility(View.VISIBLE);
                dark.setVisibility(View.VISIBLE);
                yello.setVisibility(View.VISIBLE);
                yello1.setVisibility(View.INVISIBLE);
                move1();
            }
        });
    }
}
