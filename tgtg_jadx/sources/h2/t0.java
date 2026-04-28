package h2;

import kotlin.ranges.IntRange;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.k1 f21224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21225d;

    public t0(int i11, int i12, int i13) {
        this.f21222a = i12;
        this.f21223b = i13;
        int i14 = (i11 / i12) * i12;
        this.f21224c = new m3.k1(n80.p.j(Math.max(i14 - i13, 0), i14 + i12 + i13), m3.f.f29275g);
        this.f21225d = i11;
    }

    public final void b(int i11) {
        if (i11 != this.f21225d) {
            this.f21225d = i11;
            int i12 = this.f21222a;
            int i13 = (i11 / i12) * i12;
            int i14 = this.f21223b;
            this.f21224c.setValue(n80.p.j(Math.max(i13 - i14, 0), i13 + i12 + i14));
        }
    }

    @Override // m3.c3
    public final Object getValue() {
        return (IntRange) this.f21224c.getValue();
    }
}
