package ka;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements ha.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.b f26253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26255c;

    public g(ja.b bVar, String str) {
        this.f26253a = bVar;
        this.f26254b = str;
    }

    public final void a() {
        if (this.f26255c) {
            z20.b.E(21, "statement is closed");
            throw null;
        }
    }

    @Override // ha.c
    public void n() {
        a();
    }

    @Override // ha.c
    public void reset() {
        a();
    }
}
