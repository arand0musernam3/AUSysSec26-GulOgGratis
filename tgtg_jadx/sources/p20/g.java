package p20;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import oa.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbsSavedState {
    public static final Parcelable.Creator<g> CREATOR = new i(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f34197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34198b;

    public g(Parcel parcel) {
        super(parcel.readParcelable(g.class.getClassLoader()));
        this.f34197a = parcel.readFloat();
        this.f34198b = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeFloat(this.f34197a);
        parcel.writeInt(this.f34198b);
    }

    public g(d dVar) {
        super(dVar);
    }
}
