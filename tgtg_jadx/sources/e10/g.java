package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends rz.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new com.google.android.gms.common.internal.v(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f15502k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h10.f f15503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f15504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f15505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f15507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f15508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f15509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f15510t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f15511u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h10.c f15512v;

    public g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, ArrayList arrayList, h10.f fVar, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z11, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, h10.c cVar) {
        this.f15492a = str;
        this.f15493b = str2;
        this.f15494c = str3;
        this.f15495d = str4;
        this.f15496e = str5;
        this.f15497f = str6;
        this.f15498g = str7;
        this.f15499h = str8;
        this.f15500i = str9;
        this.f15501j = str10;
        this.f15502k = i11;
        this.l = arrayList;
        this.f15503m = fVar;
        this.f15504n = arrayList2;
        this.f15505o = str11;
        this.f15506p = str12;
        this.f15507q = arrayList3;
        this.f15508r = z11;
        this.f15509s = arrayList4;
        this.f15510t = arrayList5;
        this.f15511u = arrayList6;
        this.f15512v = cVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f15492a, parcel, 2);
        lx.u.b0(this.f15493b, parcel, 3);
        lx.u.b0(this.f15494c, parcel, 4);
        lx.u.b0(this.f15495d, parcel, 5);
        lx.u.b0(this.f15496e, parcel, 6);
        lx.u.b0(this.f15497f, parcel, 7);
        lx.u.b0(this.f15498g, parcel, 8);
        lx.u.b0(this.f15499h, parcel, 9);
        lx.u.b0(this.f15500i, parcel, 10);
        lx.u.b0(this.f15501j, parcel, 11);
        lx.u.g0(parcel, 12, 4);
        parcel.writeInt(this.f15502k);
        lx.u.f0(parcel, 13, this.l);
        lx.u.a0(parcel, 14, this.f15503m, i11);
        lx.u.f0(parcel, 15, this.f15504n);
        lx.u.b0(this.f15505o, parcel, 16);
        lx.u.b0(this.f15506p, parcel, 17);
        lx.u.f0(parcel, 18, this.f15507q);
        lx.u.g0(parcel, 19, 4);
        parcel.writeInt(this.f15508r ? 1 : 0);
        lx.u.f0(parcel, 20, this.f15509s);
        lx.u.f0(parcel, 21, this.f15510t);
        lx.u.f0(parcel, 22, this.f15511u);
        lx.u.a0(parcel, 23, this.f15512v, i11);
        lx.u.i0(iH0, parcel);
    }
}
