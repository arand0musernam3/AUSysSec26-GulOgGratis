package b9;

import androidx.lifecycle.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.e f6066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6068c = false;

    public c(c9.e eVar, a aVar) {
        this.f6066a = eVar;
        this.f6067b = aVar;
    }

    @Override // androidx.lifecycle.p0
    public final void a(Object obj) {
        this.f6068c = true;
        this.f6067b.onLoadFinished(this.f6066a, obj);
    }

    public final String toString() {
        return this.f6067b.toString();
    }
}
