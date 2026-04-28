package com.adyen.checkout.components.core.internal;

import k80.d;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/components/core/internal/SavedStateHandleProperty;", "", "T", "Lk80/d;", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;", "", "key", "<init>", "(Ljava/lang/String;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Ljava/lang/String;", "backingProperty", "Ljava/lang/Object;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SavedStateHandleProperty<T> implements d {

    @Nullable
    private T backingProperty;

    @NotNull
    private final String key;

    public SavedStateHandleProperty(@NotNull String str) {
        str.getClass();
        this.key = str;
    }

    @Nullable
    public T getValue(@NotNull SavedStateHandleContainer thisRef, @NotNull KProperty<?> property) {
        thisRef.getClass();
        property.getClass();
        if (this.backingProperty == null) {
            this.backingProperty = (T) thisRef.getSavedStateHandle().a(this.key);
        }
        return this.backingProperty;
    }

    public void setValue(@NotNull SavedStateHandleContainer thisRef, @NotNull KProperty<?> property, @Nullable T value) {
        thisRef.getClass();
        property.getClass();
        thisRef.getSavedStateHandle().d(value, this.key);
        this.backingProperty = value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k80.d
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        setValue((SavedStateHandleContainer) obj, (KProperty<?>) kProperty, obj2);
    }

    @Override // k80.c
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((SavedStateHandleContainer) obj, (KProperty<?>) kProperty);
    }
}
