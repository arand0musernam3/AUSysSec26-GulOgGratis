package cj;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f8409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e0 f8410k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8411m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f8412n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(e0 e0Var, x70.c cVar) {
        super(2, cVar);
        this.f8412n = e0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new t(this.f8412n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[PHI: r8
      0x0081: PHI (r8v5 java.lang.Object) = (r8v4 java.lang.Object), (r8v8 java.lang.Object) binds: [B:22:0x007d, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[PHI: r1
      0x00b9: PHI (r1v13 java.lang.Object) = (r1v5 java.lang.Object), (r1v10 java.lang.Object), (r1v16 java.lang.Object) binds: [B:33:0x00b8, B:31:0x00b5, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
