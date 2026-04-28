package id;

import ia0.j0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ia0.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Exception f23780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j0 j0Var, int i11) {
        super(j0Var);
        this.f23779b = i11;
    }

    @Override // ia0.p, ia0.j0
    public final long F(ia0.g gVar, long j9) throws Exception {
        switch (this.f23779b) {
            case 0:
                try {
                    return super.F(gVar, j9);
                } catch (Exception e5) {
                    this.f23780c = e5;
                    throw e5;
                }
            default:
                try {
                    return super.F(gVar, j9);
                } catch (Exception e11) {
                    this.f23780c = e11;
                    throw e11;
                }
        }
    }
}
