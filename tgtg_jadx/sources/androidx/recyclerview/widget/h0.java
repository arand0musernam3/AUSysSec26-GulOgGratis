package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f3755e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f3756f = new s(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3759c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3757a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3760d = new ArrayList();

    public static r2 c(RecyclerView recyclerView, int i11, long j9) {
        int iH = recyclerView.f3582f.h();
        for (int i12 = 0; i12 < iH; i12++) {
            r2 r2VarO = RecyclerView.O(recyclerView.f3582f.g(i12));
            if (r2VarO.mPosition == i11 && !r2VarO.isInvalid()) {
                return null;
            }
        }
        f2 f2Var = recyclerView.f3579c;
        if (j9 == LongCompanionObject.MAX_VALUE) {
            try {
                if (d7.g.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th2) {
                recyclerView.W(false);
                Trace.endSection();
                throw th2;
            }
        }
        recyclerView.V();
        r2 r2VarL = f2Var.l(i11, j9);
        if (r2VarL != null) {
            if (!r2VarL.isBound() || r2VarL.isInvalid()) {
                f2Var.a(r2VarL, false);
            } else {
                f2Var.i(r2VarL.itemView);
            }
        }
        recyclerView.W(false);
        Trace.endSection();
        return r2VarL;
    }

    public final void a(RecyclerView recyclerView, int i11, int i12) {
        if (recyclerView.f3608s) {
            if (RecyclerView.I1 && !this.f3757a.contains(recyclerView)) {
                com.braze.h2.b("attempting to post unregistered view!");
                return;
            } else if (this.f3758b == 0) {
                this.f3758b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        f0 f0Var = recyclerView.f3597m1;
        f0Var.f3724a = i11;
        f0Var.f3725b = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r18) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h0.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f3757a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3759c);
                }
            }
        } finally {
            this.f3758b = 0L;
            Trace.endSection();
        }
    }
}
