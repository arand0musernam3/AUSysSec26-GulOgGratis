package android.support.v4.media;

import a00.p0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new p0(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1666b;

    public RatingCompat(float f11, int i11) {
        this.f1665a = i11;
        this.f1666b = f11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f1665a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f1665a);
        sb2.append(" rating=");
        float f11 = this.f1666b;
        sb2.append(f11 < 0.0f ? "unrated" : String.valueOf(f11));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1665a);
        parcel.writeFloat(this.f1666b);
    }
}
