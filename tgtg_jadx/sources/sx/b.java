package sx;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import ax.a0;
import java.util.HashMap;
import java.util.Set;
import tx.c0;
import tx.k0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f39284a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f39285b = new HashMap();

    public static final void a(String str) {
        b bVar;
        HashMap map;
        Set set = yx.a.f46339a;
        if (set.contains(b.class)) {
            return;
        }
        try {
            bVar = f39284a;
            map = f39285b;
        } catch (Throwable th2) {
            yx.a.a(b.class, th2);
        }
        if (set.contains(bVar)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) map.get(str);
            if (registrationListener != null) {
                Object systemService = a0.a().getSystemService("servicediscovery");
                systemService.getClass();
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException unused) {
                    a0 a0Var = a0.f4849a;
                }
                map.remove(str);
                return;
            }
            return;
        } catch (Throwable th3) {
            yx.a.a(bVar, th3);
            return;
        }
        yx.a.a(b.class, th2);
    }

    public static final boolean b() {
        if (!yx.a.f46339a.contains(b.class)) {
            try {
                z zVarB = c0.b(a0.b());
                if (zVarB != null) {
                    if (zVarB.f40587e.contains(k0.Enabled)) {
                        return true;
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(b.class, th2);
                return false;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        if (yx.a.f46339a.contains(this)) {
            return false;
        }
        try {
            HashMap map = f39285b;
            if (map.containsKey(str)) {
                return true;
            }
            a0 a0Var = a0.f4849a;
            String strReplace = "18.2.3".replace('.', '|');
            strReplace.getClass();
            String str2 = "fbsdk_" + "android-".concat(strReplace) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = a0.a().getSystemService("servicediscovery");
            systemService.getClass();
            a aVar = new a(str2, str);
            map.put(str, aVar);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return false;
        }
    }
}
