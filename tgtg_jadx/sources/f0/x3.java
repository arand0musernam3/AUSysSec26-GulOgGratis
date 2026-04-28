package f0;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 implements v3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h2 f16991i = new h2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f16992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f16993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.messaging.a0 f16994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.m f16995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f16996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f16997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0.x f16998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0.n f16999h;

    public x3(f2 f2Var, j1 j1Var, com.google.firebase.messaging.a0 a0Var, h0.m mVar, k kVar, d0 d0Var, e0.x xVar, h0.n nVar) {
        j1Var.getClass();
        mVar.getClass();
        kVar.getClass();
        d0Var.getClass();
        nVar.getClass();
        this.f16992a = f2Var;
        this.f16993b = j1Var;
        this.f16994c = a0Var;
        this.f16995d = mVar;
        this.f16996e = kVar;
        this.f16997f = d0Var;
        this.f16998g = xVar;
        this.f16999h = nVar;
    }

    public final e0 a(String str, g1 g1Var) {
        str.getClass();
        Log.d("CXCP", this + "#openAndAwaitCameraWithRetry(" + ((Object) e0.s.b(str)) + ')');
        return (e0) v80.f0.E(this.f16999h.f20984d, new al.n(this, str, g1Var, (x70.c) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:60:0x0202, B:61:0x0207], limit reached: 96 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0183 A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #4 {all -> 0x012d, blocks: (B:34:0x010a, B:40:0x0124, B:45:0x0132, B:47:0x0159, B:49:0x016e, B:53:0x017c, B:55:0x0183, B:58:0x01fa, B:69:0x022b, B:61:0x0207, B:64:0x0217, B:79:0x0284, B:80:0x0287, B:46:0x014d), top: B:95:0x010a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fa A[Catch: all -> 0x012d, TRY_ENTER, TryCatch #4 {all -> 0x012d, blocks: (B:34:0x010a, B:40:0x0124, B:45:0x0132, B:47:0x0159, B:49:0x016e, B:53:0x017c, B:55:0x0183, B:58:0x01fa, B:69:0x022b, B:61:0x0207, B:64:0x0217, B:79:0x0284, B:80:0x0287, B:46:0x014d), top: B:95:0x010a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025d A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:14:0x0041, B:74:0x0255, B:76:0x025d, B:21:0x006f), top: B:89:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0247 -> B:74:0x0255). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r31, f0.d1 r32, kotlin.jvm.functions.Function1 r33, z70.c r34) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.x3.b(java.lang.String, f0.d1, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }
}
