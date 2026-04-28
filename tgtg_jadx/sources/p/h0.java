package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends View.BaseSavedState {
    public static final Parcelable.Creator<h0> CREATOR = new oa.i(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33908a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeByte(this.f33908a ? (byte) 1 : (byte) 0);
    }
}
