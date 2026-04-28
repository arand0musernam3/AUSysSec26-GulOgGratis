package aa;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f1064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1065c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k[] f1068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e90.i f1069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kotlin.collections.t f1070h;

    public a0(int i11, Function0 function0) {
        this.f1063a = i11;
        this.f1064b = function0;
        this.f1068f = new k[i11];
        this.f1069g = e90.j.a(i11);
        this.f1070h = new kotlin.collections.t(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z70.c r7) {
        /*
            r6 = this;
            kotlin.collections.t r0 = r6.f1070h
            boolean r1 = r7 instanceof aa.x
            if (r1 == 0) goto L15
            r1 = r7
            aa.x r1 = (aa.x) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1a
        L15:
            aa.x r1 = new aa.x
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.f1173j
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.l
            e90.i r4 = r6.f1069g
            r5 = 1
            if (r3 == 0) goto L32
            if (r3 != r5) goto L2b
            ba0.g.M(r7)
            goto L3e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L32:
            ba0.g.M(r7)
            r1.l = r5
            java.lang.Object r7 = r4.b(r1)
            if (r7 != r2) goto L3e
            return r2
        L3e:
            java.util.concurrent.locks.ReentrantLock r7 = r6.f1065c     // Catch: java.lang.Throwable -> L78
            r7.lock()     // Catch: java.lang.Throwable -> L78
            boolean r1 = r6.f1067e     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L7c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L6e
            int r1 = r6.f1066d     // Catch: java.lang.Throwable -> L7a
            int r2 = r6.f1063a     // Catch: java.lang.Throwable -> L7a
            if (r1 < r2) goto L54
            goto L6e
        L54:
            aa.k r1 = new aa.k     // Catch: java.lang.Throwable -> L7a
            kotlin.jvm.functions.Function0 r2 = r6.f1064b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L7a
            ha.a r2 = (ha.a) r2     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            aa.k[] r2 = r6.f1068f     // Catch: java.lang.Throwable -> L7a
            int r3 = r6.f1066d     // Catch: java.lang.Throwable -> L7a
            int r5 = r3 + 1
            r6.f1066d = r5     // Catch: java.lang.Throwable -> L7a
            r2[r3] = r1     // Catch: java.lang.Throwable -> L7a
            r0.addLast(r1)     // Catch: java.lang.Throwable -> L7a
        L6e:
            java.lang.Object r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L7a
            aa.k r0 = (aa.k) r0     // Catch: java.lang.Throwable -> L7a
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            return r0
        L78:
            r7 = move-exception
            goto L89
        L7a:
            r0 = move-exception
            goto L85
        L7c:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            z20.b.E(r1, r0)     // Catch: java.lang.Throwable -> L7a
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L7a
        L85:
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L89:
            r4.d()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.a0.a(z70.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:11|(2:57|12)|31|53|38|(1:(1:48)(2:44|(1:46)))(1:40)|47|19|55|20|(1:22)(1:23)|(1:(2:32|33))(1:25)|27|(1:29)(13:30|31|53|38|(0)(0)|47|19|55|20|(0)(0)|(0)(0)|27|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        r13 = r13;
        r12 = r12;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:20:0x003e, B:25:0x0058, B:27:0x006c, B:32:0x007a, B:33:0x007f), top: B:55:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:38:0x008c, B:40:0x0090, B:44:0x0098, B:48:0x009f), top: B:53:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0073 -> B:31:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, aa.d r12, z70.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof aa.y
            if (r0 == 0) goto L13
            r0 = r13
            aa.y r0 = (aa.y) r0
            int r1 = r0.f1179o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1179o = r1
            goto L18
        L13:
            aa.y r0 = new aa.y
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f1177m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f1179o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            long r10 = r0.f1175j
            kotlin.jvm.internal.Ref$ObjectRef r12 = r0.l
            kotlin.jvm.functions.Function0 r2 = r0.f1176k
            ba0.g.M(r13)     // Catch: java.lang.Throwable -> L2e
            goto L75
        L2e:
            r13 = move-exception
            goto L87
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            return r4
        L36:
            ba0.g.M(r13)
        L39:
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            aa.z r2 = new aa.z     // Catch: java.lang.Throwable -> L85
            r2.<init>(r13, r9, r4)     // Catch: java.lang.Throwable -> L85
            r0.f1176k = r12     // Catch: java.lang.Throwable -> L85
            r0.l = r13     // Catch: java.lang.Throwable -> L85
            r0.f1175j = r10     // Catch: java.lang.Throwable -> L85
            r0.f1179o = r3     // Catch: java.lang.Throwable -> L85
            p80.c r5 = p80.d.f34559b     // Catch: java.lang.Throwable -> L85
            r5 = 0
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 <= 0) goto L55
            r7 = r3
            goto L56
        L55:
            r7 = 0
        L56:
            if (r7 != r3) goto L6a
            p80.h r5 = p80.h.NANOSECONDS     // Catch: java.lang.Throwable -> L85
            r6 = 999999(0xf423f, double:4.94065E-318)
            long r5 = p80.g.h(r6, r5)     // Catch: java.lang.Throwable -> L85
            long r5 = p80.d.i(r10, r5)     // Catch: java.lang.Throwable -> L85
            long r5 = p80.d.f(r5)     // Catch: java.lang.Throwable -> L85
            goto L6c
        L6a:
            if (r7 != 0) goto L7a
        L6c:
            java.lang.Object r2 = v80.j2.b(r5, r2, r0)     // Catch: java.lang.Throwable -> L85
            if (r2 != r1) goto L73
            return r1
        L73:
            r2 = r12
            r12 = r13
        L75:
            r13 = r12
            r12 = r2
            r2 = r0
            r0 = r4
            goto L8c
        L7a:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            throw r2     // Catch: java.lang.Throwable -> L85
        L80:
            r8 = r2
            r2 = r12
            r12 = r13
            r13 = r8
            goto L87
        L85:
            r2 = move-exception
            goto L80
        L87:
            r8 = r13
            r13 = r12
            r12 = r2
            r2 = r0
            r0 = r8
        L8c:
            boolean r5 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L94
            if (r5 == 0) goto L96
            r12.invoke()     // Catch: java.lang.Throwable -> L94
            goto L9d
        L94:
            r10 = move-exception
            goto La0
        L96:
            if (r0 != 0) goto L9f
            T r13 = r13.element     // Catch: java.lang.Throwable -> L94
            if (r13 == 0) goto L9d
            return r13
        L9d:
            r0 = r2
            goto L39
        L9f:
            throw r0     // Catch: java.lang.Throwable -> L94
        La0:
            T r11 = r13.element
            aa.k r11 = (aa.k) r11
            if (r11 == 0) goto La9
            r9.e(r11)
        La9:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.a0.b(long, aa.d, z70.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f1065c;
        reentrantLock.lock();
        try {
            this.f1067e = true;
            for (k kVar : this.f1068f) {
                if (kVar != null) {
                    kVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb2) {
        kotlin.collections.t tVar = this.f1070h;
        ReentrantLock reentrantLock = this.f1065c;
        reentrantLock.lock();
        try {
            v70.e eVarB = kotlin.collections.c0.b();
            int i11 = tVar.f26542c;
            for (int i12 = 0; i12 < i11; i12++) {
                eVarB.add(tVar.get(i12));
            }
            v70.e eVarA = kotlin.collections.c0.a(eVarB);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f1063a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            e90.i iVar = this.f1069g;
            iVar.getClass();
            sb3.append(Math.max(e90.h.f15884g.get(iVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + eVarA.b() + ")[" + CollectionsKt.U(eVarA, null, null, null, null, 63) + ']');
            sb2.append(")");
            sb2.append('\n');
            k[] kVarArr = this.f1068f;
            int length = kVarArr.length;
            int i13 = 0;
            for (int i14 = 0; i14 < length; i14++) {
                k kVar = kVarArr[i14];
                i13++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i13);
                sb4.append("] - ");
                sb4.append(kVar != null ? kVar.f1127a.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (kVar != null) {
                    kVar.p(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(k kVar) {
        kVar.getClass();
        ReentrantLock reentrantLock = this.f1065c;
        reentrantLock.lock();
        try {
            this.f1070h.addLast(kVar);
            reentrantLock.unlock();
            this.f1069g.d();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
