package mk;

import androidx.lifecycle.l1;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.user.response.charity.Product;
import com.braze.support.DateTimeUtils;
import f70.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m5.d0;
import mv.d;
import mv.p0;
import o30.e0;
import r8.k;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f29971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29972b;

    public a(b bVar) {
        this.f29971a = bVar;
    }

    public static void e(a aVar, BasicItem basicItem) {
        String str;
        ArrayList arrayList;
        Date dateI;
        String str2;
        aVar.getClass();
        b bVar = aVar.f29971a;
        if (basicItem != null) {
            dv.b bVar2 = new dv.b();
            bVar2.b(dv.a.IS_LOCAL_HERO, Boolean.valueOf(d.m(basicItem).isLocalHero()));
            bVar2.b(dv.a.AVAILABLE_STOCK, Integer.valueOf(basicItem.getItemsAvailable()));
            bVar2.b(dv.a.PACKAGING_TYPE, basicItem.getInformation().getPackagingOption().getTrackingName());
            bVar2.b(dv.a.ITEM_CATEGORY, basicItem.getInformation().getItemCategory().name());
            dv.a aVar2 = dv.a.DISCOVER_BUCKET;
            String strB = aVar.b();
            if (strB == null) {
                strB = "None";
            }
            bVar2.b(aVar2, strB);
            bVar2.b(dv.a.HAS_SUGGESTION, Boolean.FALSE);
            dv.a aVar3 = dv.a.OPENED_FROM;
            i iVar = (i) bVar.f29974b.a("ORIGIN");
            if (iVar == null) {
                iVar = i.UNKNOWN;
            }
            String strA = f.y(iVar).a();
            if (iVar == i.HERO_COMPONENT) {
                strA = k.m(strA, "_", (String) bVar.f29974b.a("DISPLAY_TYPE"));
            }
            bVar2.b(aVar3, strA);
            dv.a aVar4 = dv.a.OPENED_FROM_DEEPLINK;
            i iVar2 = (i) bVar.f29974b.a("ORIGIN");
            if (iVar2 == null) {
                iVar2 = i.UNKNOWN;
            }
            bVar2.b(aVar4, Boolean.valueOf(wd.a.A(iVar2)));
            dv.a aVar5 = dv.a.DEEPLINK_SOURCE;
            HashMap map = (HashMap) bVar.f29974b.a("DEEPLINK_PARAMETERS_MAP");
            String str3 = "none";
            if (map == null || (str = (String) map.get("source")) == null) {
                str = "none";
            }
            bVar2.b(aVar5, str);
            dv.a aVar6 = dv.a.DEEPLINK_CAMPAIGN_ID;
            HashMap map2 = (HashMap) bVar.f29974b.a("DEEPLINK_PARAMETERS_MAP");
            if (map2 != null && (str2 = (String) map2.get("campaign_id")) != null) {
                str3 = str2;
            }
            bVar2.b(aVar6, str3);
            dv.a aVar7 = dv.a.FUTURE_ITEM;
            String intervalStart = d.l(basicItem).getIntervalStart();
            boolean z11 = false;
            bVar2.b(aVar7, Boolean.valueOf(intervalStart != null && (p0.B(intervalStart) ^ true)));
            bVar2.b(dv.a.ITEM_ID, basicItem.getInformation().mo340getItemIdFvU5WIY());
            dv.a aVar8 = dv.a.STORE_ID;
            String strM370getStoreId7QsYvu8 = d.m(basicItem).m370getStoreId7QsYvu8();
            if (strM370getStoreId7QsYvu8 == null) {
                strM370getStoreId7QsYvu8 = null;
            }
            if (strM370getStoreId7QsYvu8 == null) {
                strM370getStoreId7QsYvu8 = "";
            }
            bVar2.b(aVar8, strM370getStoreId7QsYvu8);
            bVar2.b(dv.a.ITEM_TYPE, basicItem.getItemType().name());
            bVar2.b(dv.a.DYNAMIC_ITEM, Boolean.valueOf(basicItem.getInformation().getDynamicPriceInfo() != null));
            String str4 = (String) bVar.f29974b.a("CATEGORY_TYPE");
            if (str4 != null && str4.length() > 0 && !Intrinsics.areEqual("UNKNOWN", str4)) {
                bVar2.b(dv.a.OPENED_FROM_SCREEN_NAME, str4);
            }
            dv.a aVar9 = dv.a.OVERALL_RATING;
            AverageItemRating averageItemRating = basicItem.getInformation().getAverageItemRating();
            bVar2.b(aVar9, Double.valueOf(averageItemRating != null ? e0.E(averageItemRating.getAverageOverallRating()) : 0.0d));
            bVar2.b(dv.a.RATING_VERSION, 2);
            dv.a aVar10 = dv.a.ITEM_TAGS;
            List<ItemTagInfo> itemTags = basicItem.getItemTags();
            if (itemTags != null) {
                arrayList = new ArrayList(kotlin.collections.e0.o(itemTags, 10));
                Iterator<T> it = itemTags.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ItemTagInfo) it.next()).getId().name());
                }
            } else {
                arrayList = null;
            }
            bVar2.b(aVar10, arrayList);
            dv.a aVar11 = dv.a.TRANSLATION_AVAILABLE;
            String descriptionTranslated = basicItem.getInformation().getDescriptionTranslated();
            bVar2.b(aVar11, Boolean.valueOf(!(descriptionTranslated == null || descriptionTranslated.length() == 0)));
            bVar2.b(dv.a.TRANSLATION_ENABLED, Boolean.FALSE);
            bVar2.b(dv.a.IS_FAVORITE, Boolean.valueOf(basicItem.getFavorite()));
            bVar2.b(dv.a.IS_REMINDER_SET, null);
            long quantity = 0;
            if (basicItem instanceof FlashSalesItem) {
                bVar2.b(dv.a.USER_MEAL_DISTANCE_METERS, Integer.valueOf((int) (((FlashSalesItem) basicItem).getDistance() * ((double) 1000))));
                dv.a aVar12 = dv.a.MINUTES_LEFT_TO_COLLECT;
                String intervalEnd = d.l(basicItem).getIntervalEnd();
                if (intervalEnd != null && (dateI = p0.I(intervalEnd)) != null) {
                    quantity = dateI.getTime() - DateTimeUtils.nowInMilliseconds();
                }
                long j9 = 60000;
                bVar2.b(aVar12, Integer.valueOf((int) (quantity / j9)));
                bVar2.b(dv.a.MINUTES_TO_COLLECT_WHEN_LISTED, Integer.valueOf((int) (d.n(basicItem) / j9)));
                String pickupWindowStartSecond = d.l(basicItem).getPickupWindowStartSecond();
                if (pickupWindowStartSecond != null) {
                    bVar2.b(dv.a.PICKUP_WINDOW_START_SECOND, pickupWindowStartSecond);
                }
            } else if (basicItem instanceof CharityItem) {
                bVar2.b(dv.a.VERSION, "v1");
                dv.a aVar13 = dv.a.DONATION_NUMBER_OF_ITEMS;
                CharityItem charityItem = (CharityItem) basicItem;
                Iterator<T> it2 = charityItem.getInformation().getProducts().iterator();
                while (it2.hasNext()) {
                    quantity += ((Product) it2.next()).getQuantity();
                }
                bVar2.b(aVar13, Integer.valueOf((int) quantity));
                bVar2.b(dv.a.DONATION_FOOD_CATEGORIES, CollectionsKt.U(charityItem.getInformation().getCategories(), MessageLogView.COMMA_SEPARATOR, null, null, new d0(15), 30));
                dv.a aVar14 = dv.a.DONATION_COLLECTION_INSTRUCTIONS;
                String collectionInfo = charityItem.getInformation().getCollectionInfo();
                if (collectionInfo != null && collectionInfo.length() > 0) {
                    z11 = true;
                }
                bVar2.b(aVar14, Boolean.valueOf(z11));
                bVar2.b(dv.a.DONATION_WINDOW_LENGTH, d.l(basicItem).getPickupWindowLength());
                bVar2.b(dv.a.DONATION_COLLECTION_START_TIME, p0.H(d.l(basicItem).getIntervalStart()));
            }
            bVar.f29973a.c(cv.i.SCREEN_ITEM, bVar2);
        }
    }

    public final String a() {
        return (String) this.f29971a.f29974b.a("DEEPLINK_ID");
    }

    public final String b() {
        return (String) this.f29971a.f29974b.a("FILLER_TYPE");
    }

    public final String c() {
        ItemId itemId = (ItemId) this.f29971a.f29974b.a("ITEM_ID");
        if (itemId != null) {
            return itemId.m205unboximpl();
        }
        return null;
    }

    public final void d(cv.i iVar, dv.b bVar) {
        iVar.getClass();
        this.f29971a.f29973a.c(iVar, bVar);
    }
}
