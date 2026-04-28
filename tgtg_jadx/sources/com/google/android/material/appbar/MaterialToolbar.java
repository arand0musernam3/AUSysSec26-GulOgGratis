package com.google.android.material.appbar;

import a60.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import com.app.tgtg.R;
import e20.i0;
import java.util.ArrayList;
import java.util.Collections;
import lx.u;
import n20.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final ImageView.ScaleType[] f12237i1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f12238f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public ImageView.ScaleType f12239g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Integer f12240h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Boolean f12241h1;
    public boolean t0;

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i11);
        Context context2 = getContext();
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.J, i11, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM.hasValue(2)) {
            setNavigationIconTint(typedArrayM.getColor(2, -1));
        }
        this.t0 = typedArrayM.getBoolean(4, false);
        this.f12238f1 = typedArrayM.getBoolean(3, false);
        int i12 = typedArrayM.getInt(1, -1);
        if (i12 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f12237i1;
            if (i12 < scaleTypeArr.length) {
                this.f12239g1 = scaleTypeArr[i12];
            }
        }
        if (typedArrayM.hasValue(0)) {
            this.f12241h1 = Boolean.valueOf(typedArrayM.getBoolean(0, false));
        }
        typedArrayM.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : b6.a.m(background);
        if (colorStateListValueOf != null) {
            j jVar = new j();
            jVar.t(colorStateListValueOf);
            jVar.p(context2);
            jVar.s(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f12239g1;
    }

    public Integer getNavigationIconTint() {
        return this.f12240h0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.Q(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z11, i11, i12, i13, i14);
        r rVar = i0.f15672c;
        int i15 = 0;
        ImageView imageView2 = null;
        if (this.t0 || this.f12238f1) {
            ArrayList arrayListL = i0.l(this, getTitle());
            TextView textView = arrayListL.isEmpty() ? null : (TextView) Collections.min(arrayListL, rVar);
            ArrayList arrayListL2 = i0.l(this, getSubtitle());
            TextView textView2 = arrayListL2.isEmpty() ? null : (TextView) Collections.max(arrayListL2, rVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i16 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i16 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i16 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.t0 && textView != null) {
                    x(textView, pair);
                }
                if (this.f12238f1 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i15 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i15++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f12241h1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f12239g1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        u.N(this, f11);
    }

    public void setLogoAdjustViewBounds(boolean z11) {
        Boolean bool = this.f12241h1;
        if (bool == null || bool.booleanValue() != z11) {
            this.f12241h1 = Boolean.valueOf(z11);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f12239g1 != scaleType) {
            this.f12239g1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f12240h0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f12240h0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i11) {
        this.f12240h0 = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z11) {
        if (this.f12238f1 != z11) {
            this.f12238f1 = z11;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z11) {
        if (this.t0 != z11) {
            this.t0 = z11;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i11 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i12 = measuredWidth2 + i11;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i11, 0), Math.max(i12 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i11 += iMax;
            i12 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i12 - i11, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i11, textView.getTop(), i12, textView.getBottom());
    }

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }
}
