package cj;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f8196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e0 f8197k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e0 f8200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f8201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f8202q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, String str, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f8200o = e0Var;
        this.f8201p = str;
        this.f8202q = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d0(this.f8200o, this.f8201p, this.f8202q, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016e, code lost:
    
        if (kotlin.Unit.f26487a != r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[PHI: r12
      0x0066: PHI (r12v5 java.lang.Object) = (r12v4 java.lang.Object), (r12v17 java.lang.Object) binds: [B:25:0x009d, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2 A[PHI: r3 r6 r8
      0x00e2: PHI (r3v12 int) = (r3v8 int), (r3v10 int), (r3v14 int) binds: [B:42:0x0100, B:36:0x00de, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r6v7 cj.e0) = (r6v2 cj.e0), (r6v4 cj.e0), (r6v9 cj.e0) binds: [B:42:0x0100, B:36:0x00de, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r8v6 java.lang.Object) = (r8v2 java.lang.Object), (r8v3 java.lang.Object), (r8v8 java.lang.Object) binds: [B:42:0x0100, B:36:0x00de, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c A[PHI: r8
      0x011c: PHI (r8v9 java.lang.Object) = (r8v2 java.lang.Object), (r8v10 java.lang.Object) binds: [B:28:0x00a5, B:46:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
