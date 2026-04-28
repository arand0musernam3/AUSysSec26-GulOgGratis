package mv;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k APPTRK_CC_PERSONAL_CARE;
    public static final k APPTRK_CC_ZENDESK_CHAT_INTEGRATION;
    public static final k APPTRK_CE_CUSTOM_FAVORITE_REMINDER;
    public static final k APPTRK_CM_COMPLEX_QUICK_FILTERS;
    public static final k APPTRK_CM_EDIT_PICKUP_TIMES;
    public static final k APPTRK_CM_LIST_ON_MAP_V3;
    public static final k APPTRK_CM_LOCATION_SELECTOR_UPGRADE;
    public static final k APPTRK_CM_NEW_LOCATION_PICKER;
    public static final k APPTRK_CM_RECIPE_GENERATOR;
    public static final k APPTRK_CM_RECIPE_SHARING;
    public static final k APPTRK_CM_SPECIAL_REWARDS_EXP;
    public static final k APPTRK_ITEM_PAGE_ADDRESS;
    public static final k APPTRK_ITEM_PAGE_NO_DESCRIPTION;
    public static final k APPTRK_ITEM_PAGE_NO_RATINGS;
    public static final k APPTRK_KANO_POPUP_CONFIGURATION;
    public static final k APPTRK_MNU_BASKET_RECOMMENDATION;
    public static final k APPTRK_RLX_VOUCHER_EXPERIENCE;
    public static final k APP_RLX_MY_STORE_NAVIGATION_BAR_MIGRATION;

    @NotNull
    private final String value;

    static {
        k kVar = new k("APPTRK_CC_ZENDESK_CHAT_INTEGRATION", 0, "apptrk.CC_zendesk_chat_integration");
        APPTRK_CC_ZENDESK_CHAT_INTEGRATION = kVar;
        k kVar2 = new k("APPTRK_CC_PERSONAL_CARE", 1, "apptrk.CC_Personal_Care");
        APPTRK_CC_PERSONAL_CARE = kVar2;
        k kVar3 = new k("APPTRK_ITEM_PAGE_NO_RATINGS", 2, "apptrk.item_page_no_ratings");
        APPTRK_ITEM_PAGE_NO_RATINGS = kVar3;
        k kVar4 = new k("APPTRK_ITEM_PAGE_ADDRESS", 3, "apptrk.item_page_address");
        APPTRK_ITEM_PAGE_ADDRESS = kVar4;
        k kVar5 = new k("APPTRK_ITEM_PAGE_NO_DESCRIPTION", 4, "apptrk.item_page_no_description");
        APPTRK_ITEM_PAGE_NO_DESCRIPTION = kVar5;
        k kVar6 = new k("APPTRK_CE_CUSTOM_FAVORITE_REMINDER", 5, "apptrk.CE_custom_favorite_reminder");
        APPTRK_CE_CUSTOM_FAVORITE_REMINDER = kVar6;
        k kVar7 = new k("APP_RLX_MY_STORE_NAVIGATION_BAR_MIGRATION", 6, "app.RLX_my_store_navigation_bar_migration");
        APP_RLX_MY_STORE_NAVIGATION_BAR_MIGRATION = kVar7;
        k kVar8 = new k("APPTRK_CM_LIST_ON_MAP_V3", 7, "apptrk.CM_ListOnMap_V3");
        APPTRK_CM_LIST_ON_MAP_V3 = kVar8;
        k kVar9 = new k("APPTRK_CM_EDIT_PICKUP_TIMES", 8, "apptrk.CM_EditPickupTimes");
        APPTRK_CM_EDIT_PICKUP_TIMES = kVar9;
        k kVar10 = new k("APPTRK_CM_NEW_LOCATION_PICKER", 9, "apptrk.CM_NewLocationPicker");
        APPTRK_CM_NEW_LOCATION_PICKER = kVar10;
        k kVar11 = new k("APPTRK_CM_LOCATION_SELECTOR_UPGRADE", 10, "apptrk.CM_LocationSelectorUpdate");
        APPTRK_CM_LOCATION_SELECTOR_UPGRADE = kVar11;
        k kVar12 = new k("APPTRK_CM_SPECIAL_REWARDS_EXP", 11, "apptrk.CM_SpecialRewardsExp");
        APPTRK_CM_SPECIAL_REWARDS_EXP = kVar12;
        k kVar13 = new k("APPTRK_CM_RECIPE_GENERATOR", 12, "apptrk.CM_RecipeGenerator");
        APPTRK_CM_RECIPE_GENERATOR = kVar13;
        k kVar14 = new k("APPTRK_CM_RECIPE_SHARING", 13, "apptrk.CM_Recipe_Sharing");
        APPTRK_CM_RECIPE_SHARING = kVar14;
        k kVar15 = new k("APPTRK_CM_COMPLEX_QUICK_FILTERS", 14, "apptrk.CM_ComplexQuickFilters");
        APPTRK_CM_COMPLEX_QUICK_FILTERS = kVar15;
        k kVar16 = new k("APPTRK_RLX_VOUCHER_EXPERIENCE", 15, "app.RLX_voucher_experience_development");
        APPTRK_RLX_VOUCHER_EXPERIENCE = kVar16;
        k kVar17 = new k("APPTRK_KANO_POPUP_CONFIGURATION", 16, "apptrk.kano_popup_configuration");
        APPTRK_KANO_POPUP_CONFIGURATION = kVar17;
        k kVar18 = new k("APPTRK_MNU_BASKET_RECOMMENDATION", 17, "apptrk.MNU_Basket_Recommendation");
        APPTRK_MNU_BASKET_RECOMMENDATION = kVar18;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18};
        $VALUES = kVarArr;
        $ENTRIES = new a80.b(kVarArr);
    }

    public k(String str, int i11, String str2) {
        this.value = str2;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
