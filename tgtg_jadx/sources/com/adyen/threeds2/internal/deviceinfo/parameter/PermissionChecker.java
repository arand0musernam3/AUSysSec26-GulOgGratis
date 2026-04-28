package com.adyen.threeds2.internal.deviceinfo.parameter;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.adyen.threeds2.internal.deviceinfo.parameter.AuthenticationRequestParameters, reason: from Kotlin metadata */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "", "checkPermission", "", "permission", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PermissionChecker {
    boolean getSDKAppID(@NotNull String str);
}
