package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z70.i f45586b;

    /* JADX WARN: Multi-variable type inference failed */
    public u(i iVar, i80.n nVar) {
        this.f45585a = iVar;
        this.f45586b = (z70.i) nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [i80.n, z70.i] */
    /* JADX WARN: Type inference failed for: r9v6, types: [i80.n, z70.i] */
    @Override // y80.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(y80.j r9, x70.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof y80.t
            if (r0 == 0) goto L13
            r0 = r10
            y80.t r0 = (y80.t) r0
            int r1 = r0.f45577k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45577k = r1
            goto L18
        L13:
            y80.t r0 = new y80.t
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f45576j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45577k
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f45578m
            z80.t r9 = (z80.t) r9
            ba0.g.M(r10)     // Catch: java.lang.Throwable -> L32
            goto L83
        L32:
            r10 = move-exception
            goto L8d
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L3b:
            java.lang.Object r9 = r0.f45578m
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            ba0.g.M(r10)
            goto La7
        L43:
            y80.j r9 = r0.f45579n
            java.lang.Object r2 = r0.f45578m
            y80.u r2 = (y80.u) r2
            ba0.g.M(r10)     // Catch: java.lang.Throwable -> L4d
            goto L62
        L4d:
            r9 = move-exception
            goto L93
        L4f:
            ba0.g.M(r10)
            y80.i r10 = r8.f45585a     // Catch: java.lang.Throwable -> L91
            r0.f45578m = r8     // Catch: java.lang.Throwable -> L91
            r0.f45579n = r9     // Catch: java.lang.Throwable -> L91
            r0.f45577k = r5     // Catch: java.lang.Throwable -> L91
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L91
            if (r10 != r1) goto L61
            goto La6
        L61:
            r2 = r8
        L62:
            z80.t r10 = new z80.t
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            z70.i r9 = r2.f45586b     // Catch: java.lang.Throwable -> L89
            r0.f45578m = r10     // Catch: java.lang.Throwable -> L89
            r0.f45579n = r6     // Catch: java.lang.Throwable -> L89
            r0.f45577k = r3     // Catch: java.lang.Throwable -> L89
            r2 = 6
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L89
            r0 = 7
            kotlin.jvm.internal.InlineMarker.mark(r0)     // Catch: java.lang.Throwable -> L89
            if (r9 != r1) goto L82
            goto La6
        L82:
            r9 = r10
        L83:
            r9.releaseIntercepted()
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L89:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L8d:
            r9.releaseIntercepted()
            throw r10
        L91:
            r9 = move-exception
            r2 = r8
        L93:
            y80.c2 r10 = new y80.c2
            r10.<init>(r9)
            z70.i r2 = r2.f45586b
            r0.f45578m = r9
            r0.f45579n = r6
            r0.f45577k = r4
            java.lang.Object r10 = y80.x.a(r10, r2, r9, r0)
            if (r10 != r1) goto La7
        La6:
            return r1
        La7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.u.collect(y80.j, x70.c):java.lang.Object");
    }
}
