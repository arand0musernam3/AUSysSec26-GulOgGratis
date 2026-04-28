package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyWrappedType extends WrappedType {

    @NotNull
    private final Function0<KotlinType> computation;

    @NotNull
    private final NotNullLazyValue<KotlinType> lazyValue;

    @NotNull
    private final StorageManager storageManager;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull Function0<? extends KotlinType> function0) {
        storageManager.getClass();
        function0.getClass();
        this.storageManager = storageManager;
        this.computation = function0;
        this.lazyValue = storageManager.createLazyValue(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    public KotlinType getDelegate() {
        return (KotlinType) this.lazyValue.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public LazyWrappedType refine(@NotNull final KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new LazyWrappedType(this.storageManager, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType.refine.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KotlinType invoke() {
                return kotlinTypeRefiner.refineType((KotlinTypeMarker) this.computation.invoke());
            }
        });
    }
}
