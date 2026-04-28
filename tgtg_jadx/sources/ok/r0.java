package ok;

import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicItem f32622a;

    public r0(BasicItem basicItem) {
        this.f32622a = basicItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.areEqual(this.f32622a, ((r0) obj).f32622a);
    }

    public final int hashCode() {
        return this.f32622a.hashCode();
    }

    public final String toString() {
        return "SeeMoreClicked(item=" + this.f32622a + ")";
    }
}
