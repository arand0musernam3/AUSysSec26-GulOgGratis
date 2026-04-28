package k6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f26031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f26032e;

    @Override // k6.d
    public final float value() {
        float f11 = this.f26031d;
        if (f11 >= this.f26032e) {
            this.f26028a = true;
        }
        if (!this.f26028a) {
            this.f26031d = f11 + 1.0f;
        }
        return this.f26031d;
    }
}
