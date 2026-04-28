package com.adyen.checkout.adyen3ds2.internal.data.model;

import com.adyen.checkout.adyen3ds2.internal.data.model.ChallengeResult;
import com.adyen.checkout.core.exception.ComponentException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/Adyen3DS2Serializer;", "", "()V", "createChallengeDetails", "Lorg/json/JSONObject;", "transactionStatus", "", "errorDetails", "createFingerprintDetails", "encodedFingerprint", "createThreeDsResultDetails", "authorisationToken", "Companion", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Adyen3DS2Serializer {

    @NotNull
    private static final String CHALLENGE_DETAILS_KEY = "threeds2.challengeResult";

    @NotNull
    private static final String FINGERPRINT_DETAILS_KEY = "threeds2.fingerprint";

    @NotNull
    private static final String THREEDS_RESULT_KEY = "threeDSResult";

    public static /* synthetic */ JSONObject createChallengeDetails$default(Adyen3DS2Serializer adyen3DS2Serializer, String str, String str2, int i11, Object obj) throws ComponentException {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return adyen3DS2Serializer.createChallengeDetails(str, str2);
    }

    public static /* synthetic */ JSONObject createThreeDsResultDetails$default(Adyen3DS2Serializer adyen3DS2Serializer, String str, String str2, String str3, int i11, Object obj) throws ComponentException {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return adyen3DS2Serializer.createThreeDsResultDetails(str, str2, str3);
    }

    @NotNull
    public final JSONObject createChallengeDetails(@NotNull String transactionStatus, @Nullable String errorDetails) throws ComponentException {
        transactionStatus.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CHALLENGE_DETAILS_KEY, ChallengeResult.Companion.from$default(ChallengeResult.INSTANCE, transactionStatus, errorDetails, null, 4, null).getPayload());
            return jSONObject;
        } catch (JSONException e5) {
            throw new ComponentException("Failed to create challenge details", e5);
        }
    }

    @NotNull
    public final JSONObject createFingerprintDetails(@NotNull String encodedFingerprint) throws ComponentException {
        encodedFingerprint.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FINGERPRINT_DETAILS_KEY, encodedFingerprint);
            return jSONObject;
        } catch (JSONException e5) {
            throw new ComponentException("Failed to create fingerprint details", e5);
        }
    }

    @NotNull
    public final JSONObject createThreeDsResultDetails(@NotNull String transactionStatus, @NotNull String authorisationToken, @Nullable String errorDetails) throws ComponentException {
        transactionStatus.getClass();
        authorisationToken.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(THREEDS_RESULT_KEY, ChallengeResult.INSTANCE.from(transactionStatus, errorDetails, authorisationToken).getPayload());
            return jSONObject;
        } catch (JSONException e5) {
            throw new ComponentException("Failed to create ThreeDS Result details", e5);
        }
    }
}
