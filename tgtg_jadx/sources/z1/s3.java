package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v80.b2 f46679k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f46680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f46681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z70.i f46682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function1 f46683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k2 f46684q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s3(v80.b0 b0Var, i80.n nVar, Function1 function1, k2 k2Var, x70.c cVar) {
        super(2, cVar);
        this.f46681n = b0Var;
        this.f46682o = (z70.i) nVar;
        this.f46683p = function1;
        this.f46684q = k2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [i80.n, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        s3 s3Var = new s3(this.f46681n, this.f46682o, this.f46683p, this.f46684q, cVar);
        s3Var.f46680m = obj;
        return s3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s3) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Type inference failed for: r10v0, types: [i80.n, z70.i] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r12.l
            r2 = 0
            v80.b0 r3 = r12.f46681n
            r4 = 2
            r5 = 1
            z1.k2 r6 = r12.f46684q
            r7 = 0
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L20
            if (r1 != r4) goto L1a
            java.lang.Object r0 = r12.f46680m
            v80.i1 r0 = (v80.i1) r0
            ba0.g.M(r13)
            goto L73
        L1a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
            return r7
        L20:
            v80.b2 r1 = r12.f46679k
            java.lang.Object r8 = r12.f46680m
            w4.k0 r8 = (w4.k0) r8
            ba0.g.M(r13)
            goto L50
        L2a:
            ba0.g.M(r13)
            java.lang.Object r13 = r12.f46680m
            r8 = r13
            w4.k0 r8 = (w4.k0) r8
            le.v r13 = z1.y3.f46778a
            v80.d0 r13 = v80.d0.UNDISPATCHED
            z1.r3 r1 = new z1.r3
            r1.<init>(r6, r7, r2)
            v80.b2 r13 = v80.f0.B(r3, r7, r13, r1, r5)
            r12.f46680m = r8
            r12.f46679k = r13
            r12.l = r5
            r1 = 3
            java.lang.Object r1 = z1.y3.c(r8, r7, r12, r1)
            if (r1 != r0) goto L4d
            goto L71
        L4d:
            r11 = r1
            r1 = r13
            r13 = r11
        L50:
            w4.v r13 = (w4.v) r13
            r13.a()
            le.v r9 = z1.y3.f46778a
            z70.i r10 = r12.f46682o
            if (r10 == r9) goto L63
            z1.d3 r9 = new z1.d3
            r9.<init>(r10, r6, r13, r7)
            z1.y3.h(r3, r1, r9)
        L63:
            r12.f46680m = r1
            r12.f46679k = r7
            r12.l = r4
            w4.o r13 = w4.o.Main
            java.lang.Object r13 = z1.y3.j(r8, r13, r12)
            if (r13 != r0) goto L72
        L71:
            return r0
        L72:
            r0 = r1
        L73:
            w4.v r13 = (w4.v) r13
            if (r13 != 0) goto L80
            z1.q3 r13 = new z1.q3
            r13.<init>(r6, r7, r2)
            z1.y3.h(r3, r0, r13)
            goto L97
        L80:
            r13.a()
            z1.q3 r1 = new z1.q3
            r1.<init>(r6, r7, r5)
            z1.y3.h(r3, r0, r1)
            long r0 = r13.f43180c
            h4.b r13 = new h4.b
            r13.<init>(r0)
            kotlin.jvm.functions.Function1 r0 = r12.f46683p
            r0.invoke(r13)
        L97:
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.s3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
