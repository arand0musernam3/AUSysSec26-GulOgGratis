package m90;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class z1 extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f29896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29897b;

    @Override // m90.f1
    public final Object a() {
        return new u70.d0(Arrays.copyOf(this.f29896a, this.f29897b));
    }

    @Override // m90.f1
    public final void b(int i11) {
        long[] jArr = this.f29896a;
        if (jArr.length < i11) {
            int length = jArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            this.f29896a = Arrays.copyOf(jArr, i11);
        }
    }

    @Override // m90.f1
    public final int d() {
        return this.f29897b;
    }
}
