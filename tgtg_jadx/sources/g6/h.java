package g6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20044a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f20048e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f20052i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20045b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20046c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20047d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20049f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f20050g = new float[9];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f20051h = new float[9];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b[] f20053j = new b[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20054k = 0;
    public int l = 0;

    public h(g gVar) {
        this.f20052i = gVar;
    }

    public final void a(b bVar) {
        int i11 = 0;
        while (true) {
            int i12 = this.f20054k;
            b[] bVarArr = this.f20053j;
            if (i11 >= i12) {
                if (i12 >= bVarArr.length) {
                    this.f20053j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f20053j;
                int i13 = this.f20054k;
                bVarArr2[i13] = bVar;
                this.f20054k = i13 + 1;
                return;
            }
            if (bVarArr[i11] == bVar) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void c(b bVar) {
        int i11 = this.f20054k;
        int i12 = 0;
        while (i12 < i11) {
            if (this.f20053j[i12] == bVar) {
                while (i12 < i11 - 1) {
                    b[] bVarArr = this.f20053j;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f20054k--;
                return;
            }
            i12++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f20045b - ((h) obj).f20045b;
    }

    public final void d() {
        this.f20052i = g.UNKNOWN;
        this.f20047d = 0;
        this.f20045b = -1;
        this.f20046c = -1;
        this.f20048e = 0.0f;
        this.f20049f = false;
        int i11 = this.f20054k;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f20053j[i12] = null;
        }
        this.f20054k = 0;
        this.l = 0;
        this.f20044a = false;
        Arrays.fill(this.f20051h, 0.0f);
    }

    public final void e(c cVar, float f11) {
        this.f20048e = f11;
        this.f20049f = true;
        int i11 = this.f20054k;
        this.f20046c = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f20053j[i12].h(cVar, this, false);
        }
        this.f20054k = 0;
    }

    public final void f(c cVar, b bVar) {
        int i11 = this.f20054k;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f20053j[i12].i(cVar, bVar, false);
        }
        this.f20054k = 0;
    }

    public final String toString() {
        return "" + this.f20045b;
    }
}
