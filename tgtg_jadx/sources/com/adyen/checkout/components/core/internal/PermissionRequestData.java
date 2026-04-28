package com.adyen.checkout.components.core.internal;

import com.adyen.checkout.core.PermissionHandlerCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PermissionRequestData;", "", "requiredPermission", "", "permissionCallback", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "(Ljava/lang/String;Lcom/adyen/checkout/core/PermissionHandlerCallback;)V", "getPermissionCallback", "()Lcom/adyen/checkout/core/PermissionHandlerCallback;", "getRequiredPermission", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermissionRequestData {

    @NotNull
    private final PermissionHandlerCallback permissionCallback;

    @NotNull
    private final String requiredPermission;

    public PermissionRequestData(@NotNull String str, @NotNull PermissionHandlerCallback permissionHandlerCallback) {
        str.getClass();
        permissionHandlerCallback.getClass();
        this.requiredPermission = str;
        this.permissionCallback = permissionHandlerCallback;
    }

    public static /* synthetic */ PermissionRequestData copy$default(PermissionRequestData permissionRequestData, String str, PermissionHandlerCallback permissionHandlerCallback, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = permissionRequestData.requiredPermission;
        }
        if ((i11 & 2) != 0) {
            permissionHandlerCallback = permissionRequestData.permissionCallback;
        }
        return permissionRequestData.copy(str, permissionHandlerCallback);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequiredPermission() {
        return this.requiredPermission;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PermissionHandlerCallback getPermissionCallback() {
        return this.permissionCallback;
    }

    @NotNull
    public final PermissionRequestData copy(@NotNull String requiredPermission, @NotNull PermissionHandlerCallback permissionCallback) {
        requiredPermission.getClass();
        permissionCallback.getClass();
        return new PermissionRequestData(requiredPermission, permissionCallback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionRequestData)) {
            return false;
        }
        PermissionRequestData permissionRequestData = (PermissionRequestData) other;
        return Intrinsics.areEqual(this.requiredPermission, permissionRequestData.requiredPermission) && Intrinsics.areEqual(this.permissionCallback, permissionRequestData.permissionCallback);
    }

    @NotNull
    public final PermissionHandlerCallback getPermissionCallback() {
        return this.permissionCallback;
    }

    @NotNull
    public final String getRequiredPermission() {
        return this.requiredPermission;
    }

    public int hashCode() {
        return this.permissionCallback.hashCode() + (this.requiredPermission.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PermissionRequestData(requiredPermission=" + this.requiredPermission + ", permissionCallback=" + this.permissionCallback + ")";
    }
}
