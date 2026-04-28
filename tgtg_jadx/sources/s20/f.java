package s20;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import e20.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f38785c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f38786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f38787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabLayout tabLayout, Context context) {
        super(context);
        this.f38787b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i11) {
        TabLayout tabLayout = this.f38787b;
        if (tabLayout.W == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i11);
            l20.c cVar = tabLayout.J;
            Drawable drawable = tabLayout.f12623o;
            cVar.getClass();
            RectF rectFM = l20.c.m(tabLayout, childAt);
            drawable.setBounds((int) rectFM.left, drawable.getBounds().top, (int) rectFM.right, drawable.getBounds().bottom);
            tabLayout.f12609a = i11;
        }
    }

    public final void b(int i11) {
        TabLayout tabLayout = this.f38787b;
        Rect bounds = tabLayout.f12623o.getBounds();
        tabLayout.f12623o.setBounds(bounds.left, 0, bounds.right, i11);
        requestLayout();
    }

    public final void c(View view, View view2, float f11) {
        TabLayout tabLayout = this.f38787b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f12623o;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f12623o.getBounds().bottom);
        } else {
            tabLayout.J.w(tabLayout, view, view2, f11, tabLayout.f12623o);
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i11, int i12, boolean z11) {
        TabLayout tabLayout = this.f38787b;
        if (tabLayout.f12609a == i11) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i11);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f12609a = i11;
        e20.g gVar = new e20.g(this, childAt, childAt2);
        if (!z11) {
            this.f38786a.removeAllUpdateListeners();
            this.f38786a.addUpdateListener(gVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f38786a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.K);
        valueAnimator.setDuration(i12);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(gVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f38787b;
        int iHeight = tabLayout.f12623o.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f12623o.getIntrinsicHeight();
        }
        int i11 = tabLayout.C;
        if (i11 == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i11 != 1) {
            height = 0;
            if (i11 != 2) {
                iHeight = i11 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f12623o.getBounds().width() > 0) {
            Rect bounds = tabLayout.f12623o.getBounds();
            tabLayout.f12623o.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.f12623o.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        ValueAnimator valueAnimator = this.f38786a;
        TabLayout tabLayout = this.f38787b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f12609a == -1) {
            tabLayout.f12609a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f12609a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f38787b;
        boolean z11 = true;
        if (tabLayout.A == 1 || tabLayout.D == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) i0.g(getContext(), 16)) * 2)) {
                boolean z12 = false;
                for (int i14 = 0; i14 < childCount; i14++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z12 = true;
                    }
                }
                z11 = z12;
            } else {
                tabLayout.A = 0;
                tabLayout.n(false);
            }
            if (z11) {
                super.onMeasure(i11, i12);
            }
        }
    }
}
