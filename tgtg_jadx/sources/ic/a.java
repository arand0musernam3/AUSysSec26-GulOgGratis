package ic;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.net.URL;
import java.util.regex.Pattern;
import ky.p;
import u40.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23775c;

    public a(long j9, Exception exc) {
        this.f23774b = SystemClock.elapsedRealtime() - j9;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.f23773a = 2;
            this.f23775c = exc;
            return;
        }
        if (!(exc instanceof InitializationException)) {
            this.f23773a = 0;
            this.f23775c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.f23775c = exc;
        if (exc instanceof CameraUnavailableException) {
            this.f23773a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f23773a = 1;
        } else {
            this.f23773a = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f23773a     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r4.f23775c     // Catch: java.lang.Throwable -> L1b
            u40.j r0 = (u40.j) r0     // Catch: java.lang.Throwable -> L1b
            ky.p r0 = r0.f40765a     // Catch: java.lang.Throwable -> L1b
            r0.getClass()     // Catch: java.lang.Throwable -> L1b
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1b
            long r2 = r4.f23774b     // Catch: java.lang.Throwable -> L1b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L19
            goto L1d
        L19:
            r0 = 0
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 1
        L1e:
            monitor-exit(r4)
            return r0
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.a.a():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.a.b():void");
    }

    public synchronized void c(int i11) {
        long jMin;
        if ((i11 >= 200 && i11 < 300) || i11 == 401 || i11 == 404) {
            synchronized (this) {
                this.f23773a = 0;
            }
            return;
        }
        this.f23773a++;
        synchronized (this) {
            if (i11 == 429 || (i11 >= 500 && i11 < 600)) {
                double dPow = Math.pow(2.0d, this.f23773a);
                ((j) this.f23775c).getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000L);
            } else {
                jMin = 86400000;
            }
            ((j) this.f23775c).f40765a.getClass();
            this.f23774b = System.currentTimeMillis() + jMin;
        }
        return;
    }

    public boolean d() {
        return this.f23773a <= ((b) this.f23775c).f23777b;
    }

    public a() {
        if (p.f26720c == null) {
            Pattern pattern = j.f40763b;
            p.f26720c = new p(26);
        }
        p pVar = p.f26720c;
        if (j.f40764c == null) {
            j.f40764c = new j(pVar);
        }
        this.f23775c = j.f40764c;
    }

    public a(b bVar) {
        bVar.getClass();
        this.f23775c = bVar;
        this.f23774b = bVar.f23776a;
    }

    public a(int i11, URL url, long j9) {
        this.f23773a = i11;
        this.f23775c = url;
        this.f23774b = j9;
    }
}
