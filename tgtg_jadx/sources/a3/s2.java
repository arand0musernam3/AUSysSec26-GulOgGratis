package a3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {
    public static final ub.a l = new ub.a(28, new r2(0), new defpackage.g(3));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f558b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1.k0 f559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s0 f561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z1 f562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a2 f563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n0 f564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s0 f565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s0 f566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.k1 f567k;

    public s2(long j9) {
        q1.k0 k0Var = q1.w.f35850a;
        this.f559c = new q1.k0();
        this.f560d = new AtomicLong(j9);
        q1.k0 k0Var2 = q1.w.f35850a;
        k0Var2.getClass();
        this.f567k = m3.i.w(k0Var2);
    }

    public final q1.v a() {
        return (q1.v) this.f567k.getValue();
    }

    public final boolean b(z4.z zVar, long j9, long j11, j0 j0Var, boolean z11) {
        a2 a2Var = this.f563g;
        if (a2Var == null) {
            return true;
        }
        j2 j2Var = a2Var.f257a;
        long jA = j2Var.a(zVar, j9);
        long jA2 = j2Var.a(zVar, j11);
        j2Var.k(z11);
        return j2Var.n(jA, jA2, false, j0Var);
    }

    public final ArrayList c(z4.z zVar) {
        boolean z11 = this.f557a;
        ArrayList arrayList = this.f558b;
        if (!z11) {
            kotlin.collections.h0.r(arrayList, new a1.a(new f1(zVar, 2), 1));
            this.f557a = true;
        }
        return arrayList;
    }

    public final void d(s sVar) {
        long j9 = sVar.f549a;
        q1.k0 k0Var = this.f559c;
        if (k0Var.a(j9)) {
            this.f558b.remove(sVar);
            k0Var.g(j9);
            s0 s0Var = this.f566j;
            if (s0Var != null) {
                s0Var.invoke(Long.valueOf(j9));
            }
        }
    }
}
