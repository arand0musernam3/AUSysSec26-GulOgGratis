package com.adyen.checkout.ui.core.internal.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import com.adyen.checkout.ui.core.databinding.TextItemViewBinding;
import com.adyen.checkout.ui.core.internal.ui.LocalizedTextListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J!\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0014\u0010\u001f\u001a\u00020 2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000!R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextListAdapter;", "T", "Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextListItem;", "Landroid/widget/BaseAdapter;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "localizedContext", "(Landroid/content/Context;Landroid/content/Context;)V", "itemList", "", "textListFilter", "Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextListFilter;", "getCount", "", "getFilter", "Landroid/widget/Filter;", "getItem", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextListItem;", "position", "(I)Lcom/adyen/checkout/ui/core/internal/ui/LocalizedTextListItem;", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "setItems", "", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalizedTextListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalizedTextListAdapter.kt\ncom/adyen/checkout/ui/core/internal/ui/LocalizedTextListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n295#2,2:107\n*S KotlinDebug\n*F\n+ 1 LocalizedTextListAdapter.kt\ncom/adyen/checkout/ui/core/internal/ui/LocalizedTextListAdapter\n*L\n39#1:107,2\n*E\n"})
public final class LocalizedTextListAdapter<T extends LocalizedTextListItem> extends BaseAdapter implements Filterable {

    @NotNull
    private final Context context;

    @NotNull
    private final List<T> itemList;

    @NotNull
    private final Context localizedContext;

    @NotNull
    private final LocalizedTextListFilter textListFilter;

    public LocalizedTextListAdapter(@NotNull Context context, @NotNull Context context2) {
        context.getClass();
        context2.getClass();
        this.context = context;
        this.localizedContext = context2;
        ArrayList arrayList = new ArrayList();
        this.itemList = arrayList;
        this.textListFilter = new LocalizedTextListFilter(context2, arrayList);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.itemList.size();
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return this.textListFilter;
    }

    @Nullable
    public final T getItem(@NotNull Function1<? super T, Boolean> predicate) {
        Object next;
        predicate.getClass();
        Iterator<T> it = this.itemList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) predicate.invoke((LocalizedTextListItem) next)).booleanValue()) {
                break;
            }
        }
        return (T) next;
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        LocalizedTextViewHolder localizedTextViewHolder;
        if (convertView == null) {
            TextItemViewBinding textItemViewBindingInflate = TextItemViewBinding.inflate(LayoutInflater.from(this.context), parent, false);
            textItemViewBindingInflate.getClass();
            LinearLayout root = textItemViewBindingInflate.getRoot();
            root.getClass();
            localizedTextViewHolder = new LocalizedTextViewHolder(this.localizedContext, textItemViewBindingInflate);
            root.setTag(localizedTextViewHolder);
            convertView = root;
        } else {
            Object tag = convertView.getTag();
            tag.getClass();
            localizedTextViewHolder = (LocalizedTextViewHolder) tag;
        }
        localizedTextViewHolder.bindItem(getItem(position));
        return convertView;
    }

    public final void setItems(@NotNull List<? extends T> itemList) {
        itemList.getClass();
        this.itemList.clear();
        this.itemList.addAll(itemList);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    @NotNull
    public T getItem(int position) {
        return this.itemList.get(position);
    }
}
