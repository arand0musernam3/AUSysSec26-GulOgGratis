package ja0;

import ia0.j0;
import java.io.IOException;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends ia0.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24811d;

    public i(j0 j0Var, long j9, boolean z11) {
        super(j0Var);
        this.f24809b = j9;
        this.f24810c = z11;
    }

    @Override // ia0.p, ia0.j0
    public final long F(ia0.g gVar, long j9) throws IOException {
        gVar.getClass();
        long j11 = this.f24811d;
        long j12 = this.f24809b;
        if (j11 > j12) {
            j9 = 0;
        } else if (this.f24810c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j9 = Math.min(j9, j13);
        }
        long jF = this.f23669a.F(gVar, j9);
        if (jF != -1) {
            this.f24811d += jF;
        }
        long j14 = this.f24811d;
        if ((j14 >= j12 || jF != -1) && j14 <= j12) {
            return jF;
        }
        if (jF > 0 && j14 > j12) {
            long j15 = gVar.f23643b - (j14 - j12);
            ia0.g gVar2 = new ia0.g();
            gVar2.b0(gVar);
            gVar.x(gVar2, j15);
            gVar2.a();
        }
        StringBuilder sbG = l1.g("expected ", j12, " bytes but got ");
        sbG.append(this.f24811d);
        throw new IOException(sbG.toString());
    }
}
