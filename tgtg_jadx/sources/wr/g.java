package wr;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.Order;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new s00.e(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f43523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f43524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f43526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Order f43528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f43529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f43530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f43531i;

    public /* synthetic */ g(h hVar, b bVar, boolean z11, e eVar, Order order, String str, String str2, int i11) {
        this((i11 & 1) != 0 ? h.CONSUMER : hVar, (i11 & 2) != 0 ? null : bVar, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? null : eVar, false, (i11 & 32) != 0 ? null : order, (i11 & 64) == 0, (i11 & 128) != 0 ? "default" : str, (i11 & 256) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f43523a.name());
        b bVar = this.f43524b;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        parcel.writeInt(this.f43525c ? 1 : 0);
        e eVar = this.f43526d;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eVar.name());
        }
        parcel.writeInt(this.f43527e ? 1 : 0);
        Order order = this.f43528f;
        if (order == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            order.writeToParcel(parcel, i11);
        }
        parcel.writeInt(this.f43529g ? 1 : 0);
        parcel.writeString(this.f43530h);
        String str = this.f43531i;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            OrderId.m216writeToParcelimpl(str, parcel, i11);
        }
    }

    public g(h hVar, b bVar, boolean z11, e eVar, boolean z12, Order order, boolean z13, String str, String str2) {
        hVar.getClass();
        str.getClass();
        this.f43523a = hVar;
        this.f43524b = bVar;
        this.f43525c = z11;
        this.f43526d = eVar;
        this.f43527e = z12;
        this.f43528f = order;
        this.f43529g = z13;
        this.f43530h = str;
        this.f43531i = str2;
    }
}
