package com.adyen.checkout.card.internal.data.model;

import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/BinLookupResult;", "", "()V", "Available", "Loading", "Unavailable", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResult$Available;", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResult$Loading;", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResult$Unavailable;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BinLookupResult {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/BinLookupResult$Available;", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResult;", "detectedCardTypes", "", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "(Ljava/util/List;)V", "getDetectedCardTypes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Available extends BinLookupResult {

        @NotNull
        private final List<DetectedCardType> detectedCardTypes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(@NotNull List<DetectedCardType> list) {
            super(null);
            list.getClass();
            this.detectedCardTypes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Available copy$default(Available available, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = available.detectedCardTypes;
            }
            return available.copy(list);
        }

        @NotNull
        public final List<DetectedCardType> component1() {
            return this.detectedCardTypes;
        }

        @NotNull
        public final Available copy(@NotNull List<DetectedCardType> detectedCardTypes) {
            detectedCardTypes.getClass();
            return new Available(detectedCardTypes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Available) && Intrinsics.areEqual(this.detectedCardTypes, ((Available) other).detectedCardTypes);
        }

        @NotNull
        public final List<DetectedCardType> getDetectedCardTypes() {
            return this.detectedCardTypes;
        }

        public int hashCode() {
            return this.detectedCardTypes.hashCode();
        }

        @NotNull
        public String toString() {
            return f.m("Available(detectedCardTypes=", ")", this.detectedCardTypes);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/BinLookupResult$Loading;", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResult;", "()V", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends BinLookupResult {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/BinLookupResult$Unavailable;", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResult;", "()V", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unavailable extends BinLookupResult {

        @NotNull
        public static final Unavailable INSTANCE = new Unavailable();

        private Unavailable() {
            super(null);
        }
    }

    public /* synthetic */ BinLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BinLookupResult() {
    }
}
