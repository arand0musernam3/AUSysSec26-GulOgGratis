package ok;

import com.app.tgtg.model.remote.ItemId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements f70.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vj.c f32641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f32642d;

    public y(String str, boolean z11, vj.c cVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        str.getClass();
        this.f32639a = str;
        this.f32640b = z11;
        this.f32641c = cVar;
        this.f32642d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return ItemId.m201equalsimpl0(this.f32639a, yVar.f32639a) && this.f32640b == yVar.f32640b && Intrinsics.areEqual(this.f32641c, yVar.f32641c) && this.f32642d == yVar.f32642d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32642d) + ((this.f32641c.hashCode() + r8.k.e(ItemId.m202hashCodeimpl(this.f32639a) * 31, 31, this.f32640b)) * 31);
    }

    public final String toString() {
        return "OpenCustomReminderSheet(itemId=" + ItemId.m203toStringimpl(this.f32639a) + ", itemSubscribedForNotification=" + this.f32640b + ", reminderDetails=" + this.f32641c + ", timestamp=" + this.f32642d + ")";
    }
}
