package n90;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@i90.h(with = e0.class)
public final class b0 extends n implements Map<String, n>, KMappedMarker {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f30747a;

    public b0(Map map) {
        map.getClass();
        this.f30747a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n compute(String str, BiFunction<? super String, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n computeIfAbsent(String str, Function<? super String, ? extends n> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n computeIfPresent(String str, BiFunction<? super String, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f30747a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        return this.f30747a.containsValue((n) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, n>> entrySet() {
        return this.f30747a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f30747a, obj);
    }

    @Override // java.util.Map
    public final n get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (n) this.f30747a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f30747a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f30747a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f30747a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n merge(String str, n nVar, BiFunction<? super n, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n put(String str, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends n> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n putIfAbsent(String str, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final n remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n replace(String str, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f30747a.size();
    }

    public final String toString() {
        return CollectionsKt.U(this.f30747a.entrySet(), MessageLogView.COMMA_SEPARATOR, "{", "}", new m5.d0(20), 24);
    }

    @Override // java.util.Map
    public final Collection<n> values() {
        return this.f30747a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, n nVar, n nVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
