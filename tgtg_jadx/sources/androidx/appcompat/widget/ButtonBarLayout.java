package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2026c;

    public ButtonBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2026c = -1;
        int[] iArr = j.a.f24263k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.a0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f2024a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f2024a);
        }
    }

    private void setStacked(boolean z11) {
        if (this.f2025b != z11) {
            if (!z11 || this.f2024a) {
                this.f2025b = z11;
                setOrientation(z11 ? 1 : 0);
                setGravity(z11 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z11 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int iMakeMeasureSpec;
        boolean z11;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        int paddingBottom = 0;
        if (this.f2024a) {
            if (size > this.f2026c && this.f2025b) {
                setStacked(false);
            }
            this.f2026c = size;
        }
        if (this.f2025b || View.MeasureSpec.getMode(i11) != 1073741824) {
            iMakeMeasureSpec = i11;
            z11 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z11 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i12);
        if (this.f2024a && !this.f2025b && (getMeasuredWidthAndState() & RoundCornerImageView.DEFAULT_STROKE_COLOR) == 16777216) {
            setStacked(true);
            z11 = true;
        }
        if (z11) {
            super.onMeasure(i11, i12);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i13 = -1;
            if (i14 >= childCount) {
                i14 = -1;
                break;
            } else if (getChildAt(i14).getVisibility() == 0) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 >= 0) {
            View childAt = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f2025b) {
                int i15 = i14 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i15 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i15).getVisibility() == 0) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
                paddingBottom = i13 >= 0 ? getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        if (ViewCompat.t(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i12 == 0) {
                super.onMeasure(i11, i12);
            }
        }
    }

    public void setAllowStacking(boolean z11) {
        if (this.f2024a != z11) {
            this.f2024a = z11;
            if (!z11 && this.f2025b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
