package aa0;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import ba0.h;
import ba0.k;
import ba0.m;
import ba0.n;
import ba0.o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.y;
import q90.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f1188e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1190d;

    static {
        f1188e = Build.VERSION.SDK_INT < 29;
    }

    public c() {
        o oVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e5) {
            CopyOnWriteArraySet copyOnWriteArraySet = ba0.c.f6078a;
            ba0.c.a(d0.class.getName(), 5, "unable to load android socket classes", e5);
            oVar = null;
        }
        ArrayList arrayListW = y.w(new n[]{oVar, new m(ba0.e.f6081e), new m(k.f6094a), new m(h.f6092a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListW) {
            if (((n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f1190d = arrayList;
    }

    @Override // aa0.d
    public final void a(Context context) {
        this.f1189c = context;
    }

    @Override // aa0.d
    public final Context b() {
        return this.f1189c;
    }

    @Override // aa0.e
    public final z20.b c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        ea0.d bVar;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ba0.b bVar2 = x509TrustManagerExtensions != null ? new ba0.b(x509TrustManager, x509TrustManagerExtensions) : null;
        if (bVar2 != null) {
            return bVar2;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            bVar = new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            bVar = new ea0.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new ea0.a(bVar);
    }

    @Override // aa0.e
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.f1190d.iterator();
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i11) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i11);
        } catch (ClassCastException e5) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e5;
            }
            throw new IOException("Exception in connect", e5);
        }
    }

    @Override // aa0.e
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f1190d.iterator();
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
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // aa0.e
    public final void i(int i11, String str, Throwable th2) {
        if (i11 == 5) {
            Log.w("OkHttp", str, th2);
        } else {
            Log.i("OkHttp", str, th2);
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
