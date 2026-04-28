package w90;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import q90.v;
import r90.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f43337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, v vVar) {
        super(fVar, vVar);
        vVar.getClass();
        this.f43337g = fVar;
        this.f43335e = -1L;
        this.f43336f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r11.f43336f == false) goto L34;
     */
    @Override // w90.a, ia0.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long F(ia0.g r12, long r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w90.c.F(ia0.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.f43330c) {
            return;
        }
        if (this.f43336f) {
            TimeZone timeZone = g.f37815a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = g.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.f43337g.f43343b.e();
                a(f.f43341f);
            }
        }
        this.f43330c = true;
    }
}
