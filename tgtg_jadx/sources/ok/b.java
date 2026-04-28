package ok;

import com.app.tgtg.model.remote.ItemId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f32579d;

    public b(String str, boolean z11, boolean z12, List list) {
        str.getClass();
        list.getClass();
        this.f32576a = str;
        this.f32577b = z11;
        this.f32578c = z12;
        this.f32579d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return ItemId.m201equalsimpl0(this.f32576a, bVar.f32576a) && this.f32577b == bVar.f32577b && this.f32578c == bVar.f32578c && Intrinsics.areEqual(this.f32579d, bVar.f32579d);
    }

    public final int hashCode() {
        return this.f32579d.hashCode() + r8.k.e(r8.k.e(ItemId.m202hashCodeimpl(this.f32576a) * 31, 31, this.f32577b), 31, this.f32578c);
    }

    public final String toString() {
        return "CreateCustomReminderClicked(itemId=" + ItemId.m203toStringimpl(this.f32576a) + ", subscribed=" + this.f32577b + ", isRecurringReminder=" + this.f32578c + ", selectedDays=" + this.f32579d + ")";
    }
}
