package j8;

import android.os.Parcel;
import android.os.Parcelable;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends y7.b {
    public static final Parcelable.Creator<e> CREATOR = new q(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24764g;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f24760c = 0;
        this.f24760c = parcel.readInt();
        this.f24761d = parcel.readInt();
        this.f24762e = parcel.readInt();
        this.f24763f = parcel.readInt();
        this.f24764g = parcel.readInt();
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f24760c);
        parcel.writeInt(this.f24761d);
        parcel.writeInt(this.f24762e);
        parcel.writeInt(this.f24763f);
        parcel.writeInt(this.f24764g);
    }
}
