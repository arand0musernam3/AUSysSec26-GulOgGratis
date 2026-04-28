package bp;

import java.util.List;
import kotlin.collections.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f6569a = d0.h(s.COLLECTION_UNFAMILIAR_STAFF, s.COLLECTION_UNFRIENDLY_STAFF, s.COLLECTION_LONG_WAIT_TIMES, s.COLLECTION_POORLY_PACKAGED, s.COLLECTION_STORE_CLOSED, s.COLLECTION_POOR_CLEANLINESS, s.COLLECTION_AREA_HARD_TO_FIND, s.COLLECTION_OTHER);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f6570b = d0.h(s.QUALITY_FOOD_NOT_FRESH, s.QUALITY_SPOILED_OR_EXPIRED, s.QUALITY_TASTES_BAD, s.QUALITY_NOT_MATCHING_DESCRIPTION, s.QUALITY_OTHER);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f6571c = d0.h(s.VARIETY_MANY_DUPLICATES, s.VARIETY_EXPECTED_SOMETHING_ELSE, s.VARIETY_OTHER);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f6572d = d0.h(s.QUANTITY_LESS_FOOD_THAN_EXPECTED, s.QUANTITY_QUANTITY_DID_NOT_MATCH, s.QUANTITY_TOO_SMALL_PORTIONS, s.QUANTITY_OTHER);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f6573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f6574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f6575g;

    static {
        s sVar = s.BAKERY_GET_TREAT_OR_SNACK;
        s sVar2 = s.BAKERY_DISCOVER_NEW_PLACE;
        s sVar3 = s.BAKERY_DISCOVER_NEW_ITEMS;
        s sVar4 = s.BAKERY_STOCK_UP;
        s sVar5 = s.BAKERY_SHARE_FOOD;
        s sVar6 = s.BAKERY_GET_FOOD_NEXT_DAYS;
        s sVar7 = s.BAKERY_GET_MEAL;
        s sVar8 = s.USP_QUESTION_OTHER;
        f6573e = d0.h(sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8);
        f6574f = d0.h(s.MEAL_GET_HEALTHY_MEAL, s.MEAL_REPLACE_COOKING, s.MEAL_DISCOVER_NEW_PLACE, s.MEAL_DISCOVER_NEW_ITEMS, s.MEAL_SHARE_FOOD, s.MEAL_GET_MEAL, sVar8);
        f6575g = d0.h(s.GROCERY_SUPPLEMENT_SHOPPING, s.GROCERY_REPLACE_SHOPPING, s.GROCERY_DISCOVER_NEW_ITEMS, s.GROCERY_STOCK_UP, s.GROCERY_GET_FOOD_NEXT_DAYS, sVar8);
    }
}
