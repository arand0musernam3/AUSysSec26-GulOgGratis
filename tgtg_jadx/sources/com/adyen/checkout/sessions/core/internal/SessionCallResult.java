package com.adyen.checkout.sessions.core.internal;

import com.adyen.checkout.components.core.BalanceResult;
import com.adyen.checkout.components.core.OrderResponse;
import com.adyen.checkout.components.core.PaymentMethodsApiResponse;
import com.adyen.checkout.sessions.core.SessionPaymentResult;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bg\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult;", "", "Balance", "CancelOrder", "CreateOrder", "Details", "Payments", "RemoveStoredPaymentMethod", "UpdatePaymentMethods", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SessionCallResult {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult;", "()V", "Error", "Successful", "TakenOver", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance$Successful;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance$TakenOver;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Balance implements SessionCallResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends Balance {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th2) {
                super(null);
                th2.getClass();
                this.throwable = th2;
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = error.throwable;
                }
                return error.copy(th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final Error copy(@NotNull Throwable throwable) {
                throwable.getClass();
                return new Error(throwable);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return f.l("Error(throwable=", ")", this.throwable);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance$Successful;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance;", "balanceResult", "Lcom/adyen/checkout/components/core/BalanceResult;", "(Lcom/adyen/checkout/components/core/BalanceResult;)V", "getBalanceResult", "()Lcom/adyen/checkout/components/core/BalanceResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Successful extends Balance {

            @NotNull
            private final BalanceResult balanceResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Successful(@NotNull BalanceResult balanceResult) {
                super(null);
                balanceResult.getClass();
                this.balanceResult = balanceResult;
            }

            public static /* synthetic */ Successful copy$default(Successful successful, BalanceResult balanceResult, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    balanceResult = successful.balanceResult;
                }
                return successful.copy(balanceResult);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final BalanceResult getBalanceResult() {
                return this.balanceResult;
            }

            @NotNull
            public final Successful copy(@NotNull BalanceResult balanceResult) {
                balanceResult.getClass();
                return new Successful(balanceResult);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Successful) && Intrinsics.areEqual(this.balanceResult, ((Successful) other).balanceResult);
            }

            @NotNull
            public final BalanceResult getBalanceResult() {
                return this.balanceResult;
            }

            public int hashCode() {
                return this.balanceResult.hashCode();
            }

            @NotNull
            public String toString() {
                return "Successful(balanceResult=" + this.balanceResult + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance$TakenOver;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance;", "()V", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TakenOver extends Balance {

            @NotNull
            public static final TakenOver INSTANCE = new TakenOver();

            private TakenOver() {
                super(null);
            }
        }

        public /* synthetic */ Balance(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Balance() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult;", "()V", "Error", "Successful", "TakenOver", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder$Successful;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder$TakenOver;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class CancelOrder implements SessionCallResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends CancelOrder {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th2) {
                super(null);
                th2.getClass();
                this.throwable = th2;
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = error.throwable;
                }
                return error.copy(th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final Error copy(@NotNull Throwable throwable) {
                throwable.getClass();
                return new Error(throwable);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return f.l("Error(throwable=", ")", this.throwable);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder$Successful;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder;", "()V", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Successful extends CancelOrder {

            @NotNull
            public static final Successful INSTANCE = new Successful();

            private Successful() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder$TakenOver;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder;", "()V", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TakenOver extends CancelOrder {

            @NotNull
            public static final TakenOver INSTANCE = new TakenOver();

            private TakenOver() {
                super(null);
            }
        }

        public /* synthetic */ CancelOrder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CancelOrder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult;", "()V", "Error", "Successful", "TakenOver", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder$Successful;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder$TakenOver;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class CreateOrder implements SessionCallResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends CreateOrder {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th2) {
                super(null);
                th2.getClass();
                this.throwable = th2;
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = error.throwable;
                }
                return error.copy(th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final Error copy(@NotNull Throwable throwable) {
                throwable.getClass();
                return new Error(throwable);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return f.l("Error(throwable=", ")", this.throwable);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder$Successful;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder;", "order", "Lcom/adyen/checkout/components/core/OrderResponse;", "(Lcom/adyen/checkout/components/core/OrderResponse;)V", "getOrder", "()Lcom/adyen/checkout/components/core/OrderResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Successful extends CreateOrder {

            @NotNull
            private final OrderResponse order;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Successful(@NotNull OrderResponse orderResponse) {
                super(null);
                orderResponse.getClass();
                this.order = orderResponse;
            }

            public static /* synthetic */ Successful copy$default(Successful successful, OrderResponse orderResponse, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    orderResponse = successful.order;
                }
                return successful.copy(orderResponse);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final OrderResponse getOrder() {
                return this.order;
            }

            @NotNull
            public final Successful copy(@NotNull OrderResponse order) {
                order.getClass();
                return new Successful(order);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Successful) && Intrinsics.areEqual(this.order, ((Successful) other).order);
            }

            @NotNull
            public final OrderResponse getOrder() {
                return this.order;
            }

            public int hashCode() {
                return this.order.hashCode();
            }

            @NotNull
            public String toString() {
                return "Successful(order=" + this.order + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder$TakenOver;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder;", "()V", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TakenOver extends CreateOrder {

            @NotNull
            public static final TakenOver INSTANCE = new TakenOver();

            private TakenOver() {
                super(null);
            }
        }

        public /* synthetic */ CreateOrder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CreateOrder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult;", "()V", "Action", "Error", "Finished", "TakenOver", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details$Action;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details$Finished;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details$TakenOver;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Details implements SessionCallResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details$Action;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details;", "action", "Lcom/adyen/checkout/components/core/action/Action;", "(Lcom/adyen/checkout/components/core/action/Action;)V", "getAction", "()Lcom/adyen/checkout/components/core/action/Action;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Action extends Details {

            @NotNull
            private final com.adyen.checkout.components.core.action.Action action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Action(@NotNull com.adyen.checkout.components.core.action.Action action) {
                super(null);
                action.getClass();
                this.action = action;
            }

            public static /* synthetic */ Action copy$default(Action action, com.adyen.checkout.components.core.action.Action action2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    action2 = action.action;
                }
                return action.copy(action2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final com.adyen.checkout.components.core.action.Action getAction() {
                return this.action;
            }

            @NotNull
            public final Action copy(@NotNull com.adyen.checkout.components.core.action.Action action) {
                action.getClass();
                return new Action(action);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Action) && Intrinsics.areEqual(this.action, ((Action) other).action);
            }

            @NotNull
            public final com.adyen.checkout.components.core.action.Action getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return "Action(action=" + this.action + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends Details {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th2) {
                super(null);
                th2.getClass();
                this.throwable = th2;
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = error.throwable;
                }
                return error.copy(th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final Error copy(@NotNull Throwable throwable) {
                throwable.getClass();
                return new Error(throwable);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return f.l("Error(throwable=", ")", this.throwable);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details$Finished;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details;", "result", "Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "(Lcom/adyen/checkout/sessions/core/SessionPaymentResult;)V", "getResult", "()Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Finished extends Details {

            @NotNull
            private final SessionPaymentResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Finished(@NotNull SessionPaymentResult sessionPaymentResult) {
                super(null);
                sessionPaymentResult.getClass();
                this.result = sessionPaymentResult;
            }

            public static /* synthetic */ Finished copy$default(Finished finished, SessionPaymentResult sessionPaymentResult, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    sessionPaymentResult = finished.result;
                }
                return finished.copy(sessionPaymentResult);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SessionPaymentResult getResult() {
                return this.result;
            }

            @NotNull
            public final Finished copy(@NotNull SessionPaymentResult result) {
                result.getClass();
                return new Finished(result);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Finished) && Intrinsics.areEqual(this.result, ((Finished) other).result);
            }

            @NotNull
            public final SessionPaymentResult getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            @NotNull
            public String toString() {
                return "Finished(result=" + this.result + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details$TakenOver;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details;", "()V", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TakenOver extends Details {

            @NotNull
            public static final TakenOver INSTANCE = new TakenOver();

            private TakenOver() {
                super(null);
            }
        }

        public /* synthetic */ Details(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Details() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult;", "()V", "Action", "Error", "Finished", "NotFullyPaidOrder", "RefusedPartialPayment", "TakenOver", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$Action;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$Finished;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$NotFullyPaidOrder;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$RefusedPartialPayment;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$TakenOver;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Payments implements SessionCallResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$Action;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments;", "action", "Lcom/adyen/checkout/components/core/action/Action;", "(Lcom/adyen/checkout/components/core/action/Action;)V", "getAction", "()Lcom/adyen/checkout/components/core/action/Action;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Action extends Payments {

            @NotNull
            private final com.adyen.checkout.components.core.action.Action action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Action(@NotNull com.adyen.checkout.components.core.action.Action action) {
                super(null);
                action.getClass();
                this.action = action;
            }

            public static /* synthetic */ Action copy$default(Action action, com.adyen.checkout.components.core.action.Action action2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    action2 = action.action;
                }
                return action.copy(action2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final com.adyen.checkout.components.core.action.Action getAction() {
                return this.action;
            }

            @NotNull
            public final Action copy(@NotNull com.adyen.checkout.components.core.action.Action action) {
                action.getClass();
                return new Action(action);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Action) && Intrinsics.areEqual(this.action, ((Action) other).action);
            }

            @NotNull
            public final com.adyen.checkout.components.core.action.Action getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return "Action(action=" + this.action + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends Payments {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th2) {
                super(null);
                th2.getClass();
                this.throwable = th2;
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = error.throwable;
                }
                return error.copy(th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final Error copy(@NotNull Throwable throwable) {
                throwable.getClass();
                return new Error(throwable);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return f.l("Error(throwable=", ")", this.throwable);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$Finished;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments;", "result", "Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "(Lcom/adyen/checkout/sessions/core/SessionPaymentResult;)V", "getResult", "()Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Finished extends Payments {

            @NotNull
            private final SessionPaymentResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Finished(@NotNull SessionPaymentResult sessionPaymentResult) {
                super(null);
                sessionPaymentResult.getClass();
                this.result = sessionPaymentResult;
            }

            public static /* synthetic */ Finished copy$default(Finished finished, SessionPaymentResult sessionPaymentResult, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    sessionPaymentResult = finished.result;
                }
                return finished.copy(sessionPaymentResult);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SessionPaymentResult getResult() {
                return this.result;
            }

            @NotNull
            public final Finished copy(@NotNull SessionPaymentResult result) {
                result.getClass();
                return new Finished(result);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Finished) && Intrinsics.areEqual(this.result, ((Finished) other).result);
            }

            @NotNull
            public final SessionPaymentResult getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            @NotNull
            public String toString() {
                return "Finished(result=" + this.result + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$NotFullyPaidOrder;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments;", "result", "Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "(Lcom/adyen/checkout/sessions/core/SessionPaymentResult;)V", "getResult", "()Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NotFullyPaidOrder extends Payments {

            @NotNull
            private final SessionPaymentResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotFullyPaidOrder(@NotNull SessionPaymentResult sessionPaymentResult) {
                super(null);
                sessionPaymentResult.getClass();
                this.result = sessionPaymentResult;
            }

            public static /* synthetic */ NotFullyPaidOrder copy$default(NotFullyPaidOrder notFullyPaidOrder, SessionPaymentResult sessionPaymentResult, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    sessionPaymentResult = notFullyPaidOrder.result;
                }
                return notFullyPaidOrder.copy(sessionPaymentResult);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SessionPaymentResult getResult() {
                return this.result;
            }

            @NotNull
            public final NotFullyPaidOrder copy(@NotNull SessionPaymentResult result) {
                result.getClass();
                return new NotFullyPaidOrder(result);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotFullyPaidOrder) && Intrinsics.areEqual(this.result, ((NotFullyPaidOrder) other).result);
            }

            @NotNull
            public final SessionPaymentResult getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            @NotNull
            public String toString() {
                return "NotFullyPaidOrder(result=" + this.result + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$RefusedPartialPayment;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments;", "result", "Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "(Lcom/adyen/checkout/sessions/core/SessionPaymentResult;)V", "getResult", "()Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RefusedPartialPayment extends Payments {

            @NotNull
            private final SessionPaymentResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefusedPartialPayment(@NotNull SessionPaymentResult sessionPaymentResult) {
                super(null);
                sessionPaymentResult.getClass();
                this.result = sessionPaymentResult;
            }

            public static /* synthetic */ RefusedPartialPayment copy$default(RefusedPartialPayment refusedPartialPayment, SessionPaymentResult sessionPaymentResult, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    sessionPaymentResult = refusedPartialPayment.result;
                }
                return refusedPartialPayment.copy(sessionPaymentResult);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SessionPaymentResult getResult() {
                return this.result;
            }

            @NotNull
            public final RefusedPartialPayment copy(@NotNull SessionPaymentResult result) {
                result.getClass();
                return new RefusedPartialPayment(result);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RefusedPartialPayment) && Intrinsics.areEqual(this.result, ((RefusedPartialPayment) other).result);
            }

            @NotNull
            public final SessionPaymentResult getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            @NotNull
            public String toString() {
                return "RefusedPartialPayment(result=" + this.result + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$TakenOver;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments;", "()V", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TakenOver extends Payments {

            @NotNull
            public static final TakenOver INSTANCE = new TakenOver();

            private TakenOver() {
                super(null);
            }
        }

        public /* synthetic */ Payments(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Payments() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$RemoveStoredPaymentMethod;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult;", "()V", "Error", "Successful", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$RemoveStoredPaymentMethod$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$RemoveStoredPaymentMethod$Successful;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RemoveStoredPaymentMethod implements SessionCallResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$RemoveStoredPaymentMethod$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$RemoveStoredPaymentMethod;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends RemoveStoredPaymentMethod {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th2) {
                super(null);
                th2.getClass();
                this.throwable = th2;
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = error.throwable;
                }
                return error.copy(th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final Error copy(@NotNull Throwable throwable) {
                throwable.getClass();
                return new Error(throwable);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return f.l("Error(throwable=", ")", this.throwable);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$RemoveStoredPaymentMethod$Successful;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$RemoveStoredPaymentMethod;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Successful extends RemoveStoredPaymentMethod {

            @NotNull
            public static final Successful INSTANCE = new Successful();

            private Successful() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Successful);
            }

            public int hashCode() {
                return 1482903020;
            }

            @NotNull
            public String toString() {
                return "Successful";
            }
        }

        public /* synthetic */ RemoveStoredPaymentMethod(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RemoveStoredPaymentMethod() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$UpdatePaymentMethods;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult;", "()V", "Error", "Successful", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$UpdatePaymentMethods$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$UpdatePaymentMethods$Successful;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class UpdatePaymentMethods implements SessionCallResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$UpdatePaymentMethods$Error;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$UpdatePaymentMethods;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends UpdatePaymentMethods {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th2) {
                super(null);
                th2.getClass();
                this.throwable = th2;
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = error.throwable;
                }
                return error.copy(th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final Error copy(@NotNull Throwable throwable) {
                throwable.getClass();
                return new Error(throwable);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return f.l("Error(throwable=", ")", this.throwable);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$UpdatePaymentMethods$Successful;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$UpdatePaymentMethods;", "paymentMethods", "Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "order", "Lcom/adyen/checkout/components/core/OrderResponse;", "(Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;Lcom/adyen/checkout/components/core/OrderResponse;)V", "getOrder", "()Lcom/adyen/checkout/components/core/OrderResponse;", "getPaymentMethods", "()Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Successful extends UpdatePaymentMethods {

            @Nullable
            private final OrderResponse order;

            @NotNull
            private final PaymentMethodsApiResponse paymentMethods;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Successful(@NotNull PaymentMethodsApiResponse paymentMethodsApiResponse, @Nullable OrderResponse orderResponse) {
                super(null);
                paymentMethodsApiResponse.getClass();
                this.paymentMethods = paymentMethodsApiResponse;
                this.order = orderResponse;
            }

            public static /* synthetic */ Successful copy$default(Successful successful, PaymentMethodsApiResponse paymentMethodsApiResponse, OrderResponse orderResponse, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paymentMethodsApiResponse = successful.paymentMethods;
                }
                if ((i11 & 2) != 0) {
                    orderResponse = successful.order;
                }
                return successful.copy(paymentMethodsApiResponse, orderResponse);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final PaymentMethodsApiResponse getPaymentMethods() {
                return this.paymentMethods;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final OrderResponse getOrder() {
                return this.order;
            }

            @NotNull
            public final Successful copy(@NotNull PaymentMethodsApiResponse paymentMethods, @Nullable OrderResponse order) {
                paymentMethods.getClass();
                return new Successful(paymentMethods, order);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Successful)) {
                    return false;
                }
                Successful successful = (Successful) other;
                return Intrinsics.areEqual(this.paymentMethods, successful.paymentMethods) && Intrinsics.areEqual(this.order, successful.order);
            }

            @Nullable
            public final OrderResponse getOrder() {
                return this.order;
            }

            @NotNull
            public final PaymentMethodsApiResponse getPaymentMethods() {
                return this.paymentMethods;
            }

            public int hashCode() {
                int iHashCode = this.paymentMethods.hashCode() * 31;
                OrderResponse orderResponse = this.order;
                return iHashCode + (orderResponse == null ? 0 : orderResponse.hashCode());
            }

            @NotNull
            public String toString() {
                return "Successful(paymentMethods=" + this.paymentMethods + ", order=" + this.order + ")";
            }
        }

        public /* synthetic */ UpdatePaymentMethods(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UpdatePaymentMethods() {
        }
    }
}
