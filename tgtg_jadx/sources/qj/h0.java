package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.model.remote.ItemId;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends m {

    @NotNull
    public static final Parcelable.Creator<h0> CREATOR = new a0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f37098b;

    public h0(String str, HashMap map) {
        str.getClass();
        this.f37097a = str;
        this.f37098b = map;
    }

    @Override // qj.m
    public final f70.b a() {
        String str = this.f37097a;
        if (str.length() <= 0) {
            mv.a0 a0Var = new mv.a0();
            f70.i iVar = f70.i.DEEP_LINK;
            iVar.getClass();
            a0Var.f30139b = iVar;
            return a0Var.b();
        }
        mk.c cVar = new mk.c(str, ItemViewActivity.class);
        cVar.f29985h = this.f37098b;
        f70.i iVar2 = f70.i.DEEP_LINK;
        iVar2.getClass();
        cVar.f29986i = iVar2;
        return cVar.a();
    }

    @Override // qj.m
    public final String b() {
        return "item/flashsales";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return ItemId.m201equalsimpl0(this.f37097a, h0Var.f37097a) && Intrinsics.areEqual(this.f37098b, h0Var.f37098b);
    }

    public final int hashCode() {
        int iM202hashCodeimpl = ItemId.m202hashCodeimpl(this.f37097a) * 31;
        HashMap map = this.f37098b;
        return iM202hashCodeimpl + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "FlashSalesItemDetailDeepLink(itemId=" + ItemId.m203toStringimpl(this.f37097a) + ", deeplinkParametersMap=" + this.f37098b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        ItemId.m204writeToParcelimpl(this.f37097a, parcel, i11);
        HashMap map = this.f37098b;
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
