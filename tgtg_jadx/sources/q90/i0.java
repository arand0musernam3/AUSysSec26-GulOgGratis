package q90;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f36513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia0.m f36514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ia0.a0 f36515c;

    public i0(ia0.a0 a0Var, ia0.m mVar, z zVar) {
        this.f36513a = zVar;
        this.f36514b = mVar;
        this.f36515c = a0Var;
    }

    @Override // q90.n0
    public final long contentLength() {
        Long l = (Long) this.f36514b.B(this.f36515c).f807e;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // q90.n0
    public final z contentType() {
        return this.f36513a;
    }

    @Override // q90.n0
    public final void writeTo(ia0.h hVar) throws IOException {
        ia0.j0 j0VarJ = this.f36514b.J(this.f36515c);
        try {
            hVar.b0(j0VarJ);
            j0VarJ.close();
        } finally {
        }
    }
}
