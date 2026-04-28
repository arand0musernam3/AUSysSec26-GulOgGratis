package y00;

import com.google.android.gms.internal.measurement.i9;
import com.google.android.gms.internal.measurement.x7;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t4 f45084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f45085c;

    public /* synthetic */ q1(v1 v1Var, t4 t4Var, int i11) {
        this.f45083a = i11;
        this.f45084b = t4Var;
        this.f45085c = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f45083a) {
            case 0:
                v1 v1Var = this.f45085c;
                v1Var.f45249g.W();
                l4 l4Var = v1Var.f45249g;
                l4Var.d().p();
                l4Var.m0();
                t4 t4Var = this.f45084b;
                com.google.android.gms.common.internal.i0.h(t4Var);
                String str = t4Var.f45170a;
                com.google.android.gms.common.internal.i0.e(str);
                int i11 = 0;
                if (l4Var.f0().A(null, g0.f44819y0)) {
                    l4Var.c().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iY = l4Var.f0().y(null, g0.f44784h0);
                    l4Var.f0();
                    long jLongValue = jCurrentTimeMillis - ((Long) g0.f44774e.a(null)).longValue();
                    while (i11 < iY && l4Var.I(jLongValue, null)) {
                        i11++;
                    }
                } else {
                    l4Var.f0();
                    long jIntValue = ((Integer) g0.l.a(null)).intValue();
                    while (i11 < jIntValue && l4Var.I(0L, str)) {
                        i11++;
                    }
                }
                if (l4Var.f0().A(null, g0.f44821z0)) {
                    l4Var.d().p();
                    l4Var.H();
                }
                h4 h4Var = l4Var.f44929j;
                i9 i9VarC = i9.c(t4Var.E);
                h4Var.p();
                if (i9VarC == i9.CLIENT_UPLOAD_ELIGIBLE && !h4.s(str)) {
                    h1 h1Var = h4Var.f44586c.f44920a;
                    l4.U(h1Var);
                    x7 x7VarB = h1Var.B(str);
                    if (x7VarB != null && x7VarB.H() && !x7VarB.I().u().isEmpty()) {
                        l4Var.b().f45267o.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        l4Var.c().getClass();
                        l4Var.r(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 1:
                v1 v1Var2 = this.f45085c;
                v1Var2.f45249g.W();
                l4 l4Var2 = v1Var2.f45249g;
                l4Var2.d().p();
                l4Var2.m0();
                t4 t4Var2 = this.f45084b;
                com.google.android.gms.common.internal.i0.e(t4Var2.f45170a);
                l4Var2.d0(t4Var2);
                break;
            case 2:
                v1 v1Var3 = this.f45085c;
                v1Var3.f45249g.W();
                l4 l4Var3 = v1Var3.f45249g;
                l4Var3.d().p();
                l4Var3.m0();
                t4 t4Var3 = this.f45084b;
                com.google.android.gms.common.internal.i0.e(t4Var3.f45170a);
                l4Var3.n0(t4Var3);
                l4Var3.o0(t4Var3);
                break;
            default:
                l4 l4Var4 = this.f45085c.f45249g;
                l4Var4.W();
                l4Var4.n0(this.f45084b);
                break;
        }
    }
}
