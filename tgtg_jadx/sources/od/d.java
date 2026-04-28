package od;

import co.datadome.sdk.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f32434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f32435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32436c = new Object();

    public d(x xVar, h hVar) {
        this.f32434a = xVar;
        this.f32435b = hVar;
    }

    public final void a(long j9) {
        synchronized (this.f32436c) {
            f fVar = (f) this.f32434a.f8720c;
            fVar.f32440a = j9;
            fVar.p(j9);
        }
    }
}
