package y00;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends rz.a {
    public static final Parcelable.Creator<e> CREATOR = new s00.e(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o4 f44691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f44695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f44696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f44697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f44698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f44699k;

    public e(e eVar) {
        com.google.android.gms.common.internal.i0.h(eVar);
        this.f44689a = eVar.f44689a;
        this.f44690b = eVar.f44690b;
        this.f44691c = eVar.f44691c;
        this.f44692d = eVar.f44692d;
        this.f44693e = eVar.f44693e;
        this.f44694f = eVar.f44694f;
        this.f44695g = eVar.f44695g;
        this.f44696h = eVar.f44696h;
        this.f44697i = eVar.f44697i;
        this.f44698j = eVar.f44698j;
        this.f44699k = eVar.f44699k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f44689a, parcel, 2);
        lx.u.b0(this.f44690b, parcel, 3);
        lx.u.a0(parcel, 4, this.f44691c, i11);
        long j9 = this.f44692d;
        lx.u.g0(parcel, 5, 8);
        parcel.writeLong(j9);
        boolean z11 = this.f44693e;
        lx.u.g0(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        lx.u.b0(this.f44694f, parcel, 7);
        lx.u.a0(parcel, 8, this.f44695g, i11);
        long j11 = this.f44696h;
        lx.u.g0(parcel, 9, 8);
        parcel.writeLong(j11);
        lx.u.a0(parcel, 10, this.f44697i, i11);
        lx.u.g0(parcel, 11, 8);
        parcel.writeLong(this.f44698j);
        lx.u.a0(parcel, 12, this.f44699k, i11);
        lx.u.i0(iH0, parcel);
    }

    public e(String str, String str2, o4 o4Var, long j9, boolean z11, String str3, u uVar, long j11, u uVar2, long j12, u uVar3) {
        this.f44689a = str;
        this.f44690b = str2;
        this.f44691c = o4Var;
        this.f44692d = j9;
        this.f44693e = z11;
        this.f44694f = str3;
        this.f44695g = uVar;
        this.f44696h = j11;
        this.f44697i = uVar2;
        this.f44698j = j12;
        this.f44699k = uVar3;
    }
}
