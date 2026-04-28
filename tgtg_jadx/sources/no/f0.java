package no;

import android.os.Parcelable;
import androidx.lifecycle.l1;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod;
import com.app.tgtg.model.remote.payment.request.DeleteCardRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31192j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f31193k;
    public l1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f31194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f31197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f31198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Parcelable f31199r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ks.h hVar, DeleteCardRequest deleteCardRequest, BasicSavedPaymentMethod basicSavedPaymentMethod, x70.c cVar) {
        super(2, cVar);
        this.f31194m = hVar;
        this.f31199r = deleteCardRequest;
        this.f31198q = basicSavedPaymentMethod;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31192j) {
            case 0:
                return new f0((m0) this.f31197p, (String) this.f31198q, cVar);
            case 1:
                return new f0((m0) this.f31197p, (String) this.f31198q, (Order) this.f31199r, cVar);
            default:
                return new f0((ks.h) this.f31194m, (DeleteCardRequest) this.f31199r, (BasicSavedPaymentMethod) this.f31198q, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31192j) {
        }
        return ((f0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0105, code lost:
    
        if (kotlin.Unit.f26487a != r13) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[PHI: r6
      0x0091: PHI (r6v27 java.lang.Object) = (r6v26 java.lang.Object), (r6v30 java.lang.Object) binds: [B:17:0x008d, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0231  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r79) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(m0 m0Var, String str, Order order, x70.c cVar) {
        super(2, cVar);
        this.f31197p = m0Var;
        this.f31198q = str;
        this.f31199r = order;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(m0 m0Var, String str, x70.c cVar) {
        super(2, cVar);
        this.f31197p = m0Var;
        this.f31198q = str;
    }
}
