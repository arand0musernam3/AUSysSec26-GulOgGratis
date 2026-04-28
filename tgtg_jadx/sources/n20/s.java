package n20;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f30413c;

    public s(u uVar) {
        this.f30413c = uVar;
    }

    @Override // n20.x
    public final void a(Matrix matrix, m20.a aVar, int i11, Canvas canvas) {
        float f11;
        u uVar = this.f30413c;
        float f12 = uVar.f30422f;
        float f13 = uVar.f30423g;
        RectF rectF = new RectF(uVar.f30418b, uVar.f30419c, uVar.f30420d, uVar.f30421e);
        Paint paint = aVar.f29167b;
        boolean z11 = f13 < 0.0f;
        Path path = aVar.f29172g;
        int[] iArr = m20.a.f29165k;
        if (z11) {
            iArr[0] = 0;
            iArr[1] = aVar.f29171f;
            iArr[2] = aVar.f29170e;
            iArr[3] = aVar.f29169d;
            f11 = 0.0f;
        } else {
            path.rewind();
            f11 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f12, f13);
            path.close();
            float f14 = -i11;
            rectF.inset(f14, f14);
            iArr[0] = 0;
            iArr[1] = aVar.f29169d;
            iArr[2] = aVar.f29170e;
            iArr[3] = aVar.f29171f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f11) {
            return;
        }
        float f15 = 1.0f - (i11 / fWidth);
        float[] fArr = m20.a.l;
        fArr[1] = f15;
        fArr[2] = ((1.0f - f15) / 2.0f) + f15;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z11) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f29173h);
        }
        canvas.drawArc(rectF, f12, f13, true, paint);
        canvas.restore();
    }
}
