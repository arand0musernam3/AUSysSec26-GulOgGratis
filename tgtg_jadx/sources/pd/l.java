package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f34684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34685k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f34686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f34687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f34688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f34689p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Ref.ObjectRef objectRef, o oVar, Ref.ObjectRef objectRef2, q qVar, x70.c cVar) {
        super(2, cVar);
        this.f34686m = objectRef;
        this.f34687n = oVar;
        this.f34688o = objectRef2;
        this.f34689p = qVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        l lVar = new l(this.f34686m, this.f34687n, this.f34688o, this.f34689p, cVar);
        lVar.l = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((r) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, pd.r] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r9.f34685k
            r2 = 2
            r3 = 1
            r4 = 0
            kotlin.jvm.internal.Ref$ObjectRef r5 = r9.f34688o
            kotlin.jvm.internal.Ref$ObjectRef r6 = r9.f34686m
            pd.o r7 = r9.f34687n
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1c
            java.lang.Object r0 = r9.l
            pd.r r0 = (pd.r) r0
            ba0.g.M(r10)
            goto L99
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L23:
            kotlin.jvm.internal.Ref$ObjectRef r1 = r9.f34684j
            java.lang.Object r3 = r9.l
            pd.r r3 = (pd.r) r3
            ba0.g.M(r10)
            goto L4c
        L2d:
            ba0.g.M(r10)
            java.lang.Object r10 = r9.l
            pd.r r10 = (pd.r) r10
            T r1 = r6.element
            jd.g r1 = (jd.g) r1
            T r8 = r5.element
            pd.r r8 = (pd.r) r8
            r9.l = r10
            r9.f34684j = r6
            r9.f34685k = r3
            java.lang.Object r1 = pd.o.d(r7, r1, r8, r10, r9)
            if (r1 != r0) goto L49
            goto L97
        L49:
            r3 = r10
            r10 = r1
            r1 = r6
        L4c:
            r1.element = r10
            r7.getClass()
            pd.o.h(r3)
            T r10 = r6.element
            if (r10 == 0) goto L87
            jd.g r10 = (jd.g) r10
            pd.r r10 = r7.j(r10)
            r5.element = r10
            kd.k r10 = new kd.k
            T r0 = r6.element
            r0.getClass()
            jd.g r0 = (jd.g) r0
            id.q r0 = r7.i(r0)
            java.lang.String r1 = r7.f34698a
            T r2 = r5.element
            pd.r r2 = (pd.r) r2
            if (r2 == 0) goto L7d
            pd.p r2 = r2.f34714d
            if (r2 == 0) goto L7d
            java.lang.String r4 = r2.a()
        L7d:
            java.lang.String r1 = pd.o.f(r1, r4)
            id.h r2 = id.h.NETWORK
            r10.<init>(r0, r1, r2)
            return r10
        L87:
            pd.s r10 = r3.f34715e
            if (r10 == 0) goto Lc1
            r9.l = r3
            r9.f34684j = r4
            r9.f34685k = r2
            java.lang.Object r10 = zz.f.C(r10, r9)
            if (r10 != r0) goto L98
        L97:
            return r0
        L98:
            r0 = r3
        L99:
            ia0.g r10 = (ia0.g) r10
            long r1 = r10.f23643b
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lc0
            kd.k r1 = new kd.k
            ia0.m r2 = r7.e()
            id.t r3 = new id.t
            r3.<init>(r10, r2, r4)
            java.lang.String r10 = r7.f34698a
            pd.p r0 = r0.f34714d
            java.lang.String r0 = r0.a()
            java.lang.String r10 = pd.o.f(r10, r0)
            id.h r0 = id.h.NETWORK
            r1.<init>(r3, r10, r0)
            return r1
        Lc0:
            return r4
        Lc1:
            java.lang.String r10 = "body == null"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
