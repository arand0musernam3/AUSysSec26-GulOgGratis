package c5;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f7317b;

    public p1(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f7316a = new int[size];
        this.f7317b = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            this.f7316a[i11] = ((Integer) arrayList.get(i11)).intValue();
            this.f7317b[i11] = ((Float) arrayList2.get(i11)).floatValue();
        }
    }

    @Override // c5.o1
    public void a(View view, float[] fArr) {
        i4.l0.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z11 = parent instanceof View;
        float[] fArr2 = this.f7317b;
        if (z11) {
            b((View) parent, fArr);
            s sVar = p0.f7315a;
            i4.l0.d(fArr2);
            i4.l0.h(fArr2, -view.getScrollX(), -view.getScrollY());
            p0.c(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            i4.l0.d(fArr2);
            i4.l0.h(fArr2, left, top);
            p0.c(fArr, fArr2);
        } else {
            int[] iArr = this.f7316a;
            view.getLocationInWindow(iArr);
            s sVar2 = p0.f7315a;
            i4.l0.d(fArr2);
            i4.l0.h(fArr2, -view.getScrollX(), -view.getScrollY());
            p0.c(fArr, fArr2);
            float f11 = iArr[0];
            float f12 = iArr[1];
            i4.l0.d(fArr2);
            i4.l0.h(fArr2, f11, f12);
            p0.c(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        i4.g0.w(matrix, fArr2);
        p0.c(fArr, fArr2);
    }

    public p1(int i11, int i12) {
        this.f7316a = new int[]{i11, i12};
        this.f7317b = new float[]{0.0f, 1.0f};
    }

    public p1(int i11, int i12, int i13) {
        this.f7316a = new int[]{i11, i12, i13};
        this.f7317b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public p1(float[] fArr) {
        this.f7317b = fArr;
        this.f7316a = new int[2];
    }
}
