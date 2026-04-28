package h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f21141c;

    public j(int i11, int i12, x xVar) {
        this.f21139a = i11;
        this.f21140b = i12;
        this.f21141c = xVar;
        if (i11 < 0) {
            c2.a.a("startIndex should be >= 0");
        }
        if (i12 > 0) {
            return;
        }
        c2.a.a("size should be > 0");
    }
}
