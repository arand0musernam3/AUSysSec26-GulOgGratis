package y9;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45674k;
    public final /* synthetic */ p0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int[] f45675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String[] f45676n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p0 p0Var, int[] iArr, String[] strArr, x70.c cVar) {
        super(2, cVar);
        this.l = p0Var;
        this.f45675m = iArr;
        this.f45676n = strArr;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        i0 i0Var = new i0(this.l, this.f45675m, this.f45676n, cVar);
        i0Var.f45674k = obj;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (v80.f0.K((kotlin.coroutines.CoroutineContext) r11, r6, r10) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r5.a(r6, r10) != r0) goto L28;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r10.f45673j
            r2 = 0
            int[] r3 = r10.f45675m
            r4 = 3
            r5 = 2
            r6 = 1
            y9.p0 r7 = r10.l
            if (r1 == 0) goto L31
            if (r1 == r6) goto L29
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1b
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L1b:
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L1f
            goto L7f
        L1f:
            r11 = move-exception
            goto L85
        L21:
            java.lang.Object r1 = r10.f45674k
            y80.j r1 = (y80.j) r1
            ba0.g.M(r11)
            goto L65
        L29:
            java.lang.Object r1 = r10.f45674k
            y80.j r1 = (y80.j) r1
            ba0.g.M(r11)
            goto L51
        L31:
            ba0.g.M(r11)
            java.lang.Object r11 = r10.f45674k
            y80.j r11 = (y80.j) r11
            y9.o r1 = r7.f45728h
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L66
            y9.v r1 = r7.f45721a
            r10.f45674k = r11
            r10.f45673j = r6
            r6 = 0
            kotlin.coroutines.CoroutineContext r1 = o00.x0.s(r1, r6, r10)
            if (r1 != r0) goto L4e
            goto L7e
        L4e:
            r9 = r1
            r1 = r11
            r11 = r9
        L51:
            kotlin.coroutines.CoroutineContext r11 = (kotlin.coroutines.CoroutineContext) r11
            sf.a r6 = new sf.a
            r8 = 16
            r6.<init>(r7, r2, r8)
            r10.f45674k = r1
            r10.f45673j = r5
            java.lang.Object r11 = v80.f0.K(r11, r6, r10)
            if (r11 != r0) goto L65
            goto L7e
        L65:
            r11 = r1
        L66:
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            d8.z r5 = r7.f45729i     // Catch: java.lang.Throwable -> L1f
            y9.h0 r6 = new y9.h0     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r8 = r10.f45676n     // Catch: java.lang.Throwable -> L1f
            r6.<init>(r1, r11, r8, r3)     // Catch: java.lang.Throwable -> L1f
            r10.f45674k = r2     // Catch: java.lang.Throwable -> L1f
            r10.f45673j = r4     // Catch: java.lang.Throwable -> L1f
            y70.a r11 = r5.a(r6, r10)     // Catch: java.lang.Throwable -> L1f
            if (r11 != r0) goto L7f
        L7e:
            return r0
        L7f:
            kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1f
            r11.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r11     // Catch: java.lang.Throwable -> L1f
        L85:
            y9.o r0 = r7.f45728h
            r0.b(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
