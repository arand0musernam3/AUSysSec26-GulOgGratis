package q6;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i6.e f36275b;

    public /* synthetic */ o(i6.e eVar, int i11) {
        this.f36274a = i11;
        this.f36275b = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f11) {
        double dA;
        switch (this.f36274a) {
            case 0:
                dA = this.f36275b.a(f11);
                break;
            case 1:
                dA = this.f36275b.a(f11);
                break;
            default:
                dA = this.f36275b.a(f11);
                break;
        }
        return (float) dA;
    }
}
