package x90;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f44197f = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.h f44198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia0.g f44199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f44202e;

    public w(ia0.h hVar) {
        hVar.getClass();
        this.f44198a = hVar;
        ia0.g gVar = new ia0.g();
        this.f44199b = gVar;
        this.f44200c = BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
        this.f44202e = new f(gVar);
    }

    public final void A(int i11, long j9) {
        synchronized (this) {
            try {
                if (this.f44201d) {
                    throw new IOException("closed");
                }
                if (j9 == 0 || j9 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j9).toString());
                }
                Logger logger = f44197f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(false, i11, 4, j9));
                }
                g(i11, 4, 8, 0);
                this.f44198a.writeInt((int) j9);
                this.f44198a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(z zVar) {
        zVar.getClass();
        synchronized (this) {
            try {
                if (this.f44201d) {
                    throw new IOException("closed");
                }
                int i11 = this.f44200c;
                int i12 = zVar.f44207a;
                if ((i12 & 32) != 0) {
                    i11 = zVar.f44208b[5];
                }
                this.f44200c = i11;
                if (((i12 & 2) != 0 ? zVar.f44208b[1] : -1) != -1) {
                    f fVar = this.f44202e;
                    int i13 = (i12 & 2) != 0 ? zVar.f44208b[1] : -1;
                    fVar.getClass();
                    int iMin = Math.min(i13, BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE);
                    int i14 = fVar.f44108d;
                    if (i14 != iMin) {
                        if (iMin < i14) {
                            fVar.f44106b = Math.min(fVar.f44106b, iMin);
                        }
                        fVar.f44107c = true;
                        fVar.f44108d = iMin;
                        int i15 = fVar.f44112h;
                        if (iMin < i15) {
                            if (iMin == 0) {
                                d[] dVarArr = fVar.f44109e;
                                kotlin.collections.x.m(dVarArr, 0, dVarArr.length, null);
                                fVar.f44110f = fVar.f44109e.length - 1;
                                fVar.f44111g = 0;
                                fVar.f44112h = 0;
                            } else {
                                fVar.a(i15 - iMin);
                            }
                        }
                    }
                }
                g(0, 0, 4, 1);
                this.f44198a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f44201d = true;
            this.f44198a.close();
        }
    }

    public final void e(boolean z11, int i11, ia0.g gVar, int i12) {
        synchronized (this) {
            if (this.f44201d) {
                throw new IOException("closed");
            }
            g(i11, i12, 0, z11 ? 1 : 0);
            if (i12 > 0) {
                ia0.h hVar = this.f44198a;
                gVar.getClass();
                hVar.x(gVar, i12);
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f44201d) {
                throw new IOException("closed");
            }
            this.f44198a.flush();
        }
    }

    public final void g(int i11, int i12, int i13, int i14) {
        if (i13 != 8) {
            Level level = Level.FINE;
            Logger logger = f44197f;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(i11, i12, i13, i14, false));
            }
        }
        if (i12 > this.f44200c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f44200c + ": " + i12).toString());
        }
        if ((Integer.MIN_VALUE & i11) != 0) {
            i4.a.i(j4.s.f(i11, "reserved bit set: "));
            return;
        }
        byte[] bArr = r90.e.f37811a;
        ia0.h hVar = this.f44198a;
        hVar.getClass();
        hVar.writeByte((i12 >>> 16) & 255);
        hVar.writeByte((i12 >>> 8) & 255);
        hVar.writeByte(i12 & 255);
        hVar.writeByte(i13 & 255);
        hVar.writeByte(i14 & 255);
        hVar.writeInt(i11 & Integer.MAX_VALUE);
    }

    public final void p(int i11, b bVar, byte[] bArr) {
        bVar.getClass();
        synchronized (this) {
            if (this.f44201d) {
                throw new IOException("closed");
            }
            if (bVar.a() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            g(0, bArr.length + 8, 7, 0);
            this.f44198a.writeInt(i11);
            this.f44198a.writeInt(bVar.a());
            if (bArr.length != 0) {
                this.f44198a.write(bArr);
            }
            this.f44198a.flush();
        }
    }

    public final void r(boolean z11, int i11, ArrayList arrayList) {
        synchronized (this) {
            if (this.f44201d) {
                throw new IOException("closed");
            }
            this.f44202e.d(arrayList);
            long j9 = this.f44199b.f23643b;
            long jMin = Math.min(this.f44200c, j9);
            int i12 = j9 == jMin ? 4 : 0;
            if (z11) {
                i12 |= 1;
            }
            g(i11, (int) jMin, 1, i12);
            this.f44198a.x(this.f44199b, jMin);
            if (j9 > jMin) {
                long j11 = j9 - jMin;
                while (j11 > 0) {
                    long jMin2 = Math.min(this.f44200c, j11);
                    j11 -= jMin2;
                    g(i11, (int) jMin2, 9, j11 == 0 ? 4 : 0);
                    this.f44198a.x(this.f44199b, jMin2);
                }
            }
        }
    }

    public final void t(int i11, int i12, boolean z11) {
        synchronized (this) {
            if (this.f44201d) {
                throw new IOException("closed");
            }
            g(0, 8, 6, z11 ? 1 : 0);
            this.f44198a.writeInt(i11);
            this.f44198a.writeInt(i12);
            this.f44198a.flush();
        }
    }

    public final void u(int i11, b bVar) {
        bVar.getClass();
        synchronized (this) {
            if (this.f44201d) {
                throw new IOException("closed");
            }
            if (bVar.a() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            g(i11, 4, 3, 0);
            this.f44198a.writeInt(bVar.a());
            this.f44198a.flush();
        }
    }
}
