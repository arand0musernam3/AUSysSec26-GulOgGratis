package ok;

import com.app.tgtg.model.remote.item.ItemTagInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ItemTagInfo f32616a;

    public o(ItemTagInfo itemTagInfo) {
        itemTagInfo.getClass();
        this.f32616a = itemTagInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.areEqual(this.f32616a, ((o) obj).f32616a);
    }

    public final int hashCode() {
        return this.f32616a.hashCode();
    }

    public final String toString() {
        return "TagClicked(tagInfo=" + this.f32616a + ")";
    }
}
