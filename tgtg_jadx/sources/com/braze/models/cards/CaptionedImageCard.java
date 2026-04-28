package com.braze.models.cards;

import com.braze.Constants;
import com.braze.analytics.b;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.m0;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.JsonUtils;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.MessageBundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/braze/models/cards/CaptionedImageCard;", "Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "manager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorageProvider", "Lcom/braze/analytics/b;", "cardAnalyticsProvider", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;Lcom/braze/storage/ICardStorageProvider;Lcom/braze/analytics/b;)V", "", "toString", "()Ljava/lang/String;", "imageUrl", "Ljava/lang/String;", "getImageUrl", "altImageText", "getAltImageText", MessageBundle.TITLE_ENTRY, "getTitle", "description", "getDescription", Constants.BRAZE_WEBVIEW_URL_EXTRA, "getUrl", "domain", "getDomain", "", "aspectRatio", "F", "getAspectRatio", "()F", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CaptionedImageCard extends Card {
    private final String altImageText;
    private final float aspectRatio;
    private final CardType cardType;
    private final String description;
    private final String domain;
    private final String imageUrl;
    private final String title;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionedImageCard(JSONObject jSONObject, m0 m0Var, ICardStorageProvider<?> iCardStorageProvider, b bVar) throws JSONException {
        super(jSONObject, m0Var, iCardStorageProvider, bVar);
        jSONObject.getClass();
        String string = jSONObject.getString(CardKey.CAPTIONED_IMAGE_IMAGE.getKey());
        string.getClass();
        this.imageUrl = string;
        this.altImageText = JsonUtils.getOptionalString(jSONObject, CardKey.CAPTIONED_IMAGE_ALT_IMAGE.getKey());
        String string2 = jSONObject.getString(CardKey.CAPTIONED_IMAGE_TITLE.getKey());
        string2.getClass();
        this.title = string2;
        String string3 = jSONObject.getString(CardKey.CAPTIONED_IMAGE_DESCRIPTION.getKey());
        string3.getClass();
        this.description = string3;
        this.url = JsonUtils.getOptionalString(jSONObject, CardKey.CAPTIONED_IMAGE_URL.getKey());
        this.domain = JsonUtils.getOptionalString(jSONObject, CardKey.CAPTIONED_IMAGE_DOMAIN.getKey());
        this.aspectRatio = (float) jSONObject.optDouble(CardKey.CAPTIONED_IMAGE_ASPECT_RATIO.getKey(), 0.0d);
        this.cardType = CardType.CAPTIONED_IMAGE;
    }

    public final String getAltImageText() {
        return this.altImageText;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.braze.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.description;
        String url = getUrl();
        String str4 = this.domain;
        float f11 = this.aspectRatio;
        String string = super.toString();
        StringBuilder sbT = f.t("\n            CaptionedImageCard{imageUrl='", str, "'\n            title='", str2, "'\n            description='");
        s.A(sbT, str3, "'\n            url='", url, "'\n            domain='");
        sbT.append(str4);
        sbT.append("'\n            aspectRatio=");
        sbT.append(f11);
        sbT.append("\n            ");
        sbT.append(string);
        sbT.append("}\n\n        ");
        return kotlin.text.s.c(sbT.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionedImageCard(JSONObject jSONObject, m0 m0Var) {
        this(jSONObject, m0Var, null, null, 12, null);
        jSONObject.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionedImageCard(JSONObject jSONObject, m0 m0Var, ICardStorageProvider<?> iCardStorageProvider) {
        this(jSONObject, m0Var, iCardStorageProvider, null, 8, null);
        jSONObject.getClass();
    }

    public /* synthetic */ CaptionedImageCard(JSONObject jSONObject, m0 m0Var, ICardStorageProvider iCardStorageProvider, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i11 & 2) != 0 ? null : m0Var, (i11 & 4) != 0 ? null : iCardStorageProvider, (i11 & 8) != 0 ? null : bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionedImageCard(JSONObject jSONObject) {
        this(jSONObject, null, null, null, 14, null);
        jSONObject.getClass();
    }
}
