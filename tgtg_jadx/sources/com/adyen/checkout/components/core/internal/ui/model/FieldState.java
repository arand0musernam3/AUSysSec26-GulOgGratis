package com.adyen.checkout.components.core.internal.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "T", "", "value", "validation", "Lcom/adyen/checkout/components/core/internal/ui/model/Validation;", "(Ljava/lang/Object;Lcom/adyen/checkout/components/core/internal/ui/model/Validation;)V", "getValidation", "()Lcom/adyen/checkout/components/core/internal/ui/model/Validation;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/adyen/checkout/components/core/internal/ui/model/Validation;)Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "equals", "", "other", "hashCode", "", "toString", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FieldState<T> {

    @NotNull
    private final Validation validation;
    private final T value;

    public FieldState(T t9, @NotNull Validation validation) {
        validation.getClass();
        this.value = t9;
        this.validation = validation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FieldState copy$default(FieldState fieldState, Object obj, Validation validation, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = fieldState.value;
        }
        if ((i11 & 2) != 0) {
            validation = fieldState.validation;
        }
        return fieldState.copy(obj, validation);
    }

    public final T component1() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Validation getValidation() {
        return this.validation;
    }

    @NotNull
    public final FieldState<T> copy(T value, @NotNull Validation validation) {
        validation.getClass();
        return new FieldState<>(value, validation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldState)) {
            return false;
        }
        FieldState fieldState = (FieldState) other;
        return Intrinsics.areEqual(this.value, fieldState.value) && Intrinsics.areEqual(this.validation, fieldState.validation);
    }

    @NotNull
    public final Validation getValidation() {
        return this.validation;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t9 = this.value;
        return this.validation.hashCode() + ((t9 == null ? 0 : t9.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "FieldState(value=" + this.value + ", validation=" + this.validation + ")";
    }
}
