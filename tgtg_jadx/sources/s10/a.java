package s10;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import r8.k;
import s00.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends View.BaseSavedState {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new e(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38736a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i11 = this.f38736a;
        return k.p(sb2, i11 != 1 ? i11 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeValue(Integer.valueOf(this.f38736a));
    }
}
