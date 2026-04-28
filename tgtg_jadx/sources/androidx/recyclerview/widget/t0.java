package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1 f3920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3924e;

    public t0() {
        c();
    }

    public final void a() {
        boolean z11 = this.f3923d;
        f1 f1Var = this.f3920a;
        this.f3922c = z11 ? f1Var.g() : f1Var.k();
    }

    public final void b(int i11, View view) {
        f1 f1Var = this.f3920a;
        int iL = Integer.MIN_VALUE == f1Var.f3729b ? 0 : f1Var.l() - f1Var.f3729b;
        if (iL >= 0) {
            boolean z11 = this.f3923d;
            f1 f1Var2 = this.f3920a;
            if (z11) {
                int iB = f1Var2.b(view);
                f1 f1Var3 = this.f3920a;
                this.f3922c = (Integer.MIN_VALUE != f1Var3.f3729b ? f1Var3.l() - f1Var3.f3729b : 0) + iB;
            } else {
                this.f3922c = f1Var2.e(view);
            }
            this.f3921b = i11;
            return;
        }
        this.f3921b = i11;
        boolean z12 = this.f3923d;
        f1 f1Var4 = this.f3920a;
        if (!z12) {
            int iE = f1Var4.e(view);
            int iK = iE - this.f3920a.k();
            this.f3922c = iE;
            if (iK > 0) {
                int iG = (this.f3920a.g() - Math.min(0, (this.f3920a.g() - iL) - this.f3920a.b(view))) - (this.f3920a.c(view) + iE);
                if (iG < 0) {
                    this.f3922c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (f1Var4.g() - iL) - this.f3920a.b(view);
        this.f3922c = this.f3920a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f3922c - this.f3920a.c(view);
            int iK2 = this.f3920a.k();
            int iMin = iC - (Math.min(this.f3920a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f3922c = Math.min(iG2, -iMin) + this.f3922c;
            }
        }
    }

    public final void c() {
        this.f3921b = -1;
        this.f3922c = Integer.MIN_VALUE;
        this.f3923d = false;
        this.f3924e = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
        sb2.append(this.f3921b);
        sb2.append(", mCoordinate=");
        sb2.append(this.f3922c);
        sb2.append(", mLayoutFromEnd=");
        sb2.append(this.f3923d);
        sb2.append(", mValid=");
        return r8.k.q(sb2, this.f3924e, '}');
    }
}
