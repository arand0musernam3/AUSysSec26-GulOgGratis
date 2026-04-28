package i5;

import a3.l3;
import android.os.CancellationSignal;
import m2.e1;
import m5.t0;
import v80.b2;
import w2.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23376b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f23375a = i11;
        this.f23376b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f23375a) {
            case 0:
                ((b2) this.f23376b).a(null);
                break;
            case 1:
                s1 s1Var = (s1) this.f23376b;
                v2.h hVar = s1Var.f43043a;
                y2.c cVar = y2.c.MergeIfPossible;
                hVar.f41936b.a().m();
                v2.a aVar = hVar.f41936b;
                aVar.f41925g = null;
                s1Var.l(aVar);
                v2.h.a(hVar, true, cVar);
                break;
            default:
                l3 l3Var = (l3) this.f23376b;
                if (l3Var != null) {
                    e1 e1Var = l3Var.f451d;
                    if (e1Var != null) {
                        e1Var.e(t0.f29648b);
                    }
                    e1 e1Var2 = l3Var.f451d;
                    if (e1Var2 != null) {
                        e1Var2.f(t0.f29648b);
                    }
                }
                break;
        }
    }
}
