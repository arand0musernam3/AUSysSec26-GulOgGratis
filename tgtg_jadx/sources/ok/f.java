package ok;

import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicItem f32588a;

    public f(BasicItem basicItem) {
        this.f32588a = basicItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f32588a, ((f) obj).f32588a);
    }

    public final int hashCode() {
        return this.f32588a.hashCode();
    }

    public final String toString() {
        return "FavoriteClicked(item=" + this.f32588a + ")";
    }
}
