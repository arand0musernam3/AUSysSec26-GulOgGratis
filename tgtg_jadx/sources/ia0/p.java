package ia0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f23669a;

    public p(j0 j0Var) {
        j0Var.getClass();
        this.f23669a = j0Var;
    }

    @Override // ia0.j0
    public long F(g gVar, long j9) {
        gVar.getClass();
        return this.f23669a.F(gVar, j9);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23669a.close();
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f23669a.i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f23669a + ')';
    }
}
