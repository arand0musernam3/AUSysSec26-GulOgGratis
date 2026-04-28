package zendesk.ui.android.conversation.conversationextension.conversationextensionheader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderState;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010&R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "", "updateAccessibilityNodeInfo", "(Landroid/view/View;)V", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState;", "state", "setupButtonFocusStates", "(Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState;)V", "Lkotlin/Function1;", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/widget/FrameLayout;", "backButton$delegate", "Lu70/j;", "getBackButton", "()Landroid/widget/FrameLayout;", "backButton", "closeButton$delegate", "getCloseButton", "closeButton", "Landroid/widget/ImageView;", "backButtonIconView$delegate", "getBackButtonIconView", "()Landroid/widget/ImageView;", "backButtonIconView", "closeButtonIconView$delegate", "getCloseButtonIconView", "closeButtonIconView", "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", MessageBundle.TITLE_ENTRY, "rendering", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationExtensionHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationExtensionHeaderView.kt\nzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,134:1\n257#2,2:135\n*S KotlinDebug\n*F\n+ 1 ConversationExtensionHeaderView.kt\nzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderView\n*L\n81#1:135,2\n*E\n"})
public final class ConversationExtensionHeaderView extends ConstraintLayout implements Renderer<ConversationExtensionHeaderRendering> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: backButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final j backButton;

    /* JADX INFO: renamed from: backButtonIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j backButtonIconView;

    /* JADX INFO: renamed from: closeButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final j closeButton;

    /* JADX INFO: renamed from: closeButtonIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j closeButtonIconView;

    @NotNull
    private ConversationExtensionHeaderRendering rendering;

    /* JADX INFO: renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final j title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationExtensionHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.backButton = ViewKt.lazyViewById(this, R.id.zuia_conversation_extension_back_button);
        this.closeButton = ViewKt.lazyViewById(this, R.id.zuia_conversation_extension_close_button);
        this.backButtonIconView = ViewKt.lazyViewById(this, R.id.zuia_back_button_icon_view);
        this.closeButtonIconView = ViewKt.lazyViewById(this, R.id.zuia_close_button_icon_view);
        this.title = ViewKt.lazyViewById(this, R.id.zuia_conversation_extension_title);
        this.rendering = new ConversationExtensionHeaderRendering();
        View.inflate(context, R.layout.zuia_view_conversation_extension_header, this);
    }

    private final FrameLayout getBackButton() {
        return (FrameLayout) this.backButton.getValue();
    }

    private final ImageView getBackButtonIconView() {
        return (ImageView) this.backButtonIconView.getValue();
    }

    private final FrameLayout getCloseButton() {
        return (FrameLayout) this.closeButton.getValue();
    }

    private final ImageView getCloseButtonIconView() {
        return (ImageView) this.closeButtonIconView.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$1(ConversationExtensionHeaderView conversationExtensionHeaderView, View view) {
        conversationExtensionHeaderView.rendering.getOnMenuItemClicked$zendesk_ui_ui_android().invoke(ConversationExtensionHeaderState.ButtonName.BACK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$2(ConversationExtensionHeaderView conversationExtensionHeaderView, View view) {
        conversationExtensionHeaderView.rendering.getOnMenuItemClicked$zendesk_ui_ui_android().invoke(ConversationExtensionHeaderState.ButtonName.CLOSE);
    }

    private final void setupButtonFocusStates(ConversationExtensionHeaderState state) {
        FrameLayout backButton = getBackButton();
        int i11 = R.drawable.zuia_ic_carousel_next_button_circle;
        int i12 = R.dimen.zuia_carousel_next_prev_stroke_width;
        int focusedBorderColor$zendesk_ui_ui_android = state.getFocusedBorderColor$zendesk_ui_ui_android();
        Drawable drawable = getContext().getDrawable(R.drawable.zuia_ic_carousel_next_button_circle);
        drawable.getClass();
        ViewKt.addAccessibilityFocusedState(backButton, i11, i12, focusedBorderColor$zendesk_ui_ui_android, (GradientDrawable) drawable);
        FrameLayout closeButton = getCloseButton();
        int i13 = R.drawable.zuia_ic_carousel_prev_button_circle;
        int i14 = R.dimen.zuia_carousel_next_prev_stroke_width;
        int focusedBorderColor$zendesk_ui_ui_android2 = state.getFocusedBorderColor$zendesk_ui_ui_android();
        Drawable drawable2 = getContext().getDrawable(R.drawable.zuia_ic_carousel_prev_button_circle);
        drawable2.getClass();
        ViewKt.addAccessibilityFocusedState(closeButton, i13, i14, focusedBorderColor$zendesk_ui_ui_android2, (GradientDrawable) drawable2);
    }

    private final void updateAccessibilityNodeInfo(View view) {
        view.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderView.updateAccessibilityNodeInfo.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setClassName("android.widget.Button");
            }
        });
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ConversationExtensionHeaderRendering, ? extends ConversationExtensionHeaderRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ConversationExtensionHeaderState state = this.rendering.getState();
        ConversationExtensionHeaderRendering conversationExtensionHeaderRendering = (ConversationExtensionHeaderRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = conversationExtensionHeaderRendering;
        if (!Intrinsics.areEqual(state, conversationExtensionHeaderRendering.getState())) {
            setupButtonFocusStates(this.rendering.getState());
            setBackgroundColor(this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android());
            getBackButtonIconView().setColorFilter(this.rendering.getState().getIconColor$zendesk_ui_ui_android());
            getCloseButtonIconView().setColorFilter(this.rendering.getState().getIconColor$zendesk_ui_ui_android());
            getBackButton().getBackground().mutate().setTint(this.rendering.getState().getButtonBackgroundColor$zendesk_ui_ui_android());
            getCloseButton().getBackground().mutate().setTint(this.rendering.getState().getButtonBackgroundColor$zendesk_ui_ui_android());
            updateAccessibilityNodeInfo(getBackButton());
            updateAccessibilityNodeInfo(getCloseButton());
            ViewKt.expandTouchArea$default(getBackButton(), this, 0, 0, 0, 0, 30, null);
            ViewKt.expandTouchArea$default(getCloseButton(), this, 0, 0, 0, 0, 30, null);
            if (this.rendering.getState().getShowBackButton$zendesk_ui_ui_android()) {
                getBackButton().setVisibility(0);
            } else {
                getBackButton().setVisibility(4);
            }
            TextView title = getTitle();
            title.setText(this.rendering.getState().getTitle$zendesk_ui_ui_android());
            title.setTextColor(this.rendering.getState().getTitleColor$zendesk_ui_ui_android());
        }
        final int i11 = 0;
        getBackButton().setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.conversationextension.conversationextensionheader.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionHeaderView f47838b;

            {
                this.f47838b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ConversationExtensionHeaderView.render$lambda$1(this.f47838b, view);
                        break;
                    default:
                        ConversationExtensionHeaderView.render$lambda$2(this.f47838b, view);
                        break;
                }
            }
        });
        final int i12 = 1;
        getCloseButton().setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.conversationextension.conversationextensionheader.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionHeaderView f47838b;

            {
                this.f47838b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ConversationExtensionHeaderView.render$lambda$1(this.f47838b, view);
                        break;
                    default:
                        ConversationExtensionHeaderView.render$lambda$2(this.f47838b, view);
                        break;
                }
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationExtensionHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationExtensionHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ConversationExtensionHeaderView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationExtensionHeaderView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
