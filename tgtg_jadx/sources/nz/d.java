package nz;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import d10.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends a30.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f31454i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i11, g gVar) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback", 2);
        this.f31453h = i11;
        switch (i11) {
            case 1:
                this.f31454i = gVar;
                super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback", 2);
                break;
            default:
                this.f31454i = gVar;
                break;
        }
    }

    @Override // a30.d
    public final boolean J(int i11, Parcel parcel) {
        switch (this.f31453h) {
            case 0:
                if (i11 == 1) {
                    Status status = (Status) g00.b.a(parcel, Status.CREATOR);
                    boolean z11 = parcel.readInt() != 0;
                    a30.d.K(parcel);
                    status.getClass();
                    na0.a.w0(status, Boolean.valueOf(z11), this.f31454i);
                }
                break;
            default:
                if (i11 == 1) {
                    Status status2 = (Status) g00.b.a(parcel, Status.CREATOR);
                    mz.e eVar = (mz.e) g00.b.a(parcel, mz.e.CREATOR);
                    a30.d.K(parcel);
                    status2.getClass();
                    eVar.getClass();
                    na0.a.w0(status2, eVar, this.f31454i);
                }
                break;
        }
        return true;
    }
}
