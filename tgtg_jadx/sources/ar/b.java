package ar;

import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.user.response.MonthlyMoneySaved;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.u;
import d2.w;
import d2.y;
import d2.z;
import g3.r9;
import g3.s0;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lv.v;
import m3.m;
import m3.s;
import mv.p0;
import o00.x0;
import o30.f0;
import on.l;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import u70.f;
import w.a0;
import x5.k;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4734a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f4737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f4739f;

    public /* synthetic */ b(MonthlyMoneySaved monthlyMoneySaved, boolean z11, Function0 function0, boolean z12, Function0 function02) {
        this.f4738e = monthlyMoneySaved;
        this.f4735b = z11;
        this.f4737d = function0;
        this.f4736c = z12;
        this.f4739f = function02;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b5.d dVar;
        g gVar;
        h hVar;
        g gVar2;
        g gVar3;
        float f11;
        int i11 = this.f4734a;
        u uVar = u.f13938a;
        q qVar = q.f5711a;
        Function0 function0 = this.f4737d;
        f fVar = this.f4739f;
        Object obj4 = this.f4738e;
        switch (i11) {
            case 0:
                MonthlyMoneySaved monthlyMoneySaved = (MonthlyMoneySaved) obj4;
                Function0 function02 = (Function0) fVar;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
                    y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarT, sVar);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    g gVar4 = b5.i.f5843f;
                    m3.i.C(yVarA, gVar4, sVar);
                    g gVar5 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar5, sVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    g gVar6 = b5.i.f5844g;
                    m3.i.v(sVar, numValueOf, gVar6);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar, dVar2);
                    g gVar7 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar7, sVar);
                    boolean z11 = monthlyMoneySaved.getMagicBagCount() == 0;
                    t tVarT2 = m2.t(m2.d(qVar, 1.0f), 3);
                    float f12 = lv.t.f28251e;
                    t tVarA = d2.c.A(tVarT2, lv.t.f28249c, f12);
                    u0 u0VarD = p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    t tVarC2 = b4.a.c(tVarA, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, gVar4, sVar);
                    m3.i.C(iVarL2, gVar5, sVar);
                    a0.y(iHashCode2, sVar, gVar6, sVar, dVar2);
                    m3.i.C(tVarC2, gVar7, sVar);
                    boolean z12 = this.f4735b;
                    m3.f fVar2 = m.f29332a;
                    if (z12) {
                        dVar = dVar2;
                        gVar = gVar6;
                        hVar = hVar2;
                        gVar2 = gVar4;
                        gVar3 = gVar7;
                        sVar.a0(291480807);
                        sVar.q(false);
                    } else {
                        sVar.a0(290818120);
                        t tVarA2 = uVar.a(m2.m(qVar, 34), b4.d.f5686d);
                        boolean zF = sVar.f(function0);
                        Object objM = sVar.M();
                        if (zF || objM == fVar2) {
                            objM = new d(0, function0);
                            sVar.k0(objM);
                        }
                        hVar = hVar2;
                        gVar2 = gVar4;
                        gVar = gVar6;
                        dVar = dVar2;
                        gVar3 = gVar7;
                        s0.h((Function0) objM, tVarA2, false, null, null, null, a.f4732a, sVar, 1572864, 60);
                        sVar = sVar;
                        sVar.q(false);
                    }
                    t tVarA3 = uVar.a(d2.c.A(m2.d(qVar, 1.0f), lv.t.f28255i, f12), b4.d.f5687e);
                    String strR = p0.r(monthlyMoneySaved.getMonth(), monthlyMoneySaved.getYear());
                    m5.u0 u0Var = v.l;
                    long j9 = lv.s.C;
                    r9.d(strR, tVarA3, j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    if (this.f4736c) {
                        f11 = f12;
                        sVar.a0(292698983);
                        sVar.q(false);
                    } else {
                        sVar.a0(292037257);
                        t tVarA4 = uVar.a(m2.m(qVar, 34), b4.d.f5688f);
                        boolean zF2 = sVar.f(function02);
                        Object objM2 = sVar.M();
                        if (zF2 || objM2 == fVar2) {
                            objM2 = new d(1, function02);
                            sVar.k0(objM2);
                        }
                        f11 = f12;
                        s sVar2 = sVar;
                        s0.h((Function0) objM2, tVarA4, false, null, null, null, a.f4733b, sVar2, 1572864, 60);
                        sVar = sVar2;
                        sVar.q(false);
                    }
                    sVar.q(true);
                    t tVarD = d2.c.D(m2.d(qVar, 1.0f), 0.0f, 0.0f, 0.0f, f11, 7);
                    float f13 = 1;
                    long j11 = lv.s.H;
                    s0.g(tVarD, f13, j11, sVar, 438, 0);
                    boolean z13 = z11;
                    a.a(z11 ? R.drawable.gfx_money_saved_magic_bag_inactive : R.drawable.gfx_money_saved_magic_bag_active, R.string.money_saved_magic_bags_saved, String.valueOf(monthlyMoneySaved.getMagicBagCount()), z13, sVar, 0);
                    a.a(z13 ? R.drawable.gfx_money_saved_value_inactive : R.drawable.gfx_money_saved_value_active, R.string.money_saved_original_value, mv.d.i(monthlyMoneySaved.getOriginalPrice(), 1), z13, sVar, 0);
                    a.a(z13 ? R.drawable.gfx_money_saved_paid_inactive : R.drawable.gfx_money_saved_paid_active, R.string.money_saved_you_paid, mv.d.i(monthlyMoneySaved.getMoneySpent(), 1), z13, sVar, 0);
                    s0.g(d2.c.D(m2.d(qVar, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13), f13, j11, sVar, 438, 0);
                    t tVarT3 = m2.t(m2.d(qVar, 1.0f), 3);
                    float f14 = lv.t.f28253g;
                    t tVarA5 = d2.c.A(tVarT3, f14, f14);
                    i2 i2VarA = h2.a(i.f13801a, b4.d.f5692j, sVar, 0);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    u3.i iVarL3 = sVar.l();
                    t tVarC3 = b4.a.c(tVarA5, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(i2VarA, gVar2, sVar);
                    m3.i.C(iVarL3, gVar5, sVar);
                    a0.y(iHashCode3, sVar, gVar, sVar, dVar);
                    m3.i.C(tVarC3, gVar3, sVar);
                    t tVarV = m2.v(qVar, 3);
                    float f15 = lv.t.f28252f;
                    t tVarD2 = d2.c.D(tVarV, f15, 0.0f, 0.0f, 0.0f, 14);
                    b4.j jVar = b4.d.f5693k;
                    r9.d(f0.U(sVar, R.string.money_saved_money), b3.i.g(jVar, tVarD2), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28275o, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    t tVarD3 = m2.d(qVar, 1.0f);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    r9.d(mv.d.i(monthlyMoneySaved.getMoneySaved(), 1), b3.i.g(jVar, d2.c.D(tVarD3.then(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), f15, 0.0f, 0.0f, 0.0f, 14)), z13 ? lv.s.E : lv.s.f28217b, 0L, null, 0L, null, new k(6), 0L, 0, false, 0, 0, null, u0Var, sVar, 0, 12582912, 130040);
                    sVar.q(true);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            default:
                Function1 function1 = (Function1) obj4;
                Function1 function12 = (Function1) fVar;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar3 = (s) nVar2;
                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    y yVarA2 = w.a(i.f13803c, b4.d.f5694m, sVar3, 48);
                    int iHashCode4 = Long.hashCode(sVar3.T);
                    u3.i iVarL4 = sVar3.l();
                    t tVarC4 = b4.a.c(qVar, sVar3);
                    j.R.getClass();
                    h hVar3 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    g gVar8 = b5.i.f5843f;
                    m3.i.C(yVarA2, gVar8, sVar3);
                    g gVar9 = b5.i.f5842e;
                    m3.i.C(iVarL4, gVar9, sVar3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    g gVar10 = b5.i.f5844g;
                    m3.i.v(sVar3, numValueOf2, gVar10);
                    b5.d dVar3 = b5.i.f5845h;
                    m3.i.z(sVar3, dVar3);
                    g gVar11 = b5.i.f5841d;
                    m3.i.C(tVarC4, gVar11, sVar3);
                    t tVarZ = d2.c.z(m2.d(qVar, 1.0f), 16);
                    u0 u0VarD2 = p.d(b4.d.f5683a, false);
                    int iHashCode5 = Long.hashCode(sVar3.T);
                    u3.i iVarL5 = sVar3.l();
                    t tVarC5 = b4.a.c(tVarZ, sVar3);
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(u0VarD2, gVar8, sVar3);
                    m3.i.C(iVarL5, gVar9, sVar3);
                    a0.y(iHashCode5, sVar3, gVar10, sVar3, dVar3);
                    m3.i.C(tVarC5, gVar11, sVar3);
                    v1.n.d(x0.z(R.drawable.collection_reminder_notification_icon, sVar3, 0), null, d2.c.z(qVar, 8), null, null, 0.0f, null, sVar3, 440, 120);
                    v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar3, 0), null, b4.a.a(uVar.a(qVar, b4.d.f5685c), c5.m2.f7291a, new l(6, function0)), null, null, 0.0f, null, sVar3, 56, 120);
                    sVar3.q(true);
                    oo.a.l(this.f4735b, this.f4736c, function1, function12, sVar3, 0);
                    sVar3.q(true);
                } else {
                    sVar3.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(boolean z11, boolean z12, Function1 function1, Function1 function12, Function0 function0) {
        this.f4735b = z11;
        this.f4736c = z12;
        this.f4738e = function1;
        this.f4739f = function12;
        this.f4737d = function0;
    }
}
