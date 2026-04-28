package i5;

import al.n;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.fragment.app.r;
import c5.y;
import i4.g0;
import j5.t;
import java.util.function.Consumer;
import m3.k1;
import v80.b2;
import v80.f0;
import v80.x1;
import z5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f23369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f23370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h7.c f23371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f23372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a90.d f23373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f23374f;

    public d(t tVar, k kVar, a90.d dVar, h7.c cVar, y yVar) {
        this.f23369a = tVar;
        this.f23370b = kVar;
        this.f23371c = cVar;
        this.f23372d = yVar;
        this.f23373e = new a90.d(dVar.f1015a.plus(f.f23377a));
        this.f23374f = new h(kVar.b(), new c(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r4 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(i5.d r11, android.view.ScrollCaptureSession r12, z5.k r13, z70.c r14) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.d.a(i5.d, android.view.ScrollCaptureSession, z5.k, z70.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        f0.B(this.f23373e, x1.f42174a, null, new gf.g(this, runnable, null, 12), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        b2 b2VarB = f0.B(this.f23373e, null, null, new n(this, scrollCaptureSession, rect, consumer, (x70.c) null, 20), 3);
        b2VarB.J(new r(cancellationSignal, 19));
        cancellationSignal.setOnCancelListener(new e(b2VarB, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(g0.z(this.f23370b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f23374f.f23381b = 0.0f;
        ((k1) this.f23371c.f21523b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
