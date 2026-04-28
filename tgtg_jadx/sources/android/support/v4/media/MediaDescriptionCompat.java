package android.support.v4.media;

import a00.p0;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new p0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f1656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f1657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f1658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f1659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f1660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f1662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f1663i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1655a = str;
        this.f1656b = charSequence;
        this.f1657c = charSequence2;
        this.f1658d = charSequence3;
        this.f1659e = bitmap;
        this.f1660f = uri;
        this.f1661g = bundle;
        this.f1662h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f1656b) + ", " + ((Object) this.f1657c) + ", " + ((Object) this.f1658d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Object objBuild = this.f1663i;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f1655a);
            builder.setTitle(this.f1656b);
            builder.setSubtitle(this.f1657c);
            builder.setDescription(this.f1658d);
            builder.setIconBitmap(this.f1659e);
            builder.setIconUri(this.f1660f);
            builder.setExtras(this.f1661g);
            builder.setMediaUri(this.f1662h);
            objBuild = builder.build();
            this.f1663i = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i11);
    }
}
