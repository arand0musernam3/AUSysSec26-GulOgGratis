package cm;

import b2.l;
import b4.t;
import i80.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.m;
import m3.s;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f8461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f8462c;

    public /* synthetic */ c(Function1 function1, Function0 function0, int i11) {
        this.f8460a = i11;
        this.f8461b = function1;
        this.f8462c = function0;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f8460a) {
            case 0:
                t tVar = (t) obj;
                ((Number) obj3).intValue();
                tVar.getClass();
                s sVar = (s) ((m3.n) obj2);
                sVar.a0(1702118549);
                Object objM = sVar.M();
                if (objM == m.f29332a) {
                    objM = a0.g(sVar);
                }
                t tVarB = androidx.compose.foundation.b.b(tVar, (l) objM, null, false, null, null, new b(this.f8461b, this.f8462c, 0), 28);
                sVar.q(false);
                return tVarB;
            default:
                t tVar2 = (t) obj;
                ((Number) obj3).intValue();
                tVar2.getClass();
                s sVar2 = (s) ((m3.n) obj2);
                sVar2.a0(1702118549);
                Object objM2 = sVar2.M();
                if (objM2 == m.f29332a) {
                    objM2 = a0.g(sVar2);
                }
                t tVarB2 = androidx.compose.foundation.b.b(tVar2, (l) objM2, null, false, null, null, new b(this.f8461b, this.f8462c, 1), 28);
                sVar2.q(false);
                return tVarB2;
        }
    }
}
