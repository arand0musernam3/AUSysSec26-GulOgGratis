package com.adyen.checkout.components.core.internal;

import androidx.lifecycle.LifecycleOwner;
import com.adyen.checkout.components.core.internal.util.FlowExtensionsKt;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import v80.i1;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0003R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ObserverContainer;", "", "<init>", "()V", "T", "Ly80/i;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lv80/b0;", "coroutineScope", "Lkotlin/Function1;", "", "callback", "observe$components_core_release", "(Ly80/i;Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "observe", "removeObservers$components_core_release", "removeObservers", "", "Lv80/i1;", "observerJobs", "Ljava/util/List;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nObserverContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverContainer.kt\ncom/adyen/checkout/components/core/internal/ObserverContainer\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n16#2,17:47\n1863#3,2:64\n*S KotlinDebug\n*F\n+ 1 ObserverContainer.kt\ncom/adyen/checkout/components/core/internal/ObserverContainer\n*L\n41#1:47,17\n42#1:64,2\n*E\n"})
public final class ObserverContainer {

    @NotNull
    private List<i1> observerJobs = new ArrayList();

    public final <T> void observe$components_core_release(@NotNull i iVar, @NotNull LifecycleOwner lifecycleOwner, @NotNull b0 b0Var, @NotNull Function1<? super T, Unit> function1) {
        iVar.getClass();
        lifecycleOwner.getClass();
        b0Var.getClass();
        function1.getClass();
        this.observerJobs.add(FlowExtensionsKt.mapToCallbackWithLifeCycle(iVar, lifecycleOwner, b0Var, function1));
    }

    public final void removeObservers$components_core_release() {
        if (this.observerJobs.isEmpty()) {
            return;
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = ObserverContainer.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "cleaning up existing observer", null);
        }
        Iterator<T> it = this.observerJobs.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).a(null);
        }
        this.observerJobs.clear();
    }
}
