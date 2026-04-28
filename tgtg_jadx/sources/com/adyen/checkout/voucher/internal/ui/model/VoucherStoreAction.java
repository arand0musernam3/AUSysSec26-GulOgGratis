package com.adyen.checkout.voucher.internal.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction;", "", "()V", "DownloadPdf", "SaveAsImage", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction$DownloadPdf;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction$SaveAsImage;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class VoucherStoreAction {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction$DownloadPdf;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction;", "downloadUrl", "", "(Ljava/lang/String;)V", "getDownloadUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DownloadPdf extends VoucherStoreAction {

        @NotNull
        private final String downloadUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadPdf(@NotNull String str) {
            super(null);
            str.getClass();
            this.downloadUrl = str;
        }

        public static /* synthetic */ DownloadPdf copy$default(DownloadPdf downloadPdf, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = downloadPdf.downloadUrl;
            }
            return downloadPdf.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDownloadUrl() {
            return this.downloadUrl;
        }

        @NotNull
        public final DownloadPdf copy(@NotNull String downloadUrl) {
            downloadUrl.getClass();
            return new DownloadPdf(downloadUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DownloadPdf) && Intrinsics.areEqual(this.downloadUrl, ((DownloadPdf) other).downloadUrl);
        }

        @NotNull
        public final String getDownloadUrl() {
            return this.downloadUrl;
        }

        public int hashCode() {
            return this.downloadUrl.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("DownloadPdf(downloadUrl=", this.downloadUrl, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction$SaveAsImage;", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveAsImage extends VoucherStoreAction {

        @NotNull
        public static final SaveAsImage INSTANCE = new SaveAsImage();

        private SaveAsImage() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof SaveAsImage);
        }

        public int hashCode() {
            return -1272695295;
        }

        @NotNull
        public String toString() {
            return "SaveAsImage";
        }
    }

    public /* synthetic */ VoucherStoreAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VoucherStoreAction() {
    }
}
