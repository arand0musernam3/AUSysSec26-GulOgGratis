package com.adyen.checkout.adyen3ds2.internal.analytics;

import a80.a;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.components.core.internal.analytics.ErrorEvent;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/analytics/ThreeDS2Events;", "", "()V", "threeDS2Challenge", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log;", "subType", "Lcom/adyen/checkout/adyen3ds2/internal/analytics/ThreeDS2Events$SubType;", "result", "Lcom/adyen/checkout/adyen3ds2/internal/analytics/ThreeDS2Events$Result;", InAppMessageBase.MESSAGE, "", "threeDS2ChallengeError", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error;", "event", "Lcom/adyen/checkout/components/core/internal/analytics/ErrorEvent;", "threeDS2Fingerprint", "threeDS2FingerprintError", "Result", "SubType", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ThreeDS2Events {

    @NotNull
    public static final ThreeDS2Events INSTANCE = new ThreeDS2Events();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/analytics/ThreeDS2Events$Result;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CANCELLED", "COMPLETED", "TIMEOUT", "ERROR", "REDIRECT", "THREEDS2", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Result {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;

        @NotNull
        private final String value;
        public static final Result CANCELLED = new Result("CANCELLED", 0, "cancelled");
        public static final Result COMPLETED = new Result("COMPLETED", 1, "completed");
        public static final Result TIMEOUT = new Result("TIMEOUT", 2, "timeout");
        public static final Result ERROR = new Result("ERROR", 3, StatusResponseUtils.RESULT_ERROR);
        public static final Result REDIRECT = new Result("REDIRECT", 4, "redirect");
        public static final Result THREEDS2 = new Result("THREEDS2", 5, "threeDS2");

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{CANCELLED, COMPLETED, TIMEOUT, ERROR, REDIRECT, THREEDS2};
        }

        static {
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = n.w(resultArr$values);
        }

        private Result(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/analytics/ThreeDS2Events$SubType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FINGERPRINT_DATA_SENT", "FINGERPRINT_COMPLETED", "CHALLENGE_DATA_SENT", "CHALLENGE_DISPLAYED", "CHALLENGE_COMPLETED", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SubType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SubType[] $VALUES;

        @NotNull
        private final String value;
        public static final SubType FINGERPRINT_DATA_SENT = new SubType("FINGERPRINT_DATA_SENT", 0, "fingerprintDataSentMobile");
        public static final SubType FINGERPRINT_COMPLETED = new SubType("FINGERPRINT_COMPLETED", 1, "fingerprintCompleted");
        public static final SubType CHALLENGE_DATA_SENT = new SubType("CHALLENGE_DATA_SENT", 2, "challengeDataSentMobile");
        public static final SubType CHALLENGE_DISPLAYED = new SubType("CHALLENGE_DISPLAYED", 3, "challengeDisplayed");
        public static final SubType CHALLENGE_COMPLETED = new SubType("CHALLENGE_COMPLETED", 4, "challengeCompleted");

        private static final /* synthetic */ SubType[] $values() {
            return new SubType[]{FINGERPRINT_DATA_SENT, FINGERPRINT_COMPLETED, CHALLENGE_DATA_SENT, CHALLENGE_DISPLAYED, CHALLENGE_COMPLETED};
        }

        static {
            SubType[] subTypeArr$values = $values();
            $VALUES = subTypeArr$values;
            $ENTRIES = n.w(subTypeArr$values);
        }

        private SubType(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static SubType valueOf(String str) {
            return (SubType) Enum.valueOf(SubType.class, str);
        }

        public static SubType[] values() {
            return (SubType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    private ThreeDS2Events() {
    }

    public static /* synthetic */ AnalyticsEvent.Log threeDS2Challenge$default(ThreeDS2Events threeDS2Events, SubType subType, Result result, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            result = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        return threeDS2Events.threeDS2Challenge(subType, result, str);
    }

    public static /* synthetic */ AnalyticsEvent.Error threeDS2ChallengeError$default(ThreeDS2Events threeDS2Events, ErrorEvent errorEvent, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return threeDS2Events.threeDS2ChallengeError(errorEvent, str);
    }

    public static /* synthetic */ AnalyticsEvent.Log threeDS2Fingerprint$default(ThreeDS2Events threeDS2Events, SubType subType, Result result, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            result = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        return threeDS2Events.threeDS2Fingerprint(subType, result, str);
    }

    public static /* synthetic */ AnalyticsEvent.Error threeDS2FingerprintError$default(ThreeDS2Events threeDS2Events, ErrorEvent errorEvent, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return threeDS2Events.threeDS2FingerprintError(errorEvent, str);
    }

    @NotNull
    public final AnalyticsEvent.Log threeDS2Challenge(@NotNull SubType subType, @Nullable Result result, @Nullable String message) {
        subType.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, "threeDS2Challenge", AnalyticsEvent.Log.Type.THREEDS2, subType.getValue(), result != null ? result.getValue() : null, null, message, 135, null);
    }

    @NotNull
    public final AnalyticsEvent.Error threeDS2ChallengeError(@NotNull ErrorEvent event, @Nullable String message) {
        event.getClass();
        return GenericEvents.error$default(GenericEvents.INSTANCE, "threeDS2Challenge", event, null, message, 4, null);
    }

    @NotNull
    public final AnalyticsEvent.Log threeDS2Fingerprint(@NotNull SubType subType, @Nullable Result result, @Nullable String message) {
        subType.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, "threeDS2Fingerprint", AnalyticsEvent.Log.Type.THREEDS2, subType.getValue(), result != null ? result.getValue() : null, null, message, 135, null);
    }

    @NotNull
    public final AnalyticsEvent.Error threeDS2FingerprintError(@NotNull ErrorEvent event, @Nullable String message) {
        event.getClass();
        return GenericEvents.error$default(GenericEvents.INSTANCE, "threeDS2Fingerprint", event, null, message, 4, null);
    }
}
