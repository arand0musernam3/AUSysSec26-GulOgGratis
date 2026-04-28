package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import e10.b0;
import h10.f;
import java.util.ArrayList;
import lx.u;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class CommonWalletObject extends a {

    @NonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f12196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f12197k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f12198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f12199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f12200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f12201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f12202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f12203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f12204s;

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, ArrayList arrayList, f fVar, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z11, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f12187a = str;
        this.f12188b = str2;
        this.f12189c = str3;
        this.f12190d = str4;
        this.f12191e = str5;
        this.f12192f = str6;
        this.f12193g = str7;
        this.f12194h = str8;
        this.f12195i = i11;
        this.f12196j = arrayList;
        this.f12197k = fVar;
        this.l = arrayList2;
        this.f12198m = str9;
        this.f12199n = str10;
        this.f12200o = arrayList3;
        this.f12201p = z11;
        this.f12202q = arrayList4;
        this.f12203r = arrayList5;
        this.f12204s = arrayList6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f12187a, parcel, 2);
        u.b0(this.f12188b, parcel, 3);
        u.b0(this.f12189c, parcel, 4);
        u.b0(this.f12190d, parcel, 5);
        u.b0(this.f12191e, parcel, 6);
        u.b0(this.f12192f, parcel, 7);
        u.b0(this.f12193g, parcel, 8);
        u.b0(this.f12194h, parcel, 9);
        u.g0(parcel, 10, 4);
        parcel.writeInt(this.f12195i);
        u.f0(parcel, 11, this.f12196j);
        u.a0(parcel, 12, this.f12197k, i11);
        u.f0(parcel, 13, this.l);
        u.b0(this.f12198m, parcel, 14);
        u.b0(this.f12199n, parcel, 15);
        u.f0(parcel, 16, this.f12200o);
        u.g0(parcel, 17, 4);
        parcel.writeInt(this.f12201p ? 1 : 0);
        u.f0(parcel, 18, this.f12202q);
        u.f0(parcel, 19, this.f12203r);
        u.f0(parcel, 20, this.f12204s);
        u.i0(iH0, parcel);
    }

    public CommonWalletObject() {
        this.f12196j = new ArrayList();
        this.l = new ArrayList();
        this.f12200o = new ArrayList();
        this.f12202q = new ArrayList();
        this.f12203r = new ArrayList();
        this.f12204s = new ArrayList();
    }
}
