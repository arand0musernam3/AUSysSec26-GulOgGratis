package com.adyen.checkout.components.core.internal.data.model.sdkData;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/sdkData/Analytics;", "", "checkoutAttemptId", "", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "serialize", "Lorg/json/JSONObject;", "toString", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Analytics {

    @NotNull
    private static final String CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";

    @Nullable
    private final String checkoutAttemptId;

    public /* synthetic */ Analytics(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Analytics copy$default(Analytics analytics, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analytics.checkoutAttemptId;
        }
        return analytics.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @NotNull
    public final Analytics copy(@Nullable String checkoutAttemptId) {
        return new Analytics(checkoutAttemptId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Analytics) && Intrinsics.areEqual(this.checkoutAttemptId, ((Analytics) other).checkoutAttemptId);
    }

    @Nullable
    public final String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    public int hashCode() {
        String str = this.checkoutAttemptId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public final JSONObject serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("checkoutAttemptId", this.checkoutAttemptId);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return a0.p("Analytics(checkoutAttemptId=", this.checkoutAttemptId, ")");
    }

    public Analytics(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Analytics() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
