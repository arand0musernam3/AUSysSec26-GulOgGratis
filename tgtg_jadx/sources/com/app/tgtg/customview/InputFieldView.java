package com.app.tgtg.customview;

import ag.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.a0;
import bg.b0;
import bg.c0;
import com.app.tgtg.R;
import kotlin.text.y;
import mv.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class InputFieldView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8908b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f8909a = a.a(LayoutInflater.from(getContext()), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f1450e, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        j(typedArrayObtainStyledAttributes);
    }

    @NotNull
    public final String getCountryCode() {
        return y.n(((EditText) this.f8909a.f34762d).getText().toString(), "+", "", false);
    }

    @NotNull
    public final String getText() {
        return ((EditText) this.f8909a.f34761c).getText().toString();
    }

    public final void j(TypedArray typedArray) {
        typedArray.getClass();
        try {
            a aVar = this.f8909a;
            TextView textView = (TextView) aVar.f34764f;
            EditText editText = (EditText) aVar.f34761c;
            textView.setText(typedArray.getString(2));
            int i11 = 0;
            editText.setHint(typedArray.getString(0));
            editText.setMaxLines(typedArray.getInteger(4, 1));
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(typedArray.getInteger(3, 300))});
            EditText editText2 = (EditText) aVar.f34762d;
            if (!typedArray.getBoolean(1, false)) {
                i11 = 8;
            }
            editText2.setVisibility(i11);
        } finally {
            typedArray.recycle();
        }
    }

    public final void k(String str) {
        str.getClass();
        a aVar = this.f8909a;
        ((TextView) aVar.f34765g).setText(str);
        ((TextView) aVar.f34765g).setVisibility(0);
        ((EditText) aVar.f34761c).setBackground(a0.x(getContext(), R.drawable.input_text_field_background_error));
    }

    public final void setCountryCode(@Nullable String str) {
        ((EditText) this.f8909a.f34762d).setText(str);
    }

    public final void setCountryCodeTextChangeListener(@NotNull c0 c0Var) {
        c0Var.getClass();
        d.y((EditText) this.f8909a.f34762d, new b0(this, c0Var, 1));
    }

    public final void setInputFieldEnabled(boolean z11) {
        ((EditText) this.f8909a.f34761c).setEnabled(z11);
    }

    public final void setInputType(int i11) {
        a aVar = this.f8909a;
        ((EditText) aVar.f34761c).setInputType(i11);
        ((EditText) aVar.f34762d).setInputType(i11);
    }

    public final void setText(@Nullable String str) {
        ((EditText) this.f8909a.f34761c).setText(str);
    }

    public final void setTextChangeListener(@NotNull c0 c0Var) {
        c0Var.getClass();
        d.y((EditText) this.f8909a.f34761c, new b0(this, c0Var, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputFieldView(@Nullable Context context) {
        super(context);
        context.getClass();
        this.f8909a = a.a(LayoutInflater.from(getContext()), this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f8909a = a.a(LayoutInflater.from(getContext()), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f1450e, i11, 0);
        typedArrayObtainStyledAttributes.getClass();
        j(typedArrayObtainStyledAttributes);
    }
}
