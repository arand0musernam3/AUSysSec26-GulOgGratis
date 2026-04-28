package f00;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.i0;
import org.json.JSONException;
import qz.b0;
import qz.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends a30.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f17028i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i11, d10.g gVar) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 1);
        this.f17027h = i11;
        switch (i11) {
            case 1:
                this.f17028i = gVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 1);
                break;
            default:
                this.f17028i = gVar;
                break;
        }
    }

    @Override // a30.d
    public final boolean N(int i11, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResultDoWrite;
        BasePendingResult basePendingResultDoWrite2;
        String strE;
        int i12 = this.f17027h;
        Object obj = this.f17028i;
        switch (i12) {
            case 0:
                if (i11 != 1) {
                    return false;
                }
                Status status = (Status) g.a(parcel, Status.CREATOR);
                jz.f fVar = (jz.f) g.a(parcel, jz.f.CREATOR);
                g.b(parcel);
                na0.a.w0(status, fVar, (d10.g) obj);
                return true;
            case 1:
                if (i11 != 1) {
                    return false;
                }
                Status status2 = (Status) g.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) g.a(parcel, PendingIntent.CREATOR);
                g.b(parcel);
                na0.a.w0(status2, pendingIntent, (d10.g) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i11 != 1) {
                    if (i11 != 2) {
                        return false;
                    }
                    U();
                    lz.i.H(revocationBoundService).I();
                    return true;
                }
                U();
                lz.b bVarA = lz.b.a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountB = bVarA.b();
                GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f11018k;
                if (googleSignInAccountB != null) {
                    String strE2 = bVarA.e("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strE2) || (strE = bVarA.e(lz.b.f("googleSignInOptions", strE2))) == null) {
                        googleSignInOptionsD = null;
                    } else {
                        try {
                            googleSignInOptionsD = GoogleSignInOptions.d(strE);
                        } catch (JSONException unused) {
                            googleSignInOptionsD = null;
                        }
                    }
                }
                GoogleSignInOptions googleSignInOptions = googleSignInOptionsD;
                i0.h(googleSignInOptions);
                kz.a aVar = new kz.a((RevocationBoundService) obj, null, iz.a.f24243a, googleSignInOptions, new k(new l20.c(10), Looper.getMainLooper()));
                if (googleSignInAccountB == null) {
                    o oVarAsGoogleApiClient = aVar.asGoogleApiClient();
                    Context applicationContext = aVar.getApplicationContext();
                    boolean z11 = aVar.c() == 3;
                    lz.h.f28443a.h("Signing out", new Object[0]);
                    lz.h.a(applicationContext);
                    if (z11) {
                        basePendingResultDoWrite = new s(oVarAsGoogleApiClient);
                        basePendingResultDoWrite.e(Status.f11054e);
                    } else {
                        basePendingResultDoWrite = ((b0) oVarAsGoogleApiClient).f37314b.doWrite(new lz.g(oVarAsGoogleApiClient, 0));
                    }
                    basePendingResultDoWrite.a(new a0(basePendingResultDoWrite, new d10.g(), new r40.d()));
                    return true;
                }
                o oVarAsGoogleApiClient2 = aVar.asGoogleApiClient();
                Context applicationContext2 = aVar.getApplicationContext();
                boolean z12 = aVar.c() == 3;
                lz.h.f28443a.h("Revoking access", new Object[0]);
                String strE3 = lz.b.a(applicationContext2).e("refreshToken");
                lz.h.a(applicationContext2);
                if (!z12) {
                    basePendingResultDoWrite2 = ((b0) oVarAsGoogleApiClient2).f37314b.doWrite(new lz.g(oVarAsGoogleApiClient2, 1));
                } else if (strE3 == null) {
                    a3.j jVar = lz.c.f28434c;
                    Status status3 = new Status(4, null, null, null);
                    i0.a("Status code must not be SUCCESS", !status3.d());
                    basePendingResultDoWrite2 = new r(status3);
                    basePendingResultDoWrite2.e(status3);
                } else {
                    lz.c cVar = new lz.c(strE3);
                    new Thread(cVar).start();
                    basePendingResultDoWrite2 = cVar.f28436b;
                }
                basePendingResultDoWrite2.a(new a0(basePendingResultDoWrite2, new d10.g(), new r40.d()));
                return true;
        }
    }

    public void U() {
        if (!vz.c.d((RevocationBoundService) this.f17028i, Binder.getCallingUid())) {
            throw new SecurityException(r8.k.h(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.f17027h = 2;
        this.f17028i = revocationBoundService;
    }
}
