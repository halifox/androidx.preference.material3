package androidx.preference.compat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.slider.Slider;

/**
 * Slider - SeekBar 兼容层
 */
@SuppressLint("AppCompatCustomView")
public class SeekBar extends Slider {

    public SeekBar(@NonNull Context context) {
        super(context);
    }

    public SeekBar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SeekBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int getProgress() {
        return (int) this.getValue();
    }

    public void setMax(int i) {
        setValueTo(i);
    }

    public void setProgress(int i) {
        setValue(i);
    }

    public int getKeyProgressIncrement() {
        return (int) getStepSize();
    }

    public void setKeyProgressIncrement(int i) {
        setStepSize(i);
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener mSeekBarChangeListener) {
        addOnSliderTouchListener(new OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                mSeekBarChangeListener.onStartTrackingTouch(SeekBar.this);
            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {
                mSeekBarChangeListener.onStopTrackingTouch(SeekBar.this);
            }
        });
        addOnChangeListener(new OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                mSeekBarChangeListener.onProgressChanged(SeekBar.this, (int) value, fromUser);
            }
        });
    }
}
