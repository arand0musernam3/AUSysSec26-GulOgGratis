package c5;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f7315a = s.f7366g;

    public static final boolean a(View view, View view2) {
        if (Intrinsics.areEqual(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final float b(float[] fArr, int i11, float[] fArr2, int i12) {
        int i13 = i11 * 4;
        return (fArr[i13 + 3] * fArr2[12 + i12]) + (fArr[i13 + 2] * fArr2[8 + i12]) + (fArr[i13 + 1] * fArr2[4 + i12]) + (fArr[i13] * fArr2[i12]);
    }

    public static final void c(float[] fArr, float[] fArr2) {
        float fB = b(fArr2, 0, fArr, 0);
        float fB2 = b(fArr2, 0, fArr, 1);
        float fB3 = b(fArr2, 0, fArr, 2);
        float fB4 = b(fArr2, 0, fArr, 3);
        float fB5 = b(fArr2, 1, fArr, 0);
        float fB6 = b(fArr2, 1, fArr, 1);
        float fB7 = b(fArr2, 1, fArr, 2);
        float fB8 = b(fArr2, 1, fArr, 3);
        float fB9 = b(fArr2, 2, fArr, 0);
        float fB10 = b(fArr2, 2, fArr, 1);
        float fB11 = b(fArr2, 2, fArr, 2);
        float fB12 = b(fArr2, 2, fArr, 3);
        float fB13 = b(fArr2, 3, fArr, 0);
        float fB14 = b(fArr2, 3, fArr, 1);
        float fB15 = b(fArr2, 3, fArr, 2);
        float fB16 = b(fArr2, 3, fArr, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }
}
