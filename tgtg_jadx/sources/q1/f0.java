package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends m {
    public f0(int i11) {
        this.f35789a = i11 == 0 ? r.f35817a : new int[i11];
    }

    public final void c(int i11) {
        d(this.f35790b + 1);
        int[] iArr = this.f35789a;
        int i12 = this.f35790b;
        iArr[i12] = i11;
        this.f35790b = i12 + 1;
    }

    public final void d(int i11) {
        int[] iArr = this.f35789a;
        if (iArr.length < i11) {
            this.f35789a = Arrays.copyOf(iArr, Math.max(i11, (iArr.length * 3) / 2));
        }
    }

    public final void e(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f35790b)) {
            org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f35789a;
        int i13 = iArr[i11];
        if (i11 != i12 - 1) {
            kotlin.collections.x.f(i11, iArr, i11 + 1, i12, iArr);
        }
        this.f35790b--;
    }

    public final void f(int i11, int i12) {
        if (i11 < 0 || i11 >= this.f35790b) {
            org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f35789a;
        int i13 = iArr[i11];
        iArr[i11] = i12;
    }

    public /* synthetic */ f0() {
        this(16);
    }
}
