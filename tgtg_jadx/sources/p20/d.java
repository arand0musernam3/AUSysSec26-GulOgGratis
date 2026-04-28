package p20;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;
import oa.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new i(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f34144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f34145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f34146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f34147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34148e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeFloat(this.f34144a);
        parcel.writeFloat(this.f34145b);
        parcel.writeList(this.f34146c);
        parcel.writeFloat(this.f34147d);
        parcel.writeBooleanArray(new boolean[]{this.f34148e});
    }
}
