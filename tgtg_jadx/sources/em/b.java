package em;

import a3.f1;
import b4.q;
import b4.t;
import com.app.tgtg.feature.logincharity.ui.model.Country;
import d2.m2;
import d2.z;
import g3.d9;
import g3.q4;
import g3.w1;
import g3.z4;
import i80.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;
import m3.m;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16086a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f16087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f16088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f16089d;

    public /* synthetic */ b(List list, b1 b1Var, b1 b1Var2) {
        this.f16087b = list;
        this.f16088c = b1Var;
        this.f16089d = b1Var2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f16086a;
        m3.f fVar = m.f29332a;
        b1 b1Var = this.f16089d;
        b1 b1Var2 = this.f16088c;
        List<Country> list = this.f16087b;
        switch (i11) {
            case 0:
                w1 w1Var = (w1) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                w1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((s) nVar).f(w1Var) : ((s) nVar).h(w1Var) ? 4 : 2;
                }
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    t tVarB = w1.b(w1Var, d2.c.D(d2.c.B(m2.t(m2.d(q.f5711a, 1.0f), 3), lv.t.f28253g, 0.0f, 2), 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13));
                    Country country = (Country) b1Var2.getValue();
                    String displayName = country != null ? country.getDisplayName() : null;
                    if (displayName == null) {
                        displayName = "";
                    }
                    l2.f fVarB = l2.g.b(8);
                    q4 q4Var = q4.f19349a;
                    long j9 = lv.s.G;
                    d9 d9VarD = q4.d(0L, j9, j9, j9, j9, 0L, 0L, sVar, 2147452927);
                    Object objM = sVar.M();
                    if (objM == fVar) {
                        objM = new cp.i(21);
                        sVar.k0(objM);
                    }
                    z4.a(displayName, (Function1) objM, tVarB, false, true, null, null, a.f16082b, a.f16083c, null, false, null, null, null, false, 0, 0, fVarB, d9VarD, sVar, 817913904, 0, 2096488);
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    Object objM2 = sVar.M();
                    if (objM2 == fVar) {
                        objM2 = new bm.j(b1Var, 12);
                        sVar.k0(objM2);
                    }
                    w1Var.a(zBooleanValue, (Function0) objM2, null, null, false, null, 0L, 0.0f, 0.0f, u3.e.e(-1910609897, sVar, new b(list, b1Var2, b1Var)), sVar, 48, 6 | ((iIntValue << 3) & 112));
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (Country country2 : list) {
                        u3.d dVarE = u3.e.e(500706984, sVar2, new f1(country2, 25));
                        boolean zF = sVar2.f(country2);
                        Object objM3 = sVar2.M();
                        if (zF || objM3 == fVar) {
                            objM3 = new a0.g(country2, b1Var2, b1Var, 8);
                            sVar2.k0(objM3);
                        }
                        g3.b.a(dVarE, (Function0) objM3, null, false, null, null, sVar2, 6);
                    }
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(b1 b1Var, b1 b1Var2, List list) {
        this.f16088c = b1Var;
        this.f16089d = b1Var2;
        this.f16087b = list;
    }
}
