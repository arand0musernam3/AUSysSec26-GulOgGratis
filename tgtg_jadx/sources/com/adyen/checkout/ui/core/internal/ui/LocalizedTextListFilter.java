package com.adyen.checkout.ui.core.internal.ui;

import android.content.Context;
import android.widget.Filter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0014J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextListFilter;", "Landroid/widget/Filter;", "localizedContext", "Landroid/content/Context;", "itemList", "", "Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextListItem;", "(Landroid/content/Context;Ljava/util/List;)V", "convertResultToString", "", "resultValue", "", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "publishResults", "", "results", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LocalizedTextListFilter extends Filter {

    @NotNull
    private final List<LocalizedTextListItem> itemList;

    @NotNull
    private final Context localizedContext;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalizedTextListFilter(@NotNull Context context, @NotNull List<? extends LocalizedTextListItem> list) {
        context.getClass();
        list.getClass();
        this.localizedContext = context;
        this.itemList = list;
    }

    @Override // android.widget.Filter
    @NotNull
    public CharSequence convertResultToString(@Nullable Object resultValue) {
        LocalizedTextListItem localizedTextListItem = resultValue instanceof LocalizedTextListItem ? (LocalizedTextListItem) resultValue : null;
        Integer numValueOf = localizedTextListItem != null ? Integer.valueOf(localizedTextListItem.getTextResId()) : null;
        String string = numValueOf != null ? this.localizedContext.getString(numValueOf.intValue()) : null;
        return string == null ? "" : string;
    }

    @Override // android.widget.Filter
    @NotNull
    public Filter.FilterResults performFiltering(@Nullable CharSequence constraint) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        List<LocalizedTextListItem> list = this.itemList;
        filterResults.values = list;
        filterResults.count = list.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(@Nullable CharSequence constraint, @Nullable Filter.FilterResults results) {
    }
}
