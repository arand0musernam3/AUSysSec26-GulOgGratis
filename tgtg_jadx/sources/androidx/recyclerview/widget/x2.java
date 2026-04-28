package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements Parcelable {
    public static final Parcelable.Creator<x2> CREATOR = new w0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f3976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3977d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3974a + ", mGapDir=" + this.f3975b + ", mHasUnwantedGapAfter=" + this.f3977d + ", mGapPerSpan=" + Arrays.toString(this.f3976c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f3974a);
        parcel.writeInt(this.f3975b);
        parcel.writeInt(this.f3977d ? 1 : 0);
        int[] iArr = this.f3976c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3976c);
        }
    }
}
