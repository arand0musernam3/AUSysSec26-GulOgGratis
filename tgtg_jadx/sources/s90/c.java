package s90;

import ia0.j0;
import ia0.p;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f38914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f38915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j0 j0Var, g gVar, d dVar) {
        super(j0Var);
        this.f38914c = gVar;
        this.f38915d = dVar;
    }

    @Override // ia0.p, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f38913b) {
            return;
        }
        this.f38913b = true;
        g gVar = this.f38914c;
        d dVar = this.f38915d;
        synchronized (gVar) {
            int i11 = dVar.f38923h - 1;
            dVar.f38923h = i11;
            if (i11 == 0 && dVar.f38921f) {
                gVar.H(dVar);
            }
        }
    }
}
