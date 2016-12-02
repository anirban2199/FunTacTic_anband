package com.example.funtactic;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset,blue;
	TextView t1,p1,p2;
	int c=0,flag=0;
    int p1s=0,p2s=0;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i=new Intent(MainActivity.this,Home.class);
        startActivity(i);
        setContentView(R.layout.activity_main);

        b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);
        b6= (Button) findViewById(R.id.button6);
        b7= (Button) findViewById(R.id.button7);
        b8= (Button) findViewById(R.id.button8);
        b9= (Button) findViewById(R.id.button9);
        reset = (Button) findViewById(R.id.reset_button);
        t1= (TextView) findViewById(R.id.textView1);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        p1      = (TextView) findViewById(R.id.p1s);
        p2      = (TextView) findViewById(R.id.p2s);
        p1.setText("0");
        p2.setText("0");
        blue = (Button) findViewById(R.id.bluetooth);
        blue.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity1.class);
                startActivity(in);

            }
        });
      }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void onReset(View arg0) {
                t1.setText("Player 1's turn");
    			c=0;
                flag=0;
   				b1.setText(null);
				b1.setEnabled(true);
				b1.setBackground(getResources().getDrawable(R.drawable.d));
				b2.setText(null);
				b2.setEnabled(true);
				b2.setBackground(getResources().getDrawable(R.drawable.d));
				b3.setText(null);
				b3.setEnabled(true);
				b3.setBackground(getResources().getDrawable(R.drawable.d));
				b4.setText(null);
				b4.setEnabled(true);
				b4.setBackground(getResources().getDrawable(R.drawable.d));
				b5.setText(null);
				b5.setEnabled(true);
				b5.setBackground(getResources().getDrawable(R.drawable.d));
				b6.setText(null);
				b6.setEnabled(true);
				b6.setBackground(getResources().getDrawable(R.drawable.d));
				b7.setText(null);
				b7.setEnabled(true);
				b7.setBackground(getResources().getDrawable(R.drawable.d));
				b8.setText(null);
				b8.setEnabled(true);
				b8.setBackground(getResources().getDrawable(R.drawable.d));
				b9.setText(null);
				b9.setEnabled(true);
				b9.setBackground(getResources().getDrawable(R.drawable.d));
    	}
    
	@Override
	public void onClick(View arg0) {
		if(arg0 instanceof Button) {
			Button B= (Button) arg0;	
			if(t1.getText().toString().equals("Player 1's turn")) {
				B.setText("X");
				c++;
				B.setBackground(getResources().getDrawable(R.drawable.x));
				t1.setText("Player 2's turn");
				B.setEnabled(false);
				winCondn(B);
			}
			else
			{
				t1.setText("Player 1's turn");
				B.setText("O");
				c++;
				B.setBackground(getResources().getDrawable(R.drawable.o));
				B.setEnabled(false);
				winCondn(B);
			}
		}
	}

	public void winCondn(Button B) {
			if(b1.getText().toString().equals("X") && b2.getText().toString().equals("X")&& b3.getText().toString().equals("X")) {
				flag=1;
                p1s++;
                t1.setText("Congratulations!\nPlayer 1 has won the match");
                b1.setBackground(getResources().getDrawable(R.drawable.xhl));
                b2.setBackground(getResources().getDrawable(R.drawable.xhl));
                b3.setBackground(getResources().getDrawable(R.drawable.xhl));
				disable();
			}
			else if(b4.getText().toString().equals("X") && b5.getText().toString().equals("X")&& b6.getText().toString().equals("X")) {
				flag=1;
                p1s++;
                t1.setText("Congratulations!\nPlayer 1 has won the match");
                b4.setBackground(getResources().getDrawable(R.drawable.xhl));
                b5.setBackground(getResources().getDrawable(R.drawable.xhl));
                b6.setBackground(getResources().getDrawable(R.drawable.xhl));
                disable();
			}
			else if(b7.getText().toString().equals("X") && b8.getText().toString().equals("X")&& b9.getText().toString().equals("X")) {
				flag=1;
                p1s++;
                t1.setText("Congratulations!\nPlayer 1 has won the match");
                b7.setBackground(getResources().getDrawable(R.drawable.xhl));
                b8.setBackground(getResources().getDrawable(R.drawable.xhl));
                b9.setBackground(getResources().getDrawable(R.drawable.xhl));
                disable();
				}
			else if(b1.getText().toString().equals("X") && b4.getText().toString().equals("X")&& b7.getText().toString().equals("X")) {
				flag=1;
                p1s++;
                t1.setText("Congratulations!\nPlayer 1 has won the match");
                b1.setBackground(getResources().getDrawable(R.drawable.xvl));
                b4.setBackground(getResources().getDrawable(R.drawable.xvl));
                b7.setBackground(getResources().getDrawable(R.drawable.xvl));
                disable();
			}
			else if(b2.getText().toString().equals("X") && b5.getText().toString().equals("X")&& b8.getText().toString().equals("X")) {
				flag=1;
                p1s++;
                t1.setText("Congratulations!\nPlayer 1 has won the match");
                b2.setBackground(getResources().getDrawable(R.drawable.xvl));
                b5.setBackground(getResources().getDrawable(R.drawable.xvl));
                b8.setBackground(getResources().getDrawable(R.drawable.xvl));
                disable();
				}
			else if(b3.getText().toString().equals("X") && b6.getText().toString().equals("X")&& b9.getText().toString().equals("X")) {
				flag=1;
                p1s++;
                t1.setText("Congratulations!\nPlayer 1 has won the match");
                b3.setBackground(getResources().getDrawable(R.drawable.xvl));
                b6.setBackground(getResources().getDrawable(R.drawable.xvl));
                b9.setBackground(getResources().getDrawable(R.drawable.xvl));
                disable();
			}
			else if(b1.getText().toString().equals("X") && b5.getText().toString().equals("X")&& b9.getText().toString().equals("X")) {
				flag=1;
                p1s++;
                t1.setText("Congratulations!\nPlayer 1 has won the match");
                b1.setBackground(getResources().getDrawable(R.drawable.xrd));
                b5.setBackground(getResources().getDrawable(R.drawable.xrd));
                b9.setBackground(getResources().getDrawable(R.drawable.xrd));
                disable();
			}
			else if(b3.getText().toString().equals("X") && b5.getText().toString().equals("X")&& b7.getText().toString().equals("X")) {
				flag=1;
                p1s++;
                t1.setText("Congratulations!\nPlayer 1 has won the match");
                b3.setBackground(getResources().getDrawable(R.drawable.xld));
                b5.setBackground(getResources().getDrawable(R.drawable.xld));
                b7.setBackground(getResources().getDrawable(R.drawable.xld));
                disable();
			}
			else if(b1.getText().toString().equals("O") && b2.getText().toString().equals("O")&& b3.getText().toString().equals("O")) {
				flag=2;
                p2s++;
                t1.setText("Congratulations!\nPlayer 2 has won the match");
                b1.setBackground(getResources().getDrawable(R.drawable.ohl));
                b2.setBackground(getResources().getDrawable(R.drawable.ohl));
                b3.setBackground(getResources().getDrawable(R.drawable.ohl));
                disable();
			}
			else if(b4.getText().toString().equals("O") && b5.getText().toString().equals("O")&& b6.getText().toString().equals("O")) {
				flag=2;
                p2s++;
                t1.setText("Congratulations!\nPlayer 2 has won the match");
                b4.setBackground(getResources().getDrawable(R.drawable.ohl));
                b5.setBackground(getResources().getDrawable(R.drawable.ohl));
                b6.setBackground(getResources().getDrawable(R.drawable.ohl));
                disable();
			}
			else if(b7.getText().toString().equals("O") && b8.getText().toString().equals("O")&& b9.getText().toString().equals("O")) {
				flag=2;
                p2s++;
                t1.setText("Congratulations!\nPlayer 2 has won the match");
                b7.setBackground(getResources().getDrawable(R.drawable.ohl));
                b8.setBackground(getResources().getDrawable(R.drawable.ohl));
                b9.setBackground(getResources().getDrawable(R.drawable.ohl));
                disable();
				}
			else if(b1.getText().toString().equals("O") && b4.getText().toString().equals("O")&& b7.getText().toString().equals("O")) {
				flag=2;
                p2s++;
                t1.setText("Congratulations!\nPlayer 2 has won the match");
                b1.setBackground(getResources().getDrawable(R.drawable.ovl));
                b4.setBackground(getResources().getDrawable(R.drawable.ovl));
                b7.setBackground(getResources().getDrawable(R.drawable.ovl));
                disable();
			}
			else if(b2.getText().toString().equals("O") && b5.getText().toString().equals("O")&& b8.getText().toString().equals("O")) {
				flag=2;
                p2s++;
                t1.setText("Congratulations!\nPlayer 2 has won the match");
                b2.setBackground(getResources().getDrawable(R.drawable.ovl));
                b5.setBackground(getResources().getDrawable(R.drawable.ovl));
                b8.setBackground(getResources().getDrawable(R.drawable.ovl));
                disable();
				}
			else if(b3.getText().toString().equals("O") && b6.getText().toString().equals("O")&& b9.getText().toString().equals("O")) {
				flag=2;
                p2s++;
                t1.setText("Congratulations!\nPlayer 2 has won the match");
                b3.setBackground(getResources().getDrawable(R.drawable.ovl));
                b6.setBackground(getResources().getDrawable(R.drawable.ovl));
                b9.setBackground(getResources().getDrawable(R.drawable.ovl));
                disable();
			}
			else if(b1.getText().toString().equals("O") && b5.getText().toString().equals("O")&& b9.getText().toString().equals("O")) {
				flag=2;
                p2s++;
                t1.setText("Congratulations!\nPlayer 2 has won the match");
                b1.setBackground(getResources().getDrawable(R.drawable.ord));
                b5.setBackground(getResources().getDrawable(R.drawable.ord));
                b9.setBackground(getResources().getDrawable(R.drawable.ord));
                disable();
			}
			else if(b3.getText().toString().equals("O") && b5.getText().toString().equals("O")&& b7.getText().toString().equals("O")) {
				flag=2;
                p2s++;
                t1.setText("Congratulations!\nPlayer 2 has won the match");
                b3.setBackground(getResources().getDrawable(R.drawable.old));
                b5.setBackground(getResources().getDrawable(R.drawable.old));
                b7.setBackground(getResources().getDrawable(R.drawable.old));
                disable();
            }
			else if(c==9 && flag==0) {
                t1.setText("The match is a Draw");
                showToast("The match is a Draw");
			}
            p1.setText(""+p1s);
            p2.setText(""+p2s);
            if(flag==1)
                showToast("Player 1 WINS");
            else if (flag==2)
                showToast("Player 2 WINS");
		}

    private void disable() {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }
    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onNew(View view) {
        onReset(view);
        p1.setText("0");
        p2.setText("0");
        p1s=p2s=0;
    }
}

    
	

