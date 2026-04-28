package cy;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<t> CREATOR = new b(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f13572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax.b f13573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ax.l f13574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f13577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f13578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f13579h;

    public t(Parcel parcel) {
        String string = parcel.readString();
        this.f13572a = s.valueOf(string == null ? StatusResponseUtils.RESULT_ERROR : string);
        this.f13573b = (ax.b) parcel.readParcelable(ax.b.class.getClassLoader());
        this.f13574c = (ax.l) parcel.readParcelable(ax.l.class.getClassLoader());
        this.f13575d = parcel.readString();
        this.f13576e = parcel.readString();
        this.f13577f = (r) parcel.readParcelable(r.class.getClassLoader());
        this.f13578g = n0.E(parcel);
        this.f13579h = n0.E(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f13572a.name());
        parcel.writeParcelable(this.f13573b, i11);
        parcel.writeParcelable(this.f13574c, i11);
        parcel.writeString(this.f13575d);
        parcel.writeString(this.f13576e);
        parcel.writeParcelable(this.f13577f, i11);
        n0.I(parcel, this.f13578g);
        n0.I(parcel, this.f13579h);
    }

    public t(r rVar, s sVar, ax.b bVar, ax.l lVar, String str, String str2) {
        sVar.getClass();
        this.f13577f = rVar;
        this.f13573b = bVar;
        this.f13574c = lVar;
        this.f13575d = str;
        this.f13572a = sVar;
        this.f13576e = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(r rVar, s sVar, ax.b bVar, String str, String str2) {
        this(rVar, sVar, bVar, null, str, str2);
        sVar.getClass();
    }
}
