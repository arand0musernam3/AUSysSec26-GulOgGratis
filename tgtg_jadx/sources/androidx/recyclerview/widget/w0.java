package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3956a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3956a) {
            case 0:
                x0 x0Var = new x0();
                x0Var.f3967a = parcel.readInt();
                x0Var.f3968b = parcel.readInt();
                x0Var.f3969c = parcel.readInt() == 1;
                return x0Var;
            case 1:
                x2 x2Var = new x2();
                x2Var.f3974a = parcel.readInt();
                x2Var.f3975b = parcel.readInt();
                x2Var.f3977d = parcel.readInt() == 1;
                int i11 = parcel.readInt();
                if (i11 > 0) {
                    int[] iArr = new int[i11];
                    x2Var.f3976c = iArr;
                    parcel.readIntArray(iArr);
                }
                return x2Var;
            default:
                z2 z2Var = new z2();
                z2Var.f3989a = parcel.readInt();
                z2Var.f3990b = parcel.readInt();
                int i12 = parcel.readInt();
                z2Var.f3991c = i12;
                if (i12 > 0) {
                    int[] iArr2 = new int[i12];
                    z2Var.f3992d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i13 = parcel.readInt();
                z2Var.f3993e = i13;
                if (i13 > 0) {
                    int[] iArr3 = new int[i13];
                    z2Var.f3994f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                z2Var.f3996h = parcel.readInt() == 1;
                z2Var.f3997i = parcel.readInt() == 1;
                z2Var.f3998j = parcel.readInt() == 1;
                z2Var.f3995g = parcel.readArrayList(x2.class.getClassLoader());
                return z2Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f3956a) {
            case 0:
                return new x0[i11];
            case 1:
                return new x2[i11];
            default:
                return new z2[i11];
        }
    }
}
