package m10;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import jz.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new l(15);
    public Integer A;
    public Integer B;
    public Integer C;
    public Boolean D;
    public Integer E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f28722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f28723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f28724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f28725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f28726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f28727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f28728h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f28730j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Locale f28733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f28734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f28735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f28738s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f28740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f28741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f28742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f28743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f28744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f28745z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28729i = 255;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28731k = -2;
    public int l = -2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28732m = -2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f28739t = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f28721a);
        parcel.writeSerializable(this.f28722b);
        parcel.writeSerializable(this.f28723c);
        parcel.writeSerializable(this.f28724d);
        parcel.writeSerializable(this.f28725e);
        parcel.writeSerializable(this.f28726f);
        parcel.writeSerializable(this.f28727g);
        parcel.writeSerializable(this.f28728h);
        parcel.writeInt(this.f28729i);
        parcel.writeString(this.f28730j);
        parcel.writeInt(this.f28731k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.f28732m);
        CharSequence charSequence = this.f28734o;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f28735p;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f28736q);
        parcel.writeSerializable(this.f28738s);
        parcel.writeSerializable(this.f28740u);
        parcel.writeSerializable(this.f28741v);
        parcel.writeSerializable(this.f28742w);
        parcel.writeSerializable(this.f28743x);
        parcel.writeSerializable(this.f28744y);
        parcel.writeSerializable(this.f28745z);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.f28739t);
        parcel.writeSerializable(this.f28733n);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.E);
    }
}
