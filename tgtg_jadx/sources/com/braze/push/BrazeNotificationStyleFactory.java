package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.e0;
import androidx.core.app.f0;
import androidx.core.app.l0;
import androidx.core.app.q;
import androidx.core.app.r;
import androidx.core.app.s;
import androidx.core.app.x;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory;", "", "<init>", "()V", "NoOpSentinelStyle", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeNotificationStyleFactory {
    private static final int BIG_PICTURE_STYLE_IMAGE_HEIGHT = 192;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String STORY_SET_GRAVITY = "setGravity";

    @NotNull
    private static final String STORY_SET_VISIBILITY = "setVisibility";

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$NoOpSentinelStyle;", "Landroidx/core/app/l0;", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoOpSentinelStyle extends l0 {
    }

    public static final void setBigPictureSummaryAndTitle(@NotNull q qVar, @NotNull BrazeNotificationPayload brazeNotificationPayload) {
        INSTANCE.setBigPictureSummaryAndTitle(qVar, brazeNotificationPayload);
    }

    public static final void setStyleIfSupported(@NotNull s sVar, @NotNull BrazeNotificationPayload brazeNotificationPayload) {
        INSTANCE.setStyleIfSupported(sVar, brazeNotificationPayload);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J)\u0010*\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J'\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020.2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$Companion;", "", "<init>", "()V", "Landroidx/core/app/s;", "notificationBuilder", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "", "setStyleIfSupported", "(Landroidx/core/app/s;Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroidx/core/app/l0;", "getNotificationStyle", "(Landroidx/core/app/s;Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/l0;", "Landroidx/core/app/r;", "getBigTextNotificationStyle", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/r;", "Landroidx/core/app/x;", "getStoryStyle", "(Landroidx/core/app/s;Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/x;", "getInlineImageStyle", "(Lcom/braze/models/push/BrazeNotificationPayload;Landroidx/core/app/s;)Landroidx/core/app/l0;", "Landroidx/core/app/q;", "getBigPictureNotificationStyle", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/q;", "Landroidx/core/app/f0;", "getConversationalPushStyle", "(Landroidx/core/app/s;Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/f0;", "bigPictureNotificationStyle", "setBigPictureSummaryAndTitle", "(Landroidx/core/app/q;Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroid/content/Context;", "context", "Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "pushStoryPage", "Landroid/app/PendingIntent;", "createStoryPageClickedPendingIntent", "(Landroid/content/Context;Lcom/braze/models/push/BrazeNotificationPayload;Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;)Landroid/app/PendingIntent;", "Landroid/os/Bundle;", "notificationExtras", "", "pageIndex", "createStoryTraversedPendingIntent", "(Landroid/content/Context;Landroid/os/Bundle;I)Landroid/app/PendingIntent;", "Landroid/widget/RemoteViews;", "view", "", "populatePushStoryPage", "(Landroid/widget/RemoteViews;Lcom/braze/models/push/BrazeNotificationPayload;Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;)Z", "isRemoteViewNotificationAvailableSpaceConstrained", "(Landroid/content/Context;)Z", "BIG_PICTURE_STYLE_IMAGE_HEIGHT", "I", "", "STORY_SET_GRAVITY", "Ljava/lang/String;", "STORY_SET_VISIBILITY", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazeNotificationStyleFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeNotificationStyleFactory.kt\ncom/braze/push/BrazeNotificationStyleFactory$Companion\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,599:1\n71#2,2:600\n*S KotlinDebug\n*F\n+ 1 BrazeNotificationStyleFactory.kt\ncom/braze/push/BrazeNotificationStyleFactory$Companion\n*L\n359#1:600,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent(Constants.BRAZE_STORY_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            intent.getClass();
            intent.setFlags(intent.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtras(payload.getNotificationExtras());
            intent.putExtra(Constants.BRAZE_ACTION_URI_KEY, pushStoryPage.getDeeplink());
            intent.putExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY, pushStoryPage.getUseWebview());
            intent.putExtra(Constants.BRAZE_STORY_PAGE_ID, pushStoryPage.getStoryPageId());
            intent.putExtra(Constants.BRAZE_CAMPAIGN_ID, pushStoryPage.getCampaignId());
            intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, BrazeNotificationUtils.getNotificationId(payload));
            PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags());
            activity.getClass();
            return activity;
        }

        private final PendingIntent createStoryTraversedPendingIntent(Context context, Bundle notificationExtras, int pageIndex) {
            Intent intent = new Intent(Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            intent.getClass();
            if (notificationExtras != null) {
                notificationExtras.putInt(Constants.BRAZE_STORY_INDEX_KEY, pageIndex);
                intent.putExtras(notificationExtras);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
            broadcast.getClass();
            return broadcast;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$18(String str) {
            return e0.f.k("Failed to download image bitmap for big picture notification style. Url: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$19() {
            return "Failed to scale image bitmap, using original.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$20() {
            return "Failed to create Big Picture Style.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$21() {
            return "Reply person does not exist in mapping. Not rendering a style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$22(BrazeNotificationPayload.ConversationMessage conversationMessage) {
            return "Message person does not exist in mapping. Not rendering a style. " + conversationMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$23() {
            return "Failed to create conversation push style. Returning null.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$11() {
            return "Inline Image Push cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$12() {
            return "Inline Image Push image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$13() {
            return "Inline Image Push failed to get image bitmap";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$15() {
            return "Inline Image Push application info was null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$1() {
            return "Rendering push notification with DecoratedCustomViewStyle (Story)";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$2() {
            return "Rendering conversational push";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$3() {
            return "Rendering push notification with custom inline image style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$4() {
            return "Rendering push notification with BigPictureStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$5() {
            return "Rendering push notification with BigTextStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$10() {
            return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$9() {
            return "Push story page cannot render without a context";
        }

        private final boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) {
            return Build.VERSION.SDK_INT >= 31 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 31;
        }

        private final boolean populatePushStoryPage(RemoteViews view, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(24), 7, (Object) null);
                return false;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(25), 7, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            if (bitmapUrl == null || StringsKt.H(bitmapUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(27), 7, (Object) null);
                return false;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            if (pushBitmapFromUrl == null) {
                return false;
            }
            view.setImageViewBitmap(R.id.com_braze_story_image_view, pushBitmapFromUrl);
            String title = pushStoryPage.getTitle();
            if (title == null || StringsKt.H(title)) {
                view.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            } else {
                view.setTextViewText(R.id.com_braze_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(title, configurationProvider));
                view.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getTitleGravity());
            }
            String subtitle = pushStoryPage.getSubtitle();
            if (subtitle == null || StringsKt.H(subtitle)) {
                view.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            } else {
                view.setTextViewText(R.id.com_braze_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(subtitle, configurationProvider));
                view.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getSubtitleGravity());
            }
            view.setOnClickPendingIntent(R.id.com_braze_story_relative_layout, createStoryPageClickedPendingIntent(context, payload, pushStoryPage));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$25() {
            return "Push story page cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$26() {
            return "Push story page cannot render without a configuration provider";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$27() {
            return "Push story page image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setStyleIfSupported$lambda$0() {
            return "Setting style for notification";
        }

        @Nullable
        public final q getBigPictureNotificationStyle(@NotNull BrazeNotificationPayload payload) {
            String bigImageUrl;
            Companion companion;
            payload.getClass();
            Context context = payload.getContext();
            if (context == null || (bigImageUrl = payload.getBigImageUrl()) == null || StringsKt.H(bigImageUrl)) {
                return null;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(bigImageUrl, 11), 7, (Object) null);
                return null;
            }
            try {
                if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                    int pixelsFromDensityAndDp = BrazeImageUtils.getPixelsFromDensityAndDp(BrazeImageUtils.getDensityDpi(context), 192);
                    int i11 = pixelsFromDensityAndDp * 2;
                    int displayWidthPixels = BrazeImageUtils.getDisplayWidthPixels(context);
                    if (i11 > displayWidthPixels) {
                        i11 = displayWidthPixels;
                    }
                    try {
                        pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i11, pixelsFromDensityAndDp, true);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new k(26), 4, (Object) null);
                    }
                }
                q qVar = new q();
                qVar.f2653a = pushBitmapFromUrl == null ? null : IconCompat.c(pushBitmapFromUrl);
                companion = this;
                try {
                    companion.setBigPictureSummaryAndTitle(qVar, payload);
                    return qVar;
                } catch (Exception e11) {
                    e = e11;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new k(28), 4, (Object) null);
                    return null;
                }
            } catch (Exception e12) {
                e = e12;
                companion = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new k(28), 4, (Object) null);
                return null;
            }
        }

        @NotNull
        public final r getBigTextNotificationStyle(@NotNull BrazeNotificationPayload payload) {
            CharSequence htmlSpannedTextIfEnabled;
            payload.getClass();
            r rVar = new r();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider != null) {
                String contentText = payload.getContentText();
                if (contentText != null && (htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider)) != null) {
                    rVar.f2661a = s.b(htmlSpannedTextIfEnabled);
                }
                String bigSummaryText = payload.getBigSummaryText();
                if (bigSummaryText != null) {
                    rVar.d(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
                }
                String bigTitleText = payload.getBigTitleText();
                if (bigTitleText != null) {
                    rVar.c(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
                }
            }
            return rVar;
        }

        @Nullable
        public final f0 getConversationalPushStyle(@NotNull s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
            notificationBuilder.getClass();
            payload.getClass();
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = payload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(payload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(29), 7, (Object) null);
                    return null;
                }
                f0 f0Var = new f0(conversationPerson.getPerson());
                Iterator<BrazeNotificationPayload.ConversationMessage> it = payload.getConversationMessages().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        f0Var.f2601e = Boolean.valueOf(conversationPersonMap.size() > 1);
                        notificationBuilder.f2685w = payload.getConversationShortcutId();
                        return f0Var;
                    }
                    BrazeNotificationPayload.ConversationMessage next = it.next();
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(next.getPersonId());
                    if (conversationPerson2 == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h(next, 3), 7, (Object) null);
                        return null;
                    }
                    e0 e0Var = new e0(next.getMessage(), next.getTimestamp(), conversationPerson2.getPerson());
                    ArrayList arrayList = f0Var.f2597a;
                    arrayList.add(e0Var);
                    if (arrayList.size() > 25) {
                        arrayList.remove(0);
                    }
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new e(0), 4, (Object) null);
                return null;
            }
        }

        @Nullable
        public final l0 getInlineImageStyle(@NotNull BrazeNotificationPayload payload, @NotNull s notificationBuilder) {
            payload.getClass();
            notificationBuilder.getClass();
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(17), 7, (Object) null);
                return null;
            }
            String bigImageUrl = payload.getBigImageUrl();
            if (bigImageUrl == null || StringsKt.H(bigImageUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(18), 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(19), 7, (Object) null);
                return null;
            }
            boolean zIsRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), zIsRemoteViewNotificationAvailableSpaceConstrained ? R.layout.com_braze_push_inline_image_constrained : R.layout.com_braze_notification_inline_image);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            Icon iconCreateWithResource = Icon.createWithResource(context, configurationProvider.getSmallNotificationIconResourceId());
            iconCreateWithResource.getClass();
            Integer accentColor = payload.getAccentColor();
            if (accentColor != null) {
                iconCreateWithResource.setTint(accentColor.intValue());
            }
            remoteViews.setImageViewIcon(R.id.com_braze_inline_image_push_app_icon, iconCreateWithResource);
            PackageManager packageManager = context.getPackageManager();
            try {
                CharSequence applicationLabel = packageManager.getApplicationLabel(Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo(context.getPackageName(), 0));
                applicationLabel.getClass();
                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled((String) applicationLabel, configurationProvider));
                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
                String string = notificationExtras.getString(Constants.BRAZE_PUSH_TITLE_KEY);
                if (string != null) {
                    remoteViews.setTextViewText(R.id.com_braze_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string, configurationProvider));
                }
                String string2 = notificationExtras.getString(Constants.BRAZE_PUSH_CONTENT_KEY);
                if (string2 != null) {
                    remoteViews.setTextViewText(R.id.com_braze_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string2, configurationProvider));
                }
                notificationBuilder.f2682t = remoteViews;
                if (zIsRemoteViewNotificationAvailableSpaceConstrained) {
                    notificationBuilder.d(pushBitmapFromUrl);
                    return new x();
                }
                remoteViews.setImageViewBitmap(R.id.com_braze_inline_image_push_side_image, pushBitmapFromUrl);
                return new NoOpSentinelStyle();
            } catch (PackageManager.NameNotFoundException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new k(20), 4, (Object) null);
                return null;
            }
        }

        /* JADX WARN: Failed to analyze thrown exceptions
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
         */
        @NotNull
        public final l0 getNotificationStyle(@NotNull s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
            l0 bigPictureNotificationStyle;
            notificationBuilder.getClass();
            payload.getClass();
            if (payload.getIsPushStory() && payload.getContext() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(1), 7, (Object) null);
                bigPictureNotificationStyle = getStoryStyle(notificationBuilder, payload);
            } else if (payload.getIsConversationalPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(2), 7, (Object) null);
                bigPictureNotificationStyle = getConversationalPushStyle(notificationBuilder, payload);
            } else if (payload.getBigImageUrl() == null) {
                bigPictureNotificationStyle = null;
            } else if (payload.getIsInlineImagePush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(3), 7, (Object) null);
                bigPictureNotificationStyle = getInlineImageStyle(payload, notificationBuilder);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(4), 7, (Object) null);
                bigPictureNotificationStyle = getBigPictureNotificationStyle(payload);
            }
            if (bigPictureNotificationStyle != null) {
                return bigPictureNotificationStyle;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(16), 7, (Object) null);
            return getBigTextNotificationStyle(payload);
        }

        @Nullable
        public final x getStoryStyle(@NotNull s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
            notificationBuilder.getClass();
            payload.getClass();
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(22), 7, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            int pushStoryPageIndex = payload.getPushStoryPageIndex();
            BrazeNotificationPayload.PushStoryPage pushStoryPage = pushStoryPages.get(pushStoryPageIndex);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.com_braze_push_story_one_image);
            if (!populatePushStoryPage(remoteViews, payload, pushStoryPage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new k(23), 6, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            x xVar = new x();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            notificationBuilder.f2683u = remoteViews;
            notificationBuilder.c(8, true);
            return xVar;
        }

        public final void setBigPictureSummaryAndTitle(@NotNull q bigPictureNotificationStyle, @NotNull BrazeNotificationPayload payload) {
            String contentText;
            bigPictureNotificationStyle.getClass();
            payload.getClass();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return;
            }
            String bigSummaryText = payload.getBigSummaryText();
            String bigTitleText = payload.getBigTitleText();
            String summaryText = payload.getSummaryText();
            if (bigSummaryText != null) {
                bigPictureNotificationStyle.e(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                bigPictureNotificationStyle.d(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = payload.getContentText()) != null) {
                bigPictureNotificationStyle.e(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
            }
        }

        public final void setStyleIfSupported(@NotNull s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
            notificationBuilder.getClass();
            payload.getClass();
            l0 notificationStyle = getNotificationStyle(notificationBuilder, payload);
            if (notificationStyle instanceof NoOpSentinelStyle) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(21), 7, (Object) null);
            notificationBuilder.e(notificationStyle);
        }

        private Companion() {
        }
    }
}
