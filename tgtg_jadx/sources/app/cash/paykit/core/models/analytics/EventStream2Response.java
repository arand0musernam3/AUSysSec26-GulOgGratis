package app.cash.paykit.core.models.analytics;

import a60.i;
import a60.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lapp/cash/paykit/core/models/analytics/EventStream2Response;", "", "", "failureCount", "invalidCount", "successCount", "<init>", "(III)V", "copy", "(III)Lapp/cash/paykit/core/models/analytics/EventStream2Response;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EventStream2Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4599c;

    public EventStream2Response(@i(name = "failure_count") int i11, @i(name = "invalid_count") int i12, @i(name = "success_count") int i13) {
        this.f4597a = i11;
        this.f4598b = i12;
        this.f4599c = i13;
    }

    @NotNull
    public final EventStream2Response copy(@i(name = "failure_count") int failureCount, @i(name = "invalid_count") int invalidCount, @i(name = "success_count") int successCount) {
        return new EventStream2Response(failureCount, invalidCount, successCount);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventStream2Response)) {
            return false;
        }
        EventStream2Response eventStream2Response = (EventStream2Response) obj;
        return this.f4597a == eventStream2Response.f4597a && this.f4598b == eventStream2Response.f4598b && this.f4599c == eventStream2Response.f4599c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4599c) + k.b(this.f4598b, Integer.hashCode(this.f4597a) * 31, 31);
    }

    public final String toString() {
        return k.i(this.f4599c, ")", k.r(this.f4597a, this.f4598b, "EventStream2Response(failureCount=", ", invalidCount=", ", successCount="));
    }
}
