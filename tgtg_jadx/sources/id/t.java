package id;

import ia0.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.m f23811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na0.a f23812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23813c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ia0.i f23815e;

    public t(ia0.i iVar, ia0.m mVar, na0.a aVar) {
        this.f23811a = mVar;
        this.f23812b = aVar;
        this.f23815e = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f23813c) {
            this.f23814d = true;
            ia0.i iVar = this.f23815e;
            if (iVar != null) {
                try {
                    iVar.close();
                } catch (RuntimeException e5) {
                    throw e5;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // id.r
    public final ia0.m getFileSystem() {
        return this.f23811a;
    }

    @Override // id.r
    public final na0.a getMetadata() {
        return this.f23812b;
    }

    @Override // id.r
    public final a0 h0() {
        synchronized (this.f23813c) {
            if (this.f23814d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // id.r
    public final ia0.i p0() {
        ia0.i iVar;
        synchronized (this.f23813c) {
            try {
                if (this.f23814d) {
                    throw new IllegalStateException("closed");
                }
                iVar = this.f23815e;
                if (iVar == null) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }
}
