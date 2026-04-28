package q90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static u0 a(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return u0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return u0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return u0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return u0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return u0.SSL_3_0;
        }
        i4.a.f("Unexpected TLS version: ".concat(str));
        return null;
    }
}
