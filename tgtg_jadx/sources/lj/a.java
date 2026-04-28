package lj;

import b4.q;
import b4.t;
import b5.g;
import bn.v;
import cg.u;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.mapService.response.FilterChipId;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import com.app.tgtg.model.remote.mapService.response.MapFilters;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.y;
import d2.z;
import g3.r9;
import gj.c0;
import gj.e;
import gj.l;
import gj.w;
import i80.n;
import j5.r;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import m3.f;
import m3.m;
import m3.s;
import mv.p0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import w.a0;
import x5.k;
import x60.h;
import x60.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27868a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f27869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f27875h;

    public /* synthetic */ a(FilterChipOption filterChipOption, Function0 function0, jj.c cVar, boolean z11, List list, c0 c0Var, MapFilters mapFilters) {
        this.f27871d = filterChipOption;
        this.f27869b = function0;
        this.f27872e = cVar;
        this.f27870c = z11;
        this.f27873f = list;
        this.f27874g = c0Var;
        this.f27875h = mapFilters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r102;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f27868a;
        f fVar = m.f29332a;
        boolean z13 = this.f27870c;
        q qVar = q.f5711a;
        Object obj4 = this.f27875h;
        Object obj5 = this.f27874g;
        Object obj6 = this.f27873f;
        Object obj7 = this.f27872e;
        Object obj8 = this.f27871d;
        switch (i15) {
            case 0:
                final FilterChipOption filterChipOption = (FilterChipOption) obj8;
                final jj.c cVar = (jj.c) obj7;
                List list = (List) obj6;
                c0 c0Var = (c0) obj5;
                MapFilters mapFilters = (MapFilters) obj4;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                boolean z14 = (iIntValue & 17) != 16;
                int i16 = iIntValue & 1;
                s sVar = (s) nVar;
                if (sVar.R(i16, z14)) {
                    String name = filterChipOption.getName();
                    boolean zH = sVar.h(cVar) | sVar.f(filterChipOption);
                    final Function0 function0 = this.f27869b;
                    boolean zF = zH | sVar.f(function0);
                    Object objM = sVar.M();
                    if (zF || objM == fVar) {
                        final int i17 = 0;
                        objM = new Function0() { // from class: lj.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        FilterChipId id2 = filterChipOption.getId();
                                        jj.c cVar2 = cVar;
                                        cVar2.getClass();
                                        id2.getClass();
                                        w wVar = cVar2.f25290a;
                                        wVar.f20523c.i(new e(id2));
                                        function0.invoke();
                                        break;
                                    default:
                                        FilterChipId id3 = filterChipOption.getId();
                                        jj.c cVar3 = cVar;
                                        cVar3.getClass();
                                        id3.getClass();
                                        w wVar2 = cVar3.f25290a;
                                        wVar2.f20523c.i(new gj.d(id3, true));
                                        wVar2.f20523c.i(l.f20504a);
                                        function0.invoke();
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(objM);
                    }
                    Function0 function02 = (Function0) objM;
                    boolean zH2 = sVar.h(cVar) | sVar.f(filterChipOption) | sVar.f(function0);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        final int i18 = 1;
                        objM2 = new Function0() { // from class: lj.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        FilterChipId id2 = filterChipOption.getId();
                                        jj.c cVar2 = cVar;
                                        cVar2.getClass();
                                        id2.getClass();
                                        w wVar = cVar2.f25290a;
                                        wVar.f20523c.i(new e(id2));
                                        function0.invoke();
                                        break;
                                    default:
                                        FilterChipId id3 = filterChipOption.getId();
                                        jj.c cVar3 = cVar;
                                        cVar3.getClass();
                                        id3.getClass();
                                        w wVar2 = cVar3.f25290a;
                                        wVar2.f20523c.i(new gj.d(id3, true));
                                        wVar2.f20523c.i(l.f20504a);
                                        function0.invoke();
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(objM2);
                    }
                    d.b(name, function0, function02, (Function0) objM2, this.f27870c, u3.e.e(-1733050099, sVar, new v(filterChipOption, list, c0Var, cVar, mapFilters, 8)), sVar, 196608);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                x60.m mVar = (x60.m) obj8;
                x60.l lVar = (x60.l) obj7;
                h hVar = (h) obj6;
                j jVar = (j) obj5;
                Price price = (Price) obj4;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    t tVarC = androidx.compose.foundation.b.c(m2.d(qVar, 1.0f), false, null, null, this.f27869b, 15);
                    float f11 = mVar.f44015k;
                    t tVarG = m2.g(d2.c.C(tVarC, f11, mVar.f44016m, f11, mVar.f44020q), lVar.f43993e, 0.0f, 2);
                    b4.j jVar2 = b4.d.f5693k;
                    d2.b bVar = i.f13801a;
                    i2 i2VarA = h2.a(i.g(mVar.l), jVar2, sVar2, 48);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    t tVarC2 = b4.a.c(tVarG, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                    if (z13) {
                        sVar2.a0(1123140204);
                        g3.i2.a(x0.z(R.drawable.gfx_check_circle_grey, sVar2, 0), null, m2.m(qVar, 16), hVar.f43920h0, sVar2, 440, 0);
                        if (1.0f <= 0.0d) {
                            e2.a.a("invalid weight; must be greater than zero");
                        }
                        r9.d(f0.U(sVar2, R.string.voucher_banner_voucher_applied), new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar2, 0, 0, 131064);
                        if (price == null) {
                            sVar2.a0(1123694266);
                            sVar2.q(false);
                            z11 = false;
                        } else {
                            sVar2.a0(1123694267);
                            r9.d(f0.T(R.string.voucher_banner_savings, new Object[]{mv.d.i(price, 1)}, sVar2), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43961j, sVar2, 0, 0, 131066);
                            z11 = false;
                            sVar2.q(false);
                        }
                        sVar2.q(z11);
                        r102 = z11;
                    } else {
                        sVar2.a0(1124001415);
                        g3.i2.a(x0.z(R.drawable.ic_voucher, sVar2, 0), null, m2.m(qVar, 16), hVar.f43920h0, sVar2, 440, 0);
                        if (1.0f <= 0.0d) {
                            e2.a.a("invalid weight; must be greater than zero");
                        }
                        r9.d(f0.U(sVar2, R.string.voucher_banner_vouchers_available), new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar2, 0, 0, 131064);
                        r102 = 0;
                        sVar2.q(false);
                    }
                    g3.i2.a(x0.z(R.drawable.system_icon_chevron_up_primary_30, sVar2, r102), null, null, hVar.K, sVar2, 56, 4);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
            default:
                ProfileFeature profileFeature = (ProfileFeature) obj8;
                LoyaltyCardDetails loyaltyCardDetails = (LoyaltyCardDetails) obj7;
                f70.i iVar = (f70.i) obj6;
                Function1 function1 = (Function1) obj5;
                Function1 function12 = (Function1) obj4;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    t tVarR = v1.n.r(m2.t(m2.d(qVar, 1.0f), 3), v1.n.q(sVar3), true);
                    d2.d dVar = i.f13803c;
                    b4.i iVar2 = b4.d.f5694m;
                    y yVarA = d2.w.a(dVar, iVar2, sVar3, 0);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    u3.i iVarL2 = sVar3.l();
                    t tVarC3 = b4.a.c(tVarR, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    g gVar = b5.i.f5843f;
                    m3.i.C(yVarA, gVar, sVar3);
                    g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL2, gVar2, sVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar3, numValueOf, gVar3);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar3, dVar2);
                    g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC3, gVar4, sVar3);
                    float f12 = lv.t.f28253g;
                    v1.n.d(x0.z(R.drawable.ic_close24, sVar3, 0), f0.U(sVar3, R.string.loyalty_card_info_cross_voice_over), b3.i.f(b4.d.f5696o, b4.a.a(d2.c.z(qVar, f12), c5.m2.f7291a, new go.s(function12, 7))), null, null, 0.0f, null, sVar3, 8, 120);
                    t tVarD = m2.d(qVar, 1.0f);
                    float f13 = lv.t.f28252f;
                    r9.d(f0.U(sVar3, R.string.loyalty_card_info_title), d2.c.D(tVarD, f12, f13, f12, 0.0f, 8), lv.s.f28215a, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, lv.v.f28263b, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    sn.a.b(null, profileFeature.getFeatureState(), loyaltyCardDetails, null, null, null, true, null, sVar3, 1572864, ModuleDescriptor.MODULE_VERSION);
                    t tVarA = d2.c.A(m2.t(m2.d(qVar, 1.0f), 3), f12, f13);
                    y yVarA2 = d2.w.a(dVar, iVar2, sVar3, 0);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    u3.i iVarL3 = sVar3.l();
                    t tVarC4 = b4.a.c(tVarA, sVar3);
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(yVarA2, gVar, sVar3);
                    m3.i.C(iVarL3, gVar2, sVar3);
                    a0.y(iHashCode3, sVar3, gVar3, sVar3, dVar2);
                    m3.i.C(tVarC4, gVar4, sVar3);
                    sVar3.a0(1526857040);
                    u uVar = new u(R.drawable.ic_loyalty_card_info_star, f0.U(sVar3, R.string.loyalty_card_info_segment_1_title), f0.U(sVar3, z13 ? R.string.loyalty_card_info_segment_1_description_parcels : R.string.loyalty_card_info_segment_1_description), f0.U(sVar3, z13 ? R.string.loyalty_card_info_segment_1_description_parcels_voice_over : R.string.loyalty_card_info_segment_1_description_voice_over), (String) null, (Function0) null, 112);
                    String strU = f0.U(sVar3, R.string.loyalty_card_info_segment_2_title);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Iterator it = d0.h(uVar, new u(R.drawable.ic_loyalty_card_info_gifts, strU, String.format(f0.U(sVar3, R.string.loyalty_card_info_segment_2_description), Arrays.copyOf(new Object[]{Integer.valueOf(loyaltyCardDetails.getMaxPoints()), mv.d.i(loyaltyCardDetails.getVoucherValue(), 1)}, 2)), (String) null, (String) null, (Function0) null, 120), new u(R.drawable.ic_loyalty_card_info_reward, f0.U(sVar3, R.string.loyalty_card_info_segment_3_title), String.format(f0.U(sVar3, z13 ? R.string.loyalty_card_info_segment_3_description_parcels : R.string.loyalty_card_info_segment_3_description), Arrays.copyOf(new Object[]{Integer.valueOf(loyaltyCardDetails.getVoucherUsageDuration())}, 1)), (String) null, (String) null, (Function0) null, 120), new u(R.drawable.ic_loyalty_card_info_clock, f0.U(sVar3, R.string.loyalty_card_info_segment_4_title), String.format(f0.U(sVar3, R.string.loyalty_card_info_segment_4_description), Arrays.copyOf(new Object[]{p0.n(loyaltyCardDetails.getExpiryDate())}, 1)), (String) null, (String) null, (Function0) null, 120)).iterator();
                    while (it.hasNext()) {
                        cg.j.d((u) it.next(), sVar3, 0);
                    }
                    sVar3.q(false);
                    sVar3.q(true);
                    String strU2 = f0.U(sVar3, R.string.loyalty_card_info_see_full_terms_voice_over);
                    t tVarD2 = m2.d(qVar, 1.0f);
                    float f14 = lv.t.f28252f;
                    float f15 = lv.t.f28253g;
                    t tVarA2 = b4.a.a(d2.c.D(tVarD2, f15, f14, f15, 0.0f, 8), c5.m2.f7291a, new on.l(11, this.f27869b));
                    boolean zF2 = sVar3.f(strU2);
                    Object objM3 = sVar3.M();
                    if (zF2 || objM3 == fVar) {
                        objM3 = new qb.s(strU2, 17);
                        sVar3.k0(objM3);
                    }
                    r9.d(f0.U(sVar3, R.string.loyalty_card_info_see_full_terms), r.c(tVarA2, false, (Function1) objM3), lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, new k(3), 0L, 0, false, 0, 0, null, lv.v.f28283w, sVar3, 805306752, 12582912, 129528);
                    float f16 = lv.t.f28254h;
                    d2.c.f(m2.e(qVar, f16), sVar3);
                    int[] iArr = sn.b.$EnumSwitchMapping$0;
                    if (iArr[iVar.ordinal()] == 1) {
                        i11 = -1930612584;
                        i12 = R.string.loyalty_card_info_cta_2_voice_over;
                        z12 = false;
                    } else {
                        z12 = false;
                        i11 = -1930610154;
                        i12 = R.string.loyalty_card_info_cta_voice_over;
                    }
                    String strJ = b3.i.j(i11, i12, sVar3, sVar3, z12);
                    t tVarB = d2.c.B(m2.d(qVar, 1.0f), f15, 0.0f, 2);
                    boolean zF3 = sVar3.f(strJ);
                    Object objM4 = sVar3.M();
                    if (zF3 || objM4 == fVar) {
                        objM4 = new qb.s(strJ, 18);
                        sVar3.k0(objM4);
                    }
                    t tVarC5 = r.c(tVarB, false, (Function1) objM4);
                    if (iArr[iVar.ordinal()] == 1) {
                        i13 = -1299735860;
                        i14 = R.string.loyalty_card_info_cta_2;
                    } else {
                        i13 = -1299733782;
                        i14 = R.string.loyalty_card_info_cta;
                    }
                    String strJ2 = b3.i.j(i13, i14, sVar3, sVar3, false);
                    boolean zF4 = sVar3.f(function1);
                    Object objM5 = sVar3.M();
                    if (zF4 || objM5 == fVar) {
                        objM5 = new qr.f(function1, 4);
                        sVar3.k0(objM5);
                    }
                    v0.n.l(tVarC5, strJ2, null, null, null, false, false, null, null, (Function0) objM5, sVar3, 0, 508);
                    d2.c.f(m2.e(qVar, f16), sVar3);
                    sVar3.q(true);
                } else {
                    sVar3.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(ProfileFeature profileFeature, LoyaltyCardDetails loyaltyCardDetails, f70.i iVar, Function1 function1, Function1 function12, boolean z11, Function0 function0) {
        this.f27871d = profileFeature;
        this.f27872e = loyaltyCardDetails;
        this.f27873f = iVar;
        this.f27874g = function1;
        this.f27875h = function12;
        this.f27870c = z11;
        this.f27869b = function0;
    }

    public /* synthetic */ a(Function0 function0, x60.m mVar, x60.l lVar, boolean z11, h hVar, j jVar, Price price) {
        this.f27869b = function0;
        this.f27871d = mVar;
        this.f27872e = lVar;
        this.f27870c = z11;
        this.f27873f = hVar;
        this.f27874g = jVar;
        this.f27875h = price;
    }
}
