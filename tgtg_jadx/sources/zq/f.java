package zq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f48044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f48045k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f48047n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, x70.c cVar) {
        super(2, cVar);
        this.f48047n = gVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new f(this.f48047n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[PHI: r8
      0x006b: PHI (r8v5 java.lang.Object) = (r8v4 java.lang.Object), (r8v8 java.lang.Object) binds: [B:16:0x0067, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[PHI: r1
      0x00a3: PHI (r1v13 java.lang.Object) = (r1v5 java.lang.Object), (r1v10 java.lang.Object), (r1v16 java.lang.Object) binds: [B:27:0x00a2, B:25:0x009f, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
