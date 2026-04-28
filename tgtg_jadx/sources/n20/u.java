package n20;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f30417h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f30421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f30422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f30423g;

    public u(float f11, float f12, float f13, float f14) {
        this.f30418b = f11;
        this.f30419c = f12;
        this.f30420d = f13;
        this.f30421e = f14;
    }

    @Override // n20.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f30426a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f11 = this.f30420d;
        float f12 = this.f30421e;
        RectF rectF = f30417h;
        rectF.set(this.f30418b, this.f30419c, f11, f12);
        path.arcTo(rectF, this.f30422f, this.f30423g, false);
        path.transform(matrix);
    }
}
