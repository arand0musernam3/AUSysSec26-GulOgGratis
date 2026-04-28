package m0;

import android.graphics.Matrix;
import android.media.Image;
import s0.k2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f28458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jd.f[] f28459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f28460c;

    public a(Image image) {
        this.f28458a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f28459b = new jd.f[planes.length];
            for (int i11 = 0; i11 < planes.length; i11++) {
                this.f28459b[i11] = new jd.f(planes[i11], 7);
            }
        } else {
            this.f28459b = new jd.f[0];
        }
        this.f28460c = new f(k2.f38372b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // m0.n0
    public final k0 Y() {
        return this.f28460c;
    }

    @Override // m0.n0
    public final int b() {
        return this.f28458a.getWidth();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f28458a.close();
    }

    @Override // m0.n0
    public final Image f0() {
        return this.f28458a;
    }

    @Override // m0.n0
    public final int getFormat() {
        return this.f28458a.getFormat();
    }

    @Override // m0.n0
    public final int getHeight() {
        return this.f28458a.getHeight();
    }

    @Override // m0.n0
    public final jd.f[] o() {
        return this.f28459b;
    }
}
