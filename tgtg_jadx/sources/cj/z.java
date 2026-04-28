package cj;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8435j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8436k;
    public final /* synthetic */ e0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f8437m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.l = e0Var;
        this.f8437m = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8435j) {
            case 0:
                return new z(this.f8437m, this.l, cVar);
            default:
                return new z(this.l, this.f8437m, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8435j) {
        }
        return ((z) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f8435j
            switch(r0) {
                case 0: goto L37;
                default: goto L5;
            }
        L5:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r8.f8436k
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L12
            ba0.g.M(r9)
            goto L34
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r0 = 0
            goto L36
        L19:
            ba0.g.M(r9)
            cj.e0 r9 = r8.l
            y80.a2 r9 = r9.C
            boolean r1 = r8.f8437m
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.f8436k = r2
            r9.getClass()
            r2 = 0
            r9.k(r2, r1)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            if (r9 != r0) goto L34
            goto L36
        L34:
            kotlin.Unit r0 = kotlin.Unit.f26487a
        L36:
            return r0
        L37:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r8.f8436k
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            cj.e0 r7 = r8.l
            if (r1 == 0) goto L60
            if (r1 == r5) goto L5c
            if (r1 == r4) goto L58
            if (r1 == r3) goto L54
            if (r1 != r2) goto L4d
            goto L54
        L4d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r0 = 0
            goto La2
        L54:
            ba0.g.M(r9)
            goto La0
        L58:
            ba0.g.M(r9)
            goto L88
        L5c:
            ba0.g.M(r9)
            goto L77
        L60:
            ba0.g.M(r9)
            boolean r9 = r8.f8437m
            if (r9 != 0) goto L88
            r7.O = r6
            r7.N = r6
            y80.a2 r9 = r7.f8222m
            r8.f8436k = r5
            r9.j(r6)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            if (r9 != r0) goto L77
            goto La2
        L77:
            y80.a2 r9 = r7.f8217g
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r8.f8436k = r4
            r9.getClass()
            r9.k(r6, r1)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            if (r9 != r0) goto L88
            goto La2
        L88:
            boolean r9 = r7.i()
            if (r9 == 0) goto L97
            r8.f8436k = r3
            java.lang.Object r9 = cj.e0.a(r7, r8)
            if (r9 != r0) goto La0
            goto La2
        L97:
            r8.f8436k = r2
            java.lang.Object r9 = cj.e0.b(r7, r8)
            if (r9 != r0) goto La0
            goto La2
        La0:
            kotlin.Unit r0 = kotlin.Unit.f26487a
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(boolean z11, e0 e0Var, x70.c cVar) {
        super(2, cVar);
        this.f8437m = z11;
        this.l = e0Var;
    }
}
