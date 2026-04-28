package jd;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f24964c;

    public c(e eVar, b bVar) {
        this.f24964c = eVar;
        this.f24962a = bVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f24963b) {
            return;
        }
        this.f24963b = true;
        e eVar = this.f24964c;
        synchronized (eVar.f24973h) {
            b bVar = this.f24962a;
            int i11 = bVar.f24960h - 1;
            bVar.f24960h = i11;
            if (i11 == 0 && bVar.f24958f) {
                eVar.B(bVar);
            }
        }
    }
}
