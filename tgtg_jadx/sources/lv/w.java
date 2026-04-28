package lv;

import g3.t2;
import m3.w1;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g3.p0 f28288a;

    static {
        long j9 = s.f28217b;
        g3.r0.c(j9, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -2, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        f28288a = g3.r0.f(j9, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -2, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
    }

    public static final void a(boolean z11, u3.d dVar, m3.n nVar, int i11) {
        u3.d dVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(745100670);
        int i12 = i11 | 54;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.a0(-1217779634);
            sVar.q(false);
            dVar2 = dVar;
            t2.b(f28288a, null, null, dVar2, sVar, 3072, 6);
            z11 = true;
        } else {
            dVar2 = dVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.b(z11, dVar2, i11, 7);
        }
    }
}
