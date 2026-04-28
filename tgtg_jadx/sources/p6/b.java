package p6;

import q6.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6.m f34497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i6.j f34498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i6.l f34499c;

    public b() {
        i6.m mVar = new i6.m();
        mVar.f23451k = false;
        this.f34497a = mVar;
        this.f34499c = mVar;
    }

    @Override // q6.r
    public final float a() {
        return this.f34499c.b();
    }

    public final void b(float f11, float f12, float f13, float f14, float f15, float f16) {
        i6.m mVar = this.f34497a;
        this.f34499c = mVar;
        mVar.l = f11;
        boolean z11 = f11 > f12;
        mVar.f23451k = z11;
        if (z11) {
            mVar.d(-f13, f11 - f12, f15, f16, f14);
        } else {
            mVar.d(f13, f12 - f11, f15, f16, f14);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f11) {
        return this.f34499c.getInterpolation(f11);
    }
}
