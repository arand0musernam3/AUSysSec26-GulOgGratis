package lp;

import cg.i0;
import d2.m2;
import i4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28050a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hp.g f28051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2.c0 f28052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f28054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b4.t f28055f;

    public /* synthetic */ k(b4.t tVar, f2.c0 c0Var, hp.g gVar, int i11, Function1 function1) {
        this.f28055f = tVar;
        this.f28052c = c0Var;
        this.f28051b = gVar;
        this.f28053d = i11;
        this.f28054e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28050a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b4.t tVarJ = v1.n.j(this.f28055f.then(m2.f13850c), lv.s.J, g0.f23254b);
                    hp.g gVar = this.f28051b;
                    boolean zH = sVar.h(gVar);
                    int i11 = this.f28053d;
                    boolean zD = zH | sVar.d(i11);
                    Function1 function1 = this.f28054e;
                    boolean zF = zD | sVar.f(function1);
                    Object objM = sVar.M();
                    if (zF || objM == m3.m.f29332a) {
                        objM = new i0(i11, gVar, function1, 1);
                        sVar.k0(objM);
                    }
                    ox.h.c(tVarJ, this.f28052c, null, null, null, null, false, null, (Function1) objM, sVar, 0, 508);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                d.p(this.f28051b, this.f28052c, this.f28053d, this.f28054e, this.f28055f, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ k(hp.g gVar, f2.c0 c0Var, int i11, Function1 function1, b4.t tVar, int i12) {
        this.f28051b = gVar;
        this.f28052c = c0Var;
        this.f28053d = i11;
        this.f28054e = function1;
        this.f28055f = tVar;
    }
}
