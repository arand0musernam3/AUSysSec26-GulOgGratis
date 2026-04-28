package ss;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f39148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39149k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f39150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ts.m f39151n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w wVar, ts.m mVar, x70.c cVar) {
        super(2, cVar);
        this.f39150m = wVar;
        this.f39151n = mVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        d dVar = new d(this.f39150m, this.f39151n, cVar);
        dVar.l = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b8, code lost:
    
        if (r1.emit(r4, r17) == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        if (r1.emit(r5, r17) == r2) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098 A[PHI: r3
      0x0098: PHI (r3v12 java.lang.Object) = (r3v11 java.lang.Object), (r3v15 java.lang.Object) binds: [B:19:0x0094, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [T, com.app.tgtg.model.remote.voucher.BasicVoucher, java.lang.Object] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
