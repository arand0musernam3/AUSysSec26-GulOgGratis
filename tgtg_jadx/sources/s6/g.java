package s6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends y7.b {
    public static final Parcelable.Creator<g> CREATOR = new q(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray f38856c;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i11 = parcel.readInt();
        int[] iArr = new int[i11];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f38856c = new SparseArray(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f38856c.append(iArr[i12], parcelableArray[i12]);
        }
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        SparseArray sparseArray = this.f38856c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = this.f38856c.keyAt(i12);
            parcelableArr[i12] = (Parcelable) this.f38856c.valueAt(i12);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i11);
    }
}
