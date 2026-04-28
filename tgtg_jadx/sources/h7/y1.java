package h7;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class y1 extends g2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f21631n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Method f21632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Class f21633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Field f21634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Field f21635r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f21636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x6.d[] f21637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x6.d f21638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WindowInsetsCompat f21639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x6.d f21640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f21642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21644k;
    public Rect[][] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Rect[][] f21645m;

    public y1(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat);
        this.f21638e = null;
        this.l = new Rect[10][];
        this.f21645m = new Rect[10][];
        this.f21636c = windowInsets;
    }

    private l D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f21547a.r()) {
            return l.a(true, point.x, point.y, 0, 0, 0, 0);
        }
        a0 a0VarH = b7.a.h(display, 0);
        a0 a0VarH2 = b7.a.h(display, 1);
        a0 a0VarH3 = b7.a.h(display, 2);
        a0 a0VarH4 = b7.a.h(display, 3);
        return l.a(false, point.x, point.y, a0VarH != null ? a0VarH.f21512b : 0, a0VarH2 != null ? a0VarH2.f21512b : 0, a0VarH3 != null ? a0VarH3.f21512b : 0, a0VarH4 != null ? a0VarH4.f21512b : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i11) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i11 & i12) != 0 && (rectArr2 = rectArr[h2.d(i12)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(x6.d dVar) {
        ArrayList arrayList = new ArrayList();
        if (dVar.f43873a != 0) {
            arrayList.add(new Rect(0, 0, dVar.f43873a, this.f21643j));
        }
        if (dVar.f43874b != 0) {
            arrayList.add(new Rect(0, 0, this.f21644k, dVar.f43874b));
        }
        if (dVar.f43875c != 0) {
            int i11 = this.f21644k;
            arrayList.add(new Rect(i11 - dVar.f43875c, 0, i11, this.f21643j));
        }
        if (dVar.f43876d != 0) {
            int i12 = this.f21643j;
            arrayList.add(new Rect(0, i12 - dVar.f43876d, this.f21644k, i12));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    private x6.d G(int i11, boolean z11) {
        x6.d dVarA = x6.d.f43872e;
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i11 & i12) != 0) {
                dVarA = x6.d.a(dVarA, H(i12, z11));
            }
        }
        return dVarA;
    }

    private x6.d I() {
        WindowInsetsCompat windowInsetsCompat = this.f21639f;
        return windowInsetsCompat != null ? windowInsetsCompat.g() : x6.d.f43872e;
    }

    private x6.d J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            com.braze.h2.a("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f21631n) {
            L();
        }
        Method method = f21632o;
        if (method != null && f21633p != null && f21634q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f21634q.get(f21635r.get(objInvoke));
                if (rect != null) {
                    return x6.d.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e5) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void L() {
        try {
            f21632o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f21633p = cls;
            f21634q = cls.getDeclaredField("mVisibleInsets");
            f21635r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f21634q.setAccessible(true);
            f21635r.setAccessible(true);
        } catch (ReflectiveOperationException e5) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
        }
        f21631n = true;
    }

    public static boolean M(int i11, int i12) {
        return (i11 & 6) == (i12 & 6);
    }

    @Override // h7.g2
    public void A(int i11) {
        this.f21641h = i11;
    }

    @Override // h7.g2
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // h7.g2
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f21645m = (Rect[][]) rectArr.clone();
    }

    public x6.d H(int i11, boolean z11) {
        x6.d dVarG;
        int i12;
        x6.d dVar = x6.d.f43872e;
        if (i11 == 1) {
            return z11 ? x6.d.b(0, Math.max(I().f43874b, n().f43874b), 0, 0) : (this.f21641h & 4) != 0 ? dVar : x6.d.b(0, n().f43874b, 0, 0);
        }
        if (i11 == 2) {
            if (z11) {
                x6.d dVarI = I();
                x6.d dVarL = l();
                return x6.d.b(Math.max(dVarI.f43873a, dVarL.f43873a), 0, Math.max(dVarI.f43875c, dVarL.f43875c), Math.max(dVarI.f43876d, dVarL.f43876d));
            }
            if ((this.f21641h & 2) != 0) {
                return dVar;
            }
            x6.d dVarN = n();
            WindowInsetsCompat windowInsetsCompat = this.f21639f;
            dVarG = windowInsetsCompat != null ? windowInsetsCompat.g() : null;
            int iMin = dVarN.f43876d;
            if (dVarG != null) {
                iMin = Math.min(iMin, dVarG.f43876d);
            }
            return x6.d.b(dVarN.f43873a, 0, dVarN.f43875c, iMin);
        }
        if (i11 != 8) {
            if (i11 == 16) {
                return m();
            }
            if (i11 == 32) {
                return k();
            }
            if (i11 == 64) {
                return o();
            }
            if (i11 != 128) {
                return dVar;
            }
            WindowInsetsCompat windowInsetsCompat2 = this.f21639f;
            j jVarD = windowInsetsCompat2 != null ? windowInsetsCompat2.d() : h();
            return jVarD != null ? x6.d.b(jVarD.c(), jVarD.e(), jVarD.d(), jVarD.b()) : dVar;
        }
        x6.d[] dVarArr = this.f21637d;
        dVarG = dVarArr != null ? dVarArr[h2.d(8)] : null;
        if (dVarG != null) {
            return dVarG;
        }
        x6.d dVarN2 = n();
        x6.d dVarI2 = I();
        int i13 = dVarN2.f43876d;
        if (i13 > dVarI2.f43876d) {
            return x6.d.b(0, 0, 0, i13);
        }
        x6.d dVar2 = this.f21640g;
        return (dVar2 == null || dVar2.equals(dVar) || (i12 = this.f21640g.f43876d) <= dVarI2.f43876d) ? dVar : x6.d.b(0, 0, 0, i12);
    }

    public boolean K(int i11) {
        if (i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 8 && i11 != 128) {
                return true;
            }
        }
        return !H(i11, false).equals(x6.d.f43872e);
    }

    @Override // h7.g2
    public void d(View view) {
        this.f21644k = view.getWidth();
        this.f21643j = view.getHeight();
        x6.d dVarJ = J(view);
        if (dVarJ == null) {
            dVarJ = x6.d.f43872e;
        }
        x(dVarJ);
    }

    @Override // h7.g2
    public void e(WindowInsetsCompat windowInsetsCompat) {
        windowInsetsCompat.f2741a.y(this.f21639f);
        x6.d dVar = this.f21640g;
        g2 g2Var = windowInsetsCompat.f2741a;
        g2Var.x(dVar);
        g2Var.A(this.f21641h);
        g2Var.v(this.f21642i);
        g2Var.B(this.l);
        g2Var.C(this.f21645m);
    }

    @Override // h7.g2
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Objects.equals(this.f21640g, y1Var.f21640g) && M(this.f21641h, y1Var.f21641h);
    }

    @Override // h7.g2
    public List<Rect> f(int i11) {
        return E(this.l, i11);
    }

    @Override // h7.g2
    public List<Rect> g(int i11) {
        return E(this.f21645m, i11);
    }

    @Override // h7.g2
    public x6.d i(int i11) {
        return G(i11, false);
    }

    @Override // h7.g2
    public x6.d j(int i11) {
        return G(i11, true);
    }

    @Override // h7.g2
    public final x6.d n() {
        if (this.f21638e == null) {
            WindowInsets windowInsets = this.f21636c;
            this.f21638e = x6.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f21638e;
    }

    @Override // h7.g2
    public void p(View view) {
        this.f21642i = D(view);
    }

    @Override // h7.g2
    @SuppressLint({"WrongConstant"})
    public void q() {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            int iD = h2.d(i11);
            this.l[iD] = F(i(i11));
            if (i11 != 8) {
                this.f21645m[iD] = F(j(i11));
            }
        }
    }

    @Override // h7.g2
    public WindowInsetsCompat r(int i11, int i12, int i13, int i14) {
        WindowInsetsCompat windowInsetsCompatV = WindowInsetsCompat.v(this.f21636c);
        int i15 = Build.VERSION.SDK_INT;
        x1 w1Var = i15 >= 36 ? new w1(windowInsetsCompatV) : i15 >= 35 ? new v1(windowInsetsCompatV) : i15 >= 34 ? new u1(windowInsetsCompatV) : i15 >= 31 ? new t1(windowInsetsCompatV) : i15 >= 30 ? new s1(windowInsetsCompatV) : i15 >= 29 ? new r1(windowInsetsCompatV) : new p1(windowInsetsCompatV);
        w1Var.h(WindowInsetsCompat.p(n(), i11, i12, i13, i14));
        w1Var.f(WindowInsetsCompat.p(l(), i11, i12, i13, i14));
        return w1Var.b();
    }

    @Override // h7.g2
    public boolean t() {
        return this.f21636c.isRound();
    }

    @Override // h7.g2
    @SuppressLint({"WrongConstant"})
    public boolean u(int i11) {
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i11 & i12) != 0 && !K(i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // h7.g2
    public void v(l lVar) {
        this.f21642i = lVar;
    }

    @Override // h7.g2
    public void w(x6.d[] dVarArr) {
        this.f21637d = dVarArr;
    }

    @Override // h7.g2
    public void x(x6.d dVar) {
        this.f21640g = dVar;
    }

    @Override // h7.g2
    public void y(WindowInsetsCompat windowInsetsCompat) {
        this.f21639f = windowInsetsCompat;
    }

    public y1(WindowInsetsCompat windowInsetsCompat, y1 y1Var) {
        this(windowInsetsCompat, new WindowInsets(y1Var.f21636c));
    }
}
