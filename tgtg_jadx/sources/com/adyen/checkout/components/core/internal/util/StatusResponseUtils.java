package com.adyen.checkout.components.core.internal.util;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/internal/util/StatusResponseUtils;", "", "()V", "RESULT_AUTHORIZED", "", "RESULT_CANCELED", "RESULT_ERROR", "RESULT_PENDING", "RESULT_REFUSED", "isFinalResult", "", "statusResponse", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StatusResponseUtils {

    @NotNull
    public static final StatusResponseUtils INSTANCE = new StatusResponseUtils();

    @NotNull
    public static final String RESULT_AUTHORIZED = "authorised";

    @NotNull
    public static final String RESULT_CANCELED = "canceled";

    @NotNull
    public static final String RESULT_ERROR = "error";

    @NotNull
    public static final String RESULT_PENDING = "pending";

    @NotNull
    public static final String RESULT_REFUSED = "refused";

    private StatusResponseUtils() {
    }

    public final boolean isFinalResult(@NotNull StatusResponse statusResponse) {
        statusResponse.getClass();
        return !Intrinsics.areEqual(RESULT_PENDING, statusResponse.getResultCode());
    }
}
