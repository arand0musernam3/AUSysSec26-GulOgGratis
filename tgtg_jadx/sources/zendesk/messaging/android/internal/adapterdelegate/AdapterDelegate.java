package zendesk.messaging.android.internal.adapterdelegate;

import android.view.ViewGroup;
import androidx.recyclerview.widget.r2;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegate;", "T", "", "<init>", "()V", "item", "", "position", "", "isForViewType", "(Ljava/lang/Object;I)Z", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/r2;", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/r2;", "holder", "", "payloads", "", "onBindViewHolder", "(Ljava/lang/Object;ILandroidx/recyclerview/widget/r2;Ljava/util/List;)V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AdapterDelegate<T> {
    public abstract boolean isForViewType(T item, int position);

    public abstract void onBindViewHolder(T item, int position, @NotNull r2 holder, @NotNull List<? extends Object> payloads);

    @NotNull
    public abstract r2 onCreateViewHolder(@NotNull ViewGroup parent);
}
