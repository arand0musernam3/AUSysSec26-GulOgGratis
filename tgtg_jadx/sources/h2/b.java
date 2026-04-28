package h2;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static long f21033h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f21034a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21036c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21040g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue f21035b = new PriorityQueue(11, new a40.i(7));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Choreographer f21037d = Choreographer.getInstance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f21038e = new a();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f21034a = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            a40.i r1 = new a40.i
            r2 = 7
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.f21035b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f21037d = r0
            h2.a r0 = new h2.a
            r0.<init>()
            r4.f21038e = r0
            long r0 = h2.b.f21033h
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r1 = (float) r1
            float r1 = r1 / r0
            long r0 = (long) r1
            h2.b.f21033h = r0
        L4a:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L56
            r5 = 1
            r4.f21039f = r5
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.b.<init>(android.view.View):void");
    }

    @Override // h2.p1
    public final void a(n1 n1Var) {
        this.f21035b.add(new s1(1, n1Var));
        if (this.f21036c) {
            return;
        }
        this.f21036c = true;
        this.f21034a.post(this);
    }

    public final boolean b() {
        a aVar = this.f21038e;
        long jA = aVar.a();
        b6.a.A(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z11 = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.f21035b;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((s1) objPeek).f21218b.c(aVar)) {
                priorityQueue.poll();
                z11 = false;
            }
            aVar.f21026a = false;
        }
        return z11;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j9) {
        if (this.f21039f) {
            this.f21040g = j9;
            this.f21034a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f21039f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f21039f = false;
        this.f21034a.removeCallbacks(this);
        this.f21037d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f21035b;
        if (!priorityQueue.isEmpty() && this.f21036c && this.f21039f) {
            View view = this.f21034a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z11 = System.nanoTime() > (((long) 2) * f21033h) + nanos;
                a aVar = this.f21038e;
                aVar.f21026a = z11;
                aVar.f21027b = Math.max(this.f21040g, nanos) + f21033h;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (aVar.f21026a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.f21037d.postFrameCallback(this);
                } else {
                    this.f21036c = false;
                }
                b6.a.A(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f21036c = false;
    }
}
