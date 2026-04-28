package r90;

import ia0.d0;
import ia0.i;
import ia0.j0;
import ia0.l0;
import q90.r0;
import q90.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends r0 implements j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f37808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37809c;

    public c(z zVar, long j9) {
        this.f37808b = zVar;
        this.f37809c = j9;
    }

    @Override // ia0.j0
    public final long F(ia0.g gVar, long j9) {
        gVar.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // q90.r0
    public final long e() {
        return this.f37809c;
    }

    @Override // q90.r0
    public final z g() {
        return this.f37808b;
    }

    @Override // ia0.j0
    public final l0 i() {
        return l0.f23657d;
    }

    @Override // q90.r0
    public final i p0() {
        return new d0(this);
    }

    @Override // q90.r0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
