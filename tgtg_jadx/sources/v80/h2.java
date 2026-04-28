package v80;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends a90.s implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42107e;

    public h2(long j9, z70.c cVar) {
        super(cVar.getContext(), cVar);
        this.f42107e = j9;
    }

    @Override // v80.s1
    public final String T() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.T());
        sb2.append("(timeMillis=");
        return w.a0.r(sb2, this.f42107e, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0.r(this.f42066c);
        q(new TimeoutCancellationException("Timed out waiting for " + this.f42107e + " ms", this));
    }
}
