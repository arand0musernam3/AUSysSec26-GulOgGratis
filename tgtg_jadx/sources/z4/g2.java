package z4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1.g0 f47128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e2[] f47129b;

    static {
        q1.g0 g0Var = new q1.g0(8);
        int iG = h7.h2.g();
        e2.f47115a.getClass();
        f2 f2Var = d2.f47110g;
        g0Var.i(iG, f2Var);
        int iF = h7.h2.f();
        f2 f2Var2 = d2.f47109f;
        g0Var.i(iF, f2Var2);
        int iA = h7.h2.a();
        f2 f2Var3 = d2.f47105b;
        g0Var.i(iA, f2Var3);
        int iC = h7.h2.c();
        f2 f2Var4 = d2.f47107d;
        g0Var.i(iC, f2Var4);
        int i11 = h7.h2.i();
        f2 f2Var5 = d2.f47111h;
        g0Var.i(i11, f2Var5);
        int iE = h7.h2.e();
        f2 f2Var6 = d2.f47108e;
        g0Var.i(iE, f2Var6);
        int iJ = h7.h2.j();
        f2 f2Var7 = d2.f47112i;
        g0Var.i(iJ, f2Var7);
        int iB = h7.h2.b();
        f2 f2Var8 = d2.f47106c;
        g0Var.i(iB, f2Var8);
        f47128a = g0Var;
        f47129b = new e2[]{f2Var, f2Var2, f2Var3, f2Var7, f2Var5, f2Var6, f2Var4, d2.f47113j, f2Var8};
    }

    public static final void a(b5.r0 r0Var, r rVar, long j9, int i11, int i12) {
        if (c0.h(j9, -1L)) {
            return;
        }
        r0Var.c(rVar.b(), (int) ((j9 >>> 48) & 65535));
        r0Var.c(rVar.d(), (int) ((j9 >>> 32) & 65535));
        r0Var.c(rVar.c(), i11 - ((int) ((j9 >>> 16) & 65535)));
        r0Var.c(rVar.a(), i12 - ((int) (j9 & 65535)));
    }
}
