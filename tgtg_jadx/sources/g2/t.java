package g2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s[] f18249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn.k f18250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f18251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18254g;

    public t(int i11, s[] sVarArr, dn.k kVar, List list, int i12) {
        this.f18248a = i11;
        this.f18249b = sVarArr;
        this.f18250c = kVar;
        this.f18251d = list;
        this.f18252e = i12;
        int iMax = 0;
        for (s sVar : sVarArr) {
            iMax = Math.max(iMax, sVar.f18238n);
        }
        this.f18253f = iMax;
        int i13 = iMax + this.f18252e;
        this.f18254g = i13 >= 0 ? i13 : 0;
    }

    public final s[] a(int i11, int i12, int i13) {
        s[] sVarArr = this.f18249b;
        int length = sVarArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            s sVar = sVarArr[i14];
            int i17 = i15 + 1;
            int i18 = (int) ((b) this.f18251d.get(i15)).f18124a;
            sVar.m(i11, ((int[]) this.f18250c.f15019c)[i16], i12, i13, this.f18248a, i16);
            i16 += i18;
            i14++;
            i15 = i17;
        }
        return sVarArr;
    }
}
