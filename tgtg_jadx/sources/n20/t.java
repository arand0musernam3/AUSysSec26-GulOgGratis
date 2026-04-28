package n20;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f30414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f30416e;

    public t(v vVar, float f11, float f12) {
        this.f30414c = vVar;
        this.f30415d = f11;
        this.f30416e = f12;
    }

    @Override // n20.x
    public final void a(Matrix matrix, m20.a aVar, int i11, Canvas canvas) {
        v vVar = this.f30414c;
        float f11 = vVar.f30425c;
        float f12 = this.f30416e;
        float f13 = vVar.f30424b;
        float f14 = this.f30415d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f11 - f12, f13 - f14), 0.0f);
        Matrix matrix2 = this.f30428a;
        matrix2.set(matrix);
        matrix2.preTranslate(f14, f12);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i11;
        rectF.offset(0.0f, -i11);
        int i12 = aVar.f29171f;
        int[] iArr = m20.a.f29163i;
        iArr[0] = i12;
        iArr[1] = aVar.f29170e;
        iArr[2] = aVar.f29169d;
        Paint paint = aVar.f29168c;
        float f15 = rectF.left;
        paint.setShader(new LinearGradient(f15, rectF.top, f15, rectF.bottom, iArr, m20.a.f29164j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        v vVar = this.f30414c;
        return (float) Math.toDegrees(Math.atan((vVar.f30425c - this.f30416e) / (vVar.f30424b - this.f30415d)));
    }
}
