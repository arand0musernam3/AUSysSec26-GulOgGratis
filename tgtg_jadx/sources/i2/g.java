package i2;

import java.util.List;
import z1.h2;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b4.j f22850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z5.m f22851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f22854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22856k;

    public g(int i11, int i12, List list, long j9, Object obj, h2 h2Var, b4.j jVar, z5.m mVar) {
        this.f22846a = i11;
        this.f22847b = list;
        this.f22848c = j9;
        this.f22849d = obj;
        this.f22850e = jVar;
        this.f22851f = mVar;
        this.f22852g = h2Var == h2.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            m1 m1Var = (m1) list.get(i13);
            iMax = Math.max(iMax, !this.f22852g ? m1Var.f47184b : m1Var.f47183a);
        }
        this.f22853h = iMax;
        this.f22854i = new int[this.f22847b.size() * 2];
        this.f22856k = Integer.MIN_VALUE;
    }

    public final void a(int i11) {
        this.f22855j += i11;
        int[] iArr = this.f22854i;
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            boolean z11 = this.f22852g;
            if ((z11 && i12 % 2 == 1) || (!z11 && i12 % 2 == 0)) {
                iArr[i12] = iArr[i12] + i11;
            }
        }
    }

    public final void b(int i11, int i12, int i13) {
        int i14;
        this.f22855j = i11;
        boolean z11 = this.f22852g;
        this.f22856k = z11 ? i13 : i12;
        List list = this.f22847b;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            m1 m1Var = (m1) list.get(i15);
            int i16 = i15 * 2;
            int[] iArr = this.f22854i;
            if (z11) {
                iArr[i16] = e0.f.a(1, this.f22851f != z5.m.Ltr ? 0.0f * (-1) : 0.0f, (i12 - m1Var.f47183a) / 2.0f);
                iArr[i16 + 1] = i11;
                i14 = m1Var.f47184b;
            } else {
                iArr[i16] = i11;
                int i17 = i16 + 1;
                b4.j jVar = this.f22850e;
                if (jVar == null) {
                    c2.a.b("null verticalAlignment");
                    qc.y.m();
                    return;
                } else {
                    iArr[i17] = jVar.a(m1Var.f47184b, i13);
                    i14 = m1Var.f47183a;
                }
            }
            i11 += i14;
        }
    }
}
