package l10;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f26776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f26777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26779f;

    public c() {
        this.f26776c = new Rect();
        this.f26777d = new Rect();
        this.f26778e = 0;
    }

    @Override // s6.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        AppBarLayout appBarLayoutZ;
        WindowInsetsCompat lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i13);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutZ.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.i() + lastWindowInsets.l();
        }
        int totalScrollRange = appBarLayoutZ.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutZ.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.s(view, i11, i12, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i14 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // l10.d
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i11) {
        AppBarLayout appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view));
        if (appBarLayoutZ == null) {
            coordinatorLayout.r(i11, view);
            this.f26778e = 0;
            return;
        }
        s6.e eVar = (s6.e) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int bottom = appBarLayoutZ.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int bottom2 = ((appBarLayoutZ.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
        Rect rect = this.f26776c;
        rect.set(paddingLeft, bottom, width, bottom2);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.j() + rect.left;
            rect.right -= lastWindowInsets.k();
        }
        int i12 = eVar.f38841c;
        if (i12 == 0) {
            i12 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f26777d;
        Gravity.apply(i12, measuredWidth, measuredHeight, rect, rect2, i11);
        int iY = y(appBarLayoutZ);
        view.layout(rect2.left, rect2.top - iY, rect2.right, rect2.bottom - iY);
        this.f26778e = rect2.top - appBarLayoutZ.getBottom();
    }

    public final int y(View view) {
        int i11;
        if (this.f26779f == 0) {
            return 0;
        }
        float f11 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            s6.b bVar = ((s6.e) appBarLayout.getLayoutParams()).f38839a;
            int iY = bVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) bVar).y() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iY > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f11 = (iY / i11) + 1.0f;
            }
        }
        int i12 = this.f26779f;
        return xz.b.o((int) (f11 * i12), 0, i12);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26776c = new Rect();
        this.f26777d = new Rect();
        this.f26778e = 0;
    }
}
