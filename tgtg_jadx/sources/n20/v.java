package n20;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30425c;

    @Override // n20.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f30426a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f30424b, this.f30425c);
        path.transform(matrix);
    }
}
