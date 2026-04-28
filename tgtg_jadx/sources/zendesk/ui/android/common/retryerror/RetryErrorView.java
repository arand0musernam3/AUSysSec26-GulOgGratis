package zendesk.ui.android.common.retryerror;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y.a;
import zendesk.core.ui.android.internal.xml.AccessibilityExtKt;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015H\u0016R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/common/retryerror/RetryErrorView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/common/retryerror/RetryErrorRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rendering", "retryContainer", "Landroid/widget/LinearLayout;", "retryText", "Landroid/widget/TextView;", "retryButton", "render", "", "renderingUpdate", "Lkotlin/Function1;", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRetryErrorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetryErrorView.kt\nzendesk/ui/android/common/retryerror/RetryErrorView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class RetryErrorView extends FrameLayout implements Renderer<RetryErrorRendering> {
    private static final long ACCESSIBILITY_EVENT_DELAY = 500;

    @NotNull
    private RetryErrorRendering rendering;

    @NotNull
    private final TextView retryButton;

    @NotNull
    private final LinearLayout retryContainer;

    @NotNull
    private final TextView retryText;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryErrorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.rendering = new RetryErrorRendering();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_ConversationsListRetryErrorStyle, false);
        View.inflate(context, R.layout.zuia_view_retry_error_view, this);
        View viewFindViewById = findViewById(R.id.zuia_error_view);
        viewFindViewById.getClass();
        this.retryContainer = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_error_retry_message_text);
        viewFindViewById2.getClass();
        this.retryText = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_error_retry_button);
        TextView textView = (TextView) viewFindViewById3;
        textView.getClass();
        AccessibilityExtKt.overrideAccessibilityNodeClassNameInfo(textView, Button.class.getName());
        viewFindViewById3.getClass();
        this.retryButton = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(RetryErrorView retryErrorView) {
        retryErrorView.rendering.getOnButtonClicked$zendesk_ui_ui_android().invoke();
        return Unit.f26487a;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super RetryErrorRendering, ? extends RetryErrorRendering> renderingUpdate) {
        renderingUpdate.getClass();
        this.rendering = (RetryErrorRendering) renderingUpdate.invoke(this.rendering);
        this.retryContainer.setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener$default(0L, new a(this, 25), 1, null));
        this.retryButton.setTextColor(this.rendering.getState().getRetryButtonTextColor$zendesk_ui_ui_android());
        this.retryButton.setText(this.rendering.getState().getRetryButtonText$zendesk_ui_ui_android());
        Drawable drawable = getContext().getDrawable(R.drawable.zuia_reload_icon);
        int retryButtonTextColor$zendesk_ui_ui_android = this.rendering.getState().getRetryButtonTextColor$zendesk_ui_ui_android();
        if (drawable != null) {
            drawable.setTint(retryButtonTextColor$zendesk_ui_ui_android);
            this.retryButton.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        this.retryText.setTextColor(this.rendering.getState().getRetryMessageTextColor$zendesk_ui_ui_android());
        this.retryText.setText(this.rendering.getState().getRetryMessageText$zendesk_ui_ui_android());
        LinearLayout linearLayout = this.retryContainer;
        Context context = getContext();
        context.getClass();
        AccessibilityExtKt.postDelayRequestFocusByAccessibilityEventWhenAccessibilityRunning(linearLayout, context, ACCESSIBILITY_EVENT_DELAY);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/common/retryerror/RetryErrorView$Companion;", "", "<init>", "()V", "ACCESSIBILITY_EVENT_DELAY", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RetryErrorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ RetryErrorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RetryErrorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
