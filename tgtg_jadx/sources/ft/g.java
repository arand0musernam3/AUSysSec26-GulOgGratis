package ft;

import androidx.work.impl.WorkDatabase_Impl;
import com.app.tgtg.gateway.local.LocalDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.c0;
import o00.x0;
import y9.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends l8.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17926d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f17927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LocalDatabase_Impl localDatabase_Impl) {
        super(57, "b871617329f961359dfc1213fcdd587a", "b08263568f72d5ff3ca05cd0d9e13bbe");
        this.f17927e = localDatabase_Impl;
    }

    private final nx.n h(ha.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cancelUntil", new da.k("cancelUntil", "TEXT", false, 0, null, 1));
        linkedHashMap.put("confirmationEmail", new da.k("confirmationEmail", "TEXT", false, 0, null, 1));
        linkedHashMap.put("foodHandlingInstruction", new da.k("foodHandlingInstruction", "TEXT", false, 0, null, 1));
        linkedHashMap.put("buffetHandlingInstruction", new da.k("buffetHandlingInstruction", "TEXT", false, 0, null, 1));
        linkedHashMap.put("canUserSupplyPackaging", new da.k("canUserSupplyPackaging", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("packagingOption", new da.k("packagingOption", "TEXT", true, 0, null, 1));
        linkedHashMap.put("isRated", new da.k("isRated", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("canBeRated", new da.k("canBeRated", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("itemCollectionInfo", new da.k("itemCollectionInfo", "TEXT", false, 0, null, 1));
        linkedHashMap.put("itemId", new da.k("itemId", "TEXT", false, 0, null, 1));
        linkedHashMap.put("itemName", new da.k("itemName", "TEXT", false, 0, null, 1));
        linkedHashMap.put("storeTimeZone", new da.k("storeTimeZone", "TEXT", false, 0, null, 1));
        linkedHashMap.put("quantity", new da.k("quantity", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("overallRating", new da.k("overallRating", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("orderId", new da.k("orderId", "TEXT", true, 1, null, 1));
        linkedHashMap.put("state", new da.k("state", "TEXT", true, 0, null, 1));
        linkedHashMap.put("storeBranch", new da.k("storeBranch", "TEXT", false, 0, null, 1));
        linkedHashMap.put("storeId", new da.k("storeId", "TEXT", true, 0, null, 1));
        linkedHashMap.put("storeName", new da.k("storeName", "TEXT", false, 0, null, 1));
        linkedHashMap.put("timeOfPurchase", new da.k("timeOfPurchase", "TEXT", true, 0, null, 1));
        linkedHashMap.put("isBuffet", new da.k("isBuffet", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("canShowBestBeforeExplainer", new da.k("canShowBestBeforeExplainer", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("orderType", new da.k("orderType", "TEXT", true, 0, null, 1));
        linkedHashMap.put("pickupWindowChanged", new da.k("pickupWindowChanged", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("paymentMethodDisplayName", new da.k("paymentMethodDisplayName", "TEXT", false, 0, null, 1));
        linkedHashMap.put("cancelledOrRefundedAtUtc", new da.k("cancelledOrRefundedAtUtc", "TEXT", false, 0, null, 1));
        linkedHashMap.put("redeemedAtUtc", new da.k("redeemedAtUtc", "TEXT", false, 0, null, 1));
        linkedHashMap.put("supportReqCreatedAtUtc", new da.k("supportReqCreatedAtUtc", "TEXT", false, 0, null, 1));
        linkedHashMap.put("expectedBankDays", new da.k("expectedBankDays", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("paymentState", new da.k("paymentState", "TEXT", false, 0, null, 1));
        linkedHashMap.put("cancellingEntity", new da.k("cancellingEntity", "TEXT", false, 0, null, 1));
        linkedHashMap.put("isSupportAvailable", new da.k("isSupportAvailable", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("isExcludedFromExpenseRating", new da.k("isExcludedFromExpenseRating", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("needsSync", new da.k("needsSync", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("hasCollectionTimeChanged", new da.k("hasCollectionTimeChanged", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("hasCollectionStateChanged", new da.k("hasCollectionStateChanged", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("calendarEventId", new da.k("calendarEventId", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("hasDynamicPrice", new da.k("hasDynamicPrice", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("invitationId", new da.k("invitationId", "TEXT", false, 0, null, 1));
        linkedHashMap.put("redeemingUserId", new da.k("redeemingUserId", "TEXT", false, 0, null, 1));
        linkedHashMap.put("isDonation", new da.k("isDonation", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("isEligibleForReward", new da.k("isEligibleForReward", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("hasMultiplePayments", new da.k("hasMultiplePayments", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("itemCategory", new da.k("itemCategory", "TEXT", false, 0, null, 1));
        linkedHashMap.put("isFavorite", new da.k("isFavorite", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("isMultiItem", new da.k("isMultiItem", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("isEdible", new da.k("isEdible", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("orderItems", new da.k("orderItems", "TEXT", false, 0, null, 1));
        linkedHashMap.put("specificationLines", new da.k("specificationLines", "TEXT", false, 0, null, 1));
        linkedHashMap.put("discountAppliedPercentage", new da.k("discountAppliedPercentage", "REAL", false, 0, null, 1));
        linkedHashMap.put("cover_currentUrl", new da.k("cover_currentUrl", "TEXT", false, 0, null, 1));
        linkedHashMap.put("cover_pictureId", new da.k("cover_pictureId", "TEXT", false, 0, null, 1));
        linkedHashMap.put("logo_currentUrl", new da.k("logo_currentUrl", "TEXT", false, 0, null, 1));
        linkedHashMap.put("logo_pictureId", new da.k("logo_pictureId", "TEXT", false, 0, null, 1));
        linkedHashMap.put("pickup_intervalStart", new da.k("pickup_intervalStart", "TEXT", false, 0, null, 1));
        linkedHashMap.put("pickup_intervalEnd", new da.k("pickup_intervalEnd", "TEXT", false, 0, null, 1));
        linkedHashMap.put("information", new da.k("information", "TEXT", false, 0, null, 1));
        linkedHashMap.put("streetAddress", new da.k("streetAddress", "TEXT", false, 0, null, 1));
        linkedHashMap.put("city", new da.k("city", "TEXT", false, 0, null, 1));
        linkedHashMap.put("county", new da.k("county", "TEXT", false, 0, null, 1));
        linkedHashMap.put("postalCode", new da.k("postalCode", "TEXT", false, 0, null, 1));
        linkedHashMap.put("stateOrProvince", new da.k("stateOrProvince", "TEXT", false, 0, null, 1));
        linkedHashMap.put("isoCode", new da.k("isoCode", "TEXT", false, 0, null, 1));
        linkedHashMap.put("countryName", new da.k("countryName", "TEXT", false, 0, null, 1));
        linkedHashMap.put("latitude", new da.k("latitude", "REAL", false, 0, null, 1));
        linkedHashMap.put("longitude", new da.k("longitude", "REAL", false, 0, null, 1));
        linkedHashMap.put("currency", new da.k("currency", "TEXT", false, 0, null, 1));
        linkedHashMap.put("decimals", new da.k("decimals", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("minorUnits", new da.k("minorUnits", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("total_price_currency", new da.k("total_price_currency", "TEXT", true, 0, null, 1));
        linkedHashMap.put("total_price_decimals", new da.k("total_price_decimals", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("total_price_minorUnits", new da.k("total_price_minorUnits", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("redeem_intervalStart", new da.k("redeem_intervalStart", "TEXT", false, 0, null, 1));
        linkedHashMap.put("redeem_intervalEnd", new da.k("redeem_intervalEnd", "TEXT", false, 0, null, 1));
        linkedHashMap.put("store_logo_currentUrl", new da.k("store_logo_currentUrl", "TEXT", false, 0, null, 1));
        linkedHashMap.put("store_logo_pictureId", new da.k("store_logo_pictureId", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_charityItemDescription", new da.k("additional_order_details_charityItemDescription", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_manifestUrl", new da.k("additional_order_details_manifestUrl", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_nameOfRedeemer", new da.k("additional_order_details_nameOfRedeemer", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_pickupDocumentHasBeenGenerated", new da.k("additional_order_details_pickupDocumentHasBeenGenerated", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_redeemedAt", new da.k("additional_order_details_redeemedAt", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_trackAndTraceUrls", new da.k("additional_order_details_trackAndTraceUrls", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_estimatedDelivery", new da.k("additional_order_details_estimatedDelivery", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_deliveryMethod", new da.k("additional_order_details_deliveryMethod", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_hasProducts", new da.k("additional_order_details_hasProducts", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_orderDeliveryMethod", new da.k("additional_order_details_orderDeliveryMethod", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_deliveryOptionTitle", new da.k("additional_order_details_deliveryOptionTitle", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_deliveryOptionAddress", new da.k("additional_order_details_deliveryOptionAddress", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details_expectedDeliveryUtc", new da.k("additional_order_details_expectedDeliveryUtc", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_name", new da.k("additional_order_details__user_address_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_email", new da.k("additional_order_details__user_address_email", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_phoneCountryCode", new da.k("additional_order_details__user_address_phoneCountryCode", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_phone", new da.k("additional_order_details__user_address_phone", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_address1", new da.k("additional_order_details__user_address_address1", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_address2", new da.k("additional_order_details__user_address_address2", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_city", new da.k("additional_order_details__user_address_city", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_state", new da.k("additional_order_details__user_address_state", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_postalCode", new da.k("additional_order_details__user_address_postalCode", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_country", new da.k("additional_order_details__user_address_country", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_streetName", new da.k("additional_order_details__user_address_streetName", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_houseNumber", new da.k("additional_order_details__user_address_houseNumber", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_houseNumberAddition", new da.k("additional_order_details__user_address_houseNumberAddition", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_userAddressType", new da.k("additional_order_details__user_address_userAddressType", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_userAddressId", new da.k("additional_order_details__user_address_userAddressId", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_deliveryAccessCode", new da.k("additional_order_details__user_address_deliveryAccessCode", "TEXT", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_noDeliveryAccessCode", new da.k("additional_order_details__user_address_noDeliveryAccessCode", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("additional_order_details__user_address_deliveryInstructions", new da.k("additional_order_details__user_address_deliveryInstructions", "TEXT", false, 0, null, 1));
        linkedHashMap.put("external_total_price_currency", new da.k("external_total_price_currency", "TEXT", false, 0, null, 1));
        linkedHashMap.put("external_total_price_decimals", new da.k("external_total_price_decimals", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("external_total_price_minorUnits", new da.k("external_total_price_minorUnits", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("voucher_total_price_currency", new da.k("voucher_total_price_currency", "TEXT", false, 0, null, 1));
        linkedHashMap.put("voucher_total_price_decimals", new da.k("voucher_total_price_decimals", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("voucher_total_price_minorUnits", new da.k("voucher_total_price_minorUnits", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("delivery_total_price_currency", new da.k("delivery_total_price_currency", "TEXT", false, 0, null, 1));
        linkedHashMap.put("delivery_total_price_decimals", new da.k("delivery_total_price_decimals", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("delivery_total_price_minorUnits", new da.k("delivery_total_price_minorUnits", "INTEGER", false, 0, null, 1));
        da.n nVar = new da.n("orders", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        da.n nVarM = u00.d.M(aVar, "orders");
        if (!nVar.equals(nVarM)) {
            return new nx.n(false, "orders(com.app.tgtg.model.remote.order.Order).\n Expected:\n" + nVar + "\n Found:\n" + nVarM);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("sessionId", new da.k("sessionId", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("timeStampUtc", new da.k("timeStampUtc", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("timeStampLocal", new da.k("timeStampLocal", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("itemId", new da.k("itemId", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("contextType", new da.k("contextType", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("itemStock", new da.k("itemStock", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("discoverBucketId", new da.k("discoverBucketId", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("itemPositionHorizontal", new da.k("itemPositionHorizontal", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("itemPositionVertical", new da.k("itemPositionVertical", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("coverPictureId", new da.k("coverPictureId", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("logoPictureId", new da.k("logoPictureId", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("deeplinkId", new da.k("deeplinkId", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("platform", new da.k("platform", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("version", new da.k("version", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("storeId", new da.k("storeId", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("itemType", new da.k("itemType", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("storeName", new da.k("storeName", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("id", new da.k("id", "INTEGER", true, 1, null, 1));
        da.n nVar2 = new da.n("impressions", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        da.n nVarM2 = u00.d.M(aVar, "impressions");
        if (!nVar2.equals(nVarM2)) {
            return new nx.n(false, "impressions(com.app.tgtg.services.analytics.Impression).\n Expected:\n" + nVar2 + "\n Found:\n" + nVarM2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new da.k("id", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("secret", new da.k("secret", "TEXT", true, 0, null, 1));
        da.n nVar3 = new da.n("biodata", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        da.n nVarM3 = u00.d.M(aVar, "biodata");
        if (!nVar3.equals(nVarM3)) {
            return new nx.n(false, "biodata(com.app.tgtg.model.local.BioData).\n Expected:\n" + nVar3 + "\n Found:\n" + nVarM3);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("userId", new da.k("userId", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("orderId", new da.k("orderId", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("orderState", new da.k("orderState", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("orderType", new da.k("orderType", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("lastUpdatedAtUtc", new da.k("lastUpdatedAtUtc", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("timeOfPurchase", new da.k("timeOfPurchase", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("invitationId", new da.k("invitationId", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("isMultiItem", new da.k("isMultiItem", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("changeState", new da.k("changeState", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("isRateable", new da.k("isRateable", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("overallRating", new da.k("overallRating", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("storeId", new da.k("storeId", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("storeDisplayName", new da.k("storeDisplayName", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("countryIsoCode", new da.k("countryIsoCode", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("storeLogoUrl", new da.k("storeLogoUrl", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("storeTimezone", new da.k("storeTimezone", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("itemId", new da.k("itemId", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("itemName", new da.k("itemName", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("itemLogoUrl", new da.k("itemLogoUrl", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("briefPaymentState", new da.k("briefPaymentState", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("cancellingUserType", new da.k("cancellingUserType", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("cancelledOrRefundedAtUtc", new da.k("cancelledOrRefundedAtUtc", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("expectedBankProcessingDays", new da.k("expectedBankProcessingDays", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("intervalStart", new da.k("intervalStart", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("intervalEnd", new da.k("intervalEnd", "TEXT", false, 0, null, 1));
        da.n nVar4 = new da.n("BriefOrder", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        da.n nVarM4 = u00.d.M(aVar, "BriefOrder");
        if (!nVar4.equals(nVarM4)) {
            return new nx.n(false, "BriefOrder(com.app.tgtg.model.remote.brief.BriefOrder).\n Expected:\n" + nVar4 + "\n Found:\n" + nVarM4);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("orderCreatedAt", new da.k("orderCreatedAt", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("orderId", new da.k("orderId", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("paymentId", new da.k("paymentId", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("itemId", new da.k("itemId", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("isMultiItem", new da.k("isMultiItem", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("returnUrl", new da.k("returnUrl", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("listOfPayments", new da.k("listOfPayments", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("providerType", new da.k("providerType", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("paymentProvider", new da.k("paymentProvider", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("paymentType", new da.k("paymentType", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("cardIdentifier", new da.k("cardIdentifier", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("displayValue", new da.k("displayValue", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("hasVouchersEnabled", new da.k("hasVouchersEnabled", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("adyenPayload", new da.k("adyenPayload", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("saveCard", new da.k("saveCard", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("cardStatus", new da.k("cardStatus", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("showZipcode", new da.k("showZipcode", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("isPreferred", new da.k("isPreferred", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("adyenEnvironment", new da.k("adyenEnvironment", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("recurringInfo_displayValue", new da.k("recurringInfo_displayValue", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("recurringInfo_recurringId", new da.k("recurringInfo_recurringId", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("recurringInfo_itemsLeft", new da.k("recurringInfo_itemsLeft", "INTEGER", false, 0, null, 1));
        linkedHashMap5.put("smallIcons", new da.k("smallIcons", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("largeIcons", new da.k("largeIcons", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("currency", new da.k("currency", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("decimals", new da.k("decimals", "INTEGER", false, 0, null, 1));
        linkedHashMap5.put("minorUnits", new da.k("minorUnits", "INTEGER", false, 0, null, 1));
        linkedHashMap5.put("basketBriefItems", new da.k("basketBriefItems", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("basketCountry", new da.k("basketCountry", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("basketId", new da.k("basketId", "TEXT", false, 0, null, 1));
        da.n nVar5 = new da.n("ResumePaymentData", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
        da.n nVarM5 = u00.d.M(aVar, "ResumePaymentData");
        if (!nVar5.equals(nVarM5)) {
            return new nx.n(false, "ResumePaymentData(com.app.tgtg.model.local.payment.ResumePaymentData).\n Expected:\n" + nVar5 + "\n Found:\n" + nVarM5);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new da.k("id", "INTEGER", true, 1, null, 1));
        linkedHashMap6.put("recipe_json", new da.k("recipe_json", "TEXT", true, 0, null, 1));
        linkedHashMap6.put("recipe_name", new da.k("recipe_name", "TEXT", true, 0, null, 1));
        linkedHashMap6.put("viewed_at", new da.k("viewed_at", "INTEGER", true, 0, null, 1));
        da.n nVar6 = new da.n("viewed_recipes", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
        da.n nVarM6 = u00.d.M(aVar, "viewed_recipes");
        if (nVar6.equals(nVarM6)) {
            return new nx.n(true, (String) null);
        }
        return new nx.n(false, "viewed_recipes(com.app.tgtg.model.local.ViewedRecipe).\n Expected:\n" + nVar6 + "\n Found:\n" + nVarM6);
    }

    @Override // l8.g
    public final void a(ha.a aVar) {
        int i11 = this.f17926d;
        aVar.getClass();
        switch (i11) {
            case 0:
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `orders` (`cancelUntil` TEXT, `confirmationEmail` TEXT, `foodHandlingInstruction` TEXT, `buffetHandlingInstruction` TEXT, `canUserSupplyPackaging` INTEGER NOT NULL, `packagingOption` TEXT NOT NULL, `isRated` INTEGER NOT NULL, `canBeRated` INTEGER NOT NULL, `itemCollectionInfo` TEXT, `itemId` TEXT, `itemName` TEXT, `storeTimeZone` TEXT, `quantity` INTEGER NOT NULL, `overallRating` INTEGER, `orderId` TEXT NOT NULL, `state` TEXT NOT NULL, `storeBranch` TEXT, `storeId` TEXT NOT NULL, `storeName` TEXT, `timeOfPurchase` TEXT NOT NULL, `isBuffet` INTEGER NOT NULL, `canShowBestBeforeExplainer` INTEGER NOT NULL, `orderType` TEXT NOT NULL, `pickupWindowChanged` INTEGER NOT NULL, `paymentMethodDisplayName` TEXT, `cancelledOrRefundedAtUtc` TEXT, `redeemedAtUtc` TEXT, `supportReqCreatedAtUtc` TEXT, `expectedBankDays` INTEGER NOT NULL, `paymentState` TEXT, `cancellingEntity` TEXT, `isSupportAvailable` INTEGER NOT NULL, `isExcludedFromExpenseRating` INTEGER NOT NULL, `needsSync` INTEGER, `hasCollectionTimeChanged` INTEGER NOT NULL, `hasCollectionStateChanged` INTEGER NOT NULL, `calendarEventId` INTEGER NOT NULL, `hasDynamicPrice` INTEGER, `invitationId` TEXT, `redeemingUserId` TEXT, `isDonation` INTEGER NOT NULL, `isEligibleForReward` INTEGER NOT NULL, `hasMultiplePayments` INTEGER NOT NULL, `itemCategory` TEXT, `isFavorite` INTEGER, `isMultiItem` INTEGER, `isEdible` INTEGER NOT NULL, `orderItems` TEXT, `specificationLines` TEXT, `discountAppliedPercentage` REAL, `cover_currentUrl` TEXT, `cover_pictureId` TEXT, `logo_currentUrl` TEXT, `logo_pictureId` TEXT, `pickup_intervalStart` TEXT, `pickup_intervalEnd` TEXT, `information` TEXT, `streetAddress` TEXT, `city` TEXT, `county` TEXT, `postalCode` TEXT, `stateOrProvince` TEXT, `isoCode` TEXT, `countryName` TEXT, `latitude` REAL, `longitude` REAL, `currency` TEXT, `decimals` INTEGER, `minorUnits` INTEGER, `total_price_currency` TEXT NOT NULL, `total_price_decimals` INTEGER NOT NULL, `total_price_minorUnits` INTEGER NOT NULL, `redeem_intervalStart` TEXT, `redeem_intervalEnd` TEXT, `store_logo_currentUrl` TEXT, `store_logo_pictureId` TEXT, `additional_order_details_charityItemDescription` TEXT, `additional_order_details_manifestUrl` TEXT, `additional_order_details_nameOfRedeemer` TEXT, `additional_order_details_pickupDocumentHasBeenGenerated` INTEGER, `additional_order_details_redeemedAt` TEXT, `additional_order_details_trackAndTraceUrls` TEXT, `additional_order_details_estimatedDelivery` TEXT, `additional_order_details_deliveryMethod` TEXT, `additional_order_details_hasProducts` INTEGER, `additional_order_details_orderDeliveryMethod` TEXT, `additional_order_details_deliveryOptionTitle` TEXT, `additional_order_details_deliveryOptionAddress` TEXT, `additional_order_details_expectedDeliveryUtc` TEXT, `additional_order_details__user_address_name` TEXT, `additional_order_details__user_address_email` TEXT, `additional_order_details__user_address_phoneCountryCode` TEXT, `additional_order_details__user_address_phone` TEXT, `additional_order_details__user_address_address1` TEXT, `additional_order_details__user_address_address2` TEXT, `additional_order_details__user_address_city` TEXT, `additional_order_details__user_address_state` TEXT, `additional_order_details__user_address_postalCode` TEXT, `additional_order_details__user_address_country` TEXT, `additional_order_details__user_address_streetName` TEXT, `additional_order_details__user_address_houseNumber` TEXT, `additional_order_details__user_address_houseNumberAddition` TEXT, `additional_order_details__user_address_userAddressType` TEXT, `additional_order_details__user_address_userAddressId` TEXT, `additional_order_details__user_address_deliveryAccessCode` TEXT, `additional_order_details__user_address_noDeliveryAccessCode` INTEGER, `additional_order_details__user_address_deliveryInstructions` TEXT, `external_total_price_currency` TEXT, `external_total_price_decimals` INTEGER, `external_total_price_minorUnits` INTEGER, `voucher_total_price_currency` TEXT, `voucher_total_price_decimals` INTEGER, `voucher_total_price_minorUnits` INTEGER, `delivery_total_price_currency` TEXT, `delivery_total_price_decimals` INTEGER, `delivery_total_price_minorUnits` INTEGER, PRIMARY KEY(`orderId`))");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `impressions` (`sessionId` TEXT NOT NULL, `timeStampUtc` TEXT NOT NULL, `timeStampLocal` TEXT NOT NULL, `itemId` TEXT NOT NULL, `contextType` TEXT NOT NULL, `itemStock` INTEGER NOT NULL, `discoverBucketId` TEXT, `itemPositionHorizontal` INTEGER, `itemPositionVertical` INTEGER, `coverPictureId` TEXT, `logoPictureId` TEXT, `deeplinkId` TEXT, `platform` TEXT, `version` TEXT, `storeId` TEXT, `itemType` TEXT, `storeName` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `biodata` (`id` TEXT NOT NULL, `secret` TEXT NOT NULL, PRIMARY KEY(`id`))");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `BriefOrder` (`userId` TEXT, `orderId` TEXT NOT NULL, `orderState` TEXT, `orderType` TEXT, `lastUpdatedAtUtc` TEXT, `timeOfPurchase` TEXT, `invitationId` TEXT, `isMultiItem` INTEGER, `changeState` TEXT NOT NULL, `isRateable` INTEGER, `overallRating` INTEGER, `storeId` TEXT, `storeDisplayName` TEXT, `countryIsoCode` TEXT, `storeLogoUrl` TEXT, `storeTimezone` TEXT, `itemId` TEXT, `itemName` TEXT, `itemLogoUrl` TEXT, `briefPaymentState` TEXT, `cancellingUserType` TEXT, `cancelledOrRefundedAtUtc` TEXT, `expectedBankProcessingDays` INTEGER, `intervalStart` TEXT, `intervalEnd` TEXT, PRIMARY KEY(`orderId`))");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `ResumePaymentData` (`orderCreatedAt` INTEGER NOT NULL, `orderId` TEXT NOT NULL, `paymentId` TEXT, `itemId` TEXT, `isMultiItem` INTEGER NOT NULL, `returnUrl` TEXT NOT NULL, `listOfPayments` TEXT NOT NULL, `providerType` TEXT, `paymentProvider` TEXT, `paymentType` TEXT, `cardIdentifier` TEXT, `displayValue` TEXT, `hasVouchersEnabled` INTEGER NOT NULL, `adyenPayload` TEXT, `saveCard` INTEGER NOT NULL, `cardStatus` TEXT NOT NULL, `showZipcode` INTEGER NOT NULL, `isPreferred` INTEGER NOT NULL, `adyenEnvironment` TEXT NOT NULL, `recurringInfo_displayValue` TEXT, `recurringInfo_recurringId` TEXT, `recurringInfo_itemsLeft` INTEGER, `smallIcons` TEXT, `largeIcons` TEXT, `currency` TEXT, `decimals` INTEGER, `minorUnits` INTEGER, `basketBriefItems` TEXT, `basketCountry` TEXT, `basketId` TEXT, PRIMARY KEY(`orderId`))");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `viewed_recipes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `recipe_json` TEXT NOT NULL, `recipe_name` TEXT NOT NULL, `viewed_at` INTEGER NOT NULL)");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                z20.b.m(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b871617329f961359dfc1213fcdd587a')");
                break;
            default:
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                z20.b.m(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                z20.b.m(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
        }
    }

    @Override // l8.g
    public final void b(ha.a aVar) {
        int i11 = this.f17926d;
        aVar.getClass();
        switch (i11) {
            case 0:
                z20.b.m(aVar, "DROP TABLE IF EXISTS `orders`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `impressions`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `biodata`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `BriefOrder`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `ResumePaymentData`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `viewed_recipes`");
                break;
            default:
                z20.b.m(aVar, "DROP TABLE IF EXISTS `Dependency`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `WorkSpec`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `WorkTag`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `WorkName`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `WorkProgress`");
                z20.b.m(aVar, "DROP TABLE IF EXISTS `Preference`");
                break;
        }
    }

    @Override // l8.g
    public final void c(ha.a aVar) {
        int i11 = this.f17926d;
        aVar.getClass();
    }

    @Override // l8.g
    public final void d(ha.a aVar) {
        int i11 = this.f17926d;
        aVar.getClass();
        switch (i11) {
            case 0:
                ((LocalDatabase_Impl) this.f17927e).n(aVar);
                break;
            default:
                z20.b.m(aVar, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f17927e).n(aVar);
                break;
        }
    }

    @Override // l8.g
    public final void e(ha.a aVar) {
        int i11 = this.f17926d;
        aVar.getClass();
    }

    @Override // l8.g
    public final void f(ha.a aVar) {
        int i11 = this.f17926d;
        aVar.getClass();
        switch (i11) {
            case 0:
                x0.p(aVar);
                break;
            default:
                x0.p(aVar);
                break;
        }
    }

    @Override // l8.g
    public final nx.n g(ha.a aVar) {
        switch (this.f17926d) {
            case 0:
                return h(aVar);
            default:
                aVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work_spec_id", new da.k("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap.put("prerequisite_id", new da.k("prerequisite_id", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new da.l("WorkSpec", "CASCADE", "CASCADE", c0.c("work_spec_id"), c0.c("id")));
                linkedHashSet.add(new da.l("WorkSpec", "CASCADE", "CASCADE", c0.c("prerequisite_id"), c0.c("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new da.m("index_Dependency_work_spec_id", false, c0.c("work_spec_id"), c0.c("ASC")));
                linkedHashSet2.add(new da.m("index_Dependency_prerequisite_id", false, c0.c("prerequisite_id"), c0.c("ASC")));
                da.n nVar = new da.n("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
                da.n nVarM = u00.d.M(aVar, "Dependency");
                if (!nVar.equals(nVarM)) {
                    return new nx.n(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + nVar + "\n Found:\n" + nVarM);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new da.k("id", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("state", new da.k("state", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("worker_class_name", new da.k("worker_class_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("input_merger_class_name", new da.k("input_merger_class_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("input", new da.k("input", "BLOB", true, 0, null, 1));
                linkedHashMap2.put("output", new da.k("output", "BLOB", true, 0, null, 1));
                linkedHashMap2.put("initial_delay", new da.k("initial_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("interval_duration", new da.k("interval_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("flex_duration", new da.k("flex_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("run_attempt_count", new da.k("run_attempt_count", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("backoff_policy", new da.k("backoff_policy", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("backoff_delay_duration", new da.k("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("last_enqueue_time", new da.k("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
                linkedHashMap2.put("minimum_retention_duration", new da.k("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("schedule_requested_at", new da.k("schedule_requested_at", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("run_in_foreground", new da.k("run_in_foreground", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("out_of_quota_policy", new da.k("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("period_count", new da.k("period_count", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("generation", new da.k("generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("next_schedule_time_override", new da.k("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
                linkedHashMap2.put("next_schedule_time_override_generation", new da.k("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("stop_reason", new da.k("stop_reason", "INTEGER", true, 0, "-256", 1));
                linkedHashMap2.put("trace_tag", new da.k("trace_tag", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("backoff_on_system_interruptions", new da.k("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("required_network_type", new da.k("required_network_type", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("required_network_request", new da.k("required_network_request", "BLOB", true, 0, "x''", 1));
                linkedHashMap2.put("requires_charging", new da.k("requires_charging", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_device_idle", new da.k("requires_device_idle", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_battery_not_low", new da.k("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_storage_not_low", new da.k("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("trigger_content_update_delay", new da.k("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("trigger_max_content_delay", new da.k("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("content_uri_triggers", new da.k("content_uri_triggers", "BLOB", true, 0, null, 1));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new da.m("index_WorkSpec_schedule_requested_at", false, c0.c("schedule_requested_at"), c0.c("ASC")));
                linkedHashSet4.add(new da.m("index_WorkSpec_last_enqueue_time", false, c0.c("last_enqueue_time"), c0.c("ASC")));
                da.n nVar2 = new da.n("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                da.n nVarM2 = u00.d.M(aVar, "WorkSpec");
                if (!nVar2.equals(nVarM2)) {
                    return new nx.n(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + nVar2 + "\n Found:\n" + nVarM2);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("tag", new da.k("tag", "TEXT", true, 1, null, 1));
                linkedHashMap3.put("work_spec_id", new da.k("work_spec_id", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new da.l("WorkSpec", "CASCADE", "CASCADE", c0.c("work_spec_id"), c0.c("id")));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new da.m("index_WorkTag_work_spec_id", false, c0.c("work_spec_id"), c0.c("ASC")));
                da.n nVar3 = new da.n("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
                da.n nVarM3 = u00.d.M(aVar, "WorkTag");
                if (!nVar3.equals(nVarM3)) {
                    return new nx.n(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + nVar3 + "\n Found:\n" + nVarM3);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new da.k("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap4.put("generation", new da.k("generation", "INTEGER", true, 2, "0", 1));
                linkedHashMap4.put("system_id", new da.k("system_id", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new da.l("WorkSpec", "CASCADE", "CASCADE", c0.c("work_spec_id"), c0.c("id")));
                da.n nVar4 = new da.n("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
                da.n nVarM4 = u00.d.M(aVar, "SystemIdInfo");
                if (!nVar4.equals(nVarM4)) {
                    return new nx.n(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + nVar4 + "\n Found:\n" + nVarM4);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("name", new da.k("name", "TEXT", true, 1, null, 1));
                linkedHashMap5.put("work_spec_id", new da.k("work_spec_id", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new da.l("WorkSpec", "CASCADE", "CASCADE", c0.c("work_spec_id"), c0.c("id")));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new da.m("index_WorkName_work_spec_id", false, c0.c("work_spec_id"), c0.c("ASC")));
                da.n nVar5 = new da.n("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
                da.n nVarM5 = u00.d.M(aVar, "WorkName");
                if (!nVar5.equals(nVarM5)) {
                    return new nx.n(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + nVar5 + "\n Found:\n" + nVarM5);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new da.k("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap6.put("progress", new da.k("progress", "BLOB", true, 0, null, 1));
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                linkedHashSet10.add(new da.l("WorkSpec", "CASCADE", "CASCADE", c0.c("work_spec_id"), c0.c("id")));
                da.n nVar6 = new da.n("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
                da.n nVarM6 = u00.d.M(aVar, "WorkProgress");
                if (!nVar6.equals(nVarM6)) {
                    return new nx.n(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + nVar6 + "\n Found:\n" + nVarM6);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("key", new da.k("key", "TEXT", true, 1, null, 1));
                linkedHashMap7.put("long_value", new da.k("long_value", "INTEGER", false, 0, null, 1));
                da.n nVar7 = new da.n("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                da.n nVarM7 = u00.d.M(aVar, "Preference");
                if (nVar7.equals(nVarM7)) {
                    return new nx.n(true, (String) null);
                }
                return new nx.n(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + nVar7 + "\n Found:\n" + nVarM7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.f17927e = workDatabase_Impl;
    }
}
