package qz;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends a30.d implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a10.b f37356o = a10.c.f192a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f37357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f37358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a10.b f37359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Set f37360k;
    public final com.google.android.gms.common.internal.i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b10.a f37361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i2.x f37362n;

    public j0(Context context, Handler handler, com.google.android.gms.common.internal.i iVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 4);
        this.f37357h = context;
        this.f37358i = handler;
        this.l = iVar;
        this.f37360k = iVar.f11118a;
        this.f37359j = f37356o;
    }

    @Override // qz.f
    public final void C() {
        b10.a aVar = this.f37361m;
        aVar.getClass();
        boolean z11 = false;
        try {
            aVar.f5542b.getClass();
            Account account = new Account(com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountB = com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT.equals(account.name) ? lz.b.a(aVar.getContext()).b() : null;
            Integer num = aVar.f5544d;
            com.google.android.gms.common.internal.i0.h(num);
            com.google.android.gms.common.internal.b0 b0Var = new com.google.android.gms.common.internal.b0(2, account, num.intValue(), googleSignInAccountB);
            b10.c cVar = (b10.c) aVar.getService();
            cVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(cVar.f11628i);
            int i11 = h00.a.f20992a;
            parcelObtain.writeInt(1);
            int iH0 = lx.u.h0(20293, parcelObtain);
            lx.u.g0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            lx.u.a0(parcelObtain, 2, b0Var, 0);
            lx.u.i0(iH0, parcelObtain);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                cVar.f11627h.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e5) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f37358i.post(new o30.m0(this, new b10.e(1, new pz.b(8, null, null), null), z11, 14));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e5);
            }
        }
    }

    @Override // a30.d
    public final boolean M(int i11, Parcel parcel, Parcel parcel2) {
        switch (i11) {
            case 3:
                h00.a.b(parcel);
                break;
            case 4:
                h00.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                h00.a.b(parcel);
                break;
            case 7:
                h00.a.b(parcel);
                break;
            case 8:
                b10.e eVar = (b10.e) h00.a.a(parcel, b10.e.CREATOR);
                h00.a.b(parcel);
                this.f37358i.post(new o30.m0(this, eVar, false, 14));
                break;
            case 9:
                h00.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // qz.n
    public final void a(pz.b bVar) {
        this.f37362n.f(bVar);
    }

    @Override // qz.f
    public final void b(int i11) {
        i2.x xVar = this.f37362n;
        z zVar = (z) ((g) xVar.f22932f).f37345j.get((a) xVar.f22929c);
        if (zVar != null) {
            if (zVar.f37409o) {
                zVar.n(new pz.b(17, null, null));
            } else {
                zVar.b(i11);
            }
        }
    }
}
