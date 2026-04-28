package ok;

import com.app.tgtg.model.remote.ItemId;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vj.e f32582b;

    public c(String str, vj.e eVar) {
        str.getClass();
        eVar.getClass();
        this.f32581a = str;
        this.f32582b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return ItemId.m201equalsimpl0(this.f32581a, cVar.f32581a) && this.f32582b == cVar.f32582b;
    }

    public final int hashCode() {
        return this.f32582b.hashCode() + (ItemId.m202hashCodeimpl(this.f32581a) * 31);
    }

    public final String toString() {
        return "DeleteCustomReminderClicked(itemId=" + ItemId.m203toStringimpl(this.f32581a) + ", reminderType=" + this.f32582b + ")";
    }
}
