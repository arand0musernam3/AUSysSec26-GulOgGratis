package g3;

import com.app.tgtg.R;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19476a = 22;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.u1 f19477b = t1.c.k(300, 0, t1.w.f39593a, 2);

    public static final void a(b4.t tVar, Function2 function2, m3.n nVar, int i11) {
        b4.t tVar2;
        Function2 function22;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1361920385);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.h(function2) ? 32 : 16);
        int i13 = 0;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            String strJ = i3.r.j(sVar, R.string.m3c_bottom_sheet_drag_handle_description);
            b4.t tVarD = d2.m2.d(b4.q.f5711a, 1.0f);
            z4.u0 u0VarD = d2.p.d(b4.d.f5687e, false);
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            b5.g gVar = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar);
            }
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            tVar2 = tVar;
            function22 = function2;
            ba.b(z9.a(sVar), u3.e.e(1497042086, sVar, new o6(strJ, i13)), ba.c(sVar), tVar2, false, function22, sVar, ((i12 << 9) & 7168) | 48 | ((i12 << 21) & 234881024), 240);
            sVar.q(true);
        } else {
            tVar2 = tVar;
            function22 = function2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.u2(tVar2, function22, i11, 24);
        }
    }
}
