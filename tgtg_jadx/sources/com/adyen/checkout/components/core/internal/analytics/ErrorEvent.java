package com.adyen.checkout.components.core.internal.analytics;

import a80.a;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/ErrorEvent;", "", "errorType", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error$Type;", "errorCode", "", "(Ljava/lang/String;ILcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error$Type;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorType", "()Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error$Type;", "REDIRECT_FAILED", "REDIRECT_PARSE_FAILED", "ENCRYPTION", "THIRD_PARTY", "API_PAYMENTS", "API_THREEDS2", "API_PUBLIC_KEY", "API_NATIVE_REDIRECT", "THREEDS2_TOKEN_MISSING", "THREEDS2_TOKEN_DECODING", "THREEDS2_FINGERPRINT_CREATION", "THREEDS2_TRANSACTION_CREATION", "THREEDS2_TRANSACTION_MISSING", "THREEDS2_FINGERPRINT_HANDLING", "THREEDS2_CHALLENGE_HANDLING", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ErrorEvent {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ErrorEvent[] $VALUES;
    public static final ErrorEvent API_NATIVE_REDIRECT;
    public static final ErrorEvent API_PAYMENTS;
    public static final ErrorEvent API_PUBLIC_KEY;
    public static final ErrorEvent API_THREEDS2;
    public static final ErrorEvent ENCRYPTION;
    public static final ErrorEvent REDIRECT_FAILED;
    public static final ErrorEvent REDIRECT_PARSE_FAILED;
    public static final ErrorEvent THIRD_PARTY;
    public static final ErrorEvent THREEDS2_CHALLENGE_HANDLING;
    public static final ErrorEvent THREEDS2_FINGERPRINT_CREATION;
    public static final ErrorEvent THREEDS2_FINGERPRINT_HANDLING;
    public static final ErrorEvent THREEDS2_TOKEN_DECODING;
    public static final ErrorEvent THREEDS2_TOKEN_MISSING;
    public static final ErrorEvent THREEDS2_TRANSACTION_CREATION;
    public static final ErrorEvent THREEDS2_TRANSACTION_MISSING;

    @NotNull
    private final String errorCode;

    @NotNull
    private final AnalyticsEvent.Error.Type errorType;

    private static final /* synthetic */ ErrorEvent[] $values() {
        return new ErrorEvent[]{REDIRECT_FAILED, REDIRECT_PARSE_FAILED, ENCRYPTION, THIRD_PARTY, API_PAYMENTS, API_THREEDS2, API_PUBLIC_KEY, API_NATIVE_REDIRECT, THREEDS2_TOKEN_MISSING, THREEDS2_TOKEN_DECODING, THREEDS2_FINGERPRINT_CREATION, THREEDS2_TRANSACTION_CREATION, THREEDS2_TRANSACTION_MISSING, THREEDS2_FINGERPRINT_HANDLING, THREEDS2_CHALLENGE_HANDLING};
    }

    static {
        AnalyticsEvent.Error.Type type = AnalyticsEvent.Error.Type.REDIRECT;
        REDIRECT_FAILED = new ErrorEvent("REDIRECT_FAILED", 0, type, "600");
        REDIRECT_PARSE_FAILED = new ErrorEvent("REDIRECT_PARSE_FAILED", 1, type, "601");
        ENCRYPTION = new ErrorEvent("ENCRYPTION", 2, AnalyticsEvent.Error.Type.INTERNAL, "610");
        THIRD_PARTY = new ErrorEvent("THIRD_PARTY", 3, AnalyticsEvent.Error.Type.THIRD_PARTY, "611");
        AnalyticsEvent.Error.Type type2 = AnalyticsEvent.Error.Type.API_ERROR;
        API_PAYMENTS = new ErrorEvent("API_PAYMENTS", 4, type2, "620");
        API_THREEDS2 = new ErrorEvent("API_THREEDS2", 5, type2, "622");
        API_PUBLIC_KEY = new ErrorEvent("API_PUBLIC_KEY", 6, type2, "625");
        API_NATIVE_REDIRECT = new ErrorEvent("API_NATIVE_REDIRECT", 7, type2, "626");
        AnalyticsEvent.Error.Type type3 = AnalyticsEvent.Error.Type.THREEDS2;
        THREEDS2_TOKEN_MISSING = new ErrorEvent("THREEDS2_TOKEN_MISSING", 8, type3, "701");
        THREEDS2_TOKEN_DECODING = new ErrorEvent("THREEDS2_TOKEN_DECODING", 9, type3, "704");
        THREEDS2_FINGERPRINT_CREATION = new ErrorEvent("THREEDS2_FINGERPRINT_CREATION", 10, type3, "705");
        THREEDS2_TRANSACTION_CREATION = new ErrorEvent("THREEDS2_TRANSACTION_CREATION", 11, type3, "706");
        THREEDS2_TRANSACTION_MISSING = new ErrorEvent("THREEDS2_TRANSACTION_MISSING", 12, type3, "707");
        THREEDS2_FINGERPRINT_HANDLING = new ErrorEvent("THREEDS2_FINGERPRINT_HANDLING", 13, type3, "708");
        THREEDS2_CHALLENGE_HANDLING = new ErrorEvent("THREEDS2_CHALLENGE_HANDLING", 14, type3, "709");
        ErrorEvent[] errorEventArr$values = $values();
        $VALUES = errorEventArr$values;
        $ENTRIES = n.w(errorEventArr$values);
    }

    private ErrorEvent(String str, int i11, AnalyticsEvent.Error.Type type, String str2) {
        this.errorType = type;
        this.errorCode = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ErrorEvent valueOf(String str) {
        return (ErrorEvent) Enum.valueOf(ErrorEvent.class, str);
    }

    public static ErrorEvent[] values() {
        return (ErrorEvent[]) $VALUES.clone();
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final AnalyticsEvent.Error.Type getErrorType() {
        return this.errorType;
    }
}
