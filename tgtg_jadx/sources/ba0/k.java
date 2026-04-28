package ba0;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f6094a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f6095b;

    static {
        boolean z11 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (j.a()) {
                    z11 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f6095b = z11;
    }

    @Override // ba0.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // ba0.n
    public final boolean b() {
        return f6095b;
    }

    @Override // ba0.n
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // ba0.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            aa0.e eVar = aa0.e.f1191a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) qb.e.p(list).toArray(new String[0]));
        }
    }
}
