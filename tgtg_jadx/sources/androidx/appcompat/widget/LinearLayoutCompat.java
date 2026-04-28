package androidx.appcompat.widget;

import a40.d0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import p.g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f2043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f2044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f2045k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2048o;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public LinearLayoutCompat(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2035a = true;
        this.f2036b = -1;
        this.f2037c = 0;
        this.f2039e = 8388659;
        int[] iArr = j.a.f24266o;
        j30.g gVarT = j30.g.t(context, attributeSet, iArr, i11);
        ViewCompat.a0(this, context, iArr, attributeSet, (TypedArray) gVarT.f24503c, i11, 0);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        int i12 = typedArray.getInt(1, -1);
        if (i12 >= 0) {
            setOrientation(i12);
        }
        int i13 = typedArray.getInt(0, -1);
        if (i13 >= 0) {
            setGravity(i13);
        }
        boolean z11 = typedArray.getBoolean(2, true);
        if (!z11) {
            setBaselineAligned(z11);
        }
        this.f2041g = typedArray.getFloat(4, -1.0f);
        this.f2036b = typedArray.getInt(3, -1);
        this.f2042h = typedArray.getBoolean(7, false);
        setDividerDrawable(gVarT.k(5));
        this.f2047n = typedArray.getInt(8, 0);
        this.f2048o = typedArray.getDimensionPixelSize(6, 0);
        gVarT.v();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i11) {
        this.f2045k.setBounds(getPaddingLeft() + this.f2048o, i11, (getWidth() - getPaddingRight()) - this.f2048o, this.f2046m + i11);
        this.f2045k.draw(canvas);
    }

    public final void e(Canvas canvas, int i11) {
        this.f2045k.setBounds(i11, getPaddingTop() + this.f2048o, this.l + i11, (getHeight() - getPaddingBottom()) - this.f2048o);
        this.f2045k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i11 = this.f2038d;
        if (i11 == 0) {
            return new a(-2, -2);
        }
        if (i11 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i11;
        if (this.f2036b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i12 = this.f2036b;
        if (childCount <= i12) {
            d0.k("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i12);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2036b == 0) {
                return -1;
            }
            d0.k("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int iA = this.f2037c;
        if (this.f2038d == 1 && (i11 = this.f2039e & 112) != 48) {
            if (i11 == 16) {
                iA = org.bouncycastle.jcajce.provider.asymmetric.a.a(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f2040f, 2, iA);
            } else if (i11 == 80) {
                iA = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2040f;
            }
        }
        return iA + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2036b;
    }

    public Drawable getDividerDrawable() {
        return this.f2045k;
    }

    public int getDividerPadding() {
        return this.f2048o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.f2039e;
    }

    public int getOrientation() {
        return this.f2038d;
    }

    public int getShowDividers() {
        return this.f2047n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2041g;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public final boolean i(int i11) {
        if (i11 == 0) {
            return (this.f2047n & 1) != 0;
        }
        int childCount = getChildCount();
        int i12 = this.f2047n;
        if (i11 == childCount) {
            return (i12 & 4) != 0;
        }
        if ((i12 & 2) != 0) {
            for (int i13 = i11 - 1; i13 >= 0; i13--) {
                if (getChildAt(i13).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i11;
        if (this.f2045k == null) {
            return;
        }
        int i12 = 0;
        if (this.f2038d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i12 < virtualChildCount) {
                View childAt = getChildAt(i12);
                if (childAt != null && childAt.getVisibility() != 8 && i(i12)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f2046m);
                }
                i12++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2046m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z11 = g3.f33904a;
        boolean z12 = getLayoutDirection() == 1;
        while (i12 < virtualChildCount2) {
            View childAt3 = getChildAt(i12);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i12)) {
                a aVar = (a) childAt3.getLayoutParams();
                e(canvas, z12 ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.l);
            }
            i12++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (z12) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i11 = this.l;
                    right = left - i11;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (z12) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i11 = this.l;
                right = left - i11;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ad  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z11) {
        this.f2035a = z11;
    }

    public void setBaselineAlignedChildIndex(int i11) {
        if (i11 < 0 || i11 >= getChildCount()) {
            d0.f(")", getChildCount(), "base aligned child index out of range (0, ");
        } else {
            this.f2036b = i11;
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2045k) {
            return;
        }
        this.f2045k = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.f2046m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.f2046m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i11) {
        this.f2048o = i11;
    }

    public void setGravity(int i11) {
        if (this.f2039e != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f2039e = i11;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i11) {
        int i12 = i11 & 8388615;
        int i13 = this.f2039e;
        if ((8388615 & i13) != i12) {
            this.f2039e = i12 | ((-8388616) & i13);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z11) {
        this.f2042h = z11;
    }

    public void setOrientation(int i11) {
        if (this.f2038d != i11) {
            this.f2038d = i11;
            requestLayout();
        }
    }

    public void setShowDividers(int i11) {
        if (i11 != this.f2047n) {
            requestLayout();
        }
        this.f2047n = i11;
    }

    public void setVerticalGravity(int i11) {
        int i12 = i11 & 112;
        int i13 = this.f2039e;
        if ((i13 & 112) != i12) {
            this.f2039e = i12 | (i13 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f11) {
        this.f2041g = Math.max(0.0f, f11);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }
}
