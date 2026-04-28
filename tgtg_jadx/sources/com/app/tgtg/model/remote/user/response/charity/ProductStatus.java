package com.app.tgtg.model.remote.user.response.charity;

import a80.a;
import com.app.tgtg.R;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = ProductStatusSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/ProductStatus;", "", "stringRes", "", "<init>", "(Ljava/lang/String;II)V", "getStringRes", "()I", "ADDED", "REMOVED", "QUANTITY", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProductStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProductStatus[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int stringRes;

    @g("ADDED")
    public static final ProductStatus ADDED = new ProductStatus("ADDED", 0, R.string.charity_inventory_update_added);

    @g("REMOVED")
    public static final ProductStatus REMOVED = new ProductStatus("REMOVED", 1, R.string.charity_inventory_update_removed);

    @g("QUANTITY_CHANGED")
    public static final ProductStatus QUANTITY = new ProductStatus("QUANTITY", 2, R.string.charity_inventory_update_quantity);

    @g("UNKNOWN")
    public static final ProductStatus UNKNOWN = new ProductStatus("UNKNOWN", 3, 0);

    private static final /* synthetic */ ProductStatus[] $values() {
        return new ProductStatus[]{ADDED, REMOVED, QUANTITY, UNKNOWN};
    }

    static {
        ProductStatus[] productStatusArr$values = $values();
        $VALUES = productStatusArr$values;
        $ENTRIES = n.w(productStatusArr$values);
        INSTANCE = new Companion(null);
    }

    private ProductStatus(String str, int i11, int i12) {
        this.stringRes = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ProductStatus valueOf(String str) {
        return (ProductStatus) Enum.valueOf(ProductStatus.class, str);
    }

    public static ProductStatus[] values() {
        return (ProductStatus[]) $VALUES.clone();
    }

    public final int getStringRes() {
        return this.stringRes;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/ProductStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/ProductStatus;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProductStatusSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
