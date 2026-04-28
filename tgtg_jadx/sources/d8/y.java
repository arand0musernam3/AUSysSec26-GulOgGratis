package d8;

import a3.x1;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f14735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.a f14736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v80.b0 f14737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final at.o f14738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e90.c f14739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b2 f14741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f14742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.firebase.messaging.a0 f14743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u70.t f14744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u70.t f14745k;
    public final com.google.firebase.messaging.a0 l;

    public y(c0 c0Var, List list, e8.a aVar, v80.b0 b0Var) {
        list.getClass();
        this.f14735a = c0Var;
        this.f14736b = aVar;
        this.f14737c = b0Var;
        x70.c cVar = null;
        this.f14738d = new at.o(new x1(this, cVar, 14));
        this.f14739e = e90.d.a();
        this.f14742h = new z();
        this.f14743i = new com.google.firebase.messaging.a0(this, list);
        final int i11 = 0;
        this.f14744j = u70.l.b(new Function0(this) { // from class: d8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f14618b;

            {
                this.f14618b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                switch (i11) {
                    case 0:
                        c0 c0Var2 = this.f14618b.f14735a;
                        File canonicalFile = ((File) c0Var2.f14589c.invoke()).getCanonicalFile();
                        synchronized (c0.f14586e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = c0.f14585d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new f0(canonicalFile, c0Var2.f14587a, (k0) c0Var2.f14588b.invoke(canonicalFile), new b0(canonicalFile, 0));
                    default:
                        return ((f0) this.f14618b.f14744j.getValue()).f14612c;
                }
            }
        });
        final int i12 = 1;
        this.f14745k = u70.l.b(new Function0(this) { // from class: d8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f14618b;

            {
                this.f14618b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                switch (i12) {
                    case 0:
                        c0 c0Var2 = this.f14618b.f14735a;
                        File canonicalFile = ((File) c0Var2.f14589c.invoke()).getCanonicalFile();
                        synchronized (c0.f14586e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = c0.f14585d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new f0(canonicalFile, c0Var2.f14587a, (k0) c0Var2.f14588b.invoke(canonicalFile), new b0(canonicalFile, 0));
                    default:
                        return ((f0) this.f14618b.f14744j.getValue()).f14612c;
                }
            }
        });
        this.l = new com.google.firebase.messaging.a0(b0Var, new c50.p(this, 9), new cn.u(9, (byte) 0), new c(this, cVar, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(d8.y r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof d8.o
            if (r0 == 0) goto L13
            r0 = r5
            d8.o r0 = (d8.o) r0
            int r1 = r0.f14664m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14664m = r1
            goto L18
        L13:
            d8.o r0 = new d8.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f14663k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14664m
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            e90.c r0 = r0.f14662j
            ba0.g.M(r5)
            goto L41
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L30:
            ba0.g.M(r5)
            e90.c r5 = r4.f14739e
            r0.f14662j = r5
            r0.f14664m = r3
            java.lang.Object r0 = r5.g(r0)
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            r5 = 0
            int r1 = r4.f14740f     // Catch: java.lang.Throwable -> L52
            int r1 = r1 + (-1)
            r4.f14740f = r1     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L56
            v80.b2 r1 = r4.f14741g     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L54
            r1.a(r5)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r4 = move-exception
            goto L5c
        L54:
            r4.f14741g = r5     // Catch: java.lang.Throwable -> L52
        L56:
            r0.e(r5)
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        L5c:
            r0.e(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.y.b(d8.y, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(d8.y r7, d8.l0 r8, z70.c r9) {
        /*
            boolean r0 = r9 instanceof d8.p
            if (r0 == 0) goto L13
            r0 = r9
            d8.p r0 = (d8.p) r0
            int r1 = r0.f14669m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14669m = r1
            goto L18
        L13:
            d8.p r0 = new d8.p
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f14668k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14669m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            v80.q r7 = r0.f14667j
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L2a
            goto L56
        L2a:
            r8 = move-exception
            goto L5b
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r3
        L32:
            ba0.g.M(r9)
            v80.q r9 = r8.f14650b
            u70.o r2 = u70.q.f40850b     // Catch: java.lang.Throwable -> L59
            kotlin.coroutines.CoroutineContext r2 = r8.f14652d     // Catch: java.lang.Throwable -> L59
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()     // Catch: java.lang.Throwable -> L59
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r5)     // Catch: java.lang.Throwable -> L59
            d8.c r5 = new d8.c     // Catch: java.lang.Throwable -> L59
            r5.<init>(r7, r8, r3, r4)     // Catch: java.lang.Throwable -> L59
            r0.f14667j = r9     // Catch: java.lang.Throwable -> L59
            r0.f14669m = r4     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = v80.f0.K(r2, r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L53
            return r1
        L53:
            r6 = r9
            r9 = r7
            r7 = r6
        L56:
            u70.o r8 = u70.q.f40850b     // Catch: java.lang.Throwable -> L2a
            goto L62
        L59:
            r8 = move-exception
            r7 = r9
        L5b:
            u70.o r9 = u70.q.f40850b
            u70.p r9 = new u70.p
            r9.<init>(r8)
        L62:
            java.lang.Throwable r8 = u70.q.a(r9)
            if (r8 != 0) goto L6c
            r7.R(r9)
            goto L6f
        L6c:
            r7.h0(r8)
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.y.c(d8.y, d8.l0, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(d8.y r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof d8.q
            if (r0 == 0) goto L13
            r0 = r5
            d8.q r0 = (d8.q) r0
            int r1 = r0.f14677m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14677m = r1
            goto L18
        L13:
            d8.q r0 = new d8.q
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f14676k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14677m
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            e90.c r0 = r0.f14675j
            ba0.g.M(r5)
            goto L41
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L30:
            ba0.g.M(r5)
            e90.c r5 = r4.f14739e
            r0.f14675j = r5
            r0.f14677m = r3
            java.lang.Object r0 = r5.g(r0)
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            r5 = 0
            int r1 = r4.f14740f     // Catch: java.lang.Throwable -> L59
            int r1 = r1 + r3
            r4.f14740f = r1     // Catch: java.lang.Throwable -> L59
            if (r1 != r3) goto L5b
            v80.b0 r1 = r4.f14737c     // Catch: java.lang.Throwable -> L59
            d8.l r2 = new d8.l     // Catch: java.lang.Throwable -> L59
            r3 = 1
            r2.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> L59
            r3 = 3
            v80.b2 r1 = v80.f0.B(r1, r5, r5, r2, r3)     // Catch: java.lang.Throwable -> L59
            r4.f14741g = r1     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r4 = move-exception
            goto L61
        L5b:
            r0.e(r5)
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        L61:
            r0.e(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.y.d(d8.y, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r2.V(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(d8.y r6, z70.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof d8.r
            if (r0 == 0) goto L13
            r0 = r7
            d8.r r0 = (d8.r) r0
            int r1 = r0.f14686m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14686m = r1
            goto L18
        L13:
            d8.r r0 = new d8.r
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f14685k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14686m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            int r0 = r0.f14684j
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            ba0.g.M(r7)
            goto L49
        L39:
            ba0.g.M(r7)
            d8.k0 r7 = r6.h()
            r0.f14686m = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            com.google.firebase.messaging.a0 r2 = r6.f14743i     // Catch: java.lang.Throwable -> L5f
            r0.f14684j = r7     // Catch: java.lang.Throwable -> L5f
            r0.f14686m = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r2.V(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            d8.z r6 = r6.f14742h
            d8.v0 r1 = new d8.v0
            r1.<init>(r0, r7)
            r6.c(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.y.e(d8.y, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r10 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        if (r10 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(d8.y r8, boolean r9, x70.c r10) {
        /*
            d8.z r0 = r8.f14742h
            boolean r1 = r10 instanceof d8.s
            if (r1 == 0) goto L15
            r1 = r10
            d8.s r1 = (d8.s) r1
            int r2 = r1.f14699n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f14699n = r2
            goto L1a
        L15:
            d8.s r1 = new d8.s
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.l
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f14699n
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L43
            if (r3 == r6) goto L3b
            if (r3 == r5) goto L37
            if (r3 != r4) goto L30
            ba0.g.M(r10)
            goto La5
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
        L35:
            r8 = 0
            return r8
        L37:
            ba0.g.M(r10)
            goto L8d
        L3b:
            boolean r9 = r1.f14696j
            d8.e1 r3 = r1.f14697k
            ba0.g.M(r10)
            goto L5f
        L43:
            ba0.g.M(r10)
            d8.e1 r3 = r0.b()
            boolean r10 = r3 instanceof d8.f1
            if (r10 != 0) goto Lb9
            d8.k0 r10 = r8.h()
            r1.f14697k = r3
            r1.f14696j = r9
            r1.f14699n = r6
            java.lang.Object r10 = r10.b(r1)
            if (r10 != r2) goto L5f
            goto La4
        L5f:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            boolean r6 = r3 instanceof d8.b
            if (r6 == 0) goto L6f
            r7 = r3
            d8.b r7 = (d8.b) r7
            int r7 = r7.f14609a
            goto L70
        L6f:
            r7 = -1
        L70:
            if (r6 == 0) goto L75
            if (r10 != r7) goto L75
            return r3
        L75:
            r10 = 0
            if (r9 == 0) goto L90
            d8.k0 r9 = r8.h()
            b0.r2 r3 = new b0.r2
            r4 = 1
            r3.<init>(r8, r10, r4)
            r1.f14697k = r10
            r1.f14699n = r5
            java.lang.Object r10 = r9.d(r3, r1)
            if (r10 != r2) goto L8d
            goto La4
        L8d:
            kotlin.Pair r10 = (kotlin.Pair) r10
            goto La7
        L90:
            d8.k0 r9 = r8.h()
            d8.t r3 = new d8.t
            r5 = 0
            r3.<init>(r8, r7, r10, r5)
            r1.f14697k = r10
            r1.f14699n = r4
            java.lang.Object r10 = r9.a(r3, r1)
            if (r10 != r2) goto La5
        La4:
            return r2
        La5:
            kotlin.Pair r10 = (kotlin.Pair) r10
        La7:
            java.lang.Object r8 = r10.f26485a
            d8.e1 r8 = (d8.e1) r8
            java.lang.Object r9 = r10.f26486b
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb8
            r0.c(r8)
        Lb8:
            return r8
        Lb9:
            java.lang.String r8 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            com.braze.h2.b(r8)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.y.f(d8.y, boolean, x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[Catch: CorruptionException -> 0x0057, TryCatch #2 {CorruptionException -> 0x0057, blocks: (B:19:0x0052, B:54:0x00e3, B:24:0x005c, B:51:0x00c7, B:32:0x0071, B:40:0x0089, B:42:0x008f, B:36:0x007a, B:48:0x00b6), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b A[Catch: all -> 0x0145, TryCatch #1 {all -> 0x0145, blocks: (B:61:0x010b, B:63:0x011b, B:64:0x0120), top: B:80:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120 A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #1 {all -> 0x0145, blocks: (B:61:0x010b, B:63:0x011b, B:64:0x0120), top: B:80:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(d8.y r9, boolean r10, z70.c r11) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.y.g(d8.y, boolean, z70.c):java.lang.Object");
    }

    @Override // d8.f
    public final Object a(Function2 function2, x70.c cVar) {
        i1 i1Var = (i1) cVar.getContext().get(h1.f14624a);
        if (i1Var != null) {
            i1Var.b(this);
        }
        return v80.f0.K(new i1(i1Var, this), new x1(this, function2, (x70.c) null), cVar);
    }

    @Override // d8.f
    public final y80.i getData() {
        return this.f14738d;
    }

    public final k0 h() {
        return (k0) this.f14745k.getValue();
    }

    public final Object i(z70.c cVar) {
        return ((f0) this.f14744j.getValue()).a(new m(3, (x70.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r11, boolean r12, z70.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof d8.w
            if (r0 == 0) goto L13
            r0 = r13
            d8.w r0 = (d8.w) r0
            int r1 = r0.f14725m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14725m = r1
            goto L18
        L13:
            d8.w r0 = new d8.w
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f14724k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14725m
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$IntRef r11 = r0.f14723j
            ba0.g.M(r13)
            goto L55
        L29:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L30:
            ba0.g.M(r13)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            u70.t r13 = r10.f14744j
            java.lang.Object r13 = r13.getValue()
            d8.f0 r13 = (d8.f0) r13
            d8.x r4 = new d8.x
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f14723j = r5
            r0.f14725m = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L54
            return r1
        L54:
            r11 = r5
        L55:
            int r11 = r11.element
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.y.j(java.lang.Object, boolean, z70.c):java.lang.Object");
    }
}
