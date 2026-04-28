package com.braze.ui.inappmessage;

import a40.l;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.y;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import h7.h2;
import h7.p1;
import h7.r1;
import h7.s1;
import h7.t1;
import h7.u1;
import h7.v1;
import h7.w1;
import h7.x1;
import j4.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 z2\u00020\u0001:\u0001zBe\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010\u0019J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010\u0019J'\u0010.\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bH\u0010GR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u00109\u001a\u0004\bI\u0010;\"\u0004\bJ\u0010KR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\bQ\u0010;\"\u0004\bR\u0010KR\"\u0010S\u001a\u00020)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bS\u0010U\"\u0004\bV\u0010,R$\u0010X\u001a\u0004\u0018\u00010W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010^\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u00109\u001a\u0004\b_\u0010;\"\u0004\b`\u0010KR>\u0010d\u001a\u001e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020b0aj\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020b`c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010j\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010q\u001a\u0004\u0018\u00010p8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010y¨\u0006{"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "Landroid/view/View;", "inAppMessageView", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Landroid/view/animation/Animation;", "openingAnimation", "closingAnimation", "clickableInAppMessageView", "", "buttonViews", "closeButton", "<init>", "(Landroid/view/View;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)V", "Landroid/app/Activity;", "activity", "", "open", "(Landroid/app/Activity;)V", "close", "()V", "Landroid/view/ViewGroup;", "getParentViewGroup", "(Landroid/app/Activity;)Landroid/view/ViewGroup;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "(Lcom/braze/models/inappmessage/IInAppMessage;)Landroid/view/ViewGroup$LayoutParams;", "parentViewGroup", "addInAppMessageViewToViewGroup", "(Landroid/view/ViewGroup;Lcom/braze/models/inappmessage/IInAppMessage;Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;)V", "Landroid/view/View$OnClickListener;", "createClickListener", "()Landroid/view/View$OnClickListener;", "createButtonClickListeners", "createCloseInAppMessageClickListener", "addDismissRunnable", "", "opening", "setAndStartAnimation", "(Z)V", "closeInAppMessageView", "finalizeViewBeforeDisplay", "(Lcom/braze/models/inappmessage/IInAppMessage;Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;)V", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "createDismissCallbacks", "()Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "createTouchAwareListener", "()Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "Landroid/view/animation/Animation$AnimationListener;", "createAnimationListener", "(Z)Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/View;", "getInAppMessageView", "()Landroid/view/View;", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "getInAppMessageViewLifecycleListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "Landroid/view/animation/Animation;", "getOpeningAnimation", "()Landroid/view/animation/Animation;", "getClosingAnimation", "getClickableInAppMessageView", "setClickableInAppMessageView", "(Landroid/view/View;)V", "Ljava/util/List;", "getButtonViews", "()Ljava/util/List;", "setButtonViews", "(Ljava/util/List;)V", "getCloseButton", "setCloseButton", "isAnimatingClose", "Z", "()Z", "setAnimatingClose", "Ljava/lang/Runnable;", "dismissRunnable", "Ljava/lang/Runnable;", "getDismissRunnable", "()Ljava/lang/Runnable;", "setDismissRunnable", "(Ljava/lang/Runnable;)V", "previouslyFocusedView", "getPreviouslyFocusedView", "setPreviouslyFocusedView", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "viewAccessibilityFlagMap", "Ljava/util/HashMap;", "getViewAccessibilityFlagMap", "()Ljava/util/HashMap;", "setViewAccessibilityFlagMap", "(Ljava/util/HashMap;)V", "contentViewGroupParentLayout", "Landroid/view/ViewGroup;", "getContentViewGroupParentLayout", "()Landroid/view/ViewGroup;", "setContentViewGroupParentLayout", "(Landroid/view/ViewGroup;)V", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "getOnBackInvokedCallback", "()Landroid/window/OnBackInvokedCallback;", "setOnBackInvokedCallback", "(Landroid/window/OnBackInvokedCallback;)V", "Landroidx/activity/y;", "onBackPressedDispatcherFallbackCallback", "Landroidx/activity/y;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultInAppMessageViewWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultInAppMessageViewWrapper.kt\ncom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,578:1\n1872#2,3:579\n*S KotlinDebug\n*F\n+ 1 DefaultInAppMessageViewWrapper.kt\ncom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper\n*L\n361#1:579,3\n*E\n"})
public class DefaultInAppMessageViewWrapper implements IInAppMessageViewWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<? extends View> buttonViews;

    @Nullable
    private View clickableInAppMessageView;

    @Nullable
    private View closeButton;

    @Nullable
    private final Animation closingAnimation;

    @NotNull
    private final BrazeConfigurationProvider configurationProvider;

    @Nullable
    private ViewGroup contentViewGroupParentLayout;

    @Nullable
    private Runnable dismissRunnable;

    @NotNull
    private final IInAppMessage inAppMessage;

    @NotNull
    private final View inAppMessageView;

    @NotNull
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener;
    private boolean isAnimatingClose;

    @Nullable
    private OnBackInvokedCallback onBackInvokedCallback;

    @Nullable
    private y onBackPressedDispatcherFallbackCallback;

    @Nullable
    private final Animation openingAnimation;

    @Nullable
    private View previouslyFocusedView;

    @NotNull
    private HashMap<Integer, Integer> viewAccessibilityFlagMap;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$open$2", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewOnLayoutChangeListenerC01502 implements View.OnLayoutChangeListener {
        final /* synthetic */ ViewGroup $parentViewGroup;
        final /* synthetic */ DefaultInAppMessageViewWrapper this$0;

        public ViewOnLayoutChangeListenerC01502(ViewGroup viewGroup, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
            this.$parentViewGroup = viewGroup;
            this.this$0 = defaultInAppMessageViewWrapper;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onLayoutChange$lambda$0(int i11, int i12) {
            return k.h(i11 - i12, "Detected (bottom - top) of ", " in OnLayoutChangeListener");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLayoutChange$lambda$1(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, ViewGroup viewGroup) {
            defaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup(viewGroup, defaultInAppMessageViewWrapper.getInAppMessage(), defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener());
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.getClass();
            this.$parentViewGroup.removeOnLayoutChangeListener(this);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.b(bottom, top, 1), 7, (Object) null);
            this.$parentViewGroup.removeView(this.this$0.getInAppMessageView());
            ViewGroup viewGroup = this.$parentViewGroup;
            viewGroup.post(new l(29, this.this$0, viewGroup));
        }
    }

    public DefaultInAppMessageViewWrapper(@NotNull View view, @NotNull IInAppMessage iInAppMessage, @NotNull IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, @NotNull BrazeConfigurationProvider brazeConfigurationProvider, @Nullable Animation animation, @Nullable Animation animation2, @Nullable View view2, @Nullable List<? extends View> list, @Nullable View view3) {
        view.getClass();
        iInAppMessage.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        brazeConfigurationProvider.getClass();
        this.inAppMessageView = view;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageViewLifecycleListener = iInAppMessageViewLifecycleListener;
        this.configurationProvider = brazeConfigurationProvider;
        this.openingAnimation = animation;
        this.closingAnimation = animation2;
        this.clickableInAppMessageView = view2;
        this.buttonViews = list;
        this.closeButton = view3;
        this.viewAccessibilityFlagMap = new HashMap<>();
        View clickableInAppMessageView = getClickableInAppMessageView();
        setClickableInAppMessageView(clickableInAppMessageView == null ? getInAppMessageView() : clickableInAppMessageView);
        if (getInAppMessage() instanceof InAppMessageSlideup) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(getInAppMessageView(), createDismissCallbacks());
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            View clickableInAppMessageView2 = getClickableInAppMessageView();
            if (clickableInAppMessageView2 != null) {
                clickableInAppMessageView2.setOnTouchListener(touchAwareSwipeDismissTouchListener);
            }
        }
        View clickableInAppMessageView3 = getClickableInAppMessageView();
        if (clickableInAppMessageView3 != null) {
            clickableInAppMessageView3.setOnClickListener(createClickListener());
        }
        View closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        createButtonClickListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDismissRunnable$lambda$23() {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat addInAppMessageViewToViewGroup$lambda$12(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(14), 7, (Object) null);
        if (windowInsetsCompat == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(21), 7, (Object) null);
            return new WindowInsetsCompat(windowInsetsCompat);
        }
        view.getClass();
        IInAppMessageView iInAppMessageView = (IInAppMessageView) view;
        if (iInAppMessageView.getHasAppliedWindowInsets()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(24), 7, (Object) null);
            return windowInsetsCompat;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d(23), 6, (Object) null);
        iInAppMessageView.applyWindowInsets(windowInsetsCompat);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$12$lambda$10() {
        return "Calling applyWindowInsets on in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$12$lambda$11() {
        return "Not reapplying window insets to in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$12$lambda$8() {
        return "In-app message view received window insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$12$lambda$9() {
        return "Window insets were null, so not applying window insets to in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$13() {
        return "Requesting to apply insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$14() {
        return "In-app message view will animate into the visible area.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$15() {
        return "In-app message view will be placed instantly into the visible area.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$6() {
        return "Adding In-app message view to parent view group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$7(int i11) {
        return k.h(i11, "Adding status bar height of ", " padding to in-app message view.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String close$lambda$3() {
        return "Closing in-app message view wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String close$lambda$5$lambda$4() {
        return "Unregistering iam back invoked callback";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$24() {
        return "Closing in-app message view";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$25(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
        return "Returning focus to view after closing message. View: " + defaultInAppMessageViewWrapper.getPreviouslyFocusedView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$26() {
        return "Failed to request focus on previous view";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createButtonClickListeners$lambda$21$lambda$17() {
        return "Cannot create button click listener since this in-app message does not have message buttons.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButtonClickListeners$lambda$21$lambda$20$lambda$19$lambda$18(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, MessageButton messageButton, IInAppMessageImmersive iInAppMessageImmersive, View view) {
        defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onButtonClicked(messageButton, iInAppMessageImmersive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createClickListener$lambda$16(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view) {
        List<MessageButton> messageButtons;
        IInAppMessage inAppMessage = defaultInAppMessageViewWrapper.getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if ((iInAppMessageImmersive == null || (messageButtons = iInAppMessageImmersive.getMessageButtons()) == null || !messageButtons.isEmpty()) && (defaultInAppMessageViewWrapper.getInAppMessage() instanceof IInAppMessageImmersive)) {
            return;
        }
        defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onClicked(defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCloseInAppMessageClickListener$lambda$22(View view) {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String open$lambda$0() {
        return "Opening in-app message view wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String open$lambda$1(int i11) {
        return s.f(i11, "Detected root view height of ");
    }

    public void addDismissRunnable() {
        if (getDismissRunnable() == null) {
            setDismissRunnable(new bx.c(8));
            getInAppMessageView().postDelayed(getDismissRunnable(), getInAppMessage().getDurationInMilliseconds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addInAppMessageViewToViewGroup(@NotNull ViewGroup parentViewGroup, @NotNull IInAppMessage inAppMessage, @NotNull View inAppMessageView, @NotNull IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        parentViewGroup.getClass();
        inAppMessage.getClass();
        inAppMessageView.getClass();
        inAppMessageViewLifecycleListener.getClass();
        inAppMessageViewLifecycleListener.beforeOpened(inAppMessageView, inAppMessage);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(27), 7, (Object) null);
        parentViewGroup.addView(inAppMessageView, getLayoutParams(inAppMessage));
        if (inAppMessageView instanceof IInAppMessageView) {
            if (getConfigurationProvider().getShouldAddStatusBarPaddingToInAppMessages()) {
                Context context = inAppMessageView.getContext();
                context.getClass();
                int statusBarHeight = ViewUtils.getStatusBarHeight(context);
                int i11 = Build.VERSION.SDK_INT;
                x1 w1Var = i11 >= 36 ? new w1() : i11 >= 35 ? new v1() : i11 >= 34 ? new u1() : i11 >= 31 ? new t1() : i11 >= 30 ? new s1() : i11 >= 29 ? new r1() : new p1();
                w1Var.d(h2.h(), x6.d.b(0, statusBarHeight, 0, 0));
                WindowInsetsCompat windowInsetsCompatB = w1Var.b();
                windowInsetsCompatB.getClass();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(statusBarHeight, 9), 7, (Object) null);
                ((IInAppMessageView) inAppMessageView).applyWindowInsets(windowInsetsCompatB);
            } else {
                ViewCompat.k0(parentViewGroup, new a50.d(5, this, inAppMessageView));
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(15), 7, (Object) null);
                ViewCompat.Z(parentViewGroup);
            }
        }
        if (inAppMessage.getAnimateIn()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(16), 7, (Object) null);
            setAndStartAnimation(true);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(17), 7, (Object) null);
            if (inAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
                addDismissRunnable();
            }
            finalizeViewBeforeDisplay(inAppMessage, inAppMessageView, inAppMessageViewLifecycleListener);
        }
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void close() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(18), 7, (Object) null);
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            INSTANCE.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedCallback = getOnBackInvokedCallback()) != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(19), 7, (Object) null);
            Activity activity = BrazeInAppMessageManager.INSTANCE.getInstance().getActivity();
            if (activity != null && (onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            }
        }
        getInAppMessageView().removeCallbacks(getDismissRunnable());
        getInAppMessageViewLifecycleListener().beforeClosed(getInAppMessageView(), getInAppMessage());
        if (!getInAppMessage().getAnimateOut()) {
            closeInAppMessageView();
        } else {
            setAnimatingClose(true);
            setAndStartAnimation(false);
        }
    }

    public void closeInAppMessageView() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(25), 7, (Object) null);
        ViewUtils.removeViewFromParent(getInAppMessageView());
        View inAppMessageView = getInAppMessageView();
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = inAppMessageView instanceof InAppMessageHtmlBaseView ? (InAppMessageHtmlBaseView) inAppMessageView : null;
        if (inAppMessageHtmlBaseView != null) {
            inAppMessageHtmlBaseView.finishWebViewDisplay();
        }
        if (getPreviouslyFocusedView() != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new aa.e(this, 28), 7, (Object) null);
            try {
                View previouslyFocusedView = getPreviouslyFocusedView();
                if (previouslyFocusedView != null) {
                    previouslyFocusedView.requestFocus();
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new d(26), 4, (Object) null);
            }
        }
        getInAppMessageViewLifecycleListener().afterClosed(getInAppMessage());
    }

    @NotNull
    public Animation.AnimationListener createAnimationListener(boolean opening) {
        return opening ? new AnonymousClass1() : new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createAnimationListener.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().clearAnimation();
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().setVisibility(8);
                DefaultInAppMessageViewWrapper.this.closeInAppMessageView();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
    }

    public void createButtonClickListeners() {
        IInAppMessage inAppMessage = getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if (iInAppMessageImmersive != null) {
            if (iInAppMessageImmersive.getMessageButtons().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(20), 7, (Object) null);
                return;
            }
            List<View> buttonViews = getButtonViews();
            if (buttonViews != null) {
                int i11 = 0;
                for (Object obj : buttonViews) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        d0.n();
                        throw null;
                    }
                    View view = (View) obj;
                    MessageButton messageButton = (MessageButton) CollectionsKt.Q(i11, iInAppMessageImmersive.getMessageButtons());
                    if (messageButton != null) {
                        view.setOnClickListener(new com.braze.ui.contentcards.view.a(this, messageButton, iInAppMessageImmersive, 1));
                    }
                    i11 = i12;
                }
            }
        }
    }

    @NotNull
    public View.OnClickListener createClickListener() {
        return new ax.s(this, 12);
    }

    @NotNull
    public View.OnClickListener createCloseInAppMessageClickListener() {
        return new f(0);
    }

    @NotNull
    public SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks() {
        return new SwipeDismissTouchListener.DismissCallbacks() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createDismissCallbacks.1
            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public boolean canDismiss(Object token) {
                return true;
            }

            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public void onDismiss(View view, Object token) {
                view.getClass();
                DefaultInAppMessageViewWrapper.this.getInAppMessage().setAnimateOut(false);
                BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    @NotNull
    public TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener() {
        return new TouchAwareSwipeDismissTouchListener.ITouchListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createTouchAwareListener.1
            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchEnded() {
            }

            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchStartedOrContinued() {
            }
        };
    }

    public void finalizeViewBeforeDisplay(@NotNull IInAppMessage inAppMessage, @NotNull View inAppMessageView, @NotNull IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        inAppMessage.getClass();
        inAppMessageView.getClass();
        inAppMessageViewLifecycleListener.getClass();
        if (ViewUtils.isDeviceNotInTouchMode(inAppMessageView)) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
            }
        } else {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
        }
        inAppMessageViewLifecycleListener.afterOpened(inAppMessageView, inAppMessage);
    }

    @Nullable
    public List<View> getButtonViews() {
        return this.buttonViews;
    }

    @Nullable
    public View getClickableInAppMessageView() {
        return this.clickableInAppMessageView;
    }

    @Nullable
    public View getCloseButton() {
        return this.closeButton;
    }

    @Nullable
    public Animation getClosingAnimation() {
        return this.closingAnimation;
    }

    @NotNull
    public BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    @Nullable
    public ViewGroup getContentViewGroupParentLayout() {
        return this.contentViewGroupParentLayout;
    }

    @Nullable
    public Runnable getDismissRunnable() {
        return this.dismissRunnable;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    @NotNull
    public IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    @NotNull
    public View getInAppMessageView() {
        return this.inAppMessageView;
    }

    @NotNull
    public IInAppMessageViewLifecycleListener getInAppMessageViewLifecycleListener() {
        return this.inAppMessageViewLifecycleListener;
    }

    @NotNull
    public ViewGroup.LayoutParams getLayoutParams(@Nullable IInAppMessage inAppMessage) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (inAppMessage instanceof InAppMessageSlideup) {
            layoutParams.gravity = ((InAppMessageSlideup) inAppMessage).getSlideFrom() == SlideFrom.TOP ? 48 : 80;
        }
        return layoutParams;
    }

    @Nullable
    public OnBackInvokedCallback getOnBackInvokedCallback() {
        return this.onBackInvokedCallback;
    }

    @Nullable
    public Animation getOpeningAnimation() {
        return this.openingAnimation;
    }

    @NotNull
    public ViewGroup getParentViewGroup(@NotNull Activity activity) {
        activity.getClass();
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
        viewFindViewById.getClass();
        return (ViewGroup) viewFindViewById;
    }

    @Nullable
    public View getPreviouslyFocusedView() {
        return this.previouslyFocusedView;
    }

    @NotNull
    public HashMap<Integer, Integer> getViewAccessibilityFlagMap() {
        return this.viewAccessibilityFlagMap;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    /* JADX INFO: renamed from: isAnimatingClose, reason: from getter */
    public boolean getIsAnimatingClose() {
        return this.isAnimatingClose;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void open(@NotNull Activity activity) {
        activity.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d(22), 6, (Object) null);
        ViewGroup parentViewGroup = getParentViewGroup(activity);
        int height = parentViewGroup.getHeight();
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            setContentViewGroupParentLayout(parentViewGroup);
            getViewAccessibilityFlagMap().clear();
            INSTANCE.setAllViewGroupChildrenAsNonAccessibilityImportant(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        setPreviouslyFocusedView(activity.getCurrentFocus());
        if (height == 0) {
            parentViewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC01502(parentViewGroup, this));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(height, 10), 7, (Object) null);
            addInAppMessageViewToViewGroup(parentViewGroup, getInAppMessage(), getInAppMessageView(), getInAppMessageViewLifecycleListener());
        }
        BrazeInAppMessageManager.Companion companion = BrazeInAppMessageManager.INSTANCE;
        if (companion.getInstance().getDoesBackButtonDismissInAppMessageViewField() && Build.VERSION.SDK_INT >= 33) {
            DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1 defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1 = new DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1(activity);
            activity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1);
            setOnBackInvokedCallback(defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1);
        }
        ComponentActivity componentActivity = activity instanceof ComponentActivity ? (ComponentActivity) activity : null;
        if (componentActivity == null || !companion.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            return;
        }
        DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 defaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 = new DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1();
        componentActivity.getOnBackPressedDispatcher().a(defaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1);
        this.onBackPressedDispatcherFallbackCallback = defaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1;
    }

    public void setAndStartAnimation(boolean opening) {
        Animation openingAnimation = opening ? getOpeningAnimation() : getClosingAnimation();
        if (openingAnimation != null) {
            openingAnimation.setAnimationListener(createAnimationListener(opening));
        }
        getInAppMessageView().clearAnimation();
        getInAppMessageView().setAnimation(openingAnimation);
        if (openingAnimation != null) {
            openingAnimation.startNow();
        }
        getInAppMessageView().invalidate();
    }

    public void setAnimatingClose(boolean z11) {
        this.isAnimatingClose = z11;
    }

    public void setButtonViews(@Nullable List<? extends View> list) {
        this.buttonViews = list;
    }

    public void setClickableInAppMessageView(@Nullable View view) {
        this.clickableInAppMessageView = view;
    }

    public void setCloseButton(@Nullable View view) {
        this.closeButton = view;
    }

    public void setContentViewGroupParentLayout(@Nullable ViewGroup viewGroup) {
        this.contentViewGroupParentLayout = viewGroup;
    }

    public void setDismissRunnable(@Nullable Runnable runnable) {
        this.dismissRunnable = runnable;
    }

    public void setOnBackInvokedCallback(@Nullable OnBackInvokedCallback onBackInvokedCallback) {
        this.onBackInvokedCallback = onBackInvokedCallback;
    }

    public void setPreviouslyFocusedView(@Nullable View view) {
        this.previouslyFocusedView = view;
    }

    public void setViewAccessibilityFlagMap(@NotNull HashMap<Integer, Integer> map) {
        map.getClass();
        this.viewAccessibilityFlagMap = map;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tJ$\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f¨\u0006\r"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$Companion;", "", "<init>", "()V", "setAllViewGroupChildrenAsNonAccessibilityImportant", "", "viewGroup", "Landroid/view/ViewGroup;", "viewAccessibilityFlagMap", "", "", "resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$lambda$1() {
            return "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setAllViewGroupChildrenAsNonAccessibilityImportant$lambda$0() {
            return "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.";
        }

        public final void resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(@Nullable ViewGroup viewGroup, @NotNull Map<Integer, Integer> viewAccessibilityFlagMap) {
            viewAccessibilityFlagMap.getClass();
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new d(29), 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    int id2 = childAt.getId();
                    if (viewAccessibilityFlagMap.containsKey(Integer.valueOf(id2))) {
                        Integer num = viewAccessibilityFlagMap.get(Integer.valueOf(id2));
                        if (num != null) {
                            childAt.setImportantForAccessibility(num.intValue());
                        }
                    } else {
                        childAt.setImportantForAccessibility(0);
                    }
                }
            }
        }

        public final void setAllViewGroupChildrenAsNonAccessibilityImportant(@Nullable ViewGroup viewGroup, @NotNull Map<Integer, Integer> viewAccessibilityFlagMap) {
            viewAccessibilityFlagMap.getClass();
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new d(28), 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    viewAccessibilityFlagMap.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                }
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$createAnimationListener$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationStart", "", "animation", "Landroid/view/animation/Animation;", "onAnimationEnd", "onAnimationRepeat", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements Animation.AnimationListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onAnimationEnd$lambda$0() {
            return "In-app message animated into view.";
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (DefaultInAppMessageViewWrapper.this.getInAppMessage().getDismissType() == DismissType.AUTO_DISMISS) {
                DefaultInAppMessageViewWrapper.this.addDismissRunnable();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(0), 7, (Object) null);
            DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = DefaultInAppMessageViewWrapper.this;
            defaultInAppMessageViewWrapper.finalizeViewBeforeDisplay(defaultInAppMessageViewWrapper.getInAppMessage(), DefaultInAppMessageViewWrapper.this.getInAppMessageView(), DefaultInAppMessageViewWrapper.this.getInAppMessageViewLifecycleListener());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(@NotNull View view, @NotNull IInAppMessage iInAppMessage, @NotNull IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, @NotNull BrazeConfigurationProvider brazeConfigurationProvider, @Nullable Animation animation, @Nullable Animation animation2, @Nullable View view2, @Nullable List<? extends View> list) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, list, null, 256, null);
        view.getClass();
        iInAppMessage.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        brazeConfigurationProvider.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(@NotNull View view, @NotNull IInAppMessage iInAppMessage, @NotNull IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, @NotNull BrazeConfigurationProvider brazeConfigurationProvider, @Nullable Animation animation, @Nullable Animation animation2, @Nullable View view2) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, null, null, MLKEMEngine.KyberPolyBytes, null);
        view.getClass();
        iInAppMessage.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        brazeConfigurationProvider.getClass();
    }

    public /* synthetic */ DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List list, View view3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, (i11 & 128) != 0 ? null : list, (i11 & 256) != 0 ? null : view3);
    }
}
