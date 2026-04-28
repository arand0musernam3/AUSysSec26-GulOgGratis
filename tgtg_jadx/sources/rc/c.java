package rc;

import java.io.Closeable;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f37868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f37870c;

    public c(e eVar, b bVar) {
        this.f37870c = eVar;
        this.f37868a = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f37869b) {
            return;
        }
        this.f37869b = true;
        e eVar = this.f37870c;
        synchronized (eVar) {
            b bVar = this.f37868a;
            int i11 = bVar.f37866h - 1;
            bVar.f37866h = i11;
            if (i11 == 0 && bVar.f37864f) {
                Regex regex = e.f37871q;
                eVar.B(bVar);
            }
        }
    }
}
