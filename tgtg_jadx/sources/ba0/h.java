package ba0;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f6092a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f6093b;

    static {
        boolean z11 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z11 = true;
        } catch (ClassNotFoundException unused) {
        }
        f6093b = z11;
    }

    @Override // ba0.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // ba0.n
    public final boolean b() {
        return f6093b;
    }

    @Override // ba0.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ba0.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            aa0.e eVar = aa0.e.f1191a;
            parameters.setApplicationProtocols((String[]) qb.e.p(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
