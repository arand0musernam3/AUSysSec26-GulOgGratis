package com.google.android.gms.wallet.button;

import a50.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import e10.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnClickListener f12184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f12186c;

    public PayButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        ButtonOptions buttonOptions = new ButtonOptions();
        this.f12185b = new c(buttonOptions, 18);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f15543a);
        int i12 = typedArrayObtainStyledAttributes.getInt(0, 1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        buttonOptions.f12180b = i12;
        buttonOptions.f12181c = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            buttonOptions.f12183e = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        buttonOptions.f12179a = 1;
        if (isInEditMode()) {
            a(buttonOptions);
        }
    }

    public final void a(ButtonOptions buttonOptions) {
        removeAllViews();
        f10.c cVar = new f10.c(new ContextThemeWrapper(getContext(), buttonOptions.f12180b == 2 ? R.style.PayButtonGenericLightTheme : R.style.PayButtonGenericDarkTheme), null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(cVar.getContext()).inflate(R.layout.paybutton_generic, (ViewGroup) cVar, true).findViewById(R.id.pay_button_view);
        Context context = cVar.getContext();
        int i11 = buttonOptions.f12181c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable.mutate();
        gradientDrawable.setCornerRadius(i11);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericRippleColor});
        int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
        linearLayout.setBackground(new RippleDrawable(ColorStateList.valueOf(color), gradientDrawable, null));
        cVar.setContentDescription(cVar.getContext().getString(R.string.gpay_logo_description));
        this.f12186c = cVar;
        addView(cVar);
        this.f12186c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f12184a;
        if (onClickListener == null || view != this.f12186c) {
            return;
        }
        onClickListener.onClick(this);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12184a = onClickListener;
    }

    public PayButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(@NonNull Context context) {
        this(context, null);
    }
}
