package kotlin.reflect.jvm.internal.impl.util;

import k80.c;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullableArrayMapAccessor(@NotNull KClass<? extends K> kClass, int i11) {
        super(kClass, i11);
        kClass.getClass();
    }

    @Nullable
    public T getValue(@NotNull AbstractArrayMapOwner<K, V> abstractArrayMapOwner, @NotNull KProperty<?> kProperty) {
        abstractArrayMapOwner.getClass();
        kProperty.getClass();
        return extractValue(abstractArrayMapOwner);
    }

    @Override // k80.c
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((AbstractArrayMapOwner) obj, (KProperty<?>) kProperty);
    }
}
