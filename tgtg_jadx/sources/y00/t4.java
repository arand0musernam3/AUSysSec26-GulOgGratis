package y00;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t4 extends rz.a {
    public static final Parcelable.Creator<t4> CREATOR = new d4(3);
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;
    public final long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f45179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f45180k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f45181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f45182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f45183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f45184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f45185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f45186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f45187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f45188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f45189u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f45190v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f45191w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f45192x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f45193y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f45194z;

    public t4(String str, String str2, String str3, long j9, String str4, long j11, long j12, String str5, boolean z11, boolean z12, String str6, long j13, int i11, boolean z13, boolean z14, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z15, long j15, int i12, String str10, int i13, long j16, String str11, String str12, long j17, int i14, long j18) {
        com.google.android.gms.common.internal.i0.e(str);
        this.f45170a = str;
        this.f45171b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f45172c = str3;
        this.f45179j = j9;
        this.f45173d = str4;
        this.f45174e = j11;
        this.f45175f = j12;
        this.f45176g = str5;
        this.f45177h = z11;
        this.f45178i = z12;
        this.f45180k = str6;
        this.l = j13;
        this.f45181m = i11;
        this.f45182n = z13;
        this.f45183o = z14;
        this.f45184p = bool;
        this.f45185q = j14;
        this.f45186r = list;
        this.f45187s = str7;
        this.f45188t = str8;
        this.f45189u = str9;
        this.f45190v = z15;
        this.f45191w = j15;
        this.f45192x = i12;
        this.f45193y = str10;
        this.f45194z = i13;
        this.A = j16;
        this.B = str11;
        this.C = str12;
        this.D = j17;
        this.E = i14;
        this.F = j18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f45170a, parcel, 2);
        lx.u.b0(this.f45171b, parcel, 3);
        lx.u.b0(this.f45172c, parcel, 4);
        lx.u.b0(this.f45173d, parcel, 5);
        lx.u.g0(parcel, 6, 8);
        parcel.writeLong(this.f45174e);
        lx.u.g0(parcel, 7, 8);
        parcel.writeLong(this.f45175f);
        lx.u.b0(this.f45176g, parcel, 8);
        lx.u.g0(parcel, 9, 4);
        parcel.writeInt(this.f45177h ? 1 : 0);
        lx.u.g0(parcel, 10, 4);
        parcel.writeInt(this.f45178i ? 1 : 0);
        lx.u.g0(parcel, 11, 8);
        parcel.writeLong(this.f45179j);
        lx.u.b0(this.f45180k, parcel, 12);
        lx.u.g0(parcel, 14, 8);
        parcel.writeLong(this.l);
        lx.u.g0(parcel, 15, 4);
        parcel.writeInt(this.f45181m);
        lx.u.g0(parcel, 16, 4);
        parcel.writeInt(this.f45182n ? 1 : 0);
        lx.u.g0(parcel, 18, 4);
        parcel.writeInt(this.f45183o ? 1 : 0);
        Boolean bool = this.f45184p;
        if (bool != null) {
            lx.u.g0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        lx.u.g0(parcel, 22, 8);
        parcel.writeLong(this.f45185q);
        lx.u.d0(parcel, 23, this.f45186r);
        lx.u.b0(this.f45187s, parcel, 25);
        lx.u.b0(this.f45188t, parcel, 26);
        lx.u.b0(this.f45189u, parcel, 27);
        lx.u.g0(parcel, 28, 4);
        parcel.writeInt(this.f45190v ? 1 : 0);
        lx.u.g0(parcel, 29, 8);
        parcel.writeLong(this.f45191w);
        lx.u.g0(parcel, 30, 4);
        parcel.writeInt(this.f45192x);
        lx.u.b0(this.f45193y, parcel, 31);
        lx.u.g0(parcel, 32, 4);
        parcel.writeInt(this.f45194z);
        lx.u.g0(parcel, 34, 8);
        parcel.writeLong(this.A);
        lx.u.b0(this.B, parcel, 35);
        lx.u.b0(this.C, parcel, 36);
        lx.u.g0(parcel, 37, 8);
        parcel.writeLong(this.D);
        lx.u.g0(parcel, 38, 4);
        parcel.writeInt(this.E);
        lx.u.g0(parcel, 39, 8);
        parcel.writeLong(this.F);
        lx.u.i0(iH0, parcel);
    }

    public t4(String str, String str2, String str3, String str4, long j9, long j11, String str5, boolean z11, boolean z12, long j12, String str6, long j13, int i11, boolean z13, boolean z14, Boolean bool, long j14, ArrayList arrayList, String str7, String str8, String str9, boolean z15, long j15, int i12, String str10, int i13, long j16, String str11, String str12, long j17, int i14, long j18) {
        this.f45170a = str;
        this.f45171b = str2;
        this.f45172c = str3;
        this.f45179j = j12;
        this.f45173d = str4;
        this.f45174e = j9;
        this.f45175f = j11;
        this.f45176g = str5;
        this.f45177h = z11;
        this.f45178i = z12;
        this.f45180k = str6;
        this.l = j13;
        this.f45181m = i11;
        this.f45182n = z13;
        this.f45183o = z14;
        this.f45184p = bool;
        this.f45185q = j14;
        this.f45186r = arrayList;
        this.f45187s = str7;
        this.f45188t = str8;
        this.f45189u = str9;
        this.f45190v = z15;
        this.f45191w = j15;
        this.f45192x = i12;
        this.f45193y = str10;
        this.f45194z = i13;
        this.A = j16;
        this.B = str11;
        this.C = str12;
        this.D = j17;
        this.E = i14;
        this.F = j18;
    }
}
