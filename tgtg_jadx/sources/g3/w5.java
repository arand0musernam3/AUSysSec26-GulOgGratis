package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 implements d2.z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.k1 f19701a;

    public w5() {
        float f11 = 0;
        this.f19701a = m3.i.w(new d2.b2(f11, f11, f11, f11));
    }

    @Override // d2.z1
    public final float a() {
        return ((d2.z1) this.f19701a.getValue()).a();
    }

    @Override // d2.z1
    public final float b(z5.m mVar) {
        return ((d2.z1) this.f19701a.getValue()).b(mVar);
    }

    @Override // d2.z1
    public final float c() {
        return ((d2.z1) this.f19701a.getValue()).c();
    }

    @Override // d2.z1
    public final float d(z5.m mVar) {
        return ((d2.z1) this.f19701a.getValue()).d(mVar);
    }
}
