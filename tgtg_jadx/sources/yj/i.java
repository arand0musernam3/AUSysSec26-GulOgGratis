package yj;

import b4.t;
import d2.w;
import d2.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m2.h0;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46074a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f46075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xj.k f46076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f46077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f46078e;

    public /* synthetic */ i(List list, Function1 function1, Function2 function2, xj.k kVar) {
        this.f46075b = list;
        this.f46076c = kVar;
        this.f46077d = function1;
        this.f46078e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46074a) {
            case 0:
                ((Integer) obj2).getClass();
                q.b(this.f46076c, this.f46075b, this.f46077d, this.f46078e, (m3.n) obj, m3.i.F(1));
                break;
            default:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(b4.q.f5711a, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    xj.k kVar = this.f46076c;
                    boolean zH = sVar.h(kVar);
                    List list = this.f46075b;
                    boolean zH2 = zH | sVar.h(list);
                    Function1 function1 = this.f46077d;
                    boolean zF = zH2 | sVar.f(function1);
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (zF || objM == fVar) {
                        objM = new h0(kVar, list, function1, 29);
                        sVar.k0(objM);
                    }
                    Function1 function12 = (Function1) objM;
                    boolean zH3 = sVar.h(kVar) | sVar.h(list);
                    Function2 function2 = this.f46078e;
                    boolean zF2 = zH3 | sVar.f(function2);
                    Object objM2 = sVar.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new k(kVar, list, function2, 0);
                        sVar.k0(objM2);
                    }
                    Function1 function13 = (Function1) objM2;
                    boolean zH4 = sVar.h(kVar) | sVar.h(list);
                    Object objM3 = sVar.M();
                    if (zH4 || objM3 == fVar) {
                        objM3 = new xq.a(4, kVar, list);
                        sVar.k0(objM3);
                    }
                    a.m(list, function12, function13, (Function1) objM3, sVar, 0);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ i(xj.k kVar, List list, Function1 function1, Function2 function2, int i11) {
        this.f46076c = kVar;
        this.f46075b = list;
        this.f46077d = function1;
        this.f46078e = function2;
    }
}
