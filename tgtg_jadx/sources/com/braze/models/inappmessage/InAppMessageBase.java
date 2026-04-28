package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.h2;
import com.braze.managers.m0;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.s;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\b'\u0018\u0000  \u00012\u00020\u00012\u00020\u0002:\u0002¡\u0001B\t\b\u0010¢\u0006\u0004\b\u0003\u0010\u0004B-\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\fJ\u001b\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00132\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R(\u00104\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b9\u0010\u0004\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u00108R.\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010$R(\u0010?\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b?\u00105\u0012\u0004\bB\u0010\u0004\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u00108R(\u0010C\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bC\u00105\u0012\u0004\bF\u0010\u0004\u001a\u0004\bD\u0010\u001a\"\u0004\bE\u00108R\"\u0010H\u001a\u00020G8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010P\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010k\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010,\u001a\u0004\bl\u0010.\"\u0004\bm\u00100R\"\u0010o\u001a\u00020n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010u\u001a\u00020N8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bu\u0010Q\u001a\u0004\bv\u0010S\"\u0004\bw\u0010UR\"\u0010x\u001a\u00020N8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bx\u0010Q\u001a\u0004\by\u0010S\"\u0004\bz\u0010UR\"\u0010{\u001a\u00020N8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b{\u0010Q\u001a\u0004\b|\u0010S\"\u0004\b}\u0010UR#\u0010~\u001a\u00020N8\u0016@\u0016X\u0097\u000e¢\u0006\u0013\n\u0004\b~\u0010Q\u001a\u0004\b\u007f\u0010S\"\u0005\b\u0080\u0001\u0010UR&\u0010\u0081\u0001\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u00105\u001a\u0005\b\u0081\u0001\u0010\u001a\"\u0005\b\u0082\u0001\u00108R\u0016\u0010\n\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0084\u0001R\u0016\u0010\u000b\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0084\u0001R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010&\"\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\b\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R,\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010\u0096\u0001\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010,\u001a\u0005\b\u0097\u0001\u0010.\"\u0005\b\u0098\u0001\u00100R\u0016\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u009d\u0001\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u001aR\u0015\u0010\u009f\u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010.¨\u0006¢\u0001"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Lcom/braze/managers/m0;", "brazeManager", "", "impressionLogged", "clickLogged", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;ZZ)V", "", "buttonId", "handleLogClick", "(Ljava/lang/String;)Z", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "", "setClickBehavior", "(Lcom/braze/enums/inappmessage/ClickAction;)V", "Landroid/net/Uri;", "uri", "(Lcom/braze/enums/inappmessage/ClickAction;Landroid/net/Uri;)V", "logImpression", "()Z", "logClick", "onAfterClosed", "enableDarkTheme", "", "getRemoteAssetPathsForPrefetch", "()Ljava/util/List;", "", "remotePathToLocalAssetMap", "setLocalPrefetchedAssetPaths", "(Ljava/util/Map;)V", "forJsonPut", "()Lorg/json/JSONObject;", "internalClickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "internalUri", "Landroid/net/Uri;", InAppMessageBase.MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", InAppMessageBase.ICON, "getIcon", "setIcon", "openUriInWebView", "Z", "getOpenUriInWebView", "setOpenUriInWebView", "(Z)V", "getOpenUriInWebView$annotations", InAppMessageBase.EXTRAS, "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "setExtras", "animateIn", "getAnimateIn", "setAnimateIn", "getAnimateIn$annotations", "animateOut", "getAnimateOut", "setAnimateOut", "getAnimateOut$annotations", "Lcom/braze/enums/inappmessage/DismissType;", "dismissType", "Lcom/braze/enums/inappmessage/DismissType;", "getDismissType", "()Lcom/braze/enums/inappmessage/DismissType;", "setDismissType", "(Lcom/braze/enums/inappmessage/DismissType;)V", "", "value", "durationInMilliseconds", "I", "getDurationInMilliseconds", "()I", "setDurationInMilliseconds", "(I)V", "Lcom/braze/enums/inappmessage/Orientation;", InAppMessageBase.ORIENTATION, "Lcom/braze/enums/inappmessage/Orientation;", "getOrientation", "()Lcom/braze/enums/inappmessage/Orientation;", "setOrientation", "(Lcom/braze/enums/inappmessage/Orientation;)V", "Lcom/braze/enums/inappmessage/CropType;", "cropType", "Lcom/braze/enums/inappmessage/CropType;", "getCropType", "()Lcom/braze/enums/inappmessage/CropType;", "setCropType", "(Lcom/braze/enums/inappmessage/CropType;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "messageTextAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "getMessageTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setMessageTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "altImageText", "getAltImageText", "setAltImageText", "", "expirationTimestamp", "J", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "iconBackgroundColor", "getIconBackgroundColor", "setIconBackgroundColor", "messageTextColor", "getMessageTextColor", "setMessageTextColor", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "iconColor", "getIconColor", "setIconColor", "isTestSend", "setTestSend", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "setJsonObject", "(Lorg/json/JSONObject;)V", "Lcom/braze/managers/m0;", "getBrazeManager", "()Lcom/braze/managers/m0;", "setBrazeManager", "(Lcom/braze/managers/m0;)V", "Lcom/braze/models/theme/a;", "inAppMessageDarkThemeWrapper", "Lcom/braze/models/theme/a;", "getInAppMessageDarkThemeWrapper", "()Lcom/braze/models/theme/a;", "setInAppMessageDarkThemeWrapper", "(Lcom/braze/models/theme/a;)V", "messageExtras", "getMessageExtras", "setMessageExtras", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "getUri", "()Landroid/net/Uri;", "isControl", "getTriggerId", "triggerId", "Companion", "com/braze/models/inappmessage/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InAppMessageBase implements IInAppMessage, IInAppMessageThemeable {
    protected static final String ANIMATE_IN = "animate_in";
    protected static final String ANIMATE_OUT = "animate_out";
    public static final String BG_COLOR = "bg_color";
    public static final String CLICK_ACTION = "click_action";
    public static final String CROP_TYPE = "crop_type";
    public static final a Companion = new a();
    public static final String DISMISS_TYPE = "message_close";
    public static final String DURATION = "duration";
    public static final String EXTRAS = "extras";
    public static final String ICON = "icon";
    public static final String ICON_BG_COLOR = "icon_bg_color";
    public static final String ICON_COLOR = "icon_color";
    public static final String IMAGE_ALT = "image_alt";
    public static final int INAPP_MESSAGE_DURATION_DEFAULT_MILLIS = 5000;
    public static final int INAPP_MESSAGE_DURATION_MIN_MILLIS = 999;
    public static final String IS_CONTROL = "is_control";
    public static final String IS_TEST_SEND = "is_test_send";
    public static final String MESSAGE = "message";
    public static final String MESSAGE_EXTRAS = "message_extras";
    public static final String MESSAGE_TEXT_ALIGN = "text_align_message";
    public static final String MESSAGE_TEXT_COLOR = "text_color";
    public static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    public static final String ORIENTATION = "orientation";
    public static final String TRIGGER_ID = "trigger_id";
    public static final String TYPE = "type";
    public static final String URI = "uri";
    private String altImageText;
    private boolean animateIn;
    private boolean animateOut;
    private int backgroundColor;
    private m0 brazeManager;
    private final AtomicBoolean clickLogged;
    private CropType cropType;
    private DismissType dismissType;
    private int durationInMilliseconds;
    private long expirationTimestamp;
    private Map<String, String> extras;
    private String icon;
    private int iconBackgroundColor;
    private int iconColor;
    private final AtomicBoolean impressionLogged;
    private com.braze.models.theme.a inAppMessageDarkThemeWrapper;
    private ClickAction internalClickAction;
    private Uri internalUri;
    private boolean isTestSend;
    private JSONObject jsonObject;
    private String message;
    private String messageExtras;
    private TextAlign messageTextAlign;
    private int messageTextColor;
    private boolean openUriInWebView;
    private Orientation orientation;

    public InAppMessageBase(JSONObject jSONObject, m0 m0Var, boolean z11, boolean z12) throws JSONException {
        String upperCase;
        String upperCase2;
        int i11;
        String upperCase3;
        int i12;
        jSONObject.getClass();
        m0Var.getClass();
        this.internalClickAction = ClickAction.NONE;
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this.extras = o0Var;
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        Orientation orientation = Orientation.ANY;
        this.orientation = orientation;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
        this.jsonObject = jSONObject;
        this.brazeManager = m0Var;
        setMessage(jSONObject.optString(MESSAGE));
        setAnimateIn(jSONObject.optBoolean(ANIMATE_IN, true));
        setAnimateOut(jSONObject.optBoolean(ANIMATE_OUT, true));
        setDurationInMilliseconds(jSONObject.optInt(DURATION));
        setIcon(jSONObject.optString(ICON));
        try {
            String string = jSONObject.getString(ORIENTATION);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            upperCase3 = string.toUpperCase(locale);
            upperCase3.getClass();
        } catch (Exception unused) {
        }
        for (Orientation orientation2 : Orientation.values()) {
            if (Intrinsics.areEqual(orientation2.name(), upperCase3)) {
                orientation = orientation2;
                setOrientation(orientation);
                setOpenUriInWebView(jSONObject.optBoolean(OPEN_URI_IN_WEBVIEW, false));
                setIconBackgroundColor(jSONObject.optInt(ICON_BG_COLOR));
                setMessageTextColor(jSONObject.optInt(MESSAGE_TEXT_COLOR));
                setBackgroundColor(jSONObject.optInt(BG_COLOR));
                setIconColor(jSONObject.optInt(ICON_COLOR));
                this.impressionLogged.set(z11);
                this.clickLogged.set(z12);
                setExtras(JsonUtils.convertJSONObjectToMap(jSONObject.optJSONObject(EXTRAS)));
                if (jSONObject.has(MESSAGE_EXTRAS)) {
                    setMessageExtras(jSONObject.optString(MESSAGE_EXTRAS));
                }
                String strOptString = jSONObject.optString("uri");
                ClickAction clickAction = ClickAction.NONE;
                try {
                    String string2 = jSONObject.getString(CLICK_ACTION);
                    string2.getClass();
                    Locale locale2 = Locale.US;
                    locale2.getClass();
                    upperCase2 = string2.toUpperCase(locale2);
                    upperCase2.getClass();
                } catch (Exception unused2) {
                }
                for (ClickAction clickAction2 : ClickAction.values()) {
                    if (Intrinsics.areEqual(clickAction2.name(), upperCase2)) {
                        clickAction = clickAction2;
                        if (clickAction == ClickAction.URI && strOptString != null && !StringsKt.H(strOptString)) {
                            this.internalUri = Uri.parse(strOptString);
                        }
                        this.internalClickAction = clickAction;
                        DismissType dismissType = DismissType.AUTO_DISMISS;
                        try {
                            String string3 = jSONObject.getString(DISMISS_TYPE);
                            string3.getClass();
                            Locale locale3 = Locale.US;
                            locale3.getClass();
                            upperCase = string3.toUpperCase(locale3);
                            upperCase.getClass();
                        } catch (Exception unused3) {
                        }
                        for (DismissType dismissType2 : DismissType.values()) {
                            if (Intrinsics.areEqual(dismissType2.name(), upperCase)) {
                                dismissType = dismissType2;
                                setDismissType(dismissType == DismissType.SWIPE ? DismissType.MANUAL : dismissType);
                                setAltImageText(jSONObject.optString(IMAGE_ALT));
                                String str = s.f10772a;
                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("themes");
                                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("dark") : null;
                                this.inAppMessageDarkThemeWrapper = jSONObjectOptJSONObject2 != null ? new com.braze.models.theme.a(jSONObjectOptJSONObject2) : null;
                                jSONObject.put("is_test_send", getIsTestSend());
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_durationInMilliseconds_$lambda$0(int i11) {
        return r8.k.h(i11, "Requested in-app message duration ", " is lower than the minimum of 999. Defaulting to 5000 milliseconds.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_durationInMilliseconds_$lambda$1(int i11) {
        return r8.k.h(i11, "Set in-app message duration to ", " milliseconds.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$6() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$9() {
        return "Failed to construct json for in-app message";
    }

    private final boolean handleLogClick(String buttonId) {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.H(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(23), 7, (Object) null);
            return false;
        }
        m0 m0Var = this.brazeManager;
        if (m0Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(21), 6, (Object) null);
            return false;
        }
        if (getMessageType() != MessageType.HTML && this.clickLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(22), 6, (Object) null);
            return false;
        }
        this.clickLogged.set(true);
        f0.B(com.braze.coroutine.f.f9657a, null, null, new b(buttonId, triggerId, m0Var, null), 3);
        return true;
    }

    public static /* synthetic */ boolean handleLogClick$default(InAppMessageBase inAppMessageBase, String str, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: handleLogClick");
            return false;
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        return inAppMessageBase.handleLogClick(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$10() {
        return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$11() {
        return "Cannot log an in-app message click because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$12() {
        return "Click already logged for this in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$3() {
        return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$4() {
        return "Cannot log an in-app message impression because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$5() {
        return "Impression already logged for this in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setClickBehavior$lambda$2() {
        return "A non-null URI is required in order to set the message ClickAction to URI.";
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        com.braze.models.theme.a aVar = this.inAppMessageDarkThemeWrapper;
        if (aVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(20), 7, (Object) null);
            return;
        }
        Integer num = aVar.f10281a;
        if (num != null) {
            setBackgroundColor(num.intValue());
        }
        Integer num2 = aVar.f10284d;
        if (num2 != null) {
            setIconColor(num2.intValue());
        }
        Integer num3 = aVar.f10285e;
        if (num3 != null) {
            setIconBackgroundColor(num3.intValue());
        }
        Integer num4 = aVar.f10282b;
        if (num4 != null) {
            setMessageTextColor(num4.intValue());
        }
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonObject() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt(MESSAGE, getMessage());
            jSONObject2.put(DURATION, getDurationInMilliseconds());
            jSONObject2.putOpt(TRIGGER_ID, getTriggerId());
            jSONObject2.putOpt(CLICK_ACTION, getInternalClickAction().toString());
            jSONObject2.putOpt(DISMISS_TYPE, getDismissType().toString());
            if (getInternalUri() != null) {
                jSONObject2.put("uri", String.valueOf(getInternalUri()));
            }
            jSONObject2.put(OPEN_URI_IN_WEBVIEW, getOpenUriInWebView());
            jSONObject2.put(ANIMATE_IN, getAnimateIn());
            jSONObject2.put(ANIMATE_OUT, getAnimateOut());
            jSONObject2.put(BG_COLOR, getBackgroundColor());
            jSONObject2.put(MESSAGE_TEXT_COLOR, getMessageTextColor());
            jSONObject2.put(ICON_COLOR, getIconColor());
            jSONObject2.put(ICON_BG_COLOR, getIconBackgroundColor());
            jSONObject2.putOpt(ICON, getIcon());
            jSONObject2.putOpt(CROP_TYPE, getCropType().toString());
            jSONObject2.putOpt(ORIENTATION, getOrientation().toString());
            jSONObject2.putOpt(MESSAGE_TEXT_ALIGN, getMessageTextAlign().toString());
            jSONObject2.putOpt(IMAGE_ALT, getAltImageText());
            jSONObject2.putOpt("is_control", Boolean.valueOf(isControl()));
            jSONObject2.put("is_test_send", getIsTestSend());
            if (!getExtras().isEmpty()) {
                jSONObject2.put(EXTRAS, getExtras());
            }
            return jSONObject2;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.app.tgtg.model.remote.item.response.a(15), 4, (Object) null);
            return jSONObject2;
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getAltImageText() {
        return this.altImageText;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateIn() {
        return this.animateIn;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateOut() {
        return this.animateOut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final m0 getBrazeManager() {
        return this.brazeManager;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    /* JADX INFO: renamed from: getClickAction, reason: from getter */
    public ClickAction getInternalClickAction() {
        return this.internalClickAction;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public CropType getCropType() {
        return this.cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public DismissType getDismissType() {
        return this.dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getDurationInMilliseconds() {
        return this.durationInMilliseconds;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getExtras() {
        return this.extras;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getIcon() {
        return this.icon;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconColor() {
        return this.iconColor;
    }

    public final com.braze.models.theme.a getInAppMessageDarkThemeWrapper() {
        return this.inAppMessageDarkThemeWrapper;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getMessage() {
        return this.message;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getMessageExtras() {
        return this.messageExtras;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public TextAlign getMessageTextAlign() {
        return this.messageTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getMessageTextColor() {
        return this.messageTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return n0.f26529a;
    }

    public final String getTriggerId() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject.optString(TRIGGER_ID);
        }
        return null;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    /* JADX INFO: renamed from: getUri, reason: from getter */
    public Uri getInternalUri() {
        return this.internalUri;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isControl() {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject != null && jSONObject.optBoolean("is_control");
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    /* JADX INFO: renamed from: isTestSend, reason: from getter */
    public boolean getIsTestSend() {
        return this.isTestSend;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick(String buttonId) {
        buttonId.getClass();
        return handleLogClick(buttonId);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.H(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(19), 6, (Object) null);
            return false;
        }
        m0 m0Var = this.brazeManager;
        if (m0Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(17), 6, (Object) null);
            return false;
        }
        if (this.impressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(18), 6, (Object) null);
            return false;
        }
        this.impressionLogged.set(true);
        f0.B(com.braze.coroutine.f.f9657a, null, null, new c(triggerId, this, m0Var, null), 3);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId = getTriggerId();
        if (triggerId == null || triggerId.length() == 0) {
            return;
        }
        f0.B(com.braze.coroutine.f.f9657a, null, null, new d(this, null), 3);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAltImageText(String str) {
        this.altImageText = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateIn(boolean z11) {
        this.animateIn = z11;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateOut(boolean z11) {
        this.animateOut = z11;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setBackgroundColor(int i11) {
        this.backgroundColor = i11;
    }

    public final void setBrazeManager(m0 m0Var) {
        this.brazeManager = m0Var;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction, Uri uri) {
        clickAction.getClass();
        if (clickAction != ClickAction.URI) {
            this.internalClickAction = clickAction;
            this.internalUri = null;
        } else if (uri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(16), 6, (Object) null);
        } else {
            this.internalClickAction = clickAction;
            this.internalUri = uri;
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setCropType(CropType cropType) {
        cropType.getClass();
        this.cropType = cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDismissType(DismissType dismissType) {
        dismissType.getClass();
        this.dismissType = dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDurationInMilliseconds(int i11) {
        if (i11 < 999) {
            this.durationInMilliseconds = INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l(i11, 0), 7, (Object) null);
        } else {
            this.durationInMilliseconds = i11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l(i11, 1), 7, (Object) null);
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExpirationTimestamp(long j9) {
        this.expirationTimestamp = j9;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExtras(Map<String, String> map) {
        map.getClass();
        this.extras = map;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIcon(String str) {
        this.icon = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconBackgroundColor(int i11) {
        this.iconBackgroundColor = i11;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconColor(int i11) {
        this.iconColor = i11;
    }

    public final void setInAppMessageDarkThemeWrapper(com.braze.models.theme.a aVar) {
        this.inAppMessageDarkThemeWrapper = aVar;
    }

    public final void setJsonObject(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        remotePathToLocalAssetMap.getClass();
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessage(String str) {
        this.message = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageExtras(String str) {
        this.messageExtras = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextAlign(TextAlign textAlign) {
        textAlign.getClass();
        this.messageTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextColor(int i11) {
        this.messageTextColor = i11;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOpenUriInWebView(boolean z11) {
        this.openUriInWebView = z11;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOrientation(Orientation orientation) {
        orientation.getClass();
        this.orientation = orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setTestSend(boolean z11) {
        this.isTestSend = z11;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick() {
        return handleLogClick$default(this, null, 1, null);
    }

    public static /* synthetic */ void getAnimateIn$annotations() {
    }

    public static /* synthetic */ void getAnimateOut$annotations() {
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction) {
        clickAction.getClass();
        setClickBehavior(clickAction, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject jSONObject, m0 m0Var, boolean z11) {
        this(jSONObject, m0Var, z11, false, 8, null);
        jSONObject.getClass();
        m0Var.getClass();
    }

    public InAppMessageBase() {
        this.internalClickAction = ClickAction.NONE;
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this.extras = o0Var;
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        this.orientation = Orientation.ANY;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
    }

    public /* synthetic */ InAppMessageBase(JSONObject jSONObject, m0 m0Var, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, m0Var, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject jSONObject, m0 m0Var) {
        this(jSONObject, m0Var, false, false, 12, null);
        jSONObject.getClass();
        m0Var.getClass();
    }
}
