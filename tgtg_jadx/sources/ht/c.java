package ht;

import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends ba.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12, int i13) {
        super(i11, i12);
        this.f22513c = i13;
    }

    @Override // ba.a
    public final void b(ja.b bVar) {
        int i11 = this.f22513c;
        bVar.getClass();
        switch (i11) {
            case 0:
                bVar.r("ALTER TABLE orders ADD COLUMN external_total_price_currency TEXT");
                bVar.r("ALTER TABLE orders ADD COLUMN external_total_price_decimals INTEGER");
                bVar.r("ALTER TABLE orders ADD COLUMN external_total_price_minorUnits INTEGER");
                bVar.r("ALTER TABLE orders ADD COLUMN voucher_total_price_currency TEXT");
                bVar.r("ALTER TABLE orders ADD COLUMN voucher_total_price_decimals INTEGER");
                bVar.r("ALTER TABLE orders ADD COLUMN voucher_total_price_minorUnits INTEGER");
                bVar.r("ALTER TABLE orders ADD COLUMN hasMultiplePayments INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                if (!b.a(bVar, "additional_order_details_hasProducts")) {
                    bVar.r("ALTER TABLE orders ADD COLUMN additional_order_details_hasProducts INTEGER DEFAULT 0");
                    break;
                }
                break;
            case 2:
                bVar.r("ALTER TABLE orders ADD COLUMN itemCategory TEXT");
                break;
            case 3:
                bVar.r("ALTER TABLE orders ADD COLUMN additional_order_details_orderDeliveryMethod TEXT DEFAULT NULL");
                bVar.r("ALTER TABLE orders ADD COLUMN additional_order_details_deliveryOptionTitle TEXT DEFAULT NULL");
                bVar.r("ALTER TABLE orders ADD COLUMN additional_order_details_deliveryOptionAddress TEXT DEFAULT NULL");
                bVar.r("ALTER TABLE orders ADD COLUMN additional_order_details_expectedDeliveryUtc TEXT DEFAULT NULL");
                break;
            case 4:
                bVar.r("CREATE TABLE ResumePaymentData_new (\n    adyenPayload TEXT,\n    cardIdentifier TEXT,\n    cardStatus TEXT NOT NULL,\n    displayValue TEXT,\n    hasVouchersEnabled INTEGER NOT NULL,\n    isPreferred INTEGER NOT NULL,\n    itemId TEXT NOT NULL,\n    largeIcons TEXT,\n    listOfPayments TEXT NOT NULL,\n    orderCreatedAt INTEGER NOT NULL,\n    orderId TEXT NOT NULL,\n    paymentId TEXT,\n    paymentProvider TEXT,\n    paymentType TEXT,\n    providerType TEXT,\n    recurringInfo_displayValue TEXT,\n    recurringInfo_itemsLeft INTEGER,\n    recurringInfo_recurringId TEXT,\n    returnUrl TEXT NOT NULL,\n    saveCard INTEGER NOT NULL,\n    showZipcode INTEGER NOT NULL,\n    smallIcons TEXT,\n    PRIMARY KEY(orderId)\n)");
                bVar.r("INSERT INTO ResumePaymentData_new (\n    adyenPayload, cardIdentifier, cardStatus, displayValue, hasVouchersEnabled,\n    isPreferred, itemId, largeIcons, listOfPayments, orderCreatedAt,\n    orderId, paymentId, paymentProvider, paymentType, providerType,\n    recurringInfo_displayValue, recurringInfo_itemsLeft, recurringInfo_recurringId,\n    returnUrl, saveCard, showZipcode, smallIcons\n)\nSELECT\n    adyenPayload, cardIdentifier, cardStatus, displayValue, hasVouchersEnabled,\n    isPreferred, itemId, largeIcons, listOfPayments, orderCreatedAt,\n    orderId, paymentId, paymentProvider, paymentType, providerType,\n    recurringInfo_displayValue, recurringInfo_itemsLeft, recurringInfo_recurringId,\n    returnUrl, saveCard, showZipcode, smallIcons\nFROM ResumePaymentData");
                bVar.r("DROP TABLE ResumePaymentData");
                bVar.r("ALTER TABLE ResumePaymentData_new RENAME TO ResumePaymentData");
                break;
            case 5:
                bVar.r("ALTER TABLE orders ADD COLUMN isFavorite INTEGER DEFAULT NULL");
                break;
            case 6:
                bVar.r("ALTER TABLE `orders` ADD COLUMN `additional_order_details__user_address_deliveryAccessCode` TEXT DEFAULT NULL");
                bVar.r("ALTER TABLE `orders` ADD COLUMN `additional_order_details__user_address_noDeliveryAccessCode` INTEGER DEFAULT NULL");
                bVar.r("ALTER TABLE `orders` ADD COLUMN `additional_order_details__user_address_deliveryInstructions` TEXT DEFAULT NULL");
                break;
            case 7:
                bVar.r("ALTER TABLE orders ADD COLUMN isMultiItem INTEGER DEFAULT NULL");
                bVar.r("ALTER TABLE orders ADD COLUMN orderItems TEXT DEFAULT NULL");
                bVar.r("ALTER TABLE orders ADD COLUMN delivery_total_price_currency TEXT ");
                bVar.r("ALTER TABLE orders ADD COLUMN delivery_total_price_decimals INTEGER");
                bVar.r("ALTER TABLE orders ADD COLUMN delivery_total_price_minorUnits INTEGER");
                bVar.r("ALTER TABLE BriefOrder ADD COLUMN isMultiItem INTEGER DEFAULT NULL");
                bVar.r("CREATE TABLE ResumePaymentData_new (\n    adyenPayload TEXT,\n    cardIdentifier TEXT,\n    cardStatus TEXT NOT NULL,\n    displayValue TEXT,\n    hasVouchersEnabled INTEGER NOT NULL,\n    isPreferred INTEGER NOT NULL,\n    itemId TEXT,\n    largeIcons TEXT,\n    listOfPayments TEXT NOT NULL,\n    orderCreatedAt INTEGER NOT NULL,\n    orderId TEXT NOT NULL,\n    paymentId TEXT,\n    paymentProvider TEXT,\n    paymentType TEXT,\n    providerType TEXT,\n    recurringInfo_displayValue TEXT,\n    recurringInfo_itemsLeft INTEGER,\n    recurringInfo_recurringId TEXT,\n    returnUrl TEXT NOT NULL,\n    saveCard INTEGER NOT NULL,\n    showZipcode INTEGER NOT NULL,\n    smallIcons TEXT,\n    isMultiItem INTEGER NOT NULL DEFAULT 0,\n    basketBriefItems TEXT,\n    basketCountry TEXT,\n    PRIMARY KEY(orderId)\n)");
                bVar.r("INSERT INTO ResumePaymentData_new (\n    adyenPayload, cardIdentifier, cardStatus, displayValue, hasVouchersEnabled,\n    isPreferred, itemId, largeIcons, listOfPayments, orderCreatedAt,\n    orderId, paymentId, paymentProvider, paymentType, providerType,\n    recurringInfo_displayValue, recurringInfo_itemsLeft, recurringInfo_recurringId,\n    returnUrl, saveCard, showZipcode, smallIcons\n)\nSELECT\n    adyenPayload, cardIdentifier, cardStatus, displayValue, hasVouchersEnabled,\n    isPreferred, itemId, largeIcons, listOfPayments, orderCreatedAt,\n    orderId, paymentId, paymentProvider, paymentType, providerType,\n    recurringInfo_displayValue, recurringInfo_itemsLeft, recurringInfo_recurringId,\n    returnUrl, saveCard, showZipcode, smallIcons\nFROM ResumePaymentData");
                bVar.r("DROP TABLE ResumePaymentData");
                bVar.r("ALTER TABLE ResumePaymentData_new RENAME TO ResumePaymentData");
                break;
            case 8:
                bVar.r("ALTER TABLE ResumePaymentData ADD COLUMN basketId TEXT");
                break;
            case 9:
                bVar.r("CREATE TABLE IF NOT EXISTS viewed_recipes (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    recipe_json TEXT NOT NULL,\n    recipe_name TEXT NOT NULL,\n    viewed_at INTEGER NOT NULL\n)");
                break;
            case 10:
                bVar.r("ALTER TABLE ResumePaymentData ADD COLUMN adyenEnvironment TEXT NOT NULL DEFAULT 'europe'");
                break;
            case 11:
                bVar.r("ALTER TABLE orders ADD COLUMN isEdible INTEGER NOT NULL DEFAULT 1");
                break;
            case 12:
                bVar.r("ALTER TABLE orders ADD COLUMN specificationLines TEXT DEFAULT NULL");
                break;
            case 13:
                bVar.r("ALTER TABLE impressions ADD COLUMN storeId TEXT");
                break;
            case 14:
                bVar.r("ALTER TABLE orders ADD COLUMN discountAppliedPercentage DOUBLE");
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                bVar.r("ALTER TABLE ResumePaymentData ADD COLUMN currency TEXT");
                bVar.r("ALTER TABLE ResumePaymentData ADD COLUMN decimals INTEGER");
                bVar.r("ALTER TABLE ResumePaymentData ADD COLUMN minorUnits INTEGER");
                break;
            case 16:
                bVar.r("ALTER TABLE impressions ADD COLUMN itemType TEXT DEFAULT NULL");
                break;
            case 17:
                bVar.r("CREATE TABLE IF NOT EXISTS `ordersTemp` (`cancelUntil` TEXT, `confirmationEmail` TEXT, `foodHandlingInstruction` TEXT, `buffetHandlingInstruction` TEXT, `canUserSupplyPackaging` INTEGER NOT NULL, `isRated` INTEGER NOT NULL, `itemCollectionInfo` TEXT, `itemId` TEXT, `itemName` TEXT, `quantity` INTEGER, `receiptId` TEXT NOT NULL, `state` TEXT, `storeBranch` TEXT, `storeId` TEXT, `storeName` TEXT, `timeOfPurchase` TEXT, `needsSync` INTEGER, `hasCollectionTimeChanged` INTEGER NOT NULL, `hasCollectionStateChanged` INTEGER NOT NULL, `cover_currentUrl` TEXT, `cover_pictureId` TEXT, `logo_currentUrl` TEXT, `logo_pictureId` TEXT, `pickup_intervalStart` TEXT, `pickup_intervalEnd` TEXT, `information` TEXT, `streetAddress` TEXT, `city` TEXT, `county` TEXT, `postalCode` TEXT, `stateOrProvince` TEXT, `isoCode` TEXT, `countryName` TEXT, `latitude` REAL, `longitude` REAL, `currency` TEXT, `decimals` INTEGER, `minorUnits` INTEGER, `overallRating` INTEGER, `redeem_intervalStart` TEXT, `redeem_intervalEnd` TEXT, `store_logo_currentUrl` TEXT, `store_logo_pictureId` TEXT,`wouldBuyAgain` INTEGER, `isBuffet` INTEGER NOT NULL,  PRIMARY KEY(`receiptId`))");
                bVar.r("INSERT INTO ordersTemp (cancelUntil, confirmationEmail, foodHandlingInstruction, buffetHandlingInstruction, canUserSupplyPackaging, isRated, itemCollectionInfo, itemId, itemName, quantity, receiptId, state, storeBranch, storeId, storeName, timeOfPurchase, needsSync, hasCollectionTimeChanged, hasCollectionStateChanged, cover_currentUrl, cover_pictureId, logo_currentUrl, logo_pictureId, pickup_intervalStart, pickup_intervalEnd, information, streetAddress, city, county, postalCode, stateOrProvince, isoCode, countryName, latitude, longitude, currency, decimals, minorUnits, overallRating, redeem_intervalStart, redeem_intervalEnd, store_logo_currentUrl, store_logo_pictureId, wouldBuyAgain, isBuffet) SELECT cancelUntil, confirmationEmail, foodHandlingInstruction, buffetHandlingInstruction, canUserSupplyPackaging, isRated, itemCollectionInfo, itemId, itemName, quantity, receiptId, state, storeBranch, storeId, storeName, timeOfPurchase, needsSync, hasCollectionTimeChanged, hasCollectionStateChanged, cover_currentUrl, cover_pictureId, logo_currentUrl, logo_pictureId, pickup_intervalStart, pickup_intervalEnd, information, streetAddress, city, county, postalCode, stateOrProvince, isoCode, countryName, latitude, longitude, currency, decimals, minorUnits, overall, redeem_intervalStart, redeem_intervalEnd, store_logo_currentUrl, store_logo_pictureId, null, '0' FROM orders ");
                bVar.r("DROP TABLE orders");
                bVar.r("ALTER TABLE ordersTemp RENAME TO orders");
                break;
            case 18:
                bVar.r("ALTER TABLE orders ADD COLUMN packagingOption TEXT DEFAULT 'UNKNOWN' NOT NULL");
                break;
            default:
                bVar.r("ALTER TABLE impressions ADD COLUMN deeplinkId TEXT");
                break;
        }
    }
}
