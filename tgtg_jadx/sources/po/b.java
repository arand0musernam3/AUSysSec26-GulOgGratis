package po;

import b4.q;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import d2.i;
import d2.m2;
import d2.w;
import d2.y;
import d2.z;
import g3.j3;
import g3.r9;
import g3.w6;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lv.t;
import lv.v;
import m3.f;
import m3.m;
import m3.s;
import o00.x0;
import o30.f0;
import r8.k;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f35575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w6 f35576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f35577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f35578e;

    public /* synthetic */ b(b0 b0Var, w6 w6Var, Function0 function0, Function0 function02, int i11) {
        this.f35574a = i11;
        this.f35575b = b0Var;
        this.f35576c = w6Var;
        this.f35577d = function0;
        this.f35578e = function02;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f35574a;
        f fVar = m.f29332a;
        Function0 function0 = this.f35578e;
        Function0 function02 = this.f35577d;
        w6 w6Var = this.f35576c;
        b0 b0Var = this.f35575b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f11 = t.f28254h;
                    q qVar = q.f5711a;
                    b4.t tVarB = d2.c.B(qVar, f11, 0.0f, 2);
                    y yVarA = w.a(i.f13803c, b4.d.f5695n, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarB, sVar);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    float f12 = t.f28256j;
                    r9.d(k.f(f12, R.string.offer_to_delegate_on_cancel_title, qVar, sVar, sVar), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28271j, sVar, 0, 12582912, 131070);
                    r9.d(k.f(t.f28251e, R.string.offer_to_delegate_on_cancel_description, qVar, sVar, sVar), null, 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, 0, 12582912, 130046);
                    d2.c.f(m2.m(qVar, f12), sVar);
                    v1.n.d(x0.z(R.drawable.offer_to_delegate_icon, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
                    d2.c.f(m2.m(qVar, f12), sVar);
                    float f13 = t.f28253g;
                    b4.t tVarD = m2.d(d2.c.B(qVar, f13, 0.0f, 2), 1.0f);
                    lv.e eVar = lv.e.LARGE;
                    String strU = f0.U(sVar, R.string.offer_to_delegate_on_cancel_positive_cta);
                    boolean zH = sVar.h(b0Var) | sVar.f(w6Var) | sVar.f(function02);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new j3(b0Var, w6Var, function02, 4);
                        sVar.k0(objM);
                    }
                    v0.n.l(tVarD, strU, null, null, eVar, false, false, null, null, (Function0) objM, sVar, 24582, 492);
                    d2.c.f(m2.m(qVar, f13), sVar);
                    b4.t tVarD2 = m2.d(d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f13, 7), 1.0f);
                    String strU2 = f0.U(sVar, R.string.offer_to_delegate_on_cancel_negative_cta);
                    boolean zH2 = sVar.h(b0Var) | sVar.f(w6Var) | sVar.f(function0);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new j3(b0Var, w6Var, function0, 5);
                        sVar.k0(objM2);
                    }
                    v0.n.o(tVarD2, strU2, null, null, null, false, (Function0) objM2, sVar, 6, 0, 1020);
                    sVar.q(true);
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
                    float f14 = t.f28254h;
                    q qVar2 = q.f5711a;
                    b4.t tVarB2 = d2.c.B(qVar2, f14, 0.0f, 2);
                    y yVarA2 = w.a(i.f13803c, b4.d.f5695n, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC2 = b4.a.c(tVarB2, sVar2);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                    float f15 = t.f28256j;
                    r9.d(k.f(f15, R.string.dynamic_pricing_cancel_order_bottomsheet_title, qVar2, sVar2, sVar2), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28271j, sVar2, 0, 12582912, 131070);
                    r9.d(k.f(t.f28251e, R.string.dynamic_pricing_cancel_order_bottomsheet_description, qVar2, sVar2, sVar2), null, 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar2, 0, 12582912, 130046);
                    d2.c.f(m2.m(qVar2, f15), sVar2);
                    v1.n.d(x0.z(R.drawable.cancel_dynamic_price, sVar2, 0), null, null, null, null, 0.0f, null, sVar2, 56, 124);
                    d2.c.f(m2.m(qVar2, f15), sVar2);
                    float f16 = t.f28253g;
                    b4.t tVarD3 = m2.d(d2.c.B(qVar2, f16, 0.0f, 2), 1.0f);
                    lv.e eVar2 = lv.e.LARGE;
                    String strU3 = f0.U(sVar2, R.string.dynamic_pricing_cancel_order_bottomsheet_button_positive);
                    boolean zH3 = sVar2.h(b0Var) | sVar2.f(w6Var) | sVar2.f(function02);
                    Object objM3 = sVar2.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new j3(b0Var, w6Var, function02, 6);
                        sVar2.k0(objM3);
                    }
                    v0.n.l(tVarD3, strU3, null, null, eVar2, false, false, null, null, (Function0) objM3, sVar2, 24582, 492);
                    d2.c.f(m2.m(qVar2, f16), sVar2);
                    b4.t tVarD4 = m2.d(d2.c.D(qVar2, 0.0f, 0.0f, 0.0f, f16, 7), 1.0f);
                    String strU4 = f0.U(sVar2, R.string.dynamic_pricing_cancel_order_bottomsheet_button_negative);
                    boolean zH4 = sVar2.h(b0Var) | sVar2.f(w6Var) | sVar2.f(function0);
                    Object objM4 = sVar2.M();
                    if (zH4 || objM4 == fVar) {
                        objM4 = new j3(b0Var, w6Var, function0, 7);
                        sVar2.k0(objM4);
                    }
                    v0.n.o(tVarD4, strU4, null, null, null, false, (Function0) objM4, sVar2, 6, 0, 1020);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
