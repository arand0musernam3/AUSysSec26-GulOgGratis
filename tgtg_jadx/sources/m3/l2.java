package m3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f29319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f29320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f29322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b5.y f29328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29329k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29331n;

    public l2(m2 m2Var) {
        this.f29319a = m2Var;
        this.f29320b = m2Var.f29337a;
        int i11 = m2Var.f29338b;
        this.f29321c = i11;
        this.f29322d = m2Var.f29339c;
        this.f29323e = m2Var.f29340d;
        this.f29326h = i11;
        this.f29327i = -1;
        this.f29328j = new b5.y();
    }

    public final a a(int i11) {
        ArrayList arrayList = this.f29319a.f29345i;
        int iD = o2.d(arrayList, i11, this.f29321c);
        if (iD >= 0) {
            return (a) arrayList.get(iD);
        }
        a aVar = new a(i11);
        arrayList.add(-(iD + 1), aVar);
        return aVar;
    }

    public final Object b(int i11, int[] iArr) {
        int i12 = i11 * 5;
        int i13 = iArr[i12 + 1];
        if ((268435456 & i13) != 0) {
            return this.f29322d[i12 >= iArr.length ? iArr.length : iArr[i12 + 4] + Integer.bitCount(i13 >> 29)];
        }
        return m.f29332a;
    }

    public final void c() {
        this.f29324f = true;
        if (this.f29319a.f29341e <= 0) {
            v.a("Unexpected reader close()");
        }
        r0.f29341e--;
        this.f29322d = new Object[0];
    }

    public final boolean d(int i11) {
        return (this.f29320b[(i11 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f29329k == 0) {
            if (this.f29325g != this.f29326h) {
                v.a("endGroup() not called at the end of a group");
            }
            int i11 = (this.f29327i * 5) + 2;
            int[] iArr = this.f29320b;
            int i12 = iArr[i11];
            this.f29327i = i12;
            int i13 = this.f29321c;
            this.f29326h = i12 < 0 ? i13 : iArr[(i12 * 5) + 3] + i12;
            int iB = this.f29328j.b();
            if (iB < 0) {
                this.l = 0;
                this.f29330m = 0;
            } else {
                this.l = iB;
                this.f29330m = i12 >= i13 + (-1) ? this.f29323e : iArr[((i12 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i11 = this.f29325g;
        if (i11 < this.f29326h) {
            return b(i11, this.f29320b);
        }
        return 0;
    }

    public final int g() {
        int i11 = this.f29325g;
        if (i11 >= this.f29326h) {
            return 0;
        }
        return this.f29320b[i11 * 5];
    }

    public final Object h(int i11, int i12) {
        int[] iArr = this.f29320b;
        int iB = o2.b(i11, iArr);
        int i13 = i11 + 1;
        int i14 = iB + i12;
        return i14 < (i13 < this.f29321c ? iArr[(i13 * 5) + 4] : this.f29323e) ? this.f29322d[i14] : m.f29332a;
    }

    public final int i(int i11) {
        return this.f29320b[i11 * 5];
    }

    public final boolean j(int i11) {
        return (this.f29320b[(i11 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i11) {
        return (this.f29320b[(i11 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i11) {
        return (this.f29320b[(i11 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i11;
        if (this.f29329k > 0 || (i11 = this.l) >= this.f29330m) {
            this.f29331n = false;
            return m.f29332a;
        }
        this.f29331n = true;
        Object[] objArr = this.f29322d;
        this.l = i11 + 1;
        return objArr[i11];
    }

    public final Object n(int i11) {
        int i12 = i11 * 5;
        int[] iArr = this.f29320b;
        int i13 = iArr[i12 + 1] & 1073741824;
        if (i13 != 0) {
            return i13 != 0 ? this.f29322d[iArr[i12 + 4]] : m.f29332a;
        }
        return null;
    }

    public final int o(int i11) {
        return this.f29320b[(i11 * 5) + 1] & 67108863;
    }

    public final Object p(int i11, int[] iArr) {
        int i12 = i11 * 5;
        int i13 = iArr[i12 + 1];
        if ((536870912 & i13) == 0) {
            return null;
        }
        return this.f29322d[Integer.bitCount(i13 >> 30) + iArr[i12 + 4]];
    }

    public final int q(int i11) {
        return this.f29320b[(i11 * 5) + 2];
    }

    public final void r(int i11) {
        if (this.f29329k != 0) {
            v.a("Cannot reposition while in an empty region");
        }
        this.f29325g = i11;
        int[] iArr = this.f29320b;
        int i12 = this.f29321c;
        int i13 = i11 < i12 ? iArr[(i11 * 5) + 2] : -1;
        if (i13 != this.f29327i) {
            this.f29327i = i13;
            if (i13 < 0) {
                this.f29326h = i12;
            } else {
                this.f29326h = iArr[(i13 * 5) + 3] + i13;
            }
            this.l = 0;
            this.f29330m = 0;
        }
    }

    public final int s() {
        if (this.f29329k != 0) {
            v.a("Cannot skip while in an empty region");
        }
        int i11 = this.f29325g;
        int i12 = i11 * 5;
        int[] iArr = this.f29320b;
        int i13 = iArr[i12 + 1];
        int i14 = (1073741824 & i13) != 0 ? 1 : i13 & 67108863;
        this.f29325g = iArr[i12 + 3] + i11;
        return i14;
    }

    public final void t() {
        if (!(this.f29329k == 0)) {
            v.a("Cannot skip the enclosing group while in an empty region");
        }
        this.f29325g = this.f29326h;
        this.l = 0;
        this.f29330m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f29325g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f29327i);
        sb2.append(", end=");
        return r8.k.o(sb2, this.f29326h, ')');
    }

    public final void u() {
        if (this.f29329k <= 0) {
            int i11 = this.f29327i;
            int i12 = this.f29325g;
            int i13 = i12 * 5;
            int[] iArr = this.f29320b;
            if (iArr[i13 + 2] != i11) {
                s1.a("Invalid slot table detected");
            }
            int i14 = this.l;
            int i15 = this.f29330m;
            b5.y yVar = this.f29328j;
            if (i14 == 0 && i15 == 0) {
                yVar.c(-1);
            } else {
                yVar.c(i14);
            }
            this.f29327i = i12;
            this.f29326h = iArr[i13 + 3] + i12;
            int i16 = i12 + 1;
            this.f29325g = i16;
            this.l = o2.b(i12, iArr);
            this.f29330m = i12 >= this.f29321c + (-1) ? this.f29323e : iArr[(i16 * 5) + 4];
        }
    }
}
