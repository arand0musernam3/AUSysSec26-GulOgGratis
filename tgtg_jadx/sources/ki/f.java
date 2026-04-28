package ki;

import b4.k;
import b4.q;
import b4.t;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.CharityItem;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.p;
import d2.u;
import d2.w;
import d2.y;
import g3.r9;
import gd.o;
import i4.g0;
import i4.k0;
import i80.n;
import j5.r;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import lv.v;
import m3.m;
import m3.s;
import m5.s0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.z;
import w.a0;
import z4.l;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26393a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f26394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26396d;

    public /* synthetic */ f(float f11, float f12, Function0 function0) {
        this.f26394b = f11;
        this.f26395c = f12;
        this.f26396d = function0;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f26393a;
        Object obj4 = this.f26396d;
        float f11 = this.f26395c;
        float f12 = this.f26394b;
        switch (i11) {
            case 0:
                CharityItem charityItem = (CharityItem) obj4;
                m3.n nVar = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, nVar, 0);
                s sVar = (s) nVar;
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                q qVar = q.f5711a;
                t tVarC = b4.a.c(qVar, nVar);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(yVarA, b5.i.f5843f, nVar);
                m3.i.C(iVarL, b5.i.f5842e, nVar);
                m3.i.v(nVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(nVar, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, nVar);
                float f13 = 64;
                o.a(mv.d.m(charityItem).getLogoPicture().getCurrentUrl(), "ItemLogo", f4.g.a(f4.g.b(m2.h(m2.l(d2.c.D(qVar, 0.0f, lv.t.f28254h, 0.0f, 0.0f, 13), f13), f13), l2.g.f26790a), f12), l.f47166a, nVar, 1572912, 0, 1976);
                r9.d(f0.U(nVar, R.string.charity_item_from), f4.g.a(m2.u(d2.c.D(qVar, 0.0f, lv.t.f28253g, 0.0f, 0.0f, 13), null, 3), f11), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, nVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                sVar.q(true);
                break;
            default:
                Function0 function0 = (Function0) obj4;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q qVar2 = q.f5711a;
                    t tVarI = v1.n.i(v1.n.j(m2.e(m2.q(qVar2, f12), f11), lv.s.A, g0.f23254b), new k0(d0.h(new i4.v(lv.s.Y), new i4.v(lv.s.Z)), 0L, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32)), 0.0f, 6);
                    float f14 = lv.t.f28254h;
                    t tVarC2 = d2.c.C(tVarI, f14, f14, f14, lv.t.f28253g);
                    k kVar = b4.d.f5683a;
                    u0 u0VarD = p.d(kVar, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    t tVarC3 = b4.a.c(tVarC2, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(u0VarD, gVar, sVar2);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL2, gVar2, sVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar2, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC3, gVar4, sVar2);
                    t tVarQ = m2.q(qVar2, f12);
                    y yVarA2 = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    u3.i iVarL3 = sVar2.l();
                    t tVarC4 = b4.a.c(tVarQ, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA2, gVar, sVar2);
                    m3.i.C(iVarL3, gVar2, sVar2);
                    a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar);
                    m3.i.C(tVarC4, gVar4, sVar2);
                    String str = (String) StringsKt__StringsKt.split$default(f0.U(sVar2, R.string.favorites_promo_header), new String[]{"%1$s"}, false, 0, 6, null).get(0);
                    m5.u0 u0Var = v.f28264c;
                    str.getClass();
                    u0Var.getClass();
                    s0 s0VarJ = m5.k0.j(sVar2);
                    z5.c cVar = (z5.c) sVar2.j(x1.f7416h);
                    float fO = cVar.O((int) (s0.a(s0VarJ, str, u0Var, z5.b.b(Integer.MAX_VALUE, 0, 13), cVar, 860).f29619c >> 32));
                    cg.j.n(qVar2, f0.U(sVar2, R.string.favorites_promo_tag), f0.U(sVar2, R.string.favorites_promo_tag_voice_over), 0L, 0L, sVar2, 6, 24);
                    d2.c.f(m2.e(qVar2, lv.t.f28252f), sVar2);
                    u0 u0VarD2 = p.d(kVar, false);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    u3.i iVarL4 = sVar2.l();
                    t tVarC5 = b4.a.c(qVar2, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(u0VarD2, gVar, sVar2);
                    m3.i.C(iVarL4, gVar2, sVar2);
                    a0.y(iHashCode4, sVar2, gVar3, sVar2, dVar);
                    m3.i.C(tVarC5, gVar4, sVar2);
                    Object objM = sVar2.M();
                    m3.f fVar = m.f29332a;
                    if (objM == fVar) {
                        objM = new w2.g0(22);
                        sVar2.k0(objM);
                    }
                    t tVarC6 = r.c(qVar2, false, (Function1) objM);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str2 = String.format(f0.U(sVar2, R.string.favorites_promo_header), Arrays.copyOf(new Object[]{"    "}, 1));
                    long j9 = lv.s.f28215a;
                    r9.d(str2, tVarC6, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar2, 0);
                    int iHashCode5 = Long.hashCode(sVar2.T);
                    u3.i iVarL5 = sVar2.l();
                    t tVarC7 = b4.a.c(qVar2, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(i2VarA, gVar, sVar2);
                    m3.i.C(iVarL5, gVar2, sVar2);
                    a0.y(iHashCode5, sVar2, gVar3, sVar2, dVar);
                    m3.i.C(tVarC7, gVar4, sVar2);
                    float f15 = lv.t.f28251e;
                    d2.c.f(m2.q(qVar2, fO - f15), sVar2);
                    v1.n.d(x0.z(R.drawable.ic_heart_small, sVar2, 0), null, m2.m(qVar2, 32), null, null, 0.0f, null, sVar2, 440, 120);
                    sVar2.q(true);
                    sVar2.q(true);
                    d2.c.f(m2.e(qVar2, f15), sVar2);
                    r9.d(f0.U(sVar2, R.string.favorites_promo_body), qVar2, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar2, 432, 12582912, 131064);
                    sVar2.q(true);
                    t tVarA = u.f13938a.a(qVar2, b4.d.f5691i);
                    String strU = f0.U(sVar2, R.string.favorites_promo_button);
                    String strU2 = f0.U(sVar2, R.string.favorites_promo_button_voice_over);
                    lv.q qVar3 = lv.q.REGULAR;
                    lv.e eVar = lv.e.SMALL;
                    boolean zF = sVar2.f(function0);
                    Object objM2 = sVar2.M();
                    if (zF || objM2 == fVar) {
                        objM2 = new vm.r(22, function0);
                        sVar2.k0(objM2);
                    }
                    v0.n.l(tVarA, strU, strU2, qVar3, eVar, false, false, null, null, (Function0) objM2, sVar2, 27648, 480);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f(float f11, CharityItem charityItem, float f12) {
        this.f26394b = f11;
        this.f26396d = charityItem;
        this.f26395c = f12;
    }
}
