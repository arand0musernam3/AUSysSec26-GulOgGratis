package com.adyen.checkout.ui.core.internal.ui;

import android.widget.Filter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0014J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/TextListFilter;", "Landroid/widget/Filter;", "itemList", "", "Lcom/adyen/checkout/ui/core/internal/ui/TextListItem;", "(Ljava/util/List;)V", "convertResultToString", "", "resultValue", "", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "publishResults", "", "results", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextListFilter extends Filter {

    @NotNull
    private final List<TextListItem> itemList;

    /* JADX WARN: Multi-variable type inference failed */
    public TextListFilter(@NotNull List<? extends TextListItem> list) {
        list.getClass();
        this.itemList = list;
    }

    @Override // android.widget.Filter
    @NotNull
    public CharSequence convertResultToString(@Nullable Object resultValue) {
        TextListItem textListItem = resultValue instanceof TextListItem ? (TextListItem) resultValue : null;
        String text = textListItem != null ? textListItem.getText() : null;
        return text == null ? "" : text;
    }

    @Override // android.widget.Filter
    @NotNull
    public Filter.FilterResults performFiltering(@Nullable CharSequence constraint) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        List<TextListItem> list = this.itemList;
        filterResults.values = list;
        filterResults.count = list.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(@Nullable CharSequence constraint, @Nullable Filter.FilterResults results) {
    }
}
