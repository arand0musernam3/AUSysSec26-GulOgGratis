package r5;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import h7.h2;
import m5.k0;
import m5.t0;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h7.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37676a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f37681f;

    public i(m5.h hVar, long j9) {
        String str = hVar.f29538b;
        mv.b0 b0Var = new mv.b0(2);
        b0Var.f30157e = str;
        b0Var.f30154b = -1;
        b0Var.f30155c = -1;
        this.f37681f = b0Var;
        this.f37677b = t0.g(j9);
        this.f37678c = t0.f(j9);
        this.f37679d = -1;
        this.f37680e = -1;
        int iG = t0.g(j9);
        int iF = t0.f(j9);
        if (iG < 0 || iG > str.length()) {
            org.bouncycastle.jce.provider.a.e(str.length(), org.bouncycastle.jcajce.provider.asymmetric.a.k(iG, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iF < 0 || iF > str.length()) {
            org.bouncycastle.jce.provider.a.e(str.length(), org.bouncycastle.jcajce.provider.asymmetric.a.k(iF, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iG <= iF) {
            return;
        }
        i4.a.f(r8.k.k("Do not set reversed range: ", iG, iF, " > "));
        throw null;
    }

    public void a(int i11, int i12) {
        long jB = k0.b(i11, i12);
        ((mv.b0) this.f37681f).I(i11, i12, "");
        long jI = x0.I(k0.b(this.f37677b, this.f37678c), jB);
        h(t0.g(jI));
        g(t0.f(jI));
        int i13 = this.f37679d;
        if (i13 != -1) {
            long jI2 = x0.I(k0.b(i13, this.f37680e), jB);
            if (t0.d(jI2)) {
                this.f37679d = -1;
                this.f37680e = -1;
            } else {
                this.f37679d = t0.g(jI2);
                this.f37680e = t0.f(jI2);
            }
        }
    }

    public char b(int i11) {
        mv.b0 b0Var = (mv.b0) this.f37681f;
        k kVar = (k) b0Var.f30156d;
        if (kVar == null) {
            return ((String) b0Var.f30157e).charAt(i11);
        }
        if (i11 < b0Var.f30154b) {
            return ((String) b0Var.f30157e).charAt(i11);
        }
        int iA = kVar.f37683b - kVar.a();
        int i12 = b0Var.f30154b;
        if (i11 >= iA + i12) {
            return ((String) b0Var.f30157e).charAt(i11 - ((iA - b0Var.f30155c) + i12));
        }
        int i13 = i11 - i12;
        int i14 = kVar.f37685d;
        char[] cArr = kVar.f37684c;
        return i13 < i14 ? cArr[i13] : cArr[(i13 - i14) + kVar.f37686e];
    }

    public t0 c() {
        int i11 = this.f37679d;
        if (i11 != -1) {
            return new t0(k0.b(i11, this.f37680e));
        }
        return null;
    }

    public void d(int i11, int i12, String str) {
        mv.b0 b0Var = (mv.b0) this.f37681f;
        if (i11 < 0 || i11 > b0Var.p()) {
            org.bouncycastle.jce.provider.a.e(b0Var.p(), org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "start (", ") offset is outside of text region "));
            return;
        }
        if (i12 < 0 || i12 > b0Var.p()) {
            org.bouncycastle.jce.provider.a.e(b0Var.p(), org.bouncycastle.jcajce.provider.asymmetric.a.k(i12, "end (", ") offset is outside of text region "));
        } else {
            if (i11 > i12) {
                i4.a.f(r8.k.k("Do not set reversed range: ", i11, i12, " > "));
                return;
            }
            b0Var.I(i11, i12, str);
            h(str.length() + i11);
            g(str.length() + i11);
            this.f37679d = -1;
            this.f37680e = -1;
        }
    }

    public void e(int i11, int i12) {
        mv.b0 b0Var = (mv.b0) this.f37681f;
        if (i11 < 0 || i11 > b0Var.p()) {
            org.bouncycastle.jce.provider.a.e(b0Var.p(), org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "start (", ") offset is outside of text region "));
        } else if (i12 < 0 || i12 > b0Var.p()) {
            org.bouncycastle.jce.provider.a.e(b0Var.p(), org.bouncycastle.jcajce.provider.asymmetric.a.k(i12, "end (", ") offset is outside of text region "));
        } else if (i11 >= i12) {
            i4.a.f(r8.k.k("Do not set reversed or empty range: ", i11, i12, " > "));
        } else {
            this.f37679d = i11;
            this.f37680e = i12;
        }
    }

    public void f(int i11, int i12) {
        mv.b0 b0Var = (mv.b0) this.f37681f;
        if (i11 < 0 || i11 > b0Var.p()) {
            org.bouncycastle.jce.provider.a.e(b0Var.p(), org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "start (", ") offset is outside of text region "));
        } else if (i12 < 0 || i12 > b0Var.p()) {
            org.bouncycastle.jce.provider.a.e(b0Var.p(), org.bouncycastle.jcajce.provider.asymmetric.a.k(i12, "end (", ") offset is outside of text region "));
        } else if (i11 > i12) {
            i4.a.f(r8.k.k("Do not set reversed range: ", i11, i12, " > "));
        } else {
            h(i11);
            g(i12);
        }
    }

    public void g(int i11) {
        if (!(i11 >= 0)) {
            s5.a.a("Cannot set selectionEnd to a negative value: " + i11);
        }
        this.f37678c = i11;
    }

    public void h(int i11) {
        if (!(i11 >= 0)) {
            s5.a.a("Cannot set selectionStart to a negative value: " + i11);
        }
        this.f37677b = i11;
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        View view2 = (View) this.f37681f;
        x6.d dVarE = windowInsetsCompat.e(h2.h());
        int i11 = this.f37677b;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + dVarE.f43874b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f37678c + dVarE.f43873a, this.f37679d + dVarE.f43874b, this.f37680e + dVarE.f43875c, view2.getPaddingBottom());
        return windowInsetsCompat;
    }

    public String toString() {
        switch (this.f37676a) {
            case 0:
                return ((mv.b0) this.f37681f).toString();
            default:
                return super.toString();
        }
    }

    public i(View view, int i11, int i12, int i13, int i14) {
        this.f37677b = i11;
        this.f37681f = view;
        this.f37678c = i12;
        this.f37679d = i13;
        this.f37680e = i14;
    }
}
