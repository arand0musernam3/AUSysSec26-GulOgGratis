package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 implements Parcelable {
    public static final Parcelable.Creator<z2> CREATOR = new w0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f3992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f3994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f3995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3998j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f3989a);
        parcel.writeInt(this.f3990b);
        parcel.writeInt(this.f3991c);
        if (this.f3991c > 0) {
            parcel.writeIntArray(this.f3992d);
        }
        parcel.writeInt(this.f3993e);
        if (this.f3993e > 0) {
            parcel.writeIntArray(this.f3994f);
        }
        parcel.writeInt(this.f3996h ? 1 : 0);
        parcel.writeInt(this.f3997i ? 1 : 0);
        parcel.writeInt(this.f3998j ? 1 : 0);
        parcel.writeList(this.f3995g);
    }
}
