package me.angeldevil.ratioimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

import me.angeldevil.library.R;

public class RatioImageView extends ImageView {

    private static final int SCALA_AXIS_VERTICAL = 0;
    private static final int SCALA_AXIS_HORIZONTAL = 1;

    private int mScalaAxis = SCALA_AXIS_VERTICAL;
    private float ratio = -1f;

    public RatioImageView(Context context) {
        super(context);
    }

    public RatioImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public RatioImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.RatioImageView, 0, 0);
        mScalaAxis = a.getInt(R.styleable.RatioImageView_scala_axis, SCALA_AXIS_VERTICAL);
        ratio = a.getFloat(R.styleable.RatioImageView_ratio, -1f);
        a.recycle();
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
        invalidate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (ratio > 0) {
            int width, height;
            if (mScalaAxis == SCALA_AXIS_VERTICAL) {
                width = getMeasuredWidth();
                height = (int) (width * ratio);
            } else {
                height = getMeasuredHeight();
                width = (int) (height * ratio);
            }
            setMeasuredDimension(width, height);
        }
    }
}
