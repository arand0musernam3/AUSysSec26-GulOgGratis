package g2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn.k f18255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f18258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f18259e;

    public u(dn.k kVar, int i11, int i12, n nVar, y yVar) {
        this.f18255a = kVar;
        this.f18256b = i11;
        this.f18257c = i12;
        this.f18258d = nVar;
        this.f18259e = yVar;
    }

    public final long a(int i11, int i12) {
        int i13;
        dn.k kVar = this.f18255a;
        int[] iArr = (int[]) kVar.f15018b;
        if (i12 == 1) {
            i13 = iArr[i11];
        } else {
            int i14 = (i12 + i11) - 1;
            int[] iArr2 = (int[]) kVar.f15019c;
            i13 = (iArr2[i14] + iArr[i14]) - iArr2[i11];
        }
        if (i13 < 0) {
            i13 = 0;
        }
        if (i13 < 0) {
            z5.i.a("width must be >= 0");
        }
        return z5.b.h(i13, i13, 0, Integer.MAX_VALUE);
    }

    public final t b(int i11) {
        e7.h hVarB = this.f18259e.b(i11);
        int i12 = hVarB.f15830a;
        int size = hVarB.f15831b.size();
        int i13 = 0;
        s[] sVarArr = new s[size];
        int i14 = 0;
        int i15 = (size == 0 || i12 + size == this.f18256b) ? 0 : this.f18257c;
        while (true) {
            List list = hVarB.f15831b;
            if (i13 >= size) {
                return new t(i11, sVarArr, ((o) this).f18198f, list, i15);
            }
            int i16 = (int) ((b) list.get(i13)).f18124a;
            int i17 = i15;
            s sVarQ = this.f18258d.q(i12 + i13, i14, i16, i17, a(i14, i16));
            i15 = i17;
            i14 += i16;
            sVarArr[i13] = sVarQ;
            i13++;
        }
    }
}
