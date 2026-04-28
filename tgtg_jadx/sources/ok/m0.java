package ok;

import com.app.tgtg.model.remote.ItemId;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32613a;

    public m0(String str) {
        this.f32613a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && ItemId.m201equalsimpl0(this.f32613a, ((m0) obj).f32613a);
    }

    public final int hashCode() {
        return ItemId.m202hashCodeimpl(this.f32613a);
    }

    public final String toString() {
        return w.a0.p("ShareClicked(itemId=", ItemId.m203toStringimpl(this.f32613a), ")");
    }
}
