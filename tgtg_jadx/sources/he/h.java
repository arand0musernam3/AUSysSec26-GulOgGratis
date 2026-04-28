package he;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new e10.b0(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f21917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21921g;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f21915a);
        parcel.writeFloat(this.f21917c);
        parcel.writeInt(this.f21918d ? 1 : 0);
        parcel.writeString(this.f21919e);
        parcel.writeInt(this.f21920f);
        parcel.writeInt(this.f21921g);
    }
}
