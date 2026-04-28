package h2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.g0 f21097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.g0 f21098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21100d;

    public f(i2.i iVar) {
        q1.g0 g0Var = q1.p.f35804a;
        this.f21097a = new q1.g0();
        new q1.h0();
        this.f21098b = new q1.g0();
        this.f21099c = Integer.MAX_VALUE;
        this.f21100d = Integer.MIN_VALUE;
    }

    public final boolean a() {
        return (this.f21099c == Integer.MAX_VALUE || this.f21100d == Integer.MIN_VALUE) ? false : true;
    }

    public final void b() {
        this.f21099c = Integer.MAX_VALUE;
        this.f21100d = Integer.MIN_VALUE;
        this.f21098b.c();
        q1.g0 g0Var = this.f21097a;
        long[] jArr = g0Var.f35798a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128) {
                        int i14 = (i11 << 3) + i13;
                        int i15 = g0Var.f35799b[i14];
                        List list = (List) g0Var.f35800c[i14];
                        int size = list.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            ((x0) list.get(i16)).cancel();
                        }
                        g0Var.h(i14);
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }
}
