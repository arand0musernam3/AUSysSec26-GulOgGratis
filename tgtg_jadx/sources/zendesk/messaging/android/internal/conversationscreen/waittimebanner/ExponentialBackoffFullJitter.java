package zendesk.messaging.android.internal.conversationscreen.waittimebanner;

import kotlin.Metadata;
import l80.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/ExponentialBackoffFullJitter;", "", "baseDelay", "", "maxDelay", "<init>", "(JJ)V", "calculateExponentialBackoff", "attempt", "", "getBackoffTime", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExponentialBackoffFullJitter {
    private final long baseDelay;
    private final long maxDelay;

    public ExponentialBackoffFullJitter(long j9, long j11) {
        this.baseDelay = j9;
        this.maxDelay = j11;
    }

    private final long calculateExponentialBackoff(int attempt) {
        return Math.min(this.maxDelay, (long) (Math.pow(2.0d, attempt) * this.baseDelay));
    }

    public final long getBackoffTime(int attempt) {
        long jCalculateExponentialBackoff = calculateExponentialBackoff(attempt);
        e.f27503a.getClass();
        return e.f27504b.f(0L, jCalculateExponentialBackoff);
    }
}
