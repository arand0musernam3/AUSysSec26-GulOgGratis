package rb;

import android.app.Application;
import android.net.NetworkRequest;
import android.util.Log;
import ib.w;
import kotlin.collections.y;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static f a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i11 : iArr) {
            try {
                builder.addCapability(i11);
            } catch (IllegalArgumentException e5) {
                w wVarD = w.d();
                String str = f.f37840b;
                String str2 = f.f37840b;
                String strL = a0.l("Ignoring adding capability '", i11, '\'');
                if (wVarD.f23766a <= 5) {
                    Log.w(str2, strL, e5);
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = g.f37842a[i12];
            if (!y.t(iArr, i13)) {
                try {
                    builder.removeCapability(i13);
                } catch (IllegalArgumentException e11) {
                    w wVarD2 = w.d();
                    String str3 = f.f37840b;
                    String str4 = f.f37840b;
                    String strL2 = a0.l("Ignoring removing default capability '", i13, '\'');
                    if (wVarD2.f23766a <= 5) {
                        Log.w(str4, strL2, e11);
                    }
                }
            }
        }
        for (int i14 : iArr2) {
            builder.addTransportType(i14);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new f(networkRequestBuild);
    }

    public static String b() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static boolean c(NetworkRequest networkRequest, int i11) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i11);
    }

    public static boolean d(NetworkRequest networkRequest, int i11) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i11);
    }
}
