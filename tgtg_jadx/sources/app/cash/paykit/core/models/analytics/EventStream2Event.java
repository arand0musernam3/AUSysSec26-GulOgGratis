package app.cash.paykit.core.models.analytics;

import a60.i;
import a60.l;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/cash/paykit/core/models/analytics/EventStream2Event;", "", "", "appName", "catalogName", "jsonData", "", "recordedAt", "uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lapp/cash/paykit/core/models/analytics/EventStream2Event;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EventStream2Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4593e;

    public EventStream2Event(@i(name = "app_name") @NotNull String str, @i(name = "catalog_name") @NotNull String str2, @i(name = "json_data") @NotNull String str3, @i(name = "recorded_at_usec") long j9, @i(name = "uuid") @NotNull String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f4589a = str;
        this.f4590b = str2;
        this.f4591c = str3;
        this.f4592d = j9;
        this.f4593e = str4;
    }

    @NotNull
    public final EventStream2Event copy(@i(name = "app_name") @NotNull String appName, @i(name = "catalog_name") @NotNull String catalogName, @i(name = "json_data") @NotNull String jsonData, @i(name = "recorded_at_usec") long recordedAt, @i(name = "uuid") @NotNull String uuid) {
        appName.getClass();
        catalogName.getClass();
        jsonData.getClass();
        uuid.getClass();
        return new EventStream2Event(appName, catalogName, jsonData, recordedAt, uuid);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventStream2Event)) {
            return false;
        }
        EventStream2Event eventStream2Event = (EventStream2Event) obj;
        return Intrinsics.areEqual(this.f4589a, eventStream2Event.f4589a) && Intrinsics.areEqual(this.f4590b, eventStream2Event.f4590b) && Intrinsics.areEqual(this.f4591c, eventStream2Event.f4591c) && this.f4592d == eventStream2Event.f4592d && Intrinsics.areEqual(this.f4593e, eventStream2Event.f4593e);
    }

    public final int hashCode() {
        return this.f4593e.hashCode() + f.b(l1.b(l1.b(this.f4589a.hashCode() * 31, 31, this.f4590b), 31, this.f4591c), 31, this.f4592d);
    }

    public final String toString() {
        StringBuilder sbT = f.t("EventStream2Event(appName=", this.f4589a, ", catalogName=", this.f4590b, ", jsonData=");
        sbT.append(this.f4591c);
        sbT.append(", recordedAt=");
        sbT.append(this.f4592d);
        return f.n(sbT, ", uuid=", this.f4593e, ")");
    }
}
