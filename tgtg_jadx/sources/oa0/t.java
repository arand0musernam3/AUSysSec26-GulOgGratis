package oa0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends ia0.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32378b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q90.r0 f32379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, ia0.i iVar) {
        super(iVar);
        this.f32379c = uVar;
    }

    @Override // ia0.p, ia0.j0
    public long F(ia0.g gVar, long j9) throws IOException {
        switch (this.f32378b) {
            case 0:
                try {
                    return super.F(gVar, j9);
                } catch (IOException e5) {
                    ((u) this.f32379c).f32384d = e5;
                    throw e5;
                }
            default:
                return super.F(gVar, j9);
        }
    }

    @Override // ia0.p, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f32378b) {
            case 1:
                ((q90.c) this.f32379c).f36423b.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ia0.j0 j0Var, q90.c cVar) {
        super(j0Var);
        this.f32379c = cVar;
    }
}
