package f0;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f16738b;

    public /* synthetic */ k0(p0 p0Var, int i11) {
        this.f16737a = i11;
        this.f16738b = p0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        switch (this.f16737a) {
            case 0:
                p0 p0Var = this.f16738b;
                synchronized (p0Var.f16829q) {
                    p0Var.f16831s = e0.i.f15348f;
                    Log.d("CXCP", p0Var + " is closed");
                }
                g0 g0Var = p0Var.f16827o;
                Log.d("CXCP", p0Var + " finalized");
                synchronized (g0Var.f16679f) {
                    g0Var.f16680g.remove(p0Var);
                }
                v80.q qVar = p0Var.f16836x;
                Unit unit = Unit.f26487a;
                qVar.R(unit);
                v80.f0.j(p0Var.f16814a, null);
                return unit;
            default:
                p0 p0Var2 = this.f16738b;
                ((Unit) obj).getClass();
                synchronized (p0Var2.f16829q) {
                    z11 = p0Var2.f16830r;
                }
                return Boolean.valueOf(z11);
        }
    }
}
