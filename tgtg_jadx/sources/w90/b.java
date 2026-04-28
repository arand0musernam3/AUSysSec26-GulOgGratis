package w90;

import com.braze.h2;
import ia0.c0;
import ia0.g;
import ia0.h0;
import ia0.l0;
import ia0.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f43332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f43334c;

    public b(f fVar) {
        this.f43334c = fVar;
        this.f43332a = new q(((c0) fVar.f43344c.f39793d).f23611a.i());
    }

    @Override // ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.f43333b) {
            return;
        }
        this.f43333b = true;
        ((c0) this.f43334c.f43344c.f39793d).M("0\r\n\r\n");
        q qVar = this.f43332a;
        l0 l0Var = qVar.f23670e;
        qVar.f23670e = l0.f23657d;
        l0Var.a();
        l0Var.b();
        this.f43334c.f43345d = 3;
    }

    @Override // ia0.h0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f43333b) {
            return;
        }
        ((c0) this.f43334c.f43344c.f39793d).flush();
    }

    @Override // ia0.h0
    public final l0 i() {
        return this.f43332a;
    }

    @Override // ia0.h0
    public final void x(g gVar, long j9) {
        gVar.getClass();
        if (this.f43333b) {
            h2.b("closed");
            return;
        }
        if (j9 == 0) {
            return;
        }
        c0 c0Var = (c0) this.f43334c.f43344c.f39793d;
        if (c0Var.f23613c) {
            h2.b("closed");
            return;
        }
        c0Var.f23612b.B0(j9);
        c0Var.a();
        c0Var.M("\r\n");
        c0Var.x(gVar, j9);
        c0Var.M("\r\n");
    }
}
