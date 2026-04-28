package com.adyen.checkout.components.core.internal.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/Validation;", "", "()V", "isValid", "", "Invalid", "Valid", "Lcom/adyen/checkout/components/core/internal/ui/model/Validation$Invalid;", "Lcom/adyen/checkout/components/core/internal/ui/model/Validation$Valid;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Validation {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/Validation$Valid;", "Lcom/adyen/checkout/components/core/internal/ui/model/Validation;", "()V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Valid extends Validation {

        @NotNull
        public static final Valid INSTANCE = new Valid();

        private Valid() {
            super(null);
        }
    }

    public /* synthetic */ Validation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isValid() {
        return this instanceof Valid;
    }

    private Validation() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/Validation$Invalid;", "Lcom/adyen/checkout/components/core/internal/ui/model/Validation;", "reason", "", "showErrorWhileEditing", "", "(IZ)V", "getReason", "()I", "getShowErrorWhileEditing", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Invalid extends Validation {
        private final int reason;
        private final boolean showErrorWhileEditing;

        public Invalid(int i11, boolean z11) {
            super(null);
            this.reason = i11;
            this.showErrorWhileEditing = z11;
        }

        public static /* synthetic */ Invalid copy$default(Invalid invalid, int i11, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = invalid.reason;
            }
            if ((i12 & 2) != 0) {
                z11 = invalid.showErrorWhileEditing;
            }
            return invalid.copy(i11, z11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShowErrorWhileEditing() {
            return this.showErrorWhileEditing;
        }

        @NotNull
        public final Invalid copy(int reason, boolean showErrorWhileEditing) {
            return new Invalid(reason, showErrorWhileEditing);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Invalid)) {
                return false;
            }
            Invalid invalid = (Invalid) other;
            return this.reason == invalid.reason && this.showErrorWhileEditing == invalid.showErrorWhileEditing;
        }

        public final int getReason() {
            return this.reason;
        }

        public final boolean getShowErrorWhileEditing() {
            return this.showErrorWhileEditing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showErrorWhileEditing) + (Integer.hashCode(this.reason) * 31);
        }

        @NotNull
        public String toString() {
            return "Invalid(reason=" + this.reason + ", showErrorWhileEditing=" + this.showErrorWhileEditing + ")";
        }

        public /* synthetic */ Invalid(int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? false : z11);
        }
    }
}
