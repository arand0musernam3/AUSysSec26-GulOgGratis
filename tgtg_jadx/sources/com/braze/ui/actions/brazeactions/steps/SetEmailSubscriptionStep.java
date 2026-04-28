package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import com.braze.ui.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/SetEmailSubscriptionStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "isValid", "", Bayeux.KEY_DATA, "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "run", "", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SetEmailSubscriptionStep extends BaseBrazeActionStep {

    @NotNull
    public static final SetEmailSubscriptionStep INSTANCE;

    @NotNull
    private static final String TAG;

    static {
        SetEmailSubscriptionStep setEmailSubscriptionStep = new SetEmailSubscriptionStep();
        INSTANCE = setEmailSubscriptionStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setEmailSubscriptionStep);
    }

    private SetEmailSubscriptionStep() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$1(StepData stepData) {
        return "Could not parse subscription type from data: " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2(NotificationSubscriptionType notificationSubscriptionType, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.f26487a;
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(@NotNull StepData data) {
        data.getClass();
        return StepData.isArgCountInBounds$default(data, 1, null, 2, null) && data.isArgString(0);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(@NotNull Context context, @NotNull StepData data) {
        context.getClass();
        data.getClass();
        NotificationSubscriptionType notificationSubscriptionTypeFromValue = NotificationSubscriptionType.INSTANCE.fromValue(String.valueOf(data.getFirstArg()));
        if (notificationSubscriptionTypeFromValue == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(0, data), 7, (Object) null);
        } else {
            BaseBrazeActionStep.INSTANCE.runOnUser$android_sdk_ui_release(Braze.INSTANCE.getInstance(context), new c(notificationSubscriptionTypeFromValue, 2));
        }
    }
}
