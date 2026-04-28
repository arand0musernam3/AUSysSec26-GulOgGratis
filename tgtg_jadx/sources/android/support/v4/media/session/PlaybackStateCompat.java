package android.support.v4.media.session;

import a00.p0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new p0(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f1682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f1684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f1685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f1686k;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f1688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f1690d;

        public CustomAction(Parcel parcel) {
            this.f1687a = parcel.readString();
            this.f1688b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1689c = parcel.readInt();
            this.f1690d = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f1688b) + ", mIcon=" + this.f1689c + ", mExtras=" + this.f1690d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f1687a);
            TextUtils.writeToParcel(this.f1688b, parcel, i11);
            parcel.writeInt(this.f1689c);
            parcel.writeBundle(this.f1690d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f1676a = parcel.readInt();
        this.f1677b = parcel.readLong();
        this.f1679d = parcel.readFloat();
        this.f1683h = parcel.readLong();
        this.f1678c = parcel.readLong();
        this.f1680e = parcel.readLong();
        this.f1682g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1684i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1685j = parcel.readLong();
        this.f1686k = parcel.readBundle(a.class.getClassLoader());
        this.f1681f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f1676a);
        sb2.append(", position=");
        sb2.append(this.f1677b);
        sb2.append(", buffered position=");
        sb2.append(this.f1678c);
        sb2.append(", speed=");
        sb2.append(this.f1679d);
        sb2.append(", updated=");
        sb2.append(this.f1683h);
        sb2.append(", actions=");
        sb2.append(this.f1680e);
        sb2.append(", error code=");
        sb2.append(this.f1681f);
        sb2.append(", error message=");
        sb2.append(this.f1682g);
        sb2.append(", custom actions=");
        sb2.append(this.f1684i);
        sb2.append(", active item id=");
        return a0.j(this.f1685j, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1676a);
        parcel.writeLong(this.f1677b);
        parcel.writeFloat(this.f1679d);
        parcel.writeLong(this.f1683h);
        parcel.writeLong(this.f1678c);
        parcel.writeLong(this.f1680e);
        TextUtils.writeToParcel(this.f1682g, parcel, i11);
        parcel.writeTypedList(this.f1684i);
        parcel.writeLong(this.f1685j);
        parcel.writeBundle(this.f1686k);
        parcel.writeInt(this.f1681f);
    }
}
