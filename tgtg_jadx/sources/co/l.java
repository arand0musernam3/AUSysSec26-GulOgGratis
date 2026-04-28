package co;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8769k;
    public final /* synthetic */ b1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b1 f8770m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i11, b1 b1Var, b1 b1Var2, x70.c cVar) {
        super(2, cVar);
        this.f8768j = 0;
        this.f8769k = i11;
        this.l = b1Var;
        this.f8770m = b1Var2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8768j) {
            case 0:
                return new l(this.f8769k, this.l, this.f8770m, cVar);
            case 1:
                return new l(this.l, this.f8770m, cVar, 1);
            case 2:
                return new l(this.l, this.f8770m, cVar, 2);
            case 3:
                return new l(this.l, this.f8770m, cVar, 3);
            default:
                return new l(this.l, this.f8770m, cVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8768j) {
        }
        return ((l) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        if (v80.f0.o(zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView.NEW_MESSAGE_VIEW_DELAY, r8) == r0) goto L42;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(b1 b1Var, b1 b1Var2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8768j = i11;
        this.l = b1Var;
        this.f8770m = b1Var2;
    }
}
