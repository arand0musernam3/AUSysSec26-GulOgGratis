package a30;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import c50.w;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.IntegrityServiceException;
import j4.s;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends Binder implements IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f652g;

    public d(String str, int i11) {
        this.f652g = i11;
        switch (i11) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
            case 5:
            case 7:
            default:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 6:
                attachInterface(this, str);
                break;
            case 8:
                attachInterface(this, str);
                break;
            case 9:
                attachInterface(this, str);
                break;
        }
    }

    public static void K(Parcel parcel) {
        int i11 = g00.b.f18063a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(s.f(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void L(Parcel parcel) {
        int i11 = l00.a.f26750a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(e0.f.h(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
        }
    }

    public abstract boolean J(int i11, Parcel parcel);

    public abstract boolean M(int i11, Parcel parcel, Parcel parcel2);

    public abstract boolean N(int i11, Parcel parcel, Parcel parcel2);

    public abstract boolean O(int i11, Parcel parcel);

    public boolean P(int i11, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i11 = this.f652g;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        boolean zOnTransact;
        int i13 = 1;
        boolean zOnTransact2 = false;
        switch (this.f652g) {
            case 0:
                if (i11 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i11, parcel, parcel2, i12)) {
                    return true;
                }
                z20.g gVar = (z20.g) this;
                if (i11 == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i14 = e.f653a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(s.f(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    gVar.U(bundle);
                    return true;
                }
                if (i11 != 3) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                int i15 = e.f653a;
                Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(s.f(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                gVar.A(bundle2);
                return true;
            case 1:
                if (i11 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i11, parcel, parcel2, i12)) {
                    return true;
                }
                return N(i11, parcel, parcel2);
            case 2:
                if (i11 > 16777215) {
                    zOnTransact2 = super.onTransact(i11, parcel, parcel2, i12);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact2) {
                    return true;
                }
                return J(i11, parcel);
            case 3:
                if (i11 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i11, parcel, parcel2, i12)) {
                    return true;
                }
                f30.f fVar = (f30.f) this;
                if (i11 != 2) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i16 = g30.a.f19907a;
                Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int iDataAvail3 = parcel.dataAvail();
                if (iDataAvail3 > 0) {
                    throw new BadParcelableException(s.f(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                g30.h hVar = fVar.f17283j.f17285a;
                if (hVar != null) {
                    d10.g gVar2 = fVar.f17282i;
                    synchronized (hVar.f19922f) {
                        hVar.f19921e.remove(gVar2);
                        break;
                    }
                    hVar.a().post(new g30.g(hVar, zOnTransact2 ? 1 : 0));
                }
                fVar.f17281h.b("onGetLaunchReviewFlowInfo", new Object[0]);
                fVar.f17282i.d(new f30.b((PendingIntent) bundle3.get("confirmation_intent"), bundle3.getBoolean("is_review_no_op")));
                return true;
            case 4:
                if (i11 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i11, parcel, parcel2, i12)) {
                    return true;
                }
                return M(i11, parcel, parcel2);
            case 5:
                if (i11 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i11, parcel, parcel2, i12)) {
                    return true;
                }
                d30.d dVar = (d30.d) this;
                if (i11 != 2) {
                    return false;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                int i17 = i30.i.f23221a;
                Bundle bundle4 = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator4.createFromParcel(parcel));
                int iDataAvail4 = parcel.dataAvail();
                if (iDataAvail4 > 0) {
                    throw new BadParcelableException(s.f(iDataAvail4, "Parcel data not fully consumed, unread size: "));
                }
                i30.c cVar = dVar.f14017j.f14021d;
                d10.g gVar3 = dVar.f14016i;
                synchronized (cVar.f23208f) {
                    cVar.f23207e.remove(gVar3);
                    break;
                }
                cVar.a().post(new i30.b(cVar, i13));
                dVar.f14015h.a("onRequestIntegrityToken", new Object[0]);
                dVar.f14017j.f14020c.getClass();
                int i18 = bundle4.getInt(StatusResponseUtils.RESULT_ERROR);
                IntegrityServiceException integrityServiceException = i18 == 0 ? null : new IntegrityServiceException(i18, null);
                if (integrityServiceException != null) {
                    dVar.f14016i.c(integrityServiceException);
                    return true;
                }
                String string = bundle4.getString("token");
                if (string == null) {
                    dVar.f14016i.c(new IntegrityServiceException(-100, null));
                    return true;
                }
                bundle4.getLong("request.token.sid");
                String str = dVar.f14017j.f14019b;
                r8.k.g(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                dVar.f14016i.d(new d30.h(string));
                return true;
            case 6:
                if (i11 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i11, parcel, parcel2, i12)) {
                    return true;
                }
                return P(i11, parcel, parcel2);
            case 7:
                if (i11 > 16777215) {
                    zOnTransact = super.onTransact(i11, parcel, parcel2, i12);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                d00.e eVar = (d00.e) this;
                switch (i11) {
                    case 1:
                        Status status = (Status) l00.a.a(parcel, Status.CREATOR);
                        c00.o oVar = (c00.o) l00.a.a(parcel, c00.o.CREATOR);
                        L(parcel);
                        int i19 = eVar.f13665h;
                        status.getClass();
                        switch (i19) {
                            case 1:
                                na0.a.w0(status, oVar, eVar.f13666i);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        Status status2 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status2.getClass();
                        w.d();
                        break;
                    case 3:
                        Status status3 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status3.getClass();
                        w.d();
                        break;
                    case 4:
                        Status status4 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status4.getClass();
                        w.d();
                        break;
                    case 5:
                        Status status5 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status5.getClass();
                        w.d();
                        break;
                    case 6:
                        Status status6 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status6.getClass();
                        w.d();
                        break;
                    case 7:
                        Status status7 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status7.getClass();
                        throw new UnsupportedOperationException();
                    case 8:
                        Status status8 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status8.getClass();
                        w.d();
                        break;
                    case 9:
                        Status status9 = (Status) l00.a.a(parcel, Status.CREATOR);
                        c00.c cVar2 = (c00.c) l00.a.a(parcel, c00.c.CREATOR);
                        L(parcel);
                        int i21 = eVar.f13665h;
                        status9.getClass();
                        switch (i21) {
                            case 0:
                                na0.a.w0(status9, cVar2, eVar.f13666i);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 10:
                        Status status10 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status10.getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        Status status11 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status11.getClass();
                        w.d();
                        break;
                    case 12:
                        Status status12 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status12.getClass();
                        w.d();
                        break;
                    case 13:
                        Status status13 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status13.getClass();
                        w.d();
                        break;
                    case 14:
                        Status status14 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status14.getClass();
                        w.d();
                        break;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        Status status15 = (Status) l00.a.a(parcel, Status.CREATOR);
                        L(parcel);
                        status15.getClass();
                        w.d();
                        break;
                }
                return false;
            case 8:
                if (i11 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i11, parcel, parcel2, i12)) {
                    return true;
                }
                return O(i11, parcel);
            case 9:
                if (i11 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i11, parcel, parcel2, i12)) {
                    return true;
                }
                return P(i11, parcel, parcel2);
            default:
                if (i11 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i11, parcel, parcel2, i12)) {
                    return true;
                }
                switch (i11) {
                    case 1:
                        parcel.readInt();
                        r00.a.b(parcel);
                        return true;
                    case 2:
                        parcel.readInt();
                        r00.a.b(parcel);
                        return true;
                    case 3:
                        int i22 = parcel.readInt();
                        int i23 = r00.a.f37511a;
                        boolean z11 = parcel.readInt() != 0;
                        r00.a.b(parcel);
                        T(i22, z11);
                        return true;
                    case 4:
                        parcel.readInt();
                        r00.a.b(parcel);
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        parcel.readInt();
                        int i24 = r00.a.f37511a;
                        parcel.readInt();
                        r00.a.b(parcel);
                        return true;
                    case 7:
                        r00.a.b(parcel);
                        return true;
                    case 8:
                        r00.a.b(parcel);
                        return true;
                    case 9:
                        Status status16 = (Status) r00.a.a(parcel, Status.CREATOR);
                        boolean z12 = parcel.readInt() != 0;
                        r00.a.b(parcel);
                        Q(status16, z12);
                        return true;
                    case 10:
                        r00.a.b(parcel);
                        return true;
                    case 11:
                        r00.a.b(parcel);
                        return true;
                    case 12:
                        r00.a.b(parcel);
                        return true;
                    case 13:
                        r00.a.b(parcel);
                        return true;
                    case 14:
                        Status status17 = (Status) r00.a.a(parcel, Status.CREATOR);
                        e10.l lVar = (e10.l) r00.a.a(parcel, e10.l.CREATOR);
                        r00.a.b(parcel);
                        S(status17, lVar);
                        return true;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        r00.a.b(parcel);
                        return true;
                    case 16:
                        r00.a.b(parcel);
                        return true;
                    case 17:
                        r00.a.b(parcel);
                        return true;
                    case 18:
                        parcel.readInt();
                        r00.a.b(parcel);
                        return true;
                    case 19:
                        Status status18 = (Status) r00.a.a(parcel, Status.CREATOR);
                        e10.j jVar = (e10.j) r00.a.a(parcel, e10.j.CREATOR);
                        r00.a.b(parcel);
                        R(status18, jVar);
                        return true;
                    case 20:
                        r00.a.b(parcel);
                        return true;
                }
        }
    }

    public d() {
        this.f652g = 10;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public void Q(Status status, boolean z11) {
    }

    public void R(Status status, e10.j jVar) {
    }

    public void S(Status status, e10.l lVar) {
    }

    public void T(int i11, boolean z11) {
    }

    public /* synthetic */ d(int i11) {
        this.f652g = i11;
    }
}
