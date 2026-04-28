package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Parcelable {
    public static final Parcelable.Creator<o1> CREATOR = new a00.p0(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f3287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f3288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b[] f3289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f3292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f3293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f3294h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeStringList(this.f3287a);
        parcel.writeStringList(this.f3288b);
        parcel.writeTypedArray(this.f3289c, i11);
        parcel.writeInt(this.f3290d);
        parcel.writeString(this.f3291e);
        parcel.writeStringList(this.f3292f);
        parcel.writeTypedList(this.f3293g);
        parcel.writeTypedList(this.f3294h);
    }
}
