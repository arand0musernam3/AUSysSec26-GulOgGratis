package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y9 extends n5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12058g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12059h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(aa aaVar, d10.g gVar) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.f12059h = gVar;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i11, Parcel parcel, Parcel parcel2) {
        switch (this.f12058g) {
            case 0:
                if (i11 == 2) {
                    Status status = (Status) o5.a(parcel, Status.CREATOR);
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    o5.d(parcel);
                    d10.g gVar = (d10.g) this.f12059h;
                    if (status.d()) {
                        try {
                            c1 c1Var = c1.f11297a;
                            int i12 = p0.f11740a;
                            na0.a.w0(status, ub.v(bArrCreateByteArray, c1.f11298b), gVar);
                        } catch (zzaeh e5) {
                            gVar.a(e5);
                        }
                    } else {
                        na0.a.w0(status, null, gVar);
                    }
                }
                break;
            case 1:
                d10.g gVar2 = (d10.g) this.f12059h;
                switch (i11) {
                    case 1:
                        Status status2 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status2, null, gVar2);
                        break;
                    case 2:
                        Status status3 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status3, null, gVar2);
                        break;
                    case 3:
                        Status status4 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status4, null, gVar2);
                        break;
                    case 4:
                        Status status5 = (Status) o5.a(parcel, Status.CREATOR);
                        r9 r9Var = (r9) o5.a(parcel, r9.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status5, r9Var, gVar2);
                        break;
                    case 5:
                        Status status6 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status6, null, gVar2);
                        break;
                    case 6:
                        Status status7 = (Status) o5.a(parcel, Status.CREATOR);
                        t9 t9Var = (t9) o5.a(parcel, t9.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status7, t9Var, gVar2);
                        break;
                    case 7:
                        Status status8 = (Status) o5.a(parcel, Status.CREATOR);
                        s9 s9Var = (s9) o5.a(parcel, s9.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status8, s9Var, gVar2);
                        break;
                    case 8:
                        Status status9 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status9, null, gVar2);
                        break;
                    case 9:
                        Status status10 = (Status) o5.a(parcel, Status.CREATOR);
                        u9 u9Var = (u9) o5.a(parcel, u9.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status10, u9Var, gVar2);
                        break;
                    case 10:
                        Status status11 = (Status) o5.a(parcel, Status.CREATOR);
                        r9 r9Var2 = (r9) o5.a(parcel, r9.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status11, r9Var2, gVar2);
                        break;
                    case 11:
                        Status status12 = (Status) o5.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        o5.d(parcel);
                        na0.a.w0(status12, null, gVar2);
                        break;
                    case 12:
                        Status status13 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status13, null, gVar2);
                        break;
                    case 13:
                        Status status14 = (Status) o5.a(parcel, Status.CREATOR);
                        w9 w9Var = (w9) o5.a(parcel, w9.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status14, w9Var, gVar2);
                        break;
                    case 14:
                        Status status15 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status15, null, gVar2);
                        break;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        Status status16 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        na0.a.w0(status16, null, gVar2);
                        break;
                    case 16:
                        Status status17 = (Status) o5.a(parcel, Status.CREATOR);
                        long j9 = parcel.readLong();
                        o5.d(parcel);
                        na0.a.w0(status17, Long.valueOf(j9), gVar2);
                        break;
                }
                break;
            default:
                if (i11 == 2) {
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    o5.d(parcel);
                    ((qz.m) this.f12059h).a(new s5(this, bArrCreateByteArray2));
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(aa aaVar, qz.m mVar) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.f12059h = mVar;
    }

    public y9(d10.g gVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f12059h = gVar;
    }
}
