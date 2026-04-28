package r8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f37769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f37770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f37771c;

    public i(float f11, float f12, float f13) {
        this.f37769a = f11;
        this.f37770b = f12;
        this.f37771c = f13;
    }

    @Override // r8.g
    public final long a(float f11, float f12) {
        float f13 = f11 + this.f37769a;
        float f14 = this.f37770b;
        return q1.h.a(f13 / f14, (f12 + this.f37771c) / f14);
    }
}
