package com.adyen.checkout.ui.core.internal.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import com.adyen.checkout.ui.core.databinding.CountryViewBinding;
import com.adyen.checkout.ui.core.internal.ui.model.CountryModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\rH\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/CountryAdapter;", "Landroid/widget/BaseAdapter;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "localizedContext", "(Landroid/content/Context;Landroid/content/Context;)V", "countries", "", "Lcom/adyen/checkout/ui/core/internal/ui/model/CountryModel;", "countryFilter", "Lcom/adyen/checkout/ui/core/internal/ui/CountryFilter;", "getCount", "", "getFilter", "Landroid/widget/Filter;", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "setItems", "", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountryAdapter extends BaseAdapter implements Filterable {

    @NotNull
    private final Context context;

    @NotNull
    private final List<CountryModel> countries;

    @NotNull
    private final CountryFilter countryFilter;

    @NotNull
    private final Context localizedContext;

    public CountryAdapter(@NotNull Context context, @NotNull Context context2) {
        context.getClass();
        context2.getClass();
        this.context = context;
        this.localizedContext = context2;
        ArrayList arrayList = new ArrayList();
        this.countries = arrayList;
        this.countryFilter = new CountryFilter(arrayList);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.countries.size();
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return this.countryFilter;
    }

    @Override // android.widget.Adapter
    @NotNull
    public CountryModel getItem(int position) {
        return this.countries.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        CountryViewHolder countryViewHolder;
        if (convertView == null) {
            CountryViewBinding countryViewBindingInflate = CountryViewBinding.inflate(LayoutInflater.from(this.context), parent, false);
            countryViewBindingInflate.getClass();
            LinearLayout root = countryViewBindingInflate.getRoot();
            root.getClass();
            countryViewHolder = new CountryViewHolder(countryViewBindingInflate);
            root.setTag(countryViewHolder);
            convertView = root;
        } else {
            Object tag = convertView.getTag();
            tag.getClass();
            countryViewHolder = (CountryViewHolder) tag;
        }
        countryViewHolder.bindItem(getItem(position));
        return convertView;
    }

    public final void setItems(@NotNull List<CountryModel> countries) {
        countries.getClass();
        this.countries.clear();
        this.countries.addAll(countries);
        notifyDataSetChanged();
    }
}
