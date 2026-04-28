package ok;

import com.app.tgtg.model.remote.ItemId;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32594b;

    public h(String str, boolean z11) {
        str.getClass();
        this.f32593a = str;
        this.f32594b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return ItemId.m201equalsimpl0(this.f32593a, hVar.f32593a) && this.f32594b == hVar.f32594b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32594b) + (ItemId.m202hashCodeimpl(this.f32593a) * 31);
    }

    public final String toString() {
        return "GetFavoriteReminderClicked(itemId=" + ItemId.m203toStringimpl(this.f32593a) + ", subscribed=" + this.f32594b + ")";
    }
}
