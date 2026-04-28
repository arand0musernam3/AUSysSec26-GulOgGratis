package zendesk.ui.android.conversation.receipt;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yi.a0;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.form.e;
import zendesk.ui.android.internal.ColorExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001/B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ/\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u00020\r2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\rH\u0001¢\u0006\u0004\b#\u0010\u000fR\u0014\u0010%\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/receipt/MessageReceiptRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "startAnimation", "()V", "animateTailDrop", "animateIconScaleUp", "animateIconScaleDown", "resetAnimation", "animateTextFadeIn", "Lzendesk/ui/android/conversation/receipt/MessageReceiptPosition;", "position", "getLabelColor", "(Lzendesk/ui/android/conversation/receipt/MessageReceiptPosition;)I", "buildLabelAndIconViews", "announceFailedStatusForAccessibility", "imageResource", "Lkotlin/Function1;", "containerBlock", "formatIconView", "(ILkotlin/jvm/functions/Function1;)V", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "stopAnimation$zendesk_ui_ui_android", "stopAnimation", "container", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "labelText", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "iconImage", "Landroid/widget/ImageView;", "rendering", "Lzendesk/ui/android/conversation/receipt/MessageReceiptRendering;", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageReceiptView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageReceiptView.kt\nzendesk/ui/android/conversation/receipt/MessageReceiptView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n278#2,2:319\n278#2,2:321\n278#2,2:324\n257#2,2:326\n257#2,2:328\n278#2,2:330\n278#2,2:332\n1#3:323\n*S KotlinDebug\n*F\n+ 1 MessageReceiptView.kt\nzendesk/ui/android/conversation/receipt/MessageReceiptView\n*L\n65#1:319,2\n100#1:321,2\n185#1:324,2\n296#1:326,2\n298#1:328,2\n116#1:330,2\n123#1:332,2\n*E\n"})
public final class MessageReceiptView extends LinearLayout implements Renderer<MessageReceiptRendering> {
    private static final long ACCESSIBILITY_EVENT_DELAY = 500;
    private static final float DOWN_START_TRANSLATION = -12.0f;
    private static final float DOWN_TRANSLATION = 0.0f;
    private static final long FADE_DURATION = 300;
    private static final long OPACITY_ANIMATION_DELAY = 100;
    private static final long OPACITY_ANIMATION_DURATION = 200;
    private static final long PULSE_DURATION = 600;
    private static final float SCALE_DOWN = 1.0f;
    private static final float SCALE_UP = 1.5f;
    private static final long TRANSLATION_DELAY = 300;
    private static final long TRANSLATION_DURATION = 300;

    @NotNull
    private final LinearLayout container;

    @NotNull
    private final ImageView iconImage;

    @NotNull
    private final TextView labelText;

