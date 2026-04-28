package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f3689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3 f3690b;

    public d3(c3 c3Var) {
        this.f3689a = c3Var;
        b3 b3Var = new b3();
        b3Var.f3671a = 0;
        this.f3690b = b3Var;
    }

    public final View a(int i11, int i12, int i13, int i14) {
        c3 c3Var = this.f3689a;
        int iB = c3Var.b();
        int iC = c3Var.c();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        while (i11 != i12) {
            View viewD = c3Var.d(i11);
            int iA = c3Var.a(viewD);
            int iE = c3Var.e(viewD);
            b3 b3Var = this.f3690b;
            b3Var.f3672b = iB;
            b3Var.f3673c = iC;
            b3Var.f3674d = iA;
            b3Var.f3675e = iE;
            if (i13 != 0) {
                b3Var.f3671a = i13;
                if (b3Var.a()) {
                    return viewD;
                }
            }
            if (i14 != 0) {
                b3Var.f3671a = i14;
                if (b3Var.a()) {
                    view = viewD;
                }
            }
            i11 += i15;
        }
        return view;
    }

    public final boolean b(View view) {
        c3 c3Var = this.f3689a;
        int iB = c3Var.b();
        int iC = c3Var.c();
        int iA = c3Var.a(view);
        int iE = c3Var.e(view);
        b3 b3Var = this.f3690b;
        b3Var.f3672b = iB;
        b3Var.f3673c = iC;
        b3Var.f3674d = iA;
        b3Var.f3675e = iE;
        b3Var.f3671a = 24579;
        return b3Var.a();
    }
}
