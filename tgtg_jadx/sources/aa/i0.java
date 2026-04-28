package aa;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements y9.e0, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r40.d f1120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.collections.t f1123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f1124e;

    public i0(r40.d dVar, k kVar, boolean z11) {
        dVar.getClass();
        this.f1120a = dVar;
        this.f1121b = kVar;
        this.f1122c = z11;
        this.f1123d = new kotlin.collections.t();
    }

    @Override // y9.e0
    public final Object a(y9.d0 d0Var, Function2 function2, z70.i iVar) {
        if (this.f1124e) {
            z20.b.E(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().get(this.f1120a);
        if (aVar != null && aVar.f1062b == this) {
            return g(d0Var, function2, iVar);
        }
        z20.b.E(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // y9.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, kotlin.jvm.functions.Function1 r8, z70.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof aa.h0
            if (r0 == 0) goto L13
            r0 = r9
            aa.h0 r0 = (aa.h0) r0
            int r1 = r0.f1118o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1118o = r1
            goto L18
        L13:
            aa.h0 r0 = new aa.h0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f1116m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f1118o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            aa.k r7 = r0.l
            kotlin.jvm.functions.Function1 r8 = r0.f1115k
            java.lang.String r0 = r0.f1114j
            ba0.g.M(r9)
            r9 = r7
            r7 = r0
            goto L65
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L37:
            ba0.g.M(r9)
            boolean r9 = r6.f1124e
            r2 = 21
            if (r9 != 0) goto L8e
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            r40.d r5 = r6.f1120a
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r5)
            aa.a r9 = (aa.a) r9
            if (r9 == 0) goto L88
            aa.i0 r9 = r9.f1062b
            if (r9 != r6) goto L88
            aa.k r9 = r6.f1121b
            r0.f1114j = r7
            r0.f1115k = r8
            r0.l = r9
            r0.f1118o = r3
            e90.a r2 = r9.f1128b
            java.lang.Object r0 = r2.g(r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            aa.b0 r0 = new aa.b0     // Catch: java.lang.Throwable -> L7b
            aa.k r1 = r6.f1121b     // Catch: java.lang.Throwable -> L7b
            ha.c r7 = r1.v0(r7)     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r7 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L7d
            w.b.y(r0, r4)     // Catch: java.lang.Throwable -> L7b
            r9.e(r4)
            return r7
        L7b:
            r7 = move-exception
            goto L84
        L7d:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L7f
        L7f:
            r8 = move-exception
            w.b.y(r0, r7)     // Catch: java.lang.Throwable -> L7b
            throw r8     // Catch: java.lang.Throwable -> L7b
        L84:
            r9.e(r4)
            throw r7
        L88:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            z20.b.E(r2, r7)
            throw r4
        L8e:
            java.lang.String r7 = "Connection is recycled"
            z20.b.E(r2, r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.i0.b(java.lang.String, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    @Override // aa.j0
    public final ha.a c() {
        return this.f1121b;
    }

    @Override // y9.e0
    public final Boolean d(x70.c cVar) {
        if (this.f1124e) {
            z20.b.E(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) cVar.getContext().get(this.f1120a);
        if (aVar != null && aVar.f1062b == this) {
            return Boolean.valueOf(!this.f1123d.isEmpty() || this.f1121b.f1127a.e0());
        }
        z20.b.E(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(y9.d0 r8, z70.c r9) {
        /*
            r7 = this;
            kotlin.collections.t r0 = r7.f1123d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r9 instanceof aa.e0
            if (r2 == 0) goto L17
            r2 = r9
            aa.e0 r2 = (aa.e0) r2
            int r3 = r2.f1086n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f1086n = r3
            goto L1c
        L17:
            aa.e0 r2 = new aa.e0
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.l
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.f1086n
            r5 = 1
            aa.k r6 = r7.f1121b
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L33
            aa.k r8 = r2.f1084k
            y9.d0 r2 = r2.f1083j
            ba0.g.M(r9)
            r9 = r8
            r8 = r2
            goto L4d
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L3a:
            ba0.g.M(r9)
            r2.f1083j = r8
            r2.f1084k = r6
            r2.f1086n = r5
            e90.a r9 = r6.f1128b
            java.lang.Object r9 = r9.g(r2)
            if (r9 != r3) goto L4c
            return r3
        L4c:
            r9 = r6
        L4d:
            r2 = 0
            int r3 = r0.f26542c     // Catch: java.lang.Throwable -> L6c
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L80
            int[] r1 = aa.d0.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L6c
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6c
            r8 = r1[r8]     // Catch: java.lang.Throwable -> L6c
            if (r8 == r5) goto L7a
            r1 = 2
            if (r8 == r1) goto L74
            r1 = 3
            if (r8 != r1) goto L6e
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            z20.b.m(r6, r8)     // Catch: java.lang.Throwable -> L6c
            goto L94
        L6c:
            r8 = move-exception
            goto La2
        L6e:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L6c
            r8.<init>()     // Catch: java.lang.Throwable -> L6c
            throw r8     // Catch: java.lang.Throwable -> L6c
        L74:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            z20.b.m(r6, r8)     // Catch: java.lang.Throwable -> L6c
            goto L94
        L7a:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            z20.b.m(r6, r8)     // Catch: java.lang.Throwable -> L6c
            goto L94
        L80:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            r8.append(r3)     // Catch: java.lang.Throwable -> L6c
            r1 = 39
            r8.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            z20.b.m(r6, r8)     // Catch: java.lang.Throwable -> L6c
        L94:
            aa.c0 r8 = new aa.c0     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L6c
            r0.addLast(r8)     // Catch: java.lang.Throwable -> L6c
            kotlin.Unit r8 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L6c
            r9.e(r2)
            return r8
        La2:
            r9.e(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.i0.e(y9.d0, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r9, z70.c r10) {
        /*
            r8 = this;
            kotlin.collections.t r0 = r8.f1123d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r10 instanceof aa.f0
            if (r3 == 0) goto L19
            r3 = r10
            aa.f0 r3 = (aa.f0) r3
            int r4 = r3.f1099n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f1099n = r4
            goto L1e
        L19:
            aa.f0 r3 = new aa.f0
            r3.<init>(r8, r10)
        L1e:
            java.lang.Object r10 = r3.l
            y70.a r4 = y70.a.COROUTINE_SUSPENDED
            int r5 = r3.f1099n
            r6 = 1
            aa.k r7 = r8.f1121b
            if (r5 == 0) goto L3a
            if (r5 != r6) goto L33
            boolean r9 = r3.f1096j
            aa.k r3 = r3.f1097k
            ba0.g.M(r10)
            goto L4d
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L3a:
            ba0.g.M(r10)
            r3.f1097k = r7
            r3.f1096j = r9
            r3.f1099n = r6
            e90.a r10 = r7.f1128b
            java.lang.Object r10 = r10.g(r3)
            if (r10 != r4) goto L4c
            return r4
        L4c:
            r3 = r7
        L4d:
            r10 = 0
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto Laa
            java.lang.Object r4 = kotlin.collections.i0.x(r0)     // Catch: java.lang.Throwable -> L6d
            aa.c0 r4 = (aa.c0) r4     // Catch: java.lang.Throwable -> L6d
            r5 = 39
            if (r9 == 0) goto L84
            r4.getClass()     // Catch: java.lang.Throwable -> L6d
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto L6f
            java.lang.String r9 = "END TRANSACTION"
            z20.b.m(r7, r9)     // Catch: java.lang.Throwable -> L6d
            goto La4
        L6d:
            r9 = move-exception
            goto Lb2
        L6f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            int r0 = r4.f1077a     // Catch: java.lang.Throwable -> L6d
            r9.append(r0)     // Catch: java.lang.Throwable -> L6d
            r9.append(r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6d
            z20.b.m(r7, r9)     // Catch: java.lang.Throwable -> L6d
            goto La4
        L84:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto L90
            java.lang.String r9 = "ROLLBACK TRANSACTION"
            z20.b.m(r7, r9)     // Catch: java.lang.Throwable -> L6d
            goto La4
        L90:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            int r0 = r4.f1077a     // Catch: java.lang.Throwable -> L6d
            r9.append(r0)     // Catch: java.lang.Throwable -> L6d
            r9.append(r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6d
            z20.b.m(r7, r9)     // Catch: java.lang.Throwable -> L6d
        La4:
            kotlin.Unit r9 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L6d
            r3.e(r10)
            return r9
        Laa:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "Not in a transaction"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r9     // Catch: java.lang.Throwable -> L6d
        Lb2:
            r3.e(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.i0.f(boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (f(false, r0) != r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [aa.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [y9.d0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [y9.d0] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(y9.d0 r9, kotlin.jvm.functions.Function2 r10, z70.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof aa.g0
            if (r0 == 0) goto L13
            r0 = r11
            aa.g0 r0 = (aa.g0) r0
            int r1 = r0.f1106o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1106o = r1
            goto L18
        L13:
            aa.g0 r0 = new aa.g0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f1104m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f1106o
            r3 = 0
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L62
            if (r2 == r7) goto L59
            if (r2 == r6) goto L50
            if (r2 == r5) goto L4a
            r9 = 4
            if (r2 == r9) goto L44
            if (r2 == r4) goto L37
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L37:
            java.lang.Throwable r9 = r0.f1103k
            java.lang.Object r10 = r0.f1102j
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            ba0.g.M(r11)     // Catch: android.database.SQLException -> L42
            goto Lac
        L42:
            r11 = move-exception
            goto La7
        L44:
            java.lang.Object r9 = r0.f1102j
            ba0.g.M(r11)
            return r9
        L4a:
            java.lang.Object r9 = r0.f1102j
            ba0.g.M(r11)
            return r9
        L50:
            int r9 = r0.l
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L56
            goto L89
        L56:
            r9 = move-exception
            r10 = r9
            goto L98
        L59:
            java.lang.Object r9 = r0.f1102j
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            ba0.g.M(r11)
            goto L74
        L62:
            ba0.g.M(r11)
            if (r9 != 0) goto L69
            y9.d0 r9 = y9.d0.DEFERRED
        L69:
            r0.f1102j = r10
            r0.f1106o = r7
            java.lang.Object r9 = r8.e(r9, r0)
            if (r9 != r1) goto L74
            goto La6
        L74:
            aa.o r9 = new aa.o     // Catch: java.lang.Throwable -> L56
            r11 = 1
            r9.<init>(r8, r11)     // Catch: java.lang.Throwable -> L56
            r11 = 0
            r0.f1102j = r11     // Catch: java.lang.Throwable -> L56
            r0.l = r7     // Catch: java.lang.Throwable -> L56
            r0.f1106o = r6     // Catch: java.lang.Throwable -> L56
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L56
            if (r11 != r1) goto L88
            goto La6
        L88:
            r9 = r7
        L89:
            if (r9 == 0) goto L8c
            r3 = r7
        L8c:
            r0.f1102j = r11
            r0.f1106o = r5
            java.lang.Object r9 = r8.f(r3, r0)
            if (r9 != r1) goto L97
            goto La6
        L97:
            return r11
        L98:
            throw r10     // Catch: java.lang.Throwable -> L99
        L99:
            r9 = move-exception
            r0.f1102j = r10     // Catch: android.database.SQLException -> L42
            r0.f1103k = r9     // Catch: android.database.SQLException -> L42
            r0.f1106o = r4     // Catch: android.database.SQLException -> L42
            java.lang.Object r10 = r8.f(r3, r0)     // Catch: android.database.SQLException -> L42
            if (r10 != r1) goto Lac
        La6:
            return r1
        La7:
            if (r10 == 0) goto Lad
            u70.e.a(r10, r11)
        Lac:
            throw r9
        Lad:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.i0.g(y9.d0, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }
}
