package zendesk.ui.android.conversation.waittimebanner;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/ResponseTime;", "", "lower", "", "upper", "<init>", "(JJ)V", "getLower", "()J", "getUpper", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ResponseTime {
    public static final int $stable = 0;
    private final long lower;
    private final long upper;

    public /* synthetic */ ResponseTime(long j9, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j9, (i11 & 2) != 0 ? 0L : j11);
    }

    public static /* synthetic */ ResponseTime copy$default(ResponseTime responseTime, long j9, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = responseTime.lower;
        }
        if ((i11 & 2) != 0) {
            j11 = responseTime.upper;
        }
        return responseTime.copy(j9, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLower() {
        return this.lower;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUpper() {
        return this.upper;
    }

    @NotNull
    public final ResponseTime copy(long lower, long upper) {
        return new ResponseTime(lower, upper);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseTime)) {
            return false;
        }
        ResponseTime responseTime = (ResponseTime) other;
        return this.lower == responseTime.lower && this.upper == responseTime.upper;
    }

    public final long getLower() {
        return this.lower;
    }

    public final long getUpper() {
        return this.upper;
    }

    public int hashCode() {
        return Long.hashCode(this.upper) + (Long.hashCode(this.lower) * 31);
    }

    @NotNull
    public String toString() {
        return a0.j(this.upper, ")", l1.g("ResponseTime(lower=", this.lower, ", upper="));
    }

    public ResponseTime(long j9, long j11) {
        this.lower = j9;
        this.upper = j11;
    }

    public ResponseTime() {
        this(0L, 0L, 3, null);
    }
}
