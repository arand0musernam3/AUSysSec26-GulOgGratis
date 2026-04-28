package zendesk.ui.android.conversation.item;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qb.r;
import qb0.a;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.item.ItemRendering;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013H\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lzendesk/ui/android/conversation/item/ItemGroupView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/item/ItemGroupRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "itemContainer", "Landroid/widget/LinearLayout;", "rendering", "render", "", "renderingUpdate", "Lkotlin/Function1;", "createItemView", "Landroid/view/View;", "item", "Lzendesk/ui/android/conversation/item/Item;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nItemGroupView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemGroupView.kt\nzendesk/ui/android/conversation/item/ItemGroupView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class ItemGroupView extends FrameLayout implements Renderer<ItemGroupRendering> {
    public static final int $stable = 8;

    @NotNull
    private final LinearLayout itemContainer;

    @NotNull
    private ItemGroupRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ItemGroupRendering();
        View.inflate(context, R.layout.zuia_view_item_group, this);
        View viewFindViewById = findViewById(R.id.zuia_item_container);
        viewFindViewById.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        this.itemContainer = linearLayout;
        linearLayout.setClipToOutline(true);
        context.getTheme().resolveAttribute(com.app.tgtg.R.attr.colorOnSurface, new TypedValue(), true);
        ViewKt.outlinedBoxBackground$default(linearLayout, 0, 0.0f, 0.0f, 0, 15, null);
        render(new r(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemGroupRendering _init_$lambda$0(ItemGroupRendering itemGroupRendering) {
        itemGroupRendering.getClass();
        return itemGroupRendering;
    }

    private final View createItemView(Item<?> item) {
        Context context = getContext();
        context.getClass();
        ItemView itemView = new ItemView(context, null, 0, 0, 14, null);
        itemView.render(new a(item, this, 1));
        return itemView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemRendering createItemView$lambda$7$lambda$6(Item item, ItemGroupView itemGroupView, ItemRendering itemRendering) {
        itemRendering.getClass();
        ItemRendering.Builder builderState = itemRendering.toBuilder().state(new a(item, itemGroupView, 0));
        Function1<Item<?>, Unit> onItemClicked$zendesk_ui_ui_android = itemGroupView.rendering.getOnItemClicked$zendesk_ui_ui_android();
        if (onItemClicked$zendesk_ui_ui_android != null) {
            builderState.onItemClicked(onItemClicked$zendesk_ui_ui_android);
        }
        return builderState.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemState createItemView$lambda$7$lambda$6$lambda$3(Item item, ItemGroupView itemGroupView, ItemState itemState) {
        itemState.getClass();
        return itemState.copy(item, itemGroupView.rendering.getState().getTitleColor$zendesk_ui_ui_android(), itemGroupView.rendering.getState().getPressedColor$zendesk_ui_ui_android());
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ItemGroupRendering, ? extends ItemGroupRendering> renderingUpdate) {
        renderingUpdate.getClass();
        this.rendering = (ItemGroupRendering) renderingUpdate.invoke(this.rendering);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.zuia_divider_size);
        Item item = (Item) CollectionsKt.X(this.rendering.getState().getItems$zendesk_ui_ui_android());
        this.itemContainer.removeAllViews();
        for (Item<?> item2 : this.rendering.getState().getItems$zendesk_ui_ui_android()) {
            this.itemContainer.addView(createItemView(item2));
            if (Intrinsics.areEqual(item2, item)) {
                return;
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.zuia_view_divider, (ViewGroup) this, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMarginStart(dimensionPixelSize);
                marginLayoutParams2.setMarginEnd(dimensionPixelSize);
                marginLayoutParams = marginLayoutParams2;
            }
            viewInflate.setLayoutParams(marginLayoutParams);
            this.itemContainer.addView(viewInflate);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ItemGroupView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemGroupView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
