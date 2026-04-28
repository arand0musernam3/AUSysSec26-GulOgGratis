package x90;

import ia0.h0;
import ia0.l0;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia0.g f44175b = new ia0.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f44177d;

    public s(v vVar, boolean z11) {
        this.f44177d = vVar;
        this.f44174a = z11;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z11) {
        long jMin;
        boolean z12;
        v vVar = this.f44177d;
        synchronized (vVar) {
            vVar.f44195k.i();
            while (vVar.f44188d >= vVar.f44189e && !this.f44174a && !this.f44176c && vVar.f() == null) {
                try {
                    try {
                        vVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    vVar.f44195k.m();
                    throw th2;
                }
            }
            vVar.f44195k.m();
            vVar.b();
            jMin = Math.min(vVar.f44189e - vVar.f44188d, this.f44175b.f23643b);
            vVar.f44188d += jMin;
            z12 = z11 && jMin == this.f44175b.f23643b;
        }
        this.f44177d.f44195k.i();
        try {
            v vVar2 = this.f44177d;
            vVar2.f44186b.t(vVar2.f44185a, z12, this.f44175b, jMin);
        } finally {
            this.f44177d.f44195k.m();
        }
    }

    @Override // ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        v vVar = this.f44177d;
        TimeZone timeZone = r90.g.f37815a;
        synchronized (vVar) {
            if (this.f44176c) {
                return;
            }
            boolean z11 = vVar.f() == null;
            v vVar2 = this.f44177d;
            if (!vVar2.f44193i.f44174a) {
                if (this.f44175b.f23643b > 0) {
                    while (this.f44175b.f23643b > 0) {
                        a(true);
                    }
                } else if (z11) {
                    vVar2.f44186b.t(vVar2.f44185a, true, null, 0L);
                }
            }
            v vVar3 = this.f44177d;
            synchronized (vVar3) {
                this.f44176c = true;
                vVar3.notifyAll();
            }
            this.f44177d.f44186b.flush();
            this.f44177d.a();
        }
    }

    @Override // ia0.h0, java.io.Flushable
    public final void flush() {
        v vVar = this.f44177d;
        TimeZone timeZone = r90.g.f37815a;
        synchronized (vVar) {
            vVar.b();
        }
        while (this.f44175b.f23643b > 0) {
            a(false);
            this.f44177d.f44186b.flush();
        }
    }

    @Override // ia0.h0
    public final l0 i() {
        return this.f44177d.f44195k;
    }

    @Override // ia0.h0
    public final void x(ia0.g gVar, long j9) {
        gVar.getClass();
        TimeZone timeZone = r90.g.f37815a;
        ia0.g gVar2 = this.f44175b;
        gVar2.x(gVar, j9);
        while (gVar2.f23643b >= 16384) {
            a(false);
        }
    }
}
