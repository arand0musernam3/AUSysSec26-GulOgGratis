package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46756k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w4.o f46757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f46758n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(w4.o oVar, Ref.ObjectRef objectRef, x70.c cVar) {
        super(2, cVar);
        this.f46757m = oVar;
        this.f46758n = objectRef;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        w3 w3Var = new w3(this.f46757m, this.f46758n, cVar);
        w3Var.l = obj;
        return w3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w3) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r8.f43167c != 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        r5.element = z1.w1.f46752a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        r8 = r9.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r10 >= r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r11 = (w4.v) r9.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r11.b() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (w4.u.f(r11, r2.f43144f.f43164x, r2.c()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r5.element = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        r8 = w4.o.Final;
        r16.l = r2;
        r16.f46756k = 2;
        r8 = r2.b(r8, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r8 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        r5.element = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[PHI: r2 r8
      0x0043: PHI (r2v3 w4.k0) = (r2v6 w4.k0), (r2v9 w4.k0) binds: [B:12:0x0040, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r8v0 java.lang.Object) = (r8v7 java.lang.Object), (r8v11 java.lang.Object) binds: [B:12:0x0040, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, z1.v1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, z1.w1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, z1.u1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0095 -> B:33:0x0098). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46756k
            z1.u1 r3 = z1.u1.f46714a
            r4 = 2
            kotlin.jvm.internal.Ref$ObjectRef r5 = r0.f46758n
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L2f
            if (r2 == r7) goto L25
            if (r2 != r4) goto L1e
            java.lang.Object r2 = r0.l
            w4.k0 r2 = (w4.k0) r2
            ba0.g.M(r17)
            r8 = r17
            goto L98
        L1e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L25:
            java.lang.Object r2 = r0.l
            w4.k0 r2 = (w4.k0) r2
            ba0.g.M(r17)
            r8 = r17
            goto L43
        L2f:
            ba0.g.M(r17)
            java.lang.Object r2 = r0.l
            w4.k0 r2 = (w4.k0) r2
        L36:
            r0.l = r2
            r0.f46756k = r7
            w4.o r8 = r0.f46757m
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 != r1) goto L43
            goto L97
        L43:
            w4.n r8 = (w4.n) r8
            java.util.List r9 = r8.f43165a
            int r10 = r9.size()
            r11 = r6
        L4c:
            if (r11 >= r10) goto Lb8
            java.lang.Object r12 = r9.get(r11)
            w4.v r12 = (w4.v) r12
            boolean r12 = w4.u.c(r12)
            if (r12 != 0) goto Lb5
            int r8 = r8.f43167c
            if (r8 != r4) goto L63
            z1.w1 r1 = z1.w1.f46752a
            r5.element = r1
            goto Lc5
        L63:
            int r8 = r9.size()
            r10 = r6
        L68:
            if (r10 >= r8) goto L8b
            java.lang.Object r11 = r9.get(r10)
            w4.v r11 = (w4.v) r11
            boolean r12 = r11.b()
            if (r12 != 0) goto L88
            w4.m0 r12 = r2.f43144f
            long r12 = r12.f43164x
            long r14 = r2.c()
            boolean r11 = w4.u.f(r11, r12, r14)
            if (r11 == 0) goto L85
            goto L88
        L85:
            int r10 = r10 + 1
            goto L68
        L88:
            r5.element = r3
            goto Lc5
        L8b:
            w4.o r8 = w4.o.Final
            r0.l = r2
            r0.f46756k = r4
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 != r1) goto L98
        L97:
            return r1
        L98:
            w4.n r8 = (w4.n) r8
            java.util.List r8 = r8.f43165a
            int r9 = r8.size()
            r10 = r6
        La1:
            if (r10 >= r9) goto L36
            java.lang.Object r11 = r8.get(r10)
            w4.v r11 = (w4.v) r11
            boolean r11 = r11.b()
            if (r11 == 0) goto Lb2
            r5.element = r3
            goto Lc5
        Lb2:
            int r10 = r10 + 1
            goto La1
        Lb5:
            int r11 = r11 + 1
            goto L4c
        Lb8:
            z1.v1 r1 = new z1.v1
            java.lang.Object r2 = r9.get(r6)
            w4.v r2 = (w4.v) r2
            r1.<init>(r2)
            r5.element = r1
        Lc5:
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.w3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
