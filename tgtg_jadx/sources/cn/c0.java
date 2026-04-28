package cn;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f8489b;

    public /* synthetic */ c0(int i11, Function2 function2) {
        this.f8488a = i11;
        this.f8489b = function2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f8488a) {
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
                b4.t tVarB = androidx.compose.foundation.b.b(tVar, (b2.l) objM, null, false, null, null, new b0(0, this.f8489b), 28);
                sVar.q(false);
                return tVarB;
            case 1:
                b4.t tVar2 = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar2.getClass();
                m3.s sVar2 = (m3.s) ((m3.n) obj2);
                sVar2.a0(1702118549);
                Object objM2 = sVar2.M();
                if (objM2 == m3.m.f29332a) {
                    objM2 = w.a0.g(sVar2);
                }
                b4.t tVarB2 = androidx.compose.foundation.b.b(tVar2, (b2.l) objM2, null, false, null, null, new b0(1, this.f8489b), 28);
                sVar2.q(false);
                return tVarB2;
            case 2:
                b4.t tVar3 = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar3.getClass();
                m3.s sVar3 = (m3.s) ((m3.n) obj2);
                sVar3.a0(1702118549);
                Object objM3 = sVar3.M();
                if (objM3 == m3.m.f29332a) {
                    objM3 = w.a0.g(sVar3);
                }
                b4.t tVarB3 = androidx.compose.foundation.b.b(tVar3, (b2.l) objM3, null, false, null, null, new b0(2, this.f8489b), 28);
                sVar3.q(false);
                return tVarB3;
            default:
                b4.t tVar4 = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar4.getClass();
                m3.s sVar4 = (m3.s) ((m3.n) obj2);
                sVar4.a0(1702118549);
                Object objM4 = sVar4.M();
                if (objM4 == m3.m.f29332a) {
                    objM4 = w.a0.g(sVar4);
                }
                b4.t tVarB4 = androidx.compose.foundation.b.b(tVar4, (b2.l) objM4, null, false, null, null, new b0(3, this.f8489b), 28);
                sVar4.q(false);
                return tVarB4;
        }
    }
}
