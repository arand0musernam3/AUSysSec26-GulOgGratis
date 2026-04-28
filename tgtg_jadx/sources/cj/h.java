package cj;

import com.app.tgtg.model.remote.order.response.CreateOrderResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public aj.c f8243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f8244k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CreateOrderResponse f8246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f8251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zi.d f8252t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, zi.d dVar, x70.c cVar) {
        super(2, cVar);
        this.f8251s = qVar;
        this.f8252t = dVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        h hVar = new h(this.f8251s, this.f8252t, cVar);
        hVar.f8250r = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x018c, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e2, code lost:
    
        if (kotlin.Unit.f26487a != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0207, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5 A[PHI: r0 r2 r4 r7 r12
      0x01e5: PHI (r0v15 java.lang.Object) = (r0v4 java.lang.Object), (r0v18 java.lang.Object) binds: [B:29:0x00e0, B:55:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r2v23 int) = (r2v10 int), (r2v25 int) binds: [B:29:0x00e0, B:55:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r4v11 cj.q) = (r4v1 cj.q), (r4v13 cj.q) binds: [B:29:0x00e0, B:55:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r7v8 aj.c) = (r7v2 aj.c), (r7v10 aj.c) binds: [B:29:0x00e0, B:55:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r12v9 cj.h) = (r12v2 cj.h), (r12v10 cj.h) binds: [B:29:0x00e0, B:55:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01eb  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
