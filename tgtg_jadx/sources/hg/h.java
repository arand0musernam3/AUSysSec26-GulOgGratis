package hg;

import b4.q;
import b4.t;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.order.Order;
import d2.h2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.u;
import d2.w;
import d2.y;
import d2.z;
import d2.z1;
import g3.i2;
import g3.r9;
import g3.s0;
import i4.g0;
import i4.r;
import i4.v;
import i80.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.m;
import m3.s;
import o00.x0;
import o30.f0;
import r8.k;
import w.a0;
import z4.l;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22060e;

    public /* synthetic */ h(boolean z11, r rVar, gg.a aVar, u3.d dVar) {
        this.f22056a = 0;
        this.f22057b = z11;
        this.f22058c = rVar;
        this.f22059d = aVar;
        this.f22060e = dVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        boolean z11;
        int i12 = this.f22056a;
        u uVar = u.f13938a;
        q qVar = q.f5711a;
        m3.f fVar = m.f29332a;
        boolean z12 = this.f22057b;
        Object obj4 = this.f22060e;
        Object obj5 = this.f22059d;
        Object obj6 = this.f22058c;
        switch (i12) {
            case 0:
                r rVar = (r) obj6;
                gg.a aVar = (gg.a) obj5;
                u3.d dVar = (u3.d) obj4;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    u0 u0VarD = p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(qVar, sVar);
                    j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    if (z12) {
                        i11 = 0;
                        sVar.a0(1934032742);
                        sVar.q(false);
                    } else {
                        sVar.a0(1933706002);
                        i11 = 0;
                        p.a(v1.n.h(uVar.b(), rVar, aVar, 0.08f), sVar, 0);
                        sVar.q(false);
                    }
                    k.w(i11, dVar, sVar, true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                Function0 function0 = (Function0) obj6;
                DiscoverBucket discoverBucket = (DiscoverBucket) obj5;
                Function0 function02 = (Function0) obj4;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    u0 u0VarD2 = p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    q qVar2 = q.f5711a;
                    t tVarC2 = b4.a.c(qVar2, sVar2);
                    j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(u0VarD2, gVar, sVar2);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL2, gVar2, sVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf, gVar3);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar2, dVar2);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC2, gVar4, sVar2);
                    v1.n.d(x0.z(R.drawable.recipe_banner_pizza, sVar2, 0), null, m2.d(m2.e(qVar2, 400), 1.0f), null, l.f47166a, 0.0f, null, sVar2, 25016, 104);
                    n4.b bVarZ = x0.z(R.drawable.ic_arrow_green, sVar2, 0);
                    long j9 = v.f23315h;
                    float f11 = lv.t.f28254h;
                    i2.a(bVarZ, null, b4.a.a(uVar.a(d2.c.D(qVar2, 0.0f, 0.0f, f11, f11, 3), b4.d.f5691i), c5.m2.f7291a, new bm.f(27, function0)), j9, sVar2, 3128, 0);
                    t tVarD = m2.d(qVar2, 1.0f);
                    y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    u3.i iVarL3 = sVar2.l();
                    t tVarC3 = b4.a.c(tVarD, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA, gVar, sVar2);
                    m3.i.C(iVarL3, gVar2, sVar2);
                    a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar2);
                    m3.i.C(tVarC3, gVar4, sVar2);
                    t tVarD2 = d2.c.D(m2.d(qVar2, 1.0f), f11, f11, f11, 0.0f, 8);
                    d2.i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 48);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    u3.i iVarL4 = sVar2.l();
                    t tVarC4 = b4.a.c(tVarD2, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(i2VarA, gVar, sVar2);
                    m3.i.C(iVarL4, gVar2, sVar2);
                    a0.y(iHashCode4, sVar2, gVar3, sVar2, dVar2);
                    m3.i.C(tVarC4, gVar4, sVar2);
                    String tag = discoverBucket != null ? discoverBucket.getTag() : null;
                    if (tag == null) {
                        tag = b3.i.j(1918210594, R.string.fridge_recipe_promo_card_tag, sVar2, sVar2, false);
                    } else {
                        sVar2.a0(1918210129);
                        sVar2.q(false);
                    }
                    cg.j.n(qVar2, tag, f0.U(sVar2, R.string.favorites_promo_tag_voice_over), 0L, 0L, sVar2, 6, 24);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    d2.c.f(new n1(1.0f, true), sVar2);
                    if (z12) {
                        sVar2.a0(-664695172);
                        s0.h(function02, m2.m(qVar2, 24), false, null, null, null, lp.d.f28026j, sVar2, 1572912, 60);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-664218795);
                        sVar2.q(false);
                    }
                    sVar2.q(true);
                    float f12 = lv.t.f28251e;
                    d2.c.f(m2.e(qVar2, f12), sVar2);
                    float f13 = lv.t.f28253g;
                    t tVarD3 = d2.c.D(qVar2, f11, 0.0f, f13, 0.0f, 10);
                    String title = discoverBucket != null ? discoverBucket.getTitle() : null;
                    if (title == null) {
                        title = b3.i.j(-1424954872, R.string.fridge_recipe_promo_card_title, sVar2, sVar2, false);
                    } else {
                        sVar2.a0(-1424955399);
                        sVar2.q(false);
                    }
                    r9.d(title, tVarD3, lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, lv.v.f28263b, sVar2, 432, 12607872, 110584);
                    d2.c.f(m2.e(qVar2, f12), sVar2);
                    t tVarD4 = d2.c.D(qVar2, f11, 0.0f, f13, 0.0f, 10);
                    String description = discoverBucket != null ? discoverBucket.getDescription() : null;
                    if (description == null) {
                        description = b3.i.j(-1424934745, R.string.fridge_recipe_promo_card_body, sVar2, sVar2, false);
                    } else {
                        sVar2.a0(-1424935458);
                        sVar2.q(false);
                    }
                    r9.d(description, tVarD4, 0L, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, lv.v.f28274n, sVar2, 48, 12607872, 110588);
                    sVar2.q(true);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                List list = (List) obj6;
                Function1 function1 = (Function1) obj5;
                Function0 function03 = (Function0) obj4;
                z1 z1Var = (z1) obj;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                z1Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((s) nVar3).f(z1Var) ? 4 : 2;
                }
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    t tVarR = d2.c.r(d2.c.y(v1.n.j(qVar, lv.s.J, g0.f23254b), z1Var).then(m2.f13850c));
                    b4.i iVar = b4.d.f5695n;
                    boolean zH = sVar3.h(list) | sVar3.f(function1) | sVar3.g(z12) | sVar3.f(function03);
                    Object objM = sVar3.M();
                    if (zH || objM == fVar) {
                        objM = new a3.b(list, z12, function1, function03);
                        sVar3.k0(objM);
                    }
                    ox.h.c(tVarR, null, null, null, iVar, null, false, null, (Function1) objM, sVar3, 196608, 478);
                } else {
                    sVar3.U();
                }
                break;
            default:
                un.a aVar2 = (un.a) obj6;
                Function1 function12 = (Function1) obj5;
                Order order = (Order) obj4;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    q qVar3 = q.f5711a;
                    t tVarC5 = m2.c(qVar3, 1.0f);
                    float f14 = lv.t.f28253g;
                    t tVarZ = d2.c.z(tVarC5, f14);
                    boolean zH2 = sVar4.h(aVar2);
                    Object objM2 = sVar4.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new sg.c(aVar2, 10);
                        sVar4.k0(objM2);
                    }
                    t tVarC6 = j5.r.c(tVarZ, false, (Function1) objM2);
                    boolean zF = sVar4.f(function12);
                    Object objM3 = sVar4.M();
                    if (zF || objM3 == fVar) {
                        objM3 = new qr.f(function12, 16);
                        sVar4.k0(objM3);
                    }
                    t tVarC7 = androidx.compose.foundation.b.c(tVarC6, false, null, null, (Function0) objM3, 15);
                    d2.i2 i2VarA2 = h2.a(d2.i.f13801a, b4.d.f5692j, sVar4, 0);
                    int iHashCode5 = Long.hashCode(sVar4.T);
                    u3.i iVarL5 = sVar4.l();
                    t tVarC8 = b4.a.c(tVarC7, sVar4);
                    j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar3);
                    } else {
                        sVar4.n0();
                    }
                    b5.g gVar5 = b5.i.f5843f;
                    m3.i.C(i2VarA2, gVar5, sVar4);
                    b5.g gVar6 = b5.i.f5842e;
                    m3.i.C(iVarL5, gVar6, sVar4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    b5.g gVar7 = b5.i.f5844g;
                    m3.i.v(sVar4, numValueOf2, gVar7);
                    b5.d dVar3 = b5.i.f5845h;
                    m3.i.z(sVar4, dVar3);
                    b5.g gVar8 = b5.i.f5841d;
                    m3.i.C(tVarC8, gVar8, sVar4);
                    t tVarU = m2.u(qVar3, null, 3);
                    b4.j jVar = b4.d.f5693k;
                    w.b.k(b3.i.g(jVar, tVarU), aVar2.f41450a, aVar2.f41454e, aVar2.f41453d, this.f22057b, order.isMultiItem(), sVar4, 0);
                    d2.c.f(m2.m(qVar3, f14), sVar4);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    t tVarG = b3.i.g(jVar, m2.t(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 3));
                    y yVarA2 = w.a(d2.i.f13803c, b4.d.f5694m, sVar4, 0);
                    int iHashCode6 = Long.hashCode(sVar4.T);
                    u3.i iVarL6 = sVar4.l();
                    t tVarC9 = b4.a.c(tVarG, sVar4);
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar3);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(yVarA2, gVar5, sVar4);
                    m3.i.C(iVarL6, gVar6, sVar4);
                    a0.y(iHashCode6, sVar4, gVar7, sVar4, dVar3);
                    m3.i.C(tVarC9, gVar8, sVar4);
                    String str = aVar2.f41451b;
                    if (str == null) {
                        sVar4.a0(46180752);
                        sVar4.q(false);
                    } else {
                        sVar4.a0(46180753);
                        r9.d(str, m2.d(qVar3, 1.0f), lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 2, false, 1, 0, null, lv.v.f28275o, sVar4, 432, 12607872, 109560);
                        sVar4.q(false);
                    }
                    if (aVar2.f41457h) {
                        sVar4.a0(46724183);
                        t tVarD5 = d2.c.D(qVar3, 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13);
                        Integer overallRating = order.getOverallRating();
                        ox.h.h(overallRating != null ? overallRating.intValue() : 0, 6, tVarD5, sVar4);
                        z11 = false;
                        sVar4.q(false);
                    } else {
                        z11 = false;
                        sVar4.a0(47115310);
                        sVar4.q(false);
                    }
                    String str2 = aVar2.f41455f;
                    if (str2 == null) {
                        sVar4.a0(47176751);
                        sVar4.q(z11);
                    } else {
                        sVar4.a0(47176752);
                        r9.d(str2, d2.c.D(m2.d(qVar3, 1.0f), 0.0f, lv.t.f28248b, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar4, 432, 12607872, 109560);
                        sVar4.q(false);
                    }
                    if (aVar2.f41456g) {
                        sVar4.a0(47826295);
                        t tVarD6 = d2.c.D(m2.d(qVar3, 1.0f), 0.0f, lv.t.f28251e, 0.0f, 0.0f, 13);
                        boolean zF2 = sVar4.f(function12);
                        Object objM4 = sVar4.M();
                        if (zF2 || objM4 == fVar) {
                            objM4 = new qr.f(function12, 17);
                            sVar4.k0(objM4);
                        }
                        f0.n(6, tVarD6, order, (Function0) objM4, sVar4);
                        sVar4.q(false);
                    } else {
                        sVar4.a0(48401934);
                        sVar4.q(false);
                    }
                    sVar4.q(true);
                    sVar4.q(true);
                } else {
                    sVar4.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(int i11, Object obj, Object obj2, Object obj3, boolean z11) {
        this.f22056a = i11;
        this.f22058c = obj;
        this.f22059d = obj2;
        this.f22057b = z11;
        this.f22060e = obj3;
    }
}
