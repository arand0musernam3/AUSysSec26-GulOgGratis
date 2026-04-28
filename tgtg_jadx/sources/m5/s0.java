package m5;

import androidx.lifecycle.n1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q5.h f29637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5.c f29638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z5.m f29639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j30.g f29640d;

    public s0(q5.h hVar, z5.c cVar, z5.m mVar, int i11) {
        this.f29637a = hVar;
        this.f29638b = cVar;
        this.f29639c = mVar;
        this.f29640d = i11 > 0 ? new j30.g(i11) : null;
    }

    public static q0 a(s0 s0Var, String str, u0 u0Var, long j9, z5.c cVar, int i11) {
        if ((i11 & 32) != 0) {
            j9 = z5.b.b(0, 0, 15);
        }
        long j11 = j9;
        z5.m mVar = s0Var.f29639c;
        z5.c cVar2 = (i11 & 128) != 0 ? s0Var.f29638b : cVar;
        q5.h hVar = s0Var.f29637a;
        s0Var.getClass();
        return b(s0Var, new h(str), u0Var, true, Integer.MAX_VALUE, j11, mVar, cVar2, hVar, 32);
    }

    public static q0 b(s0 s0Var, h hVar, u0 u0Var, boolean z11, int i11, long j9, z5.m mVar, z5.c cVar, q5.h hVar2, int i12) {
        q0 q0Var;
        boolean z12 = (i12 & 8) != 0 ? true : z11;
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        z5.m mVar2 = (i12 & 128) != 0 ? s0Var.f29639c : mVar;
        z5.c cVar2 = (i12 & 256) != 0 ? s0Var.f29638b : cVar;
        q5.h hVar3 = (i12 & 512) != 0 ? s0Var.f29637a : hVar2;
        j30.g gVar = s0Var.f29640d;
        q5.h hVar4 = hVar3;
        p0 p0Var = new p0(hVar, u0Var, n0Var, i11, z12, 1, cVar2, mVar2, hVar4, j9);
        q0 q0Var2 = null;
        if (gVar != null) {
            k kVar = new k(p0Var);
            q1.b0 b0Var = (q1.b0) gVar.f24502b;
            if (b0Var != null) {
                q0Var = (q0) b0Var.c(kVar);
            } else if (Intrinsics.areEqual((k) gVar.f24503c, kVar)) {
                q0Var = (q0) gVar.f24504d;
            }
            if (q0Var != null && !q0Var.f29618b.f29623a.a()) {
                q0Var2 = q0Var;
            }
        }
        if (q0Var2 != null) {
            return new q0(p0Var, q0Var2.f29618b, z5.b.d(j9, (((long) ((int) Math.ceil(r3.f29626d))) << 32) | (((long) ((int) Math.ceil(r3.f29627e))) & 4294967295L)));
        }
        n1 n1Var = new n1(hVar, k0.k(u0Var, mVar2), (List) n0Var, cVar2, hVar4);
        int iK = z5.a.k(j9);
        int i13 = (z12 && z5.a.e(j9)) ? z5.a.i(j9) : Integer.MAX_VALUE;
        if (iK != i13) {
            i13 = n80.p.c((int) Math.ceil(n1Var.c()), iK, i13);
        }
        q0 q0Var3 = new q0(p0Var, new r(n1Var, y9.w.r(0, i13, 0, z5.a.h(j9)), i11, 1), z5.b.d(j9, (((long) ((int) Math.ceil(r13.f29626d))) << 32) | (((long) ((int) Math.ceil(r13.f29627e))) & 4294967295L)));
        if (gVar != null) {
            q1.b0 b0Var2 = (q1.b0) gVar.f24502b;
            if (b0Var2 != null) {
                b0Var2.d(new k(p0Var), q0Var3);
                return q0Var3;
            }
            gVar.f24503c = new k(p0Var);
            gVar.f24504d = q0Var3;
        }
        return q0Var3;
    }
}
