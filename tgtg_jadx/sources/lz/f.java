package lz;

import android.os.IInterface;
import android.os.Parcel;
import c50.w;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends a30.d implements IInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f28440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f28441i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i11) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
        this.f28440h = i11;
        this.f28441i = gVar;
    }

    @Override // a30.d
    public final boolean N(int i11, Parcel parcel, Parcel parcel2) {
        switch (i11) {
            case 101:
                f00.g.b(parcel);
                w.d();
                return false;
            case 102:
                Status status = (Status) f00.g.a(parcel, Status.CREATOR);
                f00.g.b(parcel);
                switch (this.f28440h) {
                    case 0:
                        this.f28441i.e(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case 103:
                Status status2 = (Status) f00.g.a(parcel, Status.CREATOR);
                f00.g.b(parcel);
                switch (this.f28440h) {
                    case 1:
                        this.f28441i.e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
