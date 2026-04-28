package x90;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends ia0.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f44184n;

    public u(v vVar) {
        this.f44184n = vVar;
    }

    @Override // ia0.d
    public final IOException k(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // ia0.d
    public final void l() {
        this.f44184n.e(b.CANCEL);
        n nVar = this.f44184n.f44186b;
        synchronized (nVar) {
            long j9 = nVar.f44144n;
            long j11 = nVar.f44143m;
            if (j9 < j11) {
                return;
            }
            nVar.f44143m = j11 + 1;
            nVar.f44145o = System.nanoTime() + ((long) 1000000000);
            t90.c.b(nVar.f44139h, r8.k.p(new StringBuilder(), nVar.f44134c, " ping"), 0L, new rv.a(nVar, 28), 6);
        }
    }

    public final void m() {
        if (j()) {
            throw k(null);
        }
    }
}
