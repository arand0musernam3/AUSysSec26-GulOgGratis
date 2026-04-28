package r20;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q1.k1;
import y7.b;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new q(15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f37574c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i11 = parcel.readInt();
        String[] strArr = new String[i11];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i11];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f37574c = new k1(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f37574c.put(strArr[i12], bundleArr[i12]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f37574c + "}";
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        k1 k1Var = this.f37574c;
        int i12 = k1Var.f35782c;
        parcel.writeInt(i12);
        String[] strArr = new String[i12];
        Bundle[] bundleArr = new Bundle[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            strArr[i13] = (String) k1Var.g(i13);
            bundleArr[i13] = (Bundle) k1Var.j(i13);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f37574c = new k1(0);
    }
}
