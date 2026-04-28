package p6;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f34520k;
    public SparseArray l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SparseArray f34521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f34522n;

    @Override // p6.q
    public final void c(float f11, float f12, float f13, int i11, int i12) {
        throw new RuntimeException("Wrong call for custom attribute");
    }

    @Override // p6.q
    public final boolean d(float f11, long j9, View view, i6.e eVar) {
        this.f34524a.w(f11, this.f34522n);
        float[] fArr = this.f34522n;
        float f12 = fArr[fArr.length - 2];
        float f13 = fArr[fArr.length - 1];
        long j11 = j9 - this.f34532i;
        if (Float.isNaN(this.f34533j)) {
            float fC = eVar.c(view, this.f34520k);
            this.f34533j = fC;
            if (Float.isNaN(fC)) {
                this.f34533j = 0.0f;
            }
        }
        float f14 = (float) ((((j11 * 1.0E-9d) * ((double) f12)) + ((double) this.f34533j)) % 1.0d);
        this.f34533j = f14;
        this.f34532i = j9;
        float fA = a(f14);
        this.f34531h = false;
        int i11 = 0;
        while (true) {
            float[] fArr2 = this.f34530g;
            if (i11 >= fArr2.length) {
                break;
            }
            boolean z11 = this.f34531h;
            float f15 = this.f34522n[i11];
            this.f34531h = z11 | (((double) f15) != 0.0d);
            fArr2[i11] = (f15 * fA) + f13;
            i11++;
        }
        u.O((androidx.constraintlayout.widget.b) this.l.valueAt(0), view, this.f34530g);
        if (f12 != 0.0f) {
            this.f34531h = true;
        }
        return this.f34531h;
    }

    @Override // p6.q
    public final void e(int i11) {
        SparseArray sparseArray = this.l;
        int size = sparseArray.size();
        int iC = ((androidx.constraintlayout.widget.b) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        int i12 = iC + 2;
        this.f34522n = new float[i12];
        this.f34530g = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i12);
        for (int i13 = 0; i13 < size; i13++) {
            int iKeyAt = sparseArray.keyAt(i13);
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) sparseArray.valueAt(i13);
            float[] fArr = (float[]) this.f34521m.valueAt(i13);
            dArr[i13] = ((double) iKeyAt) * 0.01d;
            bVar.b(this.f34522n);
            int i14 = 0;
            while (true) {
                if (i14 < this.f34522n.length) {
                    dArr2[i13][i14] = r10[i14];
                    i14++;
                }
            }
            double[] dArr3 = dArr2[i13];
            dArr3[iC] = fArr[0];
            dArr3[iC + 1] = fArr[1];
        }
        this.f34524a = xz.b.t(i11, dArr, dArr2);
    }
}
