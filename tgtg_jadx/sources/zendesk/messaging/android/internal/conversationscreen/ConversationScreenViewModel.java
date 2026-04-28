package zendesk.messaging.android.internal.conversationscreen;

import android.net.Uri;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.braze.Constants;
import com.braze.h2;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.gms.internal.measurement.cg;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qc.y;
import v80.b0;
import v80.f0;
import v80.i1;
import y80.a2;
import y80.f1;
import y80.h1;
import y80.y1;
import zendesk.android.Zendesk;
import zendesk.android.events.ZendeskMessage;
import zendesk.android.events.ZendeskRole;
import zendesk.android.messaging.MessagingScreen;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.ConversationKitEventListener;
import zendesk.conversationkit.android.internal.user.UserExtensionsKt;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.Author;
import zendesk.conversationkit.android.model.AuthorType;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.core.android.internal.DateKtxKt;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.ConversationTitleProvider;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.NewMessagesDividerHandler;
import zendesk.messaging.android.internal.NewMessagesDividerHandlerKt;
import zendesk.messaging.android.internal.UploadFileResourceProvider;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.analytics.AnalyticsEventType;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.analytics.ExtensionsLaunchType;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepositoryEvent;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvent;
import zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper;
import zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerAnalyticsEvent;
import zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.extension.ConversationKtxKt;
import zendesk.messaging.android.internal.extension.ZendeskKtxKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;
import zendesk.messaging.android.internal.model.LoadMoreStatus;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.messaging.android.internal.model.TypingUser;
import zendesk.messaging.android.internal.model.UploadFile;
import zendesk.messaging.android.internal.proactivemessaging.ProactiveMessageEvent;
import zendesk.messaging.android.push.internal.NotificationBuilder;
import zendesk.ui.android.conversation.form.DisplayedField;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Ý\u00012\u00020\u0001:\u0002Ý\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u001b\u0010)\u001a\u00020#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020#2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020#2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020#2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b.\u0010,J\u0015\u00101\u001a\u00020#2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020#¢\u0006\u0004\b3\u00104J\u0010\u0010!\u001a\u00020 H\u0080@¢\u0006\u0004\b5\u00106J\u0017\u0010;\u001a\u00020#2\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020#H\u0017¢\u0006\u0004\b<\u00104J\u0015\u0010=\u001a\u00020#2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b=\u0010,J\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020#0>¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020#2\u0006\u0010A\u001a\u00020 ¢\u0006\u0004\bB\u0010,J\u0015\u0010D\u001a\u00020#2\u0006\u0010C\u001a\u00020 ¢\u0006\u0004\bD\u0010,J\r\u0010E\u001a\u00020#¢\u0006\u0004\bE\u00104J\u0015\u0010H\u001a\u00020#2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u0017\u0010M\u001a\u00020L2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020#H\u0002¢\u0006\u0004\bO\u00104J\u000f\u0010P\u001a\u00020#H\u0002¢\u0006\u0004\bP\u00104J\u000f\u0010Q\u001a\u00020#H\u0002¢\u0006\u0004\bQ\u00104J\u000f\u0010R\u001a\u00020#H\u0002¢\u0006\u0004\bR\u00104J\u000f\u0010S\u001a\u00020#H\u0002¢\u0006\u0004\bS\u00104J\u000f\u0010T\u001a\u00020#H\u0002¢\u0006\u0004\bT\u00104J\u0019\u0010U\u001a\u00020#2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bU\u0010,J\u0017\u0010X\u001a\u00020#2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020#H\u0002¢\u0006\u0004\bZ\u00104J\u0017\u0010[\u001a\u00020#2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\b[\u0010YJ\u0017\u0010]\u001a\u00020#2\u0006\u0010W\u001a\u00020\\H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010a\u001a\u00020#2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020#2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\bc\u0010,J\u0017\u0010d\u001a\u00020#2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\bd\u0010,J\u0017\u0010g\u001a\u00020#2\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020#H\u0002¢\u0006\u0004\bi\u00104J\u0017\u0010k\u001a\u00020#2\u0006\u0010W\u001a\u00020jH\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020#H\u0002¢\u0006\u0004\bm\u00104J)\u0010o\u001a\u00020#*\u00020\f2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020n0&2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\bo\u0010pJ/\u0010u\u001a\u00020#2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010 2\u0006\u0010s\u001a\u00020r2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bu\u0010vJ\u0019\u0010y\u001a\u00020#2\b\b\u0002\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zJ\u001a\u0010|\u001a\u00020#2\b\b\u0002\u0010{\u001a\u00020wH\u0082@¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u00020#H\u0002¢\u0006\u0004\b~\u00104J\u0019\u0010\u0080\u0001\u001a\u00020#2\u0006\u0010\u007f\u001a\u00020wH\u0002¢\u0006\u0005\b\u0080\u0001\u0010zJS\u0010\u0089\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0085\u0001\u001a\u00020w2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010 2\t\b\u0002\u0010\u0087\u0001\u001a\u00020 2\u000b\b\u0002\u0010s\u001a\u0005\u0018\u00010\u0088\u0001H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J=\u0010\u0090\u0001\u001a\u00020 2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010 2\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010 2\u0007\u0010\u008f\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J1\u0010\u0095\u0001\u001a\u00020 2\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010 2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010 2\u0007\u0010\u0094\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J=\u0010\u0097\u0001\u001a\u00020 2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010 2\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010 2\u0007\u0010\u008f\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0091\u0001J\u001c\u0010\u0099\u0001\u001a\u00020#2\u0007\u00100\u001a\u00030\u0098\u0001H\u0082@¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001d\u0010\u009b\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001d\u0010\u009d\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009c\u0001J&\u0010\u009e\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010 \u0001\u001a\u00030\u0083\u00012\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0006\b \u0001\u0010¡\u0001J&\u0010¢\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0006\b¢\u0001\u0010\u009f\u0001J&\u0010£\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0006\b£\u0001\u0010\u009f\u0001J\u0019\u0010¤\u0001\u001a\u00020#2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0005\b¤\u0001\u0010YJ\u0015\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001c\u0010©\u0001\u001a\u00020w2\b\u0010¨\u0001\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010«\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010¬\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u00ad\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010®\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010¯\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010°\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010±\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010²\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010³\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010´\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010µ\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010¶\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010·\u0001R\u001f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030¹\u00010¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\"\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030¹\u00010>8\u0006¢\u0006\u000f\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0005\b¾\u0001\u0010@R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010¿\u0001R\u001c\u0010À\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001b\u0010Â\u0001\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001b\u0010Ä\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010¿\u0001R\u001f\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00018\u0006¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0019\u0010Ê\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0019\u0010Ì\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Ë\u0001R\u0019\u0010Í\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Ë\u0001R$\u0010Ï\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0&0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u001f\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Ð\u0001R$\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010Õ\u00018\u0006¢\u0006\u0010\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u001c\u0010Û\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006Þ\u0001"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel;", "Landroidx/lifecycle/l1;", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper;", "messageLogEntryMapper", "Lzendesk/messaging/android/internal/NewMessagesDividerHandler;", "newMessagesDividerHandler", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "visibleScreenTracker", "Lv80/b0;", "sdkCoroutineScope", "Lzendesk/messaging/android/internal/UploadFileResourceProvider;", "uploadFileResourceProvider", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository;", "conversationScreenRepository", "Lzendesk/messaging/android/internal/conversationscreen/ConversationTypingEvents;", "conversationTypingEvents", "Lzendesk/messaging/android/internal/ConversationTitleProvider;", "conversationTitleProvider", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService;", "waitTimeBannerService", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "<init>", "(Lzendesk/android/messaging/model/MessagingSettings;Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper;Lzendesk/messaging/android/internal/NewMessagesDividerHandler;Landroidx/lifecycle/c1;Lzendesk/messaging/android/internal/VisibleScreenTracker;Lv80/b0;Lzendesk/messaging/android/internal/UploadFileResourceProvider;Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository;Lzendesk/messaging/android/internal/conversationscreen/ConversationTypingEvents;Lzendesk/messaging/android/internal/ConversationTitleProvider;Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;)V", "Lzendesk/ui/android/conversation/form/DisplayedField;", "field", "", "conversationId", "formId", "", "updateListOfStoredForm", "(Lzendesk/ui/android/conversation/form/DisplayedField;Ljava/lang/String;Ljava/lang/String;)V", "", "Landroid/net/Uri;", "uriList", "saveRestoredUris", "(Ljava/util/List;)V", "subscribeTypingEventsToLifecycle", "(Ljava/lang/String;)V", "onTyping", "onSendMessage", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "conversationScreenAction", "dispatchAction", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;)V", "clearNewMessagesDivider", "()V", "conversationId$zendesk_messaging_messaging_android", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "newTheme", "refreshTheme$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "refreshTheme", "onCleared", "loadConversation", "Ly80/i;", "startPolling", "()Ly80/i;", "size", "processConversationExtensionClickedEvent", Constants.BRAZE_WEBVIEW_URL_EXTRA, "processConversationExtensionOpenedEvent", "processMessagingClosedEvent", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "senderType", "processGuideArticleClickedEvent", "(Lzendesk/core/ui/android/internal/model/MessageSourceType;)V", "Lzendesk/conversationkit/android/model/Message;", InAppMessageBase.MESSAGE, "Lzendesk/android/events/ZendeskMessage;", "toEventsMessage", "(Lzendesk/conversationkit/android/model/Message;)Lzendesk/android/events/ZendeskMessage;", "emitConversationOpenedEvent", "collectMessagesShownEventData", "setupWaitTimeBannerService", "collectWaitTimeBannerEvents", "resumeConversationKitConnection", "collectChannelEvents", "updateDisplayedFormsFromStorage", "Lzendesk/conversationkit/android/ConversationKitEvent$ConversationUpdated;", "conversationKitEvent", "handleConversationUpdated", "(Lzendesk/conversationkit/android/ConversationKitEvent$ConversationUpdated;)V", "proactiveMessagingInitialization", "analyticsProactiveMessageReplayedTo", "Lzendesk/conversationkit/android/ConversationKitEvent$ConnectionStatusChanged;", "handleConnectionStatusChanged", "(Lzendesk/conversationkit/android/ConversationKitEvent$ConnectionStatusChanged;)V", "Lzendesk/conversationkit/android/ConversationKitEvent$OpenWebViewMessageReceived;", "openWebViewMessageReceived", "handleMessageWebViewReceived", "(Lzendesk/conversationkit/android/ConversationKitEvent$OpenWebViewMessageReceived;)V", "handleMessageReceived", "handleMessageUpdated", "Lzendesk/conversationkit/android/ConversationKitEvent$ActivityEventReceived;", "activityEventReceived", "handleActivityEventReceived", "(Lzendesk/conversationkit/android/ConversationKitEvent$ActivityEventReceived;)V", "handlePostbackFailure", "Lzendesk/conversationkit/android/ConversationKitEvent$PostbackSuccess;", "handlePostbackSuccess", "(Lzendesk/conversationkit/android/ConversationKitEvent$PostbackSuccess;)V", "collectTypingEvents", "Lzendesk/messaging/android/internal/model/UploadFile;", "uploadFiles", "(Lv80/b0;Ljava/util/List;Ljava/lang/String;)V", "actionId", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenPostbackStatus;", "status", TextBundle.TEXT_ENTRY, "updatePostbackMessageStatus", "(Ljava/lang/String;Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenPostbackStatus;Ljava/lang/String;)V", "", "forcedScrolling", "showLoadingAndRefreshState", "(Z)V", "shouldScroll", "refreshState", "(ZLx70/c;)Ljava/lang/Object;", "updateProactiveParams", "isRevoked", "updateUserAccessRevokedState", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "conversationScreenState", "Lzendesk/conversationkit/android/model/Conversation;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "scrollToBottom", "authorizationToken", "composerText", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenStatus;", "conversationState", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;Lzendesk/conversationkit/android/model/Conversation;ZLjava/lang/String;Ljava/lang/String;Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenStatus;)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "displayName", "Ljava/util/Date;", "createdAt", "lastBusinessParticipantName", "settingsTitle", "provideConversationTitle", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "customIconUrl", "lastBusinessAvatarUrl", "settingsLogoUrl", "provideConversationIconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "provideAccessibilityTitle", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$LoadMoreMessages;", "loadMoreMessages", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$LoadMoreMessages;Lx70/c;)Ljava/lang/Object;", "showDeniedPermission", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "hideDeniedPermission", "showLoadMoreMessagesProgressBar", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getUpdatedConversation", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "hideLoadMoreMessagesProgressBar", "failedLoadMoreMessagesProgressBar", "updateNewMessagesDividerDate", "", "withReferralInfo", "()Ljava/lang/Integer;", "updatedConversation", "shouldConversationScrollToBottom", "(Lzendesk/conversationkit/android/model/Conversation;)Z", "Lzendesk/android/messaging/model/MessagingSettings;", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper;", "Lzendesk/messaging/android/internal/NewMessagesDividerHandler;", "Landroidx/lifecycle/c1;", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "Lv80/b0;", "Lzendesk/messaging/android/internal/UploadFileResourceProvider;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationTypingEvents;", "Lzendesk/messaging/android/internal/ConversationTitleProvider;", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "Lx80/m;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent;", "_eventsChannel", "Lx80/m;", "eventsChannel", "Ly80/i;", "getEventsChannel", "Ljava/lang/String;", "proactiveNotificationId", "Ljava/lang/Integer;", "shouldStartDefaultConversation", "Ljava/lang/Boolean;", "messagingScreenNavigation", "Lzendesk/android/messaging/MessagingScreen;", "messagingScreen", "Lzendesk/android/messaging/MessagingScreen;", "getMessagingScreen", "()Lzendesk/android/messaging/MessagingScreen;", "hasSentProactiveReferral", "Z", "hasRepliedToProactiveMessage", "userAccessHasBeenRevoked", "Ly80/f1;", "eventMessagesFlow", "Ly80/f1;", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "eventListener", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "_conversationScreenStateFlow", "Ly80/y1;", "conversationScreenStateFlow", "Ly80/y1;", "getConversationScreenStateFlow", "()Ly80/y1;", "Lv80/i1;", "refreshStateJob", "Lv80/i1;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,1485:1\n1563#2:1486\n1634#2,3:1487\n774#2:1495\n865#2,2:1496\n774#2:1498\n865#2,2:1499\n1878#2,3:1546\n230#3,5:1490\n230#3,5:1501\n230#3,5:1506\n230#3,5:1511\n230#3,5:1516\n230#3,5:1521\n230#3,5:1526\n230#3,5:1531\n230#3,5:1536\n230#3,5:1541\n230#3,5:1549\n230#3,5:1554\n230#3,5:1559\n230#3,5:1565\n230#3,5:1570\n230#3,5:1575\n230#3,5:1585\n230#3,5:1590\n230#3,5:1595\n1#4:1564\n56#5:1580\n59#5:1584\n46#6:1581\n51#6:1583\n105#7:1582\n*S KotlinDebug\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel\n*L\n386#1:1486\n386#1:1487,3\n425#1:1495\n425#1:1496,2\n428#1:1498\n428#1:1499,2\n872#1:1546,3\n407#1:1490,5\n457#1:1501,5\n538#1:1506,5\n552#1:1511,5\n589#1:1516,5\n768#1:1521,5\n774#1:1526,5\n778#1:1531,5\n804#1:1536,5\n829#1:1541,5\n923#1:1549,5\n976#1:1554,5\n987#1:1559,5\n1185#1:1565,5\n1192#1:1570,5\n1195#1:1575,5\n1349#1:1585,5\n166#1:1590,5\n182#1:1595,5\n1333#1:1580\n1333#1:1584\n1333#1:1581\n1333#1:1583\n1333#1:1582\n*E\n"})
public final class ConversationScreenViewModel extends l1 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String HAS_REPLIED_TO_PROACTIVE_MESSAGE = "HAS_REPLIED_TO_PROACTIVE_MESSAGE";

    @NotNull
    private static final String HAS_SENT_PROACTIVE_REFERRAL_DATA = "HAS_SENT_PROACTIVE_REFERRAL_DATA";

    @NotNull
    private static final String KEY_USER_ACCESS_REVOKED = "KEY_USER_ACCESS_REVOKED";

    @NotNull
    private static final String LOG_TAG = "ConversationScreenVM";

    @NotNull
    private static final String RESTORED_URIS_KEY = "RESTORED_URIS_KEY";

    @NotNull
    private final f1 _conversationScreenStateFlow;

    @NotNull
    private final x80.m _eventsChannel;

    @NotNull
    private final AnalyticsProcessor analyticsProcessor;

    @Nullable
    private String conversationId;

    @NotNull
    private final ConversationScreenRepository conversationScreenRepository;

    @NotNull
    private final y1 conversationScreenStateFlow;

    @NotNull
    private final ConversationTitleProvider conversationTitleProvider;

    @NotNull
    private final ConversationTypingEvents conversationTypingEvents;

    @NotNull
    private final ConversationKitEventListener eventListener;

    @NotNull
    private final f1 eventMessagesFlow;

    @NotNull
    private final y80.i eventsChannel;
    private boolean hasRepliedToProactiveMessage;
    private boolean hasSentProactiveReferral;

    @NotNull
    private final MessageLogEntryMapper messageLogEntryMapper;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    @Nullable
    private final MessagingScreen messagingScreen;

    @Nullable
    private String messagingScreenNavigation;

    @NotNull
    private final MessagingSettings messagingSettings;

    @NotNull
    private final NewMessagesDividerHandler newMessagesDividerHandler;

    @Nullable
    private Integer proactiveNotificationId;

    @Nullable
    private i1 refreshStateJob;

    @NotNull
    private final c1 savedStateHandle;

    @NotNull
    private final b0 sdkCoroutineScope;

    @Nullable
    private Boolean shouldStartDefaultConversation;

    @NotNull
    private final UploadFileResourceProvider uploadFileResourceProvider;
    private boolean userAccessHasBeenRevoked;

    @NotNull
    private final VisibleScreenTracker visibleScreenTracker;

    @NotNull
    private final WaitTimeBannerService waitTimeBannerService;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadMoreStatus.values().length];
            try {
                iArr[LoadMoreStatus.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadMoreStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadMoreStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$clearNewMessagesDivider$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$clearNewMessagesDivider$1", f = "ConversationScreenViewModel.kt", l = {1316}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            NewMessagesDividerHandler newMessagesDividerHandler;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                NewMessagesDividerHandler newMessagesDividerHandler2 = ConversationScreenViewModel.this.newMessagesDividerHandler;
                ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
                this.L$0 = newMessagesDividerHandler2;
                this.label = 1;
                Object objConversationId$zendesk_messaging_messaging_android = conversationScreenViewModel.conversationId$zendesk_messaging_messaging_android(this);
                if (objConversationId$zendesk_messaging_messaging_android == aVar) {
                    return aVar;
                }
                newMessagesDividerHandler = newMessagesDividerHandler2;
                obj = objConversationId$zendesk_messaging_messaging_android;
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                newMessagesDividerHandler = (NewMessagesDividerHandler) this.L$0;
                ba0.g.M(obj);
            }
            newMessagesDividerHandler.clearNewMessageDividerDate((String) obj);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectChannelEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectChannelEvents$1", f = "ConversationScreenViewModel.kt", l = {328}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04011 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C04011(x70.c<? super C04011> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04011(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04011) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                y80.i eventsChannel = ConversationScreenViewModel.this.conversationScreenRepository.getEventsChannel();
                final ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
                y80.j jVar = new y80.j() { // from class: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.collectChannelEvents.1.1
                    public final Object emit(ConversationScreenRepositoryEvent conversationScreenRepositoryEvent, x70.c<? super Unit> cVar) {
                        if (!(conversationScreenRepositoryEvent instanceof ConversationScreenRepositoryEvent.UpdateProactiveReferralData)) {
                            e40.a.f();
                            return null;
                        }
                        if (conversationScreenViewModel.proactiveNotificationId != null && !conversationScreenViewModel.hasSentProactiveReferral) {
                            conversationScreenViewModel.hasSentProactiveReferral = true;
                            conversationScreenViewModel.savedStateHandle.d(Boolean.TRUE, ConversationScreenViewModel.HAS_SENT_PROACTIVE_REFERRAL_DATA);
                            conversationScreenViewModel.updateProactiveParams();
                        }
                        return Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, x70.c cVar) {
                        return emit((ConversationScreenRepositoryEvent) obj2, (x70.c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (eventsChannel.collect(jVar, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$1", f = "ConversationScreenViewModel.kt", l = {257}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04021 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C04021(x70.c<? super C04021> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04021(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04021) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                y1 conversationScreenStateFlow = ConversationScreenViewModel.this.getConversationScreenStateFlow();
                final ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
                y80.j jVar = new y80.j() { // from class: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.collectMessagesShownEventData.1.1
                    public final Object emit(ConversationScreenState conversationScreenState, x70.c<? super Unit> cVar) {
                        a2 a2Var;
                        Object value;
                        List arrayList;
                        List<Message> messages;
                        f1 f1Var = conversationScreenViewModel.eventMessagesFlow;
                        ConversationScreenViewModel conversationScreenViewModel2 = conversationScreenViewModel;
                        do {
                            a2Var = (a2) f1Var;
                            value = a2Var.getValue();
                            Conversation conversation = conversationScreenState.getConversation();
                            if (conversation == null || (messages = conversation.getMessages()) == null) {
                                arrayList = n0.f26529a;
                            } else {
                                arrayList = new ArrayList(e0.o(messages, 10));
                                Iterator<T> it = messages.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(conversationScreenViewModel2.toEventsMessage((Message) it.next()));
                                }
                            }
                        } while (!a2Var.g(value, arrayList));
                        return Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, x70.c cVar) {
                        return emit((ConversationScreenState) obj2, (x70.c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (conversationScreenStateFlow.collect(jVar, this) == aVar) {
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
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2", f = "ConversationScreenViewModel.kt", l = {266}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$collectMessagesShownEventData$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,1485:1\n24#2:1486\n26#2:1490\n46#3:1487\n51#3:1489\n105#4:1488\n*S KotlinDebug\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$collectMessagesShownEventData$2\n*L\n265#1:1486\n265#1:1490\n265#1:1487\n265#1:1489\n265#1:1488\n*E\n"})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                final f1 f1Var = ConversationScreenViewModel.this.eventMessagesFlow;
                y80.i iVar = new y80.i() { // from class: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1

                    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$collectMessagesShownEventData$2\n*L\n1#1,49:1\n25#2:50\n26#2:52\n265#3:51\n*E\n"})
                    public static final class AnonymousClass2<T> implements y80.j {
                        final /* synthetic */ y80.j $this_unsafeFlow;

                        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1$2", f = "ConversationScreenViewModel.kt", l = {50}, m = "emit")
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        public static final class AnonymousClass1 extends z70.c {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(x70.c cVar) {
                                super(cVar);
                            }

                            @Override // z70.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(y80.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // y80.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, x70.c r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1$2$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1$2$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                y70.a r1 = y70.a.COROUTINE_SUSPENDED
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L2e
                                if (r2 != r3) goto L27
                                ba0.g.M(r6)
                                goto L45
                            L27:
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                com.braze.h2.b(r5)
                                r5 = 0
                                return r5
                            L2e:
                                ba0.g.M(r6)
                                y80.j r6 = r4.$this_unsafeFlow
                                r2 = r5
                                java.util.List r2 = (java.util.List) r2
                                boolean r2 = r2.isEmpty()
                                if (r2 != 0) goto L45
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L45
                                return r1
                            L45:
                                kotlin.Unit r5 = kotlin.Unit.f26487a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectMessagesShownEventData$2$invokeSuspend$$inlined$filterNot$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                        }
                    }

                    @Override // y80.i
                    public Object collect(y80.j jVar, x70.c cVar) {
                        Object objCollect = f1Var.collect(new AnonymousClass2(jVar), cVar);
                        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
                    }
                };
                final ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
                y80.j jVar = new y80.j() { // from class: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.collectMessagesShownEventData.2.2
                    public final Object emit(List<ZendeskMessage> list, x70.c<? super Unit> cVar) {
                        Conversation conversation = ((ConversationScreenState) conversationScreenViewModel.getConversationScreenStateFlow().getValue()).getConversation();
                        String id2 = conversation != null ? conversation.getId() : null;
                        if (id2 != null) {
                            MessagingEventDispatcher.handleMessagesShownEvent$zendesk_messaging_messaging_android$default(conversationScreenViewModel.messagingEventDispatcher, null, 0L, id2, list, 3, null);
                        }
                        return Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, x70.c cVar) {
                        return emit((List<ZendeskMessage>) obj2, (x70.c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (iVar.collect(jVar, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectTypingEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectTypingEvents$1", f = "ConversationScreenViewModel.kt", l = {632}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04031 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C04031(x70.c<? super C04031> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04031(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04031) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                y80.i typingEventChannel = ConversationScreenViewModel.this.conversationTypingEvents.getTypingEventChannel();
                final ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
                y80.j jVar = new y80.j() { // from class: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.collectTypingEvents.1.1
                    public final Object emit(ConversationTypingEvent conversationTypingEvent, x70.c<? super Unit> cVar) {
                        if (conversationTypingEvent instanceof ConversationTypingEvent.TypingStart) {
                            conversationScreenViewModel.dispatchAction(new ConversationScreenAction.SendActivityData(ActivityData.TYPING_START, ((ConversationTypingEvent.TypingStart) conversationTypingEvent).getConversationId()));
                        } else {
                            if (!(conversationTypingEvent instanceof ConversationTypingEvent.TypingStop)) {
                                e40.a.f();
                                return null;
                            }
                            conversationScreenViewModel.dispatchAction(new ConversationScreenAction.SendActivityData(ActivityData.TYPING_STOP, ((ConversationTypingEvent.TypingStop) conversationTypingEvent).getConversationId()));
                        }
                        return Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, x70.c cVar) {
                        return emit((ConversationTypingEvent) obj2, (x70.c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (typingEventChannel.collect(jVar, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$1", f = "ConversationScreenViewModel.kt", l = {672, 678, 681, 686}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$dispatchAction$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1485:1\n2746#2,3:1486\n230#3,5:1489\n*S KotlinDebug\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$dispatchAction$1\n*L\n673#1:1486,3\n691#1:1489,5\n*E\n"})
    public static final class C04051 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ ConversationScreenAction $conversationScreenAction;
        final /* synthetic */ Message $message;
        int label;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConversationScreenAction.SendTextMessage.TextMessageSource.values().length];
                try {
                    iArr[ConversationScreenAction.SendTextMessage.TextMessageSource.INPUT_FIELD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ConversationScreenAction.SendTextMessage.TextMessageSource.QUICK_REPLY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04051(String str, ConversationScreenAction conversationScreenAction, Message message, x70.c<? super C04051> cVar) {
            super(2, cVar);
            this.$conversationId = str;
            this.$conversationScreenAction = conversationScreenAction;
            this.$message = message;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04051(this.$conversationId, this.$conversationScreenAction, this.$message, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04051) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        
            if (r2.updateComposerText(r4, "", r34) != r1) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04051.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$10", f = "ConversationScreenViewModel.kt", l = {786}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass10 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ String $updatedText;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(String str, String str2, x70.c<? super AnonymousClass10> cVar) {
            super(2, cVar);
            this.$conversationId = str;
            this.$updatedText = str2;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new AnonymousClass10(this.$conversationId, this.$updatedText, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass10) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenRepository conversationScreenRepository = ConversationScreenViewModel.this.conversationScreenRepository;
                String str = this.$conversationId;
                String str2 = this.$updatedText;
                this.label = 1;
                if (conversationScreenRepository.persistComposerText(str, str2, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$11", f = "ConversationScreenViewModel.kt", l = {795}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass11 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ ConversationScreenAction $conversationScreenAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(ConversationScreenAction conversationScreenAction, x70.c<? super AnonymousClass11> cVar) {
            super(2, cVar);
            this.$conversationScreenAction = conversationScreenAction;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new AnonymousClass11(this.$conversationScreenAction, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass11) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
                ConversationScreenAction.LoadMoreMessages loadMoreMessages = (ConversationScreenAction.LoadMoreMessages) this.$conversationScreenAction;
                this.label = 1;
                if (conversationScreenViewModel.loadMoreMessages(loadMoreMessages, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$13, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$13", f = "ConversationScreenViewModel.kt", l = {821}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass13 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $actionId;
        final /* synthetic */ ConversationScreenAction $conversationScreenAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(ConversationScreenAction conversationScreenAction, String str, x70.c<? super AnonymousClass13> cVar) {
            super(2, cVar);
            this.$conversationScreenAction = conversationScreenAction;
            this.$actionId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new AnonymousClass13(this.$conversationScreenAction, this.$actionId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass13) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenRepository conversationScreenRepository = ConversationScreenViewModel.this.conversationScreenRepository;
                String conversationId = ((ConversationScreenAction.SendPostbackMessage) this.$conversationScreenAction).getConversationId();
                String str = this.$actionId;
                this.label = 1;
                if (conversationScreenRepository.sendPostbackMessage(conversationId, str, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$15, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$15", f = "ConversationScreenViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$dispatchAction$15\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,1485:1\n1563#2:1486\n1634#2,2:1487\n1636#2:1490\n29#3:1489\n*S KotlinDebug\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$dispatchAction$15\n*L\n840#1:1486\n840#1:1487,2\n840#1:1490\n840#1:1489\n*E\n"})
    public static final class AnonymousClass15 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ ConversationScreenAction $conversationScreenAction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(ConversationScreenAction conversationScreenAction, x70.c<? super AnonymousClass15> cVar) {
            super(2, cVar);
            this.$conversationScreenAction = conversationScreenAction;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            AnonymousClass15 anonymousClass15 = ConversationScreenViewModel.this.new AnonymousClass15(this.$conversationScreenAction, cVar);
            anonymousClass15.L$0 = obj;
            return anonymousClass15;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass15) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            Iterable iterable = (List) ConversationScreenViewModel.this.savedStateHandle.a(ConversationScreenViewModel.RESTORED_URIS_KEY);
            if (iterable == null) {
                iterable = n0.f26529a;
            }
            ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
            ArrayList arrayList = new ArrayList(e0.o(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(conversationScreenViewModel.uploadFileResourceProvider.getUploadFileFromIntent$zendesk_messaging_messaging_android(Uri.parse((String) it.next())));
            }
            ConversationScreenViewModel.this.uploadFiles(b0Var, arrayList, ((ConversationScreenAction.UploadFilesForRestoredUris) this.$conversationScreenAction).getConversationId());
            ConversationScreenViewModel.this.savedStateHandle.d(n0.f26529a, ConversationScreenViewModel.RESTORED_URIS_KEY);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$16, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$16", f = "ConversationScreenViewModel.kt", l = {849, 848}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass16 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ ConversationScreenAction $conversationScreenAction;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(ConversationScreenAction conversationScreenAction, x70.c<? super AnonymousClass16> cVar) {
            super(2, cVar);
            this.$conversationScreenAction = conversationScreenAction;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new AnonymousClass16(this.$conversationScreenAction, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass16) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r1.downloadAttachment((java.lang.String) r6, r3, r5) == r0) goto L15;
         */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                ba0.g.M(r6)
                goto L4b
            L10:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r6)
                r6 = 0
                return r6
            L17:
                java.lang.Object r1 = r5.L$0
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository r1 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository) r1
                ba0.g.M(r6)
                goto L35
            L1f:
                ba0.g.M(r6)
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r6 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository r1 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getConversationScreenRepository$p(r6)
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r6 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.conversationId$zendesk_messaging_messaging_android(r5)
                if (r6 != r0) goto L35
                goto L4a
            L35:
                java.lang.String r6 = (java.lang.String) r6
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction r3 = r5.$conversationScreenAction
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction$ViewAttachment r3 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction.ViewAttachment) r3
                zendesk.conversationkit.android.model.Message r3 = r3.getMessage()
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r1.downloadAttachment(r6, r3, r5)
                if (r6 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r6 = kotlin.Unit.f26487a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.AnonymousClass16.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$2", f = "ConversationScreenViewModel.kt", l = {703}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04062 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ ConversationScreenAction $conversationScreenAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04062(ConversationScreenAction conversationScreenAction, String str, x70.c<? super C04062> cVar) {
            super(2, cVar);
            this.$conversationScreenAction = conversationScreenAction;
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04062(this.$conversationScreenAction, this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04062) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenRepository conversationScreenRepository = ConversationScreenViewModel.this.conversationScreenRepository;
                Message failedMessage = ((ConversationScreenAction.ResendFailedMessage) this.$conversationScreenAction).getFailedMessage();
                String str = this.$conversationId;
                this.label = 1;
                if (conversationScreenRepository.sendMessage(failedMessage, str, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$3", f = "ConversationScreenViewModel.kt", l = {726, 714}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass3 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ ConversationScreenAction $conversationScreenAction;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConversationScreenAction conversationScreenAction, String str, x70.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$conversationScreenAction = conversationScreenAction;
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new AnonymousClass3(this.$conversationScreenAction, this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
        
            if (r5.removeStoredForm(r6, r7, r20) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
        
            if (r2.sendMessage(r4, r5, r20) != r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
        
            return r1;
         */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$4", f = "ConversationScreenViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass4 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ ConversationScreenAction $conversationScreenAction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ConversationScreenAction conversationScreenAction, String str, x70.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$conversationScreenAction = conversationScreenAction;
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            AnonymousClass4 anonymousClass4 = ConversationScreenViewModel.this.new AnonymousClass4(this.$conversationScreenAction, this.$conversationId, cVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass4) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            ConversationScreenViewModel.this.uploadFiles((b0) this.L$0, ((ConversationScreenAction.UploadFiles) this.$conversationScreenAction).getUploads(), this.$conversationId);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$5", f = "ConversationScreenViewModel.kt", l = {754}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass5 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ ConversationScreenAction $conversationScreenAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ConversationScreenAction conversationScreenAction, String str, x70.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
            this.$conversationScreenAction = conversationScreenAction;
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new AnonymousClass5(this.$conversationScreenAction, this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass5) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenRepository conversationScreenRepository = ConversationScreenViewModel.this.conversationScreenRepository;
                ActivityData activityData = ((ConversationScreenAction.SendActivityData) this.$conversationScreenAction).getActivityData();
                String str = this.$conversationId;
                this.label = 1;
                if (conversationScreenRepository.sendActivityData(activityData, str, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$dispatchAction$6", f = "ConversationScreenViewModel.kt", l = {763}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass6 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass6(x70.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new AnonymousClass6(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass6) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenRepository conversationScreenRepository = ConversationScreenViewModel.this.conversationScreenRepository;
                this.label = 1;
                if (conversationScreenRepository.resume(this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$failedLoadMoreMessagesProgressBar$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel", f = "ConversationScreenViewModel.kt", l = {1296}, m = "failedLoadMoreMessagesProgressBar")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04071 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C04071(x70.c<? super C04071> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenViewModel.this.failedLoadMoreMessagesProgressBar(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$handleConnectionStatusChanged$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$handleConnectionStatusChanged$2", f = "ConversationScreenViewModel.kt", l = {472, 483}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04082 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C04082(x70.c<? super C04082> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04082(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04082) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        
            if (r1.loadMoreMessages(r3, r7) == r0) goto L19;
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
                goto L77
            L10:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r8)
                r8 = 0
                return r8
            L17:
                ba0.g.M(r8)
                goto L2b
            L1b:
                ba0.g.M(r8)
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                r7.label = r3
                r1 = 0
                r4 = 0
                java.lang.Object r8 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.refreshState$default(r8, r1, r7, r3, r4)
                if (r8 != r0) goto L2b
                goto L76
            L2b:
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                y80.f1 r8 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$get_conversationScreenStateFlow$p(r8)
                y80.a2 r8 = (y80.a2) r8
                java.lang.Object r8 = r8.getValue()
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r8 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenState) r8
                zendesk.messaging.android.internal.model.LoadMoreStatus r8 = r8.getLoadMoreStatus()
                zendesk.messaging.android.internal.model.LoadMoreStatus r1 = zendesk.messaging.android.internal.model.LoadMoreStatus.FAILED
                if (r8 != r1) goto L77
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                y80.f1 r8 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$get_conversationScreenStateFlow$p(r8)
                y80.a2 r8 = (y80.a2) r8
                java.lang.Object r8 = r8.getValue()
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r8 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenState) r8
                zendesk.conversationkit.android.model.Conversation r8 = r8.getConversation()
                if (r8 == 0) goto L77
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r1 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction$LoadMoreMessages r3 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction$LoadMoreMessages
                java.lang.String r4 = r8.getId()
                java.util.List r8 = r8.getMessages()
                java.lang.Object r8 = kotlin.collections.CollectionsKt.O(r8)
                zendesk.conversationkit.android.model.Message r8 = (zendesk.conversationkit.android.model.Message) r8
                double r5 = r8.getBeforeTimestamp()
                r3.<init>(r4, r5)
                r7.label = r2
                java.lang.Object r8 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$loadMoreMessages(r1, r3, r7)
                if (r8 != r0) goto L77
            L76:
                return r0
            L77:
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04082.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$handleMessageWebViewReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$handleMessageWebViewReceived$1", f = "ConversationScreenViewModel.kt", l = {501, 508}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04091 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ ConversationKitEvent.OpenWebViewMessageReceived $openWebViewMessageReceived;
        final /* synthetic */ MessageActionSize $size;
        long J$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04091(MessageActionSize messageActionSize, ConversationKitEvent.OpenWebViewMessageReceived openWebViewMessageReceived, x70.c<? super C04091> cVar) {
            super(2, cVar);
            this.$size = messageActionSize;
            this.$openWebViewMessageReceived = openWebViewMessageReceived;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04091(this.$size, this.$openWebViewMessageReceived, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04091) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            MessagingEventDispatcher messagingEventDispatcher;
            long j9;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                AnalyticsProcessor analyticsProcessor = ConversationScreenViewModel.this.analyticsProcessor;
                AnalyticsEventType.ConversationExtensionClicked conversationExtensionClicked = new AnalyticsEventType.ConversationExtensionClicked(ExtensionsLaunchType.AUTOMATICAL.getAnalyticsValue(), this.$size.getAnalyticsValue());
                this.label = 1;
                if (analyticsProcessor.process(conversationExtensionClicked, this) != aVar) {
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j11 = this.J$0;
                MessagingEventDispatcher messagingEventDispatcher2 = (MessagingEventDispatcher) this.L$0;
                ba0.g.M(obj);
                messagingEventDispatcher = messagingEventDispatcher2;
                j9 = j11;
                MessagingEventDispatcher.handleConversationExtensionOpenedEvent$zendesk_messaging_messaging_android$default(messagingEventDispatcher, null, j9, (String) obj, this.$openWebViewMessageReceived.getUrl(), 3, null);
                return Unit.f26487a;
            }
            ba0.g.M(obj);
            MessagingEventDispatcher messagingEventDispatcher3 = ConversationScreenViewModel.this.messagingEventDispatcher;
            ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
            this.L$0 = messagingEventDispatcher3;
            this.J$0 = 0L;
            this.label = 2;
            Object objConversationId$zendesk_messaging_messaging_android = conversationScreenViewModel.conversationId$zendesk_messaging_messaging_android(this);
            if (objConversationId$zendesk_messaging_messaging_android != aVar) {
                messagingEventDispatcher = messagingEventDispatcher3;
                obj = objConversationId$zendesk_messaging_messaging_android;
                j9 = 0;
                MessagingEventDispatcher.handleConversationExtensionOpenedEvent$zendesk_messaging_messaging_android$default(messagingEventDispatcher, null, j9, (String) obj, this.$openWebViewMessageReceived.getUrl(), 3, null);
                return Unit.f26487a;
            }
            return aVar;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$handleMessageWebViewReceived$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$handleMessageWebViewReceived$2", f = "ConversationScreenViewModel.kt", l = {515}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04102 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ ConversationKitEvent.OpenWebViewMessageReceived $openWebViewMessageReceived;
        final /* synthetic */ MessageActionSize $size;
        final /* synthetic */ MessageSourceType $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04102(ConversationKitEvent.OpenWebViewMessageReceived openWebViewMessageReceived, MessageActionSize messageActionSize, MessageSourceType messageSourceType, x70.c<? super C04102> cVar) {
            super(2, cVar);
            this.$openWebViewMessageReceived = openWebViewMessageReceived;
            this.$size = messageActionSize;
            this.$source = messageSourceType;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04102(this.$openWebViewMessageReceived, this.$size, this.$source, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04102) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                x80.m mVar = ConversationScreenViewModel.this._eventsChannel;
                ConversationScreenEvent.LaunchConversationExtension launchConversationExtension = new ConversationScreenEvent.LaunchConversationExtension(this.$openWebViewMessageReceived.getUrl(), this.$size, this.$openWebViewMessageReceived.getConversationId(), this.$source);
                this.label = 1;
                if (mVar.f(launchConversationExtension, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$hideLoadMoreMessagesProgressBar$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel", f = "ConversationScreenViewModel.kt", l = {1269}, m = "hideLoadMoreMessagesProgressBar")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04111 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C04111(x70.c<? super C04111> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenViewModel.this.hideLoadMoreMessagesProgressBar(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$loadMoreMessages$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel", f = "ConversationScreenViewModel.kt", l = {1179, 1185, 1186, 1192, 1195}, m = "loadMoreMessages")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04121 extends z70.c {
        double D$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C04121(x70.c<? super C04121> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenViewModel.this.loadMoreMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$processConversationExtensionClickedEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$processConversationExtensionClickedEvent$1", f = "ConversationScreenViewModel.kt", l = {1431}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04131 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $size;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04131(String str, x70.c<? super C04131> cVar) {
            super(2, cVar);
            this.$size = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04131(this.$size, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04131) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                AnalyticsProcessor analyticsProcessor = ConversationScreenViewModel.this.analyticsProcessor;
                AnalyticsEventType.ConversationExtensionClicked conversationExtensionClicked = new AnalyticsEventType.ConversationExtensionClicked(ExtensionsLaunchType.CLICK.getAnalyticsValue(), this.$size);
                this.label = 1;
                if (analyticsProcessor.process(conversationExtensionClicked, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$processConversationExtensionOpenedEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$processConversationExtensionOpenedEvent$1", f = "ConversationScreenViewModel.kt", l = {1448}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04141 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $url;
        long J$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04141(String str, x70.c<? super C04141> cVar) {
            super(2, cVar);
            this.$url = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04141(this.$url, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04141) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            MessagingEventDispatcher messagingEventDispatcher;
            long j9;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                MessagingEventDispatcher messagingEventDispatcher2 = ConversationScreenViewModel.this.messagingEventDispatcher;
                ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
                this.L$0 = messagingEventDispatcher2;
                this.J$0 = 0L;
                this.label = 1;
                Object objConversationId$zendesk_messaging_messaging_android = conversationScreenViewModel.conversationId$zendesk_messaging_messaging_android(this);
                if (objConversationId$zendesk_messaging_messaging_android == aVar) {
                    return aVar;
                }
                messagingEventDispatcher = messagingEventDispatcher2;
                obj = objConversationId$zendesk_messaging_messaging_android;
                j9 = 0;
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j11 = this.J$0;
                MessagingEventDispatcher messagingEventDispatcher3 = (MessagingEventDispatcher) this.L$0;
                ba0.g.M(obj);
                messagingEventDispatcher = messagingEventDispatcher3;
                j9 = j11;
            }
            MessagingEventDispatcher.handleConversationExtensionOpenedEvent$zendesk_messaging_messaging_android$default(messagingEventDispatcher, null, j9, (String) obj, this.$url, 3, null);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$processGuideArticleClickedEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$processGuideArticleClickedEvent$1", f = "ConversationScreenViewModel.kt", l = {1469}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04151 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ MessageSourceType $senderType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04151(MessageSourceType messageSourceType, x70.c<? super C04151> cVar) {
            super(2, cVar);
            this.$senderType = messageSourceType;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04151(this.$senderType, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04151) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                AnalyticsProcessor analyticsProcessor = ConversationScreenViewModel.this.analyticsProcessor;
                AnalyticsEventType.ArticleClicked articleClicked = new AnalyticsEventType.ArticleClicked(this.$senderType.getAnalyticValue());
                this.label = 1;
                if (analyticsProcessor.process(articleClicked, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$refreshState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel", f = "ConversationScreenViewModel.kt", l = {955, 970, 983}, m = "refreshState")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04161 extends z70.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C04161(x70.c<? super C04161> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenViewModel.this.refreshState(false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$resumeConversationKitConnection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$resumeConversationKitConnection$1", f = "ConversationScreenViewModel.kt", l = {320}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04171 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C04171(x70.c<? super C04171> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04171(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04171) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenRepository conversationScreenRepository = ConversationScreenViewModel.this.conversationScreenRepository;
                this.label = 1;
                if (conversationScreenRepository.resume(this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$setupWaitTimeBannerService$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$setupWaitTimeBannerService$1", f = "ConversationScreenViewModel.kt", l = {280, 281}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04181 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        Object L$0;
        int label;

        public C04181(x70.c<? super C04181> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04181(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04181) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                ba0.g.M(r5)
                goto L57
            L10:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r5)
                r5 = 0
                return r5
            L17:
                java.lang.Object r1 = r4.L$0
                zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService r1 = (zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService) r1
                ba0.g.M(r5)
                goto L35
            L1f:
                ba0.g.M(r5)
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r5 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService r1 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getWaitTimeBannerService$p(r5)
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r5 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                r4.L$0 = r1
                r4.label = r3
                java.lang.Object r5 = r5.conversationId$zendesk_messaging_messaging_android(r4)
                if (r5 != r0) goto L35
                goto L56
            L35:
                java.lang.String r5 = (java.lang.String) r5
                r1.subscribe(r5)
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r5 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService r5 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getWaitTimeBannerService$p(r5)
                y80.i r5 = r5.getWaitTimeBannerState()
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$setupWaitTimeBannerService$1$1 r1 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$setupWaitTimeBannerService$1$1
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r3 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                r1.<init>()
                r3 = 0
                r4.L$0 = r3
                r4.label = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L57
            L56:
                return r0
            L57:
                kotlin.Unit r5 = kotlin.Unit.f26487a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04181.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$showLoadMoreMessagesProgressBar$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel", f = "ConversationScreenViewModel.kt", l = {1233}, m = "showLoadMoreMessagesProgressBar")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04191 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C04191(x70.c<? super C04191> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenViewModel.this.showLoadMoreMessagesProgressBar(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$showLoadingAndRefreshState$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$showLoadingAndRefreshState$2", f = "ConversationScreenViewModel.kt", l = {944}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04202 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ boolean $forcedScrolling;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04202(boolean z11, x70.c<? super C04202> cVar) {
            super(2, cVar);
            this.$forcedScrolling = z11;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04202(this.$forcedScrolling, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04202) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
                boolean z11 = this.$forcedScrolling;
                this.label = 1;
                if (conversationScreenViewModel.refreshState(z11, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$startPolling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$startPolling$1", f = "ConversationScreenViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly80/j;", "", "", "cause", "<anonymous>", "(Ly80/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04211 extends z70.i implements i80.n {
        /* synthetic */ Object L$0;
        int label;

        public C04211(x70.c<? super C04211> cVar) {
            super(3, cVar);
        }

        @Override // i80.n
        public final Object invoke(y80.j jVar, Throwable th2, x70.c<? super Unit> cVar) {
            C04211 c04211 = new C04211(cVar);
            c04211.L$0 = th2;
            return c04211.invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            Logger.e(ConversationScreenViewModel.LOG_TAG, "Error polling for wait time banner", (Throwable) this.L$0, new Object[0]);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$updateListOfStoredForm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$updateListOfStoredForm$1", f = "ConversationScreenViewModel.kt", l = {369, 374}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$updateListOfStoredForm$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1485:1\n230#2,5:1486\n*S KotlinDebug\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$updateListOfStoredForm$1\n*L\n375#1:1486,5\n*E\n"})
    public static final class C04221 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ DisplayedField $field;
        final /* synthetic */ String $formId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04221(DisplayedField displayedField, String str, String str2, x70.c<? super C04221> cVar) {
            super(2, cVar);
            this.$field = displayedField;
            this.$conversationId = str;
            this.$formId = str2;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04221(this.$field, this.$conversationId, this.$formId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04221) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r2 == r1) goto L15;
         */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                r34 = this;
                r0 = r34
                y70.a r1 = y70.a.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L14
                ba0.g.M(r35)
                r2 = r35
                goto L48
            L14:
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r1)
                r1 = 0
                return r1
            L1b:
                ba0.g.M(r35)
                goto L37
            L1f:
                ba0.g.M(r35)
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r2 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository r2 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getConversationScreenRepository$p(r2)
                zendesk.ui.android.conversation.form.DisplayedField r5 = r0.$field
                java.lang.String r6 = r0.$conversationId
                java.lang.String r7 = r0.$formId
                r0.label = r4
                java.lang.Object r2 = r2.updateLocalStoredForm(r5, r6, r7, r0)
                if (r2 != r1) goto L37
                goto L47
            L37:
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r2 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository r2 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getConversationScreenRepository$p(r2)
                java.lang.String r4 = r0.$conversationId
                r0.label = r3
                java.lang.Object r2 = r2.getLocalStoredForms(r4, r0)
                if (r2 != r1) goto L48
            L47:
                return r1
            L48:
                r15 = r2
                java.util.Map r15 = (java.util.Map) r15
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r1 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.this
                y80.f1 r1 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$get_conversationScreenStateFlow$p(r1)
            L51:
                r2 = r1
                y80.a2 r2 = (y80.a2) r2
                java.lang.Object r3 = r2.getValue()
                r4 = r3
                r3 = r4
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r3 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenState) r3
                r31 = 134215679(0x7fff7ff, float:3.8513895E-34)
                r32 = 0
                r5 = r4
                r4 = 0
                r6 = r5
                r5 = 0
                r7 = r6
                r6 = 0
                r8 = r7
                r7 = 0
                r9 = r8
                r8 = 0
                r10 = r9
                r9 = 0
                r11 = r10
                r10 = 0
                r12 = r11
                r11 = 0
                r13 = r12
                r12 = 0
                r14 = r13
                r13 = 0
                r16 = r14
                r14 = 0
                r17 = r16
                r16 = 0
                r18 = r17
                r17 = 0
                r19 = r18
                r18 = 0
                r20 = r19
                r19 = 0
                r21 = r20
                r20 = 0
                r22 = r21
                r21 = 0
                r23 = r22
                r22 = 0
                r24 = r23
                r23 = 0
                r25 = r24
                r24 = 0
                r26 = r25
                r25 = 0
                r27 = r26
                r26 = 0
                r28 = r27
                r27 = 0
                r29 = r28
                r28 = 0
                r30 = r29
                r29 = 0
                r33 = r30
                r30 = 0
                r0 = r33
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r3 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                boolean r0 = r2.g(r0, r3)
                if (r0 == 0) goto Lc3
                kotlin.Unit r0 = kotlin.Unit.f26487a
                return r0
            Lc3:
                r0 = r34
                goto L51
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04221.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$updatePostbackMessageStatus$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$updatePostbackMessageStatus$1", f = "ConversationScreenViewModel.kt", l = {899}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$updatePostbackMessageStatus$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1485:1\n230#2,5:1486\n*S KotlinDebug\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$updatePostbackMessageStatus$1\n*L\n905#1:1486,5\n*E\n"})
    public static final class C04231 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $actionId;
        final /* synthetic */ ConversationScreenPostbackStatus $status;
        final /* synthetic */ String $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04231(String str, ConversationScreenPostbackStatus conversationScreenPostbackStatus, String str2, x70.c<? super C04231> cVar) {
            super(2, cVar);
            this.$actionId = str;
            this.$status = conversationScreenPostbackStatus;
            this.$text = str2;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04231(this.$actionId, this.$status, this.$text, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04231) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            Object objMapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android;
            a2 a2Var;
            Object value;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenState conversationScreenState = (ConversationScreenState) ConversationScreenViewModel.this.getConversationScreenStateFlow().getValue();
                String str = this.$actionId;
                if (str == null) {
                    str = "";
                }
                Logger.d(ConversationScreenViewModel.LOG_TAG, "Postback state change, " + str + " " + this.$status, new Object[0]);
                MessageLogEntryMapper messageLogEntryMapper = ConversationScreenViewModel.this.messageLogEntryMapper;
                Map<String, ConversationScreenPostbackStatus> mapOfDisplayedPostbackStatuses = conversationScreenState.getMapOfDisplayedPostbackStatuses();
                List<MessageLogEntry> messageLog = conversationScreenState.getMessageLog();
                ConversationScreenPostbackStatus conversationScreenPostbackStatus = this.$status;
                String str2 = this.$actionId;
                this.label = 1;
                objMapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android = messageLogEntryMapper.mapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android(mapOfDisplayedPostbackStatuses, messageLog, conversationScreenPostbackStatus, str2, this);
                if (objMapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                objMapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android = obj;
            }
            MessageLogEntryMapper.MessageLogEntryUpdatedPostback messageLogEntryUpdatedPostback = (MessageLogEntryMapper.MessageLogEntryUpdatedPostback) objMapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android;
            f1 f1Var = ConversationScreenViewModel.this._conversationScreenStateFlow;
            String str3 = this.$text;
            ConversationScreenViewModel conversationScreenViewModel = ConversationScreenViewModel.this;
            do {
                a2Var = (a2) f1Var;
                value = a2Var.getValue();
            } while (!a2Var.g(value, ConversationScreenState.copy$default((ConversationScreenState) value, null, null, null, null, messageLogEntryUpdatedPostback.getMessageLogEntryList(), null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, messageLogEntryUpdatedPostback.getUpdatedPostbackStatuses(), messageLogEntryUpdatedPostback.getShowBanner(), str3 == null ? ((ConversationScreenState) conversationScreenViewModel.getConversationScreenStateFlow().getValue()).getPostbackErrorText() : str3, null, null, false, null, 126877679, null)));
            return Unit.f26487a;
        }
    }

    public ConversationScreenViewModel(@NotNull MessagingSettings messagingSettings, @NotNull MessageLogEntryMapper messageLogEntryMapper, @NotNull NewMessagesDividerHandler newMessagesDividerHandler, @NotNull c1 c1Var, @NotNull VisibleScreenTracker visibleScreenTracker, @NotNull b0 b0Var, @NotNull UploadFileResourceProvider uploadFileResourceProvider, @NotNull ConversationScreenRepository conversationScreenRepository, @NotNull ConversationTypingEvents conversationTypingEvents, @NotNull ConversationTitleProvider conversationTitleProvider, @NotNull WaitTimeBannerService waitTimeBannerService, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull AnalyticsProcessor analyticsProcessor) {
        messagingSettings.getClass();
        messageLogEntryMapper.getClass();
        newMessagesDividerHandler.getClass();
        c1Var.getClass();
        visibleScreenTracker.getClass();
        b0Var.getClass();
        uploadFileResourceProvider.getClass();
        conversationScreenRepository.getClass();
        conversationTypingEvents.getClass();
        conversationTitleProvider.getClass();
        waitTimeBannerService.getClass();
        messagingEventDispatcher.getClass();
        analyticsProcessor.getClass();
        this.messagingSettings = messagingSettings;
        this.messageLogEntryMapper = messageLogEntryMapper;
        this.newMessagesDividerHandler = newMessagesDividerHandler;
        this.savedStateHandle = c1Var;
        this.visibleScreenTracker = visibleScreenTracker;
        this.sdkCoroutineScope = b0Var;
        this.uploadFileResourceProvider = uploadFileResourceProvider;
        this.conversationScreenRepository = conversationScreenRepository;
        this.conversationTypingEvents = conversationTypingEvents;
        this.conversationTitleProvider = conversationTitleProvider;
        this.waitTimeBannerService = waitTimeBannerService;
        this.messagingEventDispatcher = messagingEventDispatcher;
        this.analyticsProcessor = analyticsProcessor;
        MessagingScreen messagingScreen = null;
        x80.i iVarA = cg.a(0, null, null, 7);
        this._eventsChannel = iVarA;
        this.eventsChannel = y80.r.v(y80.r.w(iVarA), waitTimeBannerService.getEventsChannel());
        this.conversationId = (String) c1Var.b(ConversationFragment.ARG_CONVERSATION_ID, null, false).d();
        this.proactiveNotificationId = (Integer) c1Var.b(NotificationBuilder.PROACTIVE_NOTIFICATION_ID, null, false).d();
        this.shouldStartDefaultConversation = (Boolean) c1Var.b(ConversationFragment.ARG_SHOULD_START_DEFAULT_CONVERSATION, null, false).d();
        String str = (String) c1Var.b(ConversationFragment.ARG_MESSAGING_SCREEN_NAVIGATION_LOGIC, null, false).d();
        this.messagingScreenNavigation = str;
        if (str != null) {
            try {
                messagingScreen = (MessagingScreen) n90.c.f30748d.b(MessagingScreen.INSTANCE.serializer(), str);
            } catch (Exception unused) {
            }
        }
        this.messagingScreen = messagingScreen;
        c1 c1Var2 = this.savedStateHandle;
        Boolean bool = Boolean.FALSE;
        c1Var2.getClass();
        Boolean bool2 = (Boolean) c1Var2.b(HAS_SENT_PROACTIVE_REFERRAL_DATA, bool, true).d();
        this.hasSentProactiveReferral = bool2 != null ? bool2.booleanValue() : false;
        c1 c1Var3 = this.savedStateHandle;
        c1Var3.getClass();
        Boolean bool3 = (Boolean) c1Var3.b(HAS_REPLIED_TO_PROACTIVE_MESSAGE, bool, true).d();
        this.hasRepliedToProactiveMessage = bool3 != null ? bool3.booleanValue() : false;
        c1 c1Var4 = this.savedStateHandle;
        c1Var4.getClass();
        Boolean bool4 = (Boolean) c1Var4.b(KEY_USER_ACCESS_REVOKED, bool, true).d();
        this.userAccessHasBeenRevoked = bool4 != null ? bool4.booleanValue() : false;
        this.eventMessagesFlow = y80.r.c(n0.f26529a);
        ConversationKitEventListener conversationKitEventListener = new ConversationKitEventListener() { // from class: zendesk.messaging.android.internal.conversationscreen.t
            @Override // zendesk.conversationkit.android.ConversationKitEventListener
            public final void onEvent(ConversationKitEvent conversationKitEvent) {
                ConversationScreenViewModel.eventListener$lambda$3(this.f47708a, conversationKitEvent);
            }
        };
        this.eventListener = conversationKitEventListener;
        a2 a2VarC = y80.r.c(new ConversationScreenState(null, this.messagingSettings.getTitle(), this.messagingSettings.getDescription(), this.messagingSettings.getLogoUrl(), null, null, false, null, false, false, null, null, null, false, null, false, false, this.messagingSettings.getHipaaAttachmentFlag(), null, true, null, false, null, null, null, false, null, 133562353, null));
        this._conversationScreenStateFlow = a2VarC;
        this.conversationScreenStateFlow = new h1(a2VarC);
        emitConversationOpenedEvent();
        collectMessagesShownEventData();
        resumeConversationKitConnection();
        proactiveMessagingInitialization();
        updateProactiveParams();
        this.conversationScreenRepository.updateUserAccessHasBeenRevoked(this.userAccessHasBeenRevoked);
        this.conversationScreenRepository.addEventListener(conversationKitEventListener);
        showLoadingAndRefreshState(true);
        collectChannelEvents();
        collectTypingEvents();
        updateDisplayedFormsFromStorage(this.conversationId);
        setupWaitTimeBannerService();
        collectWaitTimeBannerEvents();
    }

    private final void analyticsProactiveMessageReplayedTo(ConversationKitEvent.ConversationUpdated conversationKitEvent) {
        int size;
        List<Message> messages;
        Integer num = this.proactiveNotificationId;
        if (num != null) {
            int iIntValue = num.intValue();
            if (this.hasRepliedToProactiveMessage) {
                return;
            }
            Conversation conversation = ((ConversationScreenState) ((a2) this._conversationScreenStateFlow).getValue()).getConversation();
            if (conversation == null || (messages = conversation.getMessages()) == null) {
                size = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : messages) {
                    if (((Message) obj).isAuthoredBy(conversationKitEvent.getConversation().getMyself())) {
                        arrayList.add(obj);
                    }
                }
                size = arrayList.size();
            }
            List<Message> messages2 = conversationKitEvent.getConversation().getMessages();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : messages2) {
                if (((Message) obj2).isAuthoredBy(conversationKitEvent.getConversation().getMyself())) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() > size) {
                DefaultMessaging defaultMessaging = ZendeskKtxKt.defaultMessaging(Zendesk.INSTANCE);
                if (defaultMessaging != null) {
                    defaultMessaging.handleProactiveMessageEvent$zendesk_messaging_messaging_android(Integer.valueOf(iIntValue), ProactiveMessageEvent.REPLIED_TO);
                }
                this.hasRepliedToProactiveMessage = true;
                this.savedStateHandle.d(Boolean.TRUE, HAS_REPLIED_TO_PROACTIVE_MESSAGE);
            }
        }
    }

    private final void collectChannelEvents() {
        f0.B(m1.d(this), null, null, new C04011(null), 3);
    }

    private final void collectMessagesShownEventData() {
        f0.B(m1.d(this), null, null, new C04021(null), 3);
        f0.B(m1.d(this), null, null, new AnonymousClass2(null), 3);
    }

    private final void collectTypingEvents() {
        f0.B(m1.d(this), null, null, new C04031(null), 3);
    }

    private final void collectWaitTimeBannerEvents() {
        f0.B(m1.d(this), null, null, new C04041(null), 3);
    }

    private final ConversationScreenState conversationState(ConversationScreenState conversationScreenState, Conversation conversation, boolean scrollToBottom, String authorizationToken, String composerText, ConversationScreenStatus status) {
        Author authorMostRecentAuthorThatIsNotMySelf = ConversationHelperKt.mostRecentAuthorThatIsNotMySelf(conversation);
        ConversationScreenState conversationScreenStateCopy$default = ConversationScreenState.copy$default(conversationScreenState, null, provideConversationTitle(conversation.getDisplayName(), conversation.getCreatedAt(), authorMostRecentAuthorThatIsNotMySelf != null ? authorMostRecentAuthorThatIsNotMySelf.getDisplayName() : null, this.messagingSettings.getTitle()), null, provideConversationIconUrl(conversation.getIconUrl(), authorMostRecentAuthorThatIsNotMySelf != null ? authorMostRecentAuthorThatIsNotMySelf.getAvatarUrl() : null, this.messagingSettings.getLogoUrl()), this.messageLogEntryMapper.map(conversation, this.newMessagesDividerHandler.getNewMessageDividerDate(conversation.getId()), conversationScreenState.getTypingUser(), LoadMoreStatus.NONE, authorizationToken), conversation, ConversationKtxKt.blockChatInput(conversation), conversationScreenState.getConnectionStatus(), false, false, composerText, null, conversationScreenState.getTypingUser(), false, conversationScreenState.getLoadMoreStatus(), NewMessagesDividerHandlerKt.hasNewInboundMessages(conversation), false, false, status == null ? conversationScreenState.getStatus() : status, scrollToBottom, null, false, null, authorizationToken, null, false, provideAccessibilityTitle(conversation.getDisplayName(), conversation.getCreatedAt(), authorMostRecentAuthorThatIsNotMySelf != null ? authorMostRecentAuthorThatIsNotMySelf.getDisplayName() : null, this.messagingSettings.getTitle()), 24316677, null);
        Logger.d(LOG_TAG, "Creating a new conversationState", new Object[0]);
        return conversationScreenStateCopy$default;
    }

    public static /* synthetic */ ConversationScreenState conversationState$default(ConversationScreenViewModel conversationScreenViewModel, ConversationScreenState conversationScreenState, Conversation conversation, boolean z11, String str, String str2, ConversationScreenStatus conversationScreenStatus, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i11 & 32) != 0) {
            conversationScreenStatus = null;
        }
        return conversationScreenViewModel.conversationState(conversationScreenState, conversation, z11, str, str3, conversationScreenStatus);
    }

    private final void emitConversationOpenedEvent() {
        MessagingEventDispatcher.handleConversationOpenedEvent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, this.conversationId, 0L, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eventListener$lambda$3(ConversationScreenViewModel conversationScreenViewModel, ConversationKitEvent conversationKitEvent) {
        a2 a2Var;
        Object value;
        a2 a2Var2;
        Object value2;
        conversationKitEvent.getClass();
        if (conversationKitEvent instanceof ConversationKitEvent.ConversationUpdated) {
            conversationScreenViewModel.handleConversationUpdated((ConversationKitEvent.ConversationUpdated) conversationKitEvent);
            return;
        }
        if (conversationKitEvent instanceof ConversationKitEvent.ConnectionStatusChanged) {
            conversationScreenViewModel.handleConnectionStatusChanged((ConversationKitEvent.ConnectionStatusChanged) conversationKitEvent);
            return;
        }
        if (conversationKitEvent instanceof ConversationKitEvent.OpenWebViewMessageReceived) {
            conversationScreenViewModel.handleMessageWebViewReceived((ConversationKitEvent.OpenWebViewMessageReceived) conversationKitEvent);
            return;
        }
        if (conversationKitEvent instanceof ConversationKitEvent.MessageReceived) {
            conversationScreenViewModel.handleMessageReceived(((ConversationKitEvent.MessageReceived) conversationKitEvent).getConversationId());
            return;
        }
        if (conversationKitEvent instanceof ConversationKitEvent.MessageUpdated) {
            conversationScreenViewModel.handleMessageUpdated(((ConversationKitEvent.MessageUpdated) conversationKitEvent).getConversationId());
            return;
        }
        if (conversationKitEvent instanceof ConversationKitEvent.ActivityEventReceived) {
            conversationScreenViewModel.handleActivityEventReceived((ConversationKitEvent.ActivityEventReceived) conversationKitEvent);
            return;
        }
        if (conversationKitEvent instanceof ConversationKitEvent.UserAccessRevoked) {
            f1 f1Var = conversationScreenViewModel._conversationScreenStateFlow;
            do {
                a2Var2 = (a2) f1Var;
                value2 = a2Var2.getValue();
            } while (!a2Var2.g(value2, ConversationScreenState.copy$default((ConversationScreenState) value2, null, null, null, null, null, null, true, null, false, false, null, null, null, false, null, false, false, false, ConversationScreenStatus.FAILED, false, null, false, null, null, null, false, null, 133955519, null)));
            conversationScreenViewModel.updateUserAccessRevokedState(true);
            Logger.d(LOG_TAG, "User access has been revoked", new Object[0]);
            return;
        }
        if (conversationKitEvent instanceof ConversationKitEvent.PostbackFailure) {
            conversationScreenViewModel.handlePostbackFailure();
            return;
        }
        if (conversationKitEvent instanceof ConversationKitEvent.PostbackSuccess) {
            conversationScreenViewModel.handlePostbackSuccess((ConversationKitEvent.PostbackSuccess) conversationKitEvent);
            return;
        }
        if (!(conversationKitEvent instanceof ConversationKitEvent.UserUpdated)) {
            if (conversationKitEvent instanceof ConversationKitEvent.OpenFileAttachment) {
                f0.B(m1.d(conversationScreenViewModel), null, null, new ConversationScreenViewModel$eventListener$1$3(conversationKitEvent, conversationScreenViewModel, null), 3);
                return;
            } else {
                Logger.d(LOG_TAG, conversationKitEvent.getClass().getSimpleName().concat(" received."), new Object[0]);
                return;
            }
        }
        if (conversationScreenViewModel.userAccessHasBeenRevoked) {
            conversationScreenViewModel.updateUserAccessRevokedState(false);
            showLoadingAndRefreshState$default(conversationScreenViewModel, false, 1, null);
        }
        f1 f1Var2 = conversationScreenViewModel._conversationScreenStateFlow;
        do {
            a2Var = (a2) f1Var2;
            value = a2Var.getValue();
        } while (!a2Var.g(value, ConversationScreenState.copy$default((ConversationScreenState) value, null, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, UserExtensionsKt.getAuthorization(((ConversationKitEvent.UserUpdated) conversationKitEvent).getUser()), null, false, null, 125829119, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object failedLoadMoreMessagesProgressBar(zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r35, java.lang.String r36, x70.c<? super zendesk.messaging.android.internal.conversationscreen.ConversationScreenState> r37) {
        /*
            r34 = this;
            r0 = r34
            r1 = r37
            boolean r2 = r1 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04071
            if (r2 == 0) goto L17
            r2 = r1
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$failedLoadMoreMessagesProgressBar$1 r2 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04071) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$failedLoadMoreMessagesProgressBar$1 r2 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$failedLoadMoreMessagesProgressBar$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L30
            java.lang.Object r2 = r2.L$0
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r2 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenState) r2
            ba0.g.M(r1)
            r4 = r2
            goto L4b
        L30:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L37:
            ba0.g.M(r1)
            r1 = r35
            r2.L$0 = r1
            r2.label = r5
            r4 = r36
            java.lang.Object r2 = r0.getUpdatedConversation(r4, r2)
            if (r2 != r3) goto L49
            return r3
        L49:
            r4 = r1
            r1 = r2
        L4b:
            r6 = r1
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6
            zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper r5 = r0.messageLogEntryMapper
            zendesk.messaging.android.internal.NewMessagesDividerHandler r1 = r0.newMessagesDividerHandler
            java.lang.String r2 = r6.getId()
            java.util.Date r7 = r1.getNewMessageDividerDate(r2)
            zendesk.messaging.android.internal.model.TypingUser r8 = r4.getTypingUser()
            zendesk.messaging.android.internal.model.LoadMoreStatus r19 = zendesk.messaging.android.internal.model.LoadMoreStatus.FAILED
            java.lang.String r10 = r4.getAuthorizationToken()
            r9 = r19
            java.util.List r1 = r5.map(r6, r7, r8, r9, r10)
            r32 = 134201327(0x7ffbfef, float:3.8480944E-34)
            r33 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r9 = r1
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r1 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.failedLoadMoreMessagesProgressBar(zendesk.messaging.android.internal.conversationscreen.ConversationScreenState, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getUpdatedConversation(String str, x70.c<? super Conversation> cVar) {
        Conversation conversation = ((ConversationScreenState) ((a2) this._conversationScreenStateFlow).getValue()).getConversation();
        return conversation == null ? this.conversationScreenRepository.getRemoteConversation(str, cVar) : conversation;
    }

    private final void handleActivityEventReceived(ConversationKitEvent.ActivityEventReceived activityEventReceived) {
        TypingUser user;
        Conversation conversation;
        ActivityData activityData = activityEventReceived.getActivityEvent().getActivityData();
        String conversationId = activityEventReceived.getActivityEvent().getConversationId();
        String userAvatarUrl = activityEventReceived.getActivityEvent().getUserAvatarUrl();
        AuthorType role = activityEventReceived.getActivityEvent().getRole();
        if (activityData == ActivityData.TYPING_START) {
            if (userAvatarUrl == null) {
                userAvatarUrl = "";
            }
            user = new TypingUser.User(userAvatarUrl);
        } else {
            user = TypingUser.None.INSTANCE;
        }
        TypingUser typingUser = user;
        if ((activityData == ActivityData.CONVERSATION_READ && role == AuthorType.BUSINESS) || Intrinsics.areEqual(((ConversationScreenState) ((a2) this._conversationScreenStateFlow).getValue()).getTypingUser(), typingUser) || (conversation = ((ConversationScreenState) ((a2) this._conversationScreenStateFlow).getValue()).getConversation()) == null || !Intrinsics.areEqual(conversation.getId(), conversationId)) {
            return;
        }
        f1 f1Var = this._conversationScreenStateFlow;
        while (true) {
            a2 a2Var = (a2) f1Var;
            Object value = a2Var.getValue();
            ConversationScreenState conversationScreenState = (ConversationScreenState) value;
            Conversation conversation2 = conversation;
            TypingUser typingUser2 = typingUser;
            if (a2Var.g(value, ConversationScreenState.copy$default(conversationScreenState, null, null, null, null, this.messageLogEntryMapper.map(conversation, this.newMessagesDividerHandler.getNewMessageDividerDate(conversation.getId()), typingUser, LoadMoreStatus.NONE, conversationScreenState.getAuthorizationToken()), null, false, null, false, false, null, null, typingUser2, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 134213615, null))) {
                return;
            }
            conversation = conversation2;
            typingUser = typingUser2;
        }
    }

    private final void handleConnectionStatusChanged(ConversationKitEvent.ConnectionStatusChanged conversationKitEvent) {
        a2 a2Var;
        Object value;
        Logger.d(LOG_TAG, "ConnectionStatusChanged received with value " + conversationKitEvent.getConnectionStatus(), new Object[0]);
        f1 f1Var = this._conversationScreenStateFlow;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, ConversationScreenState.copy$default((ConversationScreenState) value, null, null, null, null, null, null, false, conversationKitEvent.getConnectionStatus(), false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 133693311, null)));
        ConversationScreenStatus status = ((ConversationScreenState) this.conversationScreenStateFlow.getValue()).getStatus();
        if (conversationKitEvent.getConnectionStatus() != ConnectionStatus.CONNECTED_REALTIME || status == ConversationScreenStatus.LOADING || status == ConversationScreenStatus.FAILED) {
            return;
        }
        i1 i1Var = this.refreshStateJob;
        if (i1Var == null || i1Var.a0()) {
            this.refreshStateJob = f0.B(m1.d(this), null, null, new C04082(null), 3);
        }
    }

    private final void handleConversationUpdated(ConversationKitEvent.ConversationUpdated conversationKitEvent) {
        a2 a2Var;
        Object value;
        ConversationScreenState conversationScreenState;
        Logger.d(LOG_TAG, e0.f.k("ConversationUpdated received for the conversation with id ", conversationKitEvent.getConversation().getId()), new Object[0]);
        String id2 = conversationKitEvent.getConversation().getId();
        Conversation conversation = ((ConversationScreenState) ((a2) this._conversationScreenStateFlow).getValue()).getConversation();
        if (Intrinsics.areEqual(id2, conversation != null ? conversation.getId() : null)) {
            updateNewMessagesDividerDate(conversationKitEvent);
            analyticsProactiveMessageReplayedTo(conversationKitEvent);
            f1 f1Var = this._conversationScreenStateFlow;
            do {
                a2Var = (a2) f1Var;
                value = a2Var.getValue();
                conversationScreenState = (ConversationScreenState) value;
            } while (!a2Var.g(value, conversationState$default(this, conversationScreenState, conversationKitEvent.getConversation(), shouldConversationScrollToBottom(conversationKitEvent.getConversation()), conversationScreenState.getAuthorizationToken(), null, null, 48, null)));
        }
    }

    private final void handleMessageReceived(String conversationId) {
        a2 a2Var;
        Object value;
        if (this.visibleScreenTracker.isConversationVisibleOnScreen$zendesk_messaging_messaging_android(conversationId)) {
            dispatchAction(new ConversationScreenAction.SendActivityData(ActivityData.CONVERSATION_READ, conversationId));
            f1 f1Var = this._conversationScreenStateFlow;
            do {
                a2Var = (a2) f1Var;
                value = a2Var.getValue();
            } while (!a2Var.g(value, ConversationScreenState.copy$default((ConversationScreenState) value, null, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, true, false, null, false, null, false, null, null, null, false, null, 133627903, null)));
        }
    }

    private final void handleMessageUpdated(String conversationId) {
        a2 a2Var;
        Object value;
        if (this.visibleScreenTracker.isConversationVisibleOnScreen$zendesk_messaging_messaging_android(conversationId)) {
            f1 f1Var = this._conversationScreenStateFlow;
            do {
                a2Var = (a2) f1Var;
                value = a2Var.getValue();
            } while (!a2Var.g(value, ConversationScreenState.copy$default((ConversationScreenState) value, null, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 134152191, null)));
        }
    }

    private final void handleMessageWebViewReceived(ConversationKitEvent.OpenWebViewMessageReceived openWebViewMessageReceived) {
        MessageActionSize messageActionSizeValueOf = MessageActionSize.valueOf(openWebViewMessageReceived.getSize().name());
        MessageSourceType messageSourceTypeFindByValue = MessageSourceType.INSTANCE.findByValue(openWebViewMessageReceived.getSource().getValue());
        if (messageSourceTypeFindByValue != MessageSourceType.SURVEY) {
            f0.B(m1.d(this), null, null, new C04091(messageActionSizeValueOf, openWebViewMessageReceived, null), 3);
        }
        f0.B(m1.d(this), null, null, new C04102(openWebViewMessageReceived, messageActionSizeValueOf, messageSourceTypeFindByValue, null), 3);
    }

    private final void handlePostbackFailure() {
        updatePostbackMessageStatus$default(this, null, ConversationScreenPostbackStatus.FAILED, null, 5, null);
    }

    private final void handlePostbackSuccess(ConversationKitEvent.PostbackSuccess conversationKitEvent) {
        updatePostbackMessageStatus$default(this, conversationKitEvent.getActionId(), ConversationScreenPostbackStatus.SUCCESS, null, 4, null);
    }

    private final ConversationScreenState hideDeniedPermission(ConversationScreenState conversationScreenState) {
        return ConversationScreenState.copy$default(conversationScreenState, null, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 134209535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hideLoadMoreMessagesProgressBar(zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r35, java.lang.String r36, x70.c<? super zendesk.messaging.android.internal.conversationscreen.ConversationScreenState> r37) {
        /*
            r34 = this;
            r0 = r34
            r1 = r37
            boolean r2 = r1 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04111
            if (r2 == 0) goto L17
            r2 = r1
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$hideLoadMoreMessagesProgressBar$1 r2 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04111) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$hideLoadMoreMessagesProgressBar$1 r2 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$hideLoadMoreMessagesProgressBar$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L30
            java.lang.Object r2 = r2.L$0
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r2 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenState) r2
            ba0.g.M(r1)
            r4 = r2
            goto L4b
        L30:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L37:
            ba0.g.M(r1)
            r1 = r35
            r2.L$0 = r1
            r2.label = r5
            r4 = r36
            java.lang.Object r2 = r0.getUpdatedConversation(r4, r2)
            if (r2 != r3) goto L49
            return r3
        L49:
            r4 = r1
            r1 = r2
        L4b:
            r6 = r1
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6
            zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper r5 = r0.messageLogEntryMapper
            zendesk.messaging.android.internal.NewMessagesDividerHandler r1 = r0.newMessagesDividerHandler
            java.lang.String r2 = r6.getId()
            java.util.Date r7 = r1.getNewMessageDividerDate(r2)
            zendesk.messaging.android.internal.model.TypingUser r8 = r4.getTypingUser()
            zendesk.messaging.android.internal.model.LoadMoreStatus r19 = zendesk.messaging.android.internal.model.LoadMoreStatus.NONE
            java.lang.String r10 = r4.getAuthorizationToken()
            r9 = r19
            java.util.List r1 = r5.map(r6, r7, r8, r9, r10)
            r32 = 134201327(0x7ffbfef, float:3.8480944E-34)
            r33 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r9 = r1
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r1 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.hideLoadMoreMessagesProgressBar(zendesk.messaging.android.internal.conversationscreen.ConversationScreenState, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0112, code lost:
    
        if (r15 != r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        if (r15 != r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d2 -> B:39:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0112 -> B:51:0x0115). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x013f -> B:61:0x0142). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMoreMessages(zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction.LoadMoreMessages r14, x70.c<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.loadMoreMessages(zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction$LoadMoreMessages, x70.c):java.lang.Object");
    }

    private final void proactiveMessagingInitialization() {
        DefaultMessaging defaultMessaging = ZendeskKtxKt.defaultMessaging(Zendesk.INSTANCE);
        if (defaultMessaging != null) {
            defaultMessaging.handleProactiveMessageEvent$zendesk_messaging_messaging_android(this.proactiveNotificationId, ProactiveMessageEvent.CONVERSATION_OPENED);
        }
    }

    private final String provideAccessibilityTitle(String displayName, Date createdAt, String lastBusinessParticipantName, String settingsTitle) {
        if (!this.messagingSettings.isMultiConversationsEnabled()) {
            return settingsTitle;
        }
        ConversationTitleProvider conversationTitleProvider = this.conversationTitleProvider;
        if (lastBusinessParticipantName == null) {
            lastBusinessParticipantName = settingsTitle;
        }
        return conversationTitleProvider.resolveAccessibilityHeaderTitle(displayName, createdAt, lastBusinessParticipantName);
    }

    private final String provideConversationIconUrl(String customIconUrl, String lastBusinessAvatarUrl, String settingsLogoUrl) {
        if (this.messagingSettings.isMultiConversationsEnabled()) {
            if (customIconUrl != null) {
                return customIconUrl;
            }
            if (lastBusinessAvatarUrl != null) {
                return lastBusinessAvatarUrl;
            }
        }
        return settingsLogoUrl;
    }

    private final String provideConversationTitle(String displayName, Date createdAt, String lastBusinessParticipantName, String settingsTitle) {
        if (!this.messagingSettings.isMultiConversationsEnabled()) {
            return settingsTitle;
        }
        ConversationTitleProvider conversationTitleProvider = this.conversationTitleProvider;
        if (lastBusinessParticipantName == null) {
            lastBusinessParticipantName = settingsTitle;
        }
        return conversationTitleProvider.resolveTitle(displayName, createdAt, lastBusinessParticipantName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
    
        if (r0 == r10) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:15:0x0048, B:46:0x0100, B:43:0x00da, B:22:0x0066, B:39:0x00c6, B:41:0x00d2, B:42:0x00d7, B:25:0x006c, B:36:0x009f, B:28:0x0073, B:30:0x0089, B:33:0x0093), top: B:56:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00fd -> B:16:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshState(boolean r43, x70.c<? super kotlin.Unit> r44) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.refreshState(boolean, x70.c):java.lang.Object");
    }

    public static /* synthetic */ Object refreshState$default(ConversationScreenViewModel conversationScreenViewModel, boolean z11, x70.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return conversationScreenViewModel.refreshState(z11, cVar);
    }

    private final void resumeConversationKitConnection() {
        f0.B(m1.d(this), null, null, new C04171(null), 3);
    }

    private final void setupWaitTimeBannerService() {
        f0.B(m1.d(this), null, null, new C04181(null), 3);
    }

    private final boolean shouldConversationScrollToBottom(Conversation updatedConversation) {
        boolean z11;
        int i11 = WhenMappings.$EnumSwitchMapping$0[((ConversationScreenState) ((a2) this._conversationScreenStateFlow).getValue()).getLoadMoreStatus().ordinal()];
        if (i11 == 1 || i11 == 2) {
            z11 = true;
        } else {
            if (i11 != 3) {
                e40.a.f();
                return false;
            }
            z11 = false;
        }
        if (updatedConversation.getMessages().isEmpty()) {
            return ((ConversationScreenState) ((a2) this._conversationScreenStateFlow).getValue()).getScrollToTheBottom();
        }
        return !z11 && ((Message) CollectionsKt.W(updatedConversation.getMessages())).isAuthoredBy(updatedConversation.getMyself());
    }

    private final ConversationScreenState showDeniedPermission(ConversationScreenState conversationScreenState) {
        return ConversationScreenState.copy$default(conversationScreenState, null, null, null, null, null, null, false, null, false, false, null, null, null, true, null, false, false, false, null, false, null, false, null, null, null, false, null, 134209535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showLoadMoreMessagesProgressBar(zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r35, java.lang.String r36, x70.c<? super zendesk.messaging.android.internal.conversationscreen.ConversationScreenState> r37) {
        /*
            r34 = this;
            r0 = r34
            r1 = r37
            boolean r2 = r1 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04191
            if (r2 == 0) goto L17
            r2 = r1
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$showLoadMoreMessagesProgressBar$1 r2 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04191) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$showLoadMoreMessagesProgressBar$1 r2 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$showLoadMoreMessagesProgressBar$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L30
            java.lang.Object r2 = r2.L$0
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r2 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenState) r2
            ba0.g.M(r1)
            r4 = r2
            goto L4b
        L30:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L37:
            ba0.g.M(r1)
            r1 = r35
            r2.L$0 = r1
            r2.label = r5
            r4 = r36
            java.lang.Object r2 = r0.getUpdatedConversation(r4, r2)
            if (r2 != r3) goto L49
            return r3
        L49:
            r4 = r1
            r1 = r2
        L4b:
            r6 = r1
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6
            zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper r5 = r0.messageLogEntryMapper
            zendesk.messaging.android.internal.NewMessagesDividerHandler r1 = r0.newMessagesDividerHandler
            java.lang.String r2 = r6.getId()
            java.util.Date r7 = r1.getNewMessageDividerDate(r2)
            zendesk.messaging.android.internal.model.TypingUser r8 = r4.getTypingUser()
            zendesk.messaging.android.internal.model.LoadMoreStatus r19 = zendesk.messaging.android.internal.model.LoadMoreStatus.LOADING
            java.lang.String r10 = r4.getAuthorizationToken()
            r9 = r19
            java.util.List r1 = r5.map(r6, r7, r8, r9, r10)
            r32 = 133677039(0x7f7bfef, float:3.7277238E-34)
            r33 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r9 = r1
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r1 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.showLoadMoreMessagesProgressBar(zendesk.messaging.android.internal.conversationscreen.ConversationScreenState, java.lang.String, x70.c):java.lang.Object");
    }

    private final void showLoadingAndRefreshState(boolean forcedScrolling) {
        a2 a2Var;
        Object value;
        ConversationScreenState conversationScreenStateCopy$default;
        f1 f1Var = this._conversationScreenStateFlow;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
            ConversationScreenState conversationScreenState = (ConversationScreenState) value;
            if (forcedScrolling) {
                conversationScreenStateCopy$default = new ConversationScreenState(conversationScreenState.getMessagingTheme(), this.messagingSettings.getTitle(), this.messagingSettings.getDescription(), this.messagingSettings.getLogoUrl(), null, null, true, null, false, false, null, null, null, false, null, false, false, conversationScreenState.isAttachmentsEnabled(), ConversationScreenStatus.LOADING, false, null, false, null, conversationScreenState.getAuthorizationToken(), null, false, null, 125435824, null);
            } else {
                conversationScreenStateCopy$default = ConversationScreenState.copy$default(conversationScreenState, null, null, null, null, null, null, true, null, false, false, null, null, null, false, null, false, false, false, ConversationScreenStatus.LOADING, false, null, false, null, null, null, false, null, 133955519, null);
            }
        } while (!a2Var.g(value, conversationScreenStateCopy$default));
        i1 i1Var = this.refreshStateJob;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.refreshStateJob = f0.B(m1.d(this), null, null, new C04202(forcedScrolling, null), 3);
    }

    public static /* synthetic */ void showLoadingAndRefreshState$default(ConversationScreenViewModel conversationScreenViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        conversationScreenViewModel.showLoadingAndRefreshState(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ZendeskMessage toEventsMessage(Message message) {
        return new ZendeskMessage(message.getId(), message.getAuthor().getType() == AuthorType.BUSINESS ? ZendeskRole.BUSINESS : ZendeskRole.USER, DateKtxKt.toUnixTimeStamp(message.getTimestamp()));
    }

    private final void updateDisplayedFormsFromStorage(String conversationId) {
        if (conversationId != null) {
            f0.B(m1.d(this), null, null, new ConversationScreenViewModel$updateDisplayedFormsFromStorage$1$1(this, conversationId, null), 3);
        }
    }

    private final void updateNewMessagesDividerDate(ConversationKitEvent.ConversationUpdated conversationKitEvent) {
        if (this.visibleScreenTracker.hasVisibleScreen$zendesk_messaging_messaging_android()) {
            return;
        }
        this.newMessagesDividerHandler.updateNewMessageDividerDate(conversationKitEvent.getConversation());
    }

    private final void updatePostbackMessageStatus(String actionId, ConversationScreenPostbackStatus status, String text) {
        f0.B(m1.d(this), null, null, new C04231(actionId, status, text, null), 3);
    }

    public static /* synthetic */ void updatePostbackMessageStatus$default(ConversationScreenViewModel conversationScreenViewModel, String str, ConversationScreenPostbackStatus conversationScreenPostbackStatus, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        conversationScreenViewModel.updatePostbackMessageStatus(str, conversationScreenPostbackStatus, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProactiveParams() {
        this.conversationScreenRepository.updateProactiveParams(this.proactiveNotificationId, withReferralInfo());
    }

    private final void updateUserAccessRevokedState(boolean isRevoked) {
        this.savedStateHandle.d(Boolean.valueOf(isRevoked), KEY_USER_ACCESS_REVOKED);
        this.userAccessHasBeenRevoked = isRevoked;
        this.conversationScreenRepository.updateUserAccessHasBeenRevoked(isRevoked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadFiles(b0 b0Var, List<UploadFile> list, String str) {
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            UploadFile uploadFile = (UploadFile) obj;
            f0.B(b0Var, null, null, new ConversationScreenViewModel$uploadFiles$1$1(this, Message.Companion.create$default(Message.INSTANCE, new MessageContent.FileUpload(uploadFile.getUri(), uploadFile.getName(), uploadFile.getSize(), uploadFile.getMimeType(), (zendesk.conversationkit.android.model.MessageSourceType) null, 16, (DefaultConstructorMarker) null), null, null, null, 14, null), str, null), 3);
            i11 = i12;
        }
    }

    private final Integer withReferralInfo() {
        if (this.hasSentProactiveReferral) {
            return null;
        }
        return this.proactiveNotificationId;
    }

    public final void clearNewMessagesDivider() {
        f0.B(m1.d(this), null, null, new AnonymousClass1(null), 3);
    }

    @Nullable
    public final Object conversationId$zendesk_messaging_messaging_android(@NotNull x70.c<? super String> cVar) {
        final f1 f1Var = this._conversationScreenStateFlow;
        return y80.r.q(new y80.i() { // from class: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel\n*L\n1#1,49:1\n57#2:50\n58#2:52\n1333#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements y80.j {
                final /* synthetic */ y80.j $this_unsafeFlow;

                /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1$2", f = "ConversationScreenViewModel.kt", l = {52}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(x70.c cVar) {
                        super(cVar);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(y80.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // y80.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, x70.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1$2$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1$2$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        y70.a r1 = y70.a.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2e
                        if (r2 != r3) goto L27
                        ba0.g.M(r6)
                        goto L4c
                    L27:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        com.braze.h2.b(r5)
                        r5 = 0
                        return r5
                    L2e:
                        ba0.g.M(r6)
                        y80.j r6 = r4.$this_unsafeFlow
                        zendesk.messaging.android.internal.conversationscreen.ConversationScreenState r5 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenState) r5
                        zendesk.conversationkit.android.model.Conversation r5 = r5.getConversation()
                        if (r5 == 0) goto L40
                        java.lang.String r5 = r5.getId()
                        goto L41
                    L40:
                        r5 = 0
                    L41:
                        if (r5 == 0) goto L4c
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        kotlin.Unit r5 = kotlin.Unit.f26487a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$conversationId$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(y80.j jVar, x70.c cVar2) {
                Object objCollect = f1Var.collect(new AnonymousClass2(jVar), cVar2);
                return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        }, cVar);
    }

    public final void dispatchAction(@NotNull ConversationScreenAction conversationScreenAction) {
        a2 a2Var;
        Object value;
        a2 a2Var2;
        Object value2;
        a2 a2Var3;
        Object value3;
        a2 a2Var4;
        Object value4;
        a2 a2Var5;
        Object value5;
        conversationScreenAction.getClass();
        if (conversationScreenAction instanceof ConversationScreenAction.SendTextMessage) {
            ConversationScreenAction.SendTextMessage sendTextMessage = (ConversationScreenAction.SendTextMessage) conversationScreenAction;
            f0.B(this.sdkCoroutineScope, null, null, new C04051(sendTextMessage.getConversationId(), conversationScreenAction, Message.Companion.create$default(Message.INSTANCE, new MessageContent.Text(sendTextMessage.getTextMessage(), (List) null, (String) null, (zendesk.conversationkit.android.model.MessageSourceType) null, (Boolean) null, 30, (DefaultConstructorMarker) null), null, sendTextMessage.getMetadata(), sendTextMessage.getPayload(), 2, null), null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.ResendFailedMessage) {
            f0.B(this.sdkCoroutineScope, null, null, new C04062(conversationScreenAction, ((ConversationScreenAction.ResendFailedMessage) conversationScreenAction).getConversationId(), null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.SendFormResponse) {
            f0.B(this.sdkCoroutineScope, null, null, new AnonymousClass3(conversationScreenAction, ((ConversationScreenAction.SendFormResponse) conversationScreenAction).getConversationId(), null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.UploadFiles) {
            f0.B(this.sdkCoroutineScope, null, null, new AnonymousClass4(conversationScreenAction, ((ConversationScreenAction.UploadFiles) conversationScreenAction).getConversationId(), null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.SendActivityData) {
            f0.B(this.sdkCoroutineScope, null, null, new AnonymousClass5(conversationScreenAction, ((ConversationScreenAction.SendActivityData) conversationScreenAction).getConversationId(), null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.RetryConnection) {
            f0.B(this.sdkCoroutineScope, null, null, new AnonymousClass6(null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.FormFocusChanged) {
            f1 f1Var = this._conversationScreenStateFlow;
            do {
                a2Var5 = (a2) f1Var;
                value5 = a2Var5.getValue();
            } while (!a2Var5.g(value5, ConversationScreenState.copy$default((ConversationScreenState) value5, null, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, null, null, ((ConversationScreenAction.FormFocusChanged) conversationScreenAction).isFocused(), null, 100663295, null)));
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.HideDeniedPermission) {
            f1 f1Var2 = this._conversationScreenStateFlow;
            do {
                a2Var4 = (a2) f1Var2;
                value4 = a2Var4.getValue();
            } while (!a2Var4.g(value4, hideDeniedPermission((ConversationScreenState) value4)));
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.ShowDeniedPermission) {
            f1 f1Var3 = this._conversationScreenStateFlow;
            do {
                a2Var3 = (a2) f1Var3;
                value3 = a2Var3.getValue();
            } while (!a2Var3.g(value3, showDeniedPermission((ConversationScreenState) value3)));
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.PersistComposerText) {
            ConversationScreenAction.PersistComposerText persistComposerText = (ConversationScreenAction.PersistComposerText) conversationScreenAction;
            f0.B(this.sdkCoroutineScope, null, null, new AnonymousClass10(persistComposerText.getConversationId(), persistComposerText.getComposerText(), null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.LoadMoreMessages) {
            f0.B(this.sdkCoroutineScope, null, null, new AnonymousClass11(conversationScreenAction, null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.RetryLoadConversation) {
            showLoadingAndRefreshState$default(this, false, 1, null);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.SeeLatestViewClicked) {
            f1 f1Var4 = this._conversationScreenStateFlow;
            do {
                a2Var2 = (a2) f1Var4;
                value2 = a2Var2.getValue();
            } while (!a2Var2.g(value2, ConversationScreenState.copy$default((ConversationScreenState) value2, null, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 134152191, null)));
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.SendPostbackMessage) {
            ConversationScreenAction.SendPostbackMessage sendPostbackMessage = (ConversationScreenAction.SendPostbackMessage) conversationScreenAction;
            String actionId = sendPostbackMessage.getActionId();
            updatePostbackMessageStatus(actionId, ConversationScreenPostbackStatus.LOADING, sendPostbackMessage.getText());
            MessagingEventDispatcher.handlePostbackButtonClickedEvent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, null, 0L, sendPostbackMessage.getConversationId(), sendPostbackMessage.getText(), 3, null);
            f0.B(this.sdkCoroutineScope, null, null, new AnonymousClass13(conversationScreenAction, actionId, null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.PostbackBannerDismissed) {
            f1 f1Var5 = this._conversationScreenStateFlow;
            do {
                a2Var = (a2) f1Var5;
                value = a2Var.getValue();
            } while (!a2Var.g(value, ConversationScreenState.copy$default((ConversationScreenState) value, null, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 132120575, null)));
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.UploadFilesForRestoredUris) {
            f0.B(this.sdkCoroutineScope, null, null, new AnonymousClass15(conversationScreenAction, null), 3);
            return;
        }
        if (conversationScreenAction instanceof ConversationScreenAction.ViewAttachment) {
            f0.B(m1.d(this), null, null, new AnonymousClass16(conversationScreenAction, null), 3);
        } else if (conversationScreenAction instanceof ConversationScreenAction.CheckPollingStatus) {
            this.waitTimeBannerService.checkPollingStatus();
        } else {
            e40.a.f();
        }
    }

    @NotNull
    public final y1 getConversationScreenStateFlow() {
        return this.conversationScreenStateFlow;
    }

    @NotNull
    public final y80.i getEventsChannel() {
        return this.eventsChannel;
    }

    @Nullable
    public final MessagingScreen getMessagingScreen() {
        return this.messagingScreen;
    }

    public final void loadConversation(@NotNull String conversationId) {
        conversationId.getClass();
        this.conversationId = conversationId;
        showLoadingAndRefreshState(true);
        this.waitTimeBannerService.unsubscribe();
        this.waitTimeBannerService.subscribe(conversationId);
    }

    @Override // androidx.lifecycle.l1
    public void onCleared() {
        super.onCleared();
        this.conversationScreenRepository.removeEventListener(this.eventListener);
        this.waitTimeBannerService.unsubscribe();
    }

    public final void onSendMessage(@NotNull String conversationId) {
        conversationId.getClass();
        this.conversationTypingEvents.onSendMessage(conversationId);
    }

    public final void onTyping(@NotNull String conversationId) {
        conversationId.getClass();
        this.conversationTypingEvents.onTyping(conversationId);
    }

    public final void processConversationExtensionClickedEvent(@NotNull String size) {
        size.getClass();
        f0.B(m1.d(this), null, null, new C04131(size, null), 3);
    }

    public final void processConversationExtensionOpenedEvent(@NotNull String url) {
        url.getClass();
        f0.B(m1.d(this), null, null, new C04141(url, null), 3);
    }

    public final void processGuideArticleClickedEvent(@NotNull MessageSourceType senderType) {
        senderType.getClass();
        f0.B(m1.d(this), null, null, new C04151(senderType, null), 3);
    }

    public final void processMessagingClosedEvent() {
        MessagingEventDispatcher.handleMessagingClosedEvent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, null, 0L, 3, null);
    }

    public final void refreshTheme$zendesk_messaging_messaging_android(@NotNull MessagingTheme newTheme) {
        newTheme.getClass();
        MessagingTheme messagingTheme = newTheme;
        if (Intrinsics.areEqual(((ConversationScreenState) ((a2) this._conversationScreenStateFlow).getValue()).getMessagingTheme(), messagingTheme)) {
            return;
        }
        f1 f1Var = this._conversationScreenStateFlow;
        while (true) {
            a2 a2Var = (a2) f1Var;
            Object value = a2Var.getValue();
            f1 f1Var2 = f1Var;
            if (a2Var.g(value, ConversationScreenState.copy$default((ConversationScreenState) value, messagingTheme, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 134217726, null))) {
                return;
            }
            messagingTheme = newTheme;
            f1Var = f1Var2;
        }
    }

    public final void saveRestoredUris(@NotNull List<? extends Uri> uriList) {
        uriList.getClass();
        ArrayList arrayList = new ArrayList(e0.o(uriList, 10));
        Iterator<T> it = uriList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Uri) it.next()).toString());
        }
        this.savedStateHandle.d(arrayList, RESTORED_URIS_KEY);
    }

    @NotNull
    public final y80.i startPolling() {
        return new y80.w(this.waitTimeBannerService.pollingWithRetries(), new C04211(null));
    }

    public final void subscribeTypingEventsToLifecycle(@NotNull String conversationId) {
        conversationId.getClass();
        this.conversationTypingEvents.subscribeTypingEventsToLifecycle(conversationId);
    }

    public final void updateListOfStoredForm(@NotNull DisplayedField field, @NotNull String conversationId, @NotNull String formId) {
        field.getClass();
        conversationId.getClass();
        formId.getClass();
        f0.B(m1.d(this), null, null, new C04221(field, conversationId, formId, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$Companion;", "", "<init>", "()V", "LOG_TAG", "", ConversationScreenViewModel.HAS_REPLIED_TO_PROACTIVE_MESSAGE, ConversationScreenViewModel.HAS_SENT_PROACTIVE_REFERRAL_DATA, ConversationScreenViewModel.RESTORED_URIS_KEY, ConversationScreenViewModel.KEY_USER_ACCESS_REVOKED, "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectWaitTimeBannerEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectWaitTimeBannerEvents$1", f = "ConversationScreenViewModel.kt", l = {294}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04041 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C04041(x70.c<? super C04041> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenViewModel.this.new C04041(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04041) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                y80.i analyticsChannelEvents = ConversationScreenViewModel.this.waitTimeBannerService.getAnalyticsChannelEvents();
                C00441 c00441 = new C00441(ConversationScreenViewModel.this);
                this.label = 1;
                if (analyticsChannelEvents.collect(c00441, this) == aVar) {
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

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectWaitTimeBannerEvents$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C00441<T> implements y80.j {
            final /* synthetic */ ConversationScreenViewModel this$0;

            public C00441(ConversationScreenViewModel conversationScreenViewModel) {
                this.this$0 = conversationScreenViewModel;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
            
                if (r8.process(r9, r0) == r1) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
            
                if (r8.process(r9, r0) == r1) goto L29;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerAnalyticsEvent r8, x70.c<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectWaitTimeBannerEvents$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectWaitTimeBannerEvents$1$1$emit$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectWaitTimeBannerEvents$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectWaitTimeBannerEvents$1$1$emit$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$collectWaitTimeBannerEvents$1$1$emit$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    y70.a r1 = y70.a.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L35
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L2a
                    ba0.g.M(r9)
                    goto L79
                L2a:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    com.braze.h2.b(r8)
                L2f:
                    r8 = 0
                    return r8
                L31:
                    ba0.g.M(r9)
                    goto L4d
                L35:
                    ba0.g.M(r9)
                    boolean r9 = r8 instanceof zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerAnalyticsEvent.TrackAgentQueued
                    if (r9 == 0) goto L64
                    zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = r7.this$0
                    zendesk.messaging.android.internal.analytics.AnalyticsProcessor r8 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getAnalyticsProcessor$p(r8)
                    zendesk.messaging.android.internal.analytics.AnalyticsEventType$ConversationWithAgentRequested r9 = zendesk.messaging.android.internal.analytics.AnalyticsEventType.ConversationWithAgentRequested.INSTANCE
                    r0.label = r4
                    java.lang.Object r8 = r8.process(r9, r0)
                    if (r8 != r1) goto L4d
                    goto L78
                L4d:
                    zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = r7.this$0
                    java.lang.String r4 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getConversationId$p(r8)
                    if (r4 == 0) goto L8f
                    zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = r7.this$0
                    zendesk.messaging.android.internal.events.MessagingEventDispatcher r0 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getMessagingEventDispatcher$p(r8)
                    r5 = 3
                    r6 = 0
                    r1 = 0
                    r2 = 0
                    zendesk.messaging.android.internal.events.MessagingEventDispatcher.handleConversationWithAgentRequestedEvent$zendesk_messaging_messaging_android$default(r0, r1, r2, r4, r5, r6)
                    goto L8f
                L64:
                    boolean r8 = r8 instanceof zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerAnalyticsEvent.TrackAgentAssigned
                    if (r8 == 0) goto L92
                    zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = r7.this$0
                    zendesk.messaging.android.internal.analytics.AnalyticsProcessor r8 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getAnalyticsProcessor$p(r8)
                    zendesk.messaging.android.internal.analytics.AnalyticsEventType$ConversationAgentAssigned r9 = zendesk.messaging.android.internal.analytics.AnalyticsEventType.ConversationAgentAssigned.INSTANCE
                    r0.label = r3
                    java.lang.Object r8 = r8.process(r9, r0)
                    if (r8 != r1) goto L79
                L78:
                    return r1
                L79:
                    zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = r7.this$0
                    java.lang.String r4 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getConversationId$p(r8)
                    if (r4 == 0) goto L8f
                    zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = r7.this$0
                    zendesk.messaging.android.internal.events.MessagingEventDispatcher r0 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$getMessagingEventDispatcher$p(r8)
                    r5 = 3
                    r6 = 0
                    r1 = 0
                    r2 = 0
                    zendesk.messaging.android.internal.events.MessagingEventDispatcher.handleConversationAgentAssignedEvent$zendesk_messaging_messaging_android$default(r0, r1, r2, r4, r5, r6)
                L8f:
                    kotlin.Unit r8 = kotlin.Unit.f26487a
                    return r8
                L92:
                    e40.a.f()
                    goto L2f
                */
                throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.C04041.C00441.emit(zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerAnalyticsEvent, x70.c):java.lang.Object");
            }

            @Override // y80.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, x70.c cVar) {
                return emit((WaitTimeBannerAnalyticsEvent) obj, (x70.c<? super Unit>) cVar);
            }
        }
    }
}
