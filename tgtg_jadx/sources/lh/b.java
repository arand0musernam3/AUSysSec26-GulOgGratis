package lh;

import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.jvm.internal.Intrinsics;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BasicItem f27778e;

    public b(BasicItem basicItem) {
        basicItem.getClass();
        this.f27778e = basicItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f27778e, ((b) obj).f27778e);
    }

    public final int hashCode() {
        return this.f27778e.hashCode();
    }

    public final String toString() {
        return "FavoriteClick(item=" + this.f27778e + ")";
    }
}
