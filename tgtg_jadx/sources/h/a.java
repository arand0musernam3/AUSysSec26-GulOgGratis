package h;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import e10.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new b0(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f20936b;

    public a(int i11, Intent intent) {
        this.f20935a = i11;
        this.f20936b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i11 = this.f20935a;
        sb2.append(i11 != -1 ? i11 != 0 ? String.valueOf(i11) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f20936b);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f20935a);
        Intent intent = this.f20936b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i11);
        }
    }
}
