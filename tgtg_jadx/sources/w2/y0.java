package w2;

import c5.x1;
import c5.x3;
import c5.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.d3;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f43081b;

    public /* synthetic */ y0(e1 e1Var, int i11) {
        this.f43080a = i11;
        this.f43081b = e1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f43080a) {
            case 0:
                break;
            case 1:
                e1 e1Var = this.f43081b;
                v80.f0.B(e1Var.getCoroutineScope(), null, null, new b1(e1Var, null, 0), 3);
                break;
            case 2:
                e1 e1Var2 = this.f43081b;
                v80.f0.B(e1Var2.getCoroutineScope(), null, null, new b1(e1Var2, null, 1), 3);
                break;
            case 3:
                d3 d3Var = x1.f7427t;
                e1 e1Var3 = this.f43081b;
                e1Var3.C = (x3) b5.o.e(e1Var3, d3Var);
                e1Var3.f42880s.f43784d = e1Var3.R0();
                x70.c cVar = null;
                if (e1Var3.R0() && e1Var3.D == null) {
                    e1Var3.D = v80.f0.B(e1Var3.getCoroutineScope(), null, null, new b1(e1Var3, cVar, 4), 3);
                } else if (!e1Var3.R0()) {
                    b2 b2Var = e1Var3.D;
                    if (b2Var != null) {
                        b2Var.a(null);
                    }
                    e1Var3.D = null;
                }
                break;
            case 4:
                b5.m.d(this.f43081b);
                break;
            case 5:
                b5.m.d(this.f43081b);
                break;
            case 6:
                x1.a.a(this.f43081b);
                break;
            case 7:
                x1.a.a(this.f43081b);
                break;
            case 8:
                e1 e1Var4 = this.f43081b;
                v80.f0.B(e1Var4.getCoroutineScope(), null, null, new b1(e1Var4, null, 2), 3);
                break;
            case 9:
                e1 e1Var5 = this.f43081b;
                if (e1Var5.R0()) {
                    ((z1) e1Var5.S0()).b();
                } else {
                    v1.p0 p0Var = e1Var5.f42886y;
                    if (p0Var.isAttached()) {
                        ((g4.g0) p0Var.f41820v).S0(7);
                    }
                }
                break;
            case 10:
                e1 e1Var6 = this.f43081b;
                if (!e1Var6.R0()) {
                    v1.p0 p0Var2 = e1Var6.f42886y;
                    if (p0Var2.isAttached()) {
                        ((g4.g0) p0Var2.f41820v).S0(7);
                    }
                }
                e1Var6.f42880s.w(x2.b0.Selection);
                break;
            case 11:
                e1 e1Var7 = this.f43081b;
                if (e1Var7.G != null) {
                    ((z1) e1Var7.S0()).b();
                } else {
                    e1Var7.T0(true);
                }
                break;
            default:
                this.f43081b.f42880s.w(x2.b0.Selection);
                break;
        }
        return Unit.f26487a;
    }
}
