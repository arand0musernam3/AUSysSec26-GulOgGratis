package rk;

import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f38094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f38095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f38096c;

    public o(boolean z11, Function0 function0, b1 b1Var) {
        this.f38094a = z11;
        this.f38095b = function0;
        this.f38096c = b1Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b4.t tVar = (b4.t) obj;
        ((Number) obj3).intValue();
        tVar.getClass();
        m3.s sVar = (m3.s) ((m3.n) obj2);
        sVar.a0(1702118549);
        Object objM = sVar.M();
        if (objM == m3.m.f29332a) {
            objM = w.a0.g(sVar);
        }
        b4.t tVarB = androidx.compose.foundation.b.b(tVar, (b2.l) objM, null, false, null, null, new n(this.f38094a, this.f38095b, this.f38096c), 28);
        sVar.q(false);
        return tVarB;
    }
}
