package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.MessageType;
import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageControl;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;)V", "", "logImpression", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "controlImpressionLogged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InAppMessageControl extends InAppMessageBase {
    private final AtomicBoolean controlImpressionLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageControl(JSONObject jSONObject, m0 m0Var) {
        super(jSONObject, m0Var, false, false, 12, null);
        jSONObject.getClass();
        m0Var.getClass();
        this.controlImpressionLogged = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$0() {
        return "Control impression already logged for this in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$1() {
        return "Trigger Id not found (this is expected for test sends). Not logging in-app message control impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$2() {
        return "Cannot log an in-app message control impression because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$3() {
        return "Logging control in-app message impression event";
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.CONTROL;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        if (this.controlImpressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(24), 6, (Object) null);
            return false;
        }
        String triggerId = getTriggerId();
        if (triggerId == null || triggerId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(27), 6, (Object) null);
            return false;
        }
        if (getBrazeManager() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(25), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(26), 6, (Object) null);
        String triggerId2 = getTriggerId();
        com.braze.models.k kVarK = triggerId2 != null ? com.braze.models.outgoing.event.b.f10176g.k(triggerId2, getMessageExtras()) : null;
        if (kVarK != null) {
            m0 brazeManager = getBrazeManager();
            if (brazeManager != null) {
                ((r) brazeManager).a(kVarK);
            }
            this.controlImpressionLogged.set(true);
        }
        return true;
    }
}
