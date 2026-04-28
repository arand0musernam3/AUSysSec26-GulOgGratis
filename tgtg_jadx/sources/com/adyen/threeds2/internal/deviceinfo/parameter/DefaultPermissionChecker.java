package com.adyen.threeds2.internal.deviceinfo.parameter;

import android.app.Application;
import ba0.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID, reason: from Kotlin metadata */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DefaultPermissionChecker;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "checkPermission", "", "permission", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultPermissionChecker implements PermissionChecker {
    private static int getSDKAppID = 0;
    private static int getSDKTransactionID = 1;

    @NotNull
    private final Application getSDKReferenceNumber;

    public DefaultPermissionChecker(@NotNull Application application) {
        application.getClass();
        this.getSDKReferenceNumber = application;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker
    public final boolean getSDKAppID(@NotNull String str) {
        int i11 = getSDKAppID;
        int i12 = ((i11 | 93) << 1) - (i11 ^ 93);
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 == 0) {
            str.getClass();
            g.h(this.getSDKReferenceNumber, str);
            throw null;
        }
        str.getClass();
        if (g.h(this.getSDKReferenceNumber, str) != 0) {
            getSDKTransactionID = (getSDKAppID + 49) % 128;
            return false;
        }
        int i13 = getSDKTransactionID;
        int i14 = (-2) - (((i13 & 116) + (i13 | 116)) ^ (-1));
        int i15 = i14 % 128;
        getSDKAppID = i15;
        boolean z11 = i14 % 2 == 0;
        int i16 = (i15 ^ 22) + ((i15 & 22) << 1);
        getSDKTransactionID = ((i16 ^ (-1)) + (i16 << 1)) % 128;
        return z11;
    }
}
