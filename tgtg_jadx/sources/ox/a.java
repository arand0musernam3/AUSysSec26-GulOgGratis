package ox;

import com.braze.h2;
import kotlin.ranges.IntRange;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f33767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f33769c;

    public a(int[] iArr) {
        int i11;
        this.f33767a = iArr;
        if (iArr.length == 0) {
            h2.a("Empty array can't be reduced.");
            throw null;
        }
        int i12 = iArr[0];
        IntRange intRange = new IntRange(1, iArr.length - 1, 1);
        int i13 = intRange.f26554b;
        int i14 = intRange.f26555c;
        boolean z11 = i14 <= 0 ? 1 >= i13 : 1 <= i13;
        int i15 = z11 ? 1 : i13;
        while (z11) {
            if (i15 != i13) {
                i11 = i15 + i14;
            } else {
                if (!z11) {
                    i1.c();
                    throw null;
                }
                z11 = false;
                i11 = i15;
            }
            i12 *= iArr[i15];
            i15 = i11;
        }
        this.f33768b = i12;
        this.f33769c = new float[i12];
    }
}
