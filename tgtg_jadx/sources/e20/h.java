package e20;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class h extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15663d;

    public h(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15662c = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j10.a.f24424r, 0, 0);
        this.f15660a = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f15661b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean a() {
        return this.f15662c;
    }

    public int getItemSpacing() {
        return this.f15661b;
    }

    public int getLineSpacing() {
        return this.f15660a;
    }

    public int getRowCount() {
        return this.f15663d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int marginEnd;
        int marginStart;
        boolean z12;
        int i15 = 0;
        if (getChildCount() == 0) {
            this.f15663d = 0;
            return;
        }
        boolean z13 = true;
        this.f15663d = 1;
        boolean z14 = getLayoutDirection() == 1;
        int paddingRight = z14 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z14 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = 0;
        int measuredWidth = paddingRight;
        int i17 = paddingTop;
        while (i16 < getChildCount()) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z12 = z13;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = i15;
                    marginStart = marginEnd;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                int i18 = i13 - i11;
                z12 = z13;
                int i19 = i18 - paddingLeft;
                if (!this.f15662c && measuredWidth2 > i19) {
                    measuredWidth2 = childAt.getMeasuredWidth() + paddingRight + marginStart;
                    i17 = paddingTop + this.f15660a;
                    this.f15663d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f15663d - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (z14) {
                    childAt.layout(i18 - measuredWidth2, i17, (i18 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i17, measuredWidth2, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f15661b;
                paddingTop = measuredHeight;
            }
            i16++;
            z13 = z12;
            i15 = 0;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i16 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i16 - getPaddingRight();
        int i17 = paddingTop;
        int i18 = 0;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i11, i12);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = marginLayoutParams.leftMargin;
                    i14 = marginLayoutParams.rightMargin;
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int i21 = i14;
                if (childAt.getMeasuredWidth() + paddingLeft + i15 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i17 = paddingTop + this.f15660a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i15;
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (measuredWidth > i18) {
                    i18 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i15 + i21 + this.f15661b + paddingLeft;
                if (i19 == getChildCount() - 1) {
                    i18 += i21;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i18;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i13 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i13 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i13) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i11) {
        this.f15661b = i11;
    }

    public void setLineSpacing(int i11) {
        this.f15660a = i11;
    }

    public void setSingleLine(boolean z11) {
        this.f15662c = z11;
    }

    public h(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(@NonNull Context context) {
        this(context, null);
    }
}
