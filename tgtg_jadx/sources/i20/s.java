package i20;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f23059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f23060k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f23062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Pair f23063o;

    @Override // i20.q
    public final void a(Canvas canvas, Rect rect, float f11, boolean z11, boolean z12) {
        if (this.f23055f != rect.width()) {
            this.f23055f = rect.width();
            g();
        }
        float fE = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - fE) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        w wVar = (w) this.f23047a;
        if (wVar.f23085q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f12 = this.f23055f / 2.0f;
        float f13 = fE / 2.0f;
        canvas.clipRect(-f12, -f13, f12, f13);
        this.f23056g = wVar.f22953a * f11;
        this.f23057h = Math.min(r0 / 2, wVar.a()) * f11;
        this.f23059j = wVar.l * f11;
        this.f23058i = Math.min(wVar.f22953a / 2.0f, wVar.e()) * f11;
        if (z11 || z12) {
            if ((z11 && wVar.f22959g == 2) || (z12 && wVar.f22960h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z11 || (z12 && wVar.f22960h != 3)) {
                canvas.translate(0.0f, ((1.0f - f11) * wVar.f22953a) / 2.0f);
            }
        }
        if (z12 && wVar.f22960h == 3) {
            this.f23062n = f11;
        } else {
            this.f23062n = 1.0f;
        }
    }

    @Override // i20.q
    public final void b(int i11, int i12, Canvas canvas, Paint paint) {
        int iM = w0.e.m(i11, i12);
        this.f23061m = false;
        w wVar = (w) this.f23047a;
        if (wVar.f23086r <= 0 || iM == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iM);
        Integer num = wVar.f23087s;
        p pVar = new p(new float[]{(this.f23055f / 2.0f) - (num != null ? (wVar.f23086r / 2.0f) + num.floatValue() : this.f23056g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        int i13 = wVar.f23086r;
        j(canvas, paint, pVar, i13, i13, (this.f23057h * i13) / this.f23056g, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // i20.q
    public final void c(Canvas canvas, Paint paint, o oVar, int i11) {
        int iM = w0.e.m(oVar.f23038c, i11);
        this.f23061m = oVar.f23043h;
        float f11 = oVar.f23036a;
        float f12 = oVar.f23037b;
        int i12 = oVar.f23039d;
        i(canvas, paint, f11, f12, iM, i12, i12, oVar.f23040e, oVar.f23041f, true);
    }

    @Override // i20.q
    public final void d(Canvas canvas, Paint paint, float f11, float f12, int i11, int i12, int i13) {
        int iM = w0.e.m(i11, i12);
        this.f23061m = false;
        i(canvas, paint, f11, f12, iM, i13, i13, 0.0f, 0.0f, false);
    }

    @Override // i20.q
    public final int e() {
        e eVar = this.f23047a;
        return (((w) eVar).l * 2) + ((w) eVar).f22953a;
    }

    @Override // i20.q
    public final int f() {
        return -1;
    }

    @Override // i20.q
    public final void g() {
        Path path = this.f23048b;
        path.rewind();
        w wVar = (w) this.f23047a;
        if (wVar.b(this.f23061m)) {
            int i11 = this.f23061m ? wVar.f22962j : wVar.f22963k;
            float f11 = this.f23055f;
            int i12 = (int) (f11 / i11);
            this.f23060k = f11 / i12;
            for (int i13 = 0; i13 <= i12; i13++) {
                int i14 = i13 * 2;
                float f12 = i14 + 1;
                path.cubicTo(i14 + 0.48f, 0.0f, f12 - 0.48f, 1.0f, f12, 1.0f);
                float f13 = f12 + 0.48f;
                float f14 = i14 + 2;
                path.cubicTo(f13, 1.0f, f14 - 0.48f, 0.0f, f14, 0.0f);
            }
            Matrix matrix = this.f23051e;
            matrix.reset();
            matrix.setScale(this.f23060k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f23055f, 0.0f);
        }
        this.f23050d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f11, float f12, int i11, int i12, int i13, float f13, float f14, boolean z11) {
        float fJ;
        float fJ2;
        w wVar;
        float f15;
        Canvas canvas2;
        Pair pair = this.f23063o;
        float fN = xz.b.n(f11, 0.0f, 1.0f);
        float fN2 = xz.b.n(f12, 0.0f, 1.0f);
        float fJ3 = u00.d.J(1.0f - this.f23062n, 1.0f, fN);
        float fJ4 = u00.d.J(1.0f - this.f23062n, 1.0f, fN2);
        int iN = (int) ((xz.b.n(fJ3, 0.0f, 0.01f) * i12) / 0.01f);
        int iN2 = (int) (((1.0f - xz.b.n(fJ4, 0.99f, 1.0f)) * i13) / 0.01f);
        float f16 = this.f23055f;
        int i14 = (int) ((fJ3 * f16) + iN);
        int i15 = (int) ((fJ4 * f16) - iN2);
        float f17 = this.f23057h;
        float f18 = this.f23058i;
        if (f17 != f18) {
            float fMax = Math.max(f17, f18);
            float f19 = this.f23055f;
            float f20 = fMax / f19;
            fJ = u00.d.J(this.f23057h, this.f23058i, xz.b.n(i14 / f19, 0.0f, f20) / f20);
            float f21 = this.f23057h;
            float f22 = this.f23058i;
            float f23 = this.f23055f;
            fJ2 = u00.d.J(f21, f22, xz.b.n((f23 - i15) / f23, 0.0f, f20) / f20);
        } else {
            fJ = f17;
            fJ2 = fJ;
        }
        float f24 = (-this.f23055f) / 2.0f;
        w wVar2 = (w) this.f23047a;
        boolean z12 = wVar2.b(this.f23061m) && z11 && f13 > 0.0f;
        if (i14 <= i15) {
            float f25 = i14 + fJ;
            float f26 = i15 - fJ2;
            float f27 = fJ * 2.0f;
            float f28 = fJ2 * 2.0f;
            paint.setColor(i11);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f23056g);
            ((p) pair.first).b();
            ((p) pair.second).b();
            ((p) pair.first).e(f25 + f24);
            ((p) pair.second).e(f26 + f24);
            if (i14 == 0 && f26 + fJ2 < f25 + fJ) {
                p pVar = (p) pair.first;
                float f29 = this.f23056g;
                j(canvas, paint, pVar, f27, f29, fJ, (p) pair.second, f28, f29, fJ2, true);
                return;
            }
            if (f25 - fJ > f26 - fJ2) {
                p pVar2 = (p) pair.second;
                float f31 = this.f23056g;
                j(canvas, paint, pVar2, f28, f31, fJ2, (p) pair.first, f27, f31, fJ, false);
                return;
            }
            float f32 = fJ2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(wVar2.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z12) {
                float f33 = this.f23055f;
                float f34 = f25 / f33;
                float f35 = f26 / f33;
                wVar = wVar2;
                int i16 = this.f23061m ? wVar.f22962j : wVar.f22963k;
                if (i16 != this.l) {
                    this.l = i16;
                    g();
                }
                Path path = this.f23049c;
                path.rewind();
                float f36 = (-this.f23055f) / 2.0f;
                boolean zB = wVar.b(this.f23061m);
                if (zB) {
                    float f37 = this.f23055f;
                    f15 = 1.0f;
                    float f38 = this.f23060k;
                    float f39 = f37 / f38;
                    float f40 = f14 / f39;
                    float f41 = f39 / (f39 + 1.0f);
                    f34 = (f34 + f40) * f41;
                    f35 = (f35 + f40) * f41;
                    f36 -= f38 * f14;
                } else {
                    f15 = 1.0f;
                }
                PathMeasure pathMeasure = this.f23050d;
                float length = pathMeasure.getLength() * f34;
                float length2 = pathMeasure.getLength() * f35;
                pathMeasure.getSegment(length, length2, path, true);
                p pVar3 = (p) pair.first;
                pVar3.b();
                pathMeasure.getPosTan(length, pVar3.f23044a, pVar3.f23045b);
                p pVar4 = (p) pair.second;
                pVar4.b();
                pathMeasure.getPosTan(length2, pVar4.f23044a, pVar4.f23045b);
                Matrix matrix = this.f23051e;
                matrix.reset();
                matrix.setTranslate(f36, 0.0f);
                pVar3.e(f36);
                pVar4.e(f36);
                if (zB) {
                    float f42 = this.f23059j * f13;
                    matrix.postScale(f15, f42);
                    pVar3.d(f42);
                    pVar4.d(f42);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((p) pair.first).f23044a;
                float f43 = fArr[0];
                float f44 = fArr[1];
                float[] fArr2 = ((p) pair.second).f23044a;
                canvas.drawLine(f43, f44, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                wVar = wVar2;
            }
            if (wVar.c()) {
                return;
            }
            if (f25 > 0.0f && fJ > 0.0f) {
                j(canvas2, paint, (p) pair.first, f27, this.f23056g, fJ, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f26 >= this.f23055f || f32 <= 0.0f) {
                return;
            }
            j(canvas, paint, (p) pair.second, f28, this.f23056g, f32, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    public final void j(Canvas canvas, Paint paint, p pVar, float f11, float f12, float f13, p pVar2, float f14, float f15, float f16, boolean z11) {
        float f17;
        float fMin = Math.min(f12, this.f23056g);
        float f18 = (-f11) / 2.0f;
        float f19 = (-fMin) / 2.0f;
        float f20 = f11 / 2.0f;
        float f21 = fMin / 2.0f;
        RectF rectF = new RectF(f18, f19, f20, f21);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pVar2 != null) {
            float[] fArr = pVar2.f23045b;
            float[] fArr2 = pVar2.f23044a;
            float fMin2 = Math.min(f15, this.f23056g);
            float fMin3 = Math.min(f14 / 2.0f, (f16 * fMin2) / this.f23056g);
            RectF rectF2 = new RectF();
            if (z11) {
                float f22 = (fArr2[0] - fMin3) - (pVar.f23044a[0] - f13);
                if (f22 > 0.0f) {
                    pVar2.e((-f22) / 2.0f);
                    f17 = f14 + f22;
                } else {
                    f17 = f14;
                }
                rectF2.set(0.0f, f19, f20, f21);
            } else {
                float f23 = (fArr2[0] + fMin3) - (pVar.f23044a[0] + f13);
                if (f23 < 0.0f) {
                    pVar2.e((-f23) / 2.0f);
                    f17 = f14 - f23;
                } else {
                    f17 = f14;
                }
                rectF2.set(f18, f19, 0.0f, f21);
            }
            RectF rectF3 = new RectF((-f17) / 2.0f, (-fMin2) / 2.0f, f17 / 2.0f, fMin2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(q.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-q.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = pVar.f23044a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(q.h(pVar.f23045b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f13, f13, paint);
        } else {
            float[] fArr4 = pVar.f23044a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(q.h(pVar.f23045b));
            canvas.drawRoundRect(rectF, f13, f13, paint);
        }
        canvas.restore();
    }
}
