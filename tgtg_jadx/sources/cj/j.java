package cj;

import com.app.tgtg.model.remote.order.response.CreateOrderResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f8261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f8262k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CreateOrderResponse f8263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f8267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f8268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zi.d f8269s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, zi.d dVar, x70.c cVar) {
        super(2, cVar);
        this.f8268r = qVar;
        this.f8269s = dVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        j jVar = new j(this.f8268r, this.f8269s, cVar);
        jVar.f8267q = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a6, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f0, code lost:
    
        if (kotlin.Unit.f26487a != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0213, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f3 A[PHI: r0 r2 r6 r11
      0x01f3: PHI (r0v15 java.lang.Object) = (r0v4 java.lang.Object), (r0v18 java.lang.Object) binds: [B:33:0x0105, B:59:0x01aa] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r2v18 int) = (r2v5 int), (r2v20 int) binds: [B:33:0x0105, B:59:0x01aa] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r6v15 cj.q) = (r6v7 cj.q), (r6v17 cj.q) binds: [B:33:0x0105, B:59:0x01aa] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r11v9 cj.j) = (r11v2 cj.j), (r11v10 cj.j) binds: [B:33:0x0105, B:59:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f9  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
