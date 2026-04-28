package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j2 f391k;
    public final /* synthetic */ Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f393n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.LongRef longRef, x70.c cVar) {
        super(2, cVar);
        this.f391k = j2Var;
        this.l = objectRef;
        this.f392m = objectRef2;
        this.f393n = longRef;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new i2(this.f391k, this.l, this.f392m, this.f393n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            a3.j2 r0 = r12.f391k
            a3.s2 r1 = r0.f402a
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r12.f390j
            kotlin.jvm.internal.Ref$ObjectRef r4 = r12.f392m
            kotlin.jvm.internal.Ref$ObjectRef r5 = r12.l
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L1c
            if (r3 != r7) goto L16
            ba0.g.M(r13)
            goto L38
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
            return r6
        L1c:
            ba0.g.M(r13)
            a3.u r13 = r0.f423w
            if (r13 == 0) goto L3b
            T r3 = r5.element
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            T r8 = r4.element
            m5.t0 r8 = (m5.t0) r8
            long r8 = r8.f29650a
            r12.f390j = r7
            a3.b0 r13 = (a3.b0) r13
            java.lang.Object r13 = r13.e(r3, r8, r12)
            if (r13 != r2) goto L38
            return r2
        L38:
            m5.t0 r13 = (m5.t0) r13
            goto L3c
        L3b:
            r13 = r6
        L3c:
            if (r13 == 0) goto La9
            long r2 = r13.f29650a
            T r4 = r4.element
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r4)
            if (r13 != 0) goto La9
            q1.k0 r13 = r1.f559c
            kotlin.jvm.internal.Ref$LongRef r4 = r12.f393n
            long r7 = r4.element
            java.lang.Object r13 = r13.b(r7)
            a3.s r13 = (a3.s) r13
            if (r13 == 0) goto La9
            m5.h r7 = r13.d()
            T r5 = r5.element
            if (r7 != r5) goto La9
            z2.h r13 = r13.f551c
            java.lang.Object r13 = r13.invoke()
            m5.q0 r13 = (m5.q0) r13
            if (r13 != 0) goto L6b
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        L6b:
            a3.i0 r5 = new a3.i0
            a3.h0 r7 = new a3.h0
            r8 = 32
            long r8 = r2 >> r8
            int r8 = (int) r8
            x5.j r9 = jb.u.F(r13, r8)
            long r10 = r4.element
            r7.<init>(r9, r8, r10)
            a3.h0 r8 = new a3.h0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r9
            int r2 = (int) r2
            x5.j r13 = jb.u.F(r13, r2)
            long r3 = r4.element
            r8.<init>(r13, r2, r3)
            r13 = 0
            r5.<init>(r7, r8, r13)
            q1.k0 r13 = q1.w.f35850a
            q1.k0 r13 = new q1.k0
            r13.<init>()
            r13.h(r3, r5)
            m3.k1 r1 = r1.f567k
            r1.setValue(r13)
            kotlin.jvm.functions.Function1 r13 = r0.f405d
            r13.invoke(r5)
            r0.f420t = r6
        La9:
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
