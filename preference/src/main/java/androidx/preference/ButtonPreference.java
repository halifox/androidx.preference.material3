package androidx.preference;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

import androidx.core.content.res.TypedArrayUtils;

import com.google.android.material.button.MaterialButton;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

@SuppressLint("RestrictedApi")
public class ButtonPreference extends Preference {
    private final String text;

    public ButtonPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setSelectable(false);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ButtonPreference, defStyleAttr, defStyleRes);
        text = TypedArrayUtils.getString(a, R.styleable.ButtonPreference_text, R.styleable.ButtonPreference_android_text);
        a.recycle();
    }

    public ButtonPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public ButtonPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, TypedArrayUtils.getAttr(context, R.attr.buttonPreferenceStyle, 0));
    }

    public ButtonPreference(@NonNull Context context) {
        this(context, null);
    }

    @Override
    public void onBindViewHolder(@NonNull PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);

        View view = holder.findViewById(R.id.button);
        syncMaterialButton(view);
    }

    private void syncMaterialButton(View view) {
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setText(text);
        }
    }
}
