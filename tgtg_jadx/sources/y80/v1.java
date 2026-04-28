package y80;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ j f45601k;
    public /* synthetic */ int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x1 f45602m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(x1 x1Var, x70.c cVar) {
        super(3, cVar);
        this.f45602m = x1Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        v1 v1Var = new v1(this.f45602m, (x70.c) obj3);
        v1Var.f45601k = (j) obj;
        v1Var.l = iIntValue;
        return v1Var.invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r12.emit(r0, r11) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r0.emit(r12, r11) != r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[PHI: r0
      0x0077: PHI (r0v6 y80.j) = (r0v4 y80.j), (r0v5 y80.j), (r0v9 y80.j) binds: [B:26:0x005d, B:31:0x0074, B:12:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y80.x1 r0 = r11.f45602m
            long r1 = r0.f45611b
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r11.f45600j
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L37
            if (r4 == r9) goto L33
            if (r4 == r8) goto L2d
            if (r4 == r7) goto L27
            if (r4 == r6) goto L21
            if (r4 != r5) goto L1a
            goto L33
        L1a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L21:
            y80.j r0 = r11.f45601k
            ba0.g.M(r12)
            goto L77
        L27:
            y80.j r0 = r11.f45601k
            ba0.g.M(r12)
            goto L6c
        L2d:
            y80.j r0 = r11.f45601k
            ba0.g.M(r12)
            goto L59
        L33:
            ba0.g.M(r12)
            goto L85
        L37:
            ba0.g.M(r12)
            y80.j r12 = r11.f45601k
            int r4 = r11.l
            if (r4 <= 0) goto L4b
            y80.o1 r0 = y80.o1.START
            r11.f45600j = r9
            java.lang.Object r12 = r12.emit(r0, r11)
            if (r12 != r3) goto L85
            goto L84
        L4b:
            long r9 = r0.f45610a
            r11.f45601k = r12
            r11.f45600j = r8
            java.lang.Object r0 = v80.f0.o(r9, r11)
            if (r0 != r3) goto L58
            goto L84
        L58:
            r0 = r12
        L59:
            r8 = 0
            int r12 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r12 <= 0) goto L77
            y80.o1 r12 = y80.o1.STOP
            r11.f45601k = r0
            r11.f45600j = r7
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r3) goto L6c
            goto L84
        L6c:
            r11.f45601k = r0
            r11.f45600j = r6
            java.lang.Object r12 = v80.f0.o(r1, r11)
            if (r12 != r3) goto L77
            goto L84
        L77:
            y80.o1 r12 = y80.o1.STOP_AND_RESET_REPLAY_CACHE
            r1 = 0
            r11.f45601k = r1
            r11.f45600j = r5
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r3) goto L85
        L84:
            return r3
        L85:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
