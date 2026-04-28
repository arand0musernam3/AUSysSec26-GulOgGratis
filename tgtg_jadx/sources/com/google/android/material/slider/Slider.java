package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import b0.a0;
import com.braze.h2;
import n20.j;
import p20.e;
import p20.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class Slider extends e {
    public Slider(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f34182s1;
    }

    public int getFocusedThumbIndex() {
        return this.f34184t1;
    }

    public int getHaloRadius() {
        return this.H;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.C1;
    }

    public int getLabelBehavior() {
        return this.C;
    }

    public float getStepSize() {
        return this.f34186u1;
    }

    public float getThumbElevation() {
        return this.Q1.f30345b.f30330n;
    }

    public int getThumbHeight() {
        return this.G;
    }

    @Override // p20.e
    public int getThumbRadius() {
        return this.F / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.Q1.f30345b.f30322e;
    }

    public float getThumbStrokeWidth() {
        return this.Q1.f30345b.f30328k;
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.Q1.f30345b.f30321d;
    }

    public int getThumbTrackGapSize() {
        return this.I;
    }

    public int getThumbWidth() {
        return this.F;
    }

    public int getTickActiveRadius() {
        return this.f34192x1;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.D1;
    }

    public int getTickInactiveRadius() {
        return this.f34194y1;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.E1;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.E1.equals(this.D1)) {
            return this.D1;
        }
        h2.b("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        return null;
    }

    public int getTickVisibilityMode() {
        return this.f34190w1;
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.F1;
    }

    @Override // p20.e
    public int getTrackCornerSize() {
        int i11 = this.M;
        return i11 == -1 ? this.D / 2 : i11;
    }

    public int getTrackHeight() {
        return this.D;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.W;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.T;
    }

    public Drawable getTrackIconActiveStart() {
        return this.P;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.f34161h1;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.f34156f1;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.f34160h0;
    }

    public int getTrackIconSize() {
        return this.f34163i1;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.G1;
    }

    public int getTrackInsideCornerSize() {
        return this.N;
    }

    public int getTrackSidePadding() {
        return this.E;
    }

    public int getTrackStopIndicatorSize() {
        return this.L;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.G1.equals(this.F1)) {
            return this.F1;
        }
        h2.b("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        return null;
    }

    public int getTrackWidth() {
        return this.f34196z1;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // p20.e
    public float getValueFrom() {
        return this.f34176p1;
    }

    @Override // p20.e
    public float getValueTo() {
        return this.f34178q1;
    }

    @Override // p20.e
    public /* bridge */ /* synthetic */ void setCentered(boolean z11) {
        super.setCentered(z11);
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.R1 = drawableNewDrawable;
        this.S1.clear();
        postInvalidate();
    }

    @Override // p20.e, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z11) {
        super.setEnabled(z11);
    }

    @Override // p20.e
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i11) {
        super.setFocusedThumbIndex(i11);
    }

    @Override // p20.e
    public /* bridge */ /* synthetic */ void setHaloRadius(int i11) {
        super.setHaloRadius(i11);
    }

    public void setHaloRadiusResource(int i11) {
        setHaloRadius(getResources().getDimensionPixelSize(i11));
    }

    @Override // p20.e
    public /* bridge */ /* synthetic */ void setHaloTintList(@NonNull ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // p20.e
    public void setLabelBehavior(int i11) {
        if (this.C != i11) {
            this.C = i11;
            M(true);
        }
    }

    @Override // p20.e
    public void setOrientation(int i11) {
        if (this.f34195z == i11) {
            return;
        }
        this.f34195z = i11;
        M(true);
    }

    @Override // p20.e
    public /* bridge */ /* synthetic */ void setStepSize(float f11) {
        super.setStepSize(f11);
    }

    @Override // p20.e
    public void setThumbElevation(float f11) {
        this.Q1.s(f11);
    }

    public void setThumbElevationResource(int i11) {
        setThumbElevation(getResources().getDimension(i11));
    }

    @Override // p20.e
    public /* bridge */ /* synthetic */ void setThumbHeight(int i11) {
        super.setThumbHeight(i11);
    }

    public void setThumbHeightResource(int i11) {
        setThumbHeight(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbRadius(int i11) {
        int i12 = i11 * 2;
        setThumbWidth(i12);
        setThumbHeight(i12);
    }

    public void setThumbRadiusResource(int i11) {
        setThumbRadius(getResources().getDimensionPixelSize(i11));
    }

    @Override // p20.e
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.Q1.z(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i11) {
        if (i11 != 0) {
            setThumbStrokeColor(androidx.core.app.e.b(getContext(), i11));
        }
    }

    @Override // p20.e
    public void setThumbStrokeWidth(float f11) {
        this.Q1.A(f11);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i11) {
        if (i11 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i11));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        j jVar = this.Q1;
        if (colorStateList.equals(jVar.f30345b.f30321d)) {
            return;
        }
        jVar.t(colorStateList);
        invalidate();
    }

    @Override // p20.e
    public void setThumbTrackGapSize(int i11) {
        if (this.I == i11) {
            return;
        }
        this.I = i11;
        invalidate();
    }

    @Override // p20.e
    public /* bridge */ /* synthetic */ void setThumbWidth(int i11) {
        super.setThumbWidth(i11);
    }

    public void setThumbWidthResource(int i11) {
        setThumbWidth(getResources().getDimensionPixelSize(i11));
    }

    @Override // p20.e
    public void setTickActiveRadius(int i11) {
        if (this.f34192x1 != i11) {
            this.f34192x1 = i11;
            this.f34155f.setStrokeWidth(i11 * 2);
            M(false);
        }
    }

    @Override // p20.e
    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.D1)) {
            return;
        }
        this.D1 = colorStateList;
        this.f34155f.setColor(m(colorStateList));
        invalidate();
    }

    @Override // p20.e
    public void setTickInactiveRadius(int i11) {
        if (this.f34194y1 != i11) {
            this.f34194y1 = i11;
            this.f34154e.setStrokeWidth(i11 * 2);
            M(false);
        }
    }

    @Override // p20.e
    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.E1)) {
            return;
        }
        this.E1 = colorStateList;
        this.f34154e.setColor(m(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i11) {
        if (this.f34190w1 != i11) {
            this.f34190w1 = i11;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z11) {
        setTickVisibilityMode(z11 ? 0 : 2);
    }

    @Override // p20.e
    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.F1)) {
            return;
        }
        this.F1 = colorStateList;
        this.f34151b.setColor(m(colorStateList));
        invalidate();
    }

    @Override // p20.e
    public void setTrackCornerSize(int i11) {
        if (this.M == i11) {
            return;
        }
        this.M = i11;
        invalidate();
    }

    @Override // p20.e
    public void setTrackHeight(int i11) {
        if (this.D != i11) {
            this.D = i11;
            this.f34150a.setStrokeWidth(i11);
            this.f34151b.setStrokeWidth(this.D);
            M(false);
        }
    }

    @Override // p20.e
    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.W) {
            return;
        }
        this.W = colorStateList;
        J();
        I();
        invalidate();
    }

    @Override // p20.e
    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.T) {
            return;
        }
        this.T = drawable;
        this.V = false;
        I();
        invalidate();
    }

    @Override // p20.e
    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.P) {
            return;
        }
        this.P = drawable;
        this.Q = false;
        J();
        invalidate();
    }

    @Override // p20.e
    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f34161h1) {
            return;
        }
        this.f34161h1 = colorStateList;
        L();
        K();
        invalidate();
    }

    @Override // p20.e
    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.f34156f1) {
            return;
        }
        this.f34156f1 = drawable;
        this.f34158g1 = false;
        K();
        invalidate();
    }

    @Override // p20.e
    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.f34160h0) {
            return;
        }
        this.f34160h0 = drawable;
        this.t0 = false;
        L();
        invalidate();
    }

    @Override // p20.e
    public void setTrackIconSize(int i11) {
        if (this.f34163i1 == i11) {
            return;
        }
        this.f34163i1 = i11;
        invalidate();
    }

    @Override // p20.e
    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.G1)) {
            return;
        }
        this.G1 = colorStateList;
        this.f34150a.setColor(m(colorStateList));
        invalidate();
    }

    @Override // p20.e
    public void setTrackInsideCornerSize(int i11) {
        if (this.N == i11) {
            return;
        }
        this.N = i11;
        invalidate();
    }

    @Override // p20.e
    public void setTrackStopIndicatorSize(int i11) {
        if (this.L == i11) {
            return;
        }
        this.L = i11;
        this.f34157g.setStrokeWidth(i11);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f11) {
        setValues(Float.valueOf(f11));
    }

    public void setValueFrom(float f11) {
        this.f34176p1 = f11;
        this.B1 = true;
        postInvalidate();
    }

    public void setValueTo(float f11) {
        this.f34178q1 = f11;
        this.B1 = true;
        postInvalidate();
    }

    @Override // p20.e
    public final boolean w() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    public void setTrackIconActiveEnd(int i11) {
        setTrackIconActiveEnd(i11 != 0 ? a0.x(getContext(), i11) : null);
    }

    public void setTrackIconActiveStart(int i11) {
        setTrackIconActiveStart(i11 != 0 ? a0.x(getContext(), i11) : null);
    }

    public void setTrackIconInactiveEnd(int i11) {
        setTrackIconInactiveEnd(i11 != 0 ? a0.x(getContext(), i11) : null);
    }

    public void setTrackIconInactiveStart(int i11) {
        setTrackIconInactiveStart(i11 != 0 ? a0.x(getContext(), i11) : null);
    }

    public void setCustomThumbDrawable(int i11) {
        setCustomThumbDrawable(getResources().getDrawable(i11));
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(f fVar) {
    }

    public Slider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.sliderStyle);
    }

    public Slider(@NonNull Context context) {
        this(context, null);
    }
}
