package com.adyen.checkout.issuerlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import c50.w;
import com.adyen.checkout.issuerlist.R;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class IssuerListRecyclerViewBinding implements a {

    @NonNull
    public final RecyclerView recyclerIssuers;

    @NonNull
    private final View rootView;

    private IssuerListRecyclerViewBinding(@NonNull View view, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.recyclerIssuers = recyclerView;
    }

    @NonNull
    public static IssuerListRecyclerViewBinding bind(@NonNull View view) {
        int i11 = R.id.recycler_issuers;
        RecyclerView recyclerView = (RecyclerView) g.t(i11, view);
        if (recyclerView != null) {
            return new IssuerListRecyclerViewBinding(view, recyclerView);
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static IssuerListRecyclerViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.issuer_list_recycler_view, viewGroup);
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
