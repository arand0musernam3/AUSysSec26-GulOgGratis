package q90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ia0.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f36488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ae.c f36489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ae.c cVar, ia0.h0 h0Var) {
        super(h0Var);
        this.f36488b = fVar;
        this.f36489c = cVar;
    }

    @Override // ia0.o, ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        f fVar = this.f36488b;
        ae.c cVar = this.f36489c;
        synchronized (fVar) {
            if (cVar.f1242a) {
                return;
            }
            cVar.f1242a = true;
            super.close();
            ((c40.q) this.f36489c.f1243b).b();
        }
    }
}
