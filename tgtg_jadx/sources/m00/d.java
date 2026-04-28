package m00;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends a30.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f28654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d10.g f28655i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i11, d10.g gVar) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 8);
        this.f28654h = i11;
        switch (i11) {
            case 1:
                this.f28655i = gVar;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 8);
                break;
            default:
                this.f28655i = gVar;
                break;
        }
    }

    @Override // a30.d
    public final boolean O(int i11, Parcel parcel) {
        switch (this.f28654h) {
            case 0:
                if (i11 == 1) {
                    s00.c cVar = (s00.c) b.a(parcel, s00.c.CREATOR);
                    b.c(parcel);
                    na0.a.w0(cVar.f38504a, new ky.p(16), this.f28655i);
                }
                break;
            default:
                if (i11 == 1) {
                    Status status = (Status) b.a(parcel, Status.CREATOR);
                    Location location = (Location) b.a(parcel, Location.CREATOR);
                    b.c(parcel);
                    na0.a.w0(status, location, this.f28655i);
                }
                break;
        }
        return true;
    }
}
