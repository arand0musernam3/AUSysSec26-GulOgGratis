package qi;

import b4.d;
import b4.k;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import d2.m2;
import d2.p;
import d2.u;
import dm.g;
import i4.g0;
import i4.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.f;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import s1.y;
import t1.c;
import t1.w;
import u3.e;
import z4.l;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f37057a = 74;

    public static final void a(int i11, t tVar, Function0 function0, n nVar) {
        Function0 function02;
        s sVar;
        t tVar2;
        b1 b1Var;
        b1 b1Var2;
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-89799166);
        int i12 = i11 | 6 | (sVar2.h(function0) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar2.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(new z5.f(f37057a));
                sVar2.k0(objM);
            }
            b1 b1Var3 = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            b1 b1Var4 = (b1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = i.w(Boolean.FALSE);
                sVar2.k0(objM3);
            }
            b1 b1Var5 = (b1) objM3;
            Unit unit = Unit.f26487a;
            boolean z11 = (i12 & 112) == 32;
            Object objM4 = sVar2.M();
            if (z11 || objM4 == fVar) {
                af.a aVar = new af.a(function0, b1Var3, b1Var4, b1Var5, null, 2);
                function02 = function0;
                b1Var = b1Var4;
                b1Var2 = b1Var5;
                sVar2.k0(aVar);
                objM4 = aVar;
            } else {
                function02 = function0;
                b1Var = b1Var4;
                b1Var2 = b1Var5;
            }
            i.h(unit, (Function2) objM4, sVar2);
            long j9 = lv.s.J;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarThen = v1.n.j(qVar, j9, r0Var).then(m2.f13850c);
            u0 u0VarD = p.d(d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarThen, sVar2);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            i.C(u0VarD, b5.i.f5843f, sVar2);
            i.C(iVarL, b5.i.f5842e, sVar2);
            i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar2, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar2);
            n4.b bVarZ = x0.z(R.drawable.donation_content_blob, sVar2, 0);
            k kVar = d.f5687e;
            u uVar = u.f13938a;
            tVar2 = qVar;
            v1.n.d(bVarZ, "CharityBlob", m2.e(m2.d(uVar.a(qVar, kVar), 1.0f), ((z5.f) b1Var3.getValue()).f47277a), null, l.f47168c, 0.0f, null, sVar2, 24632, 104);
            sVar = sVar2;
            y.d(((Boolean) b1Var.getValue()).booleanValue(), uVar.a(tVar2, kVar), s1.r0.d(c.k(600, 0, w.f39596d, 2), 2), null, null, e.e(1351199076, sVar, new gi.b(b1Var2, 5)), sVar, 196608, 24);
            sVar.q(true);
        } else {
            function02 = function0;
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g(tVar2, function02, i11, 3);
        }
    }
}
