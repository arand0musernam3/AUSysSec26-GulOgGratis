package c90;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7814i = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f7815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef f7816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f7817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f7822h;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public b(d dVar, int i11) {
        this.f7822h = dVar;
        setDaemon(true);
        setContextClassLoader(d.class.getClassLoader());
        this.f7815a = new m();
        this.f7816b = new Ref.ObjectRef();
        this.f7817c = c.DORMANT;
        this.nextParkedWorker = d.f7826k;
        int iNanoTime = (int) System.nanoTime();
        this.f7820f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = c90.m.f7851d.get(r10);
        r0 = c90.m.f7850c.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (c90.m.f7852e.get(r10) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r10.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r8 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c90.i a(boolean r12) {
        /*
            r11 = this;
            c90.c r0 = r11.f7817c
            c90.c r1 = c90.c.CPU_ACQUIRED
            c90.d r3 = r11.f7822h
            r8 = 0
            r9 = 1
            c90.m r10 = r11.f7815a
            if (r0 != r1) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c90.d.f7824i
        L10:
            long r4 = r0.get(r3)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r4
            r6 = 42
            long r1 = r1 >> r6
            int r1 = (int) r1
            if (r1 != 0) goto L73
            r10.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = c90.m.f7849b
            java.lang.Object r0 = r12.get(r10)
            c90.i r0 = (c90.i) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f7840b
            if (r1 != r9) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r10, r0, r8)
            if (r1 == 0) goto L3a
            r8 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r10)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = c90.m.f7851d
            int r12 = r12.get(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = c90.m.f7850c
            int r0 = r0.get(r10)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = c90.m.f7852e
            int r1 = r1.get(r10)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            c90.i r1 = r10.c(r0, r9)
            if (r1 == 0) goto L4d
            r8 = r1
        L61:
            if (r8 != 0) goto L72
            c90.g r12 = r3.f7832f
            java.lang.Object r12 = r12.d()
            c90.i r12 = (c90.i) r12
            if (r12 != 0) goto L71
            c90.i r12 = r11.i(r9)
        L71:
            return r12
        L72:
            return r8
        L73:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = c90.d.f7824i
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            if (r1 == 0) goto L10
            c90.c r0 = c90.c.CPU_ACQUIRED
            r11.f7817c = r0
        L86:
            if (r12 == 0) goto Lba
            int r12 = r3.f7827a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r9 = 0
        L94:
            if (r9 == 0) goto L9d
            c90.i r12 = r11.e()
            if (r12 == 0) goto L9d
            return r12
        L9d:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = c90.m.f7849b
            java.lang.Object r12 = r12.getAndSet(r10, r8)
            c90.i r12 = (c90.i) r12
            if (r12 != 0) goto Lae
            c90.i r12 = r10.b()
        Lae:
            if (r12 == 0) goto Lb1
            return r12
        Lb1:
            if (r9 != 0) goto Lc1
            c90.i r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lba:
            c90.i r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lc1:
            r12 = 3
            c90.i r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c90.b.a(boolean):c90.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i11) {
        int i12 = this.f7820f;
        int i13 = i12 ^ (i12 << 13);
        int i14 = i13 ^ (i13 >> 17);
        int i15 = i14 ^ (i14 << 5);
        this.f7820f = i15;
        int i16 = i11 - 1;
        return (i16 & i11) == 0 ? i15 & i16 : (i15 & Integer.MAX_VALUE) % i11;
    }

    public final i e() {
        int iD = d(2);
        d dVar = this.f7822h;
        g gVar = dVar.f7832f;
        g gVar2 = dVar.f7831e;
        if (iD == 0) {
            i iVar = (i) gVar2.d();
            return iVar != null ? iVar : (i) gVar.d();
        }
        i iVar2 = (i) gVar.d();
        return iVar2 != null ? iVar2 : (i) gVar2.d();
    }

    public final void f(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7822h.f7830d);
        sb2.append("-worker-");
        sb2.append(i11 == 0 ? "TERMINATED" : String.valueOf(i11));
        setName(sb2.toString());
        this.indexInArray = i11;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(c cVar) {
        c cVar2 = this.f7817c;
        boolean z11 = cVar2 == c.CPU_ACQUIRED;
        if (z11) {
            d.f7824i.addAndGet(this.f7822h, 4398046511104L);
        }
        if (cVar2 != cVar) {
            this.f7817c = cVar;
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, c90.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [c90.i] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [c90.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c90.i i(int r26) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c90.b.i(int):c90.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c90.b.run():void");
    }
}
