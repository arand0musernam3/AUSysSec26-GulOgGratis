package com.app.tgtg.customview.manufactureaddressfragment;

import a8.c;
import a8.k;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import bg.n0;
import com.app.tgtg.R;
import com.app.tgtg.customview.NoChangingBackgroundTextInputLayout;
import com.google.android.material.textfield.TextInputEditText;
import d70.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AddressEditText extends LinearLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8926f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressEditText(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i13 = f.f34848w;
        DataBinderMapperImpl dataBinderMapperImpl = c.f965a;
        f fVar = (f) k.Z(layoutInflaterFrom, R.layout.address_edittext_layout, this, true, null);
        fVar.getClass();
        this.f8927a = fVar;
    }

    public final void a() {
        boolean z11 = this.f8930d;
        f fVar = this.f8927a;
        if (z11) {
            fVar.f34849s.setTextColor(getContext().getColor(R.color.neutral_60));
            fVar.f34850t.setTextColor(getContext().getColor(R.color.neutral_60));
            fVar.f34852v.setTextColor(getContext().getColor(R.color.neutral_60));
            return;
        }
        if (this.f8931e) {
            fVar.f34849s.setTextColor(getContext().getColor(R.color.neutral_60));
            fVar.f34850t.setTextColor(getContext().getColor(R.color.neutral_80));
            fVar.f34852v.setTextColor(getContext().getColor(R.color.neutral_80));
            return;
        }
        TextInputEditText textInputEditText = fVar.f34850t;
        TextView textView = fVar.f34852v;
        TextInputEditText textInputEditText2 = fVar.f34850t;
        TextView textView2 = fVar.f34849s;
        Editable text = textInputEditText.getText();
        if (text == null || text.length() == 0) {
            textView2.setTextColor(getContext().getColor(R.color.neutral_80));
            textInputEditText2.setTextColor(getContext().getColor(R.color.neutral_80));
            textView.setTextColor(getContext().getColor(R.color.neutral_60));
        } else {
            textView2.setTextColor(getContext().getColor(R.color.neutral_60));
            textInputEditText2.setTextColor(getContext().getColor(R.color.neutral_80));
            textView.setTextColor(getContext().getColor(R.color.neutral_60));
        }
    }

    @NotNull
    public final TextInputEditText getEt() {
        TextInputEditText textInputEditText = this.f8927a.f34850t;
        textInputEditText.getClass();
        return textInputEditText;
    }

    @NotNull
    public final String getEtText() {
        return String.valueOf(this.f8927a.f34850t.getText());
    }

    @NotNull
    public final TextView getHelperTv() {
        TextView textView = this.f8927a.f34852v;
        textView.getClass();
        return textView;
    }

    @NotNull
    public final TextView getLabelTv() {
        TextView textView = this.f8927a.f34849s;
        textView.getClass();
        return textView;
    }

    public final void setAllCaps() {
        this.f8927a.f34850t.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
    }

    public final void setAllowedInput(@NotNull String str) {
        str.getClass();
        this.f8927a.f34850t.setKeyListener(DigitsKeyListener.getInstance(str));
    }

    public final void setEnable(boolean z11) {
        this.f8930d = !z11;
        this.f8927a.f34850t.setEnabled(z11);
        a();
    }

    public final void setEndIcon(@NotNull Activity activity, @Nullable Drawable drawable) {
        activity.getClass();
        if (drawable != null) {
            f fVar = this.f8927a;
            NoChangingBackgroundTextInputLayout noChangingBackgroundTextInputLayout = fVar.f34851u;
            NoChangingBackgroundTextInputLayout noChangingBackgroundTextInputLayout2 = fVar.f34851u;
            noChangingBackgroundTextInputLayout.setEndIconMode(-1);
            noChangingBackgroundTextInputLayout2.setEndIconDrawable(drawable);
            fVar.f34850t.setPadding(b.a(12), b.a(12), b.a(12), b.a(12));
            noChangingBackgroundTextInputLayout2.setEndIconOnClickListener(new n0(14, activity, this));
        }
    }

    public final void setError(@Nullable String str) {
        this.f8929c = str;
        f fVar = this.f8927a;
        if (str != null) {
            NoChangingBackgroundTextInputLayout noChangingBackgroundTextInputLayout = fVar.f34851u;
            NoChangingBackgroundTextInputLayout noChangingBackgroundTextInputLayout2 = fVar.f34851u;
            noChangingBackgroundTextInputLayout.setErrorEnabled(true);
            noChangingBackgroundTextInputLayout2.setError(str);
            noChangingBackgroundTextInputLayout2.getClass();
            noChangingBackgroundTextInputLayout2.getClass();
            int childCount = noChangingBackgroundTextInputLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                noChangingBackgroundTextInputLayout2.getChildAt(i11).setPadding(0, b.a(2), 0, b.a(2));
            }
            fVar.f34850t.setBackgroundResource(R.drawable.checkout_address_background_error);
            fVar.f34852v.setVisibility(8);
            noChangingBackgroundTextInputLayout2.setPadding(0, 0, 0, b.a(8));
        } else {
            fVar.f34851u.setPadding(0, 0, 0, 0);
            fVar.f34850t.setBackgroundResource(R.drawable.checkout_address_background);
            String str2 = this.f8928b;
            if (str2 == null || str2.length() == 0) {
                fVar.f34851u.setError(null);
                fVar.f34852v.setVisibility(8);
            } else {
                setHelperText(this.f8928b);
            }
        }
        a();
    }

    public final void setEtHint(@Nullable String str) {
        if (str != null) {
            this.f8927a.f34850t.setHint(str);
        }
    }

    public final void setEtText(@Nullable String str) {
        if (str != null) {
            this.f8927a.f34850t.setText(str);
        }
    }

    public final void setFocus(boolean z11) {
        this.f8931e = z11;
        a();
    }

    public final void setHelperText(@Nullable String str) {
        this.f8928b = str;
        String str2 = this.f8929c;
        f fVar = this.f8927a;
        if (str2 != null) {
            fVar.f34852v.setVisibility(8);
            return;
        }
        if (str == null || str.length() == 0) {
            fVar.f34852v.setPadding(0, 0, 0, b.a(0));
            fVar.f34852v.setVisibility(8);
            return;
        }
        NoChangingBackgroundTextInputLayout noChangingBackgroundTextInputLayout = fVar.f34851u;
        TextView textView = fVar.f34852v;
        noChangingBackgroundTextInputLayout.setErrorEnabled(false);
        textView.setVisibility(0);
        textView.setText(str);
        textView.setPadding(0, 0, 0, b.a(8));
    }

    public final void setLabel(@Nullable String str) {
        if (str != null) {
            this.f8927a.f34849s.setText(str);
        }
    }

    public final void setMultiLine() {
        TextInputEditText textInputEditText = this.f8927a.f34850t;
        textInputEditText.setImeOptions(1073741824);
        textInputEditText.setGravity(48);
        textInputEditText.setSingleLine(false);
        textInputEditText.setHeight(b.a(100));
    }

    public final void setSelection(int i11) {
        this.f8927a.f34850t.setSelection(i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressEditText(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ AddressEditText(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
