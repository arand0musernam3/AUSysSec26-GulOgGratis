package v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements i4.v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0 f41843b = new t0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f41844c = new t0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41845a;

    public /* synthetic */ t0(int i11) {
        this.f41845a = i11;
    }

    @Override // i4.v0
    public final i4.g0 a(long j9, z5.m mVar, z5.c cVar) {
        switch (this.f41845a) {
            case 0:
                float fQ0 = cVar.q0(d0.f41709a);
                return new i4.n0(new h4.c(0.0f, -fQ0, Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)) + fQ0));
            default:
                float fQ02 = cVar.q0(d0.f41709a);
                return new i4.n0(new h4.c(-fQ02, 0.0f, Float.intBitsToFloat((int) (j9 >> 32)) + fQ02, Float.intBitsToFloat((int) (j9 & 4294967295L))));
        }
    }
}
