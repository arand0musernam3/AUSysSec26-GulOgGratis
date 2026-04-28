package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a00.p0(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3160b;

    public c(Parcel parcel) {
        this.f3159a = parcel.createStringArrayList();
        this.f3160b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeStringList(this.f3159a);
        parcel.writeTypedList(this.f3160b);
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f3159a = arrayList;
        this.f3160b = arrayList2;
    }
}
