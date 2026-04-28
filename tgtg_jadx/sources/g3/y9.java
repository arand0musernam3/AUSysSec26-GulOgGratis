package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 implements d6.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19849a;

    public y9(int i11) {
        this.f19849a = i11;
    }

    @Override // d6.i0
    public final long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        int iD = kVar.f47282a;
        int i11 = (int) (j11 >> 32);
        if (iD + i11 > ((int) (j9 >> 32))) {
            int i12 = kVar.f47284c - i11;
            iD = i12 < 0 ? iD + ((kVar.d() - i11) / 2) : i12;
        }
        int i13 = kVar.f47283b - ((int) (j11 & 4294967295L));
        int i14 = this.f19849a;
        int i15 = i13 - i14;
        if (i15 < 0) {
            i15 = kVar.f47285d + i14;
        }
        return (((long) i15) & 4294967295L) | (((long) iD) << 32);
    }
}
