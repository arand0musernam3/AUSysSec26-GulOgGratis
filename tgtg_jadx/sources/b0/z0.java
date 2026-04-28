package b0;

import com.app.tgtg.model.remote.payment.PaymentMethods;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5519j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5520k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5522n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5523o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, x70.c cVar, ArrayList arrayList, int i11, int i12, int i13) {
        super(2, cVar);
        this.f5522n = b1Var;
        this.f5523o = arrayList;
        this.f5520k = i11;
        this.l = i12;
        this.f5521m = i13;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5519j) {
            case 0:
                return new z0((b1) this.f5522n, cVar, (ArrayList) this.f5523o, this.f5520k, this.l, this.f5521m);
            case 1:
                return new z0(this.f5521m, (cj.q) this.f5522n, (PaymentMethods) this.f5523o, cVar);
            default:
                z0 z0Var = new z0(this.l, this.f5521m, (f2.c0) this.f5523o, cVar);
                z0Var.f5522n = obj;
                return z0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5519j) {
            case 0:
                return ((z0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((z0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((z0) create((z1.q2) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        if (kotlin.Unit.f26487a == r7) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i11, cj.q qVar, PaymentMethods paymentMethods, x70.c cVar) {
        super(2, cVar);
        this.f5521m = i11;
        this.f5522n = qVar;
        this.f5523o = paymentMethods;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i11, int i12, f2.c0 c0Var, x70.c cVar) {
        super(2, cVar);
        this.f5523o = c0Var;
        this.l = i11;
        this.f5521m = i12;
    }
}