    @NotNull
    private MessageReceiptRendering rendering;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageReceiptPosition.values().length];
            try {
                iArr[MessageReceiptPosition.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageReceiptPosition.INBOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageReceiptPosition.OUTBOUND_SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageReceiptPosition.OUTBOUND_SENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageReceiptPosition.OUTBOUND_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageReceiptPosition.INBOUND_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageReceiptView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new MessageReceiptRendering();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_MessageReceipt, false);
        View.inflate(context, R.layout.zuia_view_message_receipt, this);
        View viewFindViewById = findViewById(R.id.zuia_message_receipt_container);
        viewFindViewById.getClass();
        this.container = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_icon_image);
        viewFindViewById2.getClass();
        this.iconImage = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_label_text);
        viewFindViewById3.getClass();
        this.labelText = (TextView) viewFindViewById3;
        render(new e(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageReceiptRendering _init_$lambda$0(MessageReceiptRendering messageReceiptRendering) {
        messageReceiptRendering.getClass();
        return messageReceiptRendering;
    }

    private final void animateIconScaleDown() {
        ImageView imageView = this.iconImage;
        imageView.setPivotX(SCALE_UP);
        imageView.setPivotY(SCALE_DOWN);
        imageView.animate().scaleX(SCALE_DOWN).scaleY(SCALE_DOWN).setInterpolator(new AccelerateInterpolator()).setDuration(PULSE_DURATION).withEndAction(new a(this, 1)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateIconScaleDown$lambda$8$lambda$7(MessageReceiptView messageReceiptView) {
        if (messageReceiptView.rendering.getState().getShouldAnimateReceipt$zendesk_ui_ui_android()) {
            messageReceiptView.animateIconScaleUp();
        } else {
            messageReceiptView.resetAnimation();
        }
    }

    private final void animateIconScaleUp() {
        ImageView imageView = this.iconImage;
        imageView.setPivotX(SCALE_UP);
        imageView.setPivotY(SCALE_DOWN);
        imageView.animate().scaleX(SCALE_UP).scaleY(SCALE_UP).setDuration(PULSE_DURATION).setInterpolator(new DecelerateInterpolator()).withEndAction(new a(this, 2)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateIconScaleUp$lambda$6$lambda$5(MessageReceiptView messageReceiptView) {
        if (messageReceiptView.rendering.getState().getShouldAnimateReceipt$zendesk_ui_ui_android()) {
            messageReceiptView.animateIconScaleDown();
        } else {
            messageReceiptView.resetAnimation();
        }
    }

    private final void animateTailDrop() {
        if (this.rendering.getState().getShouldAnimateReceipt$zendesk_ui_ui_android()) {
            ImageView imageView = this.iconImage;
            imageView.animate().cancel();
            imageView.setAlpha(DOWN_TRANSLATION);
            imageView.setVisibility(4);
            imageView.setTranslationY(DOWN_START_TRANSLATION);
            imageView.animate().translationY(DOWN_TRANSLATION).setStartDelay(300L).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).withStartAction(new a0(imageView, 5)).withEndAction(new v30.a(9, imageView, this)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateTailDrop$lambda$4$lambda$1(ImageView imageView) {
        imageView.animate().alpha(SCALE_DOWN).setStartDelay(OPACITY_ANIMATION_DELAY).setDuration(OPACITY_ANIMATION_DURATION).setInterpolator(new LinearInterpolator()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateTailDrop$lambda$4$lambda$2(ImageView imageView, MessageReceiptView messageReceiptView) {
        imageView.setVisibility(0);
        messageReceiptView.animateTextFadeIn();
        if (messageReceiptView.rendering.getState().getMessageReceiptPosition$zendesk_ui_ui_android() == MessageReceiptPosition.OUTBOUND_SENDING) {
            messageReceiptView.animateIconScaleUp();
        } else {
            messageReceiptView.labelText.setVisibility(0);
        }
    }

    private final void animateTextFadeIn() {
        TextView textView = this.labelText;
        textView.animate().cancel();
        textView.setAlpha(DOWN_TRANSLATION);
        textView.setVisibility(4);
        textView.animate().alpha(SCALE_DOWN).setDuration(300L).withEndAction(new a0(textView, 4)).start();
    }

    private final void announceFailedStatusForAccessibility() {
        this.labelText.postDelayed(new a(this, 0), ACCESSIBILITY_EVENT_DELAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void announceFailedStatusForAccessibility$lambda$14(MessageReceiptView messageReceiptView) {
        messageReceiptView.labelText.sendAccessibilityEvent(8);
    }

    private final void buildLabelAndIconViews() {
        this.container.removeAllViews();
        switch (WhenMappings.$EnumSwitchMapping$0[this.rendering.getState().getMessageReceiptPosition$zendesk_ui_ui_android().ordinal()]) {
            case 1:
                break;
            case 2:
                formatIconView(R.drawable.zuia_message_status_inbound, new b(this, 0));
                break;
            case 3:
                formatIconView$default(this, R.drawable.zuia_message_status_outbound_sent, null, 2, null);
                break;
            case 4:
                formatIconView$default(this, R.drawable.zuia_message_status_outbound_sending, null, 2, null);
                break;
            case 5:
                formatIconView$default(this, R.drawable.zuia_message_status_outbound_failed, null, 2, null);
                announceFailedStatusForAccessibility();
                break;
            case 6:
                formatIconView(R.drawable.zuia_message_status_outbound_failed, new b(this, 1));
                announceFailedStatusForAccessibility();
                break;
            default:
                e40.a.f();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildLabelAndIconViews$lambda$12(MessageReceiptView messageReceiptView, LinearLayout linearLayout) {
        linearLayout.getClass();
        if (messageReceiptView.rendering.getState().getShowIcon$zendesk_ui_ui_android()) {
            linearLayout.addView(messageReceiptView.iconImage);
        }
        linearLayout.addView(messageReceiptView.labelText);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildLabelAndIconViews$lambda$13(MessageReceiptView messageReceiptView, LinearLayout linearLayout) {
        linearLayout.getClass();
        if (messageReceiptView.rendering.getState().getShowIcon$zendesk_ui_ui_android()) {
            linearLayout.addView(messageReceiptView.iconImage);
        }
        linearLayout.addView(messageReceiptView.labelText);
        return Unit.f26487a;
    }

    private final void formatIconView(int imageResource, Function1<? super LinearLayout, Unit> containerBlock) {
        this.iconImage.setImageResource(imageResource);
        Integer iconColor$zendesk_ui_ui_android = this.rendering.getState().getIconColor$zendesk_ui_ui_android();
        if (iconColor$zendesk_ui_ui_android != null) {
            this.iconImage.setColorFilter(iconColor$zendesk_ui_ui_android.intValue(), PorterDuff.Mode.SRC_IN);
        }
        containerBlock.invoke(this.container);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void formatIconView$default(MessageReceiptView messageReceiptView, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            function1 = new b(messageReceiptView, 2);
        }
        messageReceiptView.formatIconView(i11, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit formatIconView$lambda$15(MessageReceiptView messageReceiptView, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(messageReceiptView.labelText);
        if (messageReceiptView.rendering.getState().getShowIcon$zendesk_ui_ui_android()) {
            linearLayout.addView(messageReceiptView.iconImage);
        }
        return Unit.f26487a;
    }

    private final int getLabelColor(MessageReceiptPosition position) {
        switch (WhenMappings.$EnumSwitchMapping$0[position.ordinal()]) {
            case 1:
            case 2:
                Context context = getContext();
                context.getClass();
                return ColorExtKt.resolveColorAttr(context, R.attr.messageReceiptInboundLabelColor);
            case 3:
            case 4:
                Context context2 = getContext();
                context2.getClass();
                return ColorExtKt.resolveColorAttr(context2, R.attr.messageReceiptOutboundLabelColor);
            case 5:
            case 6:
                Context context3 = getContext();
                context3.getClass();
                return ColorExtKt.resolveColorAttr(context3, R.attr.messageReceiptOutboundFailedLabelColor);
            default:
                e40.a.f();
                return 0;
        }
    }

    private final void resetAnimation() {
        ImageView imageView = this.iconImage;
        imageView.animate().scaleX(SCALE_DOWN).scaleY(SCALE_DOWN).start();
        imageView.clearAnimation();
    }

    private final void startAnimation() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.rendering.getState().getMessageReceiptPosition$zendesk_ui_ui_android().ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
                animateTailDrop();
                break;
            case 5:
            case 6:
                this.labelText.setVisibility(0);
                break;
            default:
                e40.a.f();
                break;
        }
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super MessageReceiptRendering, ? extends MessageReceiptRendering> renderingUpdate) {
        renderingUpdate.getClass();
        MessageReceiptRendering messageReceiptRendering = (MessageReceiptRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = messageReceiptRendering;
        this.labelText.setVisibility(messageReceiptRendering.getState().getShouldAnimateReceipt$zendesk_ui_ui_android() ? 4 : 0);
        this.labelText.setText(this.rendering.getState().getLabel$zendesk_ui_ui_android());
        TextView textView = this.labelText;
        Integer labelColor$zendesk_ui_ui_android = this.rendering.getState().getLabelColor$zendesk_ui_ui_android();
        textView.setTextColor(labelColor$zendesk_ui_ui_android != null ? labelColor$zendesk_ui_ui_android.intValue() : getLabelColor(this.rendering.getState().getMessageReceiptPosition$zendesk_ui_ui_android()));
        buildLabelAndIconViews();
        startAnimation();
    }

    public final void stopAnimation$zendesk_ui_ui_android() {
        this.labelText.animate().cancel();
        this.labelText.setVisibility(0);
        this.iconImage.animate().cancel();
        this.iconImage.setVisibility(0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/receipt/MessageReceiptView$Companion;", "", "<init>", "()V", "FADE_DURATION", "", "PULSE_DURATION", "TRANSLATION_DELAY", "SCALE_UP", "", "SCALE_DOWN", "TRANSLATION_DURATION", "DOWN_START_TRANSLATION", "DOWN_TRANSLATION", "OPACITY_ANIMATION_DURATION", "OPACITY_ANIMATION_DELAY", "ACCESSIBILITY_EVENT_DELAY", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageReceiptView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageReceiptView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ MessageReceiptView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageReceiptView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
