package zendesk.ui.android.conversation.composer;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.braze.models.FeatureFlag;
import com.google.android.material.bottomsheet.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.ThrottledAfterTextChangedKt;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 (2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001(B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010#\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020\u0019H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lzendesk/ui/android/conversation/composer/MessageComposerView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/composer/MessageComposerRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "sendButton", "Landroid/widget/ImageButton;", "attachButton", "textField", "Landroid/widget/EditText;", "composerContainer", "rendering", "messageComposer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "viewPropertyAnimator", "Landroid/view/ViewPropertyAnimator;", "render", "", "renderingUpdate", "Lkotlin/Function1;", "setupMessageComposerVisibility", "setupMessageComposerFocusedState", "setupComposeBorder", "isTextFieldFocused", "", "setupAttachButtonBackgroundState", "setEnabled", FeatureFlag.ENABLED, "renderSendButton", "setupSendButtonBackgroundState", "renderAttachButton", "renderAttachMenu", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageComposerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComposerView.kt\nzendesk/ui/android/conversation/composer/MessageComposerView\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,347:1\n39#2:348\n55#2,12:349\n84#2,3:361\n1#3:364\n257#4,2:365\n*S KotlinDebug\n*F\n+ 1 MessageComposerView.kt\nzendesk/ui/android/conversation/composer/MessageComposerView\n*L\n74#1:348\n74#1:349,12\n74#1:361,3\n311#1:365,2\n*E\n"})
public final class MessageComposerView extends FrameLayout implements Renderer<MessageComposerRendering> {
    private static final float ATTACHMENT_ALPHA = 0.85f;
    private static final int COMPOSER_MAX_LINES = 5;
    private static final long SEND_BUTTON_HIDE_OPACITY_ANIMATION_DURATION = 200;
    private static final long SEND_BUTTON_HIDE_TRANSLATION_ANIMATION_DURATION = 300;
    private static final long SEND_BUTTON_SHOW_OPACITY_ANIMATION_DELAY = 100;
    private static final long SEND_BUTTON_SHOW_OPACITY_ANIMATION_DURATION = 200;
    private static final long SEND_BUTTON_SHOW_TRANSLATION_ANIMATION_DURATION = 300;

    @NotNull
    private final ImageButton attachButton;

    @NotNull
    private final FrameLayout composerContainer;

    @NotNull
    private final ConstraintLayout messageComposer;

    @NotNull
    private MessageComposerRendering rendering;

    @NotNull
    private final ImageButton sendButton;

    @NotNull
    private final EditText textField;

    @Nullable
    private ViewPropertyAnimator viewPropertyAnimator;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComposerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new MessageComposerRendering();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_MessageComposer, false);
        View.inflate(context, R.layout.zuia_view_message_composer, this);
        View viewFindViewById = findViewById(R.id.zuia_composer_container);
        viewFindViewById.getClass();
        this.composerContainer = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_attach_button);
        viewFindViewById2.getClass();
        this.attachButton = (ImageButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_text_field);
        viewFindViewById3.getClass();
        EditText editText = (EditText) viewFindViewById3;
        this.textField = editText;
        View viewFindViewById4 = findViewById(R.id.zuia_send_button);
        viewFindViewById4.getClass();
        this.sendButton = (ImageButton) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.zuia_message_composer_view);
        viewFindViewById5.getClass();
        this.messageComposer = (ConstraintLayout) viewFindViewById5;
        context.getTheme().resolveAttribute(com.app.tgtg.R.attr.colorOnSurface, new TypedValue(), true);
        editText.addTextChangedListener(new TextWatcher() { // from class: zendesk.ui.android.conversation.composer.MessageComposerView$special$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                if (text == null || !(!StringsKt.H(text))) {
                    return;
                }
                this.this$0.rendering.getOnTyping$zendesk_ui_ui_android().invoke();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s7) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }
        });
        editText.addTextChangedListener(ThrottledAfterTextChangedKt.throttledAfterTextChangedListener$default(0L, new zendesk.core.android.internal.a(this, 9), 1, null));
        render(new zendesk.ui.android.conversation.articleviewer.b(13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(MessageComposerView messageComposerView, Editable editable) {
        if (editable != null && (!StringsKt.H(editable))) {
            messageComposerView.renderSendButton(true);
        }
        messageComposerView.rendering.getOnTextChanged$zendesk_ui_ui_android().invoke(StringsKt.e0(String.valueOf(editable)).toString());
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageComposerRendering _init_$lambda$2(MessageComposerRendering messageComposerRendering) {
        messageComposerRendering.getClass();
        return messageComposerRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$4(MessageComposerView messageComposerView) {
        messageComposerView.rendering.getOnSendButtonClicked$zendesk_ui_ui_android().invoke(StringsKt.e0(messageComposerView.textField.getText().toString()).toString());
        messageComposerView.textField.setText((CharSequence) null);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$5(MessageComposerView messageComposerView) {
        messageComposerView.renderAttachMenu();
        return Unit.f26487a;
    }

    private final void renderAttachButton(boolean enabled) {
        ImageButton imageButton = this.attachButton;
        imageButton.setEnabled(enabled);
        imageButton.setVisibility(enabled && (this.rendering.getState().getGallerySupported$zendesk_ui_ui_android() || this.rendering.getState().getCameraSupported$zendesk_ui_ui_android()) ? 0 : 8);
    }

    private final void renderAttachMenu() {
        Context context = getContext();
        context.getClass();
        MessageComposerAttachmentMenu messageComposerAttachmentMenu = new MessageComposerAttachmentMenu(context);
        messageComposerAttachmentMenu.setGallerySupported(this.rendering.getState().getGallerySupported$zendesk_ui_ui_android());
        messageComposerAttachmentMenu.setCameraSupported(this.rendering.getState().getCameraSupported$zendesk_ui_ui_android());
        messageComposerAttachmentMenu.setMenuTextAndIconColor(this.rendering.getState().getMenuTextColor$zendesk_ui_ui_android());
        messageComposerAttachmentMenu.setBackgroundColor(this.rendering.getState().getMenuBackgroundColor$zendesk_ui_ui_android());
        l lVar = new l(getContext());
        messageComposerAttachmentMenu.setOnItemClickListener(new xq.a(17, this, lVar));
        lVar.getBehavior().J(3);
        lVar.getBehavior().J = true;
        lVar.setContentView(messageComposerAttachmentMenu);
        lVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderAttachMenu$lambda$17(MessageComposerView messageComposerView, l lVar, int i11) {
        messageComposerView.rendering.getOnAttachButtonClicked$zendesk_ui_ui_android().invoke(Integer.valueOf(i11));
        lVar.dismiss();
        return Unit.f26487a;
    }

    private final void renderSendButton(boolean enabled) {
        final ImageButton imageButton = this.sendButton;
        if ((imageButton.getVisibility() == 0) == enabled) {
            return;
        }
        float height = (imageButton.getHeight() / 2.0f) * (this.sendButton.getLayoutDirection() == 1 ? -1 : 1);
        ViewPropertyAnimator viewPropertyAnimator = this.viewPropertyAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (enabled) {
            imageButton.setAlpha(0.0f);
            imageButton.setVisibility(0);
            imageButton.setTranslationX(height);
            final int i11 = 0;
            ViewPropertyAnimator viewPropertyAnimatorWithEndAction = imageButton.animate().translationX(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).withStartAction(new Runnable() { // from class: zendesk.ui.android.conversation.composer.d
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            MessageComposerView.renderSendButton$lambda$15$lambda$9(imageButton);
                            break;
                        default:
                            MessageComposerView.renderSendButton$lambda$15$lambda$12(imageButton);
                            break;
                    }
                }
            }).withEndAction(new Runnable() { // from class: zendesk.ui.android.conversation.composer.e
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            MessageComposerView.renderSendButton$lambda$15$lambda$10(imageButton, this);
                            break;
                        default:
                            MessageComposerView.renderSendButton$lambda$15$lambda$13(imageButton, this);
                            break;
                    }
                }
            });
            viewPropertyAnimatorWithEndAction.start();
            this.viewPropertyAnimator = viewPropertyAnimatorWithEndAction;
        } else {
            imageButton.setTranslationX(0.0f);
            final int i12 = 1;
            ViewPropertyAnimator viewPropertyAnimatorWithEndAction2 = imageButton.animate().translationX(height).setDuration(300L).setInterpolator(new AccelerateInterpolator()).withStartAction(new Runnable() { // from class: zendesk.ui.android.conversation.composer.d
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            MessageComposerView.renderSendButton$lambda$15$lambda$9(imageButton);
                            break;
                        default:
                            MessageComposerView.renderSendButton$lambda$15$lambda$12(imageButton);
                            break;
                    }
                }
            }).withEndAction(new Runnable() { // from class: zendesk.ui.android.conversation.composer.e
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            MessageComposerView.renderSendButton$lambda$15$lambda$10(imageButton, this);
                            break;
                        default:
                            MessageComposerView.renderSendButton$lambda$15$lambda$13(imageButton, this);
                            break;
                    }
                }
            });
            viewPropertyAnimatorWithEndAction2.start();
            this.viewPropertyAnimator = viewPropertyAnimatorWithEndAction2;
        }
        setupSendButtonBackgroundState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderSendButton$lambda$15$lambda$10(ImageButton imageButton, MessageComposerView messageComposerView) {
        imageButton.setVisibility(0);
        messageComposerView.viewPropertyAnimator = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderSendButton$lambda$15$lambda$12(ImageButton imageButton) {
        imageButton.animate().alpha(0.0f).setDuration(200L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderSendButton$lambda$15$lambda$13(ImageButton imageButton, MessageComposerView messageComposerView) {
        imageButton.setVisibility(8);
        messageComposerView.viewPropertyAnimator = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderSendButton$lambda$15$lambda$9(ImageButton imageButton) {
        imageButton.animate().alpha(1.0f).setStartDelay(SEND_BUTTON_SHOW_OPACITY_ANIMATION_DELAY).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
    }

    private final void setupAttachButtonBackgroundState() {
        int sendButtonColor$zendesk_ui_ui_android = this.rendering.getState().getSendButtonColor$zendesk_ui_ui_android();
        ImageButton imageButton = this.attachButton;
        int i11 = R.drawable.zuia_attachment_button_background;
        int i12 = R.dimen.zuia_attachment_button_stroke_width;
        Drawable background = imageButton.getBackground();
        background.getClass();
        ViewKt.addAccessibilityFocusedState(imageButton, i11, i12, sendButtonColor$zendesk_ui_ui_android, background);
    }

    private final void setupComposeBorder(boolean isTextFieldFocused) {
        MessageComposerRendering messageComposerRendering = this.rendering;
        ViewKt.outlinedBoxBackground$default(this.composerContainer, isTextFieldFocused ? messageComposerRendering.getState().getFocusedBorderColor$zendesk_ui_ui_android() : ColorExtKt.adjustAlpha(messageComposerRendering.getState().getBorderColor$zendesk_ui_ui_android(), 0.55f), getResources().getDimension(R.dimen.zuia_message_composer_radius), 0.0f, 0, 12, null);
    }

    private final void setupMessageComposerFocusedState() {
        final int i11 = 0;
        this.textField.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: zendesk.ui.android.conversation.composer.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageComposerView f47832b;

            {
                this.f47832b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                switch (i11) {
                    case 0:
                        MessageComposerView.setupMessageComposerFocusedState$lambda$7(this.f47832b, view, z11);
                        break;
                    default:
                        MessageComposerView.setupMessageComposerFocusedState$lambda$8(this.f47832b, view, z11);
                        break;
                }
            }
        });
        final int i12 = 1;
        this.sendButton.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: zendesk.ui.android.conversation.composer.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageComposerView f47832b;

            {
                this.f47832b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                switch (i12) {
                    case 0:
                        MessageComposerView.setupMessageComposerFocusedState$lambda$7(this.f47832b, view, z11);
                        break;
                    default:
                        MessageComposerView.setupMessageComposerFocusedState$lambda$8(this.f47832b, view, z11);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMessageComposerFocusedState$lambda$7(MessageComposerView messageComposerView, View view, boolean z11) {
        boolean zHasFocus = messageComposerView.textField.hasFocus();
        messageComposerView.setupComposeBorder(zHasFocus);
        if (zHasFocus) {
            messageComposerView.renderSendButton(true);
            return;
        }
        if (messageComposerView.sendButton.hasFocus()) {
            return;
        }
        Editable text = messageComposerView.textField.getText();
        if (text == null || StringsKt.H(text)) {
            messageComposerView.renderSendButton(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMessageComposerFocusedState$lambda$8(MessageComposerView messageComposerView, View view, boolean z11) {
        if (messageComposerView.sendButton.hasFocus()) {
            messageComposerView.renderSendButton(true);
            return;
        }
        if (messageComposerView.textField.hasFocus()) {
            return;
        }
        Editable text = messageComposerView.textField.getText();
        if (text == null || StringsKt.H(text)) {
            messageComposerView.renderSendButton(false);
        }
    }

    private final void setupMessageComposerVisibility() {
        this.messageComposer.setVisibility(this.rendering.getState().getEnabled$zendesk_ui_ui_android() ? this.rendering.getState().getVisibility$zendesk_ui_ui_android() : 8);
    }

    private final void setupSendButtonBackgroundState() {
        ViewKt.addAccessibilityFocusedState$default(this.sendButton, R.drawable.zuia_attachment_button_background, R.dimen.zuia_attachment_button_stroke_width, this.rendering.getState().getSendButtonColor$zendesk_ui_ui_android(), null, 8, null);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super MessageComposerRendering, ? extends MessageComposerRendering> renderingUpdate) {
        renderingUpdate.getClass();
        MessageComposerRendering messageComposerRendering = (MessageComposerRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = messageComposerRendering;
        setEnabled(messageComposerRendering.getState().getEnabled$zendesk_ui_ui_android());
        setupComposeBorder(false);
        this.textField.setFilters(this.rendering.getState().getInputMaxLength$zendesk_ui_ui_android() < 0 ? new InputFilter[0] : new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.rendering.getState().getInputMaxLength$zendesk_ui_ui_android())});
        this.attachButton.setColorFilter(ColorExtKt.adjustAlpha(this.rendering.getState().getAttachButtonColor$zendesk_ui_ui_android(), ATTACHMENT_ALPHA), PorterDuff.Mode.SRC_IN);
        this.sendButton.setColorFilter(this.rendering.getState().getSendButtonColor$zendesk_ui_ui_android());
        this.sendButton.setContentDescription(getResources().getString(R.string.zuia_send_button_accessibility_label));
        final int i11 = 0;
        this.sendButton.setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener$default(0L, new Function0(this) { // from class: zendesk.ui.android.conversation.composer.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageComposerView f47825b;

            {
                this.f47825b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return MessageComposerView.render$lambda$4(this.f47825b);
                    default:
                        return MessageComposerView.render$lambda$5(this.f47825b);
                }
            }
        }, 1, null));
        setupAttachButtonBackgroundState();
        setupMessageComposerVisibility();
        final int i12 = 1;
        this.attachButton.setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener$default(0L, new Function0(this) { // from class: zendesk.ui.android.conversation.composer.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageComposerView f47825b;

            {
                this.f47825b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return MessageComposerView.render$lambda$4(this.f47825b);
                    default:
                        return MessageComposerView.render$lambda$5(this.f47825b);
                }
            }
        }, 1, null));
        String composerText$zendesk_ui_ui_android = this.rendering.getState().getComposerText$zendesk_ui_ui_android();
        if (composerText$zendesk_ui_ui_android.length() > 0) {
            this.textField.setText(composerText$zendesk_ui_ui_android);
        }
        if (this.textField.hasFocus()) {
            EditText editText = this.textField;
            editText.setSelection(editText.getText().toString().length());
        }
        this.textField.setHintTextColor(ColorExtKt.adjustAlpha(this.rendering.getState().getTextColor$zendesk_ui_ui_android(), 0.55f));
        this.textField.setTextColor(this.rendering.getState().getTextColor$zendesk_ui_ui_android());
        setupMessageComposerFocusedState();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        renderAttachButton(this.rendering.getState().getShowAttachment$zendesk_ui_ui_android());
        EditText editText = this.textField;
        if (!enabled) {
            editText.setEnabled(false);
            this.textField.setMaxLines(1);
            renderSendButton(false);
        } else {
            editText.setEnabled(true);
            this.textField.setMaxLines(5);
            this.textField.getText().getClass();
            renderSendButton(!StringsKt.H(r3));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lzendesk/ui/android/conversation/composer/MessageComposerView$Companion;", "", "<init>", "()V", "SEND_BUTTON_SHOW_TRANSLATION_ANIMATION_DURATION", "", "SEND_BUTTON_SHOW_OPACITY_ANIMATION_DURATION", "SEND_BUTTON_SHOW_OPACITY_ANIMATION_DELAY", "SEND_BUTTON_HIDE_TRANSLATION_ANIMATION_DURATION", "SEND_BUTTON_HIDE_OPACITY_ANIMATION_DURATION", "COMPOSER_MAX_LINES", "", "ATTACHMENT_ALPHA", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ MessageComposerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
