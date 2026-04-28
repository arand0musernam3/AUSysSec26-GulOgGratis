package com.adyen.checkout.components.core;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/components/core/AddressLookupResult;", "", "()V", "Completed", "Error", "Lcom/adyen/checkout/components/core/AddressLookupResult$Completed;", "Lcom/adyen/checkout/components/core/AddressLookupResult$Error;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AddressLookupResult {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/core/AddressLookupResult$Completed;", "Lcom/adyen/checkout/components/core/AddressLookupResult;", "lookupAddress", "Lcom/adyen/checkout/components/core/LookupAddress;", "(Lcom/adyen/checkout/components/core/LookupAddress;)V", "getLookupAddress", "()Lcom/adyen/checkout/components/core/LookupAddress;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Completed extends AddressLookupResult {

        @NotNull
        private final LookupAddress lookupAddress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(@NotNull LookupAddress lookupAddress) {
            super(null);
            lookupAddress.getClass();
            this.lookupAddress = lookupAddress;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, LookupAddress lookupAddress, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lookupAddress = completed.lookupAddress;
            }
            return completed.copy(lookupAddress);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LookupAddress getLookupAddress() {
            return this.lookupAddress;
        }

        @NotNull
        public final Completed copy(@NotNull LookupAddress lookupAddress) {
            lookupAddress.getClass();
            return new Completed(lookupAddress);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Completed) && Intrinsics.areEqual(this.lookupAddress, ((Completed) other).lookupAddress);
        }

        @NotNull
        public final LookupAddress getLookupAddress() {
            return this.lookupAddress;
        }

        public int hashCode() {
            return this.lookupAddress.hashCode();
        }

        @NotNull
        public String toString() {
            return "Completed(lookupAddress=" + this.lookupAddress + ")";
        }
    }

    public /* synthetic */ AddressLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AddressLookupResult() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/components/core/AddressLookupResult$Error;", "Lcom/adyen/checkout/components/core/AddressLookupResult;", InAppMessageBase.MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends AddressLookupResult {

        @Nullable
        private final String message;

        public /* synthetic */ Error(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Error copy(@Nullable String message) {
            return new Error(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Error(message=", this.message, ")");
        }

        public Error(@Nullable String str) {
            super(null);
            this.message = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
