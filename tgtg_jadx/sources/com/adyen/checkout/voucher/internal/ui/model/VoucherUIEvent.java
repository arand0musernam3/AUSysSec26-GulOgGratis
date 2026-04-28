package com.adyen.checkout.voucher.internal.ui.model;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent;", "", "()V", "Failure", "PermissionDenied", "Success", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent$Failure;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent$PermissionDenied;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent$Success;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class VoucherUIEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent$Failure;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure extends VoucherUIEvent {

        @NotNull
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull Throwable th2) {
            super(null);
            th2.getClass();
            this.throwable = th2;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = failure.throwable;
            }
            return failure.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @NotNull
        public final Failure copy(@NotNull Throwable throwable) {
            throwable.getClass();
            return new Failure(throwable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) other).throwable);
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
            return f.l("Failure(throwable=", ")", this.throwable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent$PermissionDenied;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PermissionDenied extends VoucherUIEvent {

        @NotNull
        public static final PermissionDenied INSTANCE = new PermissionDenied();

        private PermissionDenied() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof PermissionDenied);
        }

        public int hashCode() {
            return 1999348038;
        }

        @NotNull
        public String toString() {
            return "PermissionDenied";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent$Success;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends VoucherUIEvent {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return -1860540025;
        }

        @NotNull
        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ VoucherUIEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VoucherUIEvent() {
    }
}
