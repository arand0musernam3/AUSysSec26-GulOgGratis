package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.appcompat.view.k;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.r1;
import b0.a0;
import com.app.tgtg.R;
import com.braze.h2;
import h7.p1;
import h7.s1;
import h7.t1;
import h7.u;
import h7.u1;
import h7.v;
import h7.v1;
import h7.w1;
import h7.x1;
import o.l;
import o.w;
import p.a1;
import p.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements a1, u, v {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final WindowInsetsCompat D;
    public static final Rect E;
    public final r1 A;
    public final p.c B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1 f1965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1971k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f1972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f1973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f1974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f1975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WindowInsetsCompat f1976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WindowInsetsCompat f1977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WindowInsetsCompat f1978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WindowInsetsCompat f1979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p.b f1980u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OverScroller f1981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.vectordrawable.graphics.drawable.e f1983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p.a f1984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p.a f1985z;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends ViewGroup.MarginLayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        x1 w1Var = i11 >= 36 ? new w1() : i11 >= 35 ? new v1() : i11 >= 34 ? new u1() : i11 >= 31 ? new t1() : i11 >= 30 ? new s1() : i11 >= 29 ? new h7.r1() : new p1();
        w1Var.h(x6.d.b(0, 1, 0, 1));
        D = w1Var.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1962b = 0;
        this.f1972m = new Rect();
        this.f1973n = new Rect();
        this.f1974o = new Rect();
        this.f1975p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f2740b;
        this.f1976q = windowInsetsCompat;
        this.f1977r = windowInsetsCompat;
        this.f1978s = windowInsetsCompat;
        this.f1979t = windowInsetsCompat;
        this.f1983x = new androidx.vectordrawable.graphics.drawable.e(this, 11);
        this.f1984y = new p.a(this, 0);
        this.f1985z = new p.a(this, 1);
        i(context);
        this.A = new r1();
        p.c cVar = new p.c(context);
        cVar.setWillNotDraw(true);
        this.B = cVar;
        addView(cVar);
    }

    public static boolean a(View view, Rect rect, boolean z11) {
        boolean z12;
        a aVar = (a) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
        int i12 = rect.left;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = i12;
            z12 = true;
        } else {
            z12 = false;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
        int i14 = rect.top;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = i14;
            z12 = true;
        }
        int i15 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
        int i16 = rect.right;
        if (i15 != i16) {
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = i16;
            z12 = true;
        }
        if (z11) {
            int i17 = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            int i18 = rect.bottom;
            if (i17 != i18) {
                ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = i18;
                return true;
            }
        }
        return z12;
    }

    public final void b() {
        removeCallbacks(this.f1984y);
        removeCallbacks(this.f1985z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1982w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // h7.u
    public final void c(int i11, View view) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // h7.v
    public final void d(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        e(view, i11, i12, i13, i14, i15);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1966f != null) {
            if (this.f1964d.getVisibility() == 0) {
                translationY = (int) (this.f1964d.getTranslationY() + this.f1964d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f1966f.setBounds(0, translationY, getWidth(), this.f1966f.getIntrinsicHeight() + translationY);
            this.f1966f.draw(canvas);
        }
    }

    @Override // h7.u
    public final void e(View view, int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            onNestedScroll(view, i11, i12, i13, i14);
        }
    }

    @Override // h7.u
    public final boolean f(View view, View view2, int i11, int i12) {
        return i12 == 0 && onStartNestedScroll(view, view2, i11);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // h7.u
    public final void g(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1964d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r1 r1Var = this.A;
        return r1Var.f3901b | r1Var.f3900a;
    }

    public CharSequence getTitle() {
        k();
        return ((h) this.f1965e).f2157a.getTitle();
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f1961a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1966f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1981v = new OverScroller(context);
    }

    public final void j(int i11) {
        k();
        if (i11 == 2) {
            ((h) this.f1965e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i11 == 5) {
            ((h) this.f1965e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i11 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        b1 wrapper;
        if (this.f1963c == null) {
            this.f1963c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1964d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof b1) {
                wrapper = (b1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    h2.b("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1965e = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        WindowInsetsCompat windowInsetsCompatW = WindowInsetsCompat.w(windowInsets, this);
        boolean zA = a(this.f1964d, new Rect(windowInsetsCompatW.j(), windowInsetsCompatW.l(), windowInsetsCompatW.k(), windowInsetsCompatW.i()), false);
        Rect rect = this.f1972m;
        ViewCompat.d(this, windowInsetsCompatW, rect);
        WindowInsetsCompat windowInsetsCompatO = windowInsetsCompatW.o(rect.left, rect.top, rect.right, rect.bottom);
        this.f1976q = windowInsetsCompatO;
        boolean z11 = true;
        if (!this.f1977r.equals(windowInsetsCompatO)) {
            this.f1977r = this.f1976q;
            zA = true;
        }
        Rect rect2 = this.f1973n;
        if (rect2.equals(rect)) {
            z11 = zA;
        } else {
            rect2.set(rect);
        }
        if (z11) {
            requestLayout();
        }
        return windowInsetsCompatW.a().c().b().u();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        ViewCompat.Z(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                int i17 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                childAt.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (!this.f1969i || !z11) {
            return false;
        }
        this.f1981v.fling(0, 0, 0, (int) f12, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1981v.getFinalY() > this.f1964d.getHeight()) {
            b();
            this.f1985z.run();
        } else {
            b();
            this.f1984y.run();
        }
        this.f1970j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f11, float f12) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        int i15 = this.f1971k + i12;
        this.f1971k = i15;
        setActionBarHideOffset(i15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i11) {
        androidx.appcompat.app.c cVar;
        k kVar;
        this.A.f3900a = i11;
        this.f1971k = getActionBarHideOffset();
        b();
        p.b bVar = this.f1980u;
        if (bVar == null || (kVar = (cVar = (androidx.appcompat.app.c) bVar).f1832t) == null) {
            return;
        }
        kVar.a();
        cVar.f1832t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i11) {
        if ((i11 & 2) == 0 || this.f1964d.getVisibility() != 0) {
            return false;
        }
        return this.f1969i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1969i || this.f1970j) {
            return;
        }
        if (this.f1971k <= this.f1964d.getHeight()) {
            b();
            postDelayed(this.f1984y, 600L);
        } else {
            b();
            postDelayed(this.f1985z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i11) {
        super.onWindowSystemUiVisibilityChanged(i11);
        k();
        int i12 = this.l ^ i11;
        this.l = i11;
        boolean z11 = (i11 & 4) == 0;
        boolean z12 = (i11 & 256) != 0;
        p.b bVar = this.f1980u;
        if (bVar != null) {
            androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) bVar;
            cVar.f1827o = !z12;
            if (z11 || !z12) {
                if (cVar.f1829q) {
                    cVar.f1829q = false;
                    cVar.x(true);
                }
            } else if (!cVar.f1829q) {
                cVar.f1829q = true;
                cVar.x(true);
            }
        }
        if ((i12 & 256) == 0 || this.f1980u == null) {
            return;
        }
        ViewCompat.Z(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        this.f1962b = i11;
        p.b bVar = this.f1980u;
        if (bVar != null) {
            ((androidx.appcompat.app.c) bVar).f1826n = i11;
        }
    }

    public void setActionBarHideOffset(int i11) {
        b();
        this.f1964d.setTranslationY(-Math.max(0, Math.min(i11, this.f1964d.getHeight())));
    }

    public void setActionBarVisibilityCallback(p.b bVar) {
        this.f1980u = bVar;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.c) this.f1980u).f1826n = this.f1962b;
            int i11 = this.l;
            if (i11 != 0) {
                onWindowSystemUiVisibilityChanged(i11);
                ViewCompat.Z(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z11) {
        this.f1968h = z11;
    }

    public void setHideOnContentScrollEnabled(boolean z11) {
        if (z11 != this.f1969i) {
            this.f1969i = z11;
            if (z11) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i11) {
        k();
        h hVar = (h) this.f1965e;
        hVar.f2160d = i11 != 0 ? a0.x(hVar.f2157a.getContext(), i11) : null;
        hVar.c();
    }

    public void setLogo(int i11) {
        k();
        h hVar = (h) this.f1965e;
        hVar.f2161e = i11 != 0 ? a0.x(hVar.f2157a.getContext(), i11) : null;
        hVar.c();
    }

    @Override // p.a1
    public void setMenu(Menu menu, w wVar) {
        k();
        h hVar = (h) this.f1965e;
        Toolbar toolbar = hVar.f2157a;
        if (hVar.f2168m == null) {
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(toolbar.getContext());
            hVar.f2168m = aVar;
            aVar.f31500i = R.id.action_menu_presenter;
        }
        androidx.appcompat.widget.a aVar2 = hVar.f2168m;
        aVar2.f31496e = wVar;
        toolbar.setMenu((l) menu, aVar2);
    }

    @Override // p.a1
    public void setMenuPrepared() {
        k();
        ((h) this.f1965e).l = true;
    }

    public void setOverlayMode(boolean z11) {
        this.f1967g = z11;
    }

    @Override // p.a1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((h) this.f1965e).f2167k = callback;
    }

    @Override // p.a1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        h hVar = (h) this.f1965e;
        if (hVar.f2163g) {
            return;
        }
        Toolbar toolbar = hVar.f2157a;
        hVar.f2164h = charSequence;
        if ((hVar.f2158b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (hVar.f2163g) {
                ViewCompat.d0(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        h hVar = (h) this.f1965e;
        hVar.f2160d = drawable;
        hVar.c();
    }

    public void setShowingForActionMode(boolean z11) {
    }

    public void setUiOptions(int i11) {
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
    }

    @Override // h7.u
    public final void h(View view, int i11, int i12, int[] iArr, int i13) {
    }
}
