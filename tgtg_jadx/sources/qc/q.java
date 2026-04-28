package qc;

import java.io.EOFException;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ia0.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ia0.j f36917c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia0.g f36918b;

    static {
        ia0.j jVar = ia0.j.f23646d;
        f36917c = r40.d.n("0021F904");
    }

    public q(ia0.i iVar) {
        super(iVar);
        this.f36918b = new ia0.g();
    }

    @Override // ia0.p, ia0.j0
    public final long F(ia0.g gVar, long j9) throws EOFException {
        long j11;
        long j12;
        a(j9);
        ia0.g gVar2 = this.f36918b;
        long j13 = 0;
        if (gVar2.f23643b == 0) {
            return j9 == 0 ? 0L : -1L;
        }
        long j14 = 0;
        while (true) {
            long jY = -1;
            while (true) {
                ia0.j jVar = f36917c;
                jY = this.f36918b.y(jVar.f23647a[0], jY + 1, LongCompanionObject.MAX_VALUE);
                if (jY == -1) {
                    j11 = j13;
                    break;
                }
                j11 = j13;
                if (a(jVar.f23647a.length) && gVar2.J(jVar.e(), jY, jVar)) {
                    break;
                }
                j13 = j11;
            }
            if (jY == -1) {
                break;
            }
            long jF = gVar2.F(gVar, jY + ((long) 4));
            if (jF < j11) {
                jF = j11;
            }
            j14 += jF;
            if (a(5L) && gVar2.G(4L) == 0) {
                byte bG = gVar2.G(2L);
                u70.v vVar = u70.w.f40862b;
                if ((((bG & 255) << 8) | (gVar2.G(1L) & 255)) < 2) {
                    gVar.z0(gVar2.G(j11));
                    gVar.z0(10);
                    gVar.z0(0);
                    gVar2.skip(3L);
                }
            }
            j13 = 0;
        }
        if (j14 < j9) {
            long jF2 = gVar2.F(gVar, j9 - j14);
            j12 = 0;
            if (jF2 < 0) {
                jF2 = 0;
            }
            j14 += jF2;
        } else {
            j12 = 0;
        }
        if (j14 == j12) {
            return -1L;
        }
        return j14;
    }

    public final boolean a(long j9) {
        ia0.g gVar = this.f36918b;
        long j11 = gVar.f23643b;
        if (j11 >= j9) {
            return true;
        }
        long j12 = j9 - j11;
        return super.F(gVar, j12) == j12;
    }
}
