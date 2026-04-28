package go;

import com.app.tgtg.model.remote.order.Order;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.y;
import d2.z;
import g3.g9;
import g3.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import r5.f0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u70.f f20745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u70.f f20746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u70.f f20747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f20748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f20749h;

    public /* synthetic */ p(String str, boolean z11, boolean z12, b2.l lVar, Function2 function2, Function2 function22, Function2 function23) {
        this.f20742a = 2;
        this.f20743b = str;
        this.f20748g = z11;
        this.f20749h = z12;
        this.f20744c = lVar;
        this.f20745d = function2;
        this.f20746e = function22;
        this.f20747f = function23;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        boolean z12;
        switch (this.f20742a) {
            case 0:
                a aVar = (a) this.f20743b;
                Function0 function0 = (Function0) this.f20744c;
                Function0 function02 = (Function0) this.f20745d;
                Function0 function03 = (Function0) this.f20746e;
                Function0 function04 = (Function0) this.f20747f;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarZ = d2.c.z(qVar, 4);
                    y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(yVarA, gVar, sVar);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar);
                    d2.e eVar = d2.i.f13805e;
                    float f11 = 10;
                    b4.t tVarD = m2.d(d2.c.D(qVar, 0.0f, f11, 0.0f, f11, 5), 1.0f);
                    i2 i2VarA = h2.a(eVar, b4.d.f5692j, sVar, 6);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarD, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(i2VarA, gVar, sVar);
                    m3.i.C(iVarL2, gVar2, sVar);
                    a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                    m3.i.C(tVarC2, gVar4, sVar);
                    sVar.a0(-105186040);
                    Order order = aVar.f20698a;
                    if (order.isDonation()) {
                        sVar.a0(443272185);
                        z11 = false;
                        bx.o.B(sVar, 0);
                        sVar.q(false);
                        z12 = true;
                    } else {
                        z11 = false;
                        sVar.a0(443369494);
                        z12 = true;
                        jf.e.l(order.getState(), true, true, sVar, 432);
                        sVar.q(false);
                    }
                    sVar.q(z11);
                    sVar.q(z12);
                    s0.b(m2.d(qVar, 1.0f), l2.g.b(12), s0.p(lv.s.J, sVar, 6), null, null, u3.e.e(-373363219, sVar, new p(aVar, function0, function02, function03, function04, this.f20748g, this.f20749h, 1)), sVar, 196614, 24);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                a aVar2 = (a) this.f20743b;
                Function0 function05 = (Function0) this.f20744c;
                Function0 function06 = (Function0) this.f20745d;
                Function0 function07 = (Function0) this.f20746e;
                Function0 function08 = (Function0) this.f20747f;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bx.o.d(aVar2, function05, function06, function07, function08, this.f20748g, null, this.f20749h, sVar2, 0, 64);
                } else {
                    sVar2.U();
                }
                break;
            default:
                String str = (String) this.f20743b;
                b2.l lVar = (b2.l) this.f20744c;
                Function2 function2 = (Function2) this.f20745d;
                Function2 function22 = (Function2) this.f20746e;
                Function2 function23 = (Function2) this.f20747f;
                Function2 function24 = (Function2) obj;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                function24.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((m3.s) nVar3).h(function24) ? 4 : 2;
                }
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    int i11 = iIntValue3;
                    g9 g9Var = g9.f18691a;
                    b2 b2VarC = d2.c.c(10, 0.0f, 2);
                    boolean z13 = this.f20748g;
                    g9Var.b(str, function24, z13, this.f20749h, f0.f37673a, lVar, function2, function22, function23, null, null, null, b2VarC, u3.e.e(-1994277733, sVar3, new an.b(z13, lVar, 1)), sVar3, ((i11 << 3) & 112) | 221184, 114819072, 63680);
                } else {
                    sVar3.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ p(a aVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z11, boolean z12, int i11) {
        this.f20742a = i11;
        this.f20743b = aVar;
        this.f20744c = function0;
        this.f20745d = function02;
        this.f20746e = function03;
        this.f20747f = function04;
        this.f20748g = z11;
        this.f20749h = z12;
    }
}
