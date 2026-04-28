package zendesk.ui.android.conversation.bottomsheet;

import a90.d;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tx.o0;
import v80.b0;
import v80.f0;
import v80.p0;
import zendesk.core.ui.android.internal.xml.AccessibilityExtKt;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.articleviewer.b;
import zendesk.ui.android.internal.ColorExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/conversation/bottomsheet/BottomSheetView;", "Lcom/google/android/material/bottomsheet/l;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "showBottomSheet", "()V", "clearCoroutines", "Lkotlin/Function1;", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "onDetachedFromWindow", "dismiss", "rendering", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering;", "Landroid/widget/LinearLayout;", "container", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "messageText", "Landroid/widget/TextView;", "actionText", "Lv80/b0;", "coroutineScope", "Lv80/b0;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BottomSheetView extends l implements Renderer<BottomSheetRendering> {
    public static final int $stable = 8;

    @Nullable
    private final TextView actionText;

    @Nullable
    private final LinearLayout container;

    @Nullable
    private b0 coroutineScope;

    @Nullable
    private final TextView messageText;

    @NotNull
    private BottomSheetRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetView(@NotNull Context context) {
        super(context);
        context.getClass();
        this.rendering = new BottomSheetRendering();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_BottomSheetStyle, false);
        setContentView(R.layout.zuia_bottom_sheet_view);
        this.container = (LinearLayout) findViewById(R.id.zuia_bottom_sheet_container);
        this.messageText = (TextView) findViewById(R.id.zuia_bottom_sheet_message_text);
        this.actionText = (TextView) findViewById(R.id.zuia_bottom_sheet_actions_text);
        render(new b(8));
        setCancelable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetRendering _init_$lambda$0(BottomSheetRendering bottomSheetRendering) {
        bottomSheetRendering.getClass();
        return bottomSheetRendering;
    }

    private final void clearCoroutines() {
        b0 b0Var = this.coroutineScope;
        if (b0Var != null) {
            f0.j(b0Var, null);
        }
        this.coroutineScope = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$3$lambda$1(BottomSheetView bottomSheetView, View view) {
        bottomSheetView.rendering.getOnBottomSheetActionClicked$zendesk_ui_ui_android().invoke();
        bottomSheetView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$3$lambda$2(BottomSheetView bottomSheetView, DialogInterface dialogInterface) {
        bottomSheetView.rendering.getOnBottomSheetDismissed$zendesk_ui_ui_android().invoke();
    }

    private final void showBottomSheet() {
        if (isShowing()) {
            return;
        }
        show();
        d dVarB = f0.b(p0.f42144a);
        f0.B(dVarB, null, null, new BottomSheetView$showBottomSheet$1$1(this, null), 3);
        this.coroutineScope = dVarB;
    }

    @Override // k.y, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        clearCoroutines();
    }

    @Override // com.google.android.material.bottomsheet.l, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearCoroutines();
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super BottomSheetRendering, ? extends BottomSheetRendering> renderingUpdate) {
        int iResolveColorAttr;
        int iResolveColorAttr2;
        int iResolveColorAttr3;
        renderingUpdate.getClass();
        BottomSheetRendering bottomSheetRendering = (BottomSheetRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = bottomSheetRendering;
        BottomSheetState state$zendesk_ui_ui_android = bottomSheetRendering.getState();
        Integer backgroundColor$zendesk_ui_ui_android = state$zendesk_ui_ui_android.getBackgroundColor$zendesk_ui_ui_android();
        if (backgroundColor$zendesk_ui_ui_android != null) {
            iResolveColorAttr = backgroundColor$zendesk_ui_ui_android.intValue();
        } else {
            Context context = getContext();
            context.getClass();
            iResolveColorAttr = ColorExtKt.resolveColorAttr(context, R.attr.bottomSheetBackgroundColor);
        }
        Integer messageTextColor$zendesk_ui_ui_android = state$zendesk_ui_ui_android.getMessageTextColor$zendesk_ui_ui_android();
        if (messageTextColor$zendesk_ui_ui_android != null) {
            iResolveColorAttr2 = messageTextColor$zendesk_ui_ui_android.intValue();
        } else {
            Context context2 = getContext();
            context2.getClass();
            iResolveColorAttr2 = ColorExtKt.resolveColorAttr(context2, R.attr.bottomSheetMessageTextColor);
        }
        Integer actionTextColor$zendesk_ui_ui_android = state$zendesk_ui_ui_android.getActionTextColor$zendesk_ui_ui_android();
        if (actionTextColor$zendesk_ui_ui_android != null) {
            iResolveColorAttr3 = actionTextColor$zendesk_ui_ui_android.intValue();
        } else {
            Context context3 = getContext();
            context3.getClass();
            iResolveColorAttr3 = ColorExtKt.resolveColorAttr(context3, R.attr.bottomSheetActionTextColor);
        }
        LinearLayout linearLayout = this.container;
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(iResolveColorAttr);
        }
        TextView textView = this.messageText;
        if (textView != null) {
            textView.setText(state$zendesk_ui_ui_android.getMessageText$zendesk_ui_ui_android());
        }
        TextView textView2 = this.messageText;
        if (textView2 != null) {
            textView2.setTextColor(iResolveColorAttr2);
        }
        TextView textView3 = this.actionText;
        if (textView3 != null) {
            textView3.setText(state$zendesk_ui_ui_android.getActionText$zendesk_ui_ui_android());
        }
        TextView textView4 = this.actionText;
        if (textView4 != null) {
            textView4.setTextColor(iResolveColorAttr3);
        }
        TextView textView5 = this.actionText;
        if (textView5 != null) {
            AccessibilityExtKt.overrideAccessibilityNodeClassNameInfo(textView5, Button.class.getName());
        }
        TextView textView6 = this.actionText;
        if (textView6 != null) {
            textView6.setOnClickListener(new a(this, 0));
        }
        setOnCancelListener(new o0(this, 1));
        if (state$zendesk_ui_ui_android.getShowBottomSheet$zendesk_ui_ui_android()) {
            showBottomSheet();
        }
    }
}
