package com.app.tgtg.feature.filter.ui;

import ag.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import h7.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8994b;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class a extends ViewGroup.MarginLayoutParams {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            context.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f1449d);
        typedArrayObtainStyledAttributes.getClass();
        try {
            this.f8993a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f8994b = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.getClass();
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        attributeSet.getClass();
        Context context = getContext();
        context.getClass();
        return new a(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i16 = 0;
        for (View view : new z0(this)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            a aVar = (a) layoutParams;
            int measuredWidth = view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            int measuredHeight = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            if (paddingLeft + measuredWidth > i15 - getPaddingRight()) {
                paddingLeft = getPaddingLeft();
                paddingTop = i16 + this.f8994b + paddingTop;
                i16 = 0;
            }
            int i17 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
            int i18 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
            view.layout(i17, i18, view.getMeasuredWidth() + i17, view.getMeasuredHeight() + i18);
            paddingLeft += measuredWidth + this.f8993a;
            if (i16 < measuredHeight) {
                i16 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i13 = 0;
        int measuredWidth = 0;
        int measuredHeight = 0;
        int i14 = 1;
        for (View view : new z0(this)) {
            measureChild(view, i11, i12);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            a aVar = (a) layoutParams;
            int measuredWidth2 = view.getMeasuredWidth() + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            int i15 = this.f8993a;
            int i16 = size;
            if (measuredWidth2 + i15 > (size - getPaddingLeft()) - getPaddingRight()) {
                if (i13 < measuredWidth) {
                    i13 = measuredWidth;
                }
                measuredWidth = view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                measuredHeight = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                i14++;
            } else {
                measuredWidth += view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + i15;
                int measuredHeight2 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                if (measuredHeight < measuredHeight2) {
                    measuredHeight = measuredHeight2;
                }
            }
            size = i16;
        }
        int i17 = size;
        if (i13 < measuredWidth) {
            i13 = measuredWidth;
        }
        int i18 = ((i14 - 1) * this.f8994b) + (measuredHeight * i14);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i13;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i18;
        if (mode == 1073741824) {
            paddingRight = i17;
        }
        if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(paddingRight, size2);
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlowLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ FlowLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
