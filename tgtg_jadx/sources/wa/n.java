package wa;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends View.BaseSavedState {
    public static final Parcelable.Creator<n> CREATOR = new q(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f43374c;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f43372a);
        parcel.writeInt(this.f43373b);
        parcel.writeParcelable(this.f43374c, i11);
    }
}
