package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ca implements d6.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18428b;

    public ca(int i11, long j9) {
        this.f18427a = i11;
        this.f18428b = j9;
    }

    @Override // d6.i0
    public final long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        int i11 = (int) (j11 >> 32);
        int iA = org.bouncycastle.jcajce.provider.asymmetric.a.a(kVar.d(), i11, 2, kVar.f47282a);
        long j12 = this.f18428b;
        if (iA < 0) {
            int i12 = kVar.f47282a;
            int i13 = (i11 + i12) - ((int) (j12 >> 32));
            iA = i12 - (i13 >= 0 ? i13 : 0);
        } else if (iA + i11 > ((int) (j12 >> 32)) && (iA = kVar.f47284c - i11) < 0) {
            iA = 0;
        }
        int i14 = kVar.f47283b - ((int) (j11 & 4294967295L));
        int i15 = this.f18427a;
        int i16 = i14 - i15;
        if (i16 < 0) {
            i16 = kVar.f47285d + i15;
        }
        return (((long) iA) << 32) | (((long) i16) & 4294967295L);
    }
}
