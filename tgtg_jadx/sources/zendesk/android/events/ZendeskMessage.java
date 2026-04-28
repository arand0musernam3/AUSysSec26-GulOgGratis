package zendesk.android.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lzendesk/android/events/ZendeskMessage;", "", "id", "", "role", "Lzendesk/android/events/ZendeskRole;", "timestamp", "", "<init>", "(Ljava/lang/String;Lzendesk/android/events/ZendeskRole;J)V", "getId", "()Ljava/lang/String;", "getRole", "()Lzendesk/android/events/ZendeskRole;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ZendeskMessage {

    @NotNull
    private final String id;

    @NotNull
    private final ZendeskRole role;
    private final long timestamp;

    public ZendeskMessage(@NotNull String str, @NotNull ZendeskRole zendeskRole, long j9) {
        str.getClass();
        zendeskRole.getClass();
        this.id = str;
        this.role = zendeskRole;
        this.timestamp = j9;
    }

    public static /* synthetic */ ZendeskMessage copy$default(ZendeskMessage zendeskMessage, String str, ZendeskRole zendeskRole, long j9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = zendeskMessage.id;
        }
        if ((i11 & 2) != 0) {
            zendeskRole = zendeskMessage.role;
        }
        if ((i11 & 4) != 0) {
            j9 = zendeskMessage.timestamp;
        }
        return zendeskMessage.copy(str, zendeskRole, j9);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ZendeskRole getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final ZendeskMessage copy(@NotNull String id2, @NotNull ZendeskRole role, long timestamp) {
        id2.getClass();
        role.getClass();
        return new ZendeskMessage(id2, role, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZendeskMessage)) {
            return false;
        }
        ZendeskMessage zendeskMessage = (ZendeskMessage) other;
        return Intrinsics.areEqual(this.id, zendeskMessage.id) && this.role == zendeskMessage.role && this.timestamp == zendeskMessage.timestamp;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ZendeskRole getRole() {
        return this.role;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + ((this.role.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        ZendeskRole zendeskRole = this.role;
        long j9 = this.timestamp;
        StringBuilder sb2 = new StringBuilder("ZendeskMessage(id=");
        sb2.append(str);
        sb2.append(", role=");
        sb2.append(zendeskRole);
        sb2.append(", timestamp=");
        return a0.j(j9, ")", sb2);
    }
}
