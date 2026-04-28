package com.braze.support;

import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10772a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    public static final InAppMessageBase a(JSONObject jSONObject, com.braze.managers.r rVar) {
        InAppMessageBase inAppMessageFull;
        String upperCase;
        jSONObject.getClass();
        rVar.getClass();
        try {
            if (jSONObject.optBoolean("is_control", false)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10772a, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new mw.e(25), 12, (Object) null);
                return new InAppMessageControl(jSONObject, rVar);
            }
            try {
                String string = jSONObject.getString("type");
                string.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                upperCase = string.toUpperCase(locale);
                upperCase.getClass();
            } catch (Exception unused) {
                messageType = null;
            }
            for (MessageType messageType : MessageType.values()) {
                if (Intrinsics.areEqual(messageType.name(), upperCase)) {
                    if (messageType == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10772a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new bw.a(jSONObject, 14), 12, (Object) null);
                        return null;
                    }
                    int i11 = r.f10771a[messageType.ordinal()];
                    if (i11 == 1) {
                        inAppMessageFull = new InAppMessageFull(jSONObject, rVar);
                    } else if (i11 == 2) {
                        inAppMessageFull = new InAppMessageModal(jSONObject, rVar);
                    } else if (i11 == 3) {
                        inAppMessageFull = new InAppMessageSlideup(jSONObject, rVar);
                    } else if (i11 == 4) {
                        inAppMessageFull = new InAppMessageHtmlFull(jSONObject, rVar);
                    } else {
                        if (i11 != 5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10772a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new bw.a(jSONObject, 15), 12, (Object) null);
                            return null;
                        }
                        inAppMessageFull = new InAppMessageHtml(jSONObject, rVar);
                    }
                    return inAppMessageFull;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10772a, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new bw.a(jSONObject, 16), 8, (Object) null);
            return null;
        }
    }

    public static final String b(JSONObject jSONObject) {
        return e0.f.k("Unknown in-app message type. Returning null: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    public static final String c(JSONObject jSONObject) {
        return a0.p("Failed to deserialize the in-app message: ", JsonUtils.getPrettyPrintedString(jSONObject), ". Returning null.");
    }

    public static final String b() {
        return "In-app message string was blank.";
    }

    public static final InAppMessageBase a(String str, com.braze.managers.r rVar) {
        str.getClass();
        rVar.getClass();
        if (StringsKt.H(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10772a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new mw.e(24), 12, (Object) null);
            return null;
        }
        try {
            return a(new JSONObject(str), rVar);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10772a, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new mw.d(str, 21), 8, (Object) null);
            return null;
        }
    }

    public static final String a(String str) {
        return e0.f.k("Failed to deserialize the in-app message string: ", str);
    }

    public static final String a() {
        return "Deserializing control in-app message.";
    }

    public static final String a(JSONObject jSONObject) {
        return e0.f.k("In-app message type was unknown for in-app message: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }
}
