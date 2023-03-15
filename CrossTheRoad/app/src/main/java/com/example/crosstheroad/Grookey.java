package com.example.crosstheroad;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;
public class Grookey extends RoadObstacle {
    Grookey(Resources r, Context context, int duration, int y) {
        super(r, context, duration);
        setGraphic();
        getGraphic().setY(y);
    }

    @Override
    void setGraphic() {
        ImageView graphic = new ImageView(super.context);
        FrameLayout.LayoutParams frameParams =
                new FrameLayout.LayoutParams(Background.getTileLength(),
                Background.getTileLength(), Gravity.RIGHT);
        graphic.setLayoutParams(frameParams);
        graphic.setImageDrawable(super.r.getDrawable(R.drawable.grookey));
        super.setGraphic1(graphic);
    }

    @Override
    public void setAnimation(int x) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(this.getGraphic(),
                "translationX", (float) MainActivity.getScreenX() - 500,
                (float) -MainActivity.getScreenX() - 500);
        animator.setDuration(this.duration);
        animator.setStartDelay(x);
        animator.start();
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.RESTART);
    }
}
