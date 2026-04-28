package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.model.remote.ItemId;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends m {

    @NotNull
    public static final Parcelable.Creator<b0> CREATOR = new a0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f37067b;

    public b0(String str, HashMap map) {
        str.getClass();
        this.f37066a = str;
        this.f37067b = map;
    }

    @Override // qj.m
    public final f70.b a() {
        String str = this.f37066a;
        if (str.length() <= 0) {
            mv.a0 a0Var = new mv.a0();
            f70.i iVar = f70.i.DEEP_LINK;
            iVar.getClass();
            a0Var.f30139b = iVar;
            return a0Var.b();
        }
        mk.c cVar = new mk.c(str, ManufacturerItemDetailsActivity.class);
        cVar.f29980c = "delivery";
        cVar.f29985h = this.f37067b;
        f70.i iVar2 = f70.i.DEEP_LINK;
        iVar2.getClass();
        cVar.f29986i = iVar2;
        return cVar.a();
    }

    @Override // qj.m
    public final String b() {
        return "item/delivery";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return ItemId.m201equalsimpl0(this.f37066a, b0Var.f37066a) && Intrinsics.areEqual(this.f37067b, b0Var.f37067b);
    }

    public final int hashCode() {
        int iM202hashCodeimpl = ItemId.m202hashCodeimpl(this.f37066a) * 31;
        HashMap map = this.f37067b;
        return iM202hashCodeimpl + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "DeliveryItemDetailDeepLink(itemId=" + ItemId.m203toStringimpl(this.f37066a) + ", deeplinkParametersMap=" + this.f37067b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        ItemId.m204writeToParcelimpl(this.f37066a, parcel, i11);
        HashMap map = this.f37067b;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
