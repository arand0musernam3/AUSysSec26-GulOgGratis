package n20;

import android.util.StateSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f30311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f30312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o[] f30313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0 f30314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0 f30315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f30316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f0 f30317h;

    public g0(o oVar) {
        b();
        a(StateSet.WILD_CARD, oVar);
    }

    public final void a(int[] iArr, o oVar) {
        int i11 = this.f30310a;
        if (i11 == 0 || iArr.length == 0) {
            this.f30311b = oVar;
        }
        int[][] iArr2 = this.f30312c;
        if (i11 >= iArr2.length) {
            int i12 = i11 + 10;
            int[][] iArr3 = new int[i12][];
            System.arraycopy(iArr2, 0, iArr3, 0, i11);
            this.f30312c = iArr3;
            o[] oVarArr = new o[i12];
            System.arraycopy(this.f30313d, 0, oVarArr, 0, i11);
            this.f30313d = oVarArr;
        }
        int[][] iArr4 = this.f30312c;
        int i13 = this.f30310a;
        iArr4[i13] = iArr;
        this.f30313d[i13] = oVar;
        this.f30310a = i13 + 1;
    }

    public final void b() {
        this.f30311b = new o();
        this.f30312c = new int[10][];
        this.f30313d = new o[10];
    }
}
