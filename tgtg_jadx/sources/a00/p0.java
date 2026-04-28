package a00;

import a00.p0;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.h1;
import androidx.fragment.app.o1;
import androidx.fragment.app.t1;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.ArrayList;
import org.bouncycastle.iana.AEADAlgorithm;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138a;

    public /* synthetic */ p0(int i11) {
        this.f138a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri mediaUri;
        Bundle bundle;
        switch (this.f138a) {
            case 0:
                int iX = jf.e.X(parcel);
                byte[] bArrR = null;
                byte[] bArrR2 = null;
                byte[] bArrR3 = null;
                String[] strArrX = null;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    char c3 = (char) i11;
                    if (c3 == 2) {
                        bArrR = jf.e.r(i11, parcel);
                    } else if (c3 == 3) {
                        bArrR2 = jf.e.r(i11, parcel);
                    } else if (c3 == 4) {
                        bArrR3 = jf.e.r(i11, parcel);
                    } else if (c3 != 5) {
                        jf.e.W(i11, parcel);
                    } else {
                        strArrX = jf.e.x(i11, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                return new h(bArrR, bArrR2, bArrR3, strArrX);
            case 1:
                int iX2 = jf.e.X(parcel);
                int iR = 0;
                String strW = null;
                int iR2 = 0;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 2) {
                        iR = jf.e.R(i12, parcel);
                    } else if (c7 == 3) {
                        strW = jf.e.w(i12, parcel);
                    } else if (c7 != 4) {
                        jf.e.W(i12, parcel);
                    } else {
                        iR2 = jf.e.R(i12, parcel);
                    }
                }
                jf.e.B(iX2, parcel);
                return new i(iR, strW, iR2);
            case 2:
                int iX3 = jf.e.X(parcel);
                String strW2 = null;
                Boolean boolValueOf = null;
                String strW3 = null;
                String strW4 = null;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 2) {
                        strW2 = jf.e.w(i13, parcel);
                    } else if (c8 == 3) {
                        int iU = jf.e.U(i13, parcel);
                        if (iU == 0) {
                            boolValueOf = null;
                        } else {
                            jf.e.Z(parcel, iU, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c8 == 4) {
                        strW3 = jf.e.w(i13, parcel);
                    } else if (c8 != 5) {
                        jf.e.W(i13, parcel);
                    } else {
                        strW4 = jf.e.w(i13, parcel);
                    }
                }
                jf.e.B(iX3, parcel);
                return new k(strW2, boolValueOf, strW3, strW4);
            case 3:
                try {
                    return l.a(parcel.readInt());
                } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e5) {
                    org.bouncycastle.jce.provider.a.m(e5);
                    return null;
                }
            case 4:
                int iX4 = jf.e.X(parcel);
                byte[] bArrR4 = null;
                byte[] bArrR5 = null;
                byte[] bArrR6 = null;
                long jT = 0;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        jT = jf.e.T(i14, parcel);
                    } else if (c11 == 2) {
                        bArrR4 = jf.e.r(i14, parcel);
                    } else if (c11 == 3) {
                        bArrR5 = jf.e.r(i14, parcel);
                    } else if (c11 != 4) {
                        jf.e.W(i14, parcel);
                    } else {
                        bArrR6 = jf.e.r(i14, parcel);
                    }
                }
                jf.e.B(iX4, parcel);
                return new q0(jT, bArrR4, bArrR5, bArrR6);
            case 5:
                int iX5 = jf.e.X(parcel);
                ArrayList arrayListA = null;
                while (parcel.dataPosition() < iX5) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        jf.e.W(i15, parcel);
                    } else {
                        arrayListA = jf.e.A(parcel, i15, q0.CREATOR);
                    }
                }
                jf.e.B(iX5, parcel);
                return new r0(arrayListA);
            case 6:
                int iX6 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX6) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        jf.e.W(i16, parcel);
                    } else {
                        jf.e.M(i16, parcel);
                    }
                }
                jf.e.B(iX6, parcel);
                return new s0();
            case 7:
                try {
                    return n.c(parcel.readInt());
                } catch (ErrorCode$UnsupportedErrorCodeException e11) {
                    throw new IllegalArgumentException(e11);
                }
            case 8:
                int iX7 = jf.e.X(parcel);
                String strW5 = null;
                while (parcel.dataPosition() < iX7) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        jf.e.W(i17, parcel);
                    } else {
                        strW5 = jf.e.w(i17, parcel);
                    }
                }
                jf.e.B(iX7, parcel);
                return new o(strW5);
            case 9:
                parcel.getClass();
                int i18 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i18);
                int iC = 0;
                while (iC != i18) {
                    iC = b3.i.c(BasketBriefItem.CREATOR, parcel, arrayList, iC, 1);
                }
                return new aj.c(arrayList, parcel.readString(), parcel.readString());
            case 10:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new p0(10);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1653a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f1654b;

                    {
                        this.f1653a = parcel.readInt();
                        this.f1654b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f1653a + ", mDescription=" + this.f1654b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i19) {
                        parcel2.writeInt(this.f1653a);
                        this.f1654b.writeToParcel(parcel2, i19);
                    }
                };
            case 11:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(android.support.v4.media.session.a.class.getClassLoader());
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.f1663i = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 12:
                return new MediaMetadataCompat(parcel);
            case 13:
                return new RatingCompat(parcel.readFloat(), parcel.readInt());
            case 14:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new p0(14);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f1667a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final long f1668b;

                    {
                        this.f1667a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f1668b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f1667a);
                        sb2.append(", Id=");
                        return a0.j(this.f1668b, " }", sb2);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i19) {
                        this.f1667a.writeToParcel(parcel2, i19);
                        parcel2.writeLong(this.f1668b);
                    }
                };
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f1669a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 16:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new p0(16);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Object f1670a;

                    {
                        this.f1670a = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).f1670a;
                        Object obj3 = this.f1670a;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.f1670a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i19) {
                        parcel2.writeParcelable((Parcelable) this.f1670a, i19);
                    }
                };
            case 17:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f1671a = parcel.readInt();
                parcelableVolumeInfo.f1673c = parcel.readInt();
                parcelableVolumeInfo.f1674d = parcel.readInt();
                parcelableVolumeInfo.f1675e = parcel.readInt();
                parcelableVolumeInfo.f1672b = parcel.readInt();
                return parcelableVolumeInfo;
            case 18:
                return new PlaybackStateCompat(parcel);
            case 19:
                return new androidx.fragment.app.b(parcel);
            case 20:
                return new androidx.fragment.app.c(parcel);
            case 21:
                h1 h1Var = new h1();
                h1Var.f3228a = parcel.readString();
                h1Var.f3229b = parcel.readInt();
                return h1Var;
            case 22:
                o1 o1Var = new o1();
                o1Var.f3291e = null;
                o1Var.f3292f = new ArrayList();
                o1Var.f3293g = new ArrayList();
                o1Var.f3287a = parcel.createStringArrayList();
                o1Var.f3288b = parcel.createStringArrayList();
                o1Var.f3289c = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                o1Var.f3290d = parcel.readInt();
                o1Var.f3291e = parcel.readString();
                o1Var.f3292f = parcel.createStringArrayList();
                o1Var.f3293g = parcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                o1Var.f3294h = parcel.createTypedArrayList(h1.CREATOR);
                return o1Var;
            case 23:
                return new t1(parcel);
            case 24:
                parcel.getClass();
                return new ax.b(parcel);
            case 25:
                parcel.getClass();
                return new ax.l(parcel);
            case 26:
                parcel.getClass();
                return new ax.m(parcel);
            case 27:
                parcel.getClass();
                return new ax.n(parcel);
            case 28:
                parcel.getClass();
                return new ax.w(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
            default:
                parcel.getClass();
                return new ax.e0(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f138a) {
            case 0:
                return new h[i11];
            case 1:
                return new i[i11];
            case 2:
                return new k[i11];
            case 3:
                return new l[i11];
            case 4:
                return new q0[i11];
            case 5:
                return new r0[i11];
            case 6:
                return new s0[i11];
            case 7:
                return new n[i11];
            case 8:
                return new o[i11];
            case 9:
                return new aj.c[i11];
            case 10:
                return new MediaBrowserCompat$MediaItem[i11];
            case 11:
                return new MediaDescriptionCompat[i11];
            case 12:
                return new MediaMetadataCompat[i11];
            case 13:
                return new RatingCompat[i11];
            case 14:
                return new MediaSessionCompat$QueueItem[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new MediaSessionCompat$ResultReceiverWrapper[i11];
            case 16:
                return new MediaSessionCompat$Token[i11];
            case 17:
                return new ParcelableVolumeInfo[i11];
            case 18:
                return new PlaybackStateCompat[i11];
            case 19:
                return new androidx.fragment.app.b[i11];
            case 20:
                return new androidx.fragment.app.c[i11];
            case 21:
                return new h1[i11];
            case 22:
                return new o1[i11];
            case 23:
                return new t1[i11];
            case 24:
                return new ax.b[i11];
            case 25:
                return new ax.l[i11];
            case 26:
                return new ax.m[i11];
            case 27:
                return new ax.n[i11];
            case 28:
                return new ax.w[i11];
            default:
                return new ax.e0[i11];
        }
    }
}
