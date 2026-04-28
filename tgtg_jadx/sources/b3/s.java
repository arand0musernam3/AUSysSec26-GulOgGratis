package b3;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.w1;
import org.bouncycastle.i18n.TextBundle;
import z4.c0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f5634c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f5636e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f5632a = 30;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f5633b = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f5635d = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f5637f = 48;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f5638g = 68;

    static {
        float f11 = 8;
        f5634c = f11;
        f5636e = f11;
    }

    public static final void a(Function2 function2, Function2 function22, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1302703572);
        int i12 = (sVar.h(function2) ? 4 : 2) | i11 | (sVar.h(function22) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.c.D(qVar, f5633b, 0.0f, f5634c, 0.0f, 10);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new p();
                sVar.k0(objM);
            }
            u0 u0Var = (u0) objM;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0Var, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            b5.g gVar3 = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar3);
            }
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarB = d2.c.B(c0.m(qVar, TextBundle.TEXT_ENTRY), 0.0f, f5635d, 1);
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode2))) {
                e0.f.y(iHashCode2, sVar, iHashCode2, gVar3);
            }
            m3.i.C(tVarC2, gVar4, sVar);
            w.a0.w(i12 & 14, function2, sVar, true);
            b4.t tVarM = c0.m(qVar, "action");
            u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarM, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode3))) {
                e0.f.y(iHashCode3, sVar, iHashCode3, gVar3);
            }
            m3.i.C(tVarC3, gVar4, sVar);
            w.a0.x((i12 >> 3) & 14, function22, sVar, true, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new l(function2, function22, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final b4.t r22, kotlin.jvm.functions.Function2 r23, i4.v0 r24, long r25, long r27, float r29, final kotlin.jvm.functions.Function2 r30, m3.n r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.s.b(b4.t, kotlin.jvm.functions.Function2, i4.v0, long, long, float, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    public static final void c(Function2 function2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(343813818);
        int i12 = (sVar.h(function2) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = r.f5631a;
                sVar.k0(objM);
            }
            u0 u0Var = (u0) objM;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0Var, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            b5.g gVar3 = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar3);
            }
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarA = d2.c.A(qVar, f5633b, f5635d);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode2))) {
                e0.f.y(iHashCode2, sVar, iHashCode2, gVar3);
            }
            m3.i.C(tVarC2, gVar4, sVar);
            w.a0.x(i12 & 14, function2, sVar, true, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new n(i11, 0, function2);
        }
    }
}
