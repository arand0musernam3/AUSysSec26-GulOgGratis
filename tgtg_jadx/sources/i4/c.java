package i4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f23230a = d.f23233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f23231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f23232c;

    @Override // i4.t
    public final void b(float f11, float f12) {
        this.f23230a.scale(f11, f12);
    }

    @Override // i4.t
    public final void c(h hVar) {
        Canvas canvas = this.f23230a;
        if (hVar instanceof h) {
            canvas.clipPath(hVar.f23258a, Region.Op.INTERSECT);
        } else {
            h2.a("Unable to obtain android.graphics.Path");
        }
    }

    @Override // i4.t
    public final void d(float f11) {
        this.f23230a.rotate(f11);
    }

    @Override // i4.t
    public final void e() {
        this.f23230a.save();
    }

    @Override // i4.t
    public final void f() {
        g0.n(this.f23230a, false);
    }

    @Override // i4.t
    public final void g(f fVar, long j9, long j11, long j12, i0.w wVar) {
        if (this.f23231b == null) {
            this.f23231b = new Rect();
            this.f23232c = new Rect();
        }
        Canvas canvas = this.f23230a;
        Bitmap bitmapJ = g0.j(fVar);
        Rect rect = this.f23231b;
        rect.getClass();
        int i11 = (int) (j9 >> 32);
        rect.left = i11;
        int i12 = (int) (j9 & 4294967295L);
        rect.top = i12;
        rect.right = i11 + ((int) (j11 >> 32));
        rect.bottom = i12 + ((int) (j11 & 4294967295L));
        Rect rect2 = this.f23232c;
        rect2.getClass();
        int i13 = (int) 0;
        rect2.left = i13;
        int i14 = (int) 0;
        rect2.top = i14;
        rect2.right = i13 + ((int) (j12 >> 32));
        rect2.bottom = i14 + ((int) (4294967295L & j12));
        canvas.drawBitmap(bitmapJ, rect, rect2, (Paint) wVar.f22746c);
    }

    @Override // i4.t
    public final void h(float[] fArr) {
        if (g0.s(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        g0.v(matrix, fArr);
        this.f23230a.concat(matrix);
    }

    @Override // i4.t
    public final void i(float f11, float f12, float f13, float f14, float f15, float f16, i0.w wVar) {
        this.f23230a.drawArc(f11, f12, f13, f14, f15, f16, false, (Paint) wVar.f22746c);
    }

    @Override // i4.t
    public final void j(float f11, float f12, float f13, float f14, float f15, float f16, i0.w wVar) {
        this.f23230a.drawRoundRect(f11, f12, f13, f14, f15, f16, (Paint) wVar.f22746c);
    }

    @Override // i4.t
    public final void k(long j9, long j11, i0.w wVar) {
        this.f23230a.drawLine(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), (Paint) wVar.f22746c);
    }

    @Override // i4.t
    public final void l(h hVar, i0.w wVar) {
        Canvas canvas = this.f23230a;
        if (hVar instanceof h) {
            canvas.drawPath(hVar.f23258a, (Paint) wVar.f22746c);
        } else {
            h2.a("Unable to obtain android.graphics.Path");
        }
    }

    @Override // i4.t
    public final void m(float f11, float f12, float f13, float f14, int i11) {
        this.f23230a.clipRect(f11, f12, f13, f14, i11 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // i4.t
    public final void n(float f11, float f12) {
        this.f23230a.translate(f11, f12);
    }

    @Override // i4.t
    public final void o() {
        this.f23230a.restore();
    }

    @Override // i4.t
    public final void p(f fVar, long j9, i0.w wVar) {
        this.f23230a.drawBitmap(g0.j(fVar), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), (Paint) wVar.f22746c);
    }

    @Override // i4.t
    public final void q(float f11, long j9, i0.w wVar) {
        this.f23230a.drawCircle(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), f11, (Paint) wVar.f22746c);
    }

    @Override // i4.t
    public final void r(float f11, float f12, float f13, float f14, i0.w wVar) {
        this.f23230a.drawRect(f11, f12, f13, f14, (Paint) wVar.f22746c);
    }

    @Override // i4.t
    public final void s() {
        g0.n(this.f23230a, true);
    }

    @Override // i4.t
    public final void t(h4.c cVar, i0.w wVar) {
        this.f23230a.saveLayer(cVar.f21380a, cVar.f21381b, cVar.f21382c, cVar.f21383d, (Paint) wVar.f22746c, 31);
    }
}
