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
public final class m0 extends m {

    @NotNull
    public static final Parcelable.Creator<m0> CREATOR = new a0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f37120c;

    public m0(String str, String str2, HashMap map) {
        str.getClass();
        this.f37118a = str;
        this.f37119b = str2;
        this.f37120c = map;
    }

    @Override // qj.m
    public final f70.b a() {
        String str = this.f37118a;
        if (str.length() <= 0) {
            mv.a0 a0Var = new mv.a0();
            f70.i iVar = f70.i.DEEP_LINK;
            iVar.getClass();
            a0Var.f30139b = iVar;
            return a0Var.b();
        }
        String str2 = this.f37119b;
        boolean zAreEqual = Intrinsics.areEqual("widget", str2);
        mk.c cVar = new mk.c(str, ItemViewActivity.class);
        if (zAreEqual) {
            str2 = null;
        }
        cVar.f29980c = str2;
        cVar.f29985h = this.f37120c;
        f70.i iVar2 = zAreEqual ? f70.i.WIDGET : f70.i.DEEP_LINK;
        iVar2.getClass();
        cVar.f29986i = iVar2;
        return cVar.a();
    }

    @Override // qj.m
    public final String b() {
        return "item";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return ItemId.m201equalsimpl0(this.f37118a, m0Var.f37118a) && Intrinsics.areEqual(this.f37119b, m0Var.f37119b) && Intrinsics.areEqual(this.f37120c, m0Var.f37120c);
    }

    public final int hashCode() {
        int iM202hashCodeimpl = ItemId.m202hashCodeimpl(this.f37118a) * 31;
        String str = this.f37119b;
        int iHashCode = (iM202hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        HashMap map = this.f37120c;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = e0.f.t("ItemDetailDeepLink(itemId=", ItemId.m203toStringimpl(this.f37118a), ", deepLinkId=", this.f37119b, ", deeplinkParametersMap=");
        sbT.append(this.f37120c);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        ItemId.m204writeToParcelimpl(this.f37118a, parcel, i11);
        parcel.writeString(this.f37119b);
        HashMap map = this.f37120c;
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
