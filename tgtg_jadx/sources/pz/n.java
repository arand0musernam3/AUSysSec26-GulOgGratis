package pz;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.g0;
import com.google.android.gms.common.internal.h0;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f35679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f35680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile h0 f35681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f35682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f35683e;

    static {
        new i(j.W("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new i(j.W("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new i(j.W("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new i(j.W("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        f35679a = new i(j.W("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        f35680b = new i(j.W("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        f35682d = new Object();
    }

    public static void a() {
        h0 f0Var;
        if (f35681c != null) {
            return;
        }
        i0.h(f35683e);
        synchronized (f35682d) {
            try {
                if (f35681c == null) {
                    IBinder iBinderB = zz.d.c(f35683e, zz.d.f48428e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i11 = g0.f11114h;
                    if (iBinderB == null) {
                        f0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        f0Var = iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 3);
                    }
                    f35681c = f0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static q b(String str, k kVar, boolean z11, boolean z12) {
        try {
            a();
            i0.h(f35683e);
            try {
                h0 h0Var = f35681c;
                yz.b bVar = new yz.b(f35683e.getPackageManager());
                f0 f0Var = (f0) h0Var;
                Parcel parcelL = f0Var.L();
                int i11 = j00.h.f24361a;
                boolean z13 = true;
                parcelL.writeInt(1);
                int iH0 = u.h0(20293, parcelL);
                u.b0(str, parcelL, 1);
                u.W(parcelL, 2, kVar);
                u.g0(parcelL, 3, 4);
                parcelL.writeInt(z11 ? 1 : 0);
                u.g0(parcelL, 4, 4);
                parcelL.writeInt(z12 ? 1 : 0);
                u.i0(iH0, parcelL);
                j00.h.b(parcelL, bVar);
                Parcel parcelC = f0Var.C(5, parcelL);
                if (parcelC.readInt() == 0) {
                    z13 = false;
                }
                parcelC.recycle();
                return z13 ? q.f35690d : new p(new l(z11, str, kVar));
            } catch (RemoteException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
                return q.c("module call", e5);
            }
        } catch (DynamiteModule$LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return q.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
