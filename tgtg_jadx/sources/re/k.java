package re;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import he.d0;
import he.z;
import ke.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b {
    public final RectF D;
    public final ie.a E;
    public final float[] F;
    public final Path G;
    public final h H;
    public s I;
    public s J;

    public k(z zVar, h hVar) {
        super(zVar, hVar);
        this.D = new RectF();
        ie.a aVar = new ie.a();
        this.E = aVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = hVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(hVar.l);
    }

    @Override // re.b, je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        h hVar = this.H;
        float f11 = hVar.f37931j;
        float f12 = hVar.f37932k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f11, f12);
        this.f37908n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // re.b, oe.g
    public final void h(Object obj, ub.a aVar) {
        super.h(obj, aVar);
        if (obj == d0.I) {
            this.I = new s(null, aVar);
        } else if (obj == 1) {
            this.J = new s(null, aVar);
        }
    }

    @Override // re.b
    public final void k(Canvas canvas, Matrix matrix, int i11, ve.a aVar) {
        h hVar = this.H;
        int iAlpha = Color.alpha(hVar.l);
        if (iAlpha == 0) {
            return;
        }
        s sVar = this.J;
        Integer num = sVar == null ? null : (Integer) sVar.f();
        ie.a aVar2 = this.E;
        if (num != null) {
            aVar2.setColor(num.intValue());
        } else {
            aVar2.setColor(hVar.l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f37917w.f26355p == null ? 100 : ((Integer) r2.f()).intValue())) / 100.0f) * (i11 / 255.0f) * 255.0f);
        aVar2.setAlpha(iIntValue);
        if (aVar == null || Color.alpha(aVar.f42244d) <= 0) {
            aVar2.clearShadowLayer();
        } else {
            aVar2.setShadowLayer(Math.max(aVar.f42241a, Float.MIN_VALUE), aVar.f42242b, aVar.f42243c, aVar.f42244d);
        }
        s sVar2 = this.I;
        if (sVar2 != null) {
            aVar2.setColorFilter((ColorFilter) sVar2.f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f11 = hVar.f37931j;
            fArr[2] = f11;
            fArr[3] = 0.0f;
            fArr[4] = f11;
            float f12 = hVar.f37932k;
            fArr[5] = f12;
            fArr[6] = 0.0f;
            fArr[7] = f12;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar2);
        }
    }
}
