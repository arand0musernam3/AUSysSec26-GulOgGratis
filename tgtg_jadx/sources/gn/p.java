package gn;

import ao.p2;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.Item;
import d2.m2;
import d40.t1;
import hp.p1;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f20638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f20639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f20640d;

    public /* synthetic */ p(List list, Function1 function1, Function1 function12, int i11) {
        this.f20637a = i11;
        this.f20638b = list;
        this.f20639c = function1;
        this.f20640d = function12;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f20637a) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i11 = (iIntValue2 & 6) == 0 ? (((m3.s) nVar).f(dVar) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((m3.s) nVar).d(iIntValue) ? 32 : 16;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
                    BasicItem basicItem = (BasicItem) this.f20638b.get(iIntValue);
                    sVar.a0(-726682034);
                    Function1 function1 = this.f20639c;
                    boolean zF = sVar.f(function1);
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (zF || objM == fVar) {
                        objM = new n(function1, 0);
                        sVar.k0(objM);
                    }
                    Function1 function12 = (Function1) objM;
                    Function1 function13 = this.f20640d;
                    boolean zF2 = sVar.f(function13) | sVar.h(basicItem);
                    Object objM2 = sVar.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new o(function13, basicItem, 0);
                        sVar.k0(objM2);
                    }
                    t1.m(null, basicItem, true, false, false, false, function12, (Function0) objM2, null, sVar, MLKEMEngine.KyberPolyBytes, 313);
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                f2.d dVar2 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m3.n nVar2 = (m3.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i12 = (iIntValue4 & 6) == 0 ? (((m3.s) nVar2).f(dVar2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((m3.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    Item item = (Item) this.f20638b.get(iIntValue3);
                    sVar2.a0(349426939);
                    Function1 function14 = this.f20639c;
                    boolean zF3 = sVar2.f(function14) | sVar2.h(item);
                    Object objM3 = sVar2.M();
                    m3.f fVar2 = m3.m.f29332a;
                    if (zF3 || objM3 == fVar2) {
                        objM3 = new p2(11, function14, item);
                        sVar2.k0(objM3);
                    }
                    Function1 function15 = (Function1) objM3;
                    Function1 function16 = this.f20640d;
                    boolean zF4 = sVar2.f(function16) | sVar2.h(item);
                    Object objM4 = sVar2.M();
                    if (zF4 || objM4 == fVar2) {
                        objM4 = new bn.b0(8, function16, item);
                        sVar2.k0(objM4);
                    }
                    t1.m(null, item, true, false, false, false, function15, (Function0) objM4, null, sVar2, MLKEMEngine.KyberPolyBytes, 313);
                    sVar2.q(false);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                f2.d dVar3 = (f2.d) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m3.n nVar3 = (m3.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i13 = (iIntValue6 & 6) == 0 ? (((m3.s) nVar3).f(dVar3) ? 4 : 2) | iIntValue6 : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((m3.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(i13 & 1, (i13 & 147) != 146)) {
                    hp.g gVar = (hp.g) this.f20638b.get(iIntValue5);
                    sVar3.a0(-913826932);
                    boolean z11 = gVar.f22285k;
                    Function1 function17 = this.f20640d;
                    boolean zF5 = sVar3.f(function17) | sVar3.h(gVar);
                    Object objM5 = sVar3.M();
                    if (zF5 || objM5 == m3.m.f29332a) {
                        objM5 = new lp.o(function17, gVar, 0);
                        sVar3.k0(objM5);
                    }
                    Function0 function0 = (Function0) objM5;
                    float f11 = lv.t.f28253g;
                    b4.q qVar = b4.q.f5711a;
                    lp.d.m(gVar, this.f20639c, z11, function0, d2.c.B(qVar, f11, 0.0f, 2), sVar3, 24576);
                    d2.c.f(m2.e(qVar, f11), sVar3);
                    sVar3.q(false);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                f2.d dVar4 = (f2.d) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m3.n nVar4 = (m3.n) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i14 = (iIntValue8 & 6) == 0 ? (((m3.s) nVar4).f(dVar4) ? 4 : 2) | iIntValue8 : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i14 |= ((m3.s) nVar4).d(iIntValue7) ? 32 : 16;
                }
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(i14 & 1, (i14 & 147) != 146)) {
                    hp.g gVar2 = (hp.g) this.f20638b.get(iIntValue7);
                    sVar4.a0(-194985172);
                    boolean z12 = gVar2.f22285k;
                    Function1 function18 = this.f20640d;
                    boolean zF6 = sVar4.f(function18) | sVar4.h(gVar2);
                    Object objM6 = sVar4.M();
                    if (zF6 || objM6 == m3.m.f29332a) {
                        objM6 = new lp.o(function18, gVar2, 1);
                        sVar4.k0(objM6);
                    }
                    Function0 function02 = (Function0) objM6;
                    float f12 = lv.t.f28253g;
                    b4.q qVar2 = b4.q.f5711a;
                    lp.d.m(gVar2, this.f20639c, z12, function02, d2.c.B(qVar2, f12, 0.0f, 2), sVar4, 24576);
                    d2.c.f(m2.e(qVar2, f12), sVar4);
                    sVar4.q(false);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                f2.d dVar5 = (f2.d) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                m3.n nVar5 = (m3.n) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i15 = (iIntValue10 & 6) == 0 ? (((m3.s) nVar5).f(dVar5) ? 4 : 2) | iIntValue10 : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i15 |= ((m3.s) nVar5).d(iIntValue9) ? 32 : 16;
                }
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(i15 & 1, (i15 & 147) != 146)) {
                    Pair pair = (Pair) this.f20638b.get(iIntValue9);
                    sVar5.a0(1814535065);
                    String str = (String) pair.f26485a;
                    List list = (List) pair.f26486b;
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar5, 0);
                    int iHashCode = Long.hashCode(sVar5.T);
                    u3.i iVarL = sVar5.l();
                    b4.q qVar3 = b4.q.f5711a;
                    b4.t tVarC = b4.a.c(qVar3, sVar5);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar);
                    } else {
                        sVar5.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar5);
                    m3.i.C(iVarL, b5.i.f5842e, sVar5);
                    m3.i.v(sVar5, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar5, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar5);
                    lp.r.a(str, sVar5, 0);
                    sVar5.a0(-1756186572);
                    for (p1 p1Var : CollectionsKt.l0(list, new a60.r(19))) {
                        hp.g gVar3 = p1Var.f22317a;
                        boolean z13 = gVar3.f22285k;
                        Function1 function19 = this.f20640d;
                        boolean zF7 = sVar5.f(function19) | sVar5.h(p1Var);
                        Object objM7 = sVar5.M();
                        if (zF7 || objM7 == m3.m.f29332a) {
                            objM7 = new bn.b0(14, function19, p1Var);
                            sVar5.k0(objM7);
                        }
                        float f13 = lv.t.f28253g;
                        b4.q qVar4 = qVar3;
                        lp.d.m(gVar3, this.f20639c, z13, (Function0) objM7, d2.c.B(qVar3, f13, 0.0f, 2), sVar5, 24576);
                        d2.c.f(m2.e(qVar4, f13), sVar5);
                        qVar3 = qVar4;
                    }
                    e0.f.D(sVar5, false, true, false);
                } else {
                    sVar5.U();
                }
                break;
            default:
                f2.d dVar6 = (f2.d) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                m3.n nVar6 = (m3.n) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                int i16 = (iIntValue12 & 6) == 0 ? (((m3.s) nVar6).f(dVar6) ? 4 : 2) | iIntValue12 : iIntValue12;
                if ((iIntValue12 & 48) == 0) {
                    i16 |= ((m3.s) nVar6).d(iIntValue11) ? 32 : 16;
                }
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(i16 & 1, (i16 & 147) != 146)) {
                    BasicItem basicItem2 = (BasicItem) this.f20638b.get(iIntValue11);
                    sVar6.a0(-185442747);
                    Function1 function110 = this.f20639c;
                    boolean zF8 = sVar6.f(function110);
                    Object objM8 = sVar6.M();
                    m3.f fVar3 = m3.m.f29332a;
                    if (zF8 || objM8 == fVar3) {
                        objM8 = new n(function110, 7);
                        sVar6.k0(objM8);
                    }
                    Function1 function111 = (Function1) objM8;
                    Function1 function112 = this.f20640d;
                    boolean zF9 = sVar6.f(function112) | sVar6.h(basicItem2);
                    Object objM9 = sVar6.M();
                    if (zF9 || objM9 == fVar3) {
                        objM9 = new o(function112, basicItem2, 1);
                        sVar6.k0(objM9);
                    }
                    t1.m(null, basicItem2, true, false, false, false, function111, (Function0) objM9, null, sVar6, MLKEMEngine.KyberPolyBytes, 313);
                    sVar6.q(false);
                } else {
                    sVar6.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
