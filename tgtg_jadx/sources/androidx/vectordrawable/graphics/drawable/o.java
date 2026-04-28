package androidx.vectordrawable.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f4077p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f4078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f4079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f4080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f4081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f4082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f4083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f4084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f4087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4088k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f4090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q1.e f4091o;

    public o(o oVar) {
        this.f4080c = new Matrix();
        this.f4085h = 0.0f;
        this.f4086i = 0.0f;
        this.f4087j = 0.0f;
        this.f4088k = 0.0f;
        this.l = 255;
        this.f4089m = null;
        this.f4090n = null;
        q1.e eVar = new q1.e(0);
        this.f4091o = eVar;
        this.f4084g = new l(oVar.f4084g, eVar);
        this.f4078a = new Path(oVar.f4078a);
        this.f4079b = new Path(oVar.f4079b);
        this.f4085h = oVar.f4085h;
        this.f4086i = oVar.f4086i;
        this.f4087j = oVar.f4087j;
        this.f4088k = oVar.f4088k;
        this.l = oVar.l;
        this.f4089m = oVar.f4089m;
        String str = oVar.f4089m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f4090n = oVar.f4090n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(l lVar, Matrix matrix, Canvas canvas, int i11, int i12) {
        int i13;
        float f11;
        int i14;
        float f12;
        Matrix matrix2 = lVar.f4063a;
        ArrayList arrayList = lVar.f4064b;
        matrix2.set(matrix);
        Matrix matrix3 = lVar.f4063a;
        matrix3.preConcat(lVar.f4072j);
        canvas.save();
        char c3 = 0;
        int i15 = 0;
        while (i15 < arrayList.size()) {
            m mVar = (m) arrayList.get(i15);
            if (mVar instanceof l) {
                a((l) mVar, matrix3, canvas, i11, i12);
            } else if (mVar instanceof n) {
                n nVar = (n) mVar;
                float f13 = i11 / this.f4087j;
                float f14 = i12 / this.f4088k;
                float fMin = Math.min(f13, f14);
                Matrix matrix4 = this.f4080c;
                matrix4.set(matrix3);
                matrix4.postScale(f13, f14);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c3], fArr[1]);
                boolean z11 = c3;
                i13 = i15;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f15 = (fArr[z11 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f15) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f4078a;
                    path.reset();
                    x6.e[] eVarArr = nVar.f4074a;
                    if (eVarArr != null) {
                        x6.e.b(eVarArr, path);
                    }
                    Path path2 = this.f4079b;
                    path2.reset();
                    if (nVar instanceof j) {
                        path2.setFillType(nVar.f4076c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        k kVar = (k) nVar;
                        float f16 = kVar.f4058i;
                        if (f16 != 0.0f || kVar.f4059j != 1.0f) {
                            float f17 = kVar.f4060k;
                            float f18 = (f16 + f17) % 1.0f;
                            float f19 = (kVar.f4059j + f17) % 1.0f;
                            if (this.f4083f == null) {
                                this.f4083f = new PathMeasure();
                            }
                            this.f4083f.setPath(path, z11);
                            float length = this.f4083f.getLength();
                            float f20 = f18 * length;
                            float f21 = f19 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f4083f;
                            if (f20 > f21) {
                                pathMeasure.getSegment(f20, length, path, true);
                                f11 = 0.0f;
                                this.f4083f.getSegment(0.0f, f21, path, true);
                            } else {
                                f11 = 0.0f;
                                pathMeasure.getSegment(f20, f21, path, true);
                            }
                            path.rLineTo(f11, f11);
                        }
                        path2.addPath(path, matrix4);
                        a3.j jVar = kVar.f4055f;
                        if (((Shader) jVar.f399c) == null && jVar.f398b == 0) {
                            f12 = 255.0f;
                            i14 = 16777215;
                        } else {
                            if (this.f4082e == null) {
                                i14 = 16777215;
                                Paint paint = new Paint(1);
                                this.f4082e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i14 = 16777215;
                            }
                            Paint paint2 = this.f4082e;
                            Shader shader = (Shader) jVar.f399c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(kVar.f4057h * 255.0f));
                                f12 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i16 = jVar.f398b;
                                float f22 = kVar.f4057h;
                                PorterDuff.Mode mode = r.f4104j;
                                f12 = 255.0f;
                                paint2.setColor((i16 & i14) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(kVar.f4076c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        a3.j jVar2 = kVar.f4053d;
                        if (((Shader) jVar2.f399c) != null || jVar2.f398b != 0) {
                            if (this.f4081d == null) {
                                Paint paint3 = new Paint(1);
                                this.f4081d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f4081d;
                            Paint.Join join = kVar.f4061m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = kVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(kVar.f4062n);
                            Shader shader2 = (Shader) jVar2.f399c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(kVar.f4056g * f12));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i17 = jVar2.f398b;
                                float f23 = kVar.f4056g;
                                PorterDuff.Mode mode2 = r.f4104j;
                                paint4.setColor((i17 & i14) | (((int) (Color.alpha(i17) * f23)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(kVar.f4054e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i15 = i13 + 1;
                c3 = 0;
            }
            i13 = i15;
            i15 = i13 + 1;
            c3 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f11) {
        setRootAlpha((int) (f11 * 255.0f));
    }

    public void setRootAlpha(int i11) {
        this.l = i11;
    }

    public o() {
        this.f4080c = new Matrix();
        this.f4085h = 0.0f;
        this.f4086i = 0.0f;
        this.f4087j = 0.0f;
        this.f4088k = 0.0f;
        this.l = 255;
        this.f4089m = null;
        this.f4090n = null;
        this.f4091o = new q1.e(0);
        this.f4084g = new l();
        this.f4078a = new Path();
        this.f4079b = new Path();
    }
}
