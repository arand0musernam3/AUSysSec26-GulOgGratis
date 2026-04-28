package zendesk.android.internal;

import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import l80.e;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lzendesk/android/internal/AnalyticsSampling;", "", "<init>", "()V", "", "samplingRate", "targetValue", "Ll80/e;", "random", "", "shouldTrackAnalyticEvents", "(IILl80/e;)Z", "", "LOG_TAG", "Ljava/lang/String;", "SAMPLING_RATE", "I", "TARGET_VALUE", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsSampling {

    @NotNull
    public static final AnalyticsSampling INSTANCE = new AnalyticsSampling();

    @NotNull
    private static final String LOG_TAG = "AnalyticsSampling";
    private static final int SAMPLING_RATE = 1000;
    private static final int TARGET_VALUE = 463;

    private AnalyticsSampling() {
    }

    public static /* synthetic */ boolean shouldTrackAnalyticEvents$default(AnalyticsSampling analyticsSampling, int i11, int i12, e eVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 1000;
        }
        if ((i13 & 2) != 0) {
            i12 = TARGET_VALUE;
        }
        if ((i13 & 4) != 0) {
            eVar = e.f27503a;
        }
        return analyticsSampling.shouldTrackAnalyticEvents(i11, i12, eVar);
    }

    public final boolean shouldTrackAnalyticEvents(int samplingRate, int targetValue, @NotNull e random) {
        random.getClass();
        boolean z11 = random.c(samplingRate) == targetValue;
        Logger.d(LOG_TAG, "Tracking of user events for analytics is ".concat(z11 ? FeatureFlag.ENABLED : "disabled"), new Object[0]);
        return z11;
    }
}
