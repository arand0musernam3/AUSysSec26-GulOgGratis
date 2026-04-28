package p9;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t1.y0;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f34613k;
    public final /* synthetic */ float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y0 f34614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o9.d f34615n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(float f11, float f12, y0 y0Var, o9.d dVar, x70.c cVar) {
        super(2, cVar);
        this.f34613k = f11;
        this.l = f12;
        this.f34614m = y0Var;
        this.f34615n = dVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g(this.f34613k, this.l, this.f34614m, this.f34615n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r2.B(r7.f34615n, r7) == r0) goto L20;
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
            int r1 = r7.f34612j
            t1.y0 r2 = r7.f34614m
            float r3 = r7.f34613k
            float r4 = r7.l
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L21
            if (r1 == r6) goto L1d
            if (r1 != r5) goto L16
            ba0.g.M(r8)
            goto L47
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L1d:
            ba0.g.M(r8)
            goto L38
        L21:
            ba0.g.M(r8)
            int r8 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r8 != 0) goto L29
            goto L38
        L29:
            r7.f34612j = r6
            m3.k1 r8 = r2.f39606c
            java.lang.Object r8 = r8.getValue()
            java.lang.Object r8 = r2.y(r3, r8, r7)
            if (r8 != r0) goto L38
            goto L46
        L38:
            int r8 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r8 != 0) goto L47
            r7.f34612j = r5
            o9.d r8 = r7.f34615n
            java.lang.Object r8 = r2.B(r8, r7)
            if (r8 != r0) goto L47
        L46:
            return r0
        L47:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
