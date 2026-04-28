package t1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.FloatRef f39426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39427k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m3.b1 f39428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g0 f39429n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(m3.b1 b1Var, g0 g0Var, x70.c cVar) {
        super(2, cVar);
        this.f39428m = b1Var;
        this.f39429n = g0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        f0 f0Var = new f0(this.f39428m, this.f39429n, cVar);
        f0Var.l = obj;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Path cross not found for [B:11:0x003d, B:16:0x005c], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x005c, B:11:0x003d], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[PHI: r9 r10
      0x0055: PHI (r9v1 kotlin.jvm.internal.Ref$FloatRef) = (r9v2 kotlin.jvm.internal.Ref$FloatRef), (r9v3 kotlin.jvm.internal.Ref$FloatRef) binds: [B:12:0x0052, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r10v1 v80.b0) = (r10v2 v80.b0), (r10v3 v80.b0) binds: [B:12:0x0052, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:11:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x003d). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r11.f39427k
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L1f
            if (r1 != r3) goto L18
            kotlin.jvm.internal.Ref$FloatRef r1 = r11.f39426j
            java.lang.Object r4 = r11.l
            v80.b0 r4 = (v80.b0) r4
            ba0.g.M(r12)
            r9 = r1
            r10 = r4
            goto L3d
        L18:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L1f:
            kotlin.jvm.internal.Ref$FloatRef r1 = r11.f39426j
            java.lang.Object r4 = r11.l
            v80.b0 r4 = (v80.b0) r4
            ba0.g.M(r12)
            r9 = r1
            r10 = r4
            goto L55
        L2b:
            ba0.g.M(r12)
            java.lang.Object r12 = r11.l
            v80.b0 r12 = (v80.b0) r12
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.element = r4
            r10 = r12
            r9 = r1
        L3d:
            b0.x1 r5 = new b0.x1
            r6 = 28
            m3.b1 r7 = r11.f39428m
            t1.g0 r8 = r11.f39429n
            r5.<init>(r6, r7, r8, r9, r10)
            r11.l = r10
            r11.f39426j = r9
            r11.f39427k = r2
            java.lang.Object r12 = t1.c.l(r5, r11)
            if (r12 != r0) goto L55
            goto L78
        L55:
            float r12 = r9.element
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L3d
            rv.a r12 = new rv.a
            r1 = 7
            r12.<init>(r10, r1)
            at.o r12 = m3.i.D(r12)
            t1.e0 r1 = new t1.e0
            r4 = 0
            r1.<init>(r3, r4)
            r11.l = r10
            r11.f39426j = r9
            r11.f39427k = r3
            java.lang.Object r12 = y80.r.p(r12, r1, r11)
            if (r12 != r0) goto L3d
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
