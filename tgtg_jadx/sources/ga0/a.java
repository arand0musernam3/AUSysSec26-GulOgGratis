package ga0;

import ia0.t;
import java.io.Closeable;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ia0.g f20273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Closeable f20275e;

    public a(boolean z11, int i11) {
        this.f20271a = i11;
        switch (i11) {
            case 1:
                this.f20272b = z11;
                this.f20273c = new ia0.g();
                break;
            default:
                this.f20272b = z11;
                ia0.g gVar = new ia0.g();
                this.f20273c = gVar;
                Deflater deflater = new Deflater(-1, true);
                this.f20274d = deflater;
                this.f20275e = new ia0.k(gVar, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f20271a) {
            case 0:
                ((ia0.k) this.f20275e).close();
                break;
            default:
                t tVar = (t) this.f20275e;
                if (tVar != null) {
                    tVar.close();
                }
                this.f20275e = null;
                this.f20274d = null;
                break;
        }
    }
}
