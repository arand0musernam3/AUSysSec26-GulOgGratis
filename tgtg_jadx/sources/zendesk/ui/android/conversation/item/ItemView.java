package zendesk.ui.android.conversation.item;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import m2.b2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qb.r;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0014H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lzendesk/ui/android/conversation/item/ItemView;", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/item/ItemRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "itemTitle", "Landroid/widget/TextView;", "itemSubtitle", "rendering", "render", "", "renderingUpdate", "Lkotlin/Function1;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemView.kt\nzendesk/ui/android/conversation/item/ItemView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class ItemView extends LinearLayout implements Renderer<ItemRendering> {
    public static final int $stable = 8;

    @NotNull
    private final TextView itemSubtitle;

    @NotNull
    private final TextView itemTitle;

    @NotNull
    private ItemRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ItemRendering();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_Item, false);
        View.inflate(context, R.layout.zuia_view_item, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.zuia_vertical_message_padding);
        setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        setLayoutParams(layoutParams);
        setOrientation(1);
        setClickable(true);
        setFocusable(true);
        View viewFindViewById = findViewById(R.id.zuia_item_title);
        viewFindViewById.getClass();
        this.itemTitle = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_item_subtitle);
        viewFindViewById2.getClass();
        this.itemSubtitle = (TextView) viewFindViewById2;
        render(new r(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemRendering _init_$lambda$1(ItemRendering itemRendering) {
        itemRendering.getClass();
        return itemRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$6(ItemView itemView) {
        Function1<Item<?>, Unit> onItemClicked$zendesk_ui_ui_android = itemView.rendering.getOnItemClicked$zendesk_ui_ui_android();
        if (onItemClicked$zendesk_ui_ui_android != null) {
            onItemClicked$zendesk_ui_ui_android.invoke(itemView.rendering.getState().getItem$zendesk_ui_ui_android());
        }
        return Unit.f26487a;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ItemRendering, ? extends ItemRendering> renderingUpdate) {
        int iResolveColorAttr;
        renderingUpdate.getClass();
        this.rendering = (ItemRendering) renderingUpdate.invoke(this.rendering);
        StateListDrawable stateListDrawable = new StateListDrawable();
        Integer pressedColor$zendesk_ui_ui_android = this.rendering.getState().getPressedColor$zendesk_ui_ui_android();
        if (pressedColor$zendesk_ui_ui_android != null) {
            iResolveColorAttr = pressedColor$zendesk_ui_ui_android.intValue();
        } else {
            Context context = getContext();
            context.getClass();
            iResolveColorAttr = ColorExtKt.resolveColorAttr(context, com.app.tgtg.R.attr.colorAccent);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorExtKt.adjustAlpha(iResolveColorAttr, 0.3f));
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable2);
        setBackground(stateListDrawable);
        Item<?> item$zendesk_ui_ui_android = this.rendering.getState().getItem$zendesk_ui_ui_android();
        Integer titleColor = item$zendesk_ui_ui_android.getTitleColor();
        if (titleColor == null) {
            titleColor = this.rendering.getState().getTitleColor$zendesk_ui_ui_android();
        }
        if (titleColor != null) {
            this.itemTitle.setTextColor(titleColor.intValue());
        }
        this.itemTitle.setText(item$zendesk_ui_ui_android.getTitle());
        String subtitle = item$zendesk_ui_ui_android.getSubtitle();
        TextView textView = this.itemSubtitle;
        if (subtitle != null) {
            textView.setVisibility(0);
            this.itemSubtitle.setText(subtitle);
        } else {
            textView.setVisibility(8);
        }
        setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener$default(0L, new b2(this, 13), 1, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
