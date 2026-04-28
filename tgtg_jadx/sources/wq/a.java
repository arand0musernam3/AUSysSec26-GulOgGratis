package wq;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import s00.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new e(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43520e;

    public a(int i11, String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.f43516a = i11;
        this.f43517b = str;
        this.f43518c = str2;
        this.f43519d = str3;
        this.f43520e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f43516a);
        parcel.writeString(this.f43517b);
        parcel.writeString(this.f43518c);
        parcel.writeString(this.f43519d);
        parcel.writeString(this.f43520e);
    }

    public /* synthetic */ a(int i11, String str, String str2, String str3, int i12, String str4) {
        this(i11, str, (i12 & 4) != 0 ? null : str2, str3, (i12 & 16) != 0 ? null : str4);
    }
}
