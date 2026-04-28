package com.adyen.checkout.card.internal.ui.model;

import com.adyen.checkout.ui.core.internal.ui.model.AddressFieldPolicy;
import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressFieldPolicy;", "()V", "Optional", "OptionalForCardTypes", "Required", "Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams$Optional;", "Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams$OptionalForCardTypes;", "Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams$Required;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AddressFieldPolicyParams implements AddressFieldPolicy {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams$Optional;", "Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams;", "()V", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Optional extends AddressFieldPolicyParams {

        @NotNull
        public static final Optional INSTANCE = new Optional();

        private Optional() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams$OptionalForCardTypes;", "Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams;", "brands", "", "", "(Ljava/util/List;)V", "getBrands", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionalForCardTypes extends AddressFieldPolicyParams {

        @NotNull
        private final List<String> brands;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionalForCardTypes(@NotNull List<String> list) {
            super(null);
            list.getClass();
            this.brands = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptionalForCardTypes copy$default(OptionalForCardTypes optionalForCardTypes, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = optionalForCardTypes.brands;
            }
            return optionalForCardTypes.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.brands;
        }

        @NotNull
        public final OptionalForCardTypes copy(@NotNull List<String> brands) {
            brands.getClass();
            return new OptionalForCardTypes(brands);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionalForCardTypes) && Intrinsics.areEqual(this.brands, ((OptionalForCardTypes) other).brands);
        }

        @NotNull
        public final List<String> getBrands() {
            return this.brands;
        }

        public int hashCode() {
            return this.brands.hashCode();
        }

        @NotNull
        public String toString() {
            return f.m("OptionalForCardTypes(brands=", ")", this.brands);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams$Required;", "Lcom/adyen/checkout/card/internal/ui/model/AddressFieldPolicyParams;", "()V", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Required extends AddressFieldPolicyParams {

        @NotNull
        public static final Required INSTANCE = new Required();

        private Required() {
            super(null);
        }
    }

    public /* synthetic */ AddressFieldPolicyParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AddressFieldPolicyParams() {
    }
}
