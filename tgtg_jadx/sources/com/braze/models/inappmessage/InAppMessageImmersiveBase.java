package com.braze.models.inappmessage;

import android.graphics.Color;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.events.internal.f0;
import com.braze.managers.m0;
import com.braze.support.BrazeLogger;
import com.braze.support.s;
import h7.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n80.p;
import o80.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u001c\b'\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tBI\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0003\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u000e\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010&¨\u0006G"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;)V", "", InAppMessageImmersiveBase.HEADER, "", "headerTextColor", "closeButtonColor", "Lcom/braze/enums/inappmessage/ImageStyle;", "imageStyle", "Lcom/braze/enums/inappmessage/TextAlign;", "headerTextAlign", "messageTextAlign", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;Ljava/lang/String;IILcom/braze/enums/inappmessage/ImageStyle;Lcom/braze/enums/inappmessage/TextAlign;Lcom/braze/enums/inappmessage/TextAlign;)V", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "", "logButtonClick", "(Lcom/braze/models/inappmessage/MessageButton;)Z", "", "onAfterClosed", "enableDarkTheme", "forJsonPut", "()Lorg/json/JSONObject;", "I", "getHeaderTextColor", "()I", "setHeaderTextColor", "(I)V", "getCloseButtonColor", "setCloseButtonColor", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "", "messageButtons", "Ljava/util/List;", "getMessageButtons", "()Ljava/util/List;", "setMessageButtons", "(Ljava/util/List;)V", "Lcom/braze/enums/inappmessage/ImageStyle;", "getImageStyle", "()Lcom/braze/enums/inappmessage/ImageStyle;", "setImageStyle", "(Lcom/braze/enums/inappmessage/ImageStyle;)V", "frameColor", "Ljava/lang/Integer;", "getFrameColor", "()Ljava/lang/Integer;", "setFrameColor", "(Ljava/lang/Integer;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "getHeaderTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setHeaderTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "Companion", "com/braze/models/inappmessage/f", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    private static final String BUTTONS = "btns";
    private static final String CLOSE_BUTTON_COLOR = "close_btn_color";
    public static final f Companion = new f();
    private static final String FRAME_COLOR = "frame_color";
    private static final String HEADER = "header";
    private static final String HEADER_TEXT_ALIGN = "text_align_header";
    private static final String HEADER_TEXT_COLOR = "header_text_color";
    private static final String IMAGE_STYLE = "image_style";
    private String buttonIdClicked;
    private int closeButtonColor;
    private Integer frameColor;
    private String header;
    private TextAlign headerTextAlign;
    private int headerTextColor;
    private ImageStyle imageStyle;
    private List<? extends MessageButton> messageButtons;
    private boolean wasButtonClickLogged;

    /* JADX WARN: Illegal instructions before constructor call */
    public InAppMessageImmersiveBase(JSONObject jSONObject, m0 m0Var) {
        Iterator h0Var;
        JSONObject jSONObjectOptJSONObject;
        String upperCase;
        int i11;
        String upperCase2;
        int i12;
        String upperCase3;
        int i13;
        jSONObject.getClass();
        m0Var.getClass();
        String strOptString = jSONObject.optString(HEADER);
        strOptString.getClass();
        int iOptInt = jSONObject.optInt(HEADER_TEXT_COLOR);
        int iOptInt2 = jSONObject.optInt(CLOSE_BUTTON_COLOR);
        ImageStyle imageStyle = ImageStyle.TOP;
        int i14 = 0;
        try {
            String string = jSONObject.getString(IMAGE_STYLE);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            upperCase3 = string.toUpperCase(locale);
            upperCase3.getClass();
        } catch (Exception unused) {
        }
        for (ImageStyle imageStyle2 : ImageStyle.values()) {
            if (Intrinsics.areEqual(imageStyle2.name(), upperCase3)) {
                imageStyle = imageStyle2;
                TextAlign textAlign = TextAlign.CENTER;
                try {
                    String string2 = jSONObject.getString(HEADER_TEXT_ALIGN);
                    string2.getClass();
                    Locale locale2 = Locale.US;
                    locale2.getClass();
                    upperCase2 = string2.toUpperCase(locale2);
                    upperCase2.getClass();
                } catch (Exception unused2) {
                }
                for (TextAlign textAlign2 : TextAlign.values()) {
                    if (Intrinsics.areEqual(textAlign2.name(), upperCase2)) {
                        textAlign = textAlign2;
                        TextAlign textAlign3 = TextAlign.CENTER;
                        try {
                            String string3 = jSONObject.getString(InAppMessageBase.MESSAGE_TEXT_ALIGN);
                            string3.getClass();
                            Locale locale3 = Locale.US;
                            locale3.getClass();
                            upperCase = string3.toUpperCase(locale3);
                            upperCase.getClass();
                        } catch (Exception unused3) {
                        }
                        for (TextAlign textAlign4 : TextAlign.values()) {
                            if (Intrinsics.areEqual(textAlign4.name(), upperCase)) {
                                textAlign3 = textAlign4;
                                this(jSONObject, m0Var, strOptString, iOptInt, iOptInt2, imageStyle, textAlign, textAlign3);
                                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BUTTONS);
                                String str = s.f10772a;
                                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("themes");
                                JSONArray jSONArray = (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("dark")) == null || (jSONArray = jSONObjectOptJSONObject.optJSONArray(BUTTONS)) == null) ? new JSONArray() : jSONArray;
                                ArrayList arrayList = new ArrayList();
                                if (jSONArrayOptJSONArray == null) {
                                    n0.f26529a.getClass();
                                    h0Var = kotlin.collections.m0.f26528a;
                                } else {
                                    h0Var = new h0(r.m(r.h(CollectionsKt.F(p.j(0, jSONArrayOptJSONArray.length())), new g(jSONArrayOptJSONArray)), new h(jSONArrayOptJSONArray)));
                                }
                                h0Var.getClass();
                                while (h0Var.hasNext()) {
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        d0.n();
                                        throw null;
                                    }
                                    arrayList.add(new MessageButton((JSONObject) h0Var.next(), jSONArray.optJSONObject(i14)));
                                    i14 = i15;
                                }
                                setMessageButtons(arrayList);
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
    public static final String enableDarkTheme$lambda$5() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Trigger id not found (this is expected for test sends). Not logging button click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$2() {
        return "Button click already logged for this message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$3() {
        return "Cannot log a button click because the BrazeManager is null.";
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        com.braze.models.theme.a inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m(1), 7, (Object) null);
            return;
        }
        Integer num = inAppMessageDarkThemeWrapper.f10287g;
        if (num != null) {
            setFrameColor(num);
        }
        Integer num2 = inAppMessageDarkThemeWrapper.f10283c;
        if (num2 != null) {
            setCloseButtonColor(num2.intValue());
        }
        Integer num3 = inAppMessageDarkThemeWrapper.f10286f;
        if (num3 != null) {
            setHeaderTextColor(num3.intValue());
        }
        Iterator<MessageButton> it = getMessageButtons().iterator();
        while (it.hasNext()) {
            it.next().enableDarkTheme();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public JSONObject getJsonObject() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jsonObject2 = super.getJsonObject();
        try {
            jsonObject2.putOpt(HEADER, getHeader());
            jsonObject2.put(HEADER_TEXT_COLOR, getHeaderTextColor());
            jsonObject2.put(CLOSE_BUTTON_COLOR, getCloseButtonColor());
            jsonObject2.putOpt(IMAGE_STYLE, getImageStyle().toString());
            jsonObject2.putOpt(HEADER_TEXT_ALIGN, getHeaderTextAlign().toString());
            Integer frameColor = getFrameColor();
            if (frameColor != null) {
                jsonObject2.put(FRAME_COLOR, frameColor.intValue());
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<MessageButton> it = getMessageButtons().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getJsonObject());
            }
            jsonObject2.put(BUTTONS, jSONArray);
        } catch (JSONException unused) {
        }
        return jsonObject2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public Integer getFrameColor() {
        return this.frameColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public String getHeader() {
        return this.header;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public TextAlign getHeaderTextAlign() {
        return this.headerTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getHeaderTextColor() {
        return this.headerTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public List<MessageButton> getMessageButtons() {
        return this.messageButtons;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public boolean logButtonClick(MessageButton messageButton) {
        messageButton.getClass();
        m0 brazeManager = getBrazeManager();
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.H(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m(4), 7, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m(2), 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new m(3), 6, (Object) null);
            return false;
        }
        this.buttonIdClicked = messageButton.getStringId();
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f10176g;
        aVar.getClass();
        com.braze.models.k kVarI = aVar.i(triggerId, messageButton.getStringId());
        if (kVarI != null) {
            ((com.braze.managers.r) brazeManager).a(kVarI);
        }
        this.wasButtonClickLogged = true;
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        super.onAfterClosed();
        m0 brazeManager = getBrazeManager();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || StringsKt.H(triggerId) || (str = this.buttonIdClicked) == null || StringsKt.H(str) || brazeManager == null) {
            return;
        }
        ((com.braze.events.d) ((com.braze.managers.r) brazeManager).f10070d).b(new f0(new com.braze.triggers.events.d(getTriggerId(), this.buttonIdClicked)), f0.class);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setCloseButtonColor(int i11) {
        this.closeButtonColor = i11;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setFrameColor(Integer num) {
        this.frameColor = num;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeader(String str) {
        this.header = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextAlign(TextAlign textAlign) {
        textAlign.getClass();
        this.headerTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextColor(int i11) {
        this.headerTextColor = i11;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setImageStyle(ImageStyle imageStyle) {
        imageStyle.getClass();
        this.imageStyle = imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setMessageButtons(List<? extends MessageButton> list) {
        list.getClass();
        this.messageButtons = list;
    }

    public InAppMessageImmersiveBase() {
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = n0.f26529a;
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
    }

    private InAppMessageImmersiveBase(JSONObject jSONObject, m0 m0Var, String str, int i11, int i12, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(jSONObject, m0Var);
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = n0.f26529a;
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
        setHeader(str);
        setHeaderTextColor(i11);
        setCloseButtonColor(i12);
        if (jSONObject.has(FRAME_COLOR)) {
            setFrameColor(Integer.valueOf(jSONObject.optInt(FRAME_COLOR)));
        }
        setImageStyle(imageStyle);
        setHeaderTextAlign(textAlign);
        setMessageTextAlign(textAlign2);
    }
}
