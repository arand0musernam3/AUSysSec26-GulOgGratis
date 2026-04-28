package a3;

import com.app.tgtg.R;
import g3.r9;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f363a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f365c;

    public /* synthetic */ h(Function0 function0, boolean z11) {
        this.f365c = function0;
        this.f364b = z11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cg.u uVar;
        int i11 = this.f363a;
        m3.f fVar = m3.m.f29332a;
        final Function0 function0 = this.f365c;
        final boolean z11 = this.f364b;
        switch (i11) {
            case 0:
                b4.t tVar = (b4.t) obj;
                ((Integer) obj3).getClass();
                m3.s sVar = (m3.s) ((m3.n) obj2);
                sVar.a0(-196777734);
                final long j9 = ((t3) sVar.j(u3.f588a)).f578a;
                boolean zE = sVar.e(j9) | sVar.f(function0) | sVar.g(z11);
                Object objM = sVar.M();
                if (zE || objM == fVar) {
                    objM = new Function1() { // from class: a3.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            f4.c cVar = (f4.c) obj4;
                            return cVar.b(new b(0, function0, bx.k.r(cVar, Float.intBitsToFloat((int) (cVar.f17292a.d() >> 32)) / 2.0f), new i4.o(j9, 5), z11));
                        }
                    };
                    sVar.k0(objM);
                }
                b4.t tVarE = f4.g.e(tVar, (Function1) objM);
                sVar.q(false);
                return tVarE;
            default:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarT = d2.m2.t(d2.m2.d(qVar, 1.0f), 3);
                    float f11 = lv.t.f28253g;
                    b4.t tVarR = v1.n.r(d2.c.z(tVarT, f11), v1.n.q(sVar2), true);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(tVarR, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar2);
                    v1.n.d(o00.x0.z(R.drawable.ic_close24, sVar2, 0), o30.f0.U(sVar2, R.string.loyalty_card_info_cross_voice_over), b3.i.f(b4.d.f5696o, b4.a.a(d2.c.z(qVar, f11), c5.m2.f7291a, new on.l(27, function0))), null, null, 0.0f, null, sVar2, 8, 120);
                    Object objM2 = sVar2.M();
                    if (objM2 == fVar) {
                        objM2 = new w2.g0(28);
                        sVar2.k0(objM2);
                    }
                    r9.d(o30.f0.U(sVar2, R.string.favorites_promo_bs_header), j5.r.c(qVar, false, (Function1) objM2), lv.s.f28217b, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28263b, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    d2.c.f(d2.m2.e(qVar, f11), sVar2);
                    sVar2.a0(-1458691399);
                    cg.u uVar2 = new cg.u(R.drawable.ic_fav_reminder_info_heart, o30.f0.U(sVar2, R.string.favorites_promo_bs_info_segment1_header), o30.f0.U(sVar2, R.string.favorites_promo_bs_info_segment1_body), (String) null, (String) null, (Function0) null, 120);
                    cg.u uVar3 = new cg.u(R.drawable.ic_fav_reminder_info_bell, o30.f0.U(sVar2, R.string.favorites_promo_bs_info_segment2_header), o30.f0.U(sVar2, R.string.favorites_promo_bs_info_segment2_body), (String) null, (String) null, (Function0) null, 120);
                    if (z11) {
                        sVar2.a0(-397226991);
                        uVar = new cg.u(R.drawable.ic_fav_reminder_info_letter, o30.f0.U(sVar2, R.string.favorites_promo_bs_info_custom_reminder_segment3_header), o30.f0.U(sVar2, R.string.favorites_promo_bs_info_custom_reminder_segment3_body), (String) null, (String) null, (Function0) null, 120);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-396919471);
                        uVar = new cg.u(R.drawable.ic_fav_reminder_info_letter, o30.f0.U(sVar2, R.string.favorites_promo_bs_info_segment3_header), o30.f0.U(sVar2, R.string.favorites_promo_bs_info_segment3_body), (String) null, (String) null, (Function0) null, 120);
                        sVar2.q(false);
                    }
                    Iterator it = kotlin.collections.d0.h(uVar2, uVar3, uVar, new cg.u(R.drawable.ic_fav_reminder_info_hourglass, o30.f0.U(sVar2, R.string.favorites_promo_bs_info_segment4_header), o30.f0.U(sVar2, R.string.favorites_promo_bs_info_segment4_body), (String) null, (String) null, (Function0) null, 120)).iterator();
                    while (it.hasNext()) {
                        cg.j.d((cg.u) it.next(), sVar2, 0);
                    }
                    sVar2.q(false);
                    b4.t tVarD = d2.m2.d(qVar, 1.0f);
                    float f12 = lv.t.f28254h;
                    float f13 = lv.t.f28253g;
                    g3.s0.g(d2.c.D(tVarD, 0.0f, f12, 0.0f, f13, 5), 1, lv.s.I, sVar2, 438, 0);
                    b4.t tVarB = d2.c.B(d2.m2.d(qVar, 1.0f), f13, 0.0f, 2);
                    String strU = o30.f0.U(sVar2, R.string.loyalty_card_info_cta);
                    boolean zF = sVar2.f(function0);
                    Object objM3 = sVar2.M();
                    if (zF || objM3 == fVar) {
                        objM3 = new vm.r(24, function0);
                        sVar2.k0(objM3);
                    }
                    v0.n.l(tVarB, strU, null, null, null, false, false, null, null, (Function0) objM3, sVar2, 6, 508);
                    d2.c.f(d2.m2.e(qVar, f12), sVar2);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ h(boolean z11, Function0 function0) {
        this.f364b = z11;
        this.f365c = function0;
    }
}
