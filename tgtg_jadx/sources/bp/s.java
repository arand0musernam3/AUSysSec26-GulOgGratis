package bp;

import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s BAKERY_DISCOVER_NEW_ITEMS;
    public static final s BAKERY_DISCOVER_NEW_PLACE;
    public static final s BAKERY_GET_FOOD_NEXT_DAYS;
    public static final s BAKERY_GET_MEAL;
    public static final s BAKERY_GET_TREAT_OR_SNACK;
    public static final s BAKERY_SHARE_FOOD;
    public static final s BAKERY_STOCK_UP;
    public static final s COLLECTION_AREA_HARD_TO_FIND;
    public static final s COLLECTION_LONG_WAIT_TIMES;
    public static final s COLLECTION_OTHER;
    public static final s COLLECTION_POORLY_PACKAGED;
    public static final s COLLECTION_POOR_CLEANLINESS;
    public static final s COLLECTION_STORE_CLOSED;
    public static final s COLLECTION_UNFAMILIAR_STAFF;
    public static final s COLLECTION_UNFRIENDLY_STAFF;
    public static final s GROCERY_DISCOVER_NEW_ITEMS;
    public static final s GROCERY_GET_FOOD_NEXT_DAYS;
    public static final s GROCERY_REPLACE_SHOPPING;
    public static final s GROCERY_STOCK_UP;
    public static final s GROCERY_SUPPLEMENT_SHOPPING;
    public static final s MEAL_DISCOVER_NEW_ITEMS;
    public static final s MEAL_DISCOVER_NEW_PLACE;
    public static final s MEAL_GET_HEALTHY_MEAL;
    public static final s MEAL_GET_MEAL;
    public static final s MEAL_REPLACE_COOKING;
    public static final s MEAL_SHARE_FOOD;
    public static final s QUALITY_FOOD_NOT_FRESH;
    public static final s QUALITY_NOT_MATCHING_DESCRIPTION;
    public static final s QUALITY_OTHER;
    public static final s QUALITY_SPOILED_OR_EXPIRED;
    public static final s QUALITY_TASTES_BAD;
    public static final s QUANTITY_LESS_FOOD_THAN_EXPECTED;
    public static final s QUANTITY_OTHER;
    public static final s QUANTITY_QUANTITY_DID_NOT_MATCH;
    public static final s QUANTITY_TOO_SMALL_PORTIONS;
    public static final s USP_QUESTION_OTHER;
    public static final s VARIETY_EXPECTED_SOMETHING_ELSE;
    public static final s VARIETY_MANY_DUPLICATES;
    public static final s VARIETY_OTHER;

    @NotNull
    private final String reason;

    @Nullable
    private Integer string;

    static {
        s sVar = new s("COLLECTION_UNFAMILIAR_STAFF", 0, "unfamiliar_staff", Integer.valueOf(R.string.rating_reason_collection_unfamiliar_staff));
        COLLECTION_UNFAMILIAR_STAFF = sVar;
        s sVar2 = new s("COLLECTION_UNFRIENDLY_STAFF", 1, "unfriendly_staff", Integer.valueOf(R.string.rating_reason_collection_unfriendly_staff));
        COLLECTION_UNFRIENDLY_STAFF = sVar2;
        s sVar3 = new s("COLLECTION_LONG_WAIT_TIMES", 2, "long_wait_times", Integer.valueOf(R.string.rating_reason_collection_long_wait_time));
        COLLECTION_LONG_WAIT_TIMES = sVar3;
        s sVar4 = new s("COLLECTION_POORLY_PACKAGED", 3, "poorly_packaged", Integer.valueOf(R.string.rating_reason_collection_poorly_packaged));
        COLLECTION_POORLY_PACKAGED = sVar4;
        s sVar5 = new s("COLLECTION_STORE_CLOSED", 4, "store_closed", Integer.valueOf(R.string.rating_reason_collection_closed_store));
        COLLECTION_STORE_CLOSED = sVar5;
        s sVar6 = new s("COLLECTION_POOR_CLEANLINESS", 5, "poor_cleanliness", Integer.valueOf(R.string.rating_reason_collection_hygiene));
        COLLECTION_POOR_CLEANLINESS = sVar6;
        s sVar7 = new s("COLLECTION_AREA_HARD_TO_FIND", 6, "area_hard_to_find", Integer.valueOf(R.string.rating_reason_collection_hard_to_find));
        COLLECTION_AREA_HARD_TO_FIND = sVar7;
        Integer numValueOf = Integer.valueOf(R.string.rating_reason_other);
        s sVar8 = new s("COLLECTION_OTHER", 7, "collection_experience_other", numValueOf);
        COLLECTION_OTHER = sVar8;
        s sVar9 = new s("QUALITY_FOOD_NOT_FRESH", 8, "food_not_fresh", Integer.valueOf(R.string.rating_reason_quality_not_fresh));
        QUALITY_FOOD_NOT_FRESH = sVar9;
        s sVar10 = new s("QUALITY_SPOILED_OR_EXPIRED", 9, "spoiled_or_expired", Integer.valueOf(R.string.rating_reason_quality_spoiled));
        QUALITY_SPOILED_OR_EXPIRED = sVar10;
        s sVar11 = new s("QUALITY_TASTES_BAD", 10, "tastes_bad", Integer.valueOf(R.string.rating_reason_quality_taste));
        QUALITY_TASTES_BAD = sVar11;
        s sVar12 = new s("QUALITY_NOT_MATCHING_DESCRIPTION", 11, "not_matching_description", Integer.valueOf(R.string.rating_reason_quality_description));
        QUALITY_NOT_MATCHING_DESCRIPTION = sVar12;
        s sVar13 = new s("QUALITY_OTHER", 12, "food_quality_other", numValueOf);
        QUALITY_OTHER = sVar13;
        s sVar14 = new s("VARIETY_MANY_DUPLICATES", 13, "many_duplicates", Integer.valueOf(R.string.rating_reason_variety_many_duplicates));
        VARIETY_MANY_DUPLICATES = sVar14;
        s sVar15 = new s("VARIETY_EXPECTED_SOMETHING_ELSE", 14, "expected_something_else", Integer.valueOf(R.string.rating_reason_variety_expected_something_else));
        VARIETY_EXPECTED_SOMETHING_ELSE = sVar15;
        s sVar16 = new s("VARIETY_OTHER", 15, "contents_variety_other", numValueOf);
        VARIETY_OTHER = sVar16;
        s sVar17 = new s("QUANTITY_LESS_FOOD_THAN_EXPECTED", 16, "less_food_than_expected", Integer.valueOf(R.string.rating_reason_quantity_less_food));
        QUANTITY_LESS_FOOD_THAN_EXPECTED = sVar17;
        s sVar18 = new s("QUANTITY_QUANTITY_DID_NOT_MATCH", 17, "quantity_did_not_match", Integer.valueOf(R.string.rating_reason_quantity_description));
        QUANTITY_QUANTITY_DID_NOT_MATCH = sVar18;
        s sVar19 = new s("QUANTITY_TOO_SMALL_PORTIONS", 18, "too_small_portions", Integer.valueOf(R.string.rating_reason_quantity_too_small));
        QUANTITY_TOO_SMALL_PORTIONS = sVar19;
        s sVar20 = new s("QUANTITY_OTHER", 19, "food_quantity_other", numValueOf);
        QUANTITY_OTHER = sVar20;
        s sVar21 = new s("BAKERY_DISCOVER_NEW_PLACE", 20, "discover_new_place", Integer.valueOf(R.string.rating_reason_bakery_try_new_store));
        BAKERY_DISCOVER_NEW_PLACE = sVar21;
        s sVar22 = new s("BAKERY_DISCOVER_NEW_ITEMS", 21, "discover_new_items", Integer.valueOf(R.string.rating_reason_bakery_try_new_item));
        BAKERY_DISCOVER_NEW_ITEMS = sVar22;
        s sVar23 = new s("BAKERY_GET_FOOD_NEXT_DAYS", 22, "get_food_next_days", Integer.valueOf(R.string.rating_reason_bakery_for_coming_days));
        BAKERY_GET_FOOD_NEXT_DAYS = sVar23;
        s sVar24 = new s("BAKERY_STOCK_UP", 23, "stock_up", Integer.valueOf(R.string.rating_reason_bakery_stock_freezer));
        BAKERY_STOCK_UP = sVar24;
        s sVar25 = new s("BAKERY_GET_MEAL", 24, "get_meal", Integer.valueOf(R.string.rating_reason_bakery_get_a_meal));
        BAKERY_GET_MEAL = sVar25;
        s sVar26 = new s("BAKERY_GET_TREAT_OR_SNACK", 25, "get_treat_or_snack", Integer.valueOf(R.string.rating_reason_bakery_get_snack));
        BAKERY_GET_TREAT_OR_SNACK = sVar26;
        s sVar27 = new s("BAKERY_SHARE_FOOD", 26, "share_food", Integer.valueOf(R.string.rating_reason_bakery_share));
        BAKERY_SHARE_FOOD = sVar27;
        Integer numValueOf2 = Integer.valueOf(R.string.rating_reason_usp_grocery_meal_discover_new_items);
        s sVar28 = new s("GROCERY_DISCOVER_NEW_ITEMS", 27, "discover_new_items", numValueOf2);
        GROCERY_DISCOVER_NEW_ITEMS = sVar28;
        s sVar29 = new s("GROCERY_GET_FOOD_NEXT_DAYS", 28, "get_food_next_days", Integer.valueOf(R.string.rating_reason_grocery_coming_days));
        GROCERY_GET_FOOD_NEXT_DAYS = sVar29;
        s sVar30 = new s("GROCERY_STOCK_UP", 29, "stock_up", Integer.valueOf(R.string.rating_reason_grocery_stock_up));
        GROCERY_STOCK_UP = sVar30;
        s sVar31 = new s("GROCERY_SUPPLEMENT_SHOPPING", 30, "supplement_shopping", Integer.valueOf(R.string.rating_reason_grocery_supplement));
        GROCERY_SUPPLEMENT_SHOPPING = sVar31;
        s sVar32 = new s("GROCERY_REPLACE_SHOPPING", 31, "replace_shopping", Integer.valueOf(R.string.rating_reason_grocery_replace));
        GROCERY_REPLACE_SHOPPING = sVar32;
        s sVar33 = new s("MEAL_DISCOVER_NEW_PLACE", 32, "discover_new_place", Integer.valueOf(R.string.rating_reason_meal_try_new_place));
        MEAL_DISCOVER_NEW_PLACE = sVar33;
        s sVar34 = new s("MEAL_DISCOVER_NEW_ITEMS", 33, "discover_new_items", numValueOf2);
        MEAL_DISCOVER_NEW_ITEMS = sVar34;
        s sVar35 = new s("MEAL_GET_MEAL", 34, "get_meal", Integer.valueOf(R.string.rating_reason_meal_ready_meal));
        MEAL_GET_MEAL = sVar35;
        s sVar36 = new s("MEAL_REPLACE_COOKING", 35, "replace_cooking", Integer.valueOf(R.string.rating_reason_meal_replace));
        MEAL_REPLACE_COOKING = sVar36;
        s sVar37 = new s("MEAL_GET_HEALTHY_MEAL", 36, "get_healthy_meal", Integer.valueOf(R.string.rating_reason_meal_healthy_meal));
        MEAL_GET_HEALTHY_MEAL = sVar37;
        s sVar38 = new s("MEAL_SHARE_FOOD", 37, "share_food", Integer.valueOf(R.string.rating_reason_meal_share));
        MEAL_SHARE_FOOD = sVar38;
        s sVar39 = new s("USP_QUESTION_OTHER", 38, "usp_question_other", numValueOf);
        USP_QUESTION_OTHER = sVar39;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11, sVar12, sVar13, sVar14, sVar15, sVar16, sVar17, sVar18, sVar19, sVar20, sVar21, sVar22, sVar23, sVar24, sVar25, sVar26, sVar27, sVar28, sVar29, sVar30, sVar31, sVar32, sVar33, sVar34, sVar35, sVar36, sVar37, sVar38, sVar39};
        $VALUES = sVarArr;
        $ENTRIES = new a80.b(sVarArr);
    }

    public s(String str, int i11, String str2, Integer num) {
        this.reason = str2;
        this.string = num;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final String a() {
        return this.reason;
    }

    public final Integer c() {
        return this.string;
    }
}
