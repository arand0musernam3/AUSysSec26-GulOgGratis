package com.adyen.checkout.components.core.internal.analytics.data.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/data/local/AnalyticsLocalDataStore;", "T", "", "event", "", "storeEvent", "(Ljava/lang/Object;Lx70/c;)Ljava/lang/Object;", "", "size", "", "fetchEvents", "(ILx70/c;)Ljava/lang/Object;", "events", "removeEvents", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnalyticsLocalDataStore<T> {
    @Nullable
    Object fetchEvents(int i11, @NotNull c<? super List<? extends T>> cVar);

    @Nullable
    Object removeEvents(@NotNull List<? extends T> list, @NotNull c<? super Unit> cVar);

    @Nullable
    Object storeEvent(T t9, @NotNull c<? super Unit> cVar);
}
