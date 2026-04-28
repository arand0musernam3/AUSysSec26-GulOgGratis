package mv;

import androidx.lifecycle.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ long f30196k;
    public final /* synthetic */ long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f30197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n1 f30198n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j9, long j11, n1 n1Var, x70.c cVar) {
        super(2, cVar);
        this.l = j9;
        this.f30197m = j11;
        this.f30198n = n1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        k0 k0Var = new k0(this.l, this.f30197m, this.f30198n, cVar);
        k0Var.f30196k = ((Number) obj).longValue();
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create(Long.valueOf(((Number) obj).longValue()), (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L19;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            long r0 = r8.f30196k
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r8.f30195j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1d
            if (r3 == r5) goto L19
            if (r3 != r4) goto L12
            ba0.g.M(r9)
            goto L51
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L19:
            ba0.g.M(r9)
            goto L33
        L1d:
            ba0.g.M(r9)
            long r6 = r8.l
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 == 0) goto L33
            r8.f30196k = r0
            r8.f30195j = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = v80.f0.o(r5, r8)
            if (r9 != r2) goto L33
            goto L50
        L33:
            long r5 = r8.f30197m
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 > 0) goto L51
            androidx.lifecycle.n1 r9 = r8.f30198n
            java.lang.Object r9 = r9.f3502d
            y80.a2 r9 = (y80.a2) r9
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r8.f30196k = r0
            r8.f30195j = r4
            r9.getClass()
            r0 = 0
            r9.k(r0, r3)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            if (r9 != r2) goto L51
        L50:
            return r2
        L51:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
