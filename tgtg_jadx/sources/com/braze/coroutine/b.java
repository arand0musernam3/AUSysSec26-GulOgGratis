package com.braze.coroutine;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Number f9654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f9655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Number number, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f9654c = number;
        this.f9655d = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        b bVar = new b(this.f9654c, this.f9655d, cVar);
        bVar.f9653b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r7.invoke(r6) == r0) goto L17;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.f9652a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            ba0.g.M(r7)
            goto L4c
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L17:
            java.lang.Object r1 = r6.f9653b
            v80.b0 r1 = (v80.b0) r1
            ba0.g.M(r7)
            goto L38
        L1f:
            ba0.g.M(r7)
            java.lang.Object r7 = r6.f9653b
            r1 = r7
            v80.b0 r1 = (v80.b0) r1
            java.lang.Number r7 = r6.f9654c
            long r4 = r7.longValue()
            r6.f9653b = r1
            r6.f9652a = r3
            java.lang.Object r7 = v80.f0.o(r4, r6)
            if (r7 != r0) goto L38
            goto L4b
        L38:
            boolean r7 = v80.f0.y(r1)
            if (r7 == 0) goto L4c
            kotlin.jvm.functions.Function1 r7 = r6.f9655d
            r1 = 0
            r6.f9653b = r1
            r6.f9652a = r2
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.coroutine.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
