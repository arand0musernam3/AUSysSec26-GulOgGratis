package f0;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f16795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f16796b;

    public o0(Ref.ObjectRef objectRef, p0 p0Var) {
        this.f16795a = objectRef;
        this.f16796b = p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        v1 v1Var = (v1) obj;
        if (v1Var instanceof y1) {
            s2 s2Var = (s2) this.f16795a.element;
            r1 r1Var = ((y1) v1Var).f17003a;
            synchronized (s2Var.f16888k) {
                m2 m2Var = s2Var.f16897u;
                if (m2Var != m2.CLOSING && m2Var != m2.CLOSED) {
                    s2Var.f16893q = r1Var;
                    v80.f0.B(s2Var.f16886i, null, null, new n2(s2Var, null, 0), 3);
                }
            }
        } else if (v1Var instanceof x1) {
            ((s2) this.f16795a.element).o();
        } else if (v1Var instanceof w1) {
            ((s2) this.f16795a.element).o();
            p0 p0Var = this.f16796b;
            w1 w1Var = (w1) v1Var;
            synchronized (p0Var.f16829q) {
                try {
                    if (!p0Var.e()) {
                        e0.l lVar = w1Var.f16958i;
                        if (lVar != null) {
                            p0Var.f16833u = lVar;
                            int i11 = lVar.f15363a;
                            if (i11 == 6 || i11 == 1 || i11 == 2) {
                                p0Var.f16831s = e0.i.f15350h;
                                Log.d("CXCP", p0Var + " is disconnected");
                            } else {
                                p0Var.f16831s = e0.i.f15351i;
                                Log.d("CXCP", p0Var + " encountered error: " + ((Object) e0.l.a(w1Var.f16958i.f15363a)));
                            }
                        } else {
                            p0Var.f16831s = e0.i.f15353k;
                        }
                        p0Var.f16819f.g();
                        p0Var.g();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Unit.f26487a;
    }
}
