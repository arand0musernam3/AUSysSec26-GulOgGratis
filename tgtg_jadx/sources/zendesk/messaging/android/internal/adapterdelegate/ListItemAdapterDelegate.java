package zendesk.messaging.android.internal.adapterdelegate;

import android.view.ViewGroup;
import androidx.recyclerview.widget.r2;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\u0004\b\u0001\u0010\u0002*\b\b\u0002\u0010\u0004*\u00020\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH$¢\u0006\u0004\b\r\u0010\u0016J\u0017\u0010\u0019\u001a\u00028\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00022\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006H$¢\u0006\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "I", "T", "Landroidx/recyclerview/widget/r2;", "VH", "Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegate;", "", "<init>", "()V", "item", "", "position", "", "isForViewType", "(Ljava/util/List;I)Z", "holder", "", "payloads", "", "onBindViewHolder", "(Ljava/util/List;ILandroidx/recyclerview/widget/r2;Ljava/util/List;)V", "items", "(Ljava/lang/Object;Ljava/util/List;I)Z", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/r2;", "(Ljava/lang/Object;Landroidx/recyclerview/widget/r2;Ljava/util/List;)V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ListItemAdapterDelegate<I extends T, T, VH extends r2> extends AdapterDelegate<List<? extends T>> {
    public abstract boolean isForViewType(T item, @NotNull List<? extends T> items, int position);

    @Override // zendesk.messaging.android.internal.adapterdelegate.AdapterDelegate
    public boolean isForViewType(@NotNull List<? extends T> item, int position) {
        item.getClass();
        return isForViewType(item.get(position), item, position);
    }

    public abstract void onBindViewHolder(I item, @NotNull VH holder, @NotNull List<? extends Object> payloads);

    public void onBindViewHolder(@NotNull List<? extends T> item, int position, @NotNull r2 holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        onBindViewHolder(item.get(position), holder, payloads);
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.AdapterDelegate
    @NotNull
    public abstract VH onCreateViewHolder(@NotNull ViewGroup parent);

    @Override // zendesk.messaging.android.internal.adapterdelegate.AdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, int i11, r2 r2Var, List list) {
        onBindViewHolder((List) obj, i11, r2Var, (List<? extends Object>) list);
    }
}
