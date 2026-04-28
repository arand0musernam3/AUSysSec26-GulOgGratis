package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.MessageType;
import com.braze.managers.m0;
import com.braze.support.JsonUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.collections.o0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 )2\u00020\u0001:\u0001*B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bB1\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0002\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageHtml;", "Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;)V", "messageFields", "", "", "assetUrls", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;Lorg/json/JSONObject;Ljava/util/List;)V", "", "remotePathToLocalAssetMap", "", "setLocalPrefetchedAssetPaths", "(Ljava/util/Map;)V", "getLocalPrefetchedAssetPaths", "()Ljava/util/Map;", "getRemoteAssetPathsForPrefetch", "()Ljava/util/List;", "forJsonPut", "()Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "getMessageFields", "setMessageFields", "(Lorg/json/JSONObject;)V", "Ljava/util/Map;", "Ljava/util/List;", "getAssetUrls", "setAssetUrls", "(Ljava/util/List;)V", "", "isPushPrimer", "()Z", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "Companion", "com/braze/models/inappmessage/e", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InAppMessageHtml extends InAppMessageHtmlBase {
    private static final String ASSET_URLS_KEY = "asset_urls";
    public static final e Companion = new e();
    public static final String IS_PUSH_PRIMER_KEY = "is_push_primer";
    public static final String MESSAGE_FIELDS_KEY = "message_fields";
    private List<String> assetUrls;
    private JSONObject messageFields;
    private Map<String, String> remotePathToLocalAssetMap;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtml(JSONObject jSONObject, m0 m0Var) {
        this(jSONObject, m0Var, jSONObject.optJSONObject(MESSAGE_FIELDS_KEY), JsonUtils.convertStringJsonArrayToList(jSONObject.optJSONArray(ASSET_URLS_KEY)));
        jSONObject.getClass();
        m0Var.getClass();
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonObject() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jsonObject2 = super.getJsonObject();
        try {
            jsonObject2.put("type", getMessageType().name());
        } catch (JSONException unused) {
        }
        return jsonObject2;
    }

    public final List<String> getAssetUrls() {
        return this.assetUrls;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getLocalPrefetchedAssetPaths() {
        return this.remotePathToLocalAssetMap;
    }

    public final JSONObject getMessageFields() {
        return this.messageFields;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.HTML;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return this.assetUrls;
    }

    public final boolean isPushPrimer() {
        JSONObject jSONObject = this.messageFields;
        return jSONObject != null && jSONObject.optBoolean(IS_PUSH_PRIMER_KEY, false);
    }

    public final void setAssetUrls(List<String> list) {
        list.getClass();
        this.assetUrls = list;
    }

    @Override // com.braze.models.inappmessage.InAppMessageHtmlBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        remotePathToLocalAssetMap.getClass();
        this.remotePathToLocalAssetMap = remotePathToLocalAssetMap;
    }

    public final void setMessageFields(JSONObject jSONObject) {
        this.messageFields = jSONObject;
    }

    public InAppMessageHtml() {
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this.remotePathToLocalAssetMap = o0Var;
        n0 n0Var = n0.f26529a;
        this.assetUrls = n0Var;
        this.messageFields = new JSONObject();
        this.assetUrls = n0Var;
    }

    private InAppMessageHtml(JSONObject jSONObject, m0 m0Var, JSONObject jSONObject2, List<String> list) {
        super(jSONObject, m0Var);
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this.remotePathToLocalAssetMap = o0Var;
        this.messageFields = jSONObject2;
        this.assetUrls = list;
    }
}
