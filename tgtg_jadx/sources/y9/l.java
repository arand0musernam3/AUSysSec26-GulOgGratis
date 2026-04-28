package y9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Binder implements g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f45693g;

    public l(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f45693g = multiInstanceInvalidationService;
        attachInterface(this, g.f45662f);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        m mVar;
        String str = g.f45662f;
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i11 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        f fVar = null;
        f fVar2 = null;
        if (i11 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(f.f45658e);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) {
                    e eVar = new e();
                    eVar.f45657g = strongBinder;
                    fVar = eVar;
                } else {
                    fVar = (f) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            fVar.getClass();
            int i13 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f45693g;
                synchronized (multiInstanceInvalidationService.f4001c) {
                    try {
                        int i14 = multiInstanceInvalidationService.f3999a + 1;
                        multiInstanceInvalidationService.f3999a = i14;
                        if (multiInstanceInvalidationService.f4001c.register(fVar, Integer.valueOf(i14))) {
                            multiInstanceInvalidationService.f4000b.put(Integer.valueOf(i14), string);
                            i13 = i14;
                        } else {
                            multiInstanceInvalidationService.f3999a--;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i13);
            return true;
        }
        if (i11 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(f.f45658e);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof f)) {
                    e eVar2 = new e();
                    eVar2.f45657g = strongBinder2;
                    fVar2 = eVar2;
                } else {
                    fVar2 = (f) iInterfaceQueryLocalInterface2;
                }
            }
            int i15 = parcel.readInt();
            fVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f45693g;
            synchronized (multiInstanceInvalidationService2.f4001c) {
                multiInstanceInvalidationService2.f4001c.unregister(fVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i11 != 3) {
            return super.onTransact(i11, parcel, parcel2, i12);
        }
        int i16 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f45693g;
        synchronized (multiInstanceInvalidationService3.f4001c) {
            String str2 = (String) multiInstanceInvalidationService3.f4000b.get(Integer.valueOf(i16));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService3.f4001c.beginBroadcast();
                int i17 = 0;
                while (true) {
                    mVar = multiInstanceInvalidationService3.f4001c;
                    if (i17 >= iBeginBroadcast) {
                        break;
                    }
                    try {
                        Object broadcastCookie = mVar.getBroadcastCookie(i17);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.f4000b.get(num);
                        if (i16 != iIntValue && Intrinsics.areEqual(str2, str3)) {
                            try {
                                ((f) multiInstanceInvalidationService3.f4001c.getBroadcastItem(i17)).k(strArrCreateStringArray);
                            } catch (RemoteException e5) {
                                Log.w("ROOM", "Error invoking a remote callback", e5);
                            }
                        }
                        i17++;
                    } catch (Throwable th3) {
                        multiInstanceInvalidationService3.f4001c.finishBroadcast();
                        throw th3;
                    }
                }
                mVar.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
