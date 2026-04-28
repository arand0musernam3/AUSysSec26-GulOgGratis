package zendesk.ui.android.conversation.textcell;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.braze.Constants;
import i4.g0;
import i4.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.b1;
import m3.i;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w6.j;
import zendesk.core.android.internal.NullabilityKtxKt;
import zendesk.core.ui.android.internal.xml.RichTextHtmlExtensionsKt;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.actionbutton.ActionButton;
import zendesk.ui.android.conversation.actionbutton.ActionButtonRendering;
import zendesk.ui.android.conversation.actionbutton.ActionButtonState;
import zendesk.ui.android.conversation.actionbutton.ActionButtonView;
import zendesk.ui.android.conversation.aidisclaimer.AiDisclaimerKt;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 S2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001SB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0$0#2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J1\u0010(\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0018\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0$0#H\u0002¢\u0006\u0004\b(\u0010)J7\u00100\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J#\u00104\u001a\u00020\u00102\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000302H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00102\u0006\u00106\u001a\u00020\bH\u0000¢\u0006\u0004\b7\u0010\u001dR\u0016\u00109\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u0014\u0010E\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010Q¨\u0006T"}, d2 = {"Lzendesk/ui/android/conversation/textcell/TextCellView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/textcell/TextCellRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroidx/compose/ui/platform/ComposeView;", "createAiDisclaimerComposeView", "(Landroid/content/Context;)Landroidx/compose/ui/platform/ComposeView;", "", "setupHtmlTextSpan", "()V", "setupRegularTextSpan", "renderAiDisclaimer", "renderActionButtons", "Lzendesk/ui/android/conversation/actionbutton/ActionButton;", "actionButton", "Lzendesk/ui/android/conversation/actionbutton/ActionButtonView;", "buildActionButtonView", "(Lzendesk/ui/android/conversation/actionbutton/ActionButton;)Lzendesk/ui/android/conversation/actionbutton/ActionButtonView;", "textColor", "updateFocusedBackgroundState", "(I)V", "setupMessageBackground", "Landroid/text/SpannableString;", "clickableSpan", "prepareClickableElements", "(Landroid/text/SpannableString;)Landroid/text/SpannableString;", "", "Lkotlin/Pair;", "replaceExistingUrlSpans", "(Landroid/text/SpannableString;)Ljava/util/List;", "coveredRanges", "addAndReplaceRemainingUrlSpans", "(Landroid/text/SpannableString;Ljava/util/List;)V", "Landroid/text/style/URLSpan;", "originalSpan", "start", "end", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "replaceUrlSpanWithCustomClickableSpan", "(Landroid/text/SpannableString;Landroid/text/style/URLSpan;IILjava/lang/String;)V", "Lkotlin/Function1;", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "gravity", "setMessageTextGravity$zendesk_ui_ui_android", "setMessageTextGravity", "rendering", "Lzendesk/ui/android/conversation/textcell/TextCellRendering;", "Landroid/widget/TextView;", "messageTextView", "Landroid/widget/TextView;", "Landroid/widget/LinearLayout;", "actionButtonsContainer", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "aiBorderView", "Landroid/view/View;", "textCellViewContainer", "aiDisclaimerComposeView", "Landroidx/compose/ui/platform/ComposeView;", "aiDisclaimerDefaultTextColor", "I", "aiDisclaimerDefaultImageColor", "", "aiDisclaimerTextAlpha", "F", "aiDisclaimerIconAlpha", "Lm3/b1;", "Li4/v;", "aiDisclaimerTextColorState", "Lm3/b1;", "aiDisclaimerImageColorState", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextCellView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextCellView.kt\nzendesk/ui/android/conversation/textcell/TextCellView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,418:1\n257#2,2:419\n257#2,2:421\n255#2:423\n257#2,2:424\n257#2,2:426\n1869#3,2:428\n1761#3,3:434\n1#4:430\n13472#5,2:431\n13472#5:433\n13473#5:437\n*S KotlinDebug\n*F\n+ 1 TextCellView.kt\nzendesk/ui/android/conversation/textcell/TextCellView\n*L\n97#1:419,2\n120#1:421,2\n121#1:423\n191#1:424,2\n192#1:426,2\n216#1:428,2\n374#1:434,3\n345#1:431,2\n371#1:433\n371#1:437\n*E\n"})
public final class TextCellView extends FrameLayout implements Renderer<TextCellRendering> {
    private static final float CODE_BLOCK_TEXT_ALPHA = 0.65f;

