package com.adyen.checkout.card.internal.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.adyen.checkout.card.databinding.InstallmentViewBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\rH\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/InstallmentListAdapter;", "Landroid/widget/BaseAdapter;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "localizedContext", "(Landroid/content/Context;Landroid/content/Context;)V", "installmentFilter", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentFilter;", "installmentOptions", "", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "getCount", "", "getFilter", "Landroid/widget/Filter;", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "setItems", "", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InstallmentListAdapter extends BaseAdapter implements Filterable {

    @NotNull
    private final Context context;

    @NotNull
    private final InstallmentFilter installmentFilter;

    @NotNull
    private final List<InstallmentModel> installmentOptions;

    @NotNull
    private final Context localizedContext;

    public InstallmentListAdapter(@NotNull Context context, @NotNull Context context2) {
        context.getClass();
        context2.getClass();
        this.context = context;
        this.localizedContext = context2;
        ArrayList arrayList = new ArrayList();
        this.installmentOptions = arrayList;
        this.installmentFilter = new InstallmentFilter(context2, arrayList);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.installmentOptions.size();
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return this.installmentFilter;
    }

    @Override // android.widget.Adapter
    @NotNull
    public InstallmentModel getItem(int position) {
        return this.installmentOptions.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        InstallmentViewHolder installmentViewHolder;
        if (convertView == null) {
            InstallmentViewBinding installmentViewBindingInflate = InstallmentViewBinding.inflate(LayoutInflater.from(this.context), parent, false);
            installmentViewBindingInflate.getClass();
            installmentViewHolder = new InstallmentViewHolder(installmentViewBindingInflate, this.localizedContext);
            convertView = installmentViewBindingInflate.getRoot();
            convertView.getClass();
            convertView.setTag(installmentViewHolder);
        } else {
            Object tag = convertView.getTag();
            tag.getClass();
            installmentViewHolder = (InstallmentViewHolder) tag;
        }
        installmentViewHolder.bindItem(getItem(position));
        return convertView;
    }

    public final void setItems(@NotNull List<InstallmentModel> installmentOptions) {
        installmentOptions.getClass();
        this.installmentOptions.clear();
        this.installmentOptions.addAll(installmentOptions);
        notifyDataSetChanged();
    }
}
