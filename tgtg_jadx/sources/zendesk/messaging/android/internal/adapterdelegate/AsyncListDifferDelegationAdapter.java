package zendesk.messaging.android.internal.adapterdelegate;

import android.view.ViewGroup;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lzendesk/messaging/android/internal/adapterdelegate/AsyncListDifferDelegationAdapter;", "T", "Landroidx/recyclerview/widget/b1;", "Landroidx/recyclerview/widget/r2;", "Landroidx/recyclerview/widget/w;", "diffCallback", "Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegatesManager;", "", "delegatesManager", "<init>", "(Landroidx/recyclerview/widget/w;Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegatesManager;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/r2;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/r2;I)V", "", "payloads", "(Landroidx/recyclerview/widget/r2;ILjava/util/List;)V", "getItemViewType", "(I)I", "Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegatesManager;", "getDelegatesManager", "()Lzendesk/messaging/android/internal/adapterdelegate/AdapterDelegatesManager;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AsyncListDifferDelegationAdapter<T> extends b1 {

    @NotNull
    private final AdapterDelegatesManager<List<T>> delegatesManager;

    public /* synthetic */ AsyncListDifferDelegationAdapter(w wVar, AdapterDelegatesManager adapterDelegatesManager, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, (i11 & 2) != 0 ? new AdapterDelegatesManager(new AdapterDelegate[0]) : adapterDelegatesManager);
    }

    @NotNull
    public final AdapterDelegatesManager<List<T>> getDelegatesManager() {
        return this.delegatesManager;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.l1
    public int getItemViewType(int position) {
        AdapterDelegatesManager<List<T>> adapterDelegatesManager = this.delegatesManager;
        List<Object> currentList = getCurrentList();
        currentList.getClass();
        return adapterDelegatesManager.getItemViewType((List<T>) currentList, position);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull r2 holder, int position, @NotNull List<? extends Object> payloads) {
        holder.getClass();
        payloads.getClass();
        AdapterDelegatesManager<List<T>> adapterDelegatesManager = this.delegatesManager;
        List<Object> currentList = getCurrentList();
        currentList.getClass();
        adapterDelegatesManager.onBindViewHolder((List<T>) currentList, position, holder, payloads);
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public r2 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        return this.delegatesManager.onCreateViewHolder(parent, viewType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncListDifferDelegationAdapter(@NotNull w wVar, @NotNull AdapterDelegatesManager<List<T>> adapterDelegatesManager) {
        super(wVar);
        wVar.getClass();
        adapterDelegatesManager.getClass();
        this.delegatesManager = adapterDelegatesManager;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull r2 holder, int position) {
        holder.getClass();
        AdapterDelegatesManager<List<T>> adapterDelegatesManager = this.delegatesManager;
        List<Object> currentList = getCurrentList();
        currentList.getClass();
        adapterDelegatesManager.onBindViewHolder((List<T>) currentList, position, holder, null);
    }
}
