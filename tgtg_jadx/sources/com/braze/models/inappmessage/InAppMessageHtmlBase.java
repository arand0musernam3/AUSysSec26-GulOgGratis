package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.MessageType;
import com.braze.events.internal.f0;
import com.braze.f1;
import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.support.BrazeLogger;
import j4.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b'\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0004R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;)V", "", "", "remotePathToLocalAssetMap", "", "setLocalPrefetchedAssetPaths", "(Ljava/util/Map;)V", "buttonId", "", "logButtonClick", "(Ljava/lang/String;)Z", "onAfterClosed", "localAssetsDirectoryUrl", "Ljava/lang/String;", "getLocalAssetsDirectoryUrl", "()Ljava/lang/String;", "setLocalAssetsDirectoryUrl", "(Ljava/lang/String;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InAppMessageHtmlBase extends InAppMessageBase implements IInAppMessageHtml {
    private String buttonIdClicked;
    private String localAssetsDirectoryUrl;
    private boolean wasButtonClickLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtmlBase(JSONObject jSONObject, m0 m0Var) {
        super(jSONObject, m0Var, false, false, 12, null);
        jSONObject.getClass();
        m0Var.getClass();
        setOpenUriInWebView(jSONObject.optBoolean(InAppMessageBase.OPEN_URI_IN_WEBVIEW, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$0(String str) {
        return e0.f.k("Trigger id not found (this is expected for test sends). Not logging html in-app message button click for id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Button Id was null or blank for this html in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$2() {
        return "Button click already logged for this html in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$3() {
        return "Cannot log an html in-app message button click because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$5(String str, String str2) {
        return s.k("Logged button click for button id: ", str, " and trigger id: ", str2);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public String getLocalAssetsDirectoryUrl() {
        return this.localAssetsDirectoryUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public boolean logButtonClick(String buttonId) {
        buttonId.getClass();
        String triggerId = getTriggerId();
        m0 brazeManager = getBrazeManager();
        if (triggerId == null || triggerId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n(buttonId, 0), 7, (Object) null);
            return false;
        }
        if (StringsKt.H(buttonId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(28), 6, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged && getMessageType() != MessageType.HTML) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(29), 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new m(0), 6, (Object) null);
            return false;
        }
        com.braze.models.k kVarI = com.braze.models.outgoing.event.b.f10176g.i(triggerId, buttonId);
        if (kVarI != null) {
            ((r) brazeManager).a(kVarI);
        }
        this.buttonIdClicked = buttonId;
        this.wasButtonClickLogged = true;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1(buttonId, triggerId, 4), 7, (Object) null);
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        m0 brazeManager;
        super.onAfterClosed();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || StringsKt.H(triggerId) || (str = this.buttonIdClicked) == null || StringsKt.H(str) || (brazeManager = getBrazeManager()) == null) {
            return;
        }
        ((com.braze.events.d) ((r) brazeManager).f10070d).b(new f0(new com.braze.triggers.events.d(getTriggerId(), this.buttonIdClicked)), f0.class);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public void setLocalAssetsDirectoryUrl(String str) {
        this.localAssetsDirectoryUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        remotePathToLocalAssetMap.getClass();
        if (remotePathToLocalAssetMap.isEmpty()) {
            return;
        }
        setLocalAssetsDirectoryUrl(((String[]) remotePathToLocalAssetMap.values().toArray(new String[0]))[0]);
    }

    public InAppMessageHtmlBase() {
        setOpenUriInWebView(true);
    }
}
