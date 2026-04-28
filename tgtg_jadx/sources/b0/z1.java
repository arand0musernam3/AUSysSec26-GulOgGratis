package b0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f5525k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f5528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f5529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f5530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5532s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ArrayList arrayList, int i11, int i12, v80.q qVar, d2 d2Var, x70.c cVar) {
        super(2, cVar);
        this.f5524j = 0;
        this.f5531r = arrayList;
        this.f5526m = i11;
        this.f5527n = i12;
        this.f5532s = qVar;
        this.f5530q = d2Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5524j) {
            case 0:
                return new z1((ArrayList) this.f5531r, this.f5526m, this.f5527n, (v80.q) this.f5532s, (d2) this.f5530q, cVar);
            case 1:
                z1 z1Var = new z1((cj.q) this.f5532s, cVar, 1);
                z1Var.f5531r = obj;
                return z1Var;
            default:
                z1 z1Var2 = new z1((cj.q) this.f5532s, cVar, 2);
                z1Var2.f5531r = obj;
                return z1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f5524j) {
        }
        return ((z1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x013e, code lost:
    
        if (kotlin.Unit.f26487a == r14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017a, code lost:
    
        if (kotlin.Unit.f26487a == r14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0319, code lost:
    
        if (kotlin.Unit.f26487a == r4) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116 A[PHI: r3 r6 r7 r8 r9 r10
      0x0116: PHI (r3v33 int) = (r3v31 int), (r3v36 int) binds: [B:29:0x00f3, B:34:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r6v27 int) = (r6v24 int), (r6v29 int) binds: [B:29:0x00f3, B:34:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r7v20 com.app.tgtg.model.remote.payment.response.PaymentMethodsResponse) = 
      (r7v17 com.app.tgtg.model.remote.payment.response.PaymentMethodsResponse)
      (r7v22 com.app.tgtg.model.remote.payment.response.PaymentMethodsResponse)
     binds: [B:29:0x00f3, B:34:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r8v22 java.lang.Object) = (r8v18 java.lang.Object), (r8v25 java.lang.Object) binds: [B:29:0x00f3, B:34:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r9v30 cj.q) = (r9v27 cj.q), (r9v33 cj.q) binds: [B:29:0x00f3, B:34:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r10v33 com.app.tgtg.model.remote.item.response.BasicItem) = (r10v29 com.app.tgtg.model.remote.item.response.BasicItem), (r10v35 com.app.tgtg.model.remote.item.response.BasicItem) binds: [B:29:0x00f3, B:34:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0144 A[PHI: r9 r10 r15
      0x0144: PHI (r9v36 cj.q) = (r9v24 cj.q), (r9v37 cj.q) binds: [B:23:0x00c8, B:38:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r10v38 com.app.tgtg.model.remote.item.response.BasicItem) = (r10v26 com.app.tgtg.model.remote.item.response.BasicItem), (r10v39 com.app.tgtg.model.remote.item.response.BasicItem) binds: [B:23:0x00c8, B:38:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r15v11 java.lang.Object) = (r15v5 java.lang.Object), (r15v12 java.lang.Object) binds: [B:23:0x00c8, B:38:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e6 A[PHI: r9 r10 r12
      0x02e6: PHI (r9v19 cj.q) = (r9v6 cj.q), (r9v20 cj.q) binds: [B:71:0x0256, B:88:0x02e3] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r10v22 aj.c) = (r10v7 aj.c), (r10v23 aj.c) binds: [B:71:0x0256, B:88:0x02e3] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r12v23 java.lang.Object) = (r12v11 java.lang.Object), (r12v24 java.lang.Object) binds: [B:71:0x0256, B:88:0x02e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fd  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.z1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(cj.q qVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5524j = i11;
        this.f5532s = qVar;
    }
}
