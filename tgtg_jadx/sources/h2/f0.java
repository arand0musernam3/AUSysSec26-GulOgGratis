package h2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z5.a f21102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21104d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f21108h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0[] f21101a = q.f21208a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21105e = 1;

    public f0(h0 h0Var) {
        this.f21108h = h0Var;
    }

    public static void b(f0 f0Var, r0 r0Var, v80.b0 b0Var, i4.e0 e0Var, int i11, int i12) {
        f0Var.f21108h.getClass();
        long j9 = r0Var.j(0);
        f0Var.a(r0Var, b0Var, e0Var, i11, i12, (int) (!r0Var.h() ? j9 & 4294967295L : j9 >> 32));
    }

    public final void a(r0 r0Var, v80.b0 b0Var, i4.e0 e0Var, int i11, int i12, int i13) {
        b0[] b0VarArr;
        b0[] b0VarArr2 = this.f21101a;
        int length = b0VarArr2.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                this.f21106f = i11;
                this.f21107g = i12;
                break;
            } else {
                b0 b0Var2 = b0VarArr2[i14];
                if (b0Var2 != null && b0Var2.f21049g) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        int iB = r0Var.b();
        int length2 = this.f21101a.length;
        while (true) {
            b0VarArr = this.f21101a;
            if (iB >= length2) {
                break;
            }
            b0 b0Var3 = b0VarArr[iB];
            if (b0Var3 != null) {
                b0Var3.c();
            }
            iB++;
        }
        if (b0VarArr.length != r0Var.b()) {
            this.f21101a = (b0[]) Arrays.copyOf(this.f21101a, r0Var.b());
        }
        this.f21102b = new z5.a(r0Var.g());
        this.f21103c = i13;
        this.f21104d = r0Var.k();
        this.f21105e = r0Var.e();
        int iB2 = r0Var.b();
        for (int i15 = 0; i15 < iB2; i15++) {
            Object objF = r0Var.f(i15);
            m mVar = objF instanceof m ? (m) objF : null;
            b0[] b0VarArr3 = this.f21101a;
            if (mVar == null) {
                b0 b0Var4 = b0VarArr3[i15];
                if (b0Var4 != null) {
                    b0Var4.c();
                }
                this.f21101a[i15] = null;
            } else {
                b0 b0Var5 = b0VarArr3[i15];
                if (b0Var5 == null) {
                    b0Var5 = new b0(b0Var, e0Var, new cw.b(this.f21108h, 27));
                    this.f21101a[i15] = b0Var5;
                }
                b0Var5.f21046d = mVar.f21167o;
                b0Var5.f21047e = mVar.f21168p;
                b0Var5.f21048f = mVar.f21169q;
            }
        }
    }
}
