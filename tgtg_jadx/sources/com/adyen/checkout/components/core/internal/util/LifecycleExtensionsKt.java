package com.adyen.checkout.components.core.internal.util;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¨\u0006\u0005"}, d2 = {"repeatOnResume", "", "Landroidx/lifecycle/LifecycleOwner;", "callback", "Lkotlin/Function0;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LifecycleExtensionsKt {
    public static final void repeatOnResume(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> function0) {
        lifecycleOwner.getClass();
        function0.getClass();
        lifecycleOwner.getLifecycle().a(new h() { // from class: com.adyen.checkout.components.core.internal.util.LifecycleExtensionsKt.repeatOnResume.1
            @Override // androidx.lifecycle.h
            public void onCreate(@NotNull LifecycleOwner lifecycleOwner2) {
                lifecycleOwner2.getClass();
            }

            @Override // androidx.lifecycle.h
            public void onDestroy(@NotNull LifecycleOwner lifecycleOwner2) {
                lifecycleOwner2.getClass();
            }

            @Override // androidx.lifecycle.h
            public void onPause(@NotNull LifecycleOwner lifecycleOwner2) {
                lifecycleOwner2.getClass();
            }

            @Override // androidx.lifecycle.h
            public void onResume(@NotNull LifecycleOwner owner) {
                owner.getClass();
                function0.invoke();
            }

            @Override // androidx.lifecycle.h
            public void onStart(@NotNull LifecycleOwner lifecycleOwner2) {
                lifecycleOwner2.getClass();
            }

            @Override // androidx.lifecycle.h
            public void onStop(@NotNull LifecycleOwner lifecycleOwner2) {
                lifecycleOwner2.getClass();
            }
        });
    }
}
