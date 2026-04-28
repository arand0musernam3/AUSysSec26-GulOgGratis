package com.braze.dispatch;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f9681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f9682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, long j9, x70.c cVar) {
        super(2, cVar);
        this.f9681d = fVar;
        this.f9682e = j9;
    }

    public static final String a() {
        return "Requesting data flush from automatic sync policy";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        e eVar = new e(this.f9681d, this.f9682e, cVar);
        eVar.f9680c = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (v80.f0.o(r3, r13) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:20:0x0063). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r13.f9679b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L16
            long r3 = r13.f9678a
            java.lang.Object r1 = r13.f9680c
            v80.b0 r1 = (v80.b0) r1
            ba0.g.M(r14)
            goto L63
        L16:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r14)
            r14 = 0
            return r14
        L1d:
            long r3 = r13.f9678a
            java.lang.Object r1 = r13.f9680c
            v80.b0 r1 = (v80.b0) r1
            ba0.g.M(r14)
            goto L43
        L27:
            ba0.g.M(r14)
            java.lang.Object r14 = r13.f9680c
            r1 = r14
            v80.b0 r1 = (v80.b0) r1
            com.braze.dispatch.f r14 = r13.f9681d
            long r4 = r14.f9690g
            long r6 = r13.f9682e
            r13.f9680c = r1
            r13.f9678a = r4
            r13.f9679b = r3
            java.lang.Object r14 = v80.f0.o(r6, r13)
            if (r14 != r0) goto L42
            goto L62
        L42:
            r3 = r4
        L43:
            com.braze.Braze$Companion r14 = com.braze.Braze.INSTANCE
            com.braze.dispatch.f r5 = r13.f9681d
            android.content.Context r5 = r5.f9684a
            com.braze.Braze r14 = r14.getInstance(r5)
            r14.requestImmediateDataFlush()
        L50:
            boolean r14 = v80.f0.y(r1)
            if (r14 == 0) goto L85
            r13.f9680c = r1
            r13.f9678a = r3
            r13.f9679b = r2
            java.lang.Object r14 = v80.f0.o(r3, r13)
            if (r14 != r0) goto L63
        L62:
            return r0
        L63:
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r6 = com.braze.dispatch.f.f9683m
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.V
            tr.e r10 = new tr.e
            r14 = 7
            r10.<init>(r14)
            r11 = 12
            r12 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            com.braze.Braze$Companion r14 = com.braze.Braze.INSTANCE
            com.braze.dispatch.f r5 = r13.f9681d
            android.content.Context r5 = r5.f9684a
            com.braze.Braze r14 = r14.getInstance(r5)
            r14.requestImmediateDataFlush()
            goto L50
        L85:
            kotlin.Unit r14 = kotlin.Unit.f26487a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.dispatch.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
