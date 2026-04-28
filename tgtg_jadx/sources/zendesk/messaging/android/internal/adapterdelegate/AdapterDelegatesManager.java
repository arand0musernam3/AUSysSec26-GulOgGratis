package zendesk.messaging.android.internal.adapterdelegate;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.r2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q1.l1;
import r8.k;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  *\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002! B'\u0012\u001e\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006\""}, d2 = {"Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegatesManager;", "T", "", "", "Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegate;", "delegates", "<init>", "([Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegate;)V", "delegate", "addDelegate", "(Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegate;)Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegatesManager;", "", "viewType", "getDelegateForViewType", "(I)Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegate;", "items", "position", "getItemViewType", "(Ljava/lang/Object;I)I", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/r2;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/r2;", "holder", "", "payloads", "", "onBindViewHolder", "(Ljava/lang/Object;ILandroidx/recyclerview/widget/r2;Ljava/util/List;)V", "Lq1/l1;", "Lq1/l1;", "Companion", "DefaultViewHolder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdapterDelegatesManager<T> {

    @NotNull
    private static final String LOG_TAG = "AdapterDelegatesManager";

    @NotNull
    private l1 delegates;

    @NotNull
    private static final List<Object> PAYLOADS_EMPTY_LIST = n0.f26529a;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegatesManager$DefaultViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultViewHolder extends r2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultViewHolder(@NotNull View view) {
            super(view);
            view.getClass();
        }
    }

    public AdapterDelegatesManager(@NotNull AdapterDelegate<T>... adapterDelegateArr) {
        adapterDelegateArr.getClass();
        this.delegates = new l1(0);
        for (AdapterDelegate<T> adapterDelegate : adapterDelegateArr) {
            addDelegate(adapterDelegate);
        }
    }

    private final AdapterDelegatesManager<T> addDelegate(AdapterDelegate<T> delegate) {
        int iF = this.delegates.f();
        while (this.delegates.b(iF) != null) {
            iF++;
        }
        this.delegates.d(iF, delegate);
        return this;
    }

    private final AdapterDelegate<T> getDelegateForViewType(int viewType) {
        return (AdapterDelegate) this.delegates.b(viewType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onBindViewHolder$default(AdapterDelegatesManager adapterDelegatesManager, Object obj, int i11, r2 r2Var, List list, int i12, Object obj2) {
        if ((i12 & 8) != 0) {
            list = PAYLOADS_EMPTY_LIST;
        }
        adapterDelegatesManager.onBindViewHolder(obj, i11, r2Var, list);
    }

    public final int getItemViewType(T items, int position) {
        if (items == null) {
            Logger.e(LOG_TAG, "Items data source is null!", new Object[0]);
        }
        int iF = this.delegates.f();
        for (int i11 = 0; i11 < iF; i11++) {
            AdapterDelegate adapterDelegate = (AdapterDelegate) this.delegates.h(i11);
            if (adapterDelegate != null && adapterDelegate.isForViewType(items, position)) {
                return this.delegates.c(i11);
            }
        }
        Logger.e(LOG_TAG, items instanceof List ? "No AdapterDelegate added that matches item=" + String.valueOf(((List) items).get(position)) + " at position=" + position + " in data source" : "No AdapterDelegate added for item at position=" + position + ". items=" + items, new Object[0]);
        return 0;
    }

    public final void onBindViewHolder(T items, int position, @NotNull r2 holder, @Nullable List<? extends Object> payloads) {
        holder.getClass();
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(holder.getItemViewType());
        if (delegateForViewType == null) {
            Logger.e(LOG_TAG, k.k("No delegate found for item at position = ", position, holder.getItemViewType(), " for viewType = "), new Object[0]);
            return;
        }
        if (payloads == null) {
            payloads = PAYLOADS_EMPTY_LIST;
        }
        delegateForViewType.onBindViewHolder(items, position, holder, payloads);
    }

    @NotNull
    public final r2 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        r2 r2VarOnCreateViewHolder;
        parent.getClass();
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(viewType);
        return (delegateForViewType == null || (r2VarOnCreateViewHolder = delegateForViewType.onCreateViewHolder(parent)) == null) ? new DefaultViewHolder(parent) : r2VarOnCreateViewHolder;
    }
}
