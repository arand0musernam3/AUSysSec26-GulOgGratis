package com.adyen.checkout.ui.core.internal.util;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/util/PermissionHandlerResult;", "", "(Ljava/lang/String;I)V", "PERMISSION_GRANTED", "PERMISSION_DENIED", "PERMISSION_REQUEST_NOT_HANDLED", "WRONG_PERMISSION", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PermissionHandlerResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PermissionHandlerResult[] $VALUES;
    public static final PermissionHandlerResult PERMISSION_GRANTED = new PermissionHandlerResult("PERMISSION_GRANTED", 0);
    public static final PermissionHandlerResult PERMISSION_DENIED = new PermissionHandlerResult("PERMISSION_DENIED", 1);
    public static final PermissionHandlerResult PERMISSION_REQUEST_NOT_HANDLED = new PermissionHandlerResult("PERMISSION_REQUEST_NOT_HANDLED", 2);
    public static final PermissionHandlerResult WRONG_PERMISSION = new PermissionHandlerResult("WRONG_PERMISSION", 3);

    private static final /* synthetic */ PermissionHandlerResult[] $values() {
        return new PermissionHandlerResult[]{PERMISSION_GRANTED, PERMISSION_DENIED, PERMISSION_REQUEST_NOT_HANDLED, WRONG_PERMISSION};
    }

    static {
        PermissionHandlerResult[] permissionHandlerResultArr$values = $values();
        $VALUES = permissionHandlerResultArr$values;
        $ENTRIES = n.w(permissionHandlerResultArr$values);
    }

    private PermissionHandlerResult(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PermissionHandlerResult valueOf(String str) {
        return (PermissionHandlerResult) Enum.valueOf(PermissionHandlerResult.class, str);
    }

    public static PermissionHandlerResult[] values() {
        return (PermissionHandlerResult[]) $VALUES.clone();
    }
}
