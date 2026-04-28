package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.o0;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageAnimationFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.DefaultHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010F\u001a\u0004\u0018\u00010&2\u0006\u0010G\u001a\u00020HH\u0016J\u0012\u0010I\u001a\u0004\u0018\u00010&2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0005H\u0016J\u0010\u0010M\u001a\u00020K2\u0006\u0010N\u001a\u00020\u0005H\u0016J\u0012\u0010O\u001a\u00020K2\b\u00107\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010P\u001a\u00020K2\b\u00107\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010Q\u001a\u00020K2\b\u0010<\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010R\u001a\u00020K2\b\u0010B\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010S\u001a\u00020K2\b\u0010T\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010U\u001a\u00020K2\b\u0010?\u001a\u0004\u0018\u000100H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R$\u0010\u0010\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\rR \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0003R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0003R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010<\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0007¨\u0006V"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "", "<init>", "()V", "doesClickOutsideModalViewDismissInAppMessageView", "", "getDoesClickOutsideModalViewDismissInAppMessageView", "()Z", "doesClickOutsideModalViewDismissInAppMessageViewField", "shouldSkip", "shouldNextUnregisterBeSkipped", "getShouldNextUnregisterBeSkipped", "setShouldNextUnregisterBeSkipped", "(Z)V", "doesBackButtonDismissInAppMessageView", "getDoesBackButtonDismissInAppMessageView", "doesBackButtonDismissInAppMessageViewField", "getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release$annotations", "getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release", "setDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release", "mActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getMActivity$annotations", "mApplicationContext", "Landroid/content/Context;", "getMApplicationContext$annotations", "activity", "getActivity", "()Landroid/app/Activity;", "applicationContext", "getApplicationContext", "()Landroid/content/Context;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "defaultHtmlInAppMessageActionListener", "Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "inAppMessageSlideupViewFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageModalViewFactory", "inAppMessageFullViewFactory", "inAppMessageHtmlFullViewFactory", "inAppMessageHtmlViewFactory", "inAppMessageAnimationFactoryField", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "defaultInAppMessageManagerListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "defaultInAppMessageViewWrapperFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "customInAppMessageViewFactory", "customInAppMessageAnimationFactory", "customInAppMessageManagerListener", "customInAppMessageViewWrapperFactory", "customHtmlInAppMessageActionListener", "customControlInAppMessageManagerListener", "inAppMessageManagerListener", "getInAppMessageManagerListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "controlInAppMessageManagerListener", "getControlInAppMessageManagerListener", "htmlInAppMessageActionListener", "getHtmlInAppMessageActionListener", "()Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "inAppMessageViewWrapperFactory", "getInAppMessageViewWrapperFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "inAppMessageAnimationFactory", "getInAppMessageAnimationFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "isActivitySet", "getDefaultInAppMessageViewFactory", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessageViewFactory", "setBackButtonDismissesInAppMessageView", "", "backButtonDismissesInAppMessageView", "setClickOutsideModalViewDismissInAppMessageView", "doesDismiss", "setCustomInAppMessageManagerListener", "setCustomControlInAppMessageManagerListener", "setCustomHtmlInAppMessageActionListener", "setCustomInAppMessageAnimationFactory", "setCustomInAppMessageViewFactory", "inAppMessageViewFactory", "setCustomInAppMessageViewWrapperFactory", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InAppMessageManagerBase {

    @Nullable
    private IInAppMessageManagerListener customControlInAppMessageManagerListener;

    @Nullable
    private IHtmlInAppMessageActionListener customHtmlInAppMessageActionListener;

    @Nullable
    private IInAppMessageAnimationFactory customInAppMessageAnimationFactory;

    @Nullable
    private IInAppMessageManagerListener customInAppMessageManagerListener;

    @Nullable
    private IInAppMessageViewFactory customInAppMessageViewFactory;

    @Nullable
    private IInAppMessageViewWrapperFactory customInAppMessageViewWrapperFactory;

    @NotNull
    private final IHtmlInAppMessageActionListener defaultHtmlInAppMessageActionListener;

    @NotNull
    private final IInAppMessageManagerListener defaultInAppMessageManagerListener;

    @NotNull
    private final IInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory;
    private boolean doesBackButtonDismissInAppMessageViewField = true;
    private boolean doesClickOutsideModalViewDismissInAppMessageViewField;

    @NotNull
    private final IInAppMessageAnimationFactory inAppMessageAnimationFactoryField;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageFullViewFactory;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageHtmlFullViewFactory;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageHtmlViewFactory;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageModalViewFactory;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageSlideupViewFactory;

    @NotNull
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    @Nullable
    protected WeakReference<Activity> mActivity;

    @Nullable
    protected Context mApplicationContext;
    private boolean shouldNextUnregisterBeSkipped;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InAppMessageManagerBase() {
        DefaultInAppMessageWebViewClientListener defaultInAppMessageWebViewClientListener = new DefaultInAppMessageWebViewClientListener();
        this.inAppMessageWebViewClientListener = defaultInAppMessageWebViewClientListener;
        this.defaultHtmlInAppMessageActionListener = new DefaultHtmlInAppMessageActionListener();
        this.inAppMessageSlideupViewFactory = new DefaultInAppMessageSlideupViewFactory();
        this.inAppMessageModalViewFactory = new DefaultInAppMessageModalViewFactory();
        this.inAppMessageFullViewFactory = new DefaultInAppMessageFullViewFactory();
        this.inAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageHtmlViewFactory = new DefaultInAppMessageHtmlViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageAnimationFactoryField = new DefaultInAppMessageAnimationFactory();
        this.defaultInAppMessageManagerListener = new DefaultInAppMessageManagerListener();
        this.defaultInAppMessageViewWrapperFactory = new DefaultInAppMessageViewWrapperFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_shouldNextUnregisterBeSkipped_$lambda$0(boolean z11) {
        return "Setting setShouldNextUnregisterBeSkipped to " + z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDefaultInAppMessageViewFactory$lambda$1(IInAppMessage iInAppMessage) {
        return "Failed to find view factory for in-app message with type: " + iInAppMessage.getMessageType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBackButtonDismissesInAppMessageView$lambda$2(boolean z11) {
        return "In-App Message back button dismissal set to " + z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setClickOutsideModalViewDismissInAppMessageView$lambda$3(boolean z11) {
        return "Modal In-App Message outside tap dismissal set to " + z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomControlInAppMessageManagerListener$lambda$5() {
        return "Custom ControlInAppMessageManagerListener set. This listener will only be used for control in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomHtmlInAppMessageActionListener$lambda$6() {
        return "Custom htmlInAppMessageActionListener set";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageAnimationFactory$lambda$7() {
        return "Custom InAppMessageAnimationFactory set";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageManagerListener$lambda$4() {
        return "Custom InAppMessageManagerListener set";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageViewFactory$lambda$8() {
        return "Custom InAppMessageViewFactory set";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageViewWrapperFactory$lambda$9() {
        return "Custom IInAppMessageViewWrapperFactory set";
    }

    @Nullable
    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getApplicationContext, reason: from getter */
    public Context getMApplicationContext() {
        return this.mApplicationContext;
    }

    @NotNull
    public IInAppMessageManagerListener getControlInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customControlInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    @Nullable
    public IInAppMessageViewFactory getDefaultInAppMessageViewFactory(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
        if (i11 == 1) {
            return this.inAppMessageSlideupViewFactory;
        }
        if (i11 == 2) {
            return this.inAppMessageModalViewFactory;
        }
        if (i11 == 3) {
            return this.inAppMessageFullViewFactory;
        }
        if (i11 == 4) {
            return this.inAppMessageHtmlFullViewFactory;
        }
        if (i11 == 5) {
            return this.inAppMessageHtmlViewFactory;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new a(inAppMessage, 3), 6, (Object) null);
        return null;
    }

    /* JADX INFO: renamed from: getDoesBackButtonDismissInAppMessageView, reason: from getter */
    public boolean getDoesBackButtonDismissInAppMessageViewField() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    public final boolean getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    /* JADX INFO: renamed from: getDoesClickOutsideModalViewDismissInAppMessageView, reason: from getter */
    public boolean getDoesClickOutsideModalViewDismissInAppMessageViewField() {
        return this.doesClickOutsideModalViewDismissInAppMessageViewField;
    }

    @NotNull
    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = this.customHtmlInAppMessageActionListener;
        return iHtmlInAppMessageActionListener == null ? this.defaultHtmlInAppMessageActionListener : iHtmlInAppMessageActionListener;
    }

    @NotNull
    public IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = this.customInAppMessageAnimationFactory;
        return iInAppMessageAnimationFactory == null ? this.inAppMessageAnimationFactoryField : iInAppMessageAnimationFactory;
    }

    @NotNull
    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    @Nullable
    public IInAppMessageViewFactory getInAppMessageViewFactory(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        IInAppMessageViewFactory iInAppMessageViewFactory = this.customInAppMessageViewFactory;
        return iInAppMessageViewFactory == null ? getDefaultInAppMessageViewFactory(inAppMessage) : iInAppMessageViewFactory;
    }

    @NotNull
    public IInAppMessageViewWrapperFactory getInAppMessageViewWrapperFactory() {
        IInAppMessageViewWrapperFactory iInAppMessageViewWrapperFactory = this.customInAppMessageViewWrapperFactory;
        return iInAppMessageViewWrapperFactory == null ? this.defaultInAppMessageViewWrapperFactory : iInAppMessageViewWrapperFactory;
    }

    public boolean getShouldNextUnregisterBeSkipped() {
        return this.shouldNextUnregisterBeSkipped;
    }

    public boolean isActivitySet() {
        return getActivity() != null;
    }

    public void setBackButtonDismissesInAppMessageView(boolean backButtonDismissesInAppMessageView) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o0(backButtonDismissesInAppMessageView, 6), 7, (Object) null);
        this.doesBackButtonDismissInAppMessageViewField = backButtonDismissesInAppMessageView;
    }

    public void setClickOutsideModalViewDismissInAppMessageView(boolean doesDismiss) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o0(doesDismiss, 5), 7, (Object) null);
        this.doesClickOutsideModalViewDismissInAppMessageViewField = doesDismiss;
    }

    public void setCustomControlInAppMessageManagerListener(@Nullable IInAppMessageManagerListener inAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(9), 7, (Object) null);
        this.customControlInAppMessageManagerListener = inAppMessageManagerListener;
    }

    public void setCustomHtmlInAppMessageActionListener(@Nullable IHtmlInAppMessageActionListener htmlInAppMessageActionListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(10), 7, (Object) null);
        this.customHtmlInAppMessageActionListener = htmlInAppMessageActionListener;
    }

    public void setCustomInAppMessageAnimationFactory(@Nullable IInAppMessageAnimationFactory inAppMessageAnimationFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(11), 7, (Object) null);
        this.customInAppMessageAnimationFactory = inAppMessageAnimationFactory;
    }

    public void setCustomInAppMessageManagerListener(@Nullable IInAppMessageManagerListener inAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(7), 7, (Object) null);
        this.customInAppMessageManagerListener = inAppMessageManagerListener;
    }

    public void setCustomInAppMessageViewFactory(@Nullable IInAppMessageViewFactory inAppMessageViewFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(12), 7, (Object) null);
        this.customInAppMessageViewFactory = inAppMessageViewFactory;
    }

    public void setCustomInAppMessageViewWrapperFactory(@Nullable IInAppMessageViewWrapperFactory inAppMessageViewWrapperFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(8), 7, (Object) null);
        this.customInAppMessageViewWrapperFactory = inAppMessageViewWrapperFactory;
    }

    public final void setDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release(boolean z11) {
        this.doesBackButtonDismissInAppMessageViewField = z11;
    }

    public void setShouldNextUnregisterBeSkipped(boolean z11) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o0(z11, 4), 7, (Object) null);
        this.shouldNextUnregisterBeSkipped = z11;
    }

    public static /* synthetic */ void getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release$annotations() {
    }

    public static /* synthetic */ void getMActivity$annotations() {
    }

    public static /* synthetic */ void getMApplicationContext$annotations() {
    }
}
