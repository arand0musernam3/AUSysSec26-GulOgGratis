package com.adyen.checkout.components.core.action;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/action/ActionTypes;", "", "()V", "AWAIT", "", "NATIVE_REDIRECT", "QR_CODE", "REDIRECT", "SDK", "THREEDS2", "THREEDS2_CHALLENGE", "THREEDS2_FINGERPRINT", "VOUCHER", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ActionTypes {

    @NotNull
    public static final String AWAIT = "await";

    @NotNull
    public static final ActionTypes INSTANCE = new ActionTypes();

    @NotNull
    public static final String NATIVE_REDIRECT = "nativeRedirect";

    @NotNull
    public static final String QR_CODE = "qrCode";

    @NotNull
    public static final String REDIRECT = "redirect";

    @NotNull
    public static final String SDK = "sdk";

    @NotNull
    public static final String THREEDS2 = "threeDS2";

    @NotNull
    public static final String THREEDS2_CHALLENGE = "threeDS2Challenge";

    @NotNull
    public static final String THREEDS2_FINGERPRINT = "threeDS2Fingerprint";

    @NotNull
    public static final String VOUCHER = "voucher";

    private ActionTypes() {
    }
}
