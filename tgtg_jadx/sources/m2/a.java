package m2;

import d2.m2;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f28757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f28758b;

    static {
        float f11 = 25;
        f28757a = f11;
        f28758b = (f11 * 2.0f) / 2.4142137f;
    }

    public static final void a(a3.t tVar, b4.t tVar2, long j9, m3.n nVar, int i11, int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1776202187);
        int i13 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.f(tVar2) ? 32 : 16);
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= ((i12 & 4) == 0 && sVar.e(j9)) ? 256 : 128;
        }
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            } else if ((i12 & 4) != 0) {
                i13 &= -897;
                j9 = 9205357640488583168L;
            }
            sVar.r();
            int i14 = i13 & 14;
            boolean z11 = i14 == 4;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new jd.a(tVar, 21);
                sVar.k0(objM);
            }
            bx.k.b(tVar, b4.d.f5684b, u3.e.e(-1653527038, sVar, new fg.q(j9, j5.r.c(tVar2, false, (Function1) objM))), sVar, i14 | 432);
        } else {
            sVar.U();
        }
        long j11 = j9;
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new zendesk.ui.android.common.noticemessage.a(tVar, tVar2, j11, i11, i12);
        }
    }

    public static final void b(int i11, int i12, b4.t tVar, m3.n nVar) {
        int i13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(694251107);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        }
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            if (i14 != 0) {
                tVar = b4.q.f5711a;
            }
            d2.c.f(b4.a.a(m2.n(tVar, f28758b, f28757a), c5.m2.f7291a, new ii.m(22)), sVar);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.p0(tVar, i11, i12, 2);
        }
    }
}
