package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e90.a f640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b0 f641k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z70.i f643n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(b0 b0Var, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f642m = b0Var;
        this.f643n = (z70.i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new z(this.f642m, this.f643n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r9.l
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            ba0.g.M(r10)
            return r10
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L1b:
            e90.a r1 = r9.f640j
            ba0.g.M(r10)     // Catch: java.lang.Throwable -> L21
            goto L68
        L21:
            r10 = move-exception
            goto L86
        L24:
            a3.b0 r1 = r9.f641k
            e90.a r4 = r9.f640j
            ba0.g.M(r10)
            r10 = r4
            goto L41
        L2d:
            ba0.g.M(r10)
            a3.b0 r1 = r9.f642m
            e90.c r10 = r1.f267e
            r9.f640j = r10
            r9.f641k = r1
            r9.l = r4
            java.lang.Object r4 = r10.g(r9)
            if (r4 != r0) goto L41
            goto L84
        L41:
            android.view.textclassifier.TextClassifier r4 = r1.f268f     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L50
            boolean r6 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L6c
            goto L50
        L4c:
            r0 = move-exception
            r1 = r10
            r10 = r0
            goto L86
        L50:
            a3.y r4 = new a3.y     // Catch: java.lang.Throwable -> L4c
            r6 = 0
            r4.<init>(r1, r5, r6)     // Catch: java.lang.Throwable -> L4c
            r9.f640j = r10     // Catch: java.lang.Throwable -> L4c
            r9.f641k = r5     // Catch: java.lang.Throwable -> L4c
            r9.l = r3     // Catch: java.lang.Throwable -> L4c
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r1 = v80.j2.c(r6, r4, r9)     // Catch: java.lang.Throwable -> L4c
            if (r1 != r0) goto L65
            goto L84
        L65:
            r8 = r1
            r1 = r10
            r10 = r8
        L68:
            r4 = r10
            android.view.textclassifier.TextClassifier r4 = (android.view.textclassifier.TextClassifier) r4     // Catch: java.lang.Throwable -> L21
            r10 = r1
        L6c:
            r10.e(r5)
            a3.x r10 = new a3.x
            z70.i r1 = r9.f643n
            r10.<init>(r4, r1, r5)
            r9.f640j = r5
            r9.f641k = r5
            r9.l = r2
            r1 = 200(0xc8, double:9.9E-322)
            java.lang.Object r10 = v80.j2.c(r1, r10, r9)
            if (r10 != r0) goto L85
        L84:
            return r0
        L85:
            return r10
        L86:
            r1.e(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
