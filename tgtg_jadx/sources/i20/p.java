package i20;

import android.graphics.Matrix;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f23044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f23045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f23046c;

    public p(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.f23044a = fArr3;
        float[] fArr4 = new float[2];
        this.f23045b = fArr4;
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, fArr4, 0, 2);
        this.f23046c = new Matrix();
    }

    public final void a(float f11) {
        float[] fArr = this.f23045b;
        float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.f23044a;
        double d3 = f11;
        double d11 = fAtan2;
        fArr2[0] = (float) ((Math.cos(d11) * d3) + ((double) fArr2[0]));
        fArr2[1] = (float) ((Math.sin(d11) * d3) + ((double) fArr2[1]));
    }

    public final void b() {
        Arrays.fill(this.f23044a, 0.0f);
        float[] fArr = this.f23045b;
        Arrays.fill(fArr, 0.0f);
        fArr[0] = 1.0f;
        this.f23046c.reset();
    }

    public final void c(float f11) {
        Matrix matrix = this.f23046c;
        matrix.reset();
        matrix.setRotate(f11);
        matrix.mapPoints(this.f23044a);
        matrix.mapPoints(this.f23045b);
    }

    public final void d(float f11) {
        float[] fArr = this.f23044a;
        fArr[0] = fArr[0] * 1.0f;
        fArr[1] = fArr[1] * f11;
        float[] fArr2 = this.f23045b;
        fArr2[0] = fArr2[0] * 1.0f;
        fArr2[1] = fArr2[1] * f11;
    }

    public final void e(float f11) {
        float[] fArr = this.f23044a;
        fArr[0] = fArr[0] + f11;
        fArr[1] = fArr[1] + 0.0f;
    }

    public p() {
        this.f23044a = new float[2];
        this.f23045b = new float[]{1.0f, 0.0f};
        this.f23046c = new Matrix();
    }
}
