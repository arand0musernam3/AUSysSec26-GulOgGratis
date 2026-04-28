package q6;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f36310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f36311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f36312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f36313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f36314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f36315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f36316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f36317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f36318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f36319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36320k;
    public final Rect l = new Rect();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f36321m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f36322n;

    public u(MotionLayout motionLayout) {
        this.f36322n = motionLayout;
        Paint paint = new Paint();
        this.f36314e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f36315f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f36316g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f36317h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f36319j = new float[8];
        Paint paint5 = new Paint();
        this.f36318i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f36312c = new float[100];
        this.f36311b = new int[50];
    }

    public final void a(Canvas canvas, int i11, int i12, p pVar) {
        Canvas canvas2;
        int width;
        int height;
        boolean z11;
        float f11;
        Paint paint = this.f36316g;
        int[] iArr = this.f36311b;
        boolean z12 = false;
        int i13 = 4;
        if (i11 == 4) {
            int i14 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i14 < this.f36320k) {
                int i15 = iArr[i14];
                boolean z15 = z13;
                if (i15 == 1) {
                    z15 = true;
                }
                if (i15 == 0) {
                    z14 = true;
                }
                i14++;
                z13 = z15;
                z14 = z14;
            }
            if (z13) {
                float[] fArr = this.f36310a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z14) {
                b(canvas);
            }
        }
        if (i11 == 2) {
            float[] fArr2 = this.f36310a;
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            float f14 = fArr2[fArr2.length - 2];
            float f15 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f12, f13, f14, f15, paint);
        } else {
            canvas2 = canvas;
        }
        if (i11 == 3) {
            b(canvas);
        }
        canvas2.drawLines(this.f36310a, this.f36314e);
        View view = pVar.f36277b;
        if (view != null) {
            width = view.getWidth();
            height = pVar.f36277b.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i16 = 1;
        while (i16 < i12 - 1) {
            if (i11 == i13 && iArr[i16 - 1] == 0) {
                z11 = z12;
            } else {
                int i17 = i16 * 2;
                float[] fArr3 = this.f36312c;
                float f16 = fArr3[i17];
                float f17 = fArr3[i17 + 1];
                this.f36313d.reset();
                z11 = z12;
                this.f36313d.moveTo(f16, f17 + 10.0f);
                this.f36313d.lineTo(f16 + 10.0f, f17);
                this.f36313d.lineTo(f16, f17 - 10.0f);
                this.f36313d.lineTo(f16 - 10.0f, f17);
                this.f36313d.close();
                int i18 = i16 - 1;
                Paint paint2 = this.f36318i;
                if (i11 == i13) {
                    int i19 = iArr[i18];
                    if (i19 == 1) {
                        d(canvas2, f16 - 0.0f, f17 - 0.0f);
                    } else if (i19 == 0) {
                        c(canvas2, f16 - 0.0f, f17 - 0.0f);
                    } else {
                        if (i19 == 2) {
                            f11 = f17;
                            e(canvas2, f16 - 0.0f, f11 - 0.0f, width, height);
                        }
                        canvas2.drawPath(this.f36313d, paint2);
                    }
                    f11 = f17;
                    canvas2.drawPath(this.f36313d, paint2);
                } else {
                    f11 = f17;
                }
                if (i11 == 2) {
                    d(canvas2, f16 - 0.0f, f11 - 0.0f);
                }
                if (i11 == 3) {
                    c(canvas2, f16 - 0.0f, f11 - 0.0f);
                }
                if (i11 == 6) {
                    e(canvas2, f16 - 0.0f, f11 - 0.0f, width, height);
                }
                canvas2.drawPath(this.f36313d, paint2);
            }
            i16++;
            z12 = z11;
            i13 = 4;
        }
        boolean z16 = z12;
        float[] fArr4 = this.f36310a;
        if (fArr4.length > 1) {
            float f18 = fArr4[z16 ? 1 : 0];
            float f19 = fArr4[1];
            Paint paint3 = this.f36315f;
            canvas2.drawCircle(f18, f19, 8.0f, paint3);
            float[] fArr5 = this.f36310a;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    public final void b(Canvas canvas) {
        float[] fArr = this.f36310a;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[fArr.length - 2];
        float f14 = fArr[fArr.length - 1];
        float fMin = Math.min(f11, f13);
        float fMax = Math.max(f12, f14);
        float fMax2 = Math.max(f11, f13);
        float fMax3 = Math.max(f12, f14);
        Paint paint = this.f36316g;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f11, f13), Math.min(f12, f14), Math.min(f11, f13), Math.max(f12, f14), paint);
    }

    public final void c(Canvas canvas, float f11, float f12) {
        float[] fArr = this.f36310a;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[fArr.length - 2];
        float f16 = fArr[fArr.length - 1];
        float fMin = Math.min(f13, f15);
        float fMax = Math.max(f14, f16);
        float fMin2 = f11 - Math.min(f13, f15);
        float fMax2 = Math.max(f14, f16) - f12;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f36317h;
        Rect rect = this.l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f12 - 20.0f, paint);
        float fMin3 = Math.min(f13, f15);
        Paint paint2 = this.f36316g;
        canvas.drawLine(f11, f12, fMin3, f12, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f16 - f14))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f11 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f11, f12, f11, Math.max(f14, f16), paint2);
    }

    public final void d(Canvas canvas, float f11, float f12) {
        float[] fArr = this.f36310a;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[fArr.length - 2];
        float f16 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f13 - f15, f14 - f16);
        float f17 = f15 - f13;
        float f18 = f16 - f14;
        float f19 = (((f12 - f14) * f18) + ((f11 - f13) * f17)) / (fHypot * fHypot);
        float f20 = (f17 * f19) + f13;
        float f21 = (f19 * f18) + f14;
        Path path = new Path();
        path.moveTo(f11, f12);
        path.lineTo(f20, f21);
        float fHypot2 = (float) Math.hypot(f20 - f11, f21 - f12);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f36317h;
        paint.getTextBounds(str, 0, length, this.l);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (r6.width() / 2), -20.0f, paint);
        canvas.drawLine(f11, f12, f20, f21, this.f36316g);
    }

    public final void e(Canvas canvas, float f11, float f12, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder("");
        MotionLayout motionLayout = this.f36322n;
        sb2.append(((int) (((double) (((f11 - (i11 / 2)) * 100.0f) / (motionLayout.getWidth() - i11))) + 0.5d)) / 100.0f);
        String string = sb2.toString();
        int length = string.length();
        Paint paint = this.f36317h;
        Rect rect = this.l;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f11 / 2.0f) - (rect.width() / 2)) + 0.0f, f12 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f36316g;
        canvas.drawLine(f11, f12, fMin, f12, paint2);
        String str = "" + (((int) (((double) (((f12 - (i12 / 2)) * 100.0f) / (motionLayout.getHeight() - i12))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f11 + 5.0f, 0.0f - ((f12 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f11, f12, f11, Math.max(0.0f, 1.0f), paint2);
    }
}
