package nk;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements f {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new jz.l(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ItemTagInfo f30985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicItem f30986b;

    public e(ItemTagInfo itemTagInfo, BasicItem basicItem) {
        itemTagInfo.getClass();
        basicItem.getClass();
        this.f30985a = itemTagInfo;
        this.f30986b = basicItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f30985a, eVar.f30985a) && Intrinsics.areEqual(this.f30986b, eVar.f30986b);
    }

    public final int hashCode() {
        return this.f30986b.hashCode() + (this.f30985a.hashCode() * 31);
    }

    public final String toString() {
        return "Tag(tagInfo=" + this.f30985a + ", item=" + this.f30986b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        this.f30985a.writeToParcel(parcel, i11);
        parcel.writeParcelable(this.f30986b, i11);
    }
}
