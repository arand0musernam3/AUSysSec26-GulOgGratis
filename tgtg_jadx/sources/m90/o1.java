package m90;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f29834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29835b;

    @Override // m90.f1
    public final Object a() {
        return Arrays.copyOf(this.f29834a, this.f29835b);
    }

    @Override // m90.f1
    public final void b(int i11) {
        short[] sArr = this.f29834a;
        if (sArr.length < i11) {
            int length = sArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            this.f29834a = Arrays.copyOf(sArr, i11);
        }
    }

    @Override // m90.f1
    public final int d() {
        return this.f29835b;
    }
}
