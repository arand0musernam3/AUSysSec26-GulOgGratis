package zendesk.messaging.android.internal.conversationscreen;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.y;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.m1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x0;
import androidx.lifecycle.z;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.i1;
import y80.y1;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.MessagingScreen;
import zendesk.android.messaging.UrlSource;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.guidekit.android.GuideKit;
import zendesk.logger.Logger;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.AttachmentFileResolver;
import zendesk.messaging.android.internal.AttachmentIntents;
import zendesk.messaging.android.internal.AttachmentIntentsLauncher;
import zendesk.messaging.android.internal.DefaultAttachmentIntents;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.VisibleScreen;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.WebViewUriHandler;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.analytics.ExtensionsLaunchType;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment;
import zendesk.messaging.android.internal.conversationscreen.di.ConversationFragmentComponent;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.extension.ActivityKtxKt;
import zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver;
import zendesk.messaging.android.internal.messagingscreen.MessagingNavigator;
import zendesk.messaging.android.internal.permissions.RuntimePermissionRequester;
import zendesk.messaging.android.push.internal.NotificationBuilder;
import zendesk.ui.android.Renderer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002¥\u0001\b\u0000\u0018\u0000 ¬\u00012\u00020\u0001:\u0002¬\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J7\u0010&\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0003J\u0017\u00104\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u0010\fJ\u0010\u00105\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b5\u0010.J\u000f\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u0010\u0003J\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010J\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bJ\u0010K\u0012\u0004\bP\u0010\u0003\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR(\u0010Q\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bQ\u0010K\u0012\u0004\bT\u0010\u0003\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010V\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010d\u001a\u00020c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0018\u0010q\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u0010~\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010zR!\u0010\u0092\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0095\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R)\u0010¡\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u009f\u0001j\u0003` \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R%\u0010¤\u0001\u001a\u0010\u0012\u0005\u0012\u00030£\u0001\u0012\u0004\u0012\u00020\u00060\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¢\u0001R\u0018\u0010¦\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R&\u0010¨\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00060\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010¢\u0001R\u001e\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "onDestroy", "outState", "onSaveInstanceState", "setupAttachmentIntentLauncher", "", "conversationId", "setHiddenScreen", "(Ljava/lang/String;)V", "uri", "launchActivity", "", "shouldDisplayBottomSheets", "()Z", "launchArticleViewer", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "size", "Lzendesk/messaging/android/internal/analytics/ExtensionsLaunchType;", "launchType", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "source", "launchConversationExtension", "(Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageActionSize;Lzendesk/messaging/android/internal/analytics/ExtensionsLaunchType;Lzendesk/core/ui/android/internal/model/MessageSourceType;Ljava/lang/String;)V", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel;", "viewModel", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenCoordinator;", "createConversationScreenCoordinator", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel;)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenCoordinator;", "setupDependencies", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/messaging/Messaging;", AnalyticsProcessor.CHANNEL, "initViewModel", "(Lzendesk/android/messaging/Messaging;)V", "errorHandler", "setupPermissionRequester", "collectEvents", "startPolling", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$OpenFileAttachment;", "fileAttachment", "openFileFromStorage", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$OpenFileAttachment;)V", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModelFactory;", "conversationScreenViewModelFactory", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModelFactory;", "getConversationScreenViewModelFactory", "()Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModelFactory;", "setConversationScreenViewModelFactory", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModelFactory;)V", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", "getMessagingSettings", "()Lzendesk/android/messaging/model/MessagingSettings;", "setMessagingSettings", "(Lzendesk/android/messaging/model/MessagingSettings;)V", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_DARK_COLORS, "Lzendesk/android/messaging/model/UserColors;", "getUserDarkColors", "()Lzendesk/android/messaging/model/UserColors;", "setUserDarkColors", "(Lzendesk/android/messaging/model/UserColors;)V", "getUserDarkColors$annotations", MessagingComponentKt.USER_LIGHT_COLORS, "getUserLightColors", "setUserLightColors", "getUserLightColors$annotations", "Lzendesk/guidekit/android/GuideKit;", "guideKit", "Lzendesk/guidekit/android/GuideKit;", "getGuideKit", "()Lzendesk/guidekit/android/GuideKit;", "setGuideKit", "(Lzendesk/guidekit/android/GuideKit;)V", "Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "messagingNavigator", "Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "getMessagingNavigator", "()Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "setMessagingNavigator", "(Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;)V", "Lzendesk/messaging/android/internal/messagingscreen/BackNavigationResolver;", "backNavigationResolver", "Lzendesk/messaging/android/internal/messagingscreen/BackNavigationResolver;", "getBackNavigationResolver", "()Lzendesk/messaging/android/internal/messagingscreen/BackNavigationResolver;", "setBackNavigationResolver", "(Lzendesk/messaging/android/internal/messagingscreen/BackNavigationResolver;)V", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "featureFlagManager", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "getFeatureFlagManager", "()Lzendesk/core/android/internal/app/FeatureFlagManager;", "setFeatureFlagManager", "(Lzendesk/core/android/internal/app/FeatureFlagManager;)V", "conversationScreenViewModel", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerBottomSheetFragment;", "guideArticleViewerBottomSheetFragment", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerBottomSheetFragment;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionBottomSheetFragment;", "conversationExtensionBottomSheetFragment", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionBottomSheetFragment;", "credentials", "Ljava/lang/String;", "Lzendesk/android/messaging/MessagingScreen;", "messagingScreenNavigation", "Lzendesk/android/messaging/MessagingScreen;", "shouldStartDefaultConversation", "Ljava/lang/Boolean;", "conversationScreenCoordinator", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenCoordinator;", "Lzendesk/ui/android/Renderer;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering;", "conversationView", "Lzendesk/ui/android/Renderer;", "Lzendesk/messaging/android/internal/permissions/RuntimePermissionRequester;", "permissionRequester", "Lzendesk/messaging/android/internal/permissions/RuntimePermissionRequester;", "Lzendesk/messaging/android/internal/AttachmentIntentsLauncher;", "attachmentIntentLauncher", "Lzendesk/messaging/android/internal/AttachmentIntentsLauncher;", "attachmentLauncherUuid", "Lzendesk/messaging/android/internal/AttachmentIntents;", "attachmentIntents$delegate", "Lu70/j;", "getAttachmentIntents", "()Lzendesk/messaging/android/internal/AttachmentIntents;", "attachmentIntents", "Lv80/i1;", "pollingJob", "Lv80/i1;", "initializationJob", "isInitializationSuccessful", "Z", "Lzendesk/messaging/android/internal/UriHandler;", "uriHandler", "Lzendesk/messaging/android/internal/UriHandler;", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "webViewUriHandler", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "Lkotlin/Function1;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCopyTextAction;", "onCopyTextAction", "Lkotlin/jvm/functions/Function1;", "", "onAttachButtonClicked", "zendesk/messaging/android/internal/conversationscreen/ConversationFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lzendesk/messaging/android/internal/conversationscreen/ConversationFragment$onBackPressedCallback$1;", "onBackButtonClickedHandler", "Lkotlin/Function0;", "onDeniedPermissionActionClicked", "Lkotlin/jvm/functions/Function0;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationFragment.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,658:1\n1#2:659\n29#3:660\n36#3:661\n*S KotlinDebug\n*F\n+ 1 ConversationFragment.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationFragment\n*L\n415#1:660\n607#1:661\n*E\n"})
public final class ConversationFragment extends Fragment {

    @NotNull
    public static final String ARG_CONVERSATION_ID = "ConversationFragment.ARG_CONVERSATION_ID";

    @NotNull
    private static final String ARG_CREDENTIALS = "ConversationFragment.ARG_CREDENTIALS";

    @NotNull
    public static final String ARG_MESSAGING_SCREEN_NAVIGATION_LOGIC = "ConversationFragment.ARG_MESSAGING_SCREEN_NAVIGATION_LOGIC";

    @NotNull
    public static final String ARG_SHOULD_START_DEFAULT_CONVERSATION = "ConversationFragment.ARG_SHOULD_START_DEFAULT_CONVERSATION";

    @NotNull
    private static final String ATTACHMENT_LAUNCHER_UUID_KEY = "ConversationFragment.ATTACHMENT_LAUNCHER_UUID_KEY";
    public static final long COORDINATOR_INITIALIZATION_DELAY = 10;
    public static final long COORDINATOR_INITIALIZATION_TIMEOUT = 2000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String INTENT_URI_SCHEMA = "package";

    @NotNull
    public static final String LOG_TAG = "ConversationFragment";

    @NotNull
    public static final String NAME = "ConversationFragment";
    private AttachmentIntentsLauncher attachmentIntentLauncher;

    /* JADX INFO: renamed from: attachmentIntents$delegate, reason: from kotlin metadata */
    @NotNull
    private final u70.j attachmentIntents;
    private String attachmentLauncherUuid;
    public BackNavigationResolver backNavigationResolver;

    @Nullable
    private ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment;

    @Nullable
    private String conversationId;

    @Nullable
    private ConversationScreenCoordinator conversationScreenCoordinator;

    @Nullable
    private ConversationScreenViewModel conversationScreenViewModel;
    public ConversationScreenViewModelFactory conversationScreenViewModelFactory;
    private Renderer<ConversationScreenRendering> conversationView;
    private String credentials;
    public FeatureFlagManager featureFlagManager;

    @Nullable
    private GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment;
    public GuideKit guideKit;

    @Nullable
    private i1 initializationJob;
    private boolean isInitializationSuccessful;
    public MessagingNavigator messagingNavigator;

    @Nullable
    private MessagingScreen messagingScreenNavigation;
    public MessagingSettings messagingSettings;

    @NotNull
    private final Function1<Integer, Unit> onAttachButtonClicked;

    @NotNull
    private final Function1<String, Unit> onBackButtonClickedHandler;

    @NotNull
    private final ConversationFragment$onBackPressedCallback$1 onBackPressedCallback;

    @NotNull
    private final Function1<String, Unit> onCopyTextAction;

    @NotNull
    private final Function0<Unit> onDeniedPermissionActionClicked;
    private RuntimePermissionRequester permissionRequester;

    @Nullable
    private i1 pollingJob;

    @Nullable
    private Boolean shouldStartDefaultConversation;

    @NotNull
    private final UriHandler uriHandler;
    public UserColors userDarkColors;
    public UserColors userLightColors;

    @NotNull
    private final WebViewUriHandler webViewUriHandler;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1", f = "ConversationFragment.kt", l = {342}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1", f = "ConversationFragment.kt", l = {344, 356}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C00351 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ConversationFragment this$0;

            /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1$1", f = "ConversationFragment.kt", l = {343}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class C00361 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
                int label;
                final /* synthetic */ ConversationFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00361(ConversationFragment conversationFragment, x70.c<? super C00361> cVar) {
                    super(2, cVar);
                    this.this$0 = conversationFragment;
                }

                @Override // z70.a
                public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                    return new C00361(this.this$0, cVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                    return ((C00361) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                }

                @Override // z70.a
                public final Object invokeSuspend(Object obj) {
                    y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        ba0.g.M(obj);
                        ConversationFragment conversationFragment = this.this$0;
                        this.label = 1;
                        if (conversationFragment.setupDependencies(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                    }
                    return Unit.f26487a;
                }
            }

            /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1$2", f = "ConversationFragment.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ConversationFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(ConversationFragment conversationFragment, x70.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.this$0 = conversationFragment;
                }

                @Override // z70.a
                public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                    return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
                    ConversationScreenViewModel conversationScreenViewModel = this.this$0.conversationScreenViewModel;
                    if (conversationScreenViewModel != null) {
                        ConversationFragment conversationFragment = this.this$0;
                        conversationFragment.conversationScreenCoordinator = conversationFragment.createConversationScreenCoordinator(conversationScreenViewModel);
                        f0.B(b0Var, null, null, new ConversationFragment$onViewCreated$1$1$2$1$1(conversationFragment, null), 3);
                        f0.B(b0Var, null, null, new ConversationFragment$onViewCreated$1$1$2$1$2(conversationFragment, null), 3);
                    }
                    if (Build.VERSION.SDK_INT >= 33) {
                        RuntimePermissionRequester runtimePermissionRequester = this.this$0.permissionRequester;
                        if (runtimePermissionRequester == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("permissionRequester");
                            runtimePermissionRequester = null;
                        }
                        RuntimePermissionRequester.DefaultImpls.launchSinglePermissionRequest$default(runtimePermissionRequester, "android.permission.POST_NOTIFICATIONS", null, 2, null);
                    }
                    return Unit.f26487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00351(ConversationFragment conversationFragment, x70.c<? super C00351> cVar) {
                super(2, cVar);
                this.this$0 = conversationFragment;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                C00351 c00351 = new C00351(this.this$0, cVar);
                c00351.L$0 = obj;
                return c00351;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((C00351) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
            
                if (androidx.lifecycle.x0.b(r8, r1, r4, r7) == r0) goto L26;
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
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L1d
                    if (r1 == r4) goto L19
                    if (r1 != r3) goto L12
                    ba0.g.M(r8)
                    goto La6
                L12:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    com.braze.h2.b(r8)
                    r8 = 0
                    return r8
                L19:
                    ba0.g.M(r8)
                    goto L44
                L1d:
                    ba0.g.M(r8)
                    java.lang.Object r8 = r7.L$0
                    v80.b0 r8 = (v80.b0) r8
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r1 = r7.this$0
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1$1 r5 = new zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1$1
                    r5.<init>(r1, r2)
                    r6 = 3
                    v80.b2 r8 = v80.f0.B(r8, r2, r2, r5, r6)
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$setInitializationJob$p(r1, r8)
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = r7.this$0
                    v80.i1 r8 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$getInitializationJob$p(r8)
                    if (r8 == 0) goto L44
                    r7.label = r4
                    java.lang.Object r8 = r8.B(r7)
                    if (r8 != r0) goto L44
                    goto La5
                L44:
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = r7.this$0
                    boolean r8 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$isInitializationSuccessful$p(r8)
                    if (r8 != 0) goto L4f
                    kotlin.Unit r8 = kotlin.Unit.f26487a
                    return r8
                L4f:
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = r7.this$0
                    zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$getConversationScreenViewModel$p(r8)
                    if (r8 == 0) goto L79
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r1 = r7.this$0
                    android.content.Context r1 = r1.requireContext()
                    r1.getClass()
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r4 = r7.this$0
                    zendesk.android.messaging.model.MessagingSettings r4 = r4.getMessagingSettings()
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r5 = r7.this$0
                    zendesk.android.messaging.model.UserColors r5 = r5.getUserLightColors()
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r6 = r7.this$0
                    zendesk.android.messaging.model.UserColors r6 = r6.getUserDarkColors()
                    zendesk.messaging.android.internal.model.MessagingTheme r1 = zendesk.messaging.android.internal.extension.ContextKtxKt.getMessagingTheme(r1, r4, r5, r6)
                    r8.refreshTheme$zendesk_messaging_messaging_android(r1)
                L79:
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = r7.this$0
                    androidx.lifecycle.Lifecycle r8 = r8.getLifecycle()
                    androidx.lifecycle.Lifecycle$State r8 = r8.b()
                    androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
                    boolean r8 = r8.a(r1)
                    if (r8 == 0) goto La6
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = r7.this$0
                    androidx.lifecycle.LifecycleOwner r8 = r8.getViewLifecycleOwner()
                    r8.getClass()
                    androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1$2 r4 = new zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1$2
                    zendesk.messaging.android.internal.conversationscreen.ConversationFragment r5 = r7.this$0
                    r4.<init>(r5, r2)
                    r7.label = r3
                    java.lang.Object r8 = androidx.lifecycle.x0.b(r8, r1, r4, r7)
                    if (r8 != r0) goto La6
                La5:
                    return r0
                La6:
                    kotlin.Unit r8 = kotlin.Unit.f26487a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationFragment.AnonymousClass1.C00351.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationFragment.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                LifecycleOwner viewLifecycleOwner = ConversationFragment.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                Lifecycle.State state = Lifecycle.State.CREATED;
                C00351 c00351 = new C00351(ConversationFragment.this, null);
                this.label = 1;
                if (x0.b(viewLifecycleOwner, state, c00351, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupDependencies$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment", f = "ConversationFragment.kt", l = {493}, m = "setupDependencies")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03861 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C03861(x70.c<? super C03861> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationFragment.this.setupDependencies(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$startPolling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$startPolling$1", f = "ConversationFragment.kt", l = {583}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C03871 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$startPolling$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$startPolling$1$1", f = "ConversationFragment.kt", l = {586}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C00381 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConversationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00381(ConversationFragment conversationFragment, x70.c<? super C00381> cVar) {
                super(2, cVar);
                this.this$0 = conversationFragment;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                return new C00381(this.this$0, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((C00381) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y80.i iVarStartPolling;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    ConversationScreenViewModel conversationScreenViewModel = this.this$0.conversationScreenViewModel;
                    if (conversationScreenViewModel != null && (iVarStartPolling = conversationScreenViewModel.startPolling()) != null) {
                        y80.j jVar = new y80.j() { // from class: zendesk.messaging.android.internal.conversationscreen.ConversationFragment.startPolling.1.1.1
                            @Override // y80.j
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, x70.c cVar) {
                                return emit((Unit) obj2, (x70.c<? super Unit>) cVar);
                            }

                            public final Object emit(Unit unit, x70.c<? super Unit> cVar) {
                                return Unit.f26487a;
                            }
                        };
                        this.label = 1;
                        if (iVarStartPolling.collect(jVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            }
        }

        public C03871(x70.c<? super C03871> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationFragment.this.new C03871(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C03871) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                LifecycleOwner viewLifecycleOwner = ConversationFragment.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                Lifecycle.State state = Lifecycle.State.STARTED;
                C00381 c00381 = new C00381(ConversationFragment.this, null);
                this.label = 1;
                if (x0.b(viewLifecycleOwner, state, c00381, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onBackPressedCallback$1] */
    public ConversationFragment() {
        super(R.layout.zma_screen_conversation);
        this.shouldStartDefaultConversation = Boolean.FALSE;
        int i11 = 0;
        this.attachmentIntents = u70.l.b(new a(this, i11));
        this.uriHandler = new b(this);
        this.webViewUriHandler = new b(this);
        this.onCopyTextAction = new c(this, i11);
        this.onAttachButtonClicked = new c(this, 1);
        this.onBackPressedCallback = new y() { // from class: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.y
            public void handleOnBackPressed() {
                y1 conversationScreenStateFlow;
                ConversationScreenState conversationScreenState;
                Conversation conversation;
                setEnabled(false);
                Function1 function1 = this.this$0.onBackButtonClickedHandler;
                ConversationScreenViewModel conversationScreenViewModel = this.this$0.conversationScreenViewModel;
                function1.invoke((conversationScreenViewModel == null || (conversationScreenStateFlow = conversationScreenViewModel.getConversationScreenStateFlow()) == null || (conversationScreenState = (ConversationScreenState) conversationScreenStateFlow.getValue()) == null || (conversation = conversationScreenState.getConversation()) == null) ? null : conversation.getId());
            }
        };
        this.onBackButtonClickedHandler = new c(this, 2);
        this.onDeniedPermissionActionClicked = new a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultAttachmentIntents attachmentIntents_delegate$lambda$0(ConversationFragment conversationFragment) {
        o0 o0VarRequireActivity = conversationFragment.requireActivity();
        o0VarRequireActivity.getClass();
        return new DefaultAttachmentIntents(o0VarRequireActivity, conversationFragment.getMessagingSettings().isMultiAttachmentsEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectEvents(x70.c<? super Unit> cVar) {
        y80.i eventsChannel;
        ConversationScreenViewModel conversationScreenViewModel = this.conversationScreenViewModel;
        if (conversationScreenViewModel == null || (eventsChannel = conversationScreenViewModel.getEventsChannel()) == null) {
            return Unit.f26487a;
        }
        Object objCollect = eventsChannel.collect(new AnonymousClass2(), cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ConversationScreenCoordinator createConversationScreenCoordinator(ConversationScreenViewModel viewModel) {
        RuntimePermissionRequester runtimePermissionRequester;
        Renderer<ConversationScreenRendering> renderer = this.conversationView;
        if (renderer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationView");
            renderer = null;
            runtimePermissionRequester = null;
        } else {
            runtimePermissionRequester = null;
        }
        Function1<String, Unit> function1 = this.onBackButtonClickedHandler;
        RuntimePermissionRequester runtimePermissionRequester2 = runtimePermissionRequester;
        Function0<Unit> function0 = this.onDeniedPermissionActionClicked;
        Function1<Integer, Unit> function12 = this.onAttachButtonClicked;
        UriHandler uriHandler = this.uriHandler;
        WebViewUriHandler webViewUriHandler = this.webViewUriHandler;
        AttachmentIntents attachmentIntents = getAttachmentIntents();
        z zVarC = m1.c(this);
        VisibleScreenTracker visibleScreenTracker = VisibleScreenTracker.INSTANCE;
        MessagingSettings messagingSettings = getMessagingSettings();
        Function1<String, Unit> function13 = this.onCopyTextAction;
        RuntimePermissionRequester runtimePermissionRequester3 = this.permissionRequester;
        if (runtimePermissionRequester3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permissionRequester");
            runtimePermissionRequester3 = runtimePermissionRequester2;
        }
        AttachmentIntentsLauncher attachmentIntentsLauncher = this.attachmentIntentLauncher;
        AttachmentIntentsLauncher attachmentIntentsLauncher2 = attachmentIntentsLauncher;
        if (attachmentIntentsLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("attachmentIntentLauncher");
            attachmentIntentsLauncher2 = runtimePermissionRequester2;
        }
        return new ConversationScreenCoordinator(renderer, function1, function0, function12, uriHandler, webViewUriHandler, attachmentIntents, zVarC, visibleScreenTracker, viewModel, messagingSettings, function13, runtimePermissionRequester3, attachmentIntentsLauncher2);
    }

    private final void errorHandler() {
        Logger.e("ConversationFragment", "Unable to show the conversation without a Messaging instance.", new Object[0]);
        o0 activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final AttachmentIntents getAttachmentIntents() {
        return (AttachmentIntents) this.attachmentIntents.getValue();
    }

    private final void initViewModel(Messaging messaging) {
        if (!(messaging instanceof DefaultMessaging)) {
            errorHandler();
            return;
        }
        ConversationFragmentComponent.Factory factoryConversationFragmentComponent = ((DefaultMessaging) messaging).getMessagingComponent().conversationFragmentComponent();
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        factoryConversationFragmentComponent.create((k.h) o0VarRequireActivity, this, getArguments()).inject(this);
        ConversationScreenViewModelFactory conversationScreenViewModelFactory = getConversationScreenViewModelFactory();
        conversationScreenViewModelFactory.getClass();
        ViewModelStore viewModelStore = getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        a0 a0Var = new a0(viewModelStore, conversationScreenViewModelFactory, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConversationScreenViewModel.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            i4.a.f("Local and anonymous classes can not be ViewModels");
        } else {
            this.conversationScreenViewModel = (ConversationScreenViewModel) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
            this.isInitializationSuccessful = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchActivity(String uri) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uri));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Logger.e("ConversationFragment", e0.f.k("Unable to find activity to launch the ACTION_VIEW intent for : ", uri), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchArticleViewer(String uri) {
        if (shouldDisplayBottomSheets()) {
            GuideArticleViewerBottomSheetFragment.Companion companion = GuideArticleViewerBottomSheetFragment.INSTANCE;
            String str = this.credentials;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("credentials");
                str = null;
            }
            GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragmentNewInstance = companion.newInstance(uri, str);
            this.guideArticleViewerBottomSheetFragment = guideArticleViewerBottomSheetFragmentNewInstance;
            if (guideArticleViewerBottomSheetFragmentNewInstance != null) {
                guideArticleViewerBottomSheetFragmentNewInstance.setCancelable(false);
            }
            GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment = this.guideArticleViewerBottomSheetFragment;
            if (guideArticleViewerBottomSheetFragment != null) {
                guideArticleViewerBottomSheetFragment.show(getChildFragmentManager(), GuideArticleViewerBottomSheetFragment.TAG);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchConversationExtension(String uri, MessageActionSize size, ExtensionsLaunchType launchType, MessageSourceType source, String conversationId) {
        if (shouldDisplayBottomSheets()) {
            ConversationExtensionBottomSheetFragment.Companion companion = ConversationExtensionBottomSheetFragment.INSTANCE;
            String str = this.credentials;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("credentials");
                str = null;
            }
            ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragmentNewInstance = companion.newInstance(uri, size, str, launchType.getAnalyticsValue(), source, conversationId);
            this.conversationExtensionBottomSheetFragment = conversationExtensionBottomSheetFragmentNewInstance;
            if (conversationExtensionBottomSheetFragmentNewInstance != null) {
                conversationExtensionBottomSheetFragmentNewInstance.setCancelable(false);
            }
            ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment = this.conversationExtensionBottomSheetFragment;
            if (conversationExtensionBottomSheetFragment != null) {
                conversationExtensionBottomSheetFragment.show(getChildFragmentManager(), ConversationExtensionBottomSheetFragment.TAG);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachButtonClicked$lambda$6(ConversationFragment conversationFragment, int i11) {
        ConversationScreenCoordinator conversationScreenCoordinator;
        if (conversationFragment.conversationScreenCoordinator == null) {
            Logger.e("ConversationFragment", "ConversationScreenCoordinator is null. Unable to perform menu item action.", new Object[0]);
        }
        if (i11 == zendesk.ui.android.R.id.menu_item_camera) {
            ConversationScreenCoordinator conversationScreenCoordinator2 = conversationFragment.conversationScreenCoordinator;
            if (conversationScreenCoordinator2 != null) {
                conversationScreenCoordinator2.launchCamera$zendesk_messaging_messaging_android();
            }
        } else if (i11 == zendesk.ui.android.R.id.menu_item_gallery && (conversationScreenCoordinator = conversationFragment.conversationScreenCoordinator) != null) {
            conversationScreenCoordinator.launchGallery$zendesk_messaging_messaging_android();
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackButtonClickedHandler$lambda$7(ConversationFragment conversationFragment, String str) {
        o0 o0VarRequireActivity = conversationFragment.requireActivity();
        o0VarRequireActivity.getClass();
        ActivityKtxKt.hideKeyboard(o0VarRequireActivity);
        conversationFragment.setHiddenScreen(str);
        f0.B(m1.c(conversationFragment), null, null, new ConversationFragment$onBackButtonClickedHandler$1$1(conversationFragment, o0VarRequireActivity, null), 3);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCopyTextAction$lambda$5(ConversationFragment conversationFragment, String str) {
        str.getClass();
        Object systemService = conversationFragment.requireActivity().getSystemService("clipboard");
        systemService.getClass();
        ClipData clipDataNewPlainText = ClipData.newPlainText("", str);
        Logger.i("ConversationFragment", e0.f.k("Copy text ", str), new Object[0]);
        ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeniedPermissionActionClicked$lambda$9(ConversationFragment conversationFragment) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(INTENT_URI_SCHEMA, conversationFragment.requireActivity().getPackageName(), null));
        conversationFragment.startActivity(intent);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openFileFromStorage(ConversationScreenEvent.OpenFileAttachment fileAttachment) {
        Uri uriForFile = FileProvider.getUriForFile(requireContext(), r8.k.l(requireContext().getPackageName(), ".zendesk.messaging.provider"), fileAttachment.getFile());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uriForFile, fileAttachment.getMimeType());
        intent.addFlags(1);
        intent.addFlags(268435456);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Logger.e("ConversationFragment", org.bouncycastle.jcajce.provider.asymmetric.a.b(Uri.fromFile(fileAttachment.getFile()), "Unable to find activity to launch the ACTION_VIEW intent for : "), new Object[0]);
        }
    }

    private final void setHiddenScreen(String conversationId) {
        if (conversationId != null) {
            VisibleScreenTracker.INSTANCE.setHiddenScreen$zendesk_messaging_messaging_android(new VisibleScreen.ConversationScreen(conversationId));
        }
    }

    private final void setupAttachmentIntentLauncher() {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ActivityResultRegistry activityResultRegistry = requireActivity().getActivityResultRegistry();
        AttachmentFileResolver attachmentFileResolver = new AttachmentFileResolver();
        String str = this.attachmentLauncherUuid;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("attachmentLauncherUuid");
            str = null;
        }
        AttachmentIntentsLauncher attachmentIntentsLauncher = new AttachmentIntentsLauncher(activityResultRegistry, attachmentFileResolver, new c(this, 3), new a(this, 2), contextRequireContext, str);
        this.attachmentIntentLauncher = attachmentIntentsLauncher;
        getLifecycle().a(attachmentIntentsLauncher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupAttachmentIntentLauncher$lambda$10(ConversationFragment conversationFragment, List list) {
        list.getClass();
        f0.B(m1.c(conversationFragment), null, null, new ConversationFragment$setupAttachmentIntentLauncher$1$1(conversationFragment, list, null), 3);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupAttachmentIntentLauncher$lambda$11(ConversationFragment conversationFragment) {
        f0.B(m1.c(conversationFragment), null, null, new ConversationFragment$setupAttachmentIntentLauncher$2$1(conversationFragment, null), 3);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setupDependencies(x70.c<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationFragment.C03861
            if (r0 == 0) goto L14
            r0 = r9
            zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupDependencies$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationFragment.C03861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupDependencies$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupDependencies$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            ba0.g.M(r9)
            goto L66
        L29:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L30:
            ba0.g.M(r9)
            r9 = r2
            android.content.Context r2 = r8.requireContext()
            r2.getClass()
            android.os.Bundle r1 = r8.getArguments()
            if (r1 == 0) goto L87
            java.lang.String r3 = "ConversationFragment.ARG_CREDENTIALS"
            java.lang.String r1 = r1.getString(r3)
            if (r1 != 0) goto L4a
            goto L87
        L4a:
            zendesk.android.ZendeskCredentials$Companion r3 = zendesk.android.ZendeskCredentials.INSTANCE
            zendesk.android.ZendeskCredentials r3 = r3.fromQuery(r1)
            if (r3 != 0) goto L58
            r8.errorHandler()
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L58:
            zendesk.android.Zendesk$Companion r1 = zendesk.android.Zendesk.INSTANCE
            r5.label = r9
            r4 = 0
            r6 = 4
            r7 = 0
            java.lang.Object r9 = zendesk.messaging.android.internal.extension.ZendeskKtxKt.messaging$default(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L66
            return r0
        L66:
            zendesk.android.ZendeskResult r9 = (zendesk.android.ZendeskResult) r9
            boolean r0 = r9 instanceof zendesk.android.ZendeskResult.Failure
            if (r0 == 0) goto L70
            r8.errorHandler()
            goto L7f
        L70:
            boolean r0 = r9 instanceof zendesk.android.ZendeskResult.Success
            if (r0 == 0) goto L82
            zendesk.android.ZendeskResult$Success r9 = (zendesk.android.ZendeskResult.Success) r9
            java.lang.Object r9 = r9.getValue()
            zendesk.android.messaging.Messaging r9 = (zendesk.android.messaging.Messaging) r9
            r8.initViewModel(r9)
        L7f:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L82:
            e40.a.f()
            r9 = 0
            return r9
        L87:
            r8.errorHandler()
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationFragment.setupDependencies(x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupPermissionRequester(Context context) {
        if (context instanceof RuntimePermissionRequester) {
            this.permissionRequester = (RuntimePermissionRequester) context;
            return;
        }
        Logger.e("ConversationFragment", context + " must implement RuntimePermissionRequester", new Object[0]);
    }

    private final boolean shouldDisplayBottomSheets() {
        return getChildFragmentManager().findFragmentByTag(ConversationExtensionBottomSheetFragment.TAG) == null && getChildFragmentManager().findFragmentByTag(GuideArticleViewerBottomSheetFragment.TAG) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPolling() {
        i1 i1Var = this.pollingJob;
        if (i1Var == null || !i1Var.g()) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            this.pollingJob = f0.B(m1.c(viewLifecycleOwner), null, null, new C03871(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uriHandler$lambda$2(ConversationFragment conversationFragment, String str, UrlSource urlSource, boolean z11, MessageSourceType messageSourceType) {
        str.getClass();
        urlSource.getClass();
        messageSourceType.getClass();
        if (conversationFragment.conversationScreenCoordinator == null) {
            Logger.e("ConversationFragment", "Unable to handle URI.", new Object[0]);
        }
        ConversationScreenCoordinator conversationScreenCoordinator = conversationFragment.conversationScreenCoordinator;
        if (conversationScreenCoordinator != null) {
            conversationScreenCoordinator.handleUri(str, urlSource, new dp.w(urlSource, conversationFragment, str, z11, messageSourceType));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uriHandler$lambda$2$lambda$1(UrlSource urlSource, ConversationFragment conversationFragment, String str, boolean z11, MessageSourceType messageSourceType) {
        y1 conversationScreenStateFlow;
        ConversationScreenState conversationScreenState;
        Conversation conversation;
        String id2 = null;
        if (urlSource == UrlSource.IMAGE) {
            o0 o0VarRequireActivity = conversationFragment.requireActivity();
            o0VarRequireActivity.getClass();
            String str2 = conversationFragment.credentials;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("credentials");
                str2 = null;
            }
            ConversationScreenViewModel conversationScreenViewModel = conversationFragment.conversationScreenViewModel;
            if (conversationScreenViewModel != null && (conversationScreenStateFlow = conversationScreenViewModel.getConversationScreenStateFlow()) != null && (conversationScreenState = (ConversationScreenState) conversationScreenStateFlow.getValue()) != null && (conversation = conversationScreenState.getConversation()) != null) {
                id2 = conversation.getId();
            }
            conversationFragment.startActivity(new ImageViewerActivityIntentBuilder(o0VarRequireActivity, str2, id2).withUri(str).withPrivateAttachmentFlag(z11).getIntent());
        } else {
            f0.B(m1.c(conversationFragment), null, null, new ConversationFragment$uriHandler$1$1$2(conversationFragment, str, messageSourceType, null), 3);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewUriHandler$lambda$4(ConversationFragment conversationFragment, String str, MessageActionSize messageActionSize, UrlSource urlSource, MessageSourceType messageSourceType) {
        str.getClass();
        messageActionSize.getClass();
        urlSource.getClass();
        messageSourceType.getClass();
        if (conversationFragment.conversationScreenCoordinator == null) {
            Logger.e("ConversationFragment", "Unable to handle URI.", new Object[0]);
        }
        ConversationScreenCoordinator conversationScreenCoordinator = conversationFragment.conversationScreenCoordinator;
        if (conversationScreenCoordinator != null) {
            conversationScreenCoordinator.handleUri(str, urlSource, new cg.d(urlSource, messageSourceType, conversationFragment, messageActionSize, str, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webViewUriHandler$lambda$4$lambda$3(UrlSource urlSource, MessageSourceType messageSourceType, ConversationFragment conversationFragment, MessageActionSize messageActionSize, String str) {
        if (urlSource == UrlSource.WEBVIEW_MESSAGE_ACTION) {
            if (messageSourceType != MessageSourceType.SURVEY) {
                ConversationScreenViewModel conversationScreenViewModel = conversationFragment.conversationScreenViewModel;
                if (conversationScreenViewModel != null) {
                    conversationScreenViewModel.processConversationExtensionClickedEvent(messageActionSize.getAnalyticsValue());
                }
                ConversationScreenViewModel conversationScreenViewModel2 = conversationFragment.conversationScreenViewModel;
                if (conversationScreenViewModel2 != null) {
                    conversationScreenViewModel2.processConversationExtensionOpenedEvent(str);
                }
            }
            f0.B(m1.c(conversationFragment), null, null, new ConversationFragment$webViewUriHandler$1$1$1(conversationFragment, str, messageActionSize, messageSourceType, null), 3);
        } else {
            conversationFragment.launchActivity(str);
        }
        return Unit.f26487a;
    }

    @NotNull
    public final BackNavigationResolver getBackNavigationResolver() {
        BackNavigationResolver backNavigationResolver = this.backNavigationResolver;
        if (backNavigationResolver != null) {
            return backNavigationResolver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backNavigationResolver");
        return null;
    }

    @NotNull
    public final ConversationScreenViewModelFactory getConversationScreenViewModelFactory() {
        ConversationScreenViewModelFactory conversationScreenViewModelFactory = this.conversationScreenViewModelFactory;
        if (conversationScreenViewModelFactory != null) {
            return conversationScreenViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("conversationScreenViewModelFactory");
        return null;
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
    public final GuideKit getGuideKit() {
        GuideKit guideKit = this.guideKit;
        if (guideKit != null) {
            return guideKit;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideKit");
        return null;
    }

    @NotNull
    public final MessagingNavigator getMessagingNavigator() {
        MessagingNavigator messagingNavigator = this.messagingNavigator;
        if (messagingNavigator != null) {
            return messagingNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messagingNavigator");
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

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        context.getClass();
        super.onAttach(context);
        setupPermissionRequester(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strE;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.credentials = String.valueOf(arguments.getString(ARG_CREDENTIALS));
            this.conversationId = arguments.getString(ARG_CONVERSATION_ID);
            String string = arguments.getString(ARG_MESSAGING_SCREEN_NAVIGATION_LOGIC);
            this.messagingScreenNavigation = string != null ? (MessagingScreen) n90.c.f30748d.b(MessagingScreen.INSTANCE.serializer(), string) : null;
            this.shouldStartDefaultConversation = Boolean.valueOf(arguments.getBoolean(ARG_SHOULD_START_DEFAULT_CONVERSATION));
        }
        if (savedInstanceState == null || (strE = savedInstanceState.getString(ATTACHMENT_LAUNCHER_UUID_KEY)) == null) {
            strE = j4.s.e();
        }
        this.attachmentLauncherUuid = strE;
        setupAttachmentIntentLauncher();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ConversationScreenCoordinator conversationScreenCoordinator;
        o0 activity = getActivity();
        if (activity != null && !activity.isChangingConfigurations() && (conversationScreenCoordinator = this.conversationScreenCoordinator) != null) {
            conversationScreenCoordinator.clearNewMessagesDivider$zendesk_messaging_messaging_android();
        }
        remove();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        super.onSaveInstanceState(outState);
        String str = this.attachmentLauncherUuid;
        if (str != null) {
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("attachmentLauncherUuid");
                str = null;
            }
            outState.putString(ATTACHMENT_LAUNCHER_UUID_KEY, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        y1 conversationScreenStateFlow;
        ConversationScreenState conversationScreenState;
        Conversation conversation;
        ConversationScreenViewModel conversationScreenViewModel = this.conversationScreenViewModel;
        setHiddenScreen((conversationScreenViewModel == null || (conversationScreenStateFlow = conversationScreenViewModel.getConversationScreenStateFlow()) == null || (conversationScreenState = (ConversationScreenState) conversationScreenStateFlow.getValue()) == null || (conversation = conversationScreenState.getConversation()) == null) ? null : conversation.getId());
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.onBackPressedCallback, viewLifecycleOwner);
        this.conversationView = (Renderer) view.findViewById(R.id.zma_conversation_screen_conversation);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        f0.B(m1.c(viewLifecycleOwner2), null, null, new AnonymousClass1(null), 3);
    }

    public final void setBackNavigationResolver(@NotNull BackNavigationResolver backNavigationResolver) {
        backNavigationResolver.getClass();
        this.backNavigationResolver = backNavigationResolver;
    }

    public final void setConversationScreenViewModelFactory(@NotNull ConversationScreenViewModelFactory conversationScreenViewModelFactory) {
        conversationScreenViewModelFactory.getClass();
        this.conversationScreenViewModelFactory = conversationScreenViewModelFactory;
    }

    public final void setFeatureFlagManager(@NotNull FeatureFlagManager featureFlagManager) {
        featureFlagManager.getClass();
        this.featureFlagManager = featureFlagManager;
    }

    public final void setGuideKit(@NotNull GuideKit guideKit) {
        guideKit.getClass();
        this.guideKit = guideKit;
    }

    public final void setMessagingNavigator(@NotNull MessagingNavigator messagingNavigator) {
        messagingNavigator.getClass();
        this.messagingNavigator = messagingNavigator;
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

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationFragment$Companion;", "", "<init>", "()V", "COORDINATOR_INITIALIZATION_TIMEOUT", "", "COORDINATOR_INITIALIZATION_DELAY", "NAME", "", "INTENT_URI_SCHEMA", "ARG_CREDENTIALS", "ARG_CONVERSATION_ID", "ARG_MESSAGING_SCREEN_NAVIGATION_LOGIC", "ARG_SHOULD_START_DEFAULT_CONVERSATION", "ATTACHMENT_LAUNCHER_UUID_KEY", "LOG_TAG", "newInstance", "Lzendesk/messaging/android/internal/conversationscreen/ConversationFragment;", "credentials", "conversationId", "proactiveNotificationId", "", "messagingScreenNavigation", "Lzendesk/android/messaging/MessagingScreen;", "shouldStartDefaultConversation", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lzendesk/android/messaging/MessagingScreen;Ljava/lang/Boolean;)Lzendesk/messaging/android/internal/conversationscreen/ConversationFragment;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConversationFragment newInstance$default(Companion companion, String str, String str2, Integer num, MessagingScreen messagingScreen, Boolean bool, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                num = null;
            }
            if ((i11 & 8) != 0) {
                messagingScreen = null;
            }
            if ((i11 & 16) != 0) {
                bool = Boolean.FALSE;
            }
            return companion.newInstance(str, str2, num, messagingScreen, bool);
        }

        @NotNull
        public final ConversationFragment newInstance(@NotNull String credentials, @Nullable String conversationId, @Nullable Integer proactiveNotificationId, @Nullable MessagingScreen messagingScreenNavigation, @Nullable Boolean shouldStartDefaultConversation) {
            credentials.getClass();
            ConversationFragment conversationFragment = new ConversationFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ConversationFragment.ARG_CREDENTIALS, credentials);
            bundle.putString(ConversationFragment.ARG_CONVERSATION_ID, conversationId);
            bundle.putBoolean(ConversationFragment.ARG_SHOULD_START_DEFAULT_CONVERSATION, shouldStartDefaultConversation != null ? shouldStartDefaultConversation.booleanValue() : false);
            bundle.putString(ConversationFragment.ARG_MESSAGING_SCREEN_NAVIGATION_LOGIC, messagingScreenNavigation != null ? n90.c.f30748d.c(MessagingScreen.INSTANCE.serializer(), messagingScreenNavigation) : null);
            if (proactiveNotificationId != null) {
                bundle.putInt(NotificationBuilder.PROACTIVE_NOTIFICATION_ID, proactiveNotificationId.intValue());
            }
            conversationFragment.setArguments(bundle);
            return conversationFragment;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getUserDarkColors$annotations() {
    }

    public static /* synthetic */ void getUserLightColors$annotations() {
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements y80.j {
        public AnonymousClass2() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent r8, x70.c<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2$emit$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2$emit$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                y70.a r1 = y70.a.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2f
                java.lang.Object r8 = r0.L$1
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r0 = r0.L$0
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent) r0
                ba0.g.M(r9)
                goto L5e
            L2f:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r8)
            L34:
                r8 = 0
                return r8
            L36:
                ba0.g.M(r9)
                boolean r9 = r8 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent.LaunchConversationExtension
                r2 = 0
                if (r9 == 0) goto L83
                r9 = r8
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent$LaunchConversationExtension r9 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent.LaunchConversationExtension) r9
                java.lang.String r9 = r9.getConversationId()
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment r4 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.this
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r4 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$getConversationScreenViewModel$p(r4)
                if (r4 == 0) goto L63
                r0.L$0 = r8
                r0.L$1 = r9
                r0.label = r3
                java.lang.Object r0 = r4.conversationId$zendesk_messaging_messaging_android(r0)
                if (r0 != r1) goto L5a
                return r1
            L5a:
                r6 = r0
                r0 = r8
                r8 = r9
                r9 = r6
            L5e:
                r2 = r9
                java.lang.String r2 = (java.lang.String) r2
                r9 = r8
                r8 = r0
            L63:
                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r2)
                if (r9 == 0) goto La8
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment r0 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.this
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent$LaunchConversationExtension r8 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent.LaunchConversationExtension) r8
                java.lang.String r1 = r8.getUrl()
                zendesk.core.ui.android.internal.model.MessageActionSize r2 = r8.getSize()
                zendesk.messaging.android.internal.analytics.ExtensionsLaunchType r3 = zendesk.messaging.android.internal.analytics.ExtensionsLaunchType.AUTOMATICAL
                zendesk.core.ui.android.internal.model.MessageSourceType r4 = r8.getSourceType()
                java.lang.String r5 = r8.getConversationId()
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$launchConversationExtension(r0, r1, r2, r3, r4, r5)
                goto La8
            L83:
                boolean r9 = r8 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent.OpenFileAttachment
                if (r9 == 0) goto L8f
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment r9 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.this
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent$OpenFileAttachment r8 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent.OpenFileAttachment) r8
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$openFileFromStorage(r9, r8)
                goto La8
            L8f:
                boolean r9 = r8 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent.StartPolling
                if (r9 == 0) goto L99
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.this
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$startPolling(r8)
                goto La8
            L99:
                boolean r8 = r8 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent.StopPolling
                if (r8 == 0) goto Lab
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.this
                v80.i1 r8 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$getPollingJob$p(r8)
                if (r8 == 0) goto La8
                r8.a(r2)
            La8:
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            Lab:
                e40.a.f()
                goto L34
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationFragment.AnonymousClass2.emit(zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent, x70.c):java.lang.Object");
        }

        @Override // y80.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, x70.c cVar) {
            return emit((ConversationScreenEvent) obj, (x70.c<? super Unit>) cVar);
        }
    }
}
