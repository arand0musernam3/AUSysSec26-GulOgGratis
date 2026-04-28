package ok;

import com.app.tgtg.model.remote.ItemId;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32585a;

    public d0(String str) {
        this.f32585a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && ItemId.m201equalsimpl0(this.f32585a, ((d0) obj).f32585a);
    }

    public final int hashCode() {
        return ItemId.m202hashCodeimpl(this.f32585a);
    }

    public final String toString() {
        return w.a0.p("GoToItem(itemId=", ItemId.m203toStringimpl(this.f32585a), ")");
    }
}
