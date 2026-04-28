package com.adyen.checkout.issuerlist.internal.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerModel;
import com.adyen.checkout.ui.core.databinding.SpinnerListWithImageBinding;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\rH\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListSpinnerAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "issuerList", "", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "paymentMethod", "", "hideIssuerLogo", "", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Z)V", "getCount", "", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IssuerListSpinnerAdapter extends BaseAdapter {

    @NotNull
    private final Context context;
    private final boolean hideIssuerLogo;

    @NotNull
    private List<IssuerModel> issuerList;

    @NotNull
    private final String paymentMethod;

    public IssuerListSpinnerAdapter(@NotNull Context context, @NotNull List<IssuerModel> list, @NotNull String str, boolean z11) {
        context.getClass();
        list.getClass();
        str.getClass();
        this.context = context;
        this.issuerList = list;
        this.paymentMethod = str;
        this.hideIssuerLogo = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.issuerList.size();
    }

    @Override // android.widget.Adapter
    @NotNull
    public IssuerModel getItem(int position) {
        return this.issuerList.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        IssuerListSpinnerViewHolder issuerListSpinnerViewHolder;
        if (convertView == null) {
            SpinnerListWithImageBinding spinnerListWithImageBindingInflate = SpinnerListWithImageBinding.inflate(LayoutInflater.from(this.context), parent, false);
            spinnerListWithImageBindingInflate.getClass();
            LinearLayout root = spinnerListWithImageBindingInflate.getRoot();
            root.getClass();
            issuerListSpinnerViewHolder = new IssuerListSpinnerViewHolder(spinnerListWithImageBindingInflate, this.paymentMethod, this.hideIssuerLogo);
            root.setTag(issuerListSpinnerViewHolder);
            convertView = root;
        } else {
            Object tag = convertView.getTag();
            tag.getClass();
            issuerListSpinnerViewHolder = (IssuerListSpinnerViewHolder) tag;
        }
        issuerListSpinnerViewHolder.bind(getItem(position));
        return convertView;
    }
}
