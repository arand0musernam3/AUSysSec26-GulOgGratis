package n20;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y[] f30400a = new y[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f30401b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f30402c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f30403d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f30404e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f30405f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f30406g = new y();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f30407h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f30408i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f30409j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f30410k = new Path();
    public final boolean l = true;

    public q() {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f30400a[i11] = new y();
            this.f30401b[i11] = new Matrix();
            this.f30402c[i11] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(o oVar, float[] fArr, float f11, RectF rectF, m1.a aVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i11;
        y[] yVarArr;
        char c3;
        Matrix[] matrixArr2;
        char c7;
        int i12;
        path.rewind();
        Path path2 = this.f30404e;
        path2.rewind();
        Path path3 = this.f30405f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i13 = 0;
        while (true) {
            matrixArr = this.f30402c;
            fArr2 = this.f30407h;
            yVarArr = this.f30400a;
            c3 = 0;
            matrixArr2 = this.f30401b;
            if (i13 >= 4) {
                break;
            }
            d cVar = fArr == null ? i13 != 1 ? i13 != 2 ? i13 != 3 ? oVar.f30393f : oVar.f30392e : oVar.f30395h : oVar.f30394g : new c(fArr[i13]);
            jf.e eVar = i13 != 1 ? i13 != 2 ? i13 != 3 ? oVar.f30389b : oVar.f30388a : oVar.f30391d : oVar.f30390c;
            y yVar = yVarArr[i13];
            eVar.getClass();
            eVar.D(yVar, f11, cVar.a(rectF));
            int i14 = i13 + 1;
            float f12 = (i14 % 4) * 90;
            matrixArr2[i13].reset();
            PointF pointF = this.f30403d;
            if (i13 == 1) {
                i12 = i13;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i13 == 2) {
                i12 = i13;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i13 != 3) {
                i12 = i13;
                pointF.set(rectF.right, rectF.top);
            } else {
                i12 = i13;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i12].setTranslate(pointF.x, pointF.y);
            matrixArr2[i12].preRotate(f12);
            y yVar2 = yVarArr[i12];
            fArr2[0] = yVar2.f30431c;
            fArr2[1] = yVar2.f30432d;
            matrixArr2[i12].mapPoints(fArr2);
            matrixArr[i12].reset();
            matrixArr[i12].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i12].preRotate(f12);
            i13 = i14;
        }
        char c8 = 1;
        int i15 = 0;
        for (i11 = 4; i15 < i11; i11 = 4) {
            y yVar3 = yVarArr[i15];
            fArr2[c3] = yVar3.f30429a;
            fArr2[c8] = yVar3.f30430b;
            matrixArr2[i15].mapPoints(fArr2);
            if (i15 == 0) {
                path.moveTo(fArr2[c3], fArr2[c8]);
            } else {
                path.lineTo(fArr2[c3], fArr2[c8]);
            }
            yVarArr[i15].c(matrixArr2[i15], path);
            if (aVar != null) {
                y yVar4 = yVarArr[i15];
                Matrix matrix = matrixArr2[i15];
                j jVar = (j) aVar.f28697a;
                BitSet bitSet = jVar.f30348e;
                yVar4.getClass();
                bitSet.set(i15, (boolean) c3);
                x[] xVarArr = jVar.f30346c;
                yVar4.b(yVar4.f30434f);
                xVarArr[i15] = new r(new ArrayList(yVar4.f30436h), new Matrix(matrix));
            }
            int i16 = i15 + 1;
            int i17 = i16 % 4;
            y yVar5 = yVarArr[i15];
            fArr2[0] = yVar5.f30431c;
            fArr2[1] = yVar5.f30432d;
            matrixArr2[i15].mapPoints(fArr2);
            y yVar6 = yVarArr[i17];
            float f13 = yVar6.f30429a;
            float[] fArr3 = this.f30408i;
            fArr3[0] = f13;
            fArr3[1] = yVar6.f30430b;
            matrixArr2[i17].mapPoints(fArr3);
            y[] yVarArr2 = yVarArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            y yVar7 = yVarArr2[i15];
            fArr2[0] = yVar7.f30431c;
            fArr2[1] = yVar7.f30432d;
            matrixArr2[i15].mapPoints(fArr2);
            float fAbs = (i15 == 1 || i15 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            y yVar8 = this.f30406g;
            yVar8.e(0.0f, 0.0f, 270.0f, 0.0f);
            f fVar = i15 != 1 ? i15 != 2 ? i15 != 3 ? oVar.f30397j : oVar.f30396i : oVar.l : oVar.f30398k;
            fVar.u(fMax, fAbs, f11, yVar8);
            Path path4 = this.f30409j;
            path4.reset();
            yVar8.c(matrixArr[i15], path4);
            if (this.l && (fVar.o() || b(path4, i15) || b(path4, i17))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = yVar8.f30429a;
                c8 = 1;
                fArr2[1] = yVar8.f30430b;
                matrixArr[i15].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                yVar8.c(matrixArr[i15], path2);
            } else {
                c8 = 1;
                yVar8.c(matrixArr[i15], path);
            }
            if (aVar != null) {
                Matrix matrix2 = matrixArr[i15];
                j jVar2 = (j) aVar.f28697a;
                c7 = 0;
                jVar2.f30348e.set(i15 + 4, false);
                x[] xVarArr2 = jVar2.f30347d;
                yVar8.b(yVar8.f30434f);
                xVarArr2[i15] = new r(new ArrayList(yVar8.f30436h), new Matrix(matrix2));
            } else {
                c7 = 0;
            }
            i15 = i16;
            c3 = c7;
            yVarArr = yVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i11) {
        Path path2 = this.f30410k;
        path2.reset();
        this.f30400a[i11].c(this.f30401b[i11], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
