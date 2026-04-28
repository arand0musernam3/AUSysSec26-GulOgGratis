package ia0;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f23690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f23691b;

    public z(FileOutputStream fileOutputStream, l0 l0Var) {
        this.f23690a = fileOutputStream;
        this.f23691b = l0Var;
    }

    @Override // ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        this.f23690a.close();
    }

    @Override // ia0.h0, java.io.Flushable
    public final void flush() throws IOException {
        this.f23690a.flush();
    }

    @Override // ia0.h0
    public final l0 i() {
        return this.f23691b;
    }

    public final String toString() {
        return "sink(" + this.f23690a + ')';
    }

    @Override // ia0.h0
    public final void x(g gVar, long j9) throws IOException {
        gVar.getClass();
        b.e(gVar.f23643b, 0L, j9);
        while (j9 > 0) {
            this.f23691b.f();
            e0 e0Var = gVar.f23642a;
            e0Var.getClass();
            int iMin = (int) Math.min(j9, e0Var.f23627c - e0Var.f23626b);
            this.f23690a.write(e0Var.f23625a, e0Var.f23626b, iMin);
            int i11 = e0Var.f23626b + iMin;
            e0Var.f23626b = i11;
            long j11 = iMin;
            j9 -= j11;
            gVar.f23643b -= j11;
            if (i11 == e0Var.f23627c) {
                gVar.f23642a = e0Var.a();
                f0.a(e0Var);
            }
        }
    }
}
