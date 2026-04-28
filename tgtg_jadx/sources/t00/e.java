package t00;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.adyen.checkout.components.core.Address;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f39339a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f39340b = d.LEGACY;

    public static synchronized int a(Context context) {
        try {
            i0.i(context, "Context is null");
            Log.d("e", "preferredRenderer: ".concat(Address.ADDRESS_NULL_PLACEHOLDER));
            if (!f39339a) {
                try {
                    u00.f fVarA = u00.e.a(context);
                    try {
                        u00.a aVarO = fVarA.O();
                        i0.h(aVarO);
                        ba0.g.f6090e = aVarO;
                        n00.g gVarQ = fVarA.Q();
                        if (android.support.v4.media.session.a.f1694d == null) {
                            i0.i(gVarQ, "delegate must not be null");
                            android.support.v4.media.session.a.f1694d = gVarQ;
                        }
                        f39339a = true;
                        try {
                            Parcel parcelJ = fVarA.J(9, fVarA.L());
                            int i11 = parcelJ.readInt();
                            parcelJ.recycle();
                            if (i11 == 2) {
                                f39340b = d.LATEST;
                            }
                            yz.b bVar = new yz.b(context);
                            Parcel parcelL = fVarA.L();
                            n00.d.d(parcelL, bVar);
                            parcelL.writeInt(0);
                            fVarA.M(10, parcelL);
                        } catch (RemoteException e5) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e5);
                        }
                        Log.d("e", "loadedRenderer: ".concat(String.valueOf(f39340b)));
                    } catch (RemoteException e11) {
                        throw new RuntimeRemoteException(e11);
                    }
                } catch (GooglePlayServicesNotAvailableException e12) {
                    return e12.f11045a;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return 0;
    }
}
