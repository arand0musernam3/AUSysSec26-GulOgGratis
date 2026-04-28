package p6;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f34511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f34512g;

    @Override // p6.l
    public final void b(float f11, int i11) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // p6.l
    public final void c(View view, float f11) {
        this.f34514a.w(f11, this.f34512g);
        u.O((androidx.constraintlayout.widget.b) this.f34511f.valueAt(0), view, this.f34512g);
    }

    @Override // p6.l
    public final void d(int i11) {
        SparseArray sparseArray = this.f34511f;
        int size = sparseArray.size();
        int iC = ((androidx.constraintlayout.widget.b) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.f34512g = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
        for (int i12 = 0; i12 < size; i12++) {
            int iKeyAt = sparseArray.keyAt(i12);
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) sparseArray.valueAt(i12);
            dArr[i12] = ((double) iKeyAt) * 0.01d;
            bVar.b(this.f34512g);
            int i13 = 0;
            while (true) {
                if (i13 < this.f34512g.length) {
                    dArr2[i12][i13] = r7[i13];
                    i13++;
                }
            }
        }
        this.f34514a = xz.b.t(i11, dArr, dArr2);
    }
}
