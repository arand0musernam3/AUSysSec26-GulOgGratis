package ia0;

import com.braze.h2;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f23657d = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23660c;

    public l0 a() {
        this.f23658a = false;
        return this;
    }

    public l0 b() {
        this.f23660c = 0L;
        return this;
    }

    public long c() {
        if (this.f23658a) {
            return this.f23659b;
        }
        h2.b("No deadline");
        return 0L;
    }

    public l0 d(long j9) {
        this.f23658a = true;
        this.f23659b = j9;
        return this;
    }

    public boolean e() {
        return this.f23658a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f23658a && this.f23659b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public l0 g(long j9, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j9 >= 0) {
            this.f23660c = timeUnit.toNanos(j9);
            return this;
        }
        i4.a.i(e0.f.i(j9, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.f23660c;
    }
}
