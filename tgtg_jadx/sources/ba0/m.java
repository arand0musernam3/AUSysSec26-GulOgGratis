package ba0;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f6096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f6097b;

    public m(l lVar) {
        this.f6096a = lVar;
    }

    @Override // ba0.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f6096a.a(sSLSocket);
    }

    @Override // ba0.n
    public final boolean b() {
        return true;
    }

    @Override // ba0.n
    public final String c(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // ba0.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f6097b == null && this.f6096a.a(sSLSocket)) {
                this.f6097b = this.f6096a.f(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6097b;
    }
}
