package ah;

import a3.p;
import b0.z;
import b4.t;
import d2.m2;
import g9.f0;
import i4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.s;
import xg.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1455a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f1456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f1457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ se.b f1458d;

    public /* synthetic */ c(f0 f0Var, b0 b0Var, se.b bVar) {
        this.f1456b = f0Var;
        this.f1457c = b0Var;
        this.f1458d = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1455a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g gVar = g.INSTANCE;
                    t tVarJ = v1.n.j(m2.f13850c, lv.s.J, g0.f23254b);
                    b0 b0Var = this.f1457c;
                    boolean zF = sVar.f(b0Var);
                    se.b bVar = this.f1458d;
                    boolean zH = zF | sVar.h(bVar);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        objM = new p(4, b0Var, bVar);
                        sVar.k0(objM);
                    }
                    z.g(this.f1456b, gVar, tVarJ, null, null, null, null, null, null, (Function1) objM, sVar, 432, 2040);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                l.a(this.f1456b, this.f1457c, this.f1458d, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(f0 f0Var, b0 b0Var, se.b bVar, int i11) {
        this.f1456b = f0Var;
        this.f1457c = b0Var;
        this.f1458d = bVar;
    }
}
