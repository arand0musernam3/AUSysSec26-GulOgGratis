package h7;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WindowInsetsCompat f21546b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsCompat f21547a;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f21546b = (i11 >= 36 ? new w1() : i11 >= 35 ? new v1() : i11 >= 34 ? new u1() : i11 >= 31 ? new t1() : i11 >= 30 ? new s1() : i11 >= 29 ? new r1() : new p1()).b().a().b().c();
    }

    public g2(WindowInsetsCompat windowInsetsCompat) {
        this.f21547a = windowInsetsCompat;
    }

    public WindowInsetsCompat a() {
        return this.f21547a;
    }

    public WindowInsetsCompat b() {
        return this.f21547a;
    }

    public WindowInsetsCompat c() {
        return this.f21547a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return t() == g2Var.t() && s() == g2Var.s() && Objects.equals(n(), g2Var.n()) && Objects.equals(l(), g2Var.l()) && Objects.equals(h(), g2Var.h());
    }

    public List<Rect> f(int i11) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i11) {
        return Collections.EMPTY_LIST;
    }

    public j h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public x6.d i(int i11) {
        return x6.d.f43872e;
    }

    public x6.d j(int i11) {
        if ((i11 & 8) == 0) {
            return x6.d.f43872e;
        }
        i4.a.f("Unable to query the maximum insets for IME");
        return null;
    }

    public x6.d k() {
        return n();
    }

    public x6.d l() {
        return x6.d.f43872e;
    }

    public x6.d m() {
        return n();
    }

    public x6.d n() {
        return x6.d.f43872e;
    }

    public x6.d o() {
        return n();
    }

    public WindowInsetsCompat r(int i11, int i12, int i13, int i14) {
        return f21546b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i11) {
        return true;
    }

    public void q() {
    }

    public void A(int i11) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(WindowInsetsCompat windowInsetsCompat) {
    }

    public void p(View view) {
    }

    public void v(l lVar) {
    }

    public void w(x6.d[] dVarArr) {
    }

    public void x(x6.d dVar) {
    }

    public void y(WindowInsetsCompat windowInsetsCompat) {
    }

    public void z(x6.d dVar) {
    }
}
