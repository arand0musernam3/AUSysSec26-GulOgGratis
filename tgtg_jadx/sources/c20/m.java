package c20;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import j4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f6988a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f6989b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f6990c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f6991d;

    public m(p pVar) {
        this.f6991d = pVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f11, Object obj, Object obj2) {
        this.f6991d.f7008p = f11;
        float[] fArr = this.f6988a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f6989b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i11 = 0; i11 < 9; i11++) {
            float f12 = fArr2[i11];
            float f13 = fArr[i11];
            fArr2[i11] = s.a(f12, f13, f11, f13);
        }
        Matrix matrix = this.f6990c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
