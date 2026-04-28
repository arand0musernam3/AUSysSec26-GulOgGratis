package aa;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f1107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f1108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r40.d f1109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f1110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f1111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1113g;

    public h(final ub.a aVar, final String str, int i11) {
        str.getClass();
        this.f1109c = new r40.d();
        this.f1110d = new ThreadLocal();
        p80.c cVar = p80.d.f34559b;
        this.f1112f = p80.g.g(30, p80.h.SECONDS);
        this.f1113g = 2;
        if (i11 <= 0) {
            i4.a.f("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i12 = 0;
        this.f1107a = new a0(i11, new Function0() { // from class: aa.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        ha.a aVarH = aVar.h(str);
                        z20.b.m(aVarH, "PRAGMA query_only = 1");
                        return aVarH;
                    default:
                        return aVar.h(str);
                }
            }
        });
        final int i13 = 1;
        this.f1108b = new a0(1, new Function0() { // from class: aa.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        ha.a aVarH = aVar.h(str);
                        z20.b.m(aVarH, "PRAGMA query_only = 1");
                        return aVarH;
                    default:
                        return aVar.h(str);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146 A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:64:0x011f, B:69:0x013b, B:71:0x0146, B:86:0x01a4, B:87:0x01ab), top: B:107:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4 A[Catch: all -> 0x01a0, TRY_ENTER, TryCatch #0 {all -> 0x01a0, blocks: (B:64:0x011f, B:69:0x013b, B:71:0x0146, B:86:0x01a4, B:87:0x01ab), top: B:107:0x011f }] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, aa.i0] */
    @Override // aa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(boolean r17, kotlin.jvm.functions.Function2 r18, z70.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.h.T(boolean, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f1111e) {
            return;
        }
        this.f1111e = true;
        this.f1107a.c();
        this.f1108b.c();
    }

    public h(ub.a aVar) {
        this.f1109c = new r40.d();
        this.f1110d = new ThreadLocal();
        p80.c cVar = p80.d.f34559b;
        this.f1112f = p80.g.g(30, p80.h.SECONDS);
        this.f1113g = 2;
        a0 a0Var = new a0(1, new e(aVar, 0));
        this.f1107a = a0Var;
        this.f1108b = a0Var;
    }
}
