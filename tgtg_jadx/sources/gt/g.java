package gt;

import com.app.tgtg.model.remote.brief.BriefItemInfo;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.brief.BriefRatingInfo;
import com.app.tgtg.model.remote.brief.BriefRefundOrCancelInfo;
import com.app.tgtg.model.remote.brief.BriefStoreInfo;
import com.app.tgtg.model.remote.item.Address;
import com.app.tgtg.model.remote.item.DeliveryMethod;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.PickupCountry;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.order.AdditionalOrderInformation;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderItem;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.OrderType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.SpecificationLine;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends bx.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f20848i;

    public /* synthetic */ g(Object obj, int i11) {
        this.f20847h = i11;
        this.f20848i = obj;
    }

    @Override // bx.k
    public final void o(ha.c cVar, Object obj) {
        String strC;
        String strC2;
        switch (this.f20847h) {
            case 0:
                BriefOrder briefOrder = (BriefOrder) obj;
                j jVar = (j) this.f20848i;
                cVar.getClass();
                briefOrder.getClass();
                String strM322getUserId4FZwupo = briefOrder.m322getUserId4FZwupo();
                if (strM322getUserId4FZwupo == null) {
                    strM322getUserId4FZwupo = null;
                }
                if (strM322getUserId4FZwupo == null) {
                    cVar.m(1);
                } else {
                    cVar.C(1, strM322getUserId4FZwupo);
                }
                String strM321getOrderIdreIZeYA = briefOrder.m321getOrderIdreIZeYA();
                strM321getOrderIdreIZeYA.getClass();
                cVar.C(2, strM321getOrderIdreIZeYA);
                OrderState orderState = briefOrder.getOrderState();
                String strName = orderState == null ? null : orderState.name();
                if (strName == null) {
                    cVar.m(3);
                } else {
                    cVar.C(3, strName);
                }
                OrderType orderType = briefOrder.getOrderType();
                if (orderType == null) {
                    cVar.m(4);
                } else {
                    cVar.C(4, j.d(jVar, orderType));
                }
                String lastUpdatedAtUtc = briefOrder.getLastUpdatedAtUtc();
                if (lastUpdatedAtUtc == null) {
                    cVar.m(5);
                } else {
                    cVar.C(5, lastUpdatedAtUtc);
                }
                String timeOfPurchase = briefOrder.getTimeOfPurchase();
                if (timeOfPurchase == null) {
                    cVar.m(6);
                } else {
                    cVar.C(6, timeOfPurchase);
                }
                String invitationId = briefOrder.getInvitationId();
                if (invitationId == null) {
                    cVar.m(7);
                } else {
                    cVar.C(7, invitationId);
                }
                Boolean boolIsMultiItem = briefOrder.isMultiItem();
                if ((boolIsMultiItem != null ? Integer.valueOf(boolIsMultiItem.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.m(8);
                } else {
                    cVar.j(8, r4.intValue());
                }
                cVar.C(9, j.c(jVar, briefOrder.getChangeState()));
                BriefRatingInfo briefRatingInfo = briefOrder.getBriefRatingInfo();
                if (briefRatingInfo != null) {
                    Boolean boolIsRateable = briefRatingInfo.isRateable();
                    if ((boolIsRateable != null ? Integer.valueOf(boolIsRateable.booleanValue() ? 1 : 0) : null) == null) {
                        cVar.m(10);
                    } else {
                        cVar.j(10, r7.intValue());
                    }
                    if (briefRatingInfo.getOverallRating() == null) {
                        cVar.m(11);
                    } else {
                        cVar.j(11, r3.intValue());
                    }
                } else {
                    cVar.m(10);
                    cVar.m(11);
                }
                BriefStoreInfo briefStoreInfo = briefOrder.getBriefStoreInfo();
                if (briefStoreInfo != null) {
                    String strM328getStoreId7QsYvu8 = briefStoreInfo.m328getStoreId7QsYvu8();
                    if (strM328getStoreId7QsYvu8 == null) {
                        strM328getStoreId7QsYvu8 = null;
                    }
                    if (strM328getStoreId7QsYvu8 == null) {
                        cVar.m(12);
                    } else {
                        cVar.C(12, strM328getStoreId7QsYvu8);
                    }
                    String storeDisplayName = briefStoreInfo.getStoreDisplayName();
                    if (storeDisplayName == null) {
                        cVar.m(13);
                    } else {
                        cVar.C(13, storeDisplayName);
                    }
                    String countryIsoCode = briefStoreInfo.getCountryIsoCode();
                    if (countryIsoCode == null) {
                        cVar.m(14);
                    } else {
                        cVar.C(14, countryIsoCode);
                    }
                    String storeLogoUrl = briefStoreInfo.getStoreLogoUrl();
                    if (storeLogoUrl == null) {
                        cVar.m(15);
                    } else {
                        cVar.C(15, storeLogoUrl);
                    }
                    String storeTimezone = briefStoreInfo.getStoreTimezone();
                    if (storeTimezone == null) {
                        cVar.m(16);
                    } else {
                        cVar.C(16, storeTimezone);
                    }
                } else {
                    e0.f.A(cVar, 12, 13, 14, 15);
                    cVar.m(16);
                }
                BriefItemInfo briefItemInfo = briefOrder.getBriefItemInfo();
                if (briefItemInfo != null) {
                    String strM314getItemIdRWxzYZM = briefItemInfo.m314getItemIdRWxzYZM();
                    if (strM314getItemIdRWxzYZM == null) {
                        strM314getItemIdRWxzYZM = null;
                    }
                    if (strM314getItemIdRWxzYZM == null) {
                        cVar.m(17);
                    } else {
                        cVar.C(17, strM314getItemIdRWxzYZM);
                    }
                    String itemName = briefItemInfo.getItemName();
                    if (itemName == null) {
                        cVar.m(18);
                    } else {
                        cVar.C(18, itemName);
                    }
                    String itemLogoUrl = briefItemInfo.getItemLogoUrl();
                    if (itemLogoUrl == null) {
                        cVar.m(19);
                    } else {
                        cVar.C(19, itemLogoUrl);
                    }
                } else {
                    cVar.m(17);
                    cVar.m(18);
                    cVar.m(19);
                }
                BriefRefundOrCancelInfo briefRefundOrCancelInfo = briefOrder.getBriefRefundOrCancelInfo();
                if (briefRefundOrCancelInfo != null) {
                    PaymentState briefPaymentState = briefRefundOrCancelInfo.getBriefPaymentState();
                    String strName2 = briefPaymentState != null ? briefPaymentState.name() : null;
                    if (strName2 == null) {
                        cVar.m(20);
                    } else {
                        cVar.C(20, strName2);
                    }
                    CancellingEntity cancellingUserType = briefRefundOrCancelInfo.getCancellingUserType();
                    String strName3 = cancellingUserType != null ? cancellingUserType.name() : null;
                    if (strName3 == null) {
                        cVar.m(21);
                    } else {
                        cVar.C(21, strName3);
                    }
                    String cancelledOrRefundedAtUtc = briefRefundOrCancelInfo.getCancelledOrRefundedAtUtc();
                    if (cancelledOrRefundedAtUtc == null) {
                        cVar.m(22);
                    } else {
                        cVar.C(22, cancelledOrRefundedAtUtc);
                    }
                    if (briefRefundOrCancelInfo.getExpectedBankProcessingDays() == null) {
                        cVar.m(23);
                    } else {
                        cVar.j(23, r3.intValue());
                    }
                } else {
                    e0.f.A(cVar, 20, 21, 22, 23);
                }
                PickupInterval timeInterval = briefOrder.getTimeInterval();
                if (timeInterval == null) {
                    cVar.m(24);
                    cVar.m(25);
                } else {
                    String intervalStart = timeInterval.getIntervalStart();
                    if (intervalStart == null) {
                        cVar.m(24);
                    } else {
                        cVar.C(24, intervalStart);
                    }
                    String intervalEnd = timeInterval.getIntervalEnd();
                    if (intervalEnd != null) {
                        cVar.C(25, intervalEnd);
                    } else {
                        cVar.m(25);
                    }
                }
                break;
            case 1:
                BriefOrder briefOrder2 = (BriefOrder) obj;
                j jVar2 = (j) this.f20848i;
                cVar.getClass();
                briefOrder2.getClass();
                String strM322getUserId4FZwupo2 = briefOrder2.m322getUserId4FZwupo();
                if (strM322getUserId4FZwupo2 == null) {
                    strM322getUserId4FZwupo2 = null;
                }
                if (strM322getUserId4FZwupo2 == null) {
                    cVar.m(1);
                } else {
                    cVar.C(1, strM322getUserId4FZwupo2);
                }
                String strM321getOrderIdreIZeYA2 = briefOrder2.m321getOrderIdreIZeYA();
                strM321getOrderIdreIZeYA2.getClass();
                cVar.C(2, strM321getOrderIdreIZeYA2);
                OrderState orderState2 = briefOrder2.getOrderState();
                String strName4 = orderState2 == null ? null : orderState2.name();
                if (strName4 == null) {
                    cVar.m(3);
                } else {
                    cVar.C(3, strName4);
                }
                OrderType orderType2 = briefOrder2.getOrderType();
                if (orderType2 == null) {
                    cVar.m(4);
                } else {
                    cVar.C(4, j.d(jVar2, orderType2));
                }
                String lastUpdatedAtUtc2 = briefOrder2.getLastUpdatedAtUtc();
                if (lastUpdatedAtUtc2 == null) {
                    cVar.m(5);
                } else {
                    cVar.C(5, lastUpdatedAtUtc2);
                }
                String timeOfPurchase2 = briefOrder2.getTimeOfPurchase();
                if (timeOfPurchase2 == null) {
                    cVar.m(6);
                } else {
                    cVar.C(6, timeOfPurchase2);
                }
                String invitationId2 = briefOrder2.getInvitationId();
                if (invitationId2 == null) {
                    cVar.m(7);
                } else {
                    cVar.C(7, invitationId2);
                }
                Boolean boolIsMultiItem2 = briefOrder2.isMultiItem();
                if ((boolIsMultiItem2 != null ? Integer.valueOf(boolIsMultiItem2.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.m(8);
                } else {
                    cVar.j(8, r4.intValue());
                }
                cVar.C(9, j.c(jVar2, briefOrder2.getChangeState()));
                BriefRatingInfo briefRatingInfo2 = briefOrder2.getBriefRatingInfo();
                if (briefRatingInfo2 != null) {
                    Boolean boolIsRateable2 = briefRatingInfo2.isRateable();
                    if ((boolIsRateable2 != null ? Integer.valueOf(boolIsRateable2.booleanValue() ? 1 : 0) : null) == null) {
                        cVar.m(10);
                    } else {
                        cVar.j(10, r7.intValue());
                    }
                    if (briefRatingInfo2.getOverallRating() == null) {
                        cVar.m(11);
                    } else {
                        cVar.j(11, r3.intValue());
                    }
                } else {
                    cVar.m(10);
                    cVar.m(11);
                }
                BriefStoreInfo briefStoreInfo2 = briefOrder2.getBriefStoreInfo();
                if (briefStoreInfo2 != null) {
                    String strM328getStoreId7QsYvu82 = briefStoreInfo2.m328getStoreId7QsYvu8();
                    if (strM328getStoreId7QsYvu82 == null) {
                        strM328getStoreId7QsYvu82 = null;
                    }
                    if (strM328getStoreId7QsYvu82 == null) {
                        cVar.m(12);
                    } else {
                        cVar.C(12, strM328getStoreId7QsYvu82);
                    }
                    String storeDisplayName2 = briefStoreInfo2.getStoreDisplayName();
                    if (storeDisplayName2 == null) {
                        cVar.m(13);
                    } else {
                        cVar.C(13, storeDisplayName2);
                    }
                    String countryIsoCode2 = briefStoreInfo2.getCountryIsoCode();
                    if (countryIsoCode2 == null) {
                        cVar.m(14);
                    } else {
                        cVar.C(14, countryIsoCode2);
                    }
                    String storeLogoUrl2 = briefStoreInfo2.getStoreLogoUrl();
                    if (storeLogoUrl2 == null) {
                        cVar.m(15);
                    } else {
                        cVar.C(15, storeLogoUrl2);
                    }
                    String storeTimezone2 = briefStoreInfo2.getStoreTimezone();
                    if (storeTimezone2 == null) {
                        cVar.m(16);
                    } else {
                        cVar.C(16, storeTimezone2);
                    }
                } else {
                    e0.f.A(cVar, 12, 13, 14, 15);
                    cVar.m(16);
                }
                BriefItemInfo briefItemInfo2 = briefOrder2.getBriefItemInfo();
                if (briefItemInfo2 != null) {
                    String strM314getItemIdRWxzYZM2 = briefItemInfo2.m314getItemIdRWxzYZM();
                    if (strM314getItemIdRWxzYZM2 == null) {
                        strM314getItemIdRWxzYZM2 = null;
                    }
                    if (strM314getItemIdRWxzYZM2 == null) {
                        cVar.m(17);
                    } else {
                        cVar.C(17, strM314getItemIdRWxzYZM2);
                    }
                    String itemName2 = briefItemInfo2.getItemName();
                    if (itemName2 == null) {
                        cVar.m(18);
                    } else {
                        cVar.C(18, itemName2);
                    }
                    String itemLogoUrl2 = briefItemInfo2.getItemLogoUrl();
                    if (itemLogoUrl2 == null) {
                        cVar.m(19);
                    } else {
                        cVar.C(19, itemLogoUrl2);
                    }
                } else {
                    cVar.m(17);
                    cVar.m(18);
                    cVar.m(19);
                }
                BriefRefundOrCancelInfo briefRefundOrCancelInfo2 = briefOrder2.getBriefRefundOrCancelInfo();
                if (briefRefundOrCancelInfo2 != null) {
                    PaymentState briefPaymentState2 = briefRefundOrCancelInfo2.getBriefPaymentState();
                    String strName5 = briefPaymentState2 != null ? briefPaymentState2.name() : null;
                    if (strName5 == null) {
                        cVar.m(20);
                    } else {
                        cVar.C(20, strName5);
                    }
                    CancellingEntity cancellingUserType2 = briefRefundOrCancelInfo2.getCancellingUserType();
                    String strName6 = cancellingUserType2 != null ? cancellingUserType2.name() : null;
                    if (strName6 == null) {
                        cVar.m(21);
                    } else {
                        cVar.C(21, strName6);
                    }
                    String cancelledOrRefundedAtUtc2 = briefRefundOrCancelInfo2.getCancelledOrRefundedAtUtc();
                    if (cancelledOrRefundedAtUtc2 == null) {
                        cVar.m(22);
                    } else {
                        cVar.C(22, cancelledOrRefundedAtUtc2);
                    }
                    if (briefRefundOrCancelInfo2.getExpectedBankProcessingDays() == null) {
                        cVar.m(23);
                    } else {
                        cVar.j(23, r3.intValue());
                    }
                } else {
                    e0.f.A(cVar, 20, 21, 22, 23);
                }
                PickupInterval timeInterval2 = briefOrder2.getTimeInterval();
                if (timeInterval2 == null) {
                    cVar.m(24);
                    cVar.m(25);
                } else {
                    String intervalStart2 = timeInterval2.getIntervalStart();
                    if (intervalStart2 == null) {
                        cVar.m(24);
                    } else {
                        cVar.C(24, intervalStart2);
                    }
                    String intervalEnd2 = timeInterval2.getIntervalEnd();
                    if (intervalEnd2 != null) {
                        cVar.C(25, intervalEnd2);
                    } else {
                        cVar.m(25);
                    }
                }
                break;
            default:
                Order order = (Order) obj;
                w wVar = (w) this.f20848i;
                cVar.getClass();
                order.getClass();
                String cancelUntil = order.getCancelUntil();
                if (cancelUntil == null) {
                    cVar.m(1);
                } else {
                    cVar.C(1, cancelUntil);
                }
                String confirmationEmail = order.getConfirmationEmail();
                if (confirmationEmail == null) {
                    cVar.m(2);
                } else {
                    cVar.C(2, confirmationEmail);
                }
                String foodHandlingInstruction = order.getFoodHandlingInstruction();
                if (foodHandlingInstruction == null) {
                    cVar.m(3);
                } else {
                    cVar.C(3, foodHandlingInstruction);
                }
                String buffetHandlingInstruction = order.getBuffetHandlingInstruction();
                if (buffetHandlingInstruction == null) {
                    cVar.m(4);
                } else {
                    cVar.C(4, buffetHandlingInstruction);
                }
                cVar.j(5, order.getCanUserSupplyPackaging() ? 1L : 0L);
                PackagingOptions packagingOption = order.getPackagingOption();
                packagingOption.getClass();
                cVar.C(6, packagingOption.name());
                cVar.j(7, order.isRated() ? 1L : 0L);
                cVar.j(8, order.getCanBeRated() ? 1L : 0L);
                String itemCollectionInfo = order.getItemCollectionInfo();
                if (itemCollectionInfo == null) {
                    cVar.m(9);
                } else {
                    cVar.C(9, itemCollectionInfo);
                }
                String strM428getItemIdRWxzYZM = order.m428getItemIdRWxzYZM();
                if (strM428getItemIdRWxzYZM == null) {
                    strM428getItemIdRWxzYZM = null;
                }
                if (strM428getItemIdRWxzYZM == null) {
                    cVar.m(10);
                } else {
                    cVar.C(10, strM428getItemIdRWxzYZM);
                }
                String itemName3 = order.getItemName();
                if (itemName3 == null) {
                    cVar.m(11);
                } else {
                    cVar.C(11, itemName3);
                }
                String storeTimeZone = order.getStoreTimeZone();
                if (storeTimeZone == null) {
                    cVar.m(12);
                } else {
                    cVar.C(12, storeTimeZone);
                }
                cVar.j(13, order.getQuantity());
                if (order.getOverallRating() == null) {
                    cVar.m(14);
                } else {
                    cVar.j(14, r4.intValue());
                }
                String strM429getOrderIdreIZeYA = order.m429getOrderIdreIZeYA();
                strM429getOrderIdreIZeYA.getClass();
                cVar.C(15, strM429getOrderIdreIZeYA);
                OrderState state = order.getState();
                state.getClass();
                cVar.C(16, state.name());
                String storeBranch = order.getStoreBranch();
                if (storeBranch == null) {
                    cVar.m(17);
                } else {
                    cVar.C(17, storeBranch);
                }
                String strM431getStoreIdQ2NXY1A = order.m431getStoreIdQ2NXY1A();
                strM431getStoreIdQ2NXY1A.getClass();
                cVar.C(18, strM431getStoreIdQ2NXY1A);
                String storeName = order.getStoreName();
                if (storeName == null) {
                    cVar.m(19);
                } else {
                    cVar.C(19, storeName);
                }
                cVar.C(20, order.getTimeOfPurchase());
                cVar.j(21, order.isBuffet() ? 1L : 0L);
                cVar.j(22, order.getCanShowBestBeforeExplainer() ? 1L : 0L);
                cVar.C(23, w.i(wVar, order.getOrderType()));
                cVar.j(24, order.getPickupWindowChanged() ? 1L : 0L);
                String paymentMethodDisplayName = order.getPaymentMethodDisplayName();
                if (paymentMethodDisplayName == null) {
                    cVar.m(25);
                } else {
                    cVar.C(25, paymentMethodDisplayName);
                }
                String cancelledOrRefundedAtUtc3 = order.getCancelledOrRefundedAtUtc();
                if (cancelledOrRefundedAtUtc3 == null) {
                    cVar.m(26);
                } else {
                    cVar.C(26, cancelledOrRefundedAtUtc3);
                }
                String redeemedAtUtc = order.getRedeemedAtUtc();
                if (redeemedAtUtc == null) {
                    cVar.m(27);
                } else {
                    cVar.C(27, redeemedAtUtc);
                }
                String supportReqCreatedAtUtc = order.getSupportReqCreatedAtUtc();
                if (supportReqCreatedAtUtc == null) {
                    cVar.m(28);
                } else {
                    cVar.C(28, supportReqCreatedAtUtc);
                }
                cVar.j(29, order.getExpectedBankDays());
                PaymentState paymentState = order.getPaymentState();
                String strName7 = paymentState != null ? paymentState.name() : null;
                if (strName7 == null) {
                    cVar.m(30);
                } else {
                    cVar.C(30, strName7);
                }
                CancellingEntity cancellingEntity = order.getCancellingEntity();
                String strName8 = cancellingEntity != null ? cancellingEntity.name() : null;
                if (strName8 == null) {
                    cVar.m(31);
                } else {
                    cVar.C(31, strName8);
                }
                cVar.j(32, order.isSupportAvailable() ? 1L : 0L);
                cVar.j(33, order.isExcludedFromExpenseRating() ? 1L : 0L);
                Boolean needsSync = order.getNeedsSync();
                if ((needsSync != null ? Integer.valueOf(needsSync.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.m(34);
                } else {
                    cVar.j(34, r4.intValue());
                }
                cVar.j(35, order.getHasCollectionTimeChanged() ? 1L : 0L);
                cVar.j(36, order.getHasCollectionStateChanged() ? 1L : 0L);
                cVar.j(37, order.getCalendarEventId());
                Boolean hasDynamicPrice = order.getHasDynamicPrice();
                if ((hasDynamicPrice != null ? Integer.valueOf(hasDynamicPrice.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.m(38);
                } else {
                    cVar.j(38, r4.intValue());
                }
                String invitationId3 = order.getInvitationId();
                if (invitationId3 == null) {
                    cVar.m(39);
                } else {
                    cVar.C(39, invitationId3);
                }
                String strM430getRedeemingUserId4FZwupo = order.m430getRedeemingUserId4FZwupo();
                if (strM430getRedeemingUserId4FZwupo == null) {
                    strM430getRedeemingUserId4FZwupo = null;
                }
                if (strM430getRedeemingUserId4FZwupo == null) {
                    cVar.m(40);
                } else {
                    cVar.C(40, strM430getRedeemingUserId4FZwupo);
                }
                cVar.j(41, order.isDonation() ? 1L : 0L);
                cVar.j(42, order.isEligibleForReward() ? 1L : 0L);
                cVar.j(43, order.getHasMultiplePayments() ? 1L : 0L);
                ItemCategory itemCategory = order.getItemCategory();
                if (itemCategory == null) {
                    cVar.m(44);
                } else {
                    cVar.C(44, w.h(wVar, itemCategory));
                }
                Boolean boolIsFavorite = order.isFavorite();
                if ((boolIsFavorite != null ? Integer.valueOf(boolIsFavorite.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.m(45);
                } else {
                    cVar.j(45, r4.intValue());
                }
                Boolean boolIsMultiItem3 = order.isMultiItem();
                if ((boolIsMultiItem3 != null ? Integer.valueOf(boolIsMultiItem3.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.m(46);
                } else {
                    cVar.j(46, r4.intValue());
                }
                cVar.j(47, order.isEdible() ? 1L : 0L);
                List<OrderItem> orderItems = order.getOrderItems();
                if (orderItems == null) {
                    strC = null;
                } else {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    strC = bVar.c(new m90.d(OrderItem.INSTANCE.serializer(), 0), orderItems);
                }
                if (strC == null) {
                    cVar.m(48);
                } else {
                    cVar.C(48, strC);
                }
                List<SpecificationLine> specificationLines = order.getSpecificationLines();
                if (specificationLines != null) {
                    n90.b bVar2 = n90.c.f30748d;
                    bVar2.getClass();
                    strC2 = bVar2.c(new m90.d(SpecificationLine.INSTANCE.serializer(), 0), specificationLines);
                } else {
                    strC2 = null;
                }
                if (strC2 == null) {
                    cVar.m(49);
                } else {
                    cVar.C(49, strC2);
                }
                Double discountAppliedPercentage = order.getDiscountAppliedPercentage();
                if (discountAppliedPercentage == null) {
                    cVar.m(50);
                } else {
                    cVar.f(50, discountAppliedPercentage.doubleValue());
                }
                Picture itemCoverImage = order.getItemCoverImage();
                if (itemCoverImage != null) {
                    String currentUrl = itemCoverImage.getCurrentUrl();
                    if (currentUrl == null) {
                        cVar.m(51);
                    } else {
                        cVar.C(51, currentUrl);
                    }
                    String pictureId = itemCoverImage.getPictureId();
                    if (pictureId == null) {
                        cVar.m(52);
                    } else {
                        cVar.C(52, pictureId);
                    }
                } else {
                    cVar.m(51);
                    cVar.m(52);
                }
                Picture itemLogo = order.getItemLogo();
                if (itemLogo != null) {
                    String currentUrl2 = itemLogo.getCurrentUrl();
                    if (currentUrl2 == null) {
                        cVar.m(53);
                    } else {
                        cVar.C(53, currentUrl2);
                    }
                    String pictureId2 = itemLogo.getPictureId();
                    if (pictureId2 == null) {
                        cVar.m(54);
                    } else {
                        cVar.C(54, pictureId2);
                    }
                } else {
                    cVar.m(53);
                    cVar.m(54);
                }
                PickupInterval pickupInterval = order.getPickupInterval();
                if (pickupInterval != null) {
                    String intervalStart3 = pickupInterval.getIntervalStart();
                    if (intervalStart3 == null) {
                        cVar.m(55);
                    } else {
                        cVar.C(55, intervalStart3);
                    }
                    String intervalEnd3 = pickupInterval.getIntervalEnd();
                    if (intervalEnd3 == null) {
                        cVar.m(56);
                    } else {
                        cVar.C(56, intervalEnd3);
                    }
                } else {
                    cVar.m(55);
                    cVar.m(56);
                }
                StoreLocation pickupLocation = order.getPickupLocation();
                if (pickupLocation != null) {
                    String information = pickupLocation.getInformation();
                    if (information == null) {
                        cVar.m(57);
                    } else {
                        cVar.C(57, information);
                    }
                    Address address = pickupLocation.getAddress();
                    String streetAddress = address.getStreetAddress();
                    if (streetAddress == null) {
                        cVar.m(58);
                    } else {
                        cVar.C(58, streetAddress);
                    }
                    String city = address.getCity();
                    if (city == null) {
                        cVar.m(59);
                    } else {
                        cVar.C(59, city);
                    }
                    String county = address.getCounty();
                    if (county == null) {
                        cVar.m(60);
                    } else {
                        cVar.C(60, county);
                    }
                    String postalCode = address.getPostalCode();
                    if (postalCode == null) {
                        cVar.m(61);
                    } else {
                        cVar.C(61, postalCode);
                    }
                    String stateOrProvince = address.getStateOrProvince();
                    if (stateOrProvince == null) {
                        cVar.m(62);
                    } else {
                        cVar.C(62, stateOrProvince);
                    }
                    PickupCountry pickupCountry_ = address.getPickupCountry_();
                    if (pickupCountry_ != null) {
                        String isoCode = pickupCountry_.getIsoCode();
                        if (isoCode == null) {
                            cVar.m(63);
                        } else {
                            cVar.C(63, isoCode);
                        }
                        String countryName = pickupCountry_.getCountryName();
                        if (countryName == null) {
                            cVar.m(64);
                        } else {
                            cVar.C(64, countryName);
                        }
                    } else {
                        cVar.m(63);
                        cVar.m(64);
                    }
                    LatLngInfo latLngInfo = pickupLocation.getLatLngInfo();
                    if (latLngInfo != null) {
                        cVar.f(65, latLngInfo.getLatitude());
                        cVar.f(66, latLngInfo.getLongitude());
                    } else {
                        cVar.m(65);
                        cVar.m(66);
                    }
                } else {
                    e0.f.A(cVar, 57, 58, 59, 60);
                    e0.f.A(cVar, 61, 62, 63, 64);
                    cVar.m(65);
                    cVar.m(66);
                }
                Price price = order.getPrice();
                if (price != null) {
                    cVar.C(67, price.getCurrency());
                    cVar.j(68, price.getDecimals());
                    cVar.j(69, price.getMinorUnits());
                } else {
                    cVar.m(67);
                    cVar.m(68);
                    cVar.m(69);
                }
                cVar.C(70, order.getTotalPrice().getCurrency());
                cVar.j(71, r4.getDecimals());
                cVar.j(72, r4.getMinorUnits());
                PickupInterval redeemInterval = order.getRedeemInterval();
                if (redeemInterval != null) {
                    String intervalStart4 = redeemInterval.getIntervalStart();
                    if (intervalStart4 == null) {
                        cVar.m(73);
                    } else {
                        cVar.C(73, intervalStart4);
                    }
                    String intervalEnd4 = redeemInterval.getIntervalEnd();
                    if (intervalEnd4 == null) {
                        cVar.m(74);
                    } else {
                        cVar.C(74, intervalEnd4);
                    }
                } else {
                    cVar.m(73);
                    cVar.m(74);
                }
                Picture storeLogo = order.getStoreLogo();
                if (storeLogo != null) {
                    String currentUrl3 = storeLogo.getCurrentUrl();
                    if (currentUrl3 == null) {
                        cVar.m(75);
                    } else {
                        cVar.C(75, currentUrl3);
                    }
                    String pictureId3 = storeLogo.getPictureId();
                    if (pictureId3 == null) {
                        cVar.m(76);
                    } else {
                        cVar.C(76, pictureId3);
                    }
                } else {
                    cVar.m(75);
                    cVar.m(76);
                }
                AdditionalOrderInformation additionalOrderInformation = order.getAdditionalOrderInformation();
                if (additionalOrderInformation != null) {
                    String charityItemDescription = additionalOrderInformation.getCharityItemDescription();
                    if (charityItemDescription == null) {
                        cVar.m(77);
                    } else {
                        cVar.C(77, charityItemDescription);
                    }
                    String manifestUrl = additionalOrderInformation.getManifestUrl();
                    if (manifestUrl == null) {
                        cVar.m(78);
                    } else {
                        cVar.C(78, manifestUrl);
                    }
                    String nameOfRedeemer = additionalOrderInformation.getNameOfRedeemer();
                    if (nameOfRedeemer == null) {
                        cVar.m(79);
                    } else {
                        cVar.C(79, nameOfRedeemer);
                    }
                    Boolean pickupDocumentHasBeenGenerated = additionalOrderInformation.getPickupDocumentHasBeenGenerated();
                    if ((pickupDocumentHasBeenGenerated != null ? Integer.valueOf(pickupDocumentHasBeenGenerated.booleanValue() ? 1 : 0) : null) == null) {
                        cVar.m(80);
                    } else {
                        cVar.j(80, r5.intValue());
                    }
                    String redeemedAt = additionalOrderInformation.getRedeemedAt();
                    if (redeemedAt == null) {
                        cVar.m(81);
                    } else {
                        cVar.C(81, redeemedAt);
                    }
                    String strP = l50.a.p(additionalOrderInformation.getTrackAndTraceUrls());
                    if (strP == null) {
                        cVar.m(82);
                    } else {
                        cVar.C(82, strP);
                    }
                    String estimatedDelivery = additionalOrderInformation.getEstimatedDelivery();
                    if (estimatedDelivery == null) {
                        cVar.m(83);
                    } else {
                        cVar.C(83, estimatedDelivery);
                    }
                    DeliveryMethod deliveryMethod = additionalOrderInformation.getDeliveryMethod();
                    if (deliveryMethod == null) {
                        cVar.m(84);
                    } else {
                        cVar.C(84, w.f(wVar, deliveryMethod));
                    }
                    cVar.j(85, additionalOrderInformation.getHasProducts() ? 1L : 0L);
                    DeliveryOptionMethod orderDeliveryMethod = additionalOrderInformation.getOrderDeliveryMethod();
                    if (orderDeliveryMethod == null) {
                        cVar.m(86);
                    } else {
                        cVar.C(86, w.g(wVar, orderDeliveryMethod));
                    }
                    String deliveryOptionTitle = additionalOrderInformation.getDeliveryOptionTitle();
                    if (deliveryOptionTitle == null) {
                        cVar.m(87);
                    } else {
                        cVar.C(87, deliveryOptionTitle);
                    }
                    String deliveryOptionAddress = additionalOrderInformation.getDeliveryOptionAddress();
                    if (deliveryOptionAddress == null) {
                        cVar.m(88);
                    } else {
                        cVar.C(88, deliveryOptionAddress);
                    }
                    String expectedDeliveryUtc = additionalOrderInformation.getExpectedDeliveryUtc();
                    if (expectedDeliveryUtc == null) {
                        cVar.m(89);
                    } else {
                        cVar.C(89, expectedDeliveryUtc);
                    }
                    UserAddress userAddress = additionalOrderInformation.getUserAddress();
                    if (userAddress != null) {
                        String name = userAddress.getName();
                        if (name == null) {
                            cVar.m(90);
                        } else {
                            cVar.C(90, name);
                        }
                        String email = userAddress.getEmail();
                        if (email == null) {
                            cVar.m(91);
                        } else {
                            cVar.C(91, email);
                        }
                        String phoneCountryCode = userAddress.getPhoneCountryCode();
                        if (phoneCountryCode == null) {
                            cVar.m(92);
                        } else {
                            cVar.C(92, phoneCountryCode);
                        }
                        String phone = userAddress.getPhone();
                        if (phone == null) {
                            cVar.m(93);
                        } else {
                            cVar.C(93, phone);
                        }
                        String address1 = userAddress.getAddress1();
                        if (address1 == null) {
                            cVar.m(94);
                        } else {
                            cVar.C(94, address1);
                        }
                        String address2 = userAddress.getAddress2();
                        if (address2 == null) {
                            cVar.m(95);
                        } else {
                            cVar.C(95, address2);
                        }
                        String city2 = userAddress.getCity();
                        if (city2 == null) {
                            cVar.m(96);
                        } else {
                            cVar.C(96, city2);
                        }
                        String state2 = userAddress.getState();
                        if (state2 == null) {
                            cVar.m(97);
                        } else {
                            cVar.C(97, state2);
                        }
                        String postalCode2 = userAddress.getPostalCode();
                        if (postalCode2 == null) {
                            cVar.m(98);
                        } else {
                            cVar.C(98, postalCode2);
                        }
                        String country = userAddress.getCountry();
                        if (country == null) {
                            cVar.m(99);
                        } else {
                            cVar.C(99, country);
                        }
                        String streetName = userAddress.getStreetName();
                        if (streetName == null) {
                            cVar.m(100);
                        } else {
                            cVar.C(100, streetName);
                        }
                        String houseNumber = userAddress.getHouseNumber();
                        if (houseNumber == null) {
                            cVar.m(101);
                        } else {
                            cVar.C(101, houseNumber);
                        }
                        String houseNumberAddition = userAddress.getHouseNumberAddition();
                        if (houseNumberAddition == null) {
                            cVar.m(102);
                        } else {
                            cVar.C(102, houseNumberAddition);
                        }
                        nr.a userAddressType = userAddress.getUserAddressType();
                        if (userAddressType == null) {
                            cVar.m(103);
                        } else {
                            cVar.C(103, w.j(wVar, userAddressType));
                        }
                        String userAddressId = userAddress.getUserAddressId();
                        if (userAddressId == null) {
                            cVar.m(104);
                        } else {
                            cVar.C(104, userAddressId);
                        }
                        String deliveryAccessCode = userAddress.getDeliveryAccessCode();
                        if (deliveryAccessCode == null) {
                            cVar.m(105);
                        } else {
                            cVar.C(105, deliveryAccessCode);
                        }
                        cVar.j(106, userAddress.getNoDeliveryAccessCode() ? 1L : 0L);
                        String deliveryInstructions = userAddress.getDeliveryInstructions();
                        if (deliveryInstructions == null) {
                            cVar.m(107);
                        } else {
                            cVar.C(107, deliveryInstructions);
                        }
                    } else {
                        e0.f.A(cVar, 90, 91, 92, 93);
                        e0.f.A(cVar, 94, 95, 96, 97);
                        e0.f.A(cVar, 98, 99, 100, 101);
                        e0.f.A(cVar, 102, 103, 104, 105);
                        cVar.m(106);
                        cVar.m(107);
                    }
                } else {
                    e0.f.A(cVar, 77, 78, 79, 80);
                    e0.f.A(cVar, 81, 82, 83, 84);
                    e0.f.A(cVar, 85, 86, 87, 88);
                    e0.f.A(cVar, 89, 90, 91, 92);
                    e0.f.A(cVar, 93, 94, 95, 96);
                    e0.f.A(cVar, 97, 98, 99, 100);
                    e0.f.A(cVar, 101, 102, 103, 104);
                    cVar.m(105);
                    cVar.m(106);
                    cVar.m(107);
                }
                Price totalPricePaidWithExternalProvider = order.getTotalPricePaidWithExternalProvider();
                if (totalPricePaidWithExternalProvider != null) {
                    cVar.C(108, totalPricePaidWithExternalProvider.getCurrency());
                    cVar.j(109, totalPricePaidWithExternalProvider.getDecimals());
                    cVar.j(110, totalPricePaidWithExternalProvider.getMinorUnits());
                } else {
                    cVar.m(108);
                    cVar.m(109);
                    cVar.m(110);
                }
                Price totalPricePaidWithVoucher = order.getTotalPricePaidWithVoucher();
                if (totalPricePaidWithVoucher != null) {
                    cVar.C(111, totalPricePaidWithVoucher.getCurrency());
                    cVar.j(112, totalPricePaidWithVoucher.getDecimals());
                    cVar.j(113, totalPricePaidWithVoucher.getMinorUnits());
                } else {
                    cVar.m(111);
                    cVar.m(112);
                    cVar.m(113);
                }
                Price totalPricePaidForDelivery = order.getTotalPricePaidForDelivery();
                if (totalPricePaidForDelivery == null) {
                    cVar.m(114);
                    cVar.m(115);
                    cVar.m(116);
                } else {
                    cVar.C(114, totalPricePaidForDelivery.getCurrency());
                    cVar.j(115, totalPricePaidForDelivery.getDecimals());
                    cVar.j(116, totalPricePaidForDelivery.getMinorUnits());
                }
                break;
        }
    }

    @Override // bx.k
    public final String s() {
        switch (this.f20847h) {
            case 0:
                return "INSERT OR REPLACE INTO `BriefOrder` (`userId`,`orderId`,`orderState`,`orderType`,`lastUpdatedAtUtc`,`timeOfPurchase`,`invitationId`,`isMultiItem`,`changeState`,`isRateable`,`overallRating`,`storeId`,`storeDisplayName`,`countryIsoCode`,`storeLogoUrl`,`storeTimezone`,`itemId`,`itemName`,`itemLogoUrl`,`briefPaymentState`,`cancellingUserType`,`cancelledOrRefundedAtUtc`,`expectedBankProcessingDays`,`intervalStart`,`intervalEnd`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `BriefOrder` (`userId`,`orderId`,`orderState`,`orderType`,`lastUpdatedAtUtc`,`timeOfPurchase`,`invitationId`,`isMultiItem`,`changeState`,`isRateable`,`overallRating`,`storeId`,`storeDisplayName`,`countryIsoCode`,`storeLogoUrl`,`storeTimezone`,`itemId`,`itemName`,`itemLogoUrl`,`briefPaymentState`,`cancellingUserType`,`cancelledOrRefundedAtUtc`,`expectedBankProcessingDays`,`intervalStart`,`intervalEnd`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `orders` (`cancelUntil`,`confirmationEmail`,`foodHandlingInstruction`,`buffetHandlingInstruction`,`canUserSupplyPackaging`,`packagingOption`,`isRated`,`canBeRated`,`itemCollectionInfo`,`itemId`,`itemName`,`storeTimeZone`,`quantity`,`overallRating`,`orderId`,`state`,`storeBranch`,`storeId`,`storeName`,`timeOfPurchase`,`isBuffet`,`canShowBestBeforeExplainer`,`orderType`,`pickupWindowChanged`,`paymentMethodDisplayName`,`cancelledOrRefundedAtUtc`,`redeemedAtUtc`,`supportReqCreatedAtUtc`,`expectedBankDays`,`paymentState`,`cancellingEntity`,`isSupportAvailable`,`isExcludedFromExpenseRating`,`needsSync`,`hasCollectionTimeChanged`,`hasCollectionStateChanged`,`calendarEventId`,`hasDynamicPrice`,`invitationId`,`redeemingUserId`,`isDonation`,`isEligibleForReward`,`hasMultiplePayments`,`itemCategory`,`isFavorite`,`isMultiItem`,`isEdible`,`orderItems`,`specificationLines`,`discountAppliedPercentage`,`cover_currentUrl`,`cover_pictureId`,`logo_currentUrl`,`logo_pictureId`,`pickup_intervalStart`,`pickup_intervalEnd`,`information`,`streetAddress`,`city`,`county`,`postalCode`,`stateOrProvince`,`isoCode`,`countryName`,`latitude`,`longitude`,`currency`,`decimals`,`minorUnits`,`total_price_currency`,`total_price_decimals`,`total_price_minorUnits`,`redeem_intervalStart`,`redeem_intervalEnd`,`store_logo_currentUrl`,`store_logo_pictureId`,`additional_order_details_charityItemDescription`,`additional_order_details_manifestUrl`,`additional_order_details_nameOfRedeemer`,`additional_order_details_pickupDocumentHasBeenGenerated`,`additional_order_details_redeemedAt`,`additional_order_details_trackAndTraceUrls`,`additional_order_details_estimatedDelivery`,`additional_order_details_deliveryMethod`,`additional_order_details_hasProducts`,`additional_order_details_orderDeliveryMethod`,`additional_order_details_deliveryOptionTitle`,`additional_order_details_deliveryOptionAddress`,`additional_order_details_expectedDeliveryUtc`,`additional_order_details__user_address_name`,`additional_order_details__user_address_email`,`additional_order_details__user_address_phoneCountryCode`,`additional_order_details__user_address_phone`,`additional_order_details__user_address_address1`,`additional_order_details__user_address_address2`,`additional_order_details__user_address_city`,`additional_order_details__user_address_state`,`additional_order_details__user_address_postalCode`,`additional_order_details__user_address_country`,`additional_order_details__user_address_streetName`,`additional_order_details__user_address_houseNumber`,`additional_order_details__user_address_houseNumberAddition`,`additional_order_details__user_address_userAddressType`,`additional_order_details__user_address_userAddressId`,`additional_order_details__user_address_deliveryAccessCode`,`additional_order_details__user_address_noDeliveryAccessCode`,`additional_order_details__user_address_deliveryInstructions`,`external_total_price_currency`,`external_total_price_decimals`,`external_total_price_minorUnits`,`voucher_total_price_currency`,`voucher_total_price_decimals`,`voucher_total_price_minorUnits`,`delivery_total_price_currency`,`delivery_total_price_decimals`,`delivery_total_price_minorUnits`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
