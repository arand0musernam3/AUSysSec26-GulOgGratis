package cj;

import com.app.tgtg.model.remote.order.AuthorizationPayload;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f8371k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f8373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f8376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Enum f8378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8379t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ArrayList arrayList, mv.e0 e0Var, cv.g gVar, dn.g gVar2, x70.c cVar) {
        super(2, cVar);
        this.f8370j = 2;
        this.f8373n = arrayList;
        this.f8377r = e0Var;
        this.f8378s = gVar;
        this.f8379t = gVar2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8370j) {
            case 0:
                return new r0((s0) this.f8376q, (String) this.f8377r, (PaymentProvider) this.f8378s, (AuthorizationPayload) this.f8379t, cVar, 0);
            case 1:
                return new r0((s0) this.f8376q, (String) this.f8377r, (PaymentProvider) this.f8378s, (AuthorizationPayload) this.f8379t, cVar, 1);
            default:
                return new r0((ArrayList) this.f8373n, (mv.e0) this.f8377r, (cv.g) this.f8378s, (dn.g) this.f8379t, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8370j) {
        }
        return ((r0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x029b, code lost:
    
        if (cj.s0.a(r1, r4, r21) == r12) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b6 -> B:28:0x00b7). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, String str, PaymentProvider paymentProvider, AuthorizationPayload authorizationPayload, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8370j = i11;
        this.f8376q = s0Var;
        this.f8377r = str;
        this.f8378s = paymentProvider;
        this.f8379t = authorizationPayload;
    }
}
