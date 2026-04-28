package y00;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o4 extends rz.a {
    public static final Parcelable.Creator<o4> CREATOR = new d4(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f45054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f45057g;

    public o4(long j9, Object obj, String str, String str2) {
        com.google.android.gms.common.internal.i0.e(str);
        this.f45051a = 2;
        this.f45052b = str;
        this.f45053c = j9;
        this.f45056f = str2;
        if (obj == null) {
            this.f45054d = null;
            this.f45057g = null;
            this.f45055e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f45054d = (Long) obj;
            this.f45057g = null;
            this.f45055e = null;
        } else if (obj instanceof String) {
            this.f45054d = null;
            this.f45057g = null;
            this.f45055e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                i4.a.f("User attribute given of un-supported type");
                throw null;
            }
            this.f45054d = null;
            this.f45057g = (Double) obj;
            this.f45055e = null;
        }
    }

    public final Object d() {
        Long l = this.f45054d;
        if (l != null) {
            return l;
        }
        Double d3 = this.f45057g;
        if (d3 != null) {
            return d3;
        }
        String str = this.f45055e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        d4.a(this, parcel);
    }

    public o4(int i11, String str, long j9, Long l, Float f11, String str2, String str3, Double d3) {
        this.f45051a = i11;
        this.f45052b = str;
        this.f45053c = j9;
        this.f45054d = l;
        this.f45057g = i11 == 1 ? f11 != null ? Double.valueOf(f11.doubleValue()) : null : d3;
        this.f45055e = str2;
        this.f45056f = str3;
    }

    public o4(p4 p4Var) {
        this(p4Var.f45071d, p4Var.f45072e, p4Var.f45070c, p4Var.f45069b);
    }
}
