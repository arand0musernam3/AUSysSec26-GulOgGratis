package com.braze.enums;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\b\u0087\u0081\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006,"}, d2 = {"Lcom/braze/enums/CardKey;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "ID", "VIEWED", "CREATED", "EXPIRES_AT", "EXTRAS", "OPEN_URI_IN_WEBVIEW", CredentialProviderBaseController.TYPE_TAG, "DISMISSED", "REMOVED", "PINNED", "DISMISSIBLE", "IS_TEST", "READ", "CLICKED", "IMAGE_ONLY_IMAGE", "IMAGE_ONLY_ALT_IMAGE", "IMAGE_ONLY_URL", "IMAGE_ONLY_ASPECT_RATIO", "CAPTIONED_IMAGE_IMAGE", "CAPTIONED_IMAGE_ALT_IMAGE", "CAPTIONED_IMAGE_TITLE", "CAPTIONED_IMAGE_DESCRIPTION", "CAPTIONED_IMAGE_URL", "CAPTIONED_IMAGE_DOMAIN", "CAPTIONED_IMAGE_ASPECT_RATIO", "TEXT_ANNOUNCEMENT_TITLE", "TEXT_ANNOUNCEMENT_DESCRIPTION", "TEXT_ANNOUNCEMENT_URL", "TEXT_ANNOUNCEMENT_DOMAIN", "SHORT_NEWS_IMAGE", "SHORT_NEWS_ALT_IMAGE", "SHORT_NEWS_TITLE", "SHORT_NEWS_DESCRIPTION", "SHORT_NEWS_URL", "SHORT_NEWS_DOMAIN", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardKey {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ CardKey[] $VALUES;
    private static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    private static final String CONTROL_KEY = "control";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String IMAGE_ONLY_KEY = "banner_image";
    private static final String SHORT_NEWS_KEY = "short_news";
    private static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    private static final Map<String, CardType> cardTypeMap;
    private final String key;
    public static final CardKey ID = new CardKey("ID", 0, "id");
    public static final CardKey VIEWED = new CardKey("VIEWED", 1, "v");
    public static final CardKey CREATED = new CardKey("CREATED", 2, "ca");
    public static final CardKey EXPIRES_AT = new CardKey("EXPIRES_AT", 3, "ea");
    public static final CardKey EXTRAS = new CardKey("EXTRAS", 4, "e");
    public static final CardKey OPEN_URI_IN_WEBVIEW = new CardKey("OPEN_URI_IN_WEBVIEW", 5, "uw");
    public static final CardKey TYPE = new CardKey(CredentialProviderBaseController.TYPE_TAG, 6, "tp");
    public static final CardKey DISMISSED = new CardKey("DISMISSED", 7, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
    public static final CardKey REMOVED = new CardKey("REMOVED", 8, "r");
    public static final CardKey PINNED = new CardKey("PINNED", 9, Constants.BRAZE_PUSH_PRIORITY_KEY);
    public static final CardKey DISMISSIBLE = new CardKey("DISMISSIBLE", 10, "db");
    public static final CardKey IS_TEST = new CardKey("IS_TEST", 11, Constants.BRAZE_PUSH_TITLE_KEY);
    public static final CardKey READ = new CardKey("READ", 12, "read");
    public static final CardKey CLICKED = new CardKey("CLICKED", 13, "cl");
    public static final CardKey IMAGE_ONLY_IMAGE = new CardKey("IMAGE_ONLY_IMAGE", 14, "i");
    public static final CardKey IMAGE_ONLY_ALT_IMAGE = new CardKey("IMAGE_ONLY_ALT_IMAGE", 15, InAppMessageBase.IMAGE_ALT);
    public static final CardKey IMAGE_ONLY_URL = new CardKey("IMAGE_ONLY_URL", 16, "u");
    public static final CardKey IMAGE_ONLY_ASPECT_RATIO = new CardKey("IMAGE_ONLY_ASPECT_RATIO", 17, "ar");
    public static final CardKey CAPTIONED_IMAGE_IMAGE = new CardKey("CAPTIONED_IMAGE_IMAGE", 18, "i");
    public static final CardKey CAPTIONED_IMAGE_ALT_IMAGE = new CardKey("CAPTIONED_IMAGE_ALT_IMAGE", 19, InAppMessageBase.IMAGE_ALT);
    public static final CardKey CAPTIONED_IMAGE_TITLE = new CardKey("CAPTIONED_IMAGE_TITLE", 20, "tt");
    public static final CardKey CAPTIONED_IMAGE_DESCRIPTION = new CardKey("CAPTIONED_IMAGE_DESCRIPTION", 21, "ds");
    public static final CardKey CAPTIONED_IMAGE_URL = new CardKey("CAPTIONED_IMAGE_URL", 22, "u");
    public static final CardKey CAPTIONED_IMAGE_DOMAIN = new CardKey("CAPTIONED_IMAGE_DOMAIN", 23, "dm");
    public static final CardKey CAPTIONED_IMAGE_ASPECT_RATIO = new CardKey("CAPTIONED_IMAGE_ASPECT_RATIO", 24, "ar");
    public static final CardKey TEXT_ANNOUNCEMENT_TITLE = new CardKey("TEXT_ANNOUNCEMENT_TITLE", 25, "tt");
    public static final CardKey TEXT_ANNOUNCEMENT_DESCRIPTION = new CardKey("TEXT_ANNOUNCEMENT_DESCRIPTION", 26, "ds");
    public static final CardKey TEXT_ANNOUNCEMENT_URL = new CardKey("TEXT_ANNOUNCEMENT_URL", 27, "u");
    public static final CardKey TEXT_ANNOUNCEMENT_DOMAIN = new CardKey("TEXT_ANNOUNCEMENT_DOMAIN", 28, "dm");
    public static final CardKey SHORT_NEWS_IMAGE = new CardKey("SHORT_NEWS_IMAGE", 29, "i");
    public static final CardKey SHORT_NEWS_ALT_IMAGE = new CardKey("SHORT_NEWS_ALT_IMAGE", 30, InAppMessageBase.IMAGE_ALT);
    public static final CardKey SHORT_NEWS_TITLE = new CardKey("SHORT_NEWS_TITLE", 31, "tt");
    public static final CardKey SHORT_NEWS_DESCRIPTION = new CardKey("SHORT_NEWS_DESCRIPTION", 32, "ds");
    public static final CardKey SHORT_NEWS_URL = new CardKey("SHORT_NEWS_URL", 33, "u");
    public static final CardKey SHORT_NEWS_DOMAIN = new CardKey("SHORT_NEWS_DOMAIN", 34, "dm");

    private static final /* synthetic */ CardKey[] $values() {
        return new CardKey[]{ID, VIEWED, CREATED, EXPIRES_AT, EXTRAS, OPEN_URI_IN_WEBVIEW, TYPE, DISMISSED, REMOVED, PINNED, DISMISSIBLE, IS_TEST, READ, CLICKED, IMAGE_ONLY_IMAGE, IMAGE_ONLY_ALT_IMAGE, IMAGE_ONLY_URL, IMAGE_ONLY_ASPECT_RATIO, CAPTIONED_IMAGE_IMAGE, CAPTIONED_IMAGE_ALT_IMAGE, CAPTIONED_IMAGE_TITLE, CAPTIONED_IMAGE_DESCRIPTION, CAPTIONED_IMAGE_URL, CAPTIONED_IMAGE_DOMAIN, CAPTIONED_IMAGE_ASPECT_RATIO, TEXT_ANNOUNCEMENT_TITLE, TEXT_ANNOUNCEMENT_DESCRIPTION, TEXT_ANNOUNCEMENT_URL, TEXT_ANNOUNCEMENT_DOMAIN, SHORT_NEWS_IMAGE, SHORT_NEWS_ALT_IMAGE, SHORT_NEWS_TITLE, SHORT_NEWS_DESCRIPTION, SHORT_NEWS_URL, SHORT_NEWS_DOMAIN};
    }

    static {
        CardKey[] cardKeyArr$values = $values();
        $VALUES = cardKeyArr$values;
        $ENTRIES = n.w(cardKeyArr$values);
        INSTANCE = new Companion(null);
        cardTypeMap = x0.e(new Pair(IMAGE_ONLY_KEY, CardType.IMAGE), new Pair(CAPTIONED_IMAGE_KEY, CardType.CAPTIONED_IMAGE), new Pair(TEXT_ANNOUNCEMENT_KEY, CardType.TEXT_ANNOUNCEMENT), new Pair(SHORT_NEWS_KEY, CardType.SHORT_NEWS), new Pair(CONTROL_KEY, CardType.CONTROL));
    }

    private CardKey(String str, int i11, String str2) {
        this.key = str2;
    }

    public static final CardType getCardTypeFromJson(JSONObject jSONObject) {
        return INSTANCE.getCardTypeFromJson(jSONObject);
    }

    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static final String getServerKeyFromCardType(CardType cardType) {
        return INSTANCE.getServerKeyFromCardType(cardType);
    }

    public static CardKey valueOf(String str) {
        return (CardKey) Enum.valueOf(CardKey.class, str);
    }

    public static CardKey[] values() {
        return (CardKey[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/braze/enums/CardKey$Companion;", "", "<init>", "()V", "IMAGE_ONLY_KEY", "", "CAPTIONED_IMAGE_KEY", "SHORT_NEWS_KEY", "TEXT_ANNOUNCEMENT_KEY", "CONTROL_KEY", "cardTypeMap", "", "Lcom/braze/enums/CardType;", "getCardTypeFromJson", "jsonObject", "Lorg/json/JSONObject;", "getServerKeyFromCardType", "cardType", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getCardTypeFromJson$lambda$0(JSONObject jSONObject) {
            return "Short News card doesn't contain image url, parsing type as Text Announcement. JSON: " + jSONObject;
        }

        public final CardType getCardTypeFromJson(JSONObject jsonObject) {
            String optionalString;
            jsonObject.getClass();
            String optionalString2 = JsonUtils.getOptionalString(jsonObject, CardKey.TYPE.getKey());
            if (optionalString2 != null && optionalString2.length() != 0 && Intrinsics.areEqual(optionalString2, CardKey.SHORT_NEWS_KEY) && ((optionalString = JsonUtils.getOptionalString(jsonObject, CardKey.SHORT_NEWS_IMAGE.getKey())) == null || optionalString.length() == 0)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new bw.a(jsonObject, 22), 6, (Object) null);
                optionalString2 = CardKey.TEXT_ANNOUNCEMENT_KEY;
            }
            return CardKey.cardTypeMap.containsKey(optionalString2) ? (CardType) CardKey.cardTypeMap.get(optionalString2) : CardType.DEFAULT;
        }

        public final String getServerKeyFromCardType(CardType cardType) {
            cardType.getClass();
            for (Map.Entry entry : CardKey.cardTypeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (cardType == ((CardType) entry.getValue())) {
                    return str;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
