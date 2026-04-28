package ax;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<o0> CREATOR = new n0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f4985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f4986g;

    public o0(JSONObject jSONObject) {
        this.f4980a = jSONObject.optString("id", null);
        this.f4981b = jSONObject.optString("first_name", null);
        this.f4982c = jSONObject.optString("middle_name", null);
        this.f4983d = jSONObject.optString("last_name", null);
        this.f4984e = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f4985f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.f4986g = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        String str5 = this.f4980a;
        return ((str5 == null && ((o0) obj).f4980a == null) || Intrinsics.areEqual(str5, ((o0) obj).f4980a)) && (((str = this.f4981b) == null && ((o0) obj).f4981b == null) || Intrinsics.areEqual(str, ((o0) obj).f4981b)) && ((((str2 = this.f4982c) == null && ((o0) obj).f4982c == null) || Intrinsics.areEqual(str2, ((o0) obj).f4982c)) && ((((str3 = this.f4983d) == null && ((o0) obj).f4983d == null) || Intrinsics.areEqual(str3, ((o0) obj).f4983d)) && ((((str4 = this.f4984e) == null && ((o0) obj).f4984e == null) || Intrinsics.areEqual(str4, ((o0) obj).f4984e)) && ((((uri = this.f4985f) == null && ((o0) obj).f4985f == null) || Intrinsics.areEqual(uri, ((o0) obj).f4985f)) && (((uri2 = this.f4986g) == null && ((o0) obj).f4986g == null) || Intrinsics.areEqual(uri2, ((o0) obj).f4986g))))));
    }

    public final int hashCode() {
        String str = this.f4980a;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f4981b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f4982c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f4983d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f4984e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f4985f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f4986g;
        if (uri2 != null) {
            return uri2.hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f4980a);
        parcel.writeString(this.f4981b);
        parcel.writeString(this.f4982c);
        parcel.writeString(this.f4983d);
        parcel.writeString(this.f4984e);
        Uri uri = this.f4985f;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.f4986g;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }

    public o0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        tx.j.m(str, "id");
        this.f4980a = str;
        this.f4981b = str2;
        this.f4982c = str3;
        this.f4983d = str4;
        this.f4984e = str5;
        this.f4985f = uri;
        this.f4986g = uri2;
    }

    public o0(Parcel parcel) {
        this.f4980a = parcel.readString();
        this.f4981b = parcel.readString();
        this.f4982c = parcel.readString();
        this.f4983d = parcel.readString();
        this.f4984e = parcel.readString();
        String string = parcel.readString();
        this.f4985f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f4986g = string2 != null ? Uri.parse(string2) : null;
    }
}
