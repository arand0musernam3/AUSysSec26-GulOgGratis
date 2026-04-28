package com.adyen.threeds2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/TransactionResult;", "", "Success", "Failure", "Lcom/adyen/threeds2/TransactionResult$Failure;", "Lcom/adyen/threeds2/TransactionResult$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TransactionResult {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/TransactionResult$Success;", "Lcom/adyen/threeds2/TransactionResult;", "transaction", "Lcom/adyen/threeds2/Transaction;", "<init>", "(Lcom/adyen/threeds2/Transaction;)V", "getTransaction", "()Lcom/adyen/threeds2/Transaction;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success implements TransactionResult {

        @NotNull
        private final Transaction transaction;

        public Success(@NotNull Transaction transaction) {
            transaction.getClass();
            this.transaction = transaction;
        }

        @NotNull
        public final Transaction getTransaction() {
            return this.transaction;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/TransactionResult$Failure;", "Lcom/adyen/threeds2/TransactionResult;", "transactionStatus", "", "additionalDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionStatus", "()Ljava/lang/String;", "getAdditionalDetails", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Failure implements TransactionResult {

        @NotNull
        private final String additionalDetails;

        @NotNull
        private final String transactionStatus;

        public Failure(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.transactionStatus = str;
            this.additionalDetails = str2;
        }

        @NotNull
        public final String getAdditionalDetails() {
            return this.additionalDetails;
        }

        @NotNull
        public final String getTransactionStatus() {
            return this.transactionStatus;
        }

        public /* synthetic */ Failure(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "U" : str, str2);
        }
    }
}
