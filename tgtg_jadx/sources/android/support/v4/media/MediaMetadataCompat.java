package android.support.v4.media;

import a00.p0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import q1.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f1664a;

    static {
        e eVar = new e(0);
        eVar.put("android.media.metadata.TITLE", 1);
        eVar.put("android.media.metadata.ARTIST", 1);
        eVar.put("android.media.metadata.DURATION", 0);
        eVar.put("android.media.metadata.ALBUM", 1);
        eVar.put("android.media.metadata.AUTHOR", 1);
        eVar.put("android.media.metadata.WRITER", 1);
        eVar.put("android.media.metadata.COMPOSER", 1);
        eVar.put("android.media.metadata.COMPILATION", 1);
        eVar.put("android.media.metadata.DATE", 1);
        eVar.put("android.media.metadata.YEAR", 0);
        eVar.put("android.media.metadata.GENRE", 1);
        eVar.put("android.media.metadata.TRACK_NUMBER", 0);
        eVar.put("android.media.metadata.NUM_TRACKS", 0);
        eVar.put("android.media.metadata.DISC_NUMBER", 0);
        eVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        eVar.put("android.media.metadata.ART", 2);
        eVar.put("android.media.metadata.ART_URI", 1);
        eVar.put("android.media.metadata.ALBUM_ART", 2);
        eVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        eVar.put("android.media.metadata.USER_RATING", 3);
        eVar.put("android.media.metadata.RATING", 3);
        eVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        eVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        eVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        eVar.put("android.media.metadata.DISPLAY_ICON", 2);
        eVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        eVar.put("android.media.metadata.MEDIA_ID", 1);
        eVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        eVar.put("android.media.metadata.MEDIA_URI", 1);
        eVar.put("android.media.metadata.ADVERTISEMENT", 0);
        eVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new p0(12);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f1664a = parcel.readBundle(a.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeBundle(this.f1664a);
    }
}
