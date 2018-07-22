package game2048.jikexueyuan.com.game2048;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.graphics.Color;
import android.icu.text.AlphabeticIndex;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout{

    public Card(Context context){
        super(context);

        label = new TextView(getContext());
        label.setTextSize(32);
        label.setBackgroundColor(0x33ffffff);
        label.setGravity(Gravity.CENTER);

        LayoutParams lp = new LayoutParams(-1,-1);
        lp.setMargins(10,10,0,0);
        addView(label,lp);

        setNum(0);
    }

    private int num = 0;
    private TextView label;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
        if(num<=0){
            label.setText("");
            label.setBackgroundColor(0x33ffffff);
        } else{
            label.setText(num+"");
            switch (num){
                case 2:
                    label.setBackgroundColor(getResources().getColor(R.color.blue));
                    break;
                case 4:
                    label.setBackgroundColor(getResources().getColor(R.color.gold));
                    break;
                case 8:
                    label.setBackgroundColor(getResources().getColor(R.color.honeydew));
                    break;
                case 16:
                    label.setBackgroundColor(getResources().getColor(R.color.cyan));
                    break;
            }
        }
    }

    public boolean equals(Card o){

        return getNum()==o.getNum();
    }
}
