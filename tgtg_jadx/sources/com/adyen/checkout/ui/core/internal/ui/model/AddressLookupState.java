package com.adyen.checkout.ui.core.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import com.adyen.checkout.ui.core.internal.ui.view.LookupOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "", "()V", "Error", "Form", "Initial", "InvalidUI", "Loading", "SearchResult", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Error;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Form;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Initial;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$InvalidUI;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Loading;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$SearchResult;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AddressLookupState {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Error;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "query", "", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends AddressLookupState {

        @NotNull
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String str) {
            super(null);
            str.getClass();
            this.query = str;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.query;
            }
            return error.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        @NotNull
        public final Error copy(@NotNull String query) {
            query.getClass();
            return new Error(query);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.query, ((Error) other).query);
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
            return a0.p("Error(query=", this.query, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Form;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "selectedAddress", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "(Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;)V", "getSelectedAddress", "()Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Form extends AddressLookupState {

        @Nullable
        private final AddressInputModel selectedAddress;

        public Form(@Nullable AddressInputModel addressInputModel) {
            super(null);
            this.selectedAddress = addressInputModel;
        }

        public static /* synthetic */ Form copy$default(Form form, AddressInputModel addressInputModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                addressInputModel = form.selectedAddress;
            }
            return form.copy(addressInputModel);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AddressInputModel getSelectedAddress() {
            return this.selectedAddress;
        }

        @NotNull
        public final Form copy(@Nullable AddressInputModel selectedAddress) {
            return new Form(selectedAddress);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Form) && Intrinsics.areEqual(this.selectedAddress, ((Form) other).selectedAddress);
        }

        @Nullable
        public final AddressInputModel getSelectedAddress() {
            return this.selectedAddress;
        }

        public int hashCode() {
            AddressInputModel addressInputModel = this.selectedAddress;
            if (addressInputModel == null) {
                return 0;
            }
            return addressInputModel.hashCode();
        }

        @NotNull
        public String toString() {
            return "Form(selectedAddress=" + this.selectedAddress + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Initial;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Initial extends AddressLookupState {

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$InvalidUI;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidUI extends AddressLookupState {

        @NotNull
        public static final InvalidUI INSTANCE = new InvalidUI();

        private InvalidUI() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$Loading;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends AddressLookupState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState$SearchResult;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "query", "", "options", "", "Lcom/adyen/checkout/ui/core/internal/ui/view/LookupOption;", "(Ljava/lang/String;Ljava/util/List;)V", "getOptions", "()Ljava/util/List;", "getQuery", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchResult extends AddressLookupState {

        @NotNull
        private final List<LookupOption> options;

        @NotNull
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchResult(@NotNull String str, @NotNull List<LookupOption> list) {
            super(null);
            str.getClass();
            list.getClass();
            this.query = str;
            this.options = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = searchResult.query;
            }
            if ((i11 & 2) != 0) {
                list = searchResult.options;
            }
            return searchResult.copy(str, list);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        @NotNull
        public final List<LookupOption> component2() {
            return this.options;
        }

        @NotNull
        public final SearchResult copy(@NotNull String query, @NotNull List<LookupOption> options) {
            query.getClass();
            options.getClass();
            return new SearchResult(query, options);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchResult)) {
                return false;
            }
            SearchResult searchResult = (SearchResult) other;
            return Intrinsics.areEqual(this.query, searchResult.query) && Intrinsics.areEqual(this.options, searchResult.options);
        }

        @NotNull
        public final List<LookupOption> getOptions() {
            return this.options;
        }

        @NotNull
        public final String getQuery() {
            return this.query;
        }

        public int hashCode() {
            return this.options.hashCode() + (this.query.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SearchResult(query=" + this.query + ", options=" + this.options + ")";
        }
    }

    public /* synthetic */ AddressLookupState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AddressLookupState() {
    }
}
