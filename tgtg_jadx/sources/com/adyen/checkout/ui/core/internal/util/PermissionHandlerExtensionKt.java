package com.adyen.checkout.ui.core.internal.util;

import android.content.Context;
import androidx.core.app.e;
import com.adyen.checkout.core.PermissionHandlerCallback;
import com.adyen.checkout.core.internal.ui.PermissionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.o;
import u70.q;
import v80.k;
import v80.l;
import x70.c;
import y70.a;
import y70.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/core/internal/ui/PermissionHandler;", "Landroid/content/Context;", "context", "", "requiredPermission", "Lcom/adyen/checkout/ui/core/internal/util/PermissionHandlerResult;", "checkPermission", "(Lcom/adyen/checkout/core/internal/ui/PermissionHandler;Landroid/content/Context;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionHandlerExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionHandlerExtension.kt\ncom/adyen/checkout/ui/core/internal/util/PermissionHandlerExtensionKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,57:1\n351#2,11:58\n*S KotlinDebug\n*F\n+ 1 PermissionHandlerExtension.kt\ncom/adyen/checkout/ui/core/internal/util/PermissionHandlerExtensionKt\n*L\n22#1:58,11\n*E\n"})
public final class PermissionHandlerExtensionKt {
    @Nullable
    public static final Object checkPermission(@NotNull PermissionHandler permissionHandler, @NotNull Context context, @NotNull final String str, @NotNull c<? super PermissionHandlerResult> cVar) {
        final l lVar = new l(1, f.b(cVar));
        lVar.t();
        if (e.a(context, str) == 0) {
            o oVar = q.f40850b;
            lVar.resumeWith(PermissionHandlerResult.PERMISSION_GRANTED);
        } else {
            permissionHandler.requestPermission(context, str, new PermissionHandlerCallback() { // from class: com.adyen.checkout.ui.core.internal.util.PermissionHandlerExtensionKt$checkPermission$2$1
                @Override // com.adyen.checkout.core.PermissionHandlerCallback
                public void onPermissionDenied(@NotNull String requestedPermission) {
                    requestedPermission.getClass();
                    k kVar = lVar;
                    o oVar2 = q.f40850b;
                    kVar.resumeWith(PermissionHandlerResult.PERMISSION_DENIED);
                }

                @Override // com.adyen.checkout.core.PermissionHandlerCallback
                public void onPermissionGranted(@NotNull String requestedPermission) {
                    requestedPermission.getClass();
                    boolean zAreEqual = Intrinsics.areEqual(requestedPermission, str);
                    k kVar = lVar;
                    if (zAreEqual) {
                        o oVar2 = q.f40850b;
                        kVar.resumeWith(PermissionHandlerResult.PERMISSION_GRANTED);
                    } else {
                        o oVar3 = q.f40850b;
                        kVar.resumeWith(PermissionHandlerResult.WRONG_PERMISSION);
                    }
                }

                @Override // com.adyen.checkout.core.PermissionHandlerCallback
                public void onPermissionRequestNotHandled(@NotNull String requestedPermission) {
                    requestedPermission.getClass();
                    k kVar = lVar;
                    o oVar2 = q.f40850b;
                    kVar.resumeWith(PermissionHandlerResult.PERMISSION_REQUEST_NOT_HANDLED);
                }
            });
        }
        Object objS = lVar.s();
        a aVar = a.COROUTINE_SUSPENDED;
        return objS;
    }
}
