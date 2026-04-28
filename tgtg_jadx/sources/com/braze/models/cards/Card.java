package com.braze.models.cards;

import b3.i;
import com.braze.Constants;
import com.braze.analytics.b;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.models.FeatureFlag;
import com.braze.models.IPutIntoJson;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.k;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import e0.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u0000 ]2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001^B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0015R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u00101\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010\u000fR\"\u00103\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00102\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u00105R$\u00107\u001a\u00020\r2\u0006\u00106\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b7\u0010\u000fR\u001d\u00108\u001a\u00020\r8\u0006¢\u0006\u0012\n\u0004\b8\u00102\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u000fR\"\u0010<\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00102\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u00105R\"\u0010>\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00102\u001a\u0004\b>\u0010\u000f\"\u0004\b?\u00105R\u001c\u0010@\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\bA\u0010\u0015R\u001a\u0010C\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00102R\u0016\u0010H\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00102R\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00102R$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010Q\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bS\u0010;\u001a\u0004\bQ\u0010\u000f\"\u0004\bR\u00105R*\u0010T\u001a\u00020\r2\u0006\u0010T\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bW\u0010;\u001a\u0004\bU\u0010\u000f\"\u0004\bV\u00105R$\u0010Y\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u00105R\u0011\u0010[\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b[\u0010\u000fR\u0011\u0010\\\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\\\u0010\u000f¨\u0006_"}, d2 = {"Lcom/braze/models/cards/Card;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorage", "Lcom/braze/analytics/b;", "cardAnalytics", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;Lcom/braze/storage/ICardStorageProvider;Lcom/braze/analytics/b;)V", "(Lorg/json/JSONObject;)V", "", "logImpression", "()Z", "logClick", "forJsonPut", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "isValidCard", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "Lcom/braze/managers/m0;", "Lcom/braze/storage/ICardStorageProvider;", "Lcom/braze/analytics/b;", "", InAppMessageBase.EXTRAS, "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "id", "Ljava/lang/String;", "getId", "", "created", "J", "getCreated", "()J", "expiresAt", "getExpiresAt", "isRemoved", "Z", "isPinned", "setPinned", "(Z)V", "value", "isClicked", "openUriInWebView", "getOpenUriInWebView", "getOpenUriInWebView$annotations", "()V", "isDismissibleByUser", "setDismissibleByUser", "isTest", "setTest", Constants.BRAZE_WEBVIEW_URL_EXTRA, "getUrl", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "wasViewedInternal", "isIndicatorHighlightedInternal", "isDismissedInternal", "Lcom/braze/models/cards/ICardListener;", "listener", "Lcom/braze/models/cards/ICardListener;", "getListener", "()Lcom/braze/models/cards/ICardListener;", "setListener", "(Lcom/braze/models/cards/ICardListener;)V", "isDismissed", "setDismissed", "isDismissed$annotations", "viewed", "getViewed", "setViewed", "getViewed$annotations", FeatureFlag.ENABLED, "isIndicatorHighlighted", "setIndicatorHighlighted", "isExpired", "isControl", "Companion", "com/braze/models/cards/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class Card implements IPutIntoJson<JSONObject> {
    public static final a Companion = new a();
    private static final long DEFAULT_EXPIRES_AT_VALUE = -1;
    private final m0 brazeManager;
    private final b cardAnalytics;
    private final ICardStorageProvider<?> cardStorage;
    private final CardType cardType;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;
    private final String id;
    private boolean isClicked;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final String url;
    private boolean wasViewedInternal;

    public Card(JSONObject jSONObject, m0 m0Var, ICardStorageProvider<?> iCardStorageProvider, b bVar) throws JSONException {
        jSONObject.getClass();
        this.jsonObject = jSONObject;
        this.brazeManager = m0Var;
        this.cardStorage = iCardStorageProvider;
        this.cardAnalytics = bVar;
        this.extras = JsonUtils.convertJSONObjectToMap(jSONObject.optJSONObject(CardKey.EXTRAS.getKey()));
        String string = jSONObject.getString(CardKey.ID.getKey());
        string.getClass();
        this.id = string;
        this.cardType = CardType.DEFAULT;
        this.wasViewedInternal = jSONObject.optBoolean(CardKey.VIEWED.getKey());
        this.isDismissedInternal = jSONObject.optBoolean(CardKey.DISMISSED.getKey(), false);
        this.isPinned = jSONObject.optBoolean(CardKey.PINNED.getKey(), false);
        this.created = jSONObject.getLong(CardKey.CREATED.getKey());
        this.expiresAt = jSONObject.optLong(CardKey.EXPIRES_AT.getKey(), -1L);
        this.openUriInWebView = jSONObject.optBoolean(CardKey.OPEN_URI_IN_WEBVIEW.getKey(), false);
        this.isRemoved = jSONObject.optBoolean(CardKey.REMOVED.getKey(), false);
        this.isDismissibleByUser = jSONObject.optBoolean(CardKey.DISMISSIBLE.getKey(), false);
        this.isIndicatorHighlightedInternal = jSONObject.optBoolean(CardKey.READ.getKey(), this.wasViewedInternal);
        this.isClicked = jSONObject.optBoolean(CardKey.CLICKED.getKey(), false);
        this.isTest = jSONObject.optBoolean(CardKey.IS_TEST.getKey(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$1() {
        return "Cannot dismiss a card more than once. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$3() {
        return "Failed to log card as dismissed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isIndicatorHighlighted_$lambda$0() {
        return "Failed to mark card indicator as highlighted.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidCard$lambda$13() {
        return "Card ID cannot be null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$10(Card card) {
        return f.k("Logged click for card with id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$11(Card card) {
        return f.k("Failed to log card clicked for id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$12(Card card) {
        return f.k("Failed to log card as clicked for id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$4(Card card) {
        return f.k("Logging impression event for card with id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$6(Card card) {
        return f.k("Logging control impression event for card with id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$8(Card card) {
        return f.k("Failed to log card impression for card id: ", card.id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(getClass(), other.getClass())) {
            Card card = (Card) other;
            if (this.created == card.created && Intrinsics.areEqual(this.id, card.id)) {
                return true;
            }
        }
        return false;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final long getCreated() {
        return this.created;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final ICardListener getListener() {
        return this.listener;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: getViewed, reason: from getter */
    public final boolean getWasViewedInternal() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        long j9 = this.created;
        return iHashCode + ((int) (j9 ^ (j9 >>> 32)));
    }

    /* JADX INFO: renamed from: isClicked, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    public final boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    /* JADX INFO: renamed from: isDismissed, reason: from getter */
    public final boolean getIsDismissedInternal() {
        return this.isDismissedInternal;
    }

    /* JADX INFO: renamed from: isDismissibleByUser, reason: from getter */
    public final boolean getIsDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j9 = this.expiresAt;
        return j9 != -1 && j9 <= DateTimeUtils.nowInSeconds();
    }

    /* JADX INFO: renamed from: isIndicatorHighlighted, reason: from getter */
    public final boolean getIsIndicatorHighlightedInternal() {
        return this.isIndicatorHighlightedInternal;
    }

    /* JADX INFO: renamed from: isPinned, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    /* JADX INFO: renamed from: isRemoved, reason: from getter */
    public final boolean getIsRemoved() {
        return this.isRemoved;
    }

    /* JADX INFO: renamed from: isTest, reason: from getter */
    public final boolean getIsTest() {
        return this.isTest;
    }

    public final boolean isValidCard() {
        if (!StringsKt.H(this.id)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new au.a(2), 6, (Object) null);
        return false;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new aw.a(this, 1), 6, (Object) null);
                return false;
            }
            b bVar = this.cardAnalytics;
            String str = this.id;
            ((com.braze.analytics.a) bVar).getClass();
            str.getClass();
            k kVarC = com.braze.models.outgoing.event.b.f10176g.c(str);
            if (kVarC != null) {
                ((r) this.brazeManager).a(kVarC);
            }
            this.cardStorage.markCardAsClicked(this.id);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new aw.a(this, 0), 7, (Object) null);
            return true;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new aw.a(this, 2), 4, (Object) null);
            return false;
        }
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            if (isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new aw.a(this, 4), 6, (Object) null);
                b bVar = this.cardAnalytics;
                String str = this.id;
                ((com.braze.analytics.a) bVar).getClass();
                str.getClass();
                k kVarE = com.braze.models.outgoing.event.b.f10176g.e(str);
                if (kVarE != null) {
                    ((r) this.brazeManager).a(kVarE);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new aw.a(this, 3), 6, (Object) null);
                b bVar2 = this.cardAnalytics;
                String str2 = this.id;
                ((com.braze.analytics.a) bVar2).getClass();
                str2.getClass();
                k kVarI = com.braze.models.outgoing.event.b.f10176g.i(str2);
                if (kVarI != null) {
                    ((r) this.brazeManager).a(kVarI);
                }
            }
            this.cardStorage.markCardAsViewed(this.id);
            return true;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new aw.a(this, 5), 4, (Object) null);
            return false;
        }
    }

    public final void setDismissed(boolean z11) {
        if (this.isDismissedInternal && z11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new au.a(3), 6, (Object) null);
            return;
        }
        this.isDismissedInternal = z11;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsDismissed(this.id);
        }
        if (z11) {
            try {
                if (this.brazeManager == null || this.cardAnalytics == null || !isValidCard()) {
                    return;
                }
                b bVar = this.cardAnalytics;
                String str = this.id;
                ((com.braze.analytics.a) bVar).getClass();
                str.getClass();
                k kVarG = com.braze.models.outgoing.event.b.f10176g.g(str);
                if (kVarG != null) {
                    ((r) this.brazeManager).a(kVarG);
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new au.a(4), 4, (Object) null);
            }
        }
    }

    public final void setDismissibleByUser(boolean z11) {
        this.isDismissibleByUser = z11;
    }

    public final void setIndicatorHighlighted(boolean z11) {
        ICardStorageProvider<?> iCardStorageProvider;
        this.isIndicatorHighlightedInternal = z11;
        try {
            ICardListener iCardListener = this.listener;
            if (iCardListener != null) {
                iCardListener.onCardUpdate();
            }
        } catch (Exception unused) {
        }
        if (!z11 || (iCardStorageProvider = this.cardStorage) == null) {
            return;
        }
        try {
            iCardStorageProvider.markCardAsVisuallyRead(this.id);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) e5, false, (Function0) new au.a(1), 4, (Object) null);
        }
    }

    public final void setListener(ICardListener iCardListener) {
        this.listener = iCardListener;
    }

    public final void setPinned(boolean z11) {
        this.isPinned = z11;
    }

    public final void setTest(boolean z11) {
        this.isTest = z11;
    }

    public final void setViewed(boolean z11) {
        this.wasViewedInternal = z11;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsViewed(this.id);
        }
    }

    public String toString() {
        Map<String, String> map = this.extras;
        String str = this.id;
        long j9 = this.created;
        long j11 = this.expiresAt;
        boolean z11 = this.wasViewedInternal;
        boolean z12 = this.isIndicatorHighlightedInternal;
        boolean z13 = this.isDismissedInternal;
        boolean z14 = this.isRemoved;
        boolean z15 = this.isPinned;
        boolean z16 = this.isClicked;
        boolean z17 = this.openUriInWebView;
        boolean z18 = this.isDismissibleByUser;
        boolean z19 = this.isTest;
        String prettyPrintedString = JsonUtils.getPrettyPrintedString(this.jsonObject);
        StringBuilder sb2 = new StringBuilder("\n            Card{\n            extras=");
        sb2.append(map);
        sb2.append("\n            id='");
        sb2.append(str);
        sb2.append("'\n            created=");
        sb2.append(j9);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, "\n            expiresAt=", j11, "\n            viewed=");
        i.C(sb2, z11, "\n            isRead=", z12, "\n            isDismissed=");
        i.C(sb2, z13, "\n            isRemoved=", z14, "\n            isPinned=");
        i.C(sb2, z15, "\n            isClicked=", z16, "\n            openUriInWebview=");
        i.C(sb2, z17, "\n            isDismissibleByUser=", z18, "\n            isTest=");
        sb2.append(z19);
        sb2.append("\n            json=");
        sb2.append(prettyPrintedString);
        sb2.append("\n            }\n\n        ");
        return s.c(sb2.toString());
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getValue() {
        return this.jsonObject;
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    public static /* synthetic */ void getViewed$annotations() {
    }

    public static /* synthetic */ void isDismissed$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Card(JSONObject jSONObject) {
        this(jSONObject, null, null, null);
        jSONObject.getClass();
    }
}
