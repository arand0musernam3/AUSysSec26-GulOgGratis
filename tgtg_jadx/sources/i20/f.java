package i20;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f22968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f22971k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f22972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f22974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RectF f22975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Pair f22976q;

    public f(k kVar) {
        super(kVar);
        this.f22975p = new RectF();
        this.f22976q = new Pair(new p(), new p());
    }

    @Override // i20.q
    public final void a(Canvas canvas, Rect rect, float f11, boolean z11, boolean z12) {
        float fWidth = rect.width() / k();
        float fHeight = rect.height() / k();
        k kVar = (k) this.f23047a;
        float f12 = (kVar.f23006p / 2.0f) + kVar.f23007q;
        canvas.translate((f12 * fWidth) + rect.left, (f12 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (kVar.f23008r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f13 = -f12;
        canvas.clipRect(f13, f13, f12, f12);
        this.f22966f = kVar.f22953a * f11;
        this.f22967g = Math.min(r9 / 2, kVar.a()) * f11;
        this.f22968h = kVar.l * f11;
        int i11 = kVar.f23006p;
        int i12 = kVar.f22953a;
        float f14 = (i11 - i12) / 2.0f;
        this.f22969i = f14;
        if (z11 || z12) {
            float f15 = ((1.0f - f11) * i12) / 2.0f;
            if ((z11 && kVar.f22959g == 2) || (z12 && kVar.f22960h == 1)) {
                this.f22969i = f14 + f15;
            } else if ((z11 && kVar.f22959g == 1) || (z12 && kVar.f22960h == 2)) {
                this.f22969i = f14 - f15;
            }
        }
        if (z12 && kVar.f22960h == 3) {
            this.f22974o = f11;
        } else {
            this.f22974o = 1.0f;
        }
    }

    @Override // i20.q
    public final void c(Canvas canvas, Paint paint, o oVar, int i11) {
        int iM = w0.e.m(oVar.f23038c, i11);
        canvas.save();
        canvas.rotate(oVar.f23042g);
        this.f22973n = oVar.f23043h;
        float f11 = oVar.f23036a;
        float f12 = oVar.f23037b;
        int i12 = oVar.f23039d;
        i(canvas, paint, f11, f12, iM, i12, i12, oVar.f23040e, oVar.f23041f, true);
        canvas.restore();
    }

    @Override // i20.q
    public final void d(Canvas canvas, Paint paint, float f11, float f12, int i11, int i12, int i13) {
        int iM = w0.e.m(i11, i12);
        this.f22973n = false;
        i(canvas, paint, f11, f12, iM, i13, i13, 0.0f, 0.0f, false);
    }

    @Override // i20.q
    public final int e() {
        return k();
    }

    @Override // i20.q
    public final int f() {
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i20.q
    public final void g() {
        int i11;
        Path path = this.f23048b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = 2;
            if (i13 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i13++;
        }
        Matrix matrix = this.f23051e;
        matrix.reset();
        float f11 = this.f22969i;
        matrix.setScale(f11, f11);
        path.transform(matrix);
        boolean zB = ((k) this.f23047a).b(this.f22973n);
        PathMeasure pathMeasure = this.f23050d;
        if (zB) {
            pathMeasure.setPath(path, false);
            float f12 = this.f22971k;
            path.rewind();
            float length = pathMeasure.getLength();
            float f13 = 2.0f;
            int iMax = Math.max(3, (int) ((length / (this.f22973n ? r2.f22962j : r2.f22963k)) / 2.0f)) * 2;
            this.f22970j = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < iMax; i14++) {
                p pVar = new p();
                float f14 = i14;
                pathMeasure.getPosTan(this.f22970j * f14, pVar.f23044a, pVar.f23045b);
                p pVar2 = new p();
                float f15 = this.f22970j;
                pathMeasure.getPosTan((f15 / 2.0f) + (f14 * f15), pVar2.f23044a, pVar2.f23045b);
                arrayList.add(pVar);
                pVar2.a(f12 * 2.0f);
                arrayList.add(pVar2);
            }
            arrayList.add((p) arrayList.get(0));
            p pVar3 = (p) arrayList.get(0);
            float[] fArr = pVar3.f23044a;
            char c3 = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i15 = 1;
            while (i15 < arrayList.size()) {
                p pVar4 = (p) arrayList.get(i15);
                float f16 = (this.f22970j / f13) * 0.48f;
                float[] fArr2 = pVar3.f23044a;
                float[] fArr3 = new float[i11];
                System.arraycopy(fArr2, i12, fArr3, i12, i11);
                System.arraycopy(pVar3.f23045b, i12, new float[i11], i12, i11);
                new Matrix();
                float[] fArr4 = pVar4.f23044a;
                float[] fArr5 = new float[i11];
                System.arraycopy(fArr4, i12, fArr5, i12, i11);
                System.arraycopy(pVar4.f23045b, i12, new float[i11], i12, i11);
                new Matrix();
                char c7 = c3;
                float fAtan2 = (float) Math.atan2(r6[c3], r6[i12]);
                double d3 = fArr3[i12];
                double d11 = f16;
                int i16 = i12;
                double d12 = fAtan2;
                fArr3[i16] = (float) ((Math.cos(d12) * d11) + d3);
                fArr3[c7] = (float) ((Math.sin(d12) * d11) + ((double) fArr3[c7]));
                double d13 = -f16;
                double dAtan2 = (float) Math.atan2(r11[c7], r11[i16]);
                fArr5[i16] = (float) ((Math.cos(dAtan2) * d13) + ((double) fArr5[i16]));
                float fSin = (float) ((Math.sin(dAtan2) * d13) + ((double) fArr5[c7]));
                fArr5[c7] = fSin;
                float f17 = fArr3[i16];
                float f18 = fArr3[c7];
                float f19 = fArr5[i16];
                float[] fArr6 = pVar4.f23044a;
                path.cubicTo(f17, f18, f19, fSin, fArr6[i16], fArr6[c7]);
                i15++;
                pVar3 = pVar4;
                c3 = c7;
                i12 = i16;
                pathMeasure = pathMeasure;
                i11 = 2;
                f13 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i12);
    }

    public final void i(Canvas canvas, Paint paint, float f11, float f12, int i11, int i12, int i13, float f13, float f14, boolean z11) {
        float f15;
        float f16;
        Canvas canvas2;
        float f17 = f12 >= f11 ? f12 - f11 : (f12 + 1.0f) - f11;
        float f18 = f11 % 1.0f;
        if (f18 < 0.0f) {
            f18 += 1.0f;
        }
        if (this.f22974o < 1.0f) {
            float f19 = f18 + f17;
            if (f19 > 1.0f) {
                i(canvas, paint, f18, 1.0f, i11, i12, 0, f13, f14, z11);
                i(canvas, paint, 1.0f, f19, i11, 0, i13, f13, f14, z11);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f22967g / this.f22969i);
        float f20 = f17 - 0.99f;
        if (f20 >= 0.0f) {
            float f21 = ((f20 * degrees) / 180.0f) / 0.01f;
            f17 += f21;
            if (!z11) {
                f18 -= f21 / 2.0f;
            }
        }
        float fJ = u00.d.J(1.0f - this.f22974o, 1.0f, f18);
        float fJ2 = u00.d.J(0.0f, this.f22974o, f17);
        float degrees2 = (float) Math.toDegrees(i12 / this.f22969i);
        float degrees3 = ((fJ2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i13 / this.f22969i));
        float f22 = (fJ * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        k kVar = (k) this.f23047a;
        boolean z12 = kVar.b(this.f22973n) && z11 && f13 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i11);
        paint.setStrokeWidth(this.f22966f);
        float f23 = this.f22967g * 2.0f;
        float f24 = degrees * 2.0f;
        PathMeasure pathMeasure = this.f23050d;
        if (degrees3 < f24) {
            float f25 = degrees3 / f24;
            float f26 = (degrees * f25) + f22;
            p pVar = new p();
            if (z12) {
                float length = (pathMeasure.getLength() * (f26 / 360.0f)) / 2.0f;
                float f27 = this.f22968h * f13;
                float f28 = this.f22969i;
                if (f28 != this.f22972m || f27 != this.f22971k) {
                    this.f22971k = f27;
                    this.f22972m = f28;
                    g();
                }
                pathMeasure.getPosTan(length, pVar.f23044a, pVar.f23045b);
            } else {
                pVar.c(f26 + 90.0f);
                pVar.a(-this.f22969i);
            }
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, pVar, f23, this.f22966f, f25);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(kVar.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f29 = f22 + degrees;
        float f31 = degrees3 - f24;
        Pair pair = this.f22976q;
        ((p) pair.first).b();
        ((p) pair.second).b();
        if (z12) {
            float f32 = f29 / 360.0f;
            float f33 = f31 / 360.0f;
            float f34 = this.f22968h * f13;
            int i14 = this.f22973n ? kVar.f22962j : kVar.f22963k;
            float f35 = this.f22969i;
            if (f35 != this.f22972m || f34 != this.f22971k || i14 != this.l) {
                this.f22971k = f34;
                this.l = i14;
                this.f22972m = f35;
                g();
            }
            Path path = this.f23049c;
            path.rewind();
            float fN = xz.b.n(f33, 0.0f, 1.0f);
            if (kVar.b(this.f22973n)) {
                f15 = 1.0f;
                float f36 = f14 / ((float) ((((double) this.f22969i) * 6.283185307179586d) / ((double) this.f22970j)));
                f32 += f36;
                f16 = 0.0f - (f36 * 360.0f);
            } else {
                f15 = 1.0f;
                f16 = 0.0f;
            }
            float f37 = f32 % f15;
            float length2 = (pathMeasure.getLength() * f37) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f37 + fN)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            p pVar2 = (p) pair.first;
            pVar2.b();
            pathMeasure.getPosTan(length2, pVar2.f23044a, pVar2.f23045b);
            p pVar3 = (p) pair.second;
            pVar3.b();
            pathMeasure.getPosTan(length3, pVar3.f23044a, pVar3.f23045b);
            Matrix matrix = this.f23051e;
            matrix.reset();
            matrix.setRotate(f16);
            pVar2.c(f16);
            pVar3.c(f16);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((p) pair.first).c(f29 + 90.0f);
            ((p) pair.first).a(-this.f22969i);
            ((p) pair.second).c(f29 + f31 + 90.0f);
            ((p) pair.second).a(-this.f22969i);
            float f38 = this.f22969i;
            float f39 = -f38;
            RectF rectF = this.f22975p;
            rectF.set(f39, f39, f38, f38);
            canvas.drawArc(rectF, f29, f31, false, paint);
            canvas2 = canvas;
        }
        if (kVar.c() || this.f22967g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        j(canvas2, paint, (p) pair.first, f23, this.f22966f, 1.0f);
        j(canvas, paint, (p) pair.second, f23, this.f22966f, 1.0f);
    }

    public final void j(Canvas canvas, Paint paint, p pVar, float f11, float f12, float f13) {
        float fMin = Math.min(f12, this.f22966f);
        float f14 = f11 / 2.0f;
        float fMin2 = Math.min(f14, (this.f22967g * fMin) / this.f22966f);
        RectF rectF = new RectF((-f11) / 2.0f, (-fMin) / 2.0f, f14, fMin / 2.0f);
        canvas.save();
        float[] fArr = pVar.f23044a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(q.h(pVar.f23045b));
        canvas.scale(f13, f13);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final int k() {
        e eVar = this.f23047a;
        return (((k) eVar).f23007q * 2) + ((k) eVar).f23006p;
    }

    @Override // i20.q
    public final void b(int i11, int i12, Canvas canvas, Paint paint) {
    }
}
