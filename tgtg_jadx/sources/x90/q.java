package x90;

import ia0.j0;
import ia0.l0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.i f44164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44169f;

    public q(ia0.i iVar) {
        iVar.getClass();
        this.f44164a = iVar;
    }

    @Override // ia0.j0
    public final long F(ia0.g gVar, long j9) throws IOException {
        int i11;
        int i12;
        gVar.getClass();
        do {
            int i13 = this.f44168e;
            ia0.i iVar = this.f44164a;
            if (i13 == 0) {
                iVar.skip(this.f44169f);
                this.f44169f = 0;
                if ((this.f44166c & 4) == 0) {
                    i11 = this.f44167d;
                    int iO = r90.e.o(iVar);
                    this.f44168e = iO;
                    this.f44165b = iO;
                    int i14 = iVar.readByte() & 255;
                    this.f44166c = iVar.readByte() & 255;
                    Logger logger = r.f44170d;
                    if (logger.isLoggable(Level.FINE)) {
                        ia0.j jVar = h.f44115a;
                        logger.fine(h.b(this.f44167d, this.f44165b, i14, this.f44166c, true));
                    }
                    i12 = iVar.readInt() & Integer.MAX_VALUE;
                    this.f44167d = i12;
                    if (i14 != 9) {
                        throw new IOException(i14 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jF = iVar.F(gVar, Math.min(j9, i13));
                if (jF != -1) {
                    this.f44168e -= (int) jF;
                    return jF;
                }
            }
            return -1L;
        } while (i12 == i11);
        i4.a.k("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f44164a.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
