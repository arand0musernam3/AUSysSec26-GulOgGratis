package ba0;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends z20.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final X509TrustManager f6076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X509TrustManagerExtensions f6077i;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f6076h = x509TrustManager;
        this.f6077i = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f6076h == this.f6076h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f6076h);
    }

    @Override // z20.b
    public final List k(String str, List list) throws SSLPeerUnverifiedException {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> listCheckServerTrusted = this.f6077i.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            listCheckServerTrusted.getClass();
            return listCheckServerTrusted;
        } catch (CertificateException e5) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e5.getMessage());
            sSLPeerUnverifiedException.initCause(e5);
            throw sSLPeerUnverifiedException;
        }
    }
}
