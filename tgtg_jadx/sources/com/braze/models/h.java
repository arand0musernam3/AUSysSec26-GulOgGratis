package com.braze.models;

import b0.x1;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.m0;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import h7.h0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f10154a = new h();

    public static final Card a(JSONObject jSONObject, m0 m0Var, ICardStorageProvider iCardStorageProvider, com.braze.analytics.b bVar) {
        jSONObject.getClass();
        m0Var.getClass();
        iCardStorageProvider.getClass();
        bVar.getClass();
        CardType cardTypeFromJson = CardKey.INSTANCE.getCardTypeFromJson(jSONObject);
        int i11 = cardTypeFromJson == null ? -1 : e.f10151a[cardTypeFromJson.ordinal()];
        if (i11 == 1) {
            return new ImageOnlyCard(jSONObject, m0Var, iCardStorageProvider, bVar);
        }
        if (i11 == 2) {
            return new CaptionedImageCard(jSONObject, m0Var, iCardStorageProvider, bVar);
        }
        if (i11 == 3) {
            return new ShortNewsCard(jSONObject, m0Var, iCardStorageProvider, bVar);
        }
        if (i11 == 4) {
            return new TextAnnouncementCard(jSONObject, m0Var, iCardStorageProvider, bVar);
        }
        if (i11 != 5) {
            return null;
        }
        return new ControlCard(jSONObject, m0Var, iCardStorageProvider, bVar);
    }

    public static final String a(Object obj, JSONArray jSONArray) {
        return "Unable to create Card JSON in array. Ignoring. Was on element: " + obj + " of json array: " + jSONArray;
    }

    public static final Card a(m0 m0Var, ICardStorageProvider iCardStorageProvider, com.braze.analytics.b bVar, JSONArray jSONArray, Object obj) {
        obj.getClass();
        try {
            return a(new JSONObject(obj.toString()), m0Var, iCardStorageProvider, bVar);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10154a, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new bs.b(13, obj, jSONArray), 4, (Object) null);
            return null;
        }
    }

    public static final List a(JSONArray jSONArray, com.braze.managers.r rVar, com.braze.storage.p pVar, com.braze.analytics.a aVar) {
        jSONArray.getClass();
        rVar.getClass();
        pVar.getClass();
        aVar.getClass();
        return o80.r.o(o80.r.n(o80.o.b(new h0(o80.r.m(o80.r.h(CollectionsKt.F(n80.p.j(0, jSONArray.length())), new f(jSONArray)), new g(jSONArray)))), new x1(2, rVar, pVar, aVar, jSONArray)));
    }
}
