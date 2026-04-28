package zendesk.messaging.android.internal.conversationscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.m1;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qc.y;
import v80.b0;
import v80.f0;
import y80.y1;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.conversationkit.android.internal.extension.PrivateAttachmentUtilKt;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.VisibleScreen;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.extension.ContextKtxKt;
import zendesk.ui.android.R;
import zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering;
import zendesk.ui.android.conversation.imagerviewer.ImageViewerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0003R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010#\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b#\u0010\u001d\u0012\u0004\b&\u0010\u0003\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ImageViewerActivity;", "Lk/h;", "<init>", "()V", "", "setupImageViewerViewModel", "(Lx70/c;)Ljava/lang/Object;", "errorHandler", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStop", "Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModelFactory;", "imageViewerViewModelFactory", "Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModelFactory;", "getImageViewerViewModelFactory", "()Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModelFactory;", "setImageViewerViewModelFactory", "(Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModelFactory;)V", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", "getMessagingSettings", "()Lzendesk/android/messaging/model/MessagingSettings;", "setMessagingSettings", "(Lzendesk/android/messaging/model/MessagingSettings;)V", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_DARK_COLORS, "Lzendesk/android/messaging/model/UserColors;", "getUserDarkColors", "()Lzendesk/android/messaging/model/UserColors;", "setUserDarkColors", "(Lzendesk/android/messaging/model/UserColors;)V", "getUserDarkColors$annotations", MessagingComponentKt.USER_LIGHT_COLORS, "getUserLightColors", "setUserLightColors", "getUserLightColors$annotations", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "featureFlagManager", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "getFeatureFlagManager", "()Lzendesk/core/android/internal/app/FeatureFlagManager;", "setFeatureFlagManager", "(Lzendesk/core/android/internal/app/FeatureFlagManager;)V", "Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModel;", "imageViewerViewModel", "Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModel;", "", "isInitializationSuccessful", "Z", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageViewerActivity extends k.h {

    @NotNull
    private static final String LOG_TAG = "ImageViewerActivity";
    public FeatureFlagManager featureFlagManager;
    private ImageViewerViewModel imageViewerViewModel;
    public ImageViewerViewModelFactory imageViewerViewModelFactory;
    private boolean isInitializationSuccessful;
    public MessagingSettings messagingSettings;
    public UserColors userDarkColors;
    public UserColors userLightColors;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$setupImageViewerViewModel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity", f = "ImageViewerActivity.kt", l = {AppConstants.RESULT_CODE_FLASH_SALES_SURVEY}, m = "setupImageViewerViewModel")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04261 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C04261(x70.c<? super C04261> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImageViewerActivity.this.setupImageViewerViewModel(this);
        }
    }

    private final void errorHandler() {
        Logger.e(LOG_TAG, "Unable to show the conversation screen without a Messaging instance.", new Object[0]);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setupImageViewerViewModel(x70.c<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity.setupImageViewerViewModel(x70.c):java.lang.Object");
    }

    @NotNull
    public final FeatureFlagManager getFeatureFlagManager() {
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        if (featureFlagManager != null) {
            return featureFlagManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureFlagManager");
        return null;
    }

    @NotNull
    public final ImageViewerViewModelFactory getImageViewerViewModelFactory() {
        ImageViewerViewModelFactory imageViewerViewModelFactory = this.imageViewerViewModelFactory;
        if (imageViewerViewModelFactory != null) {
            return imageViewerViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageViewerViewModelFactory");
        return null;
    }

    @NotNull
    public final MessagingSettings getMessagingSettings() {
        MessagingSettings messagingSettings = this.messagingSettings;
        if (messagingSettings != null) {
            return messagingSettings;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messagingSettings");
        return null;
    }

    @NotNull
    public final UserColors getUserDarkColors() {
        UserColors userColors = this.userDarkColors;
        if (userColors != null) {
            return userColors;
        }
        Intrinsics.throwUninitializedPropertyAccessException(MessagingComponentKt.USER_DARK_COLORS);
        return null;
    }

    @NotNull
    public final UserColors getUserLightColors() {
        UserColors userColors = this.userLightColors;
        if (userColors != null) {
            return userColors;
        }
        Intrinsics.throwUninitializedPropertyAccessException(MessagingComponentKt.USER_LIGHT_COLORS);
        return null;
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageViewerView imageViewerView = new ImageViewerView(this, null, 0, 0, 14, null);
        imageViewerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageViewerView.setBackground(getDrawable(R.color.zuia_color_black));
        f0.B(m1.c(this), null, null, new AnonymousClass1(imageViewerView, null), 3);
        setContentView(imageViewerView);
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public void onStop() {
        super.onStop();
        VisibleScreenTracker.INSTANCE.setHiddenScreen$zendesk_messaging_messaging_android(VisibleScreen.ImageViewerScreen.INSTANCE);
    }

    public final void setFeatureFlagManager(@NotNull FeatureFlagManager featureFlagManager) {
        featureFlagManager.getClass();
        this.featureFlagManager = featureFlagManager;
    }

    public final void setImageViewerViewModelFactory(@NotNull ImageViewerViewModelFactory imageViewerViewModelFactory) {
        imageViewerViewModelFactory.getClass();
        this.imageViewerViewModelFactory = imageViewerViewModelFactory;
    }

    public final void setMessagingSettings(@NotNull MessagingSettings messagingSettings) {
        messagingSettings.getClass();
        this.messagingSettings = messagingSettings;
    }

    public final void setUserDarkColors(@NotNull UserColors userColors) {
        userColors.getClass();
        this.userDarkColors = userColors;
    }

    public final void setUserLightColors(@NotNull UserColors userColors) {
        userColors.getClass();
        this.userLightColors = userColors;
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$onCreate$1", f = "ImageViewerActivity.kt", l = {83, 87}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ ImageViewerView $imageViewerView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImageViewerView imageViewerView, x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$imageViewerView = imageViewerView;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ImageViewerActivity.this.new AnonymousClass1(this.$imageViewerView, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            if (androidx.lifecycle.x0.a(r8, r1, r3, r7) == r0) goto L19;
         */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                ba0.g.M(r8)
                goto L4f
            L10:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r8)
                r8 = 0
                return r8
            L17:
                ba0.g.M(r8)
                goto L29
            L1b:
                ba0.g.M(r8)
                zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity r8 = zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity.this
                r7.label = r3
                java.lang.Object r8 = zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity.access$setupImageViewerViewModel(r8, r7)
                if (r8 != r0) goto L29
                goto L4e
            L29:
                zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity r8 = zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity.this
                boolean r8 = zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity.access$isInitializationSuccessful$p(r8)
                if (r8 != 0) goto L34
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            L34:
                zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity r8 = zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity.this
                androidx.lifecycle.Lifecycle r8 = r8.getLifecycle()
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
                zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$onCreate$1$1 r3 = new zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$onCreate$1$1
                zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity r4 = zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity.this
                zendesk.ui.android.conversation.imagerviewer.ImageViewerView r5 = r7.$imageViewerView
                r6 = 0
                r3.<init>(r4, r5, r6)
                r7.label = r2
                java.lang.Object r8 = androidx.lifecycle.x0.a(r8, r1, r3, r7)
                if (r8 != r0) goto L4f
            L4e:
                return r0
            L4f:
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$onCreate$1$1", f = "ImageViewerActivity.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C00471 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
            final /* synthetic */ ImageViewerView $imageViewerView;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ImageViewerActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00471(ImageViewerActivity imageViewerActivity, ImageViewerView imageViewerView, x70.c<? super C00471> cVar) {
                super(2, cVar);
                this.this$0 = imageViewerActivity;
                this.$imageViewerView = imageViewerView;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                C00471 c00471 = new C00471(this.this$0, this.$imageViewerView, cVar);
                c00471.L$0 = obj;
                return c00471;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((C00471) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                b0 b0Var = (b0) this.L$0;
                VisibleScreenTracker.INSTANCE.setShownScreen$zendesk_messaging_messaging_android(VisibleScreen.ImageViewerScreen.INSTANCE);
                ImageViewerViewModel imageViewerViewModel = this.this$0.imageViewerViewModel;
                if (imageViewerViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewerViewModel");
                    imageViewerViewModel = null;
                }
                ImageViewerActivity imageViewerActivity = this.this$0;
                imageViewerViewModel.refreshTheme$zendesk_messaging_messaging_android(ContextKtxKt.getMessagingTheme(imageViewerActivity, imageViewerActivity.getMessagingSettings(), this.this$0.getUserLightColors(), this.this$0.getUserDarkColors()));
                f0.B(b0Var, null, null, new C00481(this.this$0, this.$imageViewerView, null), 3);
                return Unit.f26487a;
            }

            /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$onCreate$1$1$1", f = "ImageViewerActivity.kt", l = {97}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class C00481 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
                final /* synthetic */ ImageViewerView $imageViewerView;
                int label;
                final /* synthetic */ ImageViewerActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00481(ImageViewerActivity imageViewerActivity, ImageViewerView imageViewerView, x70.c<? super C00481> cVar) {
                    super(2, cVar);
                    this.this$0 = imageViewerActivity;
                    this.$imageViewerView = imageViewerView;
                }

                @Override // z70.a
                public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                    return new C00481(this.this$0, this.$imageViewerView, cVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                    return ((C00481) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                }

                @Override // z70.a
                public final Object invokeSuspend(Object obj) {
                    y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        ba0.g.M(obj);
                        ImageViewerViewModel imageViewerViewModel = this.this$0.imageViewerViewModel;
                        if (imageViewerViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("imageViewerViewModel");
                            imageViewerViewModel = null;
                        }
                        y1 imageViewerState = imageViewerViewModel.getImageViewerState();
                        C00491 c00491 = new C00491(this.$imageViewerView, this.this$0);
                        this.label = 1;
                        if (imageViewerState.collect(c00491, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                    }
                    y.m();
                    return null;
                }

                /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class C00491<T> implements y80.j {
                    final /* synthetic */ ImageViewerView $imageViewerView;
                    final /* synthetic */ ImageViewerActivity this$0;

                    public C00491(ImageViewerView imageViewerView, ImageViewerActivity imageViewerActivity) {
                        this.$imageViewerView = imageViewerView;
                        this.this$0 = imageViewerActivity;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final ImageViewerRendering emit$lambda$2(ImageViewerActivity imageViewerActivity, ImageViewerState imageViewerState, ImageViewerRendering imageViewerRendering) {
                        imageViewerRendering.getClass();
                        return imageViewerRendering.toBuilder().state(new u(imageViewerActivity, imageViewerState, 0)).onBackButtonClicked(new l(imageViewerActivity, 2)).build();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final zendesk.ui.android.conversation.imagerviewer.ImageViewerState emit$lambda$2$lambda$0(ImageViewerActivity imageViewerActivity, ImageViewerState imageViewerState, zendesk.ui.android.conversation.imagerviewer.ImageViewerState imageViewerState2) {
                        imageViewerState2.getClass();
                        Intent intent = imageViewerActivity.getIntent();
                        intent.getClass();
                        String uri = ImageViewerActivityKt.getUri(intent);
                        String authorizationToken = imageViewerState.getAuthorizationToken();
                        Intent intent2 = imageViewerActivity.getIntent();
                        intent2.getClass();
                        return zendesk.ui.android.conversation.imagerviewer.ImageViewerState.copy$default(imageViewerState2, uri, null, null, null, Integer.valueOf(imageViewerActivity.getColor(R.color.zuia_color_black_38p)), Integer.valueOf(imageViewerState.getMessagingTheme().getPrimaryColor()), PrivateAttachmentUtilKt.resolveAuthTokenForPrivateAttachment(authorizationToken, ImageViewerActivityKt.getPrivateAttachmentFlag(intent2)), 14, null);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit emit$lambda$2$lambda$1(ImageViewerActivity imageViewerActivity) {
                        imageViewerActivity.onBackPressed();
                        return Unit.f26487a;
                    }

                    public final Object emit(ImageViewerState imageViewerState, x70.c<? super Unit> cVar) {
                        this.$imageViewerView.render(new u(this.this$0, imageViewerState, 1));
                        return Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj, x70.c cVar) {
                        return emit((ImageViewerState) obj, (x70.c<? super Unit>) cVar);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void getUserDarkColors$annotations() {
    }

    public static /* synthetic */ void getUserLightColors$annotations() {
    }
}
