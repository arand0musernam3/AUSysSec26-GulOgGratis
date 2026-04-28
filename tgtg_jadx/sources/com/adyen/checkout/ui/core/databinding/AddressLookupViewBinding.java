package com.adyen.checkout.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import c50.w;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput;
import com.google.android.material.button.MaterialButton;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AddressLookupViewBinding implements a {

    @NonNull
    public final AddressFormInput addressFormInput;

    @NonNull
    public final Button buttonManualEntry;

    @NonNull
    public final MaterialButton buttonSubmitAddress;

    @NonNull
    public final View divider;

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    public final RecyclerView recyclerViewAddressLookupOptions;

    @NonNull
    private final View rootView;

    @NonNull
    public final SearchView textInputLayoutAddressLookupQuerySearch;

    @NonNull
    public final TextView textViewError;

    @NonNull
    public final TextView textViewInitialDisclaimer;

    @NonNull
    public final TextView textViewManualEntryError;

    @NonNull
    public final TextView textViewManualEntryInitial;

    private AddressLookupViewBinding(@NonNull View view, @NonNull AddressFormInput addressFormInput, @NonNull Button button, @NonNull MaterialButton materialButton, @NonNull View view2, @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerView, @NonNull SearchView searchView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = view;
        this.addressFormInput = addressFormInput;
        this.buttonManualEntry = button;
        this.buttonSubmitAddress = materialButton;
        this.divider = view2;
        this.progressBar = progressBar;
        this.recyclerViewAddressLookupOptions = recyclerView;
        this.textInputLayoutAddressLookupQuerySearch = searchView;
        this.textViewError = textView;
        this.textViewInitialDisclaimer = textView2;
        this.textViewManualEntryError = textView3;
        this.textViewManualEntryInitial = textView4;
    }

    @NonNull
    public static AddressLookupViewBinding bind(@NonNull View view) {
        View viewT;
        int i11 = R.id.addressFormInput;
        AddressFormInput addressFormInput = (AddressFormInput) g.t(i11, view);
        if (addressFormInput != null) {
            i11 = R.id.button_manualEntry;
            Button button = (Button) g.t(i11, view);
            if (button != null) {
                i11 = R.id.button_submitAddress;
                MaterialButton materialButton = (MaterialButton) g.t(i11, view);
                if (materialButton != null && (viewT = g.t((i11 = R.id.divider), view)) != null) {
                    i11 = R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) g.t(i11, view);
                    if (progressBar != null) {
                        i11 = R.id.recyclerView_addressLookupOptions;
                        RecyclerView recyclerView = (RecyclerView) g.t(i11, view);
                        if (recyclerView != null) {
                            i11 = R.id.textInputLayout_addressLookupQuerySearch;
                            SearchView searchView = (SearchView) g.t(i11, view);
                            if (searchView != null) {
                                i11 = R.id.textView_error;
                                TextView textView = (TextView) g.t(i11, view);
                                if (textView != null) {
                                    i11 = R.id.textView_initialDisclaimer;
                                    TextView textView2 = (TextView) g.t(i11, view);
                                    if (textView2 != null) {
                                        i11 = R.id.textView_manualEntryError;
                                        TextView textView3 = (TextView) g.t(i11, view);
                                        if (textView3 != null) {
                                            i11 = R.id.textView_manualEntryInitial;
                                            TextView textView4 = (TextView) g.t(i11, view);
                                            if (textView4 != null) {
                                                return new AddressLookupViewBinding(view, addressFormInput, button, materialButton, viewT, progressBar, recyclerView, searchView, textView, textView2, textView3, textView4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static AddressLookupViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.address_lookup_view, viewGroup);
            return bind(viewGroup);
        }
        w.l("parent");
        return null;
    }

    @Override // sa.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
