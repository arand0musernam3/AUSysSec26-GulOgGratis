package aa;

import a3.c2;
import b0.n2;
import b0.x2;
import com.app.tgtg.model.remote.order.OrderState;
import g3.ea;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v1.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1160k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1162n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(u uVar, y9.d0 d0Var, Function2 function2, x70.c cVar) {
        super(1, cVar);
        this.f1159j = 0;
        this.l = uVar;
        this.f1161m = d0Var;
        this.f1162n = (z70.i) function2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        switch (this.f1159j) {
            case 0:
                return new t((u) this.l, (y9.d0) this.f1161m, (z70.i) this.f1162n, cVar);
            case 1:
                return new t((x2) this.l, (n2) this.f1161m, (List) this.f1162n, cVar, 1);
            case 2:
                return new t((x2) this.l, (b0.b) this.f1161m, (Map) this.f1162n, cVar, 2);
            case 3:
                return new t((ea) this.l, (j1) this.f1161m, (c2) this.f1162n, cVar, 3);
            case 4:
                return new t((gt.w) this.l, (String) this.f1161m, (OrderState) this.f1162n, cVar, 4);
            default:
                return new t((z1.r) this.l, this.f1161m, (i80.o) this.f1162n, cVar, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x70.c cVar = (x70.c) obj;
        switch (this.f1159j) {
        }
        return ((t) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
    
        if (v80.j2.b(zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView.NEW_MESSAGE_VIEW_DELAY, r13, r12) == r0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(1, cVar);
        this.f1159j = i11;
        this.l = obj;
        this.f1161m = obj2;
        this.f1162n = obj3;
    }
}
