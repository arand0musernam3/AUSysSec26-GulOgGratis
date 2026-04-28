package c00;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends rz.a {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new n0(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f6808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f6809b;

    public f(PendingIntent pendingIntent, h hVar) {
        this.f6808a = pendingIntent;
        this.f6809b = hVar;
        if (pendingIntent == null && hVar == null) {
            i4.a.f("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.a0(parcel, 1, this.f6808a, i11);
        lx.u.a0(parcel, 2, this.f6809b, i11);
        lx.u.i0(iH0, parcel);
    }
}
