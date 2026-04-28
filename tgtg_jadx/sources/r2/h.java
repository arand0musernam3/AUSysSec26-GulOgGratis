package r2;

import a3.q0;
import android.content.Context;
import android.os.Build;
import b4.q;
import b4.t;
import c5.v0;
import d2.m2;
import d6.j0;
import d6.r;
import i4.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m2.b2;
import m2.h0;
import m3.s;
import m3.w1;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import y00.i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f37562a = new j0(true, 14);

    public static final void a(p2.g gVar, p2.c cVar, m3.n nVar, int i11) {
        Context context;
        s sVar = (s) nVar;
        sVar.c0(1904307118);
        int i12 = (sVar.f(gVar) ? 4 : 2) | i11 | (sVar.h(cVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                sVar.a0(-1009482584);
                context = (Context) sVar.j(v0.f7390b);
                sVar.q(false);
            } else {
                sVar.a0(-1009433480);
                sVar.q(false);
                context = null;
            }
            boolean zH = sVar.h(cVar) | ((i12 & 14) == 4) | sVar.h(context);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new h0(cVar, context, gVar, 9);
                sVar.k0(objM);
            }
            y1.g.b(null, null, (Function1) objM, sVar, 0, 3);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(gVar, cVar, i11, 25);
        }
    }

    public static final void b(long j9, int i11, m3.n nVar, int i12) {
        int i13;
        int i14;
        w1 w1VarS;
        cg.l lVar;
        s sVar = (s) nVar;
        sVar.c0(-1240244237);
        if ((i12 & 6) == 0) {
            i13 = i11;
            i14 = i12 | (sVar.d(i13) ? 4 : 2);
        } else {
            i13 = i11;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.e(j9) ? 32 : 16;
        }
        if (sVar.R(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) sVar.j(v0.f7390b);
            boolean zF = ((i14 & 14) == 4) | sVar.f(context);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = Integer.valueOf(context.obtainStyledAttributes(new int[]{i13}).getResourceId(0, -1));
                sVar.k0(objM);
            }
            int iIntValue = ((Number) objM).intValue();
            if (iIntValue == -1) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    lVar = new cg.l(i13, i12, 2, j9);
                    w1VarS.f29476d = lVar;
                }
                return;
            }
            n4.b bVarZ = x0.z(iIntValue, sVar, 0);
            boolean z11 = (i14 & 112) == 32;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = j9 == 16 ? null : new i4.o(j9, 5);
                sVar.k0(objM2);
            }
            d2.p.a(f4.g.h(m2.m(q.f5711a, y1.f.f45364j), bVarZ, null, z4.l.f47167b, 0.0f, (w) objM2, 22), sVar, 0);
        } else {
            sVar.U();
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            lVar = new cg.l(i11, i12, 1, j9);
            w1VarS.f29476d = lVar;
        }
    }

    public static final void c(p2.g gVar, t2.d dVar, Function0 function0, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-2040393164);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(gVar) : sVar.h(gVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(dVar) : sVar.h(dVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        boolean z11 = false;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean z12 = (i12 & 112) == 32 || ((i12 & 64) != 0 && sVar.f(dVar));
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z12 || objM == fVar) {
                objM = new j(new i4(new qw.b(4, dVar, function0), 1));
                sVar.k0(objM);
            }
            j jVar = (j) objM;
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && sVar.h(gVar))) {
                z11 = true;
            }
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new b2(gVar, 26);
                sVar.k0(objM2);
            }
            r.a(jVar, (Function0) objM2, f37562a, u3.e.e(1315155414, sVar, new kq.c(24, dVar, gVar)), sVar, 3456, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(gVar, dVar, function0, i11, 16);
        }
    }

    public static final void d(t tVar, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1392105195);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            bx.o.z(tVar, t2.f.f39665a, dVar, sVar, ((i12 << 6) & 7168) | (i12 & 14) | 432);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q0(tVar, dVar, i11, 3, (byte) 0);
        }
    }
}
