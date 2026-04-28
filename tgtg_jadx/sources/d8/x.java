package d8;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.IntRef f14729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14730k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f14731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f14732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f14733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f14734p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Ref.IntRef intRef, y yVar, Object obj, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f14731m = intRef;
        this.f14732n = yVar;
        this.f14733o = obj;
        this.f14734p = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        x xVar = new x(this.f14731m, this.f14732n, this.f14733o, this.f14734p, cVar);
        xVar.l = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((h0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.io.IOException {
        /*
            r7 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.f14730k
            java.lang.Object r2 = r7.f14733o
            d8.y r3 = r7.f14732n
            kotlin.jvm.internal.Ref$IntRef r4 = r7.f14731m
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L27
            if (r1 == r6) goto L1d
            if (r1 != r5) goto L16
            ba0.g.M(r8)
            goto L6c
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
        L1b:
            r8 = 0
            return r8
        L1d:
            kotlin.jvm.internal.Ref$IntRef r1 = r7.f14729j
            java.lang.Object r6 = r7.l
            d8.h0 r6 = (d8.h0) r6
            ba0.g.M(r8)
            goto L42
        L27:
            ba0.g.M(r8)
            java.lang.Object r8 = r7.l
            d8.h0 r8 = (d8.h0) r8
            d8.k0 r1 = r3.h()
            r7.l = r8
            r7.f14729j = r4
            r7.f14730k = r6
            java.lang.Object r1 = r1.c(r7)
            if (r1 != r0) goto L3f
            goto L6b
        L3f:
            r6 = r8
            r8 = r1
            r1 = r4
        L42:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.element = r8
            r8 = 0
            r7.l = r8
            r7.f14729j = r8
            r7.f14730k = r5
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f14572c
            boolean r1 = r1.get()
            if (r1 != 0) goto L87
            java.io.File r1 = r6.f14570a
            b0.t2 r5 = new b0.t2
            r5.<init>(r6, r2, r8)
            java.lang.Object r8 = com.google.android.gms.internal.measurement.cg.i(r1, r5, r7)
            if (r8 != r0) goto L67
            goto L69
        L67:
            kotlin.Unit r8 = kotlin.Unit.f26487a
        L69:
            if (r8 != r0) goto L6c
        L6b:
            return r0
        L6c:
            boolean r8 = r7.f14734p
            if (r8 == 0) goto L84
            d8.z r8 = r3.f14742h
            d8.b r0 = new d8.b
            if (r2 == 0) goto L7b
            int r1 = r2.hashCode()
            goto L7c
        L7b:
            r1 = 0
        L7c:
            int r3 = r4.element
            r0.<init>(r2, r1, r3)
            r8.c(r0)
        L84:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L87:
            java.lang.String r8 = "This scope has already been closed."
            com.braze.h2.b(r8)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
