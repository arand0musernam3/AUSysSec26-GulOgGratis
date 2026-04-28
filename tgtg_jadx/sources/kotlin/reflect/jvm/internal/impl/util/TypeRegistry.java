package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeRegistry<K, V> {

    @NotNull
    private final ConcurrentHashMap<String, Integer> idPerType = new ConcurrentHashMap<>();

    @NotNull
    private final AtomicInteger idCounter = new AtomicInteger(0);

    public abstract int customComputeIfAbsent(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> generateNullableAccessor(@NotNull KClass<KK> kClass) {
        kClass.getClass();
        return new NullableArrayMapAccessor<>(kClass, getId(kClass));
    }

    public final <T extends K> int getId(@NotNull KClass<T> kClass) {
        kClass.getClass();
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.idPerType;
        String qualifiedName = kClass.getQualifiedName();
        qualifiedName.getClass();
        return customComputeIfAbsent(concurrentHashMap, qualifiedName, new Function1<String, Integer>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.TypeRegistry.getId.1
            final /* synthetic */ TypeRegistry<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull String str) {
                str.getClass();
                return Integer.valueOf(((TypeRegistry) this.this$0).idCounter.getAndIncrement());
            }
        });
    }

    @NotNull
    public final Collection<Integer> getIndices() {
        Collection<Integer> collectionValues = this.idPerType.values();
        collectionValues.getClass();
        return collectionValues;
    }
}
