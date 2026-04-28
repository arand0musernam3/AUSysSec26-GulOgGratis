package aa0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ea0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f1186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f1187b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f1186a = x509TrustManager;
        this.f1187b = method;
    }

    @Override // ea0.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        x509Certificate.getClass();
        try {
            Object objInvoke = this.f1187b.invoke(this.f1186a, x509Certificate);
            objInvoke.getClass();
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e5) {
            throw new AssertionError("unable to get issues and signature", e5);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f1186a, bVar.f1186a) && Intrinsics.areEqual(this.f1187b, bVar.f1187b);
    }

    public final int hashCode() {
        return this.f1187b.hashCode() + (this.f1186a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f1186a + ", findByIssuerAndSignatureMethod=" + this.f1187b + ')';
    }
}
