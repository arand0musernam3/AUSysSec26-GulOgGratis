package ss;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f39135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39136k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0 f39137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ts.a f39138n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(w0 w0Var, ts.a aVar, x70.c cVar) {
        super(2, cVar);
        this.f39137m = w0Var;
        this.f39138n = aVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        b0 b0Var = new b0(this.f39137m, this.f39138n, cVar);
        b0Var.l = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01af, code lost:
    
        if (r1.emit(r4, r18) == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c2, code lost:
    
        if (r1.emit(r4, r18) == r2) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[PHI: r3
      0x0093: PHI (r3v13 java.lang.Object) = (r3v12 java.lang.Object), (r3v16 java.lang.Object) binds: [B:19:0x008f, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v15, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, com.app.tgtg.model.remote.voucher.BasicVoucher, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.util.List] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
