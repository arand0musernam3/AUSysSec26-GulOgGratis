package ti;

import g3.g7;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f40233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40234k;
    public final /* synthetic */ g7 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f40235m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(g7 g7Var, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f40233j = i11;
        this.l = g7Var;
        this.f40235m = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f40233j) {
            case 0:
                return new k(this.l, this.f40235m, cVar, 0);
            default:
                return new k(this.l, this.f40235m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f40233j) {
        }
        return ((k) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f40233j
            switch(r0) {
                case 0: goto L51;
                default: goto L5;
            }
        L5:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r9.f40234k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            ba0.g.M(r10)
            r7 = r9
            goto L43
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r0 = 0
            r7 = r9
            goto L50
        L1e:
            ba0.g.M(r10)
            r7 = r9
            goto L38
        L23:
            ba0.g.M(r10)
            r9.f40234k = r3
            g3.g7 r3 = r9.l
            java.lang.String r4 = r9.f40235m
            r5 = 0
            r6 = 0
            r8 = 14
            r7 = r9
            java.lang.Object r10 = g3.g7.c(r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L38
            goto L50
        L38:
            r7.f40234k = r2
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = v80.f0.o(r1, r9)
            if (r10 != r0) goto L43
            goto L50
        L43:
            g3.g7 r10 = r7.l
            g3.d7 r10 = r10.a()
            if (r10 == 0) goto L4e
            r10.a()
        L4e:
            kotlin.Unit r0 = kotlin.Unit.f26487a
        L50:
            return r0
        L51:
            r7 = r9
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.f40234k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L6d
            if (r1 == r3) goto L69
            if (r1 != r2) goto L62
            ba0.g.M(r10)
            goto L8c
        L62:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r0 = 0
            goto L99
        L69:
            ba0.g.M(r10)
            goto L81
        L6d:
            ba0.g.M(r10)
            r7.f40234k = r3
            g3.g7 r3 = r7.l
            java.lang.String r4 = r7.f40235m
            r5 = 0
            r6 = 0
            r8 = 14
            java.lang.Object r10 = g3.g7.c(r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L81
            goto L99
        L81:
            r7.f40234k = r2
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = v80.f0.o(r1, r9)
            if (r10 != r0) goto L8c
            goto L99
        L8c:
            g3.g7 r10 = r7.l
            g3.d7 r10 = r10.a()
            if (r10 == 0) goto L97
            r10.a()
        L97:
            kotlin.Unit r0 = kotlin.Unit.f26487a
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
