package cj;

import com.app.tgtg.model.remote.payment.PaymentMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8189j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8190k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f8192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f8193o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f8195q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PaymentMethods paymentMethods, q qVar, PaymentMethods paymentMethods2, boolean z11, PaymentMethods paymentMethods3, PaymentMethods paymentMethods4, x70.c cVar) {
        super(2, cVar);
        this.f8191m = paymentMethods;
        this.f8195q = qVar;
        this.f8192n = paymentMethods2;
        this.l = z11;
        this.f8193o = paymentMethods3;
        this.f8194p = paymentMethods4;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8189j) {
            case 0:
                return new d((PaymentMethods) this.f8191m, (q) this.f8195q, (PaymentMethods) this.f8192n, this.l, (PaymentMethods) this.f8193o, (PaymentMethods) this.f8194p, cVar);
            default:
                return new d(this.l, (np.b) this.f8194p, (String) this.f8195q, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8189j) {
        }
        return ((d) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0148, code lost:
    
        if (kotlin.Unit.f26487a == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015e, code lost:
    
        if (kotlin.Unit.f26487a == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0172, code lost:
    
        if (kotlin.Unit.f26487a == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0187, code lost:
    
        if (kotlin.Unit.f26487a == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a7, code lost:
    
        if (kotlin.Unit.f26487a != r8) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z11, np.b bVar, String str, x70.c cVar) {
        super(2, cVar);
        this.l = z11;
        this.f8194p = bVar;
        this.f8195q = str;
    }
}
