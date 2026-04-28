package u00;

import a40.d0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.adyen.checkout.components.core.Address;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.i0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import qc.y;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f40621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile f f40622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f40623c = new ConcurrentLinkedQueue();

    public static f a(Context context) throws GooglePlayServicesNotAvailableException {
        i0.h(context);
        Log.d("e", "preferredRenderer: ".concat(Address.ADDRESS_NULL_PLACEHOLDER));
        if (f40622b == null) {
            AtomicBoolean atomicBoolean = pz.e.f35655a;
            int iB = pz.e.b(context, 13400000);
            if (iB != 0) {
                throw new GooglePlayServicesNotAvailableException(iB);
            }
            f40622b = c(context, null);
            try {
                f fVar = f40622b;
                Parcel parcelJ = fVar.J(9, fVar.L());
                int i11 = parcelJ.readInt();
                parcelJ.recycle();
                String packageName = context.getPackageName();
                if (i11 != 2 || packageName.equals("com.google.android.apps.photos")) {
                    Log.d("e", "not early loading native code");
                } else {
                    Log.d("e", "early loading native code");
                    try {
                        f fVar2 = f40622b;
                        yz.b bVar = new yz.b(b(context, null));
                        Parcel parcelL = fVar2.L();
                        n00.d.d(parcelL, bVar);
                        fVar2.M(11, parcelL);
                    } catch (RemoteException e5) {
                        y.l(e5);
                        return null;
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w("e", "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                        f40621a = null;
                        f40622b = c(context, t00.d.LEGACY);
                    }
                }
                try {
                    f fVar3 = f40622b;
                    yz.b bVar2 = new yz.b(b(context, null).getResources());
                    Parcel parcelL2 = fVar3.L();
                    n00.d.d(parcelL2, bVar2);
                    parcelL2.writeInt(20000000);
                    fVar3.M(6, parcelL2);
                    while (true) {
                        ConcurrentLinkedQueue concurrentLinkedQueue = f40623c;
                        if (concurrentLinkedQueue.isEmpty()) {
                            break;
                        }
                        try {
                            t00.h hVar = (t00.h) concurrentLinkedQueue.poll();
                            i0.h(hVar);
                            f fVar4 = f40622b;
                            yz.b bVar3 = new yz.b(hVar.f39344a);
                            Parcel parcelL3 = fVar4.L();
                            n00.d.d(parcelL3, bVar3);
                            parcelL3.writeString("gmp_git_androidmapsutils_v4.1.1");
                            fVar4.M(12, parcelL3);
                        } catch (RemoteException e11) {
                            y.l(e11);
                            return null;
                        }
                    }
                } catch (RemoteException e12) {
                    y.l(e12);
                    return null;
                }
            } catch (RemoteException e13) {
                y.l(e13);
                return null;
            }
        }
        return f40622b;
    }

    public static Context b(Context context, t00.d dVar) {
        Context contextCreatePackageContext;
        Context context2 = f40621a;
        if (context2 == null) {
            String str = dVar == t00.d.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
            context2 = null;
            try {
                contextCreatePackageContext = zz.d.c(context, zz.d.f48425b, str).f48438a;
            } catch (Exception e5) {
                try {
                    if (str.equals("com.google.android.gms.maps_dynamite")) {
                        Log.e("e", "Failed to load maps module, use pre-Chimera", e5);
                        AtomicBoolean atomicBoolean = pz.e.f35655a;
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    } else {
                        try {
                            Log.d("e", "Attempting to load maps_dynamite again.");
                            contextCreatePackageContext = zz.d.c(context, zz.d.f48425b, "com.google.android.gms.maps_dynamite").f48438a;
                        } catch (Exception e11) {
                            Log.e("e", "Failed to load maps module, use pre-Chimera", e11);
                            AtomicBoolean atomicBoolean2 = pz.e.f35655a;
                            contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
            }
            f40621a = contextCreatePackageContext;
            if (contextCreatePackageContext != null) {
                return contextCreatePackageContext;
            }
            d0.k("Unable to load maps module, maps container context is null");
        }
        return context2;
    }

    public static f c(Context context, t00.d dVar) {
        Log.i("e", "Making Creator dynamically");
        ClassLoader classLoader = b(context, dVar).getClassLoader();
        try {
            i0.h(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.maps.internal.ICreator", 5);
                }
                d0.k("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
                return null;
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()), e5);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()), e11);
            }
        } catch (ClassNotFoundException e12) {
            o.k("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e12);
            return null;
        }
    }
}
