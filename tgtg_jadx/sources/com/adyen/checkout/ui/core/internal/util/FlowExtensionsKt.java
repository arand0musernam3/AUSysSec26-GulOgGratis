package com.adyen.checkout.ui.core.internal.util;

import com.adyen.checkout.ui.core.internal.ui.ComponentViewType;
import kotlin.Metadata;
import mn.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import y80.i;
import y80.p1;
import y80.q1;
import y80.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv80/b0;", "scope", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "paymentMethodViewFlow", "genericActionViewFlow", "initialValue", "Ly80/q1;", "started", "Ly80/y1;", "mergeViewFlows", "(Lv80/b0;Ly80/i;Ly80/i;Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;Ly80/q1;)Ly80/y1;", "ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FlowExtensionsKt {
    @NotNull
    public static final y1 mergeViewFlows(@NotNull b0 b0Var, @NotNull i iVar, @NotNull i iVar2, @Nullable ComponentViewType componentViewType, @NotNull q1 q1Var) {
        b0Var.getClass();
        iVar.getClass();
        iVar2.getClass();
        q1Var.getClass();
        return com.adyen.checkout.components.core.internal.util.FlowExtensionsKt.mergeStateFlows(b0Var, q1Var, componentViewType, iVar, new j(iVar2, 15));
    }

    public static /* synthetic */ y1 mergeViewFlows$default(b0 b0Var, i iVar, i iVar2, ComponentViewType componentViewType, q1 q1Var, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            componentViewType = null;
        }
        if ((i11 & 16) != 0) {
            q1Var = p1.f45552b;
        }
        return mergeViewFlows(b0Var, iVar, iVar2, componentViewType, q1Var);
    }
}
