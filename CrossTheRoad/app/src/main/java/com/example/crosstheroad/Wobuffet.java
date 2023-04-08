package com.example.crosstheroad;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Wobuffet extends RoadMoveable {
    Wobuffet(Resources r, Context context, int duration, int row, int length, int startX) {
        super(r, context, duration, row, length);
        setGraphic(r.getDrawable(R.drawable.wobbuffet), startX);
    }
}
