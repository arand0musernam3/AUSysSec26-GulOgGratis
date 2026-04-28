package ok;

import com.app.tgtg.model.remote.ItemId;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32620a;

    public q0(String str) {
        this.f32620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && ItemId.m201equalsimpl0(this.f32620a, ((q0) obj).f32620a);
    }

    public final int hashCode() {
        return ItemId.m202hashCodeimpl(this.f32620a);
    }

    public final String toString() {
        return w.a0.p("ScreenShown(itemId=", ItemId.m203toStringimpl(this.f32620a), ")");
    }
}
