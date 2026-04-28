package cg;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements d6.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z4.z f8134b;

    public /* synthetic */ u0(z4.z zVar, int i11) {
        this.f8133a = i11;
        this.f8134b = zVar;
    }

    @Override // d6.i0
    public final long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        int i11 = this.f8133a;
        kVar.getClass();
        mVar.getClass();
        switch (i11) {
            case 0:
                z4.z zVar = this.f8134b;
                if (!zVar.n()) {
                    return 0L;
                }
                int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (zVar.e(0L) >> 32));
                return (((long) (d70.b.a(2) + (((int) Float.intBitsToFloat((int) (zVar.e(0L) & 4294967295L))) - ((int) (j11 & 4294967295L))))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
            default:
                z4.z zVar2 = this.f8134b;
                if (!zVar2.n()) {
                    return 0L;
                }
                return (((long) ((((int) (j9 >> 32)) / 2) - (((int) (j11 >> 32)) / 2))) << 32) | (((long) ((((int) Float.intBitsToFloat((int) (zVar2.e(0L) & 4294967295L))) + ((int) (zVar2.u() & 4294967295L))) - d70.b.a(8))) & 4294967295L);
        }
    }
}
