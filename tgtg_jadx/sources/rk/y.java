package rk;

import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.BasicItem;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nk.q0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f38124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1.a f38125c;

    public /* synthetic */ y(q0 q0Var, m1.a aVar, int i11) {
        this.f38123a = i11;
        this.f38124b = q0Var;
        this.f38125c = aVar;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f38123a;
        m1.a aVar = this.f38125c;
        q0 q0Var = this.f38124b;
        switch (i11) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                m3.n nVar = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                if (!zBooleanValue) {
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.I, l2.g.b(12));
                    float f11 = lv.t.f28251e;
                    b4.t tVarZ = d2.c.z(tVarJ, f11);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, nVar, 48);
                    m3.s sVar = (m3.s) nVar;
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarZ, nVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, nVar);
                    m3.i.C(iVarL, b5.i.f5842e, nVar);
                    m3.i.v(nVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(nVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, nVar);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    r9.d(f0.U(nVar, R.string.item_view_sold_out_add_to_favorite_label), new n1(1.0f, true), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, nVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    d2.c.f(m2.m(qVar, f11), nVar);
                    boolean favorite = q0Var.f31035a.getFavorite();
                    boolean zH = sVar.h(aVar) | sVar.h(q0Var);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        objM = new f(aVar, q0Var, 7);
                        sVar.k0(objM);
                    }
                    e.t(6, qVar, (Function0) objM, nVar, favorite);
                    sVar.q(true);
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                m3.n nVar2 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                if (zBooleanValue2) {
                    BasicItem basicItem = q0Var.f31035a;
                    nk.a aVar2 = q0Var.f31039e;
                    boolean z11 = basicItem.getSubscribedForNotification() && aVar2.f30967c;
                    if (z11 && aVar2.f30966b) {
                        m3.s sVar2 = (m3.s) nVar2;
                        sVar2.a0(-726599556);
                        e.g(q0Var, aVar, sVar2, 0);
                        sVar2.q(false);
                    } else {
                        m3.s sVar3 = (m3.s) nVar2;
                        sVar3.a0(-726512167);
                        e.K(q0Var, aVar, z11, sVar3, 0);
                        sVar3.q(false);
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
