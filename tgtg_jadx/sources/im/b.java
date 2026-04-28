package im;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CHARITY_HOME_WEEKLY_TOOLTIP_LAST_SEEN;
    public static final b FAVORITES_MAP_BEEN_SEEN;
    public static final b HAS_BLOB_TOOLTIP_BEEN_DISMISSED;
    public static final b HAS_BRING_BACK_MAGIC_BEEN_SEEN;
    public static final b HAS_C2C_ALWAYS_ON_CARD_BEEN_DISMISSED;
    public static final b HAS_C2C_V3_CAMPAIGN_EXPIRED_CARD_DISMISSED;
    public static final b HAS_CHARITY_ENABLE_NOTIFICATIONS_BEEN_DISMISSED;
    public static final b HAS_CHARITY_HOME_FIRST_VISIT_COMPLETED;
    public static final b HAS_CHARITY_PLAN_TOOLTIP_BEEN_SEEN;
    public static final b HAS_CHARITY_REVIEW_COLLECTION_DAYS_BEEN_DISMISSED;
    public static final b HAS_FAVORITES_RECENT_ORDERS_DISMISSED;
    public static final b HAS_FAVORITE_TOOLTIP_ON_ITEM_PAGE_BEEN_DISMISSED;
    public static final b HAS_PROFILE_SPECIAL_REWARDS_CARD_DISMISSED;
    public static final b HAS_PROFILE_STORE_SIGNUP_CARD_BEEN_SEEN;
    public static final b HAS_RECIPE_GENERATOR_BEEN_OPENED;
    public static final b HAS_REWARDS_POPUP_BEEN_SEEN;
    public static final b HAS_SETTINGS_SPECIAL_REWARDS_BEEN_SEEN;
    public static final b HAS_USER_PURCHASED_3_ORDERS;

    @NotNull
    private final String value;

    static {
        b bVar = new b("HAS_SETTINGS_SPECIAL_REWARDS_BEEN_SEEN", 0, "hasSettingsSpecialRewardsBeenSeen");
        HAS_SETTINGS_SPECIAL_REWARDS_BEEN_SEEN = bVar;
        b bVar2 = new b("HAS_PROFILE_SPECIAL_REWARDS_CARD_DISMISSED", 1, "hasProfileSpecialRewardsCardDismissed");
        HAS_PROFILE_SPECIAL_REWARDS_CARD_DISMISSED = bVar2;
        b bVar3 = new b("HAS_USER_PURCHASED_3_ORDERS", 2, "hasUserPurchased3Orders");
        HAS_USER_PURCHASED_3_ORDERS = bVar3;
        b bVar4 = new b("HAS_BRING_BACK_MAGIC_BEEN_SEEN", 3, "hasBringBackMagicBeenSeen");
        HAS_BRING_BACK_MAGIC_BEEN_SEEN = bVar4;
        b bVar5 = new b("HAS_REWARDS_POPUP_BEEN_SEEN", 4, "hasRewardsPopupBeenSeen");
        HAS_REWARDS_POPUP_BEEN_SEEN = bVar5;
        b bVar6 = new b("HAS_C2C_V3_CAMPAIGN_EXPIRED_CARD_DISMISSED", 5, "c2cV3CampaignExpiredCardDismissed");
        HAS_C2C_V3_CAMPAIGN_EXPIRED_CARD_DISMISSED = bVar6;
        b bVar7 = new b("HAS_C2C_ALWAYS_ON_CARD_BEEN_DISMISSED", 6, "c2cAlwaysOnCardBeenDismissed");
        HAS_C2C_ALWAYS_ON_CARD_BEEN_DISMISSED = bVar7;
        b bVar8 = new b("HAS_CHARITY_PLAN_TOOLTIP_BEEN_SEEN", 7, "charityPlanTooltipBeenSeen");
        HAS_CHARITY_PLAN_TOOLTIP_BEEN_SEEN = bVar8;
        b bVar9 = new b("CHARITY_HOME_WEEKLY_TOOLTIP_LAST_SEEN", 8, "charityHomeWeeklyTooltipLastSeen");
        CHARITY_HOME_WEEKLY_TOOLTIP_LAST_SEEN = bVar9;
        b bVar10 = new b("FAVORITES_MAP_BEEN_SEEN", 9, "favoritesMapBeenSeen");
        FAVORITES_MAP_BEEN_SEEN = bVar10;
        b bVar11 = new b("HAS_PROFILE_STORE_SIGNUP_CARD_BEEN_SEEN", 10, "hasProfileStoreSignupCardBeenSeen");
        HAS_PROFILE_STORE_SIGNUP_CARD_BEEN_SEEN = bVar11;
        b bVar12 = new b("HAS_FAVORITES_RECENT_ORDERS_DISMISSED", 11, "hasFavoritesRecentOrdersDismissed");
        HAS_FAVORITES_RECENT_ORDERS_DISMISSED = bVar12;
        b bVar13 = new b("HAS_BLOB_TOOLTIP_BEEN_DISMISSED", 12, "hasBlobTooltipBeenDismissed");
        HAS_BLOB_TOOLTIP_BEEN_DISMISSED = bVar13;
        b bVar14 = new b("HAS_RECIPE_GENERATOR_BEEN_OPENED", 13, "hasRecipeGeneratorBeenOpened");
        HAS_RECIPE_GENERATOR_BEEN_OPENED = bVar14;
        b bVar15 = new b("HAS_CHARITY_HOME_FIRST_VISIT_COMPLETED", 14, "hasCharityHomeFirstVisitCompleted");
        HAS_CHARITY_HOME_FIRST_VISIT_COMPLETED = bVar15;
        b bVar16 = new b("HAS_CHARITY_REVIEW_COLLECTION_DAYS_BEEN_DISMISSED", 15, "hasCharityReviewCollectionDaysBeenDismissed");
        HAS_CHARITY_REVIEW_COLLECTION_DAYS_BEEN_DISMISSED = bVar16;
        b bVar17 = new b("HAS_CHARITY_ENABLE_NOTIFICATIONS_BEEN_DISMISSED", 16, "hasCharityEnableNotificationsBeenDismissed");
        HAS_CHARITY_ENABLE_NOTIFICATIONS_BEEN_DISMISSED = bVar17;
        b bVar18 = new b("HAS_FAVORITE_TOOLTIP_ON_ITEM_PAGE_BEEN_DISMISSED", 17, "hasFavoriteTooltipOnItemPageBeenDismissed");
        HAS_FAVORITE_TOOLTIP_ON_ITEM_PAGE_BEEN_DISMISSED = bVar18;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public b(String str, int i11, String str2) {
        this.value = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
