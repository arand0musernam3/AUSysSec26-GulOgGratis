package ti;

import g3.g7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import m3.b1;
import v80.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f40222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f40223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40225e;

    public /* synthetic */ f(Object obj, Object obj2, b1 b1Var, b1 b1Var2, int i11) {
        this.f40221a = i11;
        this.f40224d = obj;
        this.f40225e = obj2;
        this.f40222b = b1Var;
        this.f40223c = b1Var2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f40221a) {
            case 0:
                b4.t tVar = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar.getClass();
                m3.s sVar = (m3.s) ((m3.n) obj2);
                sVar.a0(1702118549);
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = a0.g(sVar);
                }
                b4.t tVarB = androidx.compose.foundation.b.b(tVar, (b2.l) objM, null, false, null, null, new e((g7) this.f40224d, (Ref.ObjectRef) this.f40225e, this.f40222b, this.f40223c, 0), 28);
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
                    objM2 = a0.g(sVar2);
                }
                b4.t tVarB2 = androidx.compose.foundation.b.b(tVar2, (b2.l) objM2, null, false, null, null, new e((b0) this.f40224d, (Function1) this.f40225e, this.f40222b, this.f40223c, 1), 28);
                sVar2.q(false);
                return tVarB2;
        }
    }
}
