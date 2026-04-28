package ax;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.braze.models.Banner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f4871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f4872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f4873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f4874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f4876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f4877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Date f4880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f4881k;
    public static final Date l = new Date(LongCompanionObject.MAX_VALUE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Date f4869m = new Date();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k f4870n = k.FACEBOOK_APPLICATION_WEB;

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a00.p0(24);

    public b(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, k kVar, Date date, Date date2, Date date3, String str4) {
        w.a0.C(str, str2, str3);
        tx.j.k(str, "accessToken");
        tx.j.k(str2, "applicationId");
        tx.j.k(str3, "userId");
        Date date4 = l;
        this.f4871a = date == null ? date4 : date;
        Set setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        setUnmodifiableSet.getClass();
        this.f4872b = setUnmodifiableSet;
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        setUnmodifiableSet2.getClass();
        this.f4873c = setUnmodifiableSet2;
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        setUnmodifiableSet3.getClass();
        this.f4874d = setUnmodifiableSet3;
        this.f4875e = str;
        kVar = kVar == null ? f4870n : kVar;
        if (str4 != null && str4.equals("instagram")) {
            int i11 = a.$EnumSwitchMapping$0[kVar.ordinal()];
            if (i11 == 1) {
                kVar = k.INSTAGRAM_APPLICATION_WEB;
            } else if (i11 == 2) {
                kVar = k.INSTAGRAM_CUSTOM_CHROME_TAB;
            } else if (i11 == 3) {
                kVar = k.INSTAGRAM_WEB_VIEW;
            }
        }
        this.f4876f = kVar;
        this.f4877g = date2 == null ? f4869m : date2;
        this.f4878h = str2;
        this.f4879i = str3;
        this.f4880j = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.f4881k = str4 == null ? "facebook" : str4;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f4875e);
        jSONObject.put(Banner.EXPIRATION, this.f4871a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f4872b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f4873c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f4874d));
        jSONObject.put("last_refresh", this.f4877g.getTime());
        jSONObject.put("source", this.f4876f.name());
        jSONObject.put("application_id", this.f4878h);
        jSONObject.put("user_id", this.f4879i);
        jSONObject.put("data_access_expiration_time", this.f4880j.getTime());
        String str = this.f4881k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Intrinsics.areEqual(this.f4871a, bVar.f4871a) && Intrinsics.areEqual(this.f4872b, bVar.f4872b) && Intrinsics.areEqual(this.f4873c, bVar.f4873c) && Intrinsics.areEqual(this.f4874d, bVar.f4874d) && Intrinsics.areEqual(this.f4875e, bVar.f4875e) && this.f4876f == bVar.f4876f && Intrinsics.areEqual(this.f4877g, bVar.f4877g) && Intrinsics.areEqual(this.f4878h, bVar.f4878h) && Intrinsics.areEqual(this.f4879i, bVar.f4879i) && Intrinsics.areEqual(this.f4880j, bVar.f4880j)) {
            String str = bVar.f4881k;
            String str2 = this.f4881k;
            if (str2 == null ? str == null : Intrinsics.areEqual(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f4880j.hashCode() + l1.b(l1.b((this.f4877g.hashCode() + ((this.f4876f.hashCode() + l1.b((this.f4874d.hashCode() + ((this.f4873c.hashCode() + ((this.f4872b.hashCode() + ((this.f4871a.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31, this.f4875e)) * 31)) * 31, 31, this.f4878h), 31, this.f4879i)) * 31;
        String str = this.f4881k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        a0.g(m0.INCLUDE_ACCESS_TOKENS);
        sb2.append(TextUtils.join(", ", this.f4872b));
        sb2.append("]}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeLong(this.f4871a.getTime());
        parcel.writeStringList(new ArrayList(this.f4872b));
        parcel.writeStringList(new ArrayList(this.f4873c));
        parcel.writeStringList(new ArrayList(this.f4874d));
        parcel.writeString(this.f4875e);
        parcel.writeString(this.f4876f.name());
        parcel.writeLong(this.f4877g.getTime());
        parcel.writeString(this.f4878h);
        parcel.writeString(this.f4879i);
        parcel.writeLong(this.f4880j.getTime());
        parcel.writeString(this.f4881k);
    }

    public /* synthetic */ b(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, k kVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, kVar, date, date2, date3, "facebook");
    }

    public b(Parcel parcel) {
        k kVarValueOf;
        this.f4871a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet.getClass();
        this.f4872b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet2.getClass();
        this.f4873c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet3.getClass();
        this.f4874d = setUnmodifiableSet3;
        String string = parcel.readString();
        tx.j.m(string, "token");
        this.f4875e = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            kVarValueOf = k.valueOf(string2);
        } else {
            kVarValueOf = f4870n;
        }
        this.f4876f = kVarValueOf;
        this.f4877g = new Date(parcel.readLong());
        String string3 = parcel.readString();
        tx.j.m(string3, "applicationId");
        this.f4878h = string3;
        String string4 = parcel.readString();
        tx.j.m(string4, "userId");
        this.f4879i = string4;
        this.f4880j = new Date(parcel.readLong());
        this.f4881k = parcel.readString();
    }
}
