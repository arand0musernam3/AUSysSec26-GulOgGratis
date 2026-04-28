package aa0;

import a40.d0;
import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile e f1191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f1192b;

    static {
        try {
            for (Map.Entry entry : ba0.c.f6079b.entrySet()) {
                ba0.c.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e5) {
            System.err.println("Possibly running android unit test without robolectric");
            e5.printStackTrace();
        } catch (UnsatisfiedLinkError e11) {
            System.err.println("Possibly running android unit test without robolectric");
            e11.printStackTrace();
        }
        e aVar = a.f1183e ? new a() : null;
        if (aVar == null) {
            aVar = c.f1188e ? new c() : null;
        }
        if (aVar == null) {
            d0.d(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was ");
        } else {
            f1191a = aVar;
            f1192b = Logger.getLogger(q90.d0.class.getName());
        }
    }

    public abstract z20.b c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i11) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i11);
    }

    public abstract String f(SSLSocket sSLSocket);

    public Object g() {
        if (f1192b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean h(String str);

    public abstract void i(int i11, String str, Throwable th2);

    public void j(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public abstract SSLContext k();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
