package ia0;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f23685c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f23686d;

    public v(RandomAccessFile randomAccessFile) {
        this.f23686d = randomAccessFile;
    }

    public final l a(long j9) {
        ReentrantLock reentrantLock = this.f23685c;
        reentrantLock.lock();
        try {
            if (this.f23683a) {
                throw new IllegalStateException("closed");
            }
            this.f23684b++;
            reentrantLock.unlock();
            return new l(this, j9);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f23685c;
        reentrantLock.lock();
        try {
            if (this.f23683a) {
                return;
            }
            this.f23683a = true;
            if (this.f23684b != 0) {
                return;
            }
            synchronized (this) {
                this.f23686d.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f23685c;
        reentrantLock.lock();
        try {
            if (this.f23683a) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f23686d.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
