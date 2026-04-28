package com.braze.ui.actions.brazeactions.steps;

import a3.p;
import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/SetCustomUserAttributeStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "isValid", "", Bayeux.KEY_DATA, "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "run", "", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SetCustomUserAttributeStep extends BaseBrazeActionStep {

    @NotNull
    public static final SetCustomUserAttributeStep INSTANCE;

    @NotNull
    private static final String TAG;

    static {
        SetCustomUserAttributeStep setCustomUserAttributeStep = new SetCustomUserAttributeStep();
        INSTANCE = setCustomUserAttributeStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setCustomUserAttributeStep);
    }

    private SetCustomUserAttributeStep() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$1(StepData stepData, Object obj, BrazeUser brazeUser) {
        brazeUser.getClass();
        BrazeUser.setCustomAttribute$default(brazeUser, String.valueOf(stepData.getFirstArg()), obj, false, 4, null);
        return Unit.f26487a;
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(@NotNull StepData data) {
        data.getClass();
        return StepData.isArgCountInBounds$default(data, 2, null, 2, null) && data.isArgString(0) && data.getSecondArg() != null;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(@NotNull Context context, @NotNull StepData data) {
        context.getClass();
        data.getClass();
        Object secondArg = data.getSecondArg();
        if (secondArg == null) {
            return;
        }
        BaseBrazeActionStep.INSTANCE.runOnUser$android_sdk_ui_release(Braze.INSTANCE.getInstance(context), new p(19, data, secondArg));
    }
}
