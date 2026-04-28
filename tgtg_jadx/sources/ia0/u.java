package ia0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f23681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f23682b;

    public u(InputStream inputStream, l0 l0Var) {
        inputStream.getClass();
        this.f23681a = inputStream;
        this.f23682b = l0Var;
    }

    @Override // ia0.j0
    public final long F(g gVar, long j9) throws IOException {
        gVar.getClass();
        if (j9 == 0) {
            return 0L;
        }
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.f23682b.f();
            e0 e0VarX0 = gVar.x0(1);
            int i11 = this.f23681a.read(e0VarX0.f23625a, e0VarX0.f23627c, (int) Math.min(j9, 8192 - e0VarX0.f23627c));
            if (i11 != -1) {
                e0VarX0.f23627c += i11;
                long j11 = i11;
                gVar.f23643b += j11;
                return j11;
            }
            if (e0VarX0.f23626b != e0VarX0.f23627c) {
                return -1L;
            }
            gVar.f23642a = e0VarX0.a();
            f0.a(e0VarX0);
            return -1L;
        } catch (AssertionError e5) {
            if (ja0.p.a(e5)) {
                throw new IOException(e5);
            }
            throw e5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23681a.close();
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f23682b;
    }

    public final String toString() {
        return "source(" + this.f23681a + ')';
    }
}
