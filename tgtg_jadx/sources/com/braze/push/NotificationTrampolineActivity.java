package com.braze.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.h2;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\b\u0010\t\u001a\u00020\u0005H\u0014¨\u0006\n"}, d2 = {"Lcom/braze/push/NotificationTrampolineActivity;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationTrampolineActivity extends Activity {

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onResume$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "com.braze.push.NotificationTrampolineActivity$onResume$7", f = "NotificationTrampolineActivity.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass7 extends z70.i implements Function1<x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass7(x70.c<? super AnonymousClass7> cVar) {
            super(1, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Delay complete. Finishing Notification trampoline activity now";
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return NotificationTrampolineActivity.this.new AnonymousClass7(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Unit> cVar) {
            return ((AnonymousClass7) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) NotificationTrampolineActivity.this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new k(0), 6, (Object) null);
            NotificationTrampolineActivity.this.finish();
            return Unit.f26487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$0() {
        return "NotificationTrampolineActivity created";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPause$lambda$7() {
        return "Notification trampoline activity paused and finishing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$1() {
        return "Notification trampoline activity received null intent. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$2() {
        return "Notification trampoline activity received intent with null action. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$3(Intent intent) {
        return "Notification trampoline activity received intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$5() {
        return "Failed to route intent to notification receiver";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$6() {
        return "Notification trampoline activity finished processing. Delaying before finishing activity.";
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(8192, 8192);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new j(11), 6, (Object) null);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new j(12), 6, (Object) null);
        finish();
    }

    @Override // android.app.Activity
    public void onResume() {
        Intent intent;
        super.onResume();
        try {
            intent = getIntent();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new j(9), 4, (Object) null);
        }
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j(7), 7, (Object) null);
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j(8), 7, (Object) null);
            finish();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new g(5, intent), 6, (Object) null);
        Intent intent2 = new Intent(action).setClass(this, BrazeNotificationUtils.getNotificationReceiverClass());
        intent2.getClass();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (Constants.isAmazonDevice()) {
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, this, intent2, false, 4, null);
        } else {
            BrazePushReceiver.INSTANCE.handleReceivedIntent(this, intent2, false);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new j(10), 6, (Object) null);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200, null, new AnonymousClass7(null), 2, null);
    }
}
