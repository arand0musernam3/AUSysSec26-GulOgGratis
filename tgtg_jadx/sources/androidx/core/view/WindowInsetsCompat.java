package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import h7.a2;
import h7.b2;
import h7.c2;
import h7.d2;
import h7.e2;
import h7.f2;
import h7.g2;
import h7.h2;
import h7.j;
import h7.p1;
import h7.r1;
import h7.s1;
import h7.t1;
import h7.u1;
import h7.v1;
import h7.w1;
import h7.x1;
import h7.y1;
import h7.z1;
import java.util.Objects;
import x6.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WindowInsetsCompat f2740b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f2741a;

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            f2740b = e2.f21534x;
        } else if (i11 >= 30) {
            f2740b = c2.f21525w;
        } else {
            f2740b = g2.f21546b;
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat == null) {
            this.f2741a = new g2(this);
            return;
        }
        g2 g2Var = windowInsetsCompat.f2741a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35 && (g2Var instanceof f2)) {
            this.f2741a = new f2(this, (f2) g2Var);
        } else if (i11 >= 34 && (g2Var instanceof e2)) {
            this.f2741a = new e2(this, (e2) g2Var);
        } else if (i11 >= 31 && (g2Var instanceof d2)) {
            this.f2741a = new d2(this, (d2) g2Var);
        } else if (i11 >= 30 && (g2Var instanceof c2)) {
            this.f2741a = new c2(this, (c2) g2Var);
        } else if (i11 >= 29 && (g2Var instanceof b2)) {
            this.f2741a = new b2(this, (b2) g2Var);
        } else if (i11 >= 28 && (g2Var instanceof a2)) {
            this.f2741a = new a2(this, (a2) g2Var);
        } else if (g2Var instanceof z1) {
            this.f2741a = new z1(this, (z1) g2Var);
        } else if (g2Var instanceof y1) {
            this.f2741a = new y1(this, (y1) g2Var);
        } else {
            this.f2741a = new g2(this);
        }
        g2Var.e(this);
    }

    public static d p(d dVar, int i11, int i12, int i13, int i14) {
        int iMax = Math.max(0, dVar.f43873a - i11);
        int iMax2 = Math.max(0, dVar.f43874b - i12);
        int iMax3 = Math.max(0, dVar.f43875c - i13);
        int iMax4 = Math.max(0, dVar.f43876d - i14);
        return (iMax == i11 && iMax2 == i12 && iMax3 == i13 && iMax4 == i14) ? dVar : d.b(iMax, iMax2, iMax3, iMax4);
    }

    public static WindowInsetsCompat v(WindowInsets windowInsets) {
        return w(windowInsets, null);
    }

    public static WindowInsetsCompat w(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WindowInsetsCompat windowInsetsCompatY = ViewCompat.y(view);
            g2 g2Var = windowInsetsCompat.f2741a;
            g2Var.y(windowInsetsCompatY);
            View rootView = view.getRootView();
            g2Var.d(rootView);
            g2Var.p(rootView);
            g2Var.q();
            g2Var.A(view.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public WindowInsetsCompat a() {
        return this.f2741a.a();
    }

    @Deprecated
    public WindowInsetsCompat b() {
        return this.f2741a.b();
    }

    @Deprecated
    public WindowInsetsCompat c() {
        return this.f2741a.c();
    }

    public j d() {
        return this.f2741a.h();
    }

    public d e(int i11) {
        return this.f2741a.i(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return Objects.equals(this.f2741a, ((WindowInsetsCompat) obj).f2741a);
        }
        return false;
    }

    public d f(int i11) {
        return this.f2741a.j(i11);
    }

    @Deprecated
    public d g() {
        return this.f2741a.l();
    }

    @Deprecated
    public d h() {
        return this.f2741a.m();
    }

    public int hashCode() {
        g2 g2Var = this.f2741a;
        if (g2Var == null) {
            return 0;
        }
        return g2Var.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f2741a.n().f43876d;
    }

    @Deprecated
    public int j() {
        return this.f2741a.n().f43873a;
    }

    @Deprecated
    public int k() {
        return this.f2741a.n().f43875c;
    }

    @Deprecated
    public int l() {
        return this.f2741a.n().f43874b;
    }

    public boolean m() {
        d dVarE = e(-1);
        d dVar = d.f43872e;
        return (dVarE.equals(dVar) && f((-1) ^ h2.c()).equals(dVar) && d() == null) ? false : true;
    }

    @Deprecated
    public boolean n() {
        return !this.f2741a.n().equals(d.f43872e);
    }

    public WindowInsetsCompat o(int i11, int i12, int i13, int i14) {
        return this.f2741a.r(i11, i12, i13, i14);
    }

    public boolean q() {
        return this.f2741a.s();
    }

    public boolean r() {
        return this.f2741a.t();
    }

    public boolean s(int i11) {
        return this.f2741a.u(i11);
    }

    @Deprecated
    public WindowInsetsCompat t(int i11, int i12, int i13, int i14) {
        int i15 = Build.VERSION.SDK_INT;
        x1 w1Var = i15 >= 36 ? new w1(this) : i15 >= 35 ? new v1(this) : i15 >= 34 ? new u1(this) : i15 >= 31 ? new t1(this) : i15 >= 30 ? new s1(this) : i15 >= 29 ? new r1(this) : new p1(this);
        w1Var.h(d.b(i11, i12, i13, i14));
        return w1Var.b();
    }

    public WindowInsets u() {
        g2 g2Var = this.f2741a;
        if (g2Var instanceof y1) {
            return ((y1) g2Var).f21636c;
        }
        return null;
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            this.f2741a = new f2(this, windowInsets);
            return;
        }
        if (i11 >= 34) {
            this.f2741a = new e2(this, windowInsets);
            return;
        }
        if (i11 >= 31) {
            this.f2741a = new d2(this, windowInsets);
            return;
        }
        if (i11 >= 30) {
            this.f2741a = new c2(this, windowInsets);
            return;
        }
        if (i11 >= 29) {
            this.f2741a = new b2(this, windowInsets);
        } else if (i11 >= 28) {
            this.f2741a = new a2(this, windowInsets);
        } else {
            this.f2741a = new z1(this, windowInsets);
        }
    }
}
