package com.braze.models.inappmessage;

import android.net.Uri;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.h2;
import com.braze.models.IPutIntoJson;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.o0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010g\u001a\u00020h2\u0006\u0010+\u001a\u00020,H&J\u001c\u0010g\u001a\u00020h2\u0006\u0010+\u001a\u00020,2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100H&J\u001c\u0010i\u001a\u00020h2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH&J\u0014\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0016J\u000e\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00040mH&J\b\u0010n\u001a\u00020\u001cH&J\b\u0010o\u001a\u00020\u001cH&J\u0010\u0010o\u001a\u00020\u001c2\u0006\u0010p\u001a\u00020\u0004H&J\b\u0010q\u001a\u00020hH&R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0018\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\u001cX¦\u000e¢\u0006\u0012\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u001cX¦\u000e¢\u0006\u0012\u0012\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u0018\u0010'\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u0012\u0010*\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0012\u0010+\u001a\u00020,X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0004\u0018\u000100X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00103\u001a\u000204X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u00109\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u001a\u0010<\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u0018\u0010?\u001a\u00020@X¦\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010E\u001a\u00020FX¦\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u0018\u0010N\u001a\u00020OX¦\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0018\u0010T\u001a\u00020UX¦\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001e\u0010Z\u001a\u00020\u001cX¦\u000e¢\u0006\u0012\u0012\u0004\b[\u0010\u001e\u001a\u0004\b\\\u0010 \"\u0004\b]\u0010\"R\u0012\u0010^\u001a\u00020_X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0018\u0010b\u001a\u00020\u001cX¦\u000e¢\u0006\f\u001a\u0004\bb\u0010 \"\u0004\bc\u0010\"R\u001a\u0010d\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\be\u0010\u0006\"\u0004\bf\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006rÀ\u0006\u0001"}, d2 = {"Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", InAppMessageBase.MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", InAppMessageBase.EXTRAS, "", "getExtras", "()Ljava/util/Map;", "setExtras", "(Ljava/util/Map;)V", "durationInMilliseconds", "", "getDurationInMilliseconds", "()I", "setDurationInMilliseconds", "(I)V", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "iconColor", "getIconColor", "setIconColor", "animateOut", "", "getAnimateOut$annotations", "()V", "getAnimateOut", "()Z", "setAnimateOut", "(Z)V", "animateIn", "getAnimateIn$annotations", "getAnimateIn", "setAnimateIn", "iconBackgroundColor", "getIconBackgroundColor", "setIconBackgroundColor", "isControl", "clickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "dismissType", "Lcom/braze/enums/inappmessage/DismissType;", "getDismissType", "()Lcom/braze/enums/inappmessage/DismissType;", "setDismissType", "(Lcom/braze/enums/inappmessage/DismissType;)V", "messageTextColor", "getMessageTextColor", "setMessageTextColor", InAppMessageBase.ICON, "getIcon", "setIcon", InAppMessageBase.ORIENTATION, "Lcom/braze/enums/inappmessage/Orientation;", "getOrientation", "()Lcom/braze/enums/inappmessage/Orientation;", "setOrientation", "(Lcom/braze/enums/inappmessage/Orientation;)V", "cropType", "Lcom/braze/enums/inappmessage/CropType;", "getCropType", "()Lcom/braze/enums/inappmessage/CropType;", "setCropType", "(Lcom/braze/enums/inappmessage/CropType;)V", "altImageText", "getAltImageText", "setAltImageText", "messageTextAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "getMessageTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setMessageTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "expirationTimestamp", "", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "openUriInWebView", "getOpenUriInWebView$annotations", "getOpenUriInWebView", "setOpenUriInWebView", "messageType", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "isTestSend", "setTestSend", "messageExtras", "getMessageExtras", "setMessageExtras", "setClickBehavior", "", "setLocalPrefetchedAssetPaths", "remotePathToLocalAssetMap", "getLocalPrefetchedAssetPaths", "getRemoteAssetPathsForPrefetch", "", "logImpression", "logClick", "buttonId", "onAfterClosed", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessage extends IPutIntoJson<JSONObject> {
    static /* synthetic */ void setClickBehavior$default(IInAppMessage iInAppMessage, ClickAction clickAction, Uri uri, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: setClickBehavior");
            return;
        }
        if ((i11 & 2) != 0) {
            uri = null;
        }
        iInAppMessage.setClickBehavior(clickAction, uri);
    }

    String getAltImageText();

    boolean getAnimateIn();

    boolean getAnimateOut();

    int getBackgroundColor();

    /* JADX INFO: renamed from: getClickAction */
    ClickAction getInternalClickAction();

    CropType getCropType();

    DismissType getDismissType();

    int getDurationInMilliseconds();

    long getExpirationTimestamp();

    Map<String, String> getExtras();

    String getIcon();

    int getIconBackgroundColor();

    int getIconColor();

    default Map<String, String> getLocalPrefetchedAssetPaths() {
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        return o0Var;
    }

    String getMessage();

    String getMessageExtras();

    TextAlign getMessageTextAlign();

    int getMessageTextColor();

    MessageType getMessageType();

    boolean getOpenUriInWebView();

    Orientation getOrientation();

    List<String> getRemoteAssetPathsForPrefetch();

    /* JADX INFO: renamed from: getUri */
    Uri getInternalUri();

    boolean isControl();

    /* JADX INFO: renamed from: isTestSend */
    boolean getIsTestSend();

    boolean logClick();

    boolean logClick(String buttonId);

    boolean logImpression();

    void onAfterClosed();

    void setAltImageText(String str);

    void setAnimateIn(boolean z11);

    void setAnimateOut(boolean z11);

    void setBackgroundColor(int i11);

    void setClickBehavior(ClickAction clickAction);

    void setClickBehavior(ClickAction clickAction, Uri uri);

    void setCropType(CropType cropType);

    void setDismissType(DismissType dismissType);

    void setDurationInMilliseconds(int i11);

    void setExpirationTimestamp(long j9);

    void setExtras(Map<String, String> map);

    void setIcon(String str);

    void setIconBackgroundColor(int i11);

    void setIconColor(int i11);

    void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap);

    void setMessage(String str);

    void setMessageExtras(String str);

    void setMessageTextAlign(TextAlign textAlign);

    void setMessageTextColor(int i11);

    void setOpenUriInWebView(boolean z11);

    void setOrientation(Orientation orientation);

    void setTestSend(boolean z11);

    static /* synthetic */ void getAnimateIn$annotations() {
    }

    static /* synthetic */ void getAnimateOut$annotations() {
    }

    static /* synthetic */ void getOpenUriInWebView$annotations() {
    }
}
