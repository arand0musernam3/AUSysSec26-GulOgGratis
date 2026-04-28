package fg;

import b4.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.s;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u70.f f17711c;

    public j(Function1 function1, boolean z11) {
        this.f17709a = 0;
        this.f17711c = function1;
        this.f17710b = z11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f17709a) {
            case 0:
                t tVar = (t) obj;
                ((Number) obj3).intValue();
                tVar.getClass();
                s sVar = (s) ((m3.n) obj2);
                sVar.a0(1702118549);
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = a0.g(sVar);
                }
                t tVarB = androidx.compose.foundation.b.b(tVar, (b2.l) objM, null, false, null, null, new i((Function1) this.f17711c, this.f17710b, 0), 28);
                sVar.q(false);
                return tVarB;
            case 1:
                t tVar2 = (t) obj;
                ((Number) obj3).intValue();
                tVar2.getClass();
                s sVar2 = (s) ((m3.n) obj2);
                sVar2.a0(1702118549);
                Object objM2 = sVar2.M();
                if (objM2 == m3.m.f29332a) {
                    objM2 = a0.g(sVar2);
                }
                t tVarB2 = androidx.compose.foundation.b.b(tVar2, (b2.l) objM2, null, false, null, null, new i(this.f17710b, (Function0) this.f17711c, 1), 28);
                sVar2.q(false);
                return tVarB2;
            default:
                t tVar3 = (t) obj;
                ((Number) obj3).intValue();
                tVar3.getClass();
                s sVar3 = (s) ((m3.n) obj2);
                sVar3.a0(1702118549);
                Object objM3 = sVar3.M();
                if (objM3 == m3.m.f29332a) {
                    objM3 = a0.g(sVar3);
                }
                t tVarB3 = androidx.compose.foundation.b.b(tVar3, (b2.l) objM3, null, false, null, null, new i(this.f17710b, (lw.o) this.f17711c, 3), 28);
                sVar3.q(false);
                return tVarB3;
        }
    }

    public /* synthetic */ j(boolean z11, Function0 function0, int i11) {
        this.f17709a = i11;
        this.f17710b = z11;
        this.f17711c = function0;
    }
}
