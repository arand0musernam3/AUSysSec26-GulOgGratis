package zendesk.messaging.android.internal.permissions;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.e;
import androidx.fragment.app.g1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.h;
import e.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ-\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lzendesk/messaging/android/internal/permissions/RuntimePermissionLauncher;", "Landroidx/lifecycle/h;", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Landroid/content/Context;", "context", "<init>", "(Landroidx/activity/result/ActivityResultRegistry;Landroid/content/Context;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "setupSinglePermissionLauncher", "(Landroidx/lifecycle/LifecycleOwner;)V", "", "permission", "", "isPermissionGranted", "(Ljava/lang/String;)Z", "onCreate", "Lkotlin/Function1;", "onSinglePermissionResult", "launchSinglePermissionRequest", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/activity/result/ActivityResultRegistry;", "Landroid/content/Context;", "Landroidx/activity/result/ActivityResultLauncher;", "singlePermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "singlePermissionResultCallback", "Lkotlin/jvm/functions/Function1;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RuntimePermissionLauncher implements h {

    @NotNull
    public static final String SINGLE_PERMISSION_KEY = "SINGLE_PERMISSION_KEY";

    @NotNull
    private final Context context;

    @NotNull
    private final ActivityResultRegistry registry;
    private ActivityResultLauncher<String> singlePermissionLauncher;

    @Nullable
    private Function1<? super Boolean, Unit> singlePermissionResultCallback;

    public RuntimePermissionLauncher(@NotNull ActivityResultRegistry activityResultRegistry, @NotNull Context context) {
        activityResultRegistry.getClass();
        context.getClass();
        this.registry = activityResultRegistry;
        this.context = context;
    }

    private final boolean isPermissionGranted(String permission) {
        return e.a(this.context, permission) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void launchSinglePermissionRequest$default(RuntimePermissionLauncher runtimePermissionLauncher, String str, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        runtimePermissionLauncher.launchSinglePermissionRequest(str, function1);
    }

    private final void setupSinglePermissionLauncher(LifecycleOwner owner) {
        this.singlePermissionLauncher = this.registry.d(SINGLE_PERMISSION_KEY, owner, new g1(3), new b(this, 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSinglePermissionLauncher$lambda$0(RuntimePermissionLauncher runtimePermissionLauncher, boolean z11) {
        Function1<? super Boolean, Unit> function1 = runtimePermissionLauncher.singlePermissionResultCallback;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
        runtimePermissionLauncher.singlePermissionResultCallback = null;
    }

    public final void launchSinglePermissionRequest(@NotNull String permission, @Nullable Function1<? super Boolean, Unit> onSinglePermissionResult) {
        permission.getClass();
        if (isPermissionGranted(permission)) {
            if (onSinglePermissionResult != null) {
                onSinglePermissionResult.invoke(Boolean.TRUE);
            }
        } else {
            this.singlePermissionResultCallback = onSinglePermissionResult;
            ActivityResultLauncher<String> activityResultLauncher = this.singlePermissionLauncher;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("singlePermissionLauncher");
                activityResultLauncher = null;
            }
            activityResultLauncher.a(permission, null);
        }
    }

    @Override // androidx.lifecycle.h
    public void onCreate(@NotNull LifecycleOwner owner) {
        owner.getClass();
        owner.getClass();
        setupSinglePermissionLauncher(owner);
    }

    @Override // androidx.lifecycle.h
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.h
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.h
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.h
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.h
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }
}
