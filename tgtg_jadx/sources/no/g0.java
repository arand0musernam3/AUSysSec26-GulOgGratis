package no;

import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f31201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m0 f31202k;
    public Order l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Order f31203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Order f31204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f31205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f31207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m0 f31208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f31210t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(m0 m0Var, String str, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f31208r = m0Var;
        this.f31209s = str;
        this.f31210t = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g0(this.f31208r, this.f31209s, this.f31210t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[PHI: r2 r6 r7 r8
      0x0065: PHI (r2v16 int) = (r2v14 int), (r2v17 int) binds: [B:50:0x0115, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r6v10 com.app.tgtg.model.remote.order.Order) = (r6v8 com.app.tgtg.model.remote.order.Order), (r6v12 com.app.tgtg.model.remote.order.Order) binds: [B:50:0x0115, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r7v10 no.m0) = (r7v8 no.m0), (r7v13 no.m0) binds: [B:50:0x0115, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r8v11 java.lang.Object) = (r8v9 java.lang.Object), (r8v15 java.lang.Object) binds: [B:50:0x0115, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[Catch: all -> 0x027b, TryCatch #0 {all -> 0x027b, blocks: (B:87:0x02e9, B:90:0x02f5, B:76:0x02ad, B:77:0x02b2, B:79:0x02b8, B:81:0x02bc, B:83:0x02c9, B:89:0x02f0, B:71:0x028e, B:73:0x0297, B:60:0x0255, B:56:0x022c, B:52:0x0119, B:49:0x00f4, B:43:0x00d2, B:45:0x00d6, B:68:0x027f, B:70:0x0285, B:37:0x00a7, B:39:0x00af, B:34:0x0096), top: B:95:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6 A[Catch: all -> 0x027b, TryCatch #0 {all -> 0x027b, blocks: (B:87:0x02e9, B:90:0x02f5, B:76:0x02ad, B:77:0x02b2, B:79:0x02b8, B:81:0x02bc, B:83:0x02c9, B:89:0x02f0, B:71:0x028e, B:73:0x0297, B:60:0x0255, B:56:0x022c, B:52:0x0119, B:49:0x00f4, B:43:0x00d2, B:45:0x00d6, B:68:0x027f, B:70:0x0285, B:37:0x00a7, B:39:0x00af, B:34:0x0096), top: B:95:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0297 A[Catch: all -> 0x027b, TryCatch #0 {all -> 0x027b, blocks: (B:87:0x02e9, B:90:0x02f5, B:76:0x02ad, B:77:0x02b2, B:79:0x02b8, B:81:0x02bc, B:83:0x02c9, B:89:0x02f0, B:71:0x028e, B:73:0x0297, B:60:0x0255, B:56:0x022c, B:52:0x0119, B:49:0x00f4, B:43:0x00d2, B:45:0x00d6, B:68:0x027f, B:70:0x0285, B:37:0x00a7, B:39:0x00af, B:34:0x0096), top: B:95:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b2 A[Catch: all -> 0x027b, PHI: r2
      0x02b2: PHI (r2v26 java.lang.Object) = (r2v6 java.lang.Object), (r2v31 java.lang.Object) binds: [B:38:0x00ad, B:76:0x02ad] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x027b, blocks: (B:87:0x02e9, B:90:0x02f5, B:76:0x02ad, B:77:0x02b2, B:79:0x02b8, B:81:0x02bc, B:83:0x02c9, B:89:0x02f0, B:71:0x028e, B:73:0x0297, B:60:0x0255, B:56:0x022c, B:52:0x0119, B:49:0x00f4, B:43:0x00d2, B:45:0x00d6, B:68:0x027f, B:70:0x0285, B:37:0x00a7, B:39:0x00af, B:34:0x0096), top: B:95:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b8 A[Catch: all -> 0x027b, TryCatch #0 {all -> 0x027b, blocks: (B:87:0x02e9, B:90:0x02f5, B:76:0x02ad, B:77:0x02b2, B:79:0x02b8, B:81:0x02bc, B:83:0x02c9, B:89:0x02f0, B:71:0x028e, B:73:0x0297, B:60:0x0255, B:56:0x022c, B:52:0x0119, B:49:0x00f4, B:43:0x00d2, B:45:0x00d6, B:68:0x027f, B:70:0x0285, B:37:0x00a7, B:39:0x00af, B:34:0x0096), top: B:95:0x0096 }] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v33 */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r75) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
