package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45433a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f45434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z70.i f45436d;

    /* JADX WARN: Multi-variable type inference failed */
    public a1(i iVar, i iVar2, i80.n nVar) {
        this.f45434b = iVar;
        this.f45435c = iVar2;
        this.f45436d = (z70.i) nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r10.collect(r6, r0) == r5) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Type inference failed for: r2v2, types: [i80.n, z70.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, gj.c0, java.lang.Object] */
    @Override // y80.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(y80.j r9, x70.c r10) {
        /*
            r8 = this;
            int r0 = r8.f45433a
            r1 = 1
            r2 = 2
            java.lang.Object r3 = r8.f45435c
            r4 = 0
            switch(r0) {
                case 0: goto L2a;
                default: goto La;
            }
        La:
            y80.i r3 = (y80.i) r3
            y80.i[] r0 = new y80.i[r2]
            r2 = 0
            y80.i r5 = r8.f45434b
            r0[r2] = r5
            r0[r1] = r3
            a70.b r1 = new a70.b
            z70.i r2 = r8.f45436d
            r1.<init>(r2, r4)
            y80.d1 r2 = y80.d1.f45465a
            java.lang.Object r9 = z80.b.a(r1, r2, r10, r9, r0)
            y70.a r10 = y70.a.COROUTINE_SUSPENDED
            if (r9 != r10) goto L27
            goto L29
        L27:
            kotlin.Unit r9 = kotlin.Unit.f26487a
        L29:
            return r9
        L2a:
            boolean r0 = r10 instanceof y80.z0
            if (r0 == 0) goto L3d
            r0 = r10
            y80.z0 r0 = (y80.z0) r0
            int r5 = r0.f45623k
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L3d
            int r5 = r5 - r6
            r0.f45623k = r5
            goto L42
        L3d:
            y80.z0 r0 = new y80.z0
            r0.<init>(r8, r10)
        L42:
            java.lang.Object r10 = r0.f45622j
            y70.a r5 = y70.a.COROUTINE_SUSPENDED
            int r6 = r0.f45623k
            if (r6 == 0) goto L62
            if (r6 == r1) goto L58
            if (r6 != r2) goto L52
            ba0.g.M(r10)
            goto L9b
        L52:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            goto L9d
        L58:
            kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f45626o
            y80.j r1 = r0.f45625n
            y80.a1 r3 = r0.f45624m
            ba0.g.M(r10)
            goto L80
        L62:
            ba0.g.M(r10)
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            gj.c0 r3 = (gj.c0) r3
            r10.element = r3
            r0.f45624m = r8
            r0.f45625n = r9
            r0.f45626o = r10
            r0.f45623k = r1
            java.lang.Object r1 = r9.emit(r3, r0)
            if (r1 != r5) goto L7d
            goto L99
        L7d:
            r3 = r8
            r1 = r9
            r9 = r10
        L80:
            y80.i r10 = r3.f45434b
            y80.c1 r6 = new y80.c1
            z70.i r3 = r3.f45436d
            gj.v r3 = (gj.v) r3
            r6.<init>(r9, r3, r1)
            r0.f45624m = r4
            r0.f45625n = r4
            r0.f45626o = r4
            r0.f45623k = r2
            java.lang.Object r9 = r10.collect(r6, r0)
            if (r9 != r5) goto L9b
        L99:
            r4 = r5
            goto L9d
        L9b:
            kotlin.Unit r4 = kotlin.Unit.f26487a
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.a1.collect(y80.j, x70.c):java.lang.Object");
    }

    public a1(gj.c0 c0Var, m1 m1Var, gj.v vVar) {
        this.f45435c = c0Var;
        this.f45434b = m1Var;
        this.f45436d = vVar;
    }
}
