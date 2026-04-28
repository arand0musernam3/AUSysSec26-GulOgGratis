package com.adyen.checkout.adyen3ds2.internal.data.model;

import f80.a;
import f80.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/ChallengeResult;", "", "isAuthenticated", "", "payload", "", "(ZLjava/lang/String;)V", "()Z", "getPayload", "()Ljava/lang/String;", "Companion", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChallengeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_AUTHORISATION_TOKEN = "authorisationToken";

    @NotNull
    private static final String KEY_SDK_ERROR = "threeDS2SDKError";

    @NotNull
    private static final String KEY_TRANSACTION_STATUS = "transStatus";

    @NotNull
    private static final String VALUE_TRANSACTION_STATUS = "Y";
    private final boolean isAuthenticated;

    @NotNull
    private final String payload;

    private ChallengeResult(boolean z11, String str) {
        this.isAuthenticated = z11;
        this.payload = str;
    }

    @NotNull
    public final String getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: isAuthenticated, reason: from getter */
    public final boolean getIsAuthenticated() {
        return this.isAuthenticated;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/ChallengeResult$Companion;", "", "()V", "KEY_AUTHORISATION_TOKEN", "", "KEY_SDK_ERROR", "KEY_TRANSACTION_STATUS", "VALUE_TRANSACTION_STATUS", "from", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/ChallengeResult;", "transactionStatus", "errorDetails", ChallengeResult.KEY_AUTHORISATION_TOKEN, "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ChallengeResult from$default(Companion companion, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            return companion.from(str, str2, str3);
        }

        @NotNull
        public final ChallengeResult from(@NotNull String transactionStatus, @Nullable String errorDetails, @Nullable String authorisationToken) throws JSONException {
            transactionStatus.getClass();
            boolean zAreEqual = Intrinsics.areEqual(ChallengeResult.VALUE_TRANSACTION_STATUS, transactionStatus);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ChallengeResult.KEY_TRANSACTION_STATUS, transactionStatus);
            jSONObject.putOpt(ChallengeResult.KEY_AUTHORISATION_TOKEN, authorisationToken);
            jSONObject.putOpt(ChallengeResult.KEY_SDK_ERROR, errorDetails);
            a aVar = c.f17515f;
            String string = jSONObject.toString();
            string.getClass();
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            bytes.getClass();
            return new ChallengeResult(zAreEqual, c.b(aVar, bytes), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ChallengeResult(boolean z11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str);
    }
}
