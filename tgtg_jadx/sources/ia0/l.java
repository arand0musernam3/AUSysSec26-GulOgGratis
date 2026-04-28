package ia0;

import com.braze.h2;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f23654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23656c;

    public l(v vVar, long j9) {
        this.f23654a = vVar;
        this.f23655b = j9;
    }

    @Override // ia0.j0
    public final long F(g gVar, long j9) {
        long j11;
        long j12;
        int i11;
        gVar.getClass();
        if (this.f23656c) {
            h2.b("closed");
            return 0L;
        }
        v vVar = this.f23654a;
        long j13 = this.f23655b;
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        long j14 = j9 + j13;
        long j15 = j13;
        while (true) {
            if (j15 >= j14) {
                j11 = -1;
                break;
            }
            e0 e0VarX0 = gVar.x0(1);
            byte[] bArr = e0VarX0.f23625a;
            int i12 = e0VarX0.f23627c;
            j11 = -1;
            int iMin = (int) Math.min(j14 - j15, 8192 - i12);
            synchronized (vVar) {
                bArr.getClass();
                vVar.f23686d.seek(j15);
                i11 = 0;
                while (true) {
                    if (i11 >= iMin) {
                        break;
                    }
                    int i13 = vVar.f23686d.read(bArr, i12, iMin - i11);
                    if (i13 != -1) {
                        i11 += i13;
                    } else if (i11 == 0) {
                        i11 = -1;
                    }
                }
            }
            if (i11 == -1) {
                if (e0VarX0.f23626b == e0VarX0.f23627c) {
                    gVar.f23642a = e0VarX0.a();
                    f0.a(e0VarX0);
                }
                if (j13 == j15) {
                    j12 = -1;
                }
            } else {
                e0VarX0.f23627c += i11;
                long j16 = i11;
                j15 += j16;
                gVar.f23643b += j16;
            }
        }
        j12 = j15 - j13;
        if (j12 != j11) {
            this.f23655b += j12;
        }
        return j12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f23654a;
        if (this.f23656c) {
            return;
        }
        this.f23656c = true;
        ReentrantLock reentrantLock = vVar.f23685c;
        reentrantLock.lock();
        try {
            int i11 = vVar.f23684b - 1;
            vVar.f23684b = i11;
            if (i11 == 0) {
                if (vVar.f23683a) {
                    synchronized (vVar) {
                        vVar.f23686d.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ia0.j0
    public final l0 i() {
        return l0.f23657d;
    }
}
