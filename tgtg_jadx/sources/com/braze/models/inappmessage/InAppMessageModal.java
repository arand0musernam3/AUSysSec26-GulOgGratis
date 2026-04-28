package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.MessageType;
import com.braze.managers.m0;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageModal;", "Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;)V", "forJsonPut", "()Lorg/json/JSONObject;", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InAppMessageModal extends InAppMessageImmersiveBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageModal(JSONObject jSONObject, m0 m0Var) {
        String upperCase;
        int i11;
        super(jSONObject, m0Var);
        jSONObject.getClass();
        m0Var.getClass();
        CropType cropType = getImageStyle() == ImageStyle.GRAPHIC ? CropType.CENTER_CROP : CropType.FIT_CENTER;
        try {
            String string = jSONObject.getString(InAppMessageBase.CROP_TYPE);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            upperCase = string.toUpperCase(locale);
            upperCase.getClass();
        } catch (Exception unused) {
        }
        for (CropType cropType2 : CropType.values()) {
            if (Intrinsics.areEqual(cropType2.name(), upperCase)) {
                cropType = cropType2;
                setCropType(cropType);
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.braze.models.inappmessage.InAppMessageImmersiveBase, com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
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

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.MODAL;
    }

    public InAppMessageModal() {
    }
}
