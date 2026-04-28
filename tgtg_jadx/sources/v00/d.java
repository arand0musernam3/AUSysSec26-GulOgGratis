package v00;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f41645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f41646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f41647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f41648d;

    public final void a(LatLng latLng) {
        double d3 = this.f41645a;
        double d11 = latLng.f12145a;
        this.f41645a = Math.min(d3, d11);
        this.f41646b = Math.max(this.f41646b, d11);
        double d12 = latLng.f12146b;
        if (Double.isNaN(this.f41647c)) {
            this.f41647c = d12;
            this.f41648d = d12;
            return;
        }
        double d13 = this.f41647c;
        double d14 = this.f41648d;
        if (d13 <= d14) {
            if (d13 <= d12 && d12 <= d14) {
                return;
            }
        } else if (d13 <= d12 || d12 <= d14) {
            return;
        }
        if (((d13 - d12) + 360.0d) % 360.0d < ((d12 - d14) + 360.0d) % 360.0d) {
            this.f41647c = d12;
        } else {
            this.f41648d = d12;
        }
    }
}
