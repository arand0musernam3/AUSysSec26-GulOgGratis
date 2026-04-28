package aa0;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import ba0.h;
import ba0.k;
import ba0.m;
import ba0.n;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f1183e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1185d;

    static {
        f1183e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListW = y.w(new n[]{Build.VERSION.SDK_INT >= 29 ? new ba0.a() : null, new m(ba0.e.f6081e), new m(k.f6094a), new m(h.f6092a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListW) {
            if (((n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f1185d = arrayList;
    }

    @Override // aa0.d
    public final void a(Context context) {
        this.f1184c = context;
    }

    @Override // aa0.d
    public final Context b() {
        return this.f1184c;
    }

    @Override // aa0.e
    public final z20.b c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ba0.b bVar = x509TrustManagerExtensions != null ? new ba0.b(x509TrustManager, x509TrustManagerExtensions) : null;
        if (bVar != null) {
            return bVar;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new ea0.a(new ea0.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // aa0.e
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.f1185d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((n) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // aa0.e
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f1185d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((n) next).a(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            return nVar.c(sSLSocket);
        }
        return null;
    }

    @Override // aa0.e
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // aa0.e
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // aa0.e
    public final void i(int i11, String str, Throwable th2) {
        if (i11 == 5) {
            boolean z11 = c.f1188e;
            Log.w("OkHttp", str, th2);
        } else {
            boolean z12 = c.f1188e;
            Log.i("OkHttp", str, th2);
        }
    }

    @Override // aa0.e
    public final void j(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.j(obj, str);
        } else {
            obj.getClass();
            ((CloseGuard) obj).warnIfOpen();
        }
    }

    @Override // aa0.e
    public final SSLContext k() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
