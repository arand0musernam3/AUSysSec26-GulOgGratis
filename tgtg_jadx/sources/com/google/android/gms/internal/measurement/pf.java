package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class pf implements Runnable, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yf f11757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11758b = la.f(Thread.currentThread());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11761e;

    public pf(yf yfVar, boolean z11) {
        this.f11761e = false;
        this.f11757a = yfVar;
        this.f11761e = z11;
    }

    public final void a(o30.j jVar) {
        if (this.f11759c) {
            com.braze.h2.b("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (this.f11760d) {
            com.braze.h2.b("Signal is already attached to future");
        } else {
            this.f11760d = true;
            jVar.a(this, o30.g0.INSTANCE);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yf yfVar = this.f11757a;
        try {
            this.f11757a = null;
            boolean z11 = this.f11760d;
            if (!z11) {
                if (this.f11759c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f11759c = true;
                if (this.f11758b && !z11) {
                    la.f(Thread.currentThread());
                }
            }
            if (yfVar != null) {
                ((bf) yfVar).close();
            }
            if (this.f11761e) {
                hf.b(hf.c(), of.f11732g);
            }
        } catch (Throwable th2) {
            if (yfVar != null) {
                try {
                    ((bf) yfVar).close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        if (this.f11759c || !(z11 = this.f11760d)) {
            la.g().post(yc.f12061c);
            return;
        }
        this.f11759c = true;
        if (!this.f11758b || z11) {
            return;
        }
        la.f(Thread.currentThread());
    }
}
