package com.adyen.checkout.ui.core.internal.ui.model;

import com.adyen.checkout.components.core.LookupAddress;
import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", "", "()V", "ClearQuery", "ErrorResult", "Initialize", "InvalidUI", "Manual", "OptionSelected", "Query", "SearchResult", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$ClearQuery;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$ErrorResult;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Initialize;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$InvalidUI;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Manual;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$OptionSelected;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Query;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$SearchResult;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AddressLookupEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$ClearQuery;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClearQuery extends AddressLookupEvent {

        @NotNull
        public static final ClearQuery INSTANCE = new ClearQuery();

        private ClearQuery() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Initialize;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", "address", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "(Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;)V", "getAddress", "()Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Initialize extends AddressLookupEvent {

        @NotNull
        private final AddressInputModel address;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(@NotNull AddressInputModel addressInputModel) {
            super(null);
            addressInputModel.getClass();
            this.address = addressInputModel;
        }

        public static /* synthetic */ Initialize copy$default(Initialize initialize, AddressInputModel addressInputModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                addressInputModel = initialize.address;
            }
            return initialize.copy(addressInputModel);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AddressInputModel getAddress() {
            return this.address;
        }

        @NotNull
        public final Initialize copy(@NotNull AddressInputModel address) {
            address.getClass();
            return new Initialize(address);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialize) && Intrinsics.areEqual(this.address, ((Initialize) other).address);
        }

        @NotNull
        public final AddressInputModel getAddress() {
            return this.address;
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        @NotNull
        public String toString() {
            return "Initialize(address=" + this.address + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$InvalidUI;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidUI extends AddressLookupEvent {

        @NotNull
        public static final InvalidUI INSTANCE = new InvalidUI();

        private InvalidUI() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Manual;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Manual extends AddressLookupEvent {

        @NotNull
        public static final Manual INSTANCE = new Manual();

        private Manual() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$OptionSelected;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", "lookupAddress", "Lcom/adyen/checkout/components/core/LookupAddress;", "loading", "", "(Lcom/adyen/checkout/components/core/LookupAddress;Z)V", "getLoading", "()Z", "getLookupAddress", "()Lcom/adyen/checkout/components/core/LookupAddress;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionSelected extends AddressLookupEvent {
        private final boolean loading;

        @NotNull
        private final LookupAddress lookupAddress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionSelected(@NotNull LookupAddress lookupAddress, boolean z11) {
            super(null);
            lookupAddress.getClass();
            this.lookupAddress = lookupAddress;
            this.loading = z11;
        }

        public static /* synthetic */ OptionSelected copy$default(OptionSelected optionSelected, LookupAddress lookupAddress, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lookupAddress = optionSelected.lookupAddress;
            }
            if ((i11 & 2) != 0) {
                z11 = optionSelected.loading;
            }
            return optionSelected.copy(lookupAddress, z11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LookupAddress getLookupAddress() {
            return this.lookupAddress;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        @NotNull
        public final OptionSelected copy(@NotNull LookupAddress lookupAddress, boolean loading) {
            lookupAddress.getClass();
            return new OptionSelected(lookupAddress, loading);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionSelected)) {
                return false;
            }
            OptionSelected optionSelected = (OptionSelected) other;
            return Intrinsics.areEqual(this.lookupAddress, optionSelected.lookupAddress) && this.loading == optionSelected.loading;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        @NotNull
        public final LookupAddress getLookupAddress() {
            return this.lookupAddress;
        }

        public int hashCode() {
            return Boolean.hashCode(this.loading) + (this.lookupAddress.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OptionSelected(lookupAddress=" + this.lookupAddress + ", loading=" + this.loading + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Query;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", "query", "", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Query extends AddressLookupEvent {

        @NotNull
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Query(@NotNull String str) {
            super(null);
            str.getClass();
            this.query = str;
        }

        public static /* synthetic */ Query copy$default(Query query, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = query.query;
            }
            return query.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        @NotNull
        public final Query copy(@NotNull String query) {
            query.getClass();
            return new Query(query);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Query) && Intrinsics.areEqual(this.query, ((Query) other).query);
        }

        @NotNull
        public final String getQuery() {
            return this.query;
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Query(query=", this.query, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$SearchResult;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", "addressLookupOptions", "", "Lcom/adyen/checkout/components/core/LookupAddress;", "(Ljava/util/List;)V", "getAddressLookupOptions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchResult extends AddressLookupEvent {

        @NotNull
        private final List<LookupAddress> addressLookupOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchResult(@NotNull List<LookupAddress> list) {
            super(null);
            list.getClass();
            this.addressLookupOptions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = searchResult.addressLookupOptions;
            }
            return searchResult.copy(list);
        }

        @NotNull
        public final List<LookupAddress> component1() {
            return this.addressLookupOptions;
        }

        @NotNull
        public final SearchResult copy(@NotNull List<LookupAddress> addressLookupOptions) {
            addressLookupOptions.getClass();
            return new SearchResult(addressLookupOptions);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchResult) && Intrinsics.areEqual(this.addressLookupOptions, ((SearchResult) other).addressLookupOptions);
        }

        @NotNull
        public final List<LookupAddress> getAddressLookupOptions() {
            return this.addressLookupOptions;
        }

        public int hashCode() {
            return this.addressLookupOptions.hashCode();
        }

        @NotNull
        public String toString() {
            return f.m("SearchResult(addressLookupOptions=", ")", this.addressLookupOptions);
        }
    }

    public /* synthetic */ AddressLookupEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AddressLookupEvent() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$ErrorResult;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", InAppMessageBase.MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorResult extends AddressLookupEvent {

        @Nullable
        private final String message;

        public /* synthetic */ ErrorResult(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }

        public static /* synthetic */ ErrorResult copy$default(ErrorResult errorResult, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = errorResult.message;
            }
            return errorResult.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final ErrorResult copy(@Nullable String message) {
            return new ErrorResult(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorResult) && Intrinsics.areEqual(this.message, ((ErrorResult) other).message);
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
            return a0.p("ErrorResult(message=", this.message, ")");
        }

        public ErrorResult(@Nullable String str) {
            super(null);
            this.message = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ErrorResult() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
