package cy;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new b(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f13554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f13555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f13563k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0 f13565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13567p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f13568q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f13569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f13570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f13571t;

    public r(Parcel parcel) {
        String string = parcel.readString();
        tx.j.m(string, "loginBehavior");
        this.f13553a = q.valueOf(string);
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f13554b = new HashSet(arrayList);
        String string2 = parcel.readString();
        this.f13555c = string2 != null ? e.valueOf(string2) : e.NONE;
        String string3 = parcel.readString();
        tx.j.m(string3, "applicationId");
        this.f13556d = string3;
        this.f13557e = parcel.readString();
        this.f13558f = parcel.readString();
        String string4 = parcel.readString();
        tx.j.m(string4, "authId");
        this.f13559g = string4;
        this.f13560h = parcel.readByte() != 0;
        this.f13561i = parcel.readString();
        String string5 = parcel.readString();
        tx.j.m(string5, "authType");
        this.f13562j = string5;
        this.f13563k = parcel.readString();
        this.l = parcel.readString();
        this.f13564m = parcel.readByte() != 0;
        String string6 = parcel.readString();
        this.f13565n = string6 != null ? f0.valueOf(string6) : f0.FACEBOOK;
        this.f13566o = parcel.readByte() != 0;
        this.f13567p = parcel.readByte() != 0;
        String string7 = parcel.readString();
        tx.j.m(string7, "nonce");
        this.f13568q = string7;
        this.f13569r = parcel.readString();
        this.f13570s = parcel.readString();
        String string8 = parcel.readString();
        this.f13571t = string8 != null ? a.valueOf(string8) : null;
    }

    public final boolean a() {
        for (String str : this.f13554b) {
            a0 a0Var = b0.f13473i;
            if (str != null && (kotlin.text.y.p(str, "publish", false) || kotlin.text.y.p(str, "manage", false) || b0.f13474j.contains(str))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f13553a.name());
        parcel.writeStringList(new ArrayList(this.f13554b));
        parcel.writeString(this.f13555c.name());
        parcel.writeString(this.f13556d);
        parcel.writeString(this.f13557e);
        parcel.writeString(this.f13558f);
        parcel.writeString(this.f13559g);
        parcel.writeByte(this.f13560h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13561i);
        parcel.writeString(this.f13562j);
        parcel.writeString(this.f13563k);
        parcel.writeString(this.l);
        parcel.writeByte(this.f13564m ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13565n.name());
        parcel.writeByte(this.f13566o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13567p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13568q);
        parcel.writeString(this.f13569r);
        parcel.writeString(this.f13570s);
        a aVar = this.f13571t;
        parcel.writeString(aVar != null ? aVar.name() : null);
    }

    public r(q qVar, Set set, e eVar, String str, String str2, String str3, f0 f0Var, String str4, String str5, String str6, a aVar, String str7, String str8) {
        qVar.getClass();
        eVar.getClass();
        str3.getClass();
        this.f13553a = qVar;
        this.f13554b = set == null ? new HashSet() : set;
        this.f13555c = eVar;
        this.f13562j = str;
        this.f13556d = str2;
        this.f13557e = str7;
        this.f13558f = str8;
        this.f13559g = str3;
        this.f13565n = f0Var == null ? f0.FACEBOOK : f0Var;
        if (str4 != null && str4.length() != 0) {
            this.f13568q = str4;
        } else {
            this.f13568q = j4.s.e();
        }
        this.f13569r = str5;
        this.f13570s = str6;
        this.f13571t = aVar;
    }
}
