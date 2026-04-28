package w2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v0 f43051k;
    public final /* synthetic */ float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f43052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h4.c f43053n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, float f11, boolean z11, h4.c cVar, x70.c cVar2) {
        super(2, cVar2);
        this.f43051k = v0Var;
        this.l = f11;
        this.f43052m = z11;
        this.f43053n = cVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new u0(this.f43051k, this.l, this.f43052m, this.f43053n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r8.a(r7.f43053n, r7) == r0) goto L27;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.f43050j
            w2.v0 r2 = r7.f43051k
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            ba0.g.M(r8)
            goto L61
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L19:
            ba0.g.M(r8)
            goto L4e
        L1d:
            ba0.g.M(r8)
            v1.y1 r8 = r2.f43061x
            float r1 = w2.r0.f43032a
            float r1 = r7.l
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L45
            boolean r5 = java.lang.Float.isInfinite(r1)
            if (r5 == 0) goto L33
            goto L45
        L33:
            r5 = 0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L3f
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
        L3d:
            float r1 = (float) r5
            goto L45
        L3f:
            double r5 = (double) r1
            double r5 = java.lang.Math.floor(r5)
            goto L3d
        L45:
            r7.f43050j = r4
            java.lang.Object r8 = z1.p2.b(r8, r1, r7)
            if (r8 != r0) goto L4e
            goto L60
        L4e:
            boolean r8 = r7.f43052m
            if (r8 == 0) goto L61
            w2.o1 r8 = r2.f43056s
            j2.c r8 = r8.f43013g
            r7.f43050j = r3
            h4.c r1 = r7.f43053n
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L61
        L60:
            return r0
        L61:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
