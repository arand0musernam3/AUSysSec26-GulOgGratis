package r2;

import d6.i0;
import y00.i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f37564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z5.l f37565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z5.m f37566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z5.l f37567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z5.j f37568e;

    public j(i4 i4Var) {
        this.f37564a = i4Var;
    }

    @Override // d6.i0
    public final long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        z5.j jVar = this.f37568e;
        if (jVar != null) {
            z5.l lVar = this.f37565b;
            if ((lVar == null ? false : z5.l.a(lVar.f47286a, j9)) && this.f37566c == mVar) {
                z5.l lVar2 = this.f37567d;
                if (lVar2 != null ? z5.l.a(lVar2.f47286a, j11) : false) {
                    return jVar.f47280a;
                }
            }
        }
        long jE = this.f37564a.e(kVar, j9, mVar, j11);
        this.f37565b = new z5.l(j9);
        this.f37566c = mVar;
        this.f37567d = new z5.l(j11);
        this.f37568e = new z5.j(jE);
        return jE;
    }
}
