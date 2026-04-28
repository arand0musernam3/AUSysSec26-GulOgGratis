package com.adyen.checkout.ui.core.internal.ui.model;

import com.adyen.checkout.ui.core.internal.ui.TextListItem;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressListItem;", "Lcom/adyen/checkout/ui/core/internal/ui/TextListItem;", "name", "", "code", "selected", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "getName", "getSelected", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AddressListItem extends TextListItem {

    @NotNull
    private final String code;

    @NotNull
    private final String name;
    private final boolean selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressListItem(@NotNull String str, @NotNull String str2, boolean z11) {
        super(str);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.code = str2;
        this.selected = z11;
    }

    public static /* synthetic */ AddressListItem copy$default(AddressListItem addressListItem, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addressListItem.name;
        }
        if ((i11 & 2) != 0) {
            str2 = addressListItem.code;
        }
        if ((i11 & 4) != 0) {
            z11 = addressListItem.selected;
        }
        return addressListItem.copy(str, str2, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final AddressListItem copy(@NotNull String name, @NotNull String code, boolean selected) {
        name.getClass();
        code.getClass();
        return new AddressListItem(name, code, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressListItem)) {
            return false;
        }
        AddressListItem addressListItem = (AddressListItem) other;
        return Intrinsics.areEqual(this.name, addressListItem.name) && Intrinsics.areEqual(this.code, addressListItem.code) && this.selected == addressListItem.selected;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.selected) + l1.b(this.name.hashCode() * 31, 31, this.code);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.code;
        return s.o(f.t("AddressListItem(name=", str, ", code=", str2, ", selected="), this.selected, ")");
    }
}
