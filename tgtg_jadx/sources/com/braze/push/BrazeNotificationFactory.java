package com.braze.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.s;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0007\u0010\u0010J7\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory;", "Lcom/braze/IBrazeNotificationFactory;", "<init>", "()V", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Landroid/app/Notification;", "createNotification", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroid/app/Notification;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "appConfigurationProvider", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "notificationExtras", "brazeExtras", "(Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/content/Context;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/app/Notification;", "configurationProvider", "Landroidx/core/app/s;", "populateNotificationBuilder", "(Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/content/Context;Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/core/app/s;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeNotificationFactory implements IBrazeNotificationFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createNotification$lambda$0() {
        return "Notification could not be built. Returning null as created notification";
    }

    @NotNull
    public static final BrazeNotificationFactory getInstance() {
        return INSTANCE.getInstance();
    }

    @Override // com.braze.IBrazeNotificationFactory
    @Nullable
    public Notification createNotification(@NotNull BrazeNotificationPayload payload) {
        payload.getClass();
        s sVarPopulateNotificationBuilder = INSTANCE.populateNotificationBuilder(payload);
        if (sVarPopulateNotificationBuilder != null) {
            return sVarPopulateNotificationBuilder.a();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new k(13), 6, (Object) null);
        return null;
    }

    @Nullable
    public final s populateNotificationBuilder(@Nullable BrazeConfigurationProvider configurationProvider, @Nullable Context context, @Nullable Bundle notificationExtras, @Nullable Bundle brazeExtras) {
        return INSTANCE.populateNotificationBuilder(new BrazeNotificationPayload(notificationExtras, brazeExtras, context, configurationProvider));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory$Companion;", "", "<init>", "()V", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Landroidx/core/app/s;", "populateNotificationBuilder", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/s;", "Lcom/braze/push/BrazeNotificationFactory;", "getInstance", "()Lcom/braze/push/BrazeNotificationFactory;", "getInstance$annotations", "instance", "internalInstance", "Lcom/braze/push/BrazeNotificationFactory;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$0(BrazeNotificationPayload brazeNotificationPayload) {
            return "Using BrazeNotificationPayload: " + brazeNotificationPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$1() {
            return "BrazeNotificationPayload has null context. Not creating notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$2() {
            return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
        }

        @NotNull
        public final BrazeNotificationFactory getInstance() {
            return BrazeNotificationFactory.internalInstance;
        }

        @Nullable
        public final s populateNotificationBuilder(@NotNull BrazeNotificationPayload payload) {
            payload.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d(payload, 0), 6, (Object) null);
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(14), 7, (Object) null);
                return null;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(15), 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(payload);
            s sVar = new s(context, BrazeNotificationUtils.getOrCreateNotificationChannelId(payload));
            sVar.c(16, true);
            BrazeNotificationUtils.setTitleIfPresent(sVar, payload);
            BrazeNotificationUtils.setContentIfPresent(sVar, payload);
            BrazeNotificationUtils.setTickerIfPresent(sVar, payload);
            BrazeNotificationUtils.setSetShowWhen(sVar, payload);
            BrazeNotificationUtils.setContentIntentIfPresent(context, sVar, notificationExtras);
            BrazeNotificationUtils.setDeleteIntent(context, sVar, notificationExtras);
            BrazeNotificationUtils.setSmallIcon(configurationProvider, sVar);
            BrazeNotificationUtils.setLargeIconIfPresentAndSupported(sVar, payload);
            BrazeNotificationUtils.setSoundIfPresentAndSupported(sVar, payload);
            BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(sVar, payload);
            BrazeNotificationUtils.setPriorityIfPresentAndSupported(sVar, payload);
            BrazeNotificationStyleFactory.INSTANCE.setStyleIfSupported(sVar, payload);
            BrazeNotificationActionUtils.addNotificationActions(sVar, payload);
            BrazeNotificationUtils.setAccentColorIfPresentAndSupported(sVar, payload);
            BrazeNotificationUtils.setCategoryIfPresentAndSupported(sVar, payload);
            BrazeNotificationUtils.setVisibilityIfPresentAndSupported(sVar, payload);
            BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(sVar, payload);
            BrazeNotificationUtils.setNotificationBadgeNumberIfPresent(sVar, payload);
            return sVar;
        }

        private Companion() {
        }

        public static /* synthetic */ void getInstance$annotations() {
        }
    }

    @Nullable
    public static final s populateNotificationBuilder(@NotNull BrazeNotificationPayload brazeNotificationPayload) {
        return INSTANCE.populateNotificationBuilder(brazeNotificationPayload);
    }

    @Nullable
    public final Notification createNotification(@Nullable BrazeConfigurationProvider appConfigurationProvider, @Nullable Context context, @Nullable Bundle notificationExtras, @Nullable Bundle brazeExtras) {
        return createNotification(new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider));
    }
}
