package ve;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f42241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f42242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f42243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f42245e = null;

    public a(a aVar) {
        this.f42241a = 0.0f;
        this.f42242b = 0.0f;
        this.f42243c = 0.0f;
        this.f42244d = 0;
        this.f42241a = aVar.f42241a;
        this.f42242b = aVar.f42242b;
        this.f42243c = aVar.f42243c;
        this.f42244d = aVar.f42244d;
    }

    public final void a(int i11, ie.a aVar) {
        int iAlpha = Color.alpha(this.f42244d);
        int iC = g.c(i11);
        Matrix matrix = k.f42293a;
        int i12 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i12 <= 0) {
            aVar.clearShadowLayer();
        } else {
            aVar.setShadowLayer(Math.max(this.f42241a, Float.MIN_VALUE), this.f42242b, this.f42243c, Color.argb(i12, Color.red(this.f42244d), Color.green(this.f42244d), Color.blue(this.f42244d)));
        }
    }

    public final void b(int i11) {
        this.f42244d = Color.argb(Math.round((g.c(i11) * Color.alpha(this.f42244d)) / 255.0f), Color.red(this.f42244d), Color.green(this.f42244d), Color.blue(this.f42244d));
    }

    public final void c(Matrix matrix) {
        if (this.f42245e == null) {
            this.f42245e = new float[2];
        }
        float[] fArr = this.f42245e;
        fArr[0] = this.f42242b;
        fArr[1] = this.f42243c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f42245e;
        this.f42242b = fArr2[0];
        this.f42243c = fArr2[1];
        this.f42241a = matrix.mapRadius(this.f42241a);
    }
}
