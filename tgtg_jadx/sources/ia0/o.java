package ia0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f23668a;

    public o(h0 h0Var) {
        h0Var.getClass();
        this.f23668a = h0Var;
    }

    @Override // ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.f23668a.close();
    }

    @Override // ia0.h0, java.io.Flushable
    public void flush() {
        this.f23668a.flush();
    }

    @Override // ia0.h0
    public final l0 i() {
        return this.f23668a.i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f23668a + ')';
    }

    @Override // ia0.h0
    public void x(g gVar, long j9) {
        gVar.getClass();
        this.f23668a.x(gVar, j9);
    }
}
