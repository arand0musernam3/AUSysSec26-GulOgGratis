package y00;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t3 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f45169f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, x1 x1Var, int i11) {
        super(x1Var);
        this.f45168e = i11;
        this.f45169f = obj;
    }

    @Override // y00.n
    public final void a() {
        switch (this.f45168e) {
            case 0:
                od.f fVar = (od.f) this.f45169f;
                u3 u3Var = (u3) fVar.f32443d;
                u3Var.p();
                n1 n1Var = (n1) u3Var.f21216b;
                n1Var.f44992k.getClass();
                fVar.r(SystemClock.elapsedRealtime(), false, false);
                a0 a0Var = n1Var.f44994n;
                n1.j(a0Var);
                n1Var.f44992k.getClass();
                a0Var.s(SystemClock.elapsedRealtime());
                break;
            case 1:
                z3 z3Var = (z3) this.f45169f;
                z3Var.u();
                w0 w0Var = ((n1) z3Var.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45267o.a("Starting upload from DelayedRunnable");
                z3Var.f44586c.q();
                break;
            default:
                l4 l4Var = (l4) this.f45169f;
                l4Var.d().p();
                String str = (String) l4Var.f44935q.pollFirst();
                if (str != null) {
                    l4Var.c().getClass();
                    l4Var.I = SystemClock.elapsedRealtime();
                    l4Var.b().f45267o.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    l4.S(l4Var.l.f44982a, intent);
                }
                l4Var.H();
                break;
        }
    }
}
