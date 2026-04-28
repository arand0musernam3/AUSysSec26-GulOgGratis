package w90;

import com.braze.h2;
import ia0.g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import q90.t;
import q90.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f43339f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, v vVar, long j9) {
        super(fVar, vVar);
        vVar.getClass();
        this.f43339f = fVar;
        this.f43338e = j9;
        if (j9 == 0) {
            a(t.f36613b);
        }
    }

    @Override // w90.a, ia0.j0
    public final long F(g gVar, long j9) throws ProtocolException {
        gVar.getClass();
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        if (this.f43330c) {
            h2.b("closed");
            return 0L;
        }
        long j11 = this.f43338e;
        if (j11 == 0) {
            return -1L;
        }
        long jF = super.F(gVar, Math.min(j11, j9));
        if (jF == -1) {
            this.f43339f.f43343b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(f.f43341f);
            throw protocolException;
        }
        long j12 = this.f43338e - jF;
        this.f43338e = j12;
        if (j12 == 0) {
            a(t.f36613b);
        }
        return jF;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.f43330c) {
            return;
        }
        if (this.f43338e != 0) {
            TimeZone timeZone = r90.g.f37815a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = r90.g.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.f43339f.f43343b.e();
                a(f.f43341f);
            }
        }
        this.f43330c = true;
    }
}
