package b3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import i4.g0;
import i4.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.d3;
import m3.k1;
import w4.h0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5639a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f5640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f5641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f5642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f5643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5645g;

    public /* synthetic */ t(b4.t tVar, v0 v0Var, long j9, float f11, float f12, Function2 function2) {
        this.f5640b = tVar;
        this.f5643e = v0Var;
        this.f5644f = j9;
        this.f5641c = f11;
        this.f5642d = f12;
        this.f5645g = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5639a;
        Object obj3 = this.f5645g;
        switch (i11) {
            case 0:
                Function2 function2 = (Function2) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f fVar = (f) sVar.j(h.f5602a);
                    d3 d3Var = b.f5594a;
                    long jF = ((a) sVar.j(d3Var)).f();
                    long jK = this.f5644f;
                    if (!i4.v.c(jK, jF) || fVar == null) {
                        sVar.a0(-1124546347);
                        sVar.q(false);
                    } else {
                        sVar.a0(-1124614454);
                        sVar.a0(-1687113661);
                        a aVar = (a) sVar.j(d3Var);
                        if (z5.f.a(this.f5641c, 0) <= 0 || aVar.g()) {
                            sVar.a0(-1095489470);
                            sVar.q(false);
                        } else {
                            sVar.a0(-1095627978);
                            d3 d3Var2 = h.f5602a;
                            float fLog = ((((float) Math.log(r5 + 1)) * 4.5f) + 2.0f) / 100.0f;
                            sVar.a0(-583917585);
                            a aVar2 = (a) sVar.j(b.f5594a);
                            long jD = aVar2.d();
                            k1 k1Var = aVar2.f5578i;
                            k1 k1Var2 = aVar2.f5577h;
                            long jC = (i4.v.c(jK, jD) || i4.v.c(jK, ((i4.v) aVar2.f5571b.getValue()).f23317a)) ? ((i4.v) k1Var2.getValue()).f23317a : (i4.v.c(jK, aVar2.e()) || i4.v.c(jK, ((i4.v) aVar2.f5573d.getValue()).f23317a)) ? ((i4.v) k1Var.getValue()).f23317a : i4.v.c(jK, aVar2.a()) ? ((i4.v) aVar2.f5579j.getValue()).f23317a : i4.v.c(jK, aVar2.f()) ? aVar2.c() : i4.v.c(jK, aVar2.b()) ? ((i4.v) aVar2.l.getValue()).f23317a : i4.v.f23315h;
                            if (jC == 16) {
                                jC = ((i4.v) sVar.j(e.f5599a)).f23317a;
                            }
                            sVar.q(false);
                            jK = g0.k(i4.v.b(fLog, jC), jK);
                            sVar.q(false);
                        }
                        sVar.q(false);
                        sVar.q(false);
                    }
                    b4.t tVar = this.f5640b;
                    float f11 = this.f5642d;
                    v0 v0Var = this.f5643e;
                    b4.t tVarB = f4.g.b(v1.n.j(f4.g.k(tVar, f11, v0Var, false, 0L, 0L, 24).then(b4.q.f5711a), jK, v0Var), v0Var);
                    Object objM = sVar.M();
                    m3.f fVar2 = m3.m.f29332a;
                    if (objM == fVar2) {
                        objM = new defpackage.g(12);
                        sVar.k0(objM);
                    }
                    b4.t tVarC = j5.r.c(tVarB, false, (Function1) objM);
                    Unit unit = Unit.f26487a;
                    Object objM2 = sVar.M();
                    if (objM2 == fVar2) {
                        objM2 = v.f5654a;
                        sVar.k0(objM2);
                    }
                    b4.t tVarA = h0.a(tVarC, unit, (PointerInputEventHandler) objM2);
                    u0 u0VarD = d2.p.d(b4.d.f5683a, true);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarA, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar, iHashCode, gVar);
                    }
                    m3.i.C(tVarC2, b5.i.f5841d, sVar);
                    w.a0.w(0, function2, sVar, true);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((g3.m) obj3).a(this.f5640b, this.f5641c, this.f5642d, this.f5643e, this.f5644f, (m3.n) obj, m3.i.F(196609));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ t(g3.m mVar, b4.t tVar, float f11, float f12, v0 v0Var, long j9, int i11) {
        this.f5645g = mVar;
        this.f5640b = tVar;
        this.f5641c = f11;
        this.f5642d = f12;
        this.f5643e = v0Var;
        this.f5644f = j9;
    }
}
