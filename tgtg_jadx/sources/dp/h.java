package dp;

import bn.b0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.BasicItem;
import d2.m2;
import d40.t1;
import f2.c0;
import g3.f2;
import g3.g2;
import g3.p0;
import g3.r0;
import g3.s0;
import g3.v0;
import i4.g0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l3.x0;
import m3.b1;
import m3.c3;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15070a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f15072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15076g;

    public h(ap.n nVar, bp.v vVar, List list, b1 b1Var, b1 b1Var2, c3 c3Var) {
        this.f15071b = nVar;
        this.f15075f = c3Var;
        this.f15072c = list;
        this.f15076g = vVar;
        this.f15073d = b1Var;
        this.f15074e = b1Var2;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12 = this.f15070a;
        List list = this.f15072c;
        Object obj5 = this.f15074e;
        Object obj6 = this.f15073d;
        m3.f fVar = m3.m.f29332a;
        Object obj7 = this.f15071b;
        Object obj8 = this.f15075f;
        Object obj9 = this.f15076g;
        switch (i12) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                m3.n nVar = (m3.n) obj3;
                ((Number) obj4).intValue();
                b1 b1Var = (b1) obj5;
                b1 b1Var2 = (b1) obj6;
                ((s1.l) obj).getClass();
                if (zBooleanValue) {
                    m3.s sVar = (m3.s) nVar;
                    sVar.a0(-1302783611);
                    List list2 = (List) b1Var2.getValue();
                    String str = (String) b1Var.getValue();
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    boolean zJ = ((ap.n) obj7).j();
                    String str3 = (String) obj8;
                    Object objM = sVar.M();
                    if (objM == fVar) {
                        objM = new g(b1Var2, 0);
                        sVar.k0(objM);
                    }
                    Function1 function1 = (Function1) objM;
                    g4.v vVar = (g4.v) obj9;
                    Object objM2 = sVar.M();
                    if (objM2 == fVar) {
                        objM2 = new g(b1Var, 1);
                        sVar.k0(objM2);
                    }
                    cp.a.e(str3, this.f15072c, list2, zJ, function1, str2, vVar, (Function1) objM2, sVar, 14180352, 0);
                    sVar.q(false);
                } else {
                    m3.s sVar2 = (m3.s) nVar;
                    sVar2.a0(-1301733641);
                    sVar2.q(false);
                }
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                m3.n nVar2 = (m3.n) obj3;
                ((Number) obj4).intValue();
                ap.n nVar3 = (ap.n) obj7;
                ((s1.l) obj).getClass();
                b4.q qVar = b4.q.f5711a;
                if (zBooleanValue2) {
                    m3.s sVar3 = (m3.s) nVar2;
                    sVar3.a0(1854457987);
                    String strU = f0.U(sVar3, R.string.rating_cta_skip_question);
                    boolean zH = sVar3.h(nVar3);
                    Object objM3 = sVar3.M();
                    if (zH || objM3 == fVar) {
                        objM3 = new j(nVar3, 0);
                        sVar3.k0(objM3);
                    }
                    v0.n.o(qVar, strU, null, null, null, false, (Function0) objM3, sVar3, 6, 0, 1020);
                    sVar3.q(false);
                } else {
                    m3.s sVar4 = (m3.s) nVar2;
                    sVar4.a0(1854739622);
                    String strU2 = f0.U(sVar4, R.string.rating_cta_continue);
                    boolean zF = sVar4.f((c3) obj8) | sVar4.h(nVar3) | sVar4.h(list) | sVar4.d(((bp.v) obj9).ordinal());
                    b1 b1Var3 = (b1) obj6;
                    ap.n nVar4 = (ap.n) obj7;
                    bp.v vVar2 = (bp.v) obj9;
                    c3 c3Var = (c3) obj8;
                    b1 b1Var4 = (b1) obj5;
                    Object objM4 = sVar4.M();
                    if (zF || objM4 == fVar) {
                        k kVar = new k(nVar4, vVar2, this.f15072c, b1Var3, b1Var4, c3Var);
                        sVar4.k0(kVar);
                        objM4 = kVar;
                    }
                    v0.n.l(qVar, strU2, null, null, null, false, false, null, null, (Function0) objM4, sVar4, 6, 508);
                    sVar4.q(false);
                }
                break;
            default:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar5 = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function1 function12 = (Function1) obj9;
                Function1 function13 = (Function1) obj8;
                Function1 function14 = (Function1) obj7;
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((m3.s) nVar5).f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((m3.s) nVar5).d(iIntValue) ? 32 : 16;
                }
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(i11 & 1, (i11 & 147) != 146)) {
                    BasicItem basicItem = (BasicItem) list.get(iIntValue);
                    sVar5.a0(-717929337);
                    Object objM5 = sVar5.M();
                    if (objM5 == fVar) {
                        objM5 = m3.i.q(new b0(25, (c0) obj6, basicItem));
                        sVar5.k0(objM5);
                    }
                    Pair pair = (Pair) ((c3) objM5).getValue();
                    float fFloatValue = ((Number) pair.f26485a).floatValue();
                    float fFloatValue2 = ((Number) pair.f26486b).floatValue();
                    Object objM6 = sVar5.M();
                    if (objM6 == fVar) {
                        objM6 = m3.i.w(Boolean.valueOf(basicItem.getFavorite()));
                        sVar5.k0(objM6);
                    }
                    b1 b1Var5 = (b1) objM6;
                    b4.k kVar2 = b4.d.f5685c;
                    b4.t tVarA = f2.d.a(dVar, t1.c.j(0.0f, 400.0f, null, 5), t1.c.j(0.0f, 400.0f, null, 5), 4);
                    boolean zC = sVar5.c(fFloatValue);
                    Object objM7 = sVar5.M();
                    if (zC || objM7 == fVar) {
                        objM7 = new yj.f(fFloatValue);
                        sVar5.k0(objM7);
                    }
                    b4.t tVarP = g0.p(tVarA, (Function1) objM7);
                    u0 u0VarD = d2.p.d(kVar2, false);
                    int iHashCode = Long.hashCode(sVar5.T);
                    u3.i iVarL = sVar5.l();
                    b4.t tVarC = b4.a.c(tVarP, sVar5);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar);
                    } else {
                        sVar5.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar5);
                    m3.i.C(iVarL, b5.i.f5842e, sVar5);
                    m3.i.v(sVar5, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar5, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar5);
                    b4.t tVarA2 = f4.g.a(b4.a.d(m2.m(d2.c.v(b4.q.f5711a, 16, -16), 24), 1.0f), fFloatValue2);
                    int i13 = g2.f18650a;
                    x60.h hVar2 = (x60.h) obj5;
                    long j9 = hVar2.f43917g;
                    long j11 = hVar2.J;
                    f2 f2VarA = g2.a((p0) sVar5.j(r0.f19375a), ((i4.v) sVar5.j(v0.f19606a)).f23317a).a(j9, j11, i4.v.f23315h, i4.v.b(x0.f27213a, j11));
                    l2.f fVar2 = l2.g.f26790a;
                    boolean zC2 = sVar5.c(fFloatValue2) | sVar5.f(function14) | sVar5.h(basicItem);
                    Object objM8 = sVar5.M();
                    if (zC2 || objM8 == fVar) {
                        objM8 = new yj.g(fFloatValue2, function14, basicItem);
                        sVar5.k0(objM8);
                    }
                    s0.h((Function0) objM8, tVarA2, false, f2VarA, null, fVar2, yj.a.f46042b, sVar5, 1572864, 20);
                    boolean zF2 = sVar5.f(function13);
                    Object objM9 = sVar5.M();
                    if (zF2 || objM9 == fVar) {
                        objM9 = new gn.n(function13, 8);
                        sVar5.k0(objM9);
                    }
                    Function1 function15 = (Function1) objM9;
                    boolean zF3 = sVar5.f(function12) | sVar5.h(basicItem);
                    Object objM10 = sVar5.M();
                    if (zF3 || objM10 == fVar) {
                        objM10 = new x((Object) function12, (Object) basicItem, b1Var5, 6);
                        sVar5.k0(objM10);
                    }
                    t1.m(null, basicItem, true, false, false, false, function15, (Function0) objM10, null, sVar5, MLKEMEngine.KyberPolyBytes, 313);
                    sVar5.q(true);
                    sVar5.q(false);
                } else {
                    sVar5.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public h(List list, c0 c0Var, x60.h hVar, Function1 function1, Function1 function12, Function1 function13) {
        this.f15072c = list;
        this.f15073d = c0Var;
        this.f15074e = hVar;
        this.f15071b = function1;
        this.f15075f = function12;
        this.f15076g = function13;
    }

    public h(b1 b1Var, ap.n nVar, String str, List list, g4.v vVar, b1 b1Var2) {
        this.f15073d = b1Var;
        this.f15071b = nVar;
        this.f15075f = str;
        this.f15072c = list;
        this.f15076g = vVar;
        this.f15074e = b1Var2;
    }
}
