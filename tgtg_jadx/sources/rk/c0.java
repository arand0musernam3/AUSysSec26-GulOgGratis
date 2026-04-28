package rk;

import kotlin.jvm.functions.Function1;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38053a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f38054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f38055c;

    public c0(Function1 function1, b1 b1Var) {
        this.f38055c = function1;
        this.f38054b = b1Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f38053a) {
            case 0:
                b4.t tVar = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar.getClass();
                m3.s sVar = (m3.s) ((m3.n) obj2);
                sVar.a0(1702118549);
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = w.a0.g(sVar);
                }
                b4.t tVarB = androidx.compose.foundation.b.b(tVar, (b2.l) objM, null, false, null, null, new b0(this.f38055c, this.f38054b), 28);
                sVar.q(false);
                return tVarB;
            default:
                b4.t tVar2 = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar2.getClass();
                m3.s sVar2 = (m3.s) ((m3.n) obj2);
                sVar2.a0(1702118549);
                Object objM2 = sVar2.M();
                if (objM2 == m3.m.f29332a) {
                    objM2 = w.a0.g(sVar2);
                }
                b4.t tVarB2 = androidx.compose.foundation.b.b(tVar2, (b2.l) objM2, null, false, null, null, new b0(this.f38054b, this.f38055c), 28);
                sVar2.q(false);
                return tVarB2;
        }
    }

    public c0(b1 b1Var, Function1 function1) {
        this.f38054b = b1Var;
        this.f38055c = function1;
    }
}
