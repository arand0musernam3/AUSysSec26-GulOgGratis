package h;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import e10.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new b0(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f20949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f20950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20952d;

    public g(IntentSender intentSender, Intent intent, int i11, int i12) {
        intentSender.getClass();
        this.f20949a = intentSender;
        this.f20950b = intent;
        this.f20951c = i11;
        this.f20952d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeParcelable(this.f20949a, i11);
        parcel.writeParcelable(this.f20950b, i11);
        parcel.writeInt(this.f20951c);
        parcel.writeInt(this.f20952d);
    }
}
