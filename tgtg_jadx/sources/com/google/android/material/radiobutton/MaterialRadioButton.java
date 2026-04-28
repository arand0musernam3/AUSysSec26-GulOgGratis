package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import e20.i0;
import h0.g;
import p.v;
import v20.a;
import w0.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f12529g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f12530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12531f;

    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(a.a(context, attributeSet, i11, com.app.tgtg.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i11);
        Context context2 = getContext();
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.E, i11, com.app.tgtg.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM.hasValue(0)) {
            setButtonTintList(g.p(context2, typedArrayM, 0));
        }
        this.f12531f = typedArrayM.getBoolean(1, false);
        typedArrayM.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12530e == null) {
            int iY = e.y(com.app.tgtg.R.attr.colorControlActivated, this);
            int iY2 = e.y(com.app.tgtg.R.attr.colorOnSurface, this);
            int iY3 = e.y(com.app.tgtg.R.attr.colorSurface, this);
            this.f12530e = new ColorStateList(f12529g, new int[]{e.E(iY3, 1.0f, iY), e.E(iY3, 0.54f, iY2), e.E(iY3, 0.38f, iY2), e.E(iY3, 0.38f, iY2)});
        }
        return this.f12530e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12531f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f12531f = z11;
        if (z11) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }
}