    @NotNull
    private final LinearLayout actionButtonsContainer;

    @NotNull
    private final View aiBorderView;

    @NotNull
    private final ComposeView aiDisclaimerComposeView;
    private final int aiDisclaimerDefaultImageColor;
    private final int aiDisclaimerDefaultTextColor;
    private final float aiDisclaimerIconAlpha;

    @NotNull
    private final b1 aiDisclaimerImageColorState;
    private final float aiDisclaimerTextAlpha;

    @NotNull
    private final b1 aiDisclaimerTextColorState;

    @NotNull
    private final TextView messageTextView;

    @NotNull
    private TextCellRendering rendering;

    @NotNull
    private final LinearLayout textCellViewContainer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextCellView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new TextCellRendering();
        int iResolveColorAttr = ColorExtKt.resolveColorAttr(context, R.attr.aiDisclaimerTextColor);
        this.aiDisclaimerDefaultTextColor = iResolveColorAttr;
        int iResolveColorAttr2 = ColorExtKt.resolveColorAttr(context, R.attr.aiDisclaimerTextColor);
        this.aiDisclaimerDefaultImageColor = iResolveColorAttr2;
        this.aiDisclaimerTextAlpha = j.a(context.getResources(), R.dimen.zuia_ai_disclaimer_text_alpha);
        this.aiDisclaimerIconAlpha = j.a(context.getResources(), R.dimen.zuia_ai_disclaimer_icon_alpha);
        this.aiDisclaimerTextColorState = i.w(new v(g0.c(iResolveColorAttr)));
        this.aiDisclaimerImageColorState = i.w(new v(g0.c(iResolveColorAttr2)));
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_TextCellStyle, false);
        View.inflate(context, R.layout.zuia_view_text_cell, this);
        View viewFindViewById = findViewById(R.id.zuia_message_text);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.messageTextView = textView;
        View viewFindViewById2 = findViewById(R.id.zuia_action_buttons_container);
        viewFindViewById2.getClass();
        this.actionButtonsContainer = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_ai_border_view);
        viewFindViewById3.getClass();
        this.aiBorderView = viewFindViewById3;
        ComposeView composeViewCreateAiDisclaimerComposeView = createAiDisclaimerComposeView(context);
        this.aiDisclaimerComposeView = composeViewCreateAiDisclaimerComposeView;
        View viewFindViewById4 = findViewById(R.id.zuia_text_cell_container);
        viewFindViewById4.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById4;
        this.textCellViewContainer = linearLayout;
        linearLayout.addView(composeViewCreateAiDisclaimerComposeView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void addAndReplaceRemainingUrlSpans(SpannableString clickableSpan, List<Pair<Integer, Integer>> coveredRanges) {
        SpannableString spannableString;
        Linkify.addLinks(clickableSpan, 7);
        int i11 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) clickableSpan.getSpans(0, clickableSpan.length(), URLSpan.class);
        uRLSpanArr.getClass();
        int length = uRLSpanArr.length;
        while (i11 < length) {
            URLSpan uRLSpan = uRLSpanArr[i11];
            int spanStart = clickableSpan.getSpanStart(uRLSpan);
            int spanEnd = clickableSpan.getSpanEnd(uRLSpan);
            if (coveredRanges == null || !coveredRanges.isEmpty()) {
                Iterator<T> it = coveredRanges.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    int iIntValue = ((Number) pair.f26485a).intValue();
                    if (spanStart < ((Number) pair.f26486b).intValue() && spanEnd > iIntValue) {
                        spannableString = clickableSpan;
                        break;
                    }
                }
                String url = uRLSpan.getURL();
                url.getClass();
                spannableString = clickableSpan;
                replaceUrlSpanWithCustomClickableSpan(spannableString, uRLSpan, spanStart, spanEnd, url);
            } else {
                String url2 = uRLSpan.getURL();
                url2.getClass();
                spannableString = clickableSpan;
                replaceUrlSpanWithCustomClickableSpan(spannableString, uRLSpan, spanStart, spanEnd, url2);
            }
            i11++;
            clickableSpan = spannableString;
        }
    }

    private final ActionButtonView buildActionButtonView(ActionButton actionButton) {
        Context context = getContext();
        context.getClass();
        ActionButtonView actionButtonView = new ActionButtonView(context, null, 0, 6, null);
        actionButtonView.render(new b(this, actionButton));
        return actionButtonView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionButtonRendering buildActionButtonView$lambda$12$lambda$11(TextCellView textCellView, ActionButton actionButton, ActionButtonRendering actionButtonRendering) {
        actionButtonRendering.getClass();
        return actionButtonRendering.toBuilder().state(new b(actionButton, textCellView)).onActionButtonClicked(textCellView.rendering.getOnActionButtonClicked()).onPostbackButtonClicked(textCellView.rendering.getOnPostbackButtonClicked$zendesk_ui_ui_android()).onWebViewActionButtonClicked(textCellView.rendering.getOnWebViewActionButtonClicked()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionButtonState buildActionButtonView$lambda$12$lambda$11$lambda$10(ActionButton actionButton, TextCellView textCellView, ActionButtonState actionButtonState) {
        actionButtonState.getClass();
        String text = actionButton.getText();
        Integer actionTextColor$zendesk_ui_ui_android = actionButton.isSupported() ? textCellView.rendering.getState().getActionTextColor$zendesk_ui_ui_android() : textCellView.rendering.getState().getDisabledTextColor$zendesk_ui_ui_android();
        return ActionButtonState.copy$default(actionButtonState, text, actionButton.getUri(), actionButton.isSupported(), actionButton.getUrlSource(), actionButton.isSupported() ? textCellView.rendering.getState().getActionColor$zendesk_ui_ui_android() : textCellView.rendering.getState().getDisabledColor$zendesk_ui_ui_android(), actionTextColor$zendesk_ui_ui_android, actionButton.getActionId(), actionButton.isLoading(), actionButton.getSize(), null, actionButton.getSourceType(), 512, null);
    }

    private final ComposeView createAiDisclaimerComposeView(Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.zuia_text_cell_compose_view);
        composeView.setVisibility(this.rendering.getState().getAiGenerated$zendesk_ui_ui_android() ? 0 : 8);
        composeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        composeView.setContent(new u3.d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversation.textcell.TextCellView$createAiDisclaimerComposeView$1$1
            public final void invoke(n nVar, int i11) {
                if ((i11 & 3) == 2) {
                    s sVar = (s) nVar;
                    if (sVar.B()) {
                        sVar.U();
                        return;
                    }
                }
                AiDisclaimerKt.m1005AiDisclaimervc5YOHI(v.b(this.this$0.aiDisclaimerTextAlpha, ((v) this.this$0.aiDisclaimerTextColorState.getValue()).f23317a), v.b(this.this$0.aiDisclaimerTextAlpha, ((v) this.this$0.aiDisclaimerTextColorState.getValue()).f23317a), null, null, null, nVar, 0, 28);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((n) obj, ((Number) obj2).intValue());
                return Unit.f26487a;
            }
        }, true, 380514657));
        return composeView;
    }

    private final SpannableString prepareClickableElements(SpannableString clickableSpan) {
        addAndReplaceRemainingUrlSpans(clickableSpan, replaceExistingUrlSpans(clickableSpan));
        return clickableSpan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(TextCellView textCellView) {
        if (textCellView.messageTextView.getSelectionStart() == -1 && textCellView.messageTextView.getSelectionEnd() == -1) {
            textCellView.rendering.getOnCellClicked$zendesk_ui_ui_android().invoke(textCellView.messageTextView.getText().toString());
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean render$lambda$3(final TextCellView textCellView, View view) {
        view.getClass();
        PopupMenu popupMenuCreateCellContextualMenu = ViewKt.createCellContextualMenu(view, textCellView.rendering.getState().getContextualMenuOptions$zendesk_ui_ui_android());
        popupMenuCreateCellContextualMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: zendesk.ui.android.conversation.textcell.a
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return TextCellView.render$lambda$3$lambda$2(this.f47886a, menuItem);
            }
        });
        popupMenuCreateCellContextualMenu.show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean render$lambda$3$lambda$2(TextCellView textCellView, MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.zuia_cell_menu_copy) {
            return true;
        }
        textCellView.rendering.getOnCopyTextMenuItemClicked$zendesk_ui_ui_android().invoke(textCellView.rendering.getState().getMessageText$zendesk_ui_ui_android());
        return true;
    }

    private final void renderActionButtons() {
        this.actionButtonsContainer.removeAllViews();
        List<ActionButton> actions$zendesk_ui_ui_android = this.rendering.getState().getActions$zendesk_ui_ui_android();
        if (actions$zendesk_ui_ui_android != null) {
            for (ActionButton actionButton : actions$zendesk_ui_ui_android) {
                LinearLayout linearLayout = this.actionButtonsContainer;
                ActionButtonView actionButtonViewBuildActionButtonView = buildActionButtonView(actionButton);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.zuia_spacing_medium), (this.messageTextView.getVisibility() == 8 && this.actionButtonsContainer.getChildCount() == 0) ? getResources().getDimensionPixelSize(R.dimen.zuia_spacing_small) : 0, getResources().getDimensionPixelSize(R.dimen.zuia_spacing_medium), getResources().getDimensionPixelSize(R.dimen.zuia_spacing_small));
                linearLayout.addView(actionButtonViewBuildActionButtonView, layoutParams);
            }
        }
    }

    private final void renderAiDisclaimer() {
        TextCellState state$zendesk_ui_ui_android = this.rendering.getState();
        this.aiBorderView.setVisibility(state$zendesk_ui_ui_android.getAiGenerated$zendesk_ui_ui_android() ? 0 : 8);
        this.aiDisclaimerComposeView.setVisibility(state$zendesk_ui_ui_android.getAiGenerated$zendesk_ui_ui_android() ? 0 : 8);
        if (state$zendesk_ui_ui_android.getAiGenerated$zendesk_ui_ui_android()) {
            View view = this.aiBorderView;
            Integer aiDisclaimerBorderColor$zendesk_ui_ui_android = state$zendesk_ui_ui_android.getAiDisclaimerBorderColor$zendesk_ui_ui_android();
            view.setBackgroundColor(aiDisclaimerBorderColor$zendesk_ui_ui_android != null ? aiDisclaimerBorderColor$zendesk_ui_ui_android.intValue() : this.aiDisclaimerDefaultTextColor);
            b1 b1Var = this.aiDisclaimerTextColorState;
            Integer aiDisclaimerTextColor$zendesk_ui_ui_android = state$zendesk_ui_ui_android.getAiDisclaimerTextColor$zendesk_ui_ui_android();
            b1Var.setValue(new v(v.b(this.aiDisclaimerTextAlpha, g0.c(aiDisclaimerTextColor$zendesk_ui_ui_android != null ? aiDisclaimerTextColor$zendesk_ui_ui_android.intValue() : this.aiDisclaimerDefaultTextColor))));
            b1 b1Var2 = this.aiDisclaimerImageColorState;
            Integer aiDisclaimerImageColor$zendesk_ui_ui_android = state$zendesk_ui_ui_android.getAiDisclaimerImageColor$zendesk_ui_ui_android();
            b1Var2.setValue(new v(v.b(this.aiDisclaimerIconAlpha, g0.c(aiDisclaimerImageColor$zendesk_ui_ui_android != null ? aiDisclaimerImageColor$zendesk_ui_ui_android.intValue() : this.aiDisclaimerDefaultImageColor))));
            TextView textView = this.messageTextView;
            CharSequence text = textView.getText();
            textView.setContentDescription(((Object) text) + ". " + getResources().getString(R.string.zuia_generated_by_ai));
        }
    }

    private final List<Pair<Integer, Integer>> replaceExistingUrlSpans(SpannableString clickableSpan) {
        URLSpan[] uRLSpanArr = (URLSpan[]) clickableSpan.getSpans(0, clickableSpan.length(), URLSpan.class);
        ArrayList arrayList = new ArrayList();
        uRLSpanArr.getClass();
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = clickableSpan.getSpanStart(uRLSpan);
            int spanEnd = clickableSpan.getSpanEnd(uRLSpan);
            String url = uRLSpan.getURL();
            arrayList.add(new Pair(Integer.valueOf(spanStart), Integer.valueOf(spanEnd)));
            url.getClass();
            replaceUrlSpanWithCustomClickableSpan(clickableSpan, uRLSpan, spanStart, spanEnd, url);
        }
        return arrayList;
    }

    private final void replaceUrlSpanWithCustomClickableSpan(SpannableString clickableSpan, final URLSpan originalSpan, int start, int end, final String url) {
        clickableSpan.removeSpan(originalSpan);
        clickableSpan.setSpan(new ClickableSpan() { // from class: zendesk.ui.android.conversation.textcell.TextCellView.replaceUrlSpanWithCustomClickableSpan.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                view.getClass();
                Function1<String, Unit> onCellTextClicked$zendesk_ui_ui_android = TextCellView.this.rendering.getOnCellTextClicked$zendesk_ui_ui_android();
                if (onCellTextClicked$zendesk_ui_ui_android != null) {
                    onCellTextClicked$zendesk_ui_ui_android.invoke(url);
                } else {
                    originalSpan.onClick(view);
                }
            }
        }, start, end, 33);
    }

    private final void setupHtmlTextSpan() {
        String richTextMessage$zendesk_ui_ui_android = this.rendering.getState().getRichTextMessage$zendesk_ui_ui_android();
        if (richTextMessage$zendesk_ui_ui_android != null) {
            Integer codeBlockTextColor$zendesk_ui_ui_android = this.rendering.getState().getCodeBlockTextColor$zendesk_ui_ui_android();
            Spanned htmlFormatted = RichTextHtmlExtensionsKt.toHtmlFormatted(richTextMessage$zendesk_ui_ui_android, codeBlockTextColor$zendesk_ui_ui_android != null ? Integer.valueOf(ColorExtKt.adjustAlpha(codeBlockTextColor$zendesk_ui_ui_android.intValue(), 0.65f)) : null, this.rendering.getState().getCodeBlockBackgroundColor$zendesk_ui_ui_android());
            if (htmlFormatted != null) {
                this.messageTextView.setText(prepareClickableElements(new SpannableString(htmlFormatted)));
                return;
            }
        }
        setupRegularTextSpan();
    }

    private final void setupMessageBackground() {
        Integer backgroundDrawable$zendesk_ui_ui_android = this.rendering.getState().getBackgroundDrawable$zendesk_ui_ui_android();
        if (backgroundDrawable$zendesk_ui_ui_android != null) {
            Drawable drawable = getContext().getDrawable(backgroundDrawable$zendesk_ui_ui_android.intValue());
            GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
            if (gradientDrawable != null) {
                gradientDrawable.mutate();
            }
            Integer backgroundColor$zendesk_ui_ui_android = this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android();
            if (backgroundColor$zendesk_ui_ui_android != null) {
                int iIntValue = backgroundColor$zendesk_ui_ui_android.intValue();
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(iIntValue);
                }
            }
            setBackground(gradientDrawable);
        }
    }

    private final void setupRegularTextSpan() {
        this.messageTextView.setText(this.rendering.getState().getMessageText$zendesk_ui_ui_android());
        CharSequence text = this.messageTextView.getText();
        SpannableString spannableString = text instanceof SpannableString ? (SpannableString) text : null;
        if (spannableString != null) {
            prepareClickableElements(spannableString);
        }
    }

    private final void updateFocusedBackgroundState(final int textColor) {
        this.messageTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zendesk.ui.android.conversation.textcell.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                TextCellView.updateFocusedBackgroundState$lambda$15(this.f47893a, textColor, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFocusedBackgroundState$lambda$15(TextCellView textCellView, int i11, View view, boolean z11) {
        GradientDrawable gradientDrawableAddBorderToDrawable;
        if (!z11) {
            textCellView.setupMessageBackground();
            return;
        }
        Integer backgroundDrawable$zendesk_ui_ui_android = textCellView.rendering.getState().getBackgroundDrawable$zendesk_ui_ui_android();
        if (backgroundDrawable$zendesk_ui_ui_android != null) {
            gradientDrawableAddBorderToDrawable = ViewKt.addBorderToDrawable(textCellView.messageTextView, backgroundDrawable$zendesk_ui_ui_android.intValue(), R.dimen.zuia_divider_size, i11);
        } else {
            gradientDrawableAddBorderToDrawable = null;
        }
        Integer backgroundColor$zendesk_ui_ui_android = textCellView.rendering.getState().getBackgroundColor$zendesk_ui_ui_android();
        if (backgroundColor$zendesk_ui_ui_android != null) {
            int iIntValue = backgroundColor$zendesk_ui_ui_android.intValue();
            if (gradientDrawableAddBorderToDrawable != null) {
                gradientDrawableAddBorderToDrawable.setColor(iIntValue);
            }
        }
        textCellView.messageTextView.setBackground(gradientDrawableAddBorderToDrawable);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super TextCellRendering, ? extends TextCellRendering> renderingUpdate) {
        int iResolveColorAttr;
        renderingUpdate.getClass();
        TextCellState state$zendesk_ui_ui_android = this.rendering.getState();
        TextCellRendering textCellRendering = (TextCellRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = textCellRendering;
        if (Intrinsics.areEqual(state$zendesk_ui_ui_android, textCellRendering.getState())) {
            return;
        }
        this.messageTextView.setVisibility(this.rendering.getState().getMessageText$zendesk_ui_ui_android().length() > 0 ? 0 : 8);
        if (this.messageTextView.getVisibility() == 0) {
            if (NullabilityKtxKt.isNotNullOrEmpty(this.rendering.getState().getRichTextMessage$zendesk_ui_ui_android())) {
                setupHtmlTextSpan();
            } else {
                setupRegularTextSpan();
            }
        }
        Integer textColor$zendesk_ui_ui_android = this.rendering.getState().getTextColor$zendesk_ui_ui_android();
        if (textColor$zendesk_ui_ui_android != null) {
            iResolveColorAttr = textColor$zendesk_ui_ui_android.intValue();
        } else {
            Context context = getContext();
            context.getClass();
            iResolveColorAttr = ColorExtKt.resolveColorAttr(context, android.R.attr.textColor);
        }
        setupMessageBackground();
        this.messageTextView.setTextColor(iResolveColorAttr);
        this.messageTextView.setLinkTextColor(iResolveColorAttr);
        updateFocusedBackgroundState(iResolveColorAttr);
        this.messageTextView.setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener(600L, new c(this, 0)));
        this.messageTextView.setOnLongClickListener(new View.OnLongClickListener() { // from class: zendesk.ui.android.conversation.textcell.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return TextCellView.render$lambda$3(this.f47892a, view);
            }
        });
        renderActionButtons();
        renderAiDisclaimer();
    }

    public final void setMessageTextGravity$zendesk_ui_ui_android(int gravity) {
        TextView textView = this.messageTextView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = gravity;
        textView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/textcell/TextCellView$Companion;", "", "<init>", "()V", "CODE_BLOCK_TEXT_ALPHA", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextCellView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextCellView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ TextCellView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextCellView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
