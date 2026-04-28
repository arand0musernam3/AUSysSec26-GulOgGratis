package px;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import ax.a0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tx.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f35636a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f35637b;

    public final Intent a(Context context) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && o.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (o.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final e b(c cVar, String str, List list) {
        e eVar;
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            e eVar2 = e.SERVICE_NOT_AVAILABLE;
            Context contextA = a0.a();
            Intent intentA = a(contextA);
            if (intentA == null) {
                return eVar2;
            }
            d dVar = new d();
            try {
                if (!contextA.bindService(intentA, dVar, 1)) {
                    return e.SERVICE_ERROR;
                }
                try {
                    dVar.f35634a.await(5L, TimeUnit.SECONDS);
                    IBinder iBinder = dVar.f35635b;
                    if (iBinder != null) {
                        ey.c cVarA = ey.b.a(iBinder);
                        Bundle bundleA = b.a(cVar, str, list);
                        if (bundleA != null) {
                            ((ey.a) cVarA).a(bundleA);
                            bundleA.toString();
                        }
                        eVar2 = e.OPERATION_SUCCESS;
                    }
                    contextA.unbindService(dVar);
                    return eVar2;
                } catch (RemoteException unused) {
                    eVar = e.SERVICE_ERROR;
                    a0 a0Var = a0.f4849a;
                    contextA.unbindService(dVar);
                    return eVar;
                } catch (InterruptedException unused2) {
                    eVar = e.SERVICE_ERROR;
                    a0 a0Var2 = a0.f4849a;
                    contextA.unbindService(dVar);
                    return eVar;
                }
            } catch (Throwable th2) {
                contextA.unbindService(dVar);
                a0 a0Var3 = a0.f4849a;
                throw th2;
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
            return null;
        }
    }
}
