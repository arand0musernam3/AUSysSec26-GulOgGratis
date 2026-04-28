package zendesk.ui.android.conversation.actionbutton;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import androidx.vectordrawable.graphics.drawable.c;
import androidx.vectordrawable.graphics.drawable.h;
import com.google.android.material.button.MaterialButton;
import jb.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n20.f;
import n20.m;
import n20.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.a;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lzendesk/ui/android/conversation/actionbutton/ActionButtonView;", "Lcom/google/android/material/button/MaterialButton;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "renderingUpdate", "", "render", "(Lkotlin/jvm/functions/Function1;)V", "stopAnimation$zendesk_ui_ui_android", "()V", "stopAnimation", "Landroidx/vectordrawable/graphics/drawable/h;", "loadingAnimation", "Landroidx/vectordrawable/graphics/drawable/h;", "Landroidx/vectordrawable/graphics/drawable/c;", "animationLoopCallback", "Landroidx/vectordrawable/graphics/drawable/c;", "rendering", "Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering;", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActionButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionButtonView.kt\nzendesk/ui/android/conversation/actionbutton/ActionButtonView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class ActionButtonView extends MaterialButton implements Renderer<ActionButtonRendering> {

    @NotNull
    private static final String WEBVIEW_MESSAGE_ACTION = "WEBVIEW_MESSAGE_ACTION";

    @NotNull
    private final c animationLoopCallback;

    @Nullable
    private final h loadingAnimation;

    @NotNull
    private ActionButtonRendering rendering;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.loadingAnimation = h.a(context, R.drawable.zuia_animation_loading_juggle);
        this.animationLoopCallback = new c() { // from class: zendesk.ui.android.conversation.actionbutton.ActionButtonView$animationLoopCallback$1
            private static final void onAnimationEnd$lambda$0(ActionButtonView actionButtonView) {
                h hVar = actionButtonView.loadingAnimation;
                if (hVar != null) {
                    hVar.start();
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.c
            public void onAnimationEnd(Drawable drawable) {
                drawable.getClass();
                if (this.this$0.rendering.getState().isLoading$zendesk_ui_ui_android()) {
                    onAnimationEnd$lambda$0(this.this$0);
                }
            }
        };
        this.rendering = new ActionButtonRendering();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        render(new o(27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionButtonRendering _init_$lambda$0(ActionButtonRendering actionButtonRendering) {
        actionButtonRendering.getClass();
        return actionButtonRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$3(ActionButtonView actionButtonView) {
        ActionButtonState state$zendesk_ui_ui_android = actionButtonView.rendering.getState();
        String uri$zendesk_ui_ui_android = state$zendesk_ui_ui_android.getUri$zendesk_ui_ui_android();
        if (uri$zendesk_ui_ui_android == null || uri$zendesk_ui_ui_android.length() == 0 || state$zendesk_ui_ui_android.getUrlSource$zendesk_ui_ui_android() == null || Intrinsics.areEqual(state$zendesk_ui_ui_android.getUrlSource$zendesk_ui_ui_android(), WEBVIEW_MESSAGE_ACTION)) {
            String uri$zendesk_ui_ui_android2 = state$zendesk_ui_ui_android.getUri$zendesk_ui_ui_android();
            if (uri$zendesk_ui_ui_android2 == null || uri$zendesk_ui_ui_android2.length() == 0 || !Intrinsics.areEqual(state$zendesk_ui_ui_android.getUrlSource$zendesk_ui_ui_android(), WEBVIEW_MESSAGE_ACTION) || !URLUtil.isValidUrl(state$zendesk_ui_ui_android.getUri$zendesk_ui_ui_android())) {
                String actionId$zendesk_ui_ui_android = state$zendesk_ui_ui_android.getActionId$zendesk_ui_ui_android();
                if (actionId$zendesk_ui_ui_android != null && actionId$zendesk_ui_ui_android.length() != 0) {
                    actionButtonView.rendering.getOnPostbackButtonClicked$zendesk_ui_ui_android().invoke(state$zendesk_ui_ui_android.getActionId$zendesk_ui_ui_android(), state$zendesk_ui_ui_android.getText$zendesk_ui_ui_android());
                }
            } else {
                actionButtonView.rendering.getOnWebViewActionButtonClicked().invoke(state$zendesk_ui_ui_android.getUri$zendesk_ui_ui_android(), state$zendesk_ui_ui_android.getSize$zendesk_ui_ui_android(), state$zendesk_ui_ui_android.getUrlSource$zendesk_ui_ui_android(), state$zendesk_ui_ui_android.getSourceType$zendesk_ui_ui_android());
            }
        } else {
            actionButtonView.rendering.getOnActionButtonClicked().invoke(state$zendesk_ui_ui_android.getUri$zendesk_ui_ui_android(), state$zendesk_ui_ui_android.getUrlSource$zendesk_ui_ui_android(), state$zendesk_ui_ui_android.getSourceType$zendesk_ui_ui_android());
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$5$lambda$4(ActionButtonView actionButtonView, int i11) {
        actionButtonView.loadingAnimation.setColorFilter(u.A(i11, a.SRC_ATOP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$7(ActionButtonView actionButtonView, int i11, float f11) {
        if (actionButtonView.getLineCount() >= i11) {
            m mVar = new m();
            m mVar2 = new m();
            m mVar3 = new m();
            m mVar4 = new m();
            n20.a aVar = new n20.a(0.0f);
            n20.a aVar2 = new n20.a(0.0f);
            n20.a aVar3 = new n20.a(0.0f);
            n20.a aVar4 = new n20.a(0.0f);
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            n nVar = new n();
            nVar.f30376a = mVar;
            nVar.f30377b = mVar2;
            nVar.f30378c = mVar3;
            nVar.f30379d = mVar4;
            nVar.f30380e = aVar;
            nVar.f30381f = aVar2;
            nVar.f30382g = aVar3;
            nVar.f30383h = aVar4;
            nVar.f30384i = fVar;
            nVar.f30385j = fVar2;
            nVar.f30386k = fVar3;
            nVar.l = fVar4;
            nVar.b(f11);
            actionButtonView.setShapeAppearanceModel(nVar.a());
        }
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ActionButtonRendering, ? extends ActionButtonRendering> renderingUpdate) {
        int iResolveColorAttr;
        renderingUpdate.getClass();
        ActionButtonRendering actionButtonRendering = (ActionButtonRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = actionButtonRendering;
        setText(actionButtonRendering.getState().isLoading$zendesk_ui_ui_android() ? "" : this.rendering.getState().getText$zendesk_ui_ui_android());
        Integer backgroundColor$zendesk_ui_ui_android = this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android();
        if (backgroundColor$zendesk_ui_ui_android != null) {
            iResolveColorAttr = backgroundColor$zendesk_ui_ui_android.intValue();
        } else {
            Context context = getContext();
            context.getClass();
            iResolveColorAttr = ColorExtKt.resolveColorAttr(context, com.app.tgtg.R.attr.colorAccent);
        }
        setBackgroundColor(iResolveColorAttr);
        Integer textColor$zendesk_ui_ui_android = this.rendering.getState().getTextColor$zendesk_ui_ui_android();
        if (textColor$zendesk_ui_ui_android != null) {
            setTextColor(textColor$zendesk_ui_ui_android.intValue());
        }
        int i11 = 1;
        if (this.rendering.getState().isSupported$zendesk_ui_ui_android()) {
            setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener$default(0L, new y.a(this, 26), 1, null));
            if (this.loadingAnimation == null) {
                return;
            }
            Integer loadingColor$zendesk_ui_ui_android = this.rendering.getState().getLoadingColor$zendesk_ui_ui_android();
            if (loadingColor$zendesk_ui_ui_android != null) {
                post(new b0.h(this, loadingColor$zendesk_ui_ui_android.intValue(), 9));
            }
            if (this.rendering.getState().isLoading$zendesk_ui_ui_android()) {
                setMinimumWidth(getWidth());
                setContentDescription(getResources().getString(R.string.zuia_accessibility_loading_label));
                setIcon(this.loadingAnimation);
                this.loadingAnimation.b(this.animationLoopCallback);
                this.loadingAnimation.start();
            } else {
                setMinimumWidth(0);
                setTextScaleX(1.0f);
                setContentDescription(null);
                setIcon(null);
                this.loadingAnimation.setCallback(null);
                this.loadingAnimation.stop();
            }
        } else {
            setClickable(false);
        }
        TypedValue typedValue = new TypedValue();
        getContext().getResources().getValue(R.dimen.zuia_carousel_button_corner_size, typedValue, true);
        post(new zendesk.ui.android.common.button.a(this, getResources().getInteger(R.integer.zuia_button_line_count), typedValue.getFloat(), i11));
    }

    public final void stopAnimation$zendesk_ui_ui_android() {
        h hVar = this.loadingAnimation;
        if (hVar != null) {
            hVar.setCallback(null);
        }
        h hVar2 = this.loadingAnimation;
        if (hVar2 != null) {
            hVar2.stop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/actionbutton/ActionButtonView$Companion;", "", "<init>", "()V", ActionButtonView.WEBVIEW_MESSAGE_ACTION, "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ActionButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R.attr.actionButtonStyle : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
