package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import e20.i0;
import h0.g;
import n20.j;
import v20.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f12435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12439e;

    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i11);
        Context context2 = getContext();
        this.f12435a = new j();
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.D, i11, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f12436b = typedArrayM.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f12438d = typedArrayM.getDimensionPixelOffset(2, 0);
        this.f12439e = typedArrayM.getDimensionPixelOffset(1, 0);
        setDividerColor(g.p(context2, typedArrayM, 0).getDefaultColor());
        typedArrayM.recycle();
    }

    public int getDividerColor() {
        return this.f12437c;
    }

    public int getDividerInsetEnd() {
        return this.f12439e;
    }

    public int getDividerInsetStart() {
        return this.f12438d;
    }

    public int getDividerThickness() {
        return this.f12436b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i11;
        super.onDraw(canvas);
        boolean z11 = getLayoutDirection() == 1;
        int i12 = z11 ? this.f12439e : this.f12438d;
        if (z11) {
            width = getWidth();
            i11 = this.f12438d;
        } else {
            width = getWidth();
            i11 = this.f12439e;
        }
        int i13 = width - i11;
        int bottom = getBottom() - getTop();
        j jVar = this.f12435a;
        jVar.setBounds(i12, 0, i13, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i13 = this.f12436b;
            if (i13 > 0 && measuredHeight != i13) {
                measuredHeight = i13;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i11) {
        if (this.f12437c != i11) {
            this.f12437c = i11;
            this.f12435a.t(ColorStateList.valueOf(i11));
            invalidate();
        }
    }

    public void setDividerColorResource(int i11) {
        setDividerColor(getContext().getColor(i11));
    }

    public void setDividerInsetEnd(int i11) {
        this.f12439e = i11;
    }

    public void setDividerInsetEndResource(int i11) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerInsetStart(int i11) {
        this.f12438d = i11;
    }

    public void setDividerInsetStartResource(int i11) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerThickness(int i11) {
        if (this.f12436b != i11) {
            this.f12436b = i11;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i11) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i11));
    }

    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }
}
