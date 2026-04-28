package com.braze.ui.inappmessage.utils;

import a90.p;
import android.content.Context;
import ba0.g;
import bs.b;
import c90.f;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.MessageType;
import com.braze.h2;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.n;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import j4.s;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.p0;
import x70.c;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010 \u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0082@¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/braze/ui/inappmessage/utils/BackgroundInAppMessagePreparer;", "", "<init>", "()V", "Lcom/braze/models/inappmessage/InAppMessageHtml;", "inAppMessage", "", "prepareInAppMessageWithHtml", "(Lcom/braze/models/inappmessage/InAppMessageHtml;)V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageToPrepare", "prepareInAppMessageForDisplay", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "prepareInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;", "inAppMessageHtml", "", "prepareInAppMessageWithZippedAssetHtml", "(Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;)Z", "prepareInAppMessageWithBitmapDownload", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "", "localImageUrl", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "inAppMessageWithImage", "Lcom/braze/images/IBrazeImageLoader;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "handleLocalImage", "(Ljava/lang/String;Lcom/braze/models/inappmessage/IInAppMessageWithImage;Lcom/braze/images/IBrazeImageLoader;Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/enums/BrazeViewBounds;)Z", "getViewBoundsByType", "(Lcom/braze/models/inappmessage/IInAppMessage;)Lcom/braze/enums/BrazeViewBounds;", "displayPreparedInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;Lx70/c;)Ljava/lang/Object;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackgroundInAppMessagePreparer {

    @NotNull
    public static final BackgroundInAppMessagePreparer INSTANCE = new BackgroundInAppMessagePreparer();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2", f = "BackgroundInAppMessagePreparer.kt", l = {276}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ IInAppMessage $inAppMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IInAppMessage iInAppMessage, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$inAppMessage = iInAppMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Displaying in-app message.";
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.$inAppMessage, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BackgroundInAppMessagePreparer.INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(0), 7, (Object) null);
                BrazeInAppMessageManager companion = BrazeInAppMessageManager.INSTANCE.getInstance();
                IInAppMessage iInAppMessage = this.$inAppMessage;
                this.label = 1;
                if (companion.displayInAppMessage(iInAppMessage, false, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", f = "BackgroundInAppMessagePreparer.kt", l = {42}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ IInAppMessage $inAppMessageToPrepare;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IInAppMessage iInAppMessage, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$inAppMessageToPrepare = iInAppMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Cannot display the in-app message because the in-app message was null.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1() {
            return "Caught error while preparing in app message in background";
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inAppMessageToPrepare, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            b0 b0Var;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                b0 b0Var2 = (b0) this.L$0;
                try {
                    BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = BackgroundInAppMessagePreparer.INSTANCE;
                    IInAppMessage iInAppMessagePrepareInAppMessage = backgroundInAppMessagePreparer.prepareInAppMessage(this.$inAppMessageToPrepare);
                    if (iInAppMessagePrepareInAppMessage == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var2, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new a(1), 6, (Object) null);
                    } else {
                        this.L$0 = b0Var2;
                        this.label = 1;
                        if (backgroundInAppMessagePreparer.displayPreparedInAppMessage(iInAppMessagePrepareInAppMessage, this) == aVar) {
                            return aVar;
                        }
                    }
                } catch (Exception e5) {
                    exc = e5;
                    b0Var = b0Var2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new a(2), 4, (Object) null);
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0 b0Var3 = (b0) this.L$0;
                try {
                    g.M(obj);
                } catch (Exception e11) {
                    exc = e11;
                    b0Var = b0Var3;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new a(2), 4, (Object) null);
                }
            }
            return Unit.f26487a;
        }
    }

    private BackgroundInAppMessagePreparer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object displayPreparedInAppMessage(IInAppMessage iInAppMessage, c<? super Unit> cVar) throws Throwable {
        f fVar = p0.f42144a;
        Object objK = f0.K(p.f1044a, new AnonymousClass2(iInAppMessage, null), cVar);
        return objK == y70.a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    private final BrazeViewBounds getViewBoundsByType(IInAppMessage inAppMessage) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
        return i11 != 3 ? i11 != 4 ? BrazeViewBounds.NO_BOUNDS : BrazeViewBounds.IN_APP_MESSAGE_MODAL : BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP;
    }

    private final boolean handleLocalImage(String localImageUrl, IInAppMessageWithImage inAppMessageWithImage, IBrazeImageLoader imageLoader, Context applicationContext, IInAppMessage inAppMessage, BrazeViewBounds viewBounds) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new n(localImageUrl, 22), 6, (Object) null);
        inAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, inAppMessage, localImageUrl, viewBounds));
        if (inAppMessageWithImage.getBitmap() != null) {
            inAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n(localImageUrl, 23), 7, (Object) null);
        inAppMessageWithImage.setLocalImageUrl(null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLocalImage$lambda$15(String str) {
        return e0.f.k("Passing in-app message local image url to image loader: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLocalImage$lambda$16(String str) {
        return e0.f.k("Removing local image url from IAM since it could not be loaded. URL: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInAppMessage prepareInAppMessage(IInAppMessage inAppMessageToPrepare) {
        if (inAppMessageToPrepare.isControl()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(3), 7, (Object) null);
            return inAppMessageToPrepare;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(10), 7, (Object) null);
        int i11 = WhenMappings.$EnumSwitchMapping$0[inAppMessageToPrepare.getMessageType().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                prepareInAppMessageWithHtml((InAppMessageHtml) inAppMessageToPrepare);
                return inAppMessageToPrepare;
            }
            if (!prepareInAppMessageWithBitmapDownload(inAppMessageToPrepare)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new a(12), 6, (Object) null);
                return null;
            }
        } else if (!prepareInAppMessageWithZippedAssetHtml((IInAppMessageZippedAssetHtml) inAppMessageToPrepare)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new a(11), 6, (Object) null);
            return null;
        }
        return inAppMessageToPrepare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$0() {
        return "Skipping in-app message preparation for control in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$1() {
        return "Starting asynchronous in-app message preparation for message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$2() {
        return "Html in-app message zip asset download failed. Cannot display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$3() {
        return "In-app message image download failed. Cannot display in-app message.";
    }

    public static final void prepareInAppMessageForDisplay(@NotNull IInAppMessage inAppMessageToPrepare) {
        inAppMessageToPrepare.getClass();
        f0.B(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass1(inAppMessageToPrepare, null), 3);
    }

    public static final boolean prepareInAppMessageWithBitmapDownload(@Nullable IInAppMessage inAppMessage) {
        if (!(inAppMessage instanceof IInAppMessageWithImage)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(15), 7, (Object) null);
            return false;
        }
        IInAppMessageWithImage iInAppMessageWithImage = (IInAppMessageWithImage) inAppMessage;
        if (iInAppMessageWithImage.getBitmap() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new a(4), 6, (Object) null);
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = INSTANCE;
        BrazeViewBounds viewBoundsByType = backgroundInAppMessagePreparer.getViewBoundsByType(inAppMessage);
        Context mApplicationContext = BrazeInAppMessageManager.INSTANCE.getInstance().getMApplicationContext();
        if (mApplicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new a(5), 6, (Object) null);
            return false;
        }
        IBrazeImageLoader imageLoader = Braze.INSTANCE.getInstance(mApplicationContext).getImageLoader();
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        if (localImageUrl == null || StringsKt.H(localImageUrl) || !backgroundInAppMessagePreparer.handleLocalImage(localImageUrl, iInAppMessageWithImage, imageLoader, mApplicationContext, inAppMessage, viewBoundsByType)) {
            String remoteImageUrl = iInAppMessageWithImage.getRemoteImageUrl();
            if (remoteImageUrl != null && !StringsKt.H(remoteImageUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new n(remoteImageUrl, 21), 6, (Object) null);
                iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(mApplicationContext, inAppMessage, remoteImageUrl, viewBoundsByType));
                if (iInAppMessageWithImage.getBitmap() == null) {
                    return false;
                }
                iInAppMessageWithImage.setImageDownloadSuccessful(true);
                return true;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) backgroundInAppMessagePreparer, priority, (Throwable) null, false, (Function0) new a(6), 6, (Object) null);
            if (iInAppMessageWithImage instanceof InAppMessageFull) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) backgroundInAppMessagePreparer, priority, (Throwable) null, false, (Function0) new a(7), 6, (Object) null);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$10() {
        return "In-app message already contains image bitmap. Not downloading image from URL.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$11() {
        return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$12(String str) {
        return e0.f.k("In-app message has remote image url. Downloading image at url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$13() {
        return "In-app message has no remote image url. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$14() {
        return "In-app message full has no remote image url yet is required to have an image. Failing message display.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$9() {
        return "Cannot prepare non IInAppMessageWithImage object with bitmap download.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithHtml$lambda$17() {
        return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithHtml$lambda$18() {
        return "HTML in-app message does not have message. Not performing any substitutions.";
    }

    public static final boolean prepareInAppMessageWithZippedAssetHtml(@NotNull IInAppMessageZippedAssetHtml inAppMessageHtml) {
        inAppMessageHtml.getClass();
        String localAssetsDirectoryUrl = inAppMessageHtml.getLocalAssetsDirectoryUrl();
        if (localAssetsDirectoryUrl != null && !StringsKt.H(localAssetsDirectoryUrl) && new File(localAssetsDirectoryUrl).exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new n(localAssetsDirectoryUrl, 24), 6, (Object) null);
            return true;
        }
        String assetsZipRemoteUrl = inAppMessageHtml.getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl == null || StringsKt.H(assetsZipRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new a(13), 6, (Object) null);
            return true;
        }
        Context mApplicationContext = BrazeInAppMessageManager.INSTANCE.getInstance().getMApplicationContext();
        if (mApplicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new a(14), 6, (Object) null);
            return false;
        }
        String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(mApplicationContext), assetsZipRemoteUrl);
        if (localHtmlUrlFromRemoteUrl == null || StringsKt.H(localHtmlUrlFromRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b(16, inAppMessageHtml, localHtmlUrlFromRemoteUrl), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n(localHtmlUrlFromRemoteUrl, 25), 7, (Object) null);
        inAppMessageHtml.setLocalAssetsDirectoryUrl(localHtmlUrlFromRemoteUrl);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$4(String str) {
        return e0.f.k("Local assets for html in-app message are already populated. Not downloading assets. Location = ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$5() {
        return "Html in-app message has no remote asset zip. Continuing with in-app message preparation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$6() {
        return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$7(String str) {
        return e0.f.k("Local url for html in-app message assets is ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$8(IInAppMessageZippedAssetHtml iInAppMessageZippedAssetHtml, String str) {
        return s.k("Download of html content to local directory failed for remote url: ", iInAppMessageZippedAssetHtml.getAssetsZipRemoteUrl(), " . Returned local url is: ", str);
    }

    public final void prepareInAppMessageWithHtml(@NotNull InAppMessageHtml inAppMessage) {
        inAppMessage.getClass();
        if (inAppMessage.getLocalPrefetchedAssetPaths().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(8), 7, (Object) null);
            return;
        }
        String message = inAppMessage.getMessage();
        if (message == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(9), 7, (Object) null);
        } else {
            inAppMessage.setMessage(WebContentUtils.replacePrefetchedUrlsWithLocalAssets(message, inAppMessage.getLocalPrefetchedAssetPaths()));
        }
    }
}
