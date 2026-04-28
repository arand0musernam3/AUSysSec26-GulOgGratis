package w90;

import com.braze.h2;
import ia0.g;
import q90.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43340e;

    @Override // w90.a, ia0.j0
    public final long F(g gVar, long j9) {
        gVar.getClass();
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        if (this.f43330c) {
            h2.b("closed");
            return 0L;
        }
        if (this.f43340e) {
            return -1L;
        }
        long jF = super.F(gVar, j9);
        if (jF != -1) {
            return jF;
        }
        this.f43340e = true;
        a(t.f36613b);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f43330c) {
            return;
        }
        if (!this.f43340e) {
            a(f.f43341f);
        }
        this.f43330c = true;
    }
}
