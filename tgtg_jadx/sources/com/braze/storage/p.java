package com.braze.storage;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.enums.CardKey;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements ICardStorageProvider {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set f10645k = kotlin.collections.y.W(new String[]{CardKey.VIEWED.getKey(), CardKey.DISMISSED.getKey()});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.managers.r f10647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f10648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f10651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f10652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f10653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f10654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.braze.analytics.a f10655j;

    public p(Context context, String str, String str2, com.braze.managers.r rVar, String str3) {
        ArrayList arrayList;
        Collection collection;
        ArrayList arrayList2;
        Collection collection2;
        ArrayList arrayList3;
        Collection collection3;
        context.getClass();
        str.getClass();
        str2.getClass();
        rVar.getClass();
        str3.getClass();
        this.f10646a = str;
        this.f10647b = rVar;
        m mVar = new m(context, str, str2);
        this.f10648c = mVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f10651f = linkedHashSet;
        this.f10652g = new LinkedHashSet();
        this.f10653h = new LinkedHashSet();
        this.f10654i = new LinkedHashMap();
        this.f10655j = new com.braze.analytics.a();
        c();
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = mVar.readData(dataStoreKey, "");
                data.getClass();
                String str4 = (String) data;
                if (StringsKt.H(str4)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str4) || Intrinsics.areEqual(StringsKt.e0(str4).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        collection = kotlin.collections.n0.f26529a;
                    } else {
                        try {
                            n90.b bVar = n90.c.f30748d;
                            bVar.getClass();
                            collection = (List) bVar.b(new m90.d(m90.r1.f29848a, 0), str4);
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.e(str4), 4, (Object) null);
                            collection = kotlin.collections.n0.f26529a;
                        }
                    }
                    arrayList = CollectionsKt.t0(collection);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        linkedHashSet.addAll(arrayList);
        LinkedHashSet linkedHashSet2 = this.f10653h;
        m mVar2 = this.f10648c;
        DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
        if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey2), 12, (Object) null);
            arrayList2 = new ArrayList();
        } else {
            try {
                Object data2 = mVar2.readData(dataStoreKey2, "");
                data2.getClass();
                String str5 = (String) data2;
                if (StringsKt.H(str5)) {
                    arrayList2 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str5) || Intrinsics.areEqual(StringsKt.e0(str5).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        collection2 = kotlin.collections.n0.f26529a;
                    } else {
                        try {
                            n90.b bVar2 = n90.c.f30748d;
                            bVar2.getClass();
                            collection2 = (List) bVar2.b(new m90.d(m90.r1.f29848a, 0), str5);
                        } catch (Exception e12) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new com.braze.support.e(str5), 4, (Object) null);
                            collection2 = kotlin.collections.n0.f26529a;
                        }
                    }
                    arrayList2 = CollectionsKt.t0(collection2);
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new i0(dataStoreKey2), 8, (Object) null);
                arrayList2 = new ArrayList();
            }
        }
        linkedHashSet2.addAll(arrayList2);
        LinkedHashSet linkedHashSet3 = this.f10652g;
        m mVar3 = this.f10648c;
        DataStoreKey dataStoreKey3 = DataStoreKey.TEST_CARDS;
        if (dataStoreKey3.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey3), 12, (Object) null);
            arrayList3 = new ArrayList();
        } else {
            try {
                Object data3 = mVar3.readData(dataStoreKey3, "");
                data3.getClass();
                String str6 = (String) data3;
                if (StringsKt.H(str6)) {
                    arrayList3 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str6) || Intrinsics.areEqual(StringsKt.e0(str6).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        collection3 = kotlin.collections.n0.f26529a;
                    } else {
                        try {
                            n90.b bVar3 = n90.c.f30748d;
                            bVar3.getClass();
                            collection3 = (List) bVar3.b(new m90.d(m90.r1.f29848a, 0), str6);
                        } catch (Exception e14) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e14, false, (Function0) new com.braze.support.e(str6), 4, (Object) null);
                            collection3 = kotlin.collections.n0.f26529a;
                        }
                    }
                    arrayList3 = CollectionsKt.t0(collection3);
                }
            } catch (Exception e15) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e15, false, (Function0) new i0(dataStoreKey3), 8, (Object) null);
                arrayList3 = new ArrayList();
            }
        }
        linkedHashSet3.addAll(arrayList3);
        m mVar4 = this.f10648c;
        DataStoreKey dataStoreKey4 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        Object data4 = mVar4.readData(dataStoreKey4, "");
        data4.getClass();
        String str7 = (String) data4;
        if (!Intrinsics.areEqual(str3, str7)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.braze.f1(str7, str3, 21), 6, (Object) null);
            this.f10648c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
            this.f10648c.writeData(dataStoreKey4, str3);
        }
        Object data5 = this.f10648c.readData(DataStoreKey.LAST_CARD_UPDATED_AT, 0L);
        data5.getClass();
        this.f10649d = ((Long) data5).longValue();
        Object data6 = this.f10648c.readData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
        data6.getClass();
        this.f10650e = ((Long) data6).longValue();
    }

    public static final String d(JSONObject jSONObject) {
        return "Server card was locally dismissed already. Not adding card to storage. Server card: " + jSONObject;
    }

    public static final String e(JSONObject jSONObject) {
        return "Server card has expired already. Not adding card to storage. Server card: " + jSONObject;
    }

    public static final String g(String str) {
        return e0.f.k("Card not present in storage for id: ", str);
    }

    public static final String h(String str) {
        return e0.f.k("Failed to read card json from storage. Json: ", str);
    }

    public static final String j(String str) {
        return e0.f.k("Removing card from test cache: ", str);
    }

    public static final String k(String str) {
        return e0.f.k("Removing card from storage with id: ", str);
    }

    public static final String l(String str) {
        return e0.f.k("Server card is marked as removed. Removing from card storage with id: ", str);
    }

    public static final String m(String str) {
        return e0.f.k("Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ", str);
    }

    public static final String n(String str) {
        return e0.f.k("Can't update card field. Json cannot be parsed from disk or is not present. Id: ", str);
    }

    public static final String o(String str) {
        return e0.f.k("Removing card from storage with id: ", str);
    }

    public static final String p(String str) {
        return e0.f.k("Writing card to storage with id: ", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ContentCardsUpdatedEvent a(com.braze.models.response.c cVar, String str) {
        p pVar;
        String strC;
        cVar.getClass();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (str == 0) {
            pVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(20), 7, (Object) null);
            objectRef.element = "";
        } else {
            pVar = this;
        }
        if (!Intrinsics.areEqual(pVar.f10646a, objectRef.element)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new lw.b(15, objectRef, pVar), 6, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new ga0.c(objectRef, 1), 6, (Object) null);
        long j9 = cVar.f10223a;
        if (j9 != -1) {
            this.f10649d = j9;
            this.f10648c.writeData(DataStoreKey.LAST_CARD_UPDATED_AT, Long.valueOf(j9));
        }
        long j11 = cVar.f10224b;
        if (j11 != -1) {
            this.f10650e = j11;
            this.f10648c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, Long.valueOf(j11));
        }
        this.f10648c.writeData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, Long.valueOf(DateTimeUtils.nowInSeconds()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONArray jSONArray = cVar.f10226d;
        if (jSONArray != null && jSONArray.length() != 0) {
            o80.s sVarM = o80.r.m(o80.r.h(CollectionsKt.F(n80.p.j(0, jSONArray.length())), new n(jSONArray)), new o(jSONArray));
            Iterator it = sVarM.f32132a.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) sVarM.f32133b.invoke(it.next());
                a(jSONObject);
                String string = jSONObject.getString(CardKey.ID.getKey());
                string.getClass();
                linkedHashSet.add(string);
            }
        }
        if (cVar.f10225c) {
            this.f10651f.retainAll(linkedHashSet);
            m mVar = this.f10648c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List listR0 = CollectionsKt.r0(this.f10651f);
            String strC2 = "[]";
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
                    }
                    mVar.writeData(dataStoreKey, strC);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
                }
            }
            LinkedHashSet linkedHashSet2 = this.f10653h;
            linkedHashSet2.retainAll(linkedHashSet);
            m mVar2 = this.f10648c;
            DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
            List listR02 = CollectionsKt.r0(linkedHashSet2);
            if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        n90.b bVar2 = n90.c.f30748d;
                        bVar2.getClass();
                        strC2 = bVar2.c(new m90.d(m90.r1.f29848a, 0), listR02);
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        if ((listR02 instanceof Map) || listR02 == null) {
                            strC2 = "{}";
                        }
                    }
                    mVar2.writeData(dataStoreKey2, strC2);
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new p0(dataStoreKey2), 8, (Object) null);
                }
            }
            linkedHashSet.addAll(this.f10652g);
            a(linkedHashSet);
        }
        return a(false, (Long) null);
    }

    public final void b(String str) {
        String strC;
        str.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.m(str, 3), 6, (Object) null);
        LinkedHashSet linkedHashSet = this.f10652g;
        linkedHashSet.add(str);
        m mVar = this.f10648c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List listR0 = CollectionsKt.r0(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public final void c() {
        ArrayList<String> arrayList;
        Collection collection;
        Pair pair;
        m mVar = this.f10648c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = mVar.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (StringsKt.H(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str) || Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        collection = kotlin.collections.n0.f26529a;
                    } else {
                        try {
                            n90.b bVar = n90.c.f30748d;
                            bVar.getClass();
                            collection = (List) bVar.b(new m90.d(m90.r1.f29848a, 0), str);
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                            collection = kotlin.collections.n0.f26529a;
                        }
                    }
                    arrayList = CollectionsKt.t0(collection);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                pair = new Pair(new JSONObject(str2).getString(CardKey.ID.getKey()), str2);
            } catch (JSONException e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new lw.m(str2, 11), 4, (Object) null);
                pair = null;
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        this.f10654i = kotlin.collections.x0.m(kotlin.collections.x0.j(arrayList2));
    }

    public final JSONObject f(String str) {
        str.getClass();
        String str2 = (String) this.f10654i.get(str);
        if (str2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 8), 7, (Object) null);
            return null;
        }
        try {
            return new JSONObject(str2);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.m(str2, 9), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final Object getCachedCardsAsEvent() {
        return a(true, (Long) null);
    }

    public final void i(String str) {
        String strC;
        str.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.m(str, 10), 6, (Object) null);
        LinkedHashSet linkedHashSet = this.f10652g;
        linkedHashSet.remove(str);
        m mVar = this.f10648c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List listR0 = CollectionsKt.r0(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsClicked(String str) {
        str.getClass();
        a(str, CardKey.CLICKED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsDismissed(String str) {
        str.getClass();
        a(str);
        a(str, (JSONObject) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsViewed(String str) {
        str.getClass();
        a(str, CardKey.VIEWED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsVisuallyRead(String str) {
        str.getClass();
        a(str, CardKey.READ);
    }

    public static final String d() {
        return "The server card received is older than the cached card. Not updating the cached card.";
    }

    public static final String e() {
        return "Input user id was null. Defaulting to the empty user id";
    }

    public static final String d(String str) {
        return e0.f.k("Failed to parse card JSON, skipping: ", str);
    }

    public static final String e(String str) {
        return e0.f.k("Deleting expired card from storage with id: ", str);
    }

    public static final String b(JSONObject jSONObject) {
        return "Server card json: " + jSONObject;
    }

    public static final String b() {
        return "Clearing content card storage.";
    }

    public static final String c(String str) {
        return e0.f.k("Adding card to test cache: ", str);
    }

    public static final String c(JSONObject jSONObject) {
        return "Cached card json: " + jSONObject;
    }

    public final void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        String strC;
        Set setV0 = CollectionsKt.v0(this.f10651f);
        Set setV02 = CollectionsKt.v0(this.f10653h);
        String string = jSONObject.getString(CardKey.ID.getKey());
        string.getClass();
        JSONObject jSONObjectF = f(string);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bw.a(jSONObject, 7), 7, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bw.a(jSONObjectF, 8), 7, (Object) null);
        if (jSONObjectF != null) {
            String key = CardKey.CREATED.getKey();
            if (jSONObjectF.has(key) && jSONObject.has(key) && jSONObjectF.getLong(key) > jSONObject.getLong(key)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new lw.l(19), 6, (Object) null);
                return;
            }
        }
        CardKey cardKey = CardKey.REMOVED;
        cardKey.getClass();
        String key2 = cardKey.getKey();
        if (jSONObject.has(key2) ? jSONObject.getBoolean(key2) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(string, 4), 7, (Object) null);
            this.f10651f.remove(string);
            m mVar = this.f10648c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List listR0 = CollectionsKt.r0(this.f10651f);
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
                    }
                    mVar.writeData(dataStoreKey, strC);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
                }
            }
            i(string);
            a(string, (JSONObject) null);
            return;
        }
        if (setV0.contains(string)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bw.a(jSONObject, 5), 7, (Object) null);
            return;
        }
        if (setV02.contains(string)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bw.a(jSONObject, 6), 7, (Object) null);
            return;
        }
        CardKey cardKey2 = CardKey.DISMISSED;
        cardKey2.getClass();
        String key3 = cardKey2.getKey();
        if (jSONObject.has(key3) ? jSONObject.getBoolean(key3) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(string, 5), 7, (Object) null);
            a(string);
            a(string, (JSONObject) null);
            return;
        }
        if (jSONObjectF == null) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObjectF.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObjectF.get(next));
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (f10645k.contains(next2)) {
                    jSONObject2.put(next2, jSONObjectF.getBoolean(next2) || jSONObject.getBoolean(next2));
                } else {
                    jSONObject2.put(next2, jSONObject.get(next2));
                }
            }
        }
        a(string, jSONObject2);
        CardKey cardKey3 = CardKey.IS_TEST;
        cardKey3.getClass();
        String key4 = cardKey3.getKey();
        if (jSONObject.has(key4) ? jSONObject.getBoolean(key4) : false) {
            b(string);
        }
    }

    public static final String a(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Detected SDK update from '", str, "' -> '", str2, "'. Clearing config update time.");
    }

    public static final String a(Ref.ObjectRef objectRef, p pVar) {
        return "The received cards are for user " + objectRef.element + " and the current user is " + pVar.f10646a + " , the cards will be discarded and no changes will be made.";
    }

    public static final String a(Ref.ObjectRef objectRef) {
        return j4.s.j(objectRef.element, "Updating offline Content Cards for user with id: ");
    }

    public final ContentCardsUpdatedEvent a(boolean z11, Long l) {
        long jLongValue;
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f10654i.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List listA = com.braze.models.h.a(jSONArray, this.f10647b, this, this.f10655j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((Card) it2.next());
        }
        String str = this.f10646a;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            Object data = this.f10648c.readData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, 0L);
            data.getClass();
            jLongValue = ((Long) data).longValue();
        }
        return new ContentCardsUpdatedEvent(arrayList3, str, jLongValue, z11);
    }

    public final void a(Card card) {
        String strC;
        card.getClass();
        String id2 = card.getId();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(id2, 7), 7, (Object) null);
        a(id2, (JSONObject) null);
        id2.getClass();
        this.f10653h.add(id2);
        m mVar = this.f10648c;
        DataStoreKey dataStoreKey = DataStoreKey.EXPIRED_CARDS;
        List listR0 = CollectionsKt.r0(this.f10653h);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                    strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
                }
                mVar.writeData(dataStoreKey, strC);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
            }
        }
        i(id2);
    }

    public final void a(String str, CardKey cardKey) {
        Boolean bool = Boolean.TRUE;
        str.getClass();
        cardKey.getClass();
        JSONObject jSONObjectF = f(str);
        if (jSONObjectF == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 6), 7, (Object) null);
            return;
        }
        try {
            jSONObjectF.put(cardKey.getKey(), bool);
            a(str, jSONObjectF);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new jt.g(cardKey, 21), 4, (Object) null);
        }
    }

    public static final String a(Object obj, CardKey cardKey) {
        return "Failed to update card json field to " + obj + " with key: " + cardKey;
    }

    public final void a(String str, JSONObject jSONObject) {
        p pVar;
        String strC;
        str.getClass();
        if (jSONObject == null) {
            pVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 12), 7, (Object) null);
            pVar.f10654i.remove(str);
        } else {
            pVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 13), 7, (Object) null);
            pVar.f10654i.put(str, jSONObject.toString());
        }
        List listR0 = CollectionsKt.r0(pVar.f10654i.values());
        m mVar = pVar.f10648c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(String str) {
        String strC;
        str.getClass();
        this.f10651f.add(str);
        m mVar = this.f10648c;
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        List listR0 = CollectionsKt.r0(this.f10651f);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(LinkedHashSet linkedHashSet) {
        String strC;
        linkedHashSet.getClass();
        Set setKeySet = this.f10654i.keySet();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.b(16, linkedHashSet, setKeySet), 7, (Object) null);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!linkedHashSet.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 14), 7, (Object) null);
            this.f10654i.remove(str);
        }
        List listR0 = CollectionsKt.r0(this.f10654i.values());
        m mVar = this.f10648c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Set set, Set set2) {
        return "Retaining card ids: " + set + " among cached card ids: " + set2;
    }

    public final void a() throws Throwable {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(21), 7, (Object) null);
        this.f10654i.clear();
        this.f10653h.clear();
        this.f10648c.clearAllData();
    }
}
