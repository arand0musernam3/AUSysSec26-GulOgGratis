package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f3982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f3983b;

    public final void a() {
        int[] iArr = this.f3982a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f3983b = null;
    }

    public final void b(int i11) {
        int[] iArr = this.f3982a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i11, 10) + 1];
            this.f3982a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i11 >= iArr.length) {
            int length = iArr.length;
            while (length <= i11) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f3982a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f3982a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void c(int i11, int i12) {
        int[] iArr = this.f3982a;
        if (iArr == null || i11 >= iArr.length) {
            return;
        }
        int i13 = i11 + i12;
        b(i13);
        int[] iArr2 = this.f3982a;
        System.arraycopy(iArr2, i11, iArr2, i13, (iArr2.length - i11) - i12);
        Arrays.fill(this.f3982a, i11, i13, -1);
        ArrayList arrayList = this.f3983b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x2 x2Var = (x2) this.f3983b.get(size);
            int i14 = x2Var.f3974a;
            if (i14 >= i11) {
                x2Var.f3974a = i14 + i12;
            }
        }
    }

    public final void d(int i11, int i12) {
        int[] iArr = this.f3982a;
        if (iArr == null || i11 >= iArr.length) {
            return;
        }
        int i13 = i11 + i12;
        b(i13);
        int[] iArr2 = this.f3982a;
        System.arraycopy(iArr2, i13, iArr2, i11, (iArr2.length - i11) - i12);
        int[] iArr3 = this.f3982a;
        Arrays.fill(iArr3, iArr3.length - i12, iArr3.length, -1);
        ArrayList arrayList = this.f3983b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x2 x2Var = (x2) this.f3983b.get(size);
            int i14 = x2Var.f3974a;
            if (i14 >= i11) {
                if (i14 < i13) {
                    this.f3983b.remove(size);
                } else {
                    x2Var.f3974a = i14 - i12;
                }
            }
        }
    }
}
