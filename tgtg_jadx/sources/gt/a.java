package gt;

import com.adyen.checkout.core.Environment;
import com.app.tgtg.model.local.BioData;
import com.app.tgtg.model.local.ViewedRecipe;
import com.app.tgtg.model.local.payment.ResumePaymentData;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.app.tgtg.model.remote.order.Payments;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.payment.Icon;
import com.app.tgtg.model.remote.payment.PaymentIcons;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.RecurringPaymentInformation;
import ib.d0;
import java.util.List;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends bx.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20829h;

    public /* synthetic */ a(int i11) {
        this.f20829h = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // bx.k
    public final void o(ha.c cVar, Object obj) {
        String str;
        String str2;
        String strC;
        String strC2;
        int i11;
        int i12;
        switch (this.f20829h) {
            case 0:
                BioData bioData = (BioData) obj;
                cVar.getClass();
                bioData.getClass();
                cVar.C(1, bioData.getId());
                cVar.C(2, bioData.getSecret());
                break;
            case 1:
                cv.e eVar = (cv.e) obj;
                cVar.getClass();
                eVar.getClass();
                cVar.C(1, eVar.f13436a);
                cVar.C(2, eVar.f13437b);
                cVar.C(3, eVar.f13438c);
                String str3 = eVar.f13439d;
                str3.getClass();
                cVar.C(4, str3);
                cv.g gVar = eVar.f13440e;
                String string = gVar != null ? gVar.toString() : null;
                if (string == null) {
                    cVar.m(5);
                } else {
                    cVar.C(5, string);
                }
                cVar.j(6, eVar.f13441f);
                String str4 = eVar.f13442g;
                if (str4 == null) {
                    cVar.m(7);
                } else {
                    cVar.C(7, str4);
                }
                if (eVar.f13443h == null) {
                    cVar.m(8);
                } else {
                    cVar.j(8, r3.intValue());
                }
                if (eVar.f13444i == null) {
                    cVar.m(9);
                } else {
                    cVar.j(9, r3.intValue());
                }
                String str5 = eVar.f13445j;
                if (str5 == null) {
                    cVar.m(10);
                } else {
                    cVar.C(10, str5);
                }
                String str6 = eVar.f13446k;
                if (str6 == null) {
                    cVar.m(11);
                } else {
                    cVar.C(11, str6);
                }
                String str7 = eVar.l;
                if (str7 == null) {
                    cVar.m(12);
                } else {
                    cVar.C(12, str7);
                }
                String str8 = eVar.f13447m;
                if (str8 == null) {
                    cVar.m(13);
                } else {
                    cVar.C(13, str8);
                }
                String str9 = eVar.f13448n;
                if (str9 == null) {
                    cVar.m(14);
                } else {
                    cVar.C(14, str9);
                }
                String str10 = eVar.f13449o;
                if (str10 == null) {
                    str10 = null;
                }
                if (str10 == null) {
                    cVar.m(15);
                } else {
                    cVar.C(15, str10);
                }
                ItemType itemType = eVar.f13450p;
                String strName = itemType != null ? itemType.name() : null;
                if (strName == null) {
                    cVar.m(16);
                } else {
                    cVar.C(16, strName);
                }
                String str11 = eVar.f13451q;
                if (str11 == null) {
                    cVar.m(17);
                } else {
                    cVar.C(17, str11);
                }
                cVar.j(18, eVar.f13452r);
                break;
            case 2:
                ResumePaymentData resumePaymentData = (ResumePaymentData) obj;
                cVar.getClass();
                resumePaymentData.getClass();
                cVar.j(1, resumePaymentData.getOrderCreatedAt());
                String strM195getOrderIdreIZeYA = resumePaymentData.m195getOrderIdreIZeYA();
                strM195getOrderIdreIZeYA.getClass();
                cVar.C(2, strM195getOrderIdreIZeYA);
                String strM196getPaymentIdTaD0F3M = resumePaymentData.m196getPaymentIdTaD0F3M();
                if (strM196getPaymentIdTaD0F3M == null) {
                    strM196getPaymentIdTaD0F3M = null;
                }
                if (strM196getPaymentIdTaD0F3M == null) {
                    cVar.m(3);
                } else {
                    cVar.C(3, strM196getPaymentIdTaD0F3M);
                }
                String strM194getItemIdRWxzYZM = resumePaymentData.m194getItemIdRWxzYZM();
                if (strM194getItemIdRWxzYZM == null) {
                    strM194getItemIdRWxzYZM = null;
                }
                if (strM194getItemIdRWxzYZM == null) {
                    cVar.m(4);
                } else {
                    cVar.C(4, strM194getItemIdRWxzYZM);
                }
                cVar.j(5, resumePaymentData.isMultiItem() ? 1L : 0L);
                cVar.C(6, resumePaymentData.getReturnUrl());
                List<Payments> listOfPayments = resumePaymentData.getListOfPayments();
                listOfPayments.getClass();
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                cVar.C(7, bVar.c(new m90.d(Payments.INSTANCE.serializer(), 0), listOfPayments));
                PaymentMethods selectedPaymentMethods = resumePaymentData.getSelectedPaymentMethods();
                ProviderType providerType = selectedPaymentMethods.getProviderType();
                String str12 = "UNKNOWN";
                if (providerType == null) {
                    cVar.m(8);
                } else {
                    int i13 = x.$EnumSwitchMapping$0[providerType.ordinal()];
                    if (i13 == 1) {
                        str = "ADYEN_SAVED_PAYMENT";
                    } else if (i13 == 2) {
                        str = "EDENRED_SAVED_PAYMENT";
                    } else if (i13 == 3) {
                        str = "ADYEN_PAYMENT_METHOD";
                    } else if (i13 == 4) {
                        str = "SATISPAY_PAYMENT_METHOD";
                    } else if (i13 != 5) {
                        e40.a.f();
                    } else {
                        str = "UNKNOWN";
                    }
                    cVar.C(8, str);
                }
                PaymentProvider paymentProvider = selectedPaymentMethods.getPaymentProvider();
                String str13 = "SATISPAY";
                if (paymentProvider == null) {
                    cVar.m(9);
                } else {
                    switch (x.$EnumSwitchMapping$1[paymentProvider.ordinal()]) {
                        case 1:
                            str2 = "ADYEN";
                            break;
                        case 2:
                            str2 = "SATISPAY";
                            break;
                        case 3:
                            str2 = "EDENRED";
                            break;
                        case 4:
                            str2 = "VOUCHER";
                            break;
                        case 5:
                            str2 = "CHARITY";
                            break;
                        case 6:
                            str2 = "UNKNOWN";
                            break;
                        default:
                            e40.a.f();
                            break;
                    }
                    cVar.C(9, str2);
                }
                PaymentType paymentType = selectedPaymentMethods.getPaymentType();
                if (paymentType != null) {
                    switch (x.$EnumSwitchMapping$2[paymentType.ordinal()]) {
                        case 1:
                            str13 = "PAYPAL";
                            cVar.C(10, str13);
                            break;
                        case 2:
                            str13 = "SOFORT";
                            cVar.C(10, str13);
                            break;
                        case 3:
                            str13 = "IDEAL";
                            cVar.C(10, str13);
                            break;
                        case 4:
                            str13 = "CREDITCARD";
                            cVar.C(10, str13);
                            break;
                        case 5:
                            str13 = "CHARITY";
                            cVar.C(10, str13);
                            break;
                        case 6:
                            str13 = "GOOGLEPAY";
                            cVar.C(10, str13);
                            break;
                        case 7:
                            str13 = "BCMCMOBILE";
                            cVar.C(10, str13);
                            break;
                        case 8:
                            str13 = "BCMCCARD";
                            cVar.C(10, str13);
                            break;
                        case 9:
                            str13 = "VIPPS";
                            cVar.C(10, str13);
                            break;
                        case 10:
                            str13 = "TWINT";
                            cVar.C(10, str13);
                            break;
                        case 11:
                            str13 = "MBWAY";
                            cVar.C(10, str13);
                            break;
                        case 12:
                            str13 = "BLIK";
                            cVar.C(10, str13);
                            break;
                        case 13:
                            cVar.C(10, str13);
                            break;
                        case 14:
                            str13 = "CASH_APP_PAY";
                            cVar.C(10, str13);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            str13 = "EDENRED";
                            cVar.C(10, str13);
                            break;
                        case 16:
                            str13 = "UNKNOWN";
                            cVar.C(10, str13);
                            break;
                        default:
                            e40.a.f();
                            break;
                    }
                } else {
                    cVar.m(10);
                }
                String cardIdentifier = selectedPaymentMethods.getCardIdentifier();
                if (cardIdentifier == null) {
                    cVar.m(11);
                } else {
                    cVar.C(11, cardIdentifier);
                }
                String displayValue = selectedPaymentMethods.getDisplayValue();
                if (displayValue == null) {
                    cVar.m(12);
                } else {
                    cVar.C(12, displayValue);
                }
                cVar.j(13, selectedPaymentMethods.getHasVouchersEnabled() ? 1L : 0L);
                String adyenPayload = selectedPaymentMethods.getAdyenPayload();
                if (adyenPayload == null) {
                    cVar.m(14);
                } else {
                    cVar.C(14, adyenPayload);
                }
                cVar.j(15, selectedPaymentMethods.getSaveCard() ? 1L : 0L);
                int i14 = x.$EnumSwitchMapping$3[selectedPaymentMethods.getCardStatus().ordinal()];
                if (i14 == 1) {
                    str12 = "ACTIVE";
                } else if (i14 == 2) {
                    str12 = "EXPIRED";
                } else if (i14 != 3) {
                    e40.a.f();
                }
                cVar.C(16, str12);
                cVar.j(17, selectedPaymentMethods.getShowZipcode() ? 1L : 0L);
                cVar.j(18, selectedPaymentMethods.isPreferred() ? 1L : 0L);
                Environment adyenEnvironment = selectedPaymentMethods.getAdyenEnvironment();
                adyenEnvironment.getClass();
                cVar.C(19, adyenEnvironment.toString());
                RecurringPaymentInformation recurringInfo = selectedPaymentMethods.getRecurringInfo();
                if (recurringInfo != null) {
                    String displayValue2 = recurringInfo.getDisplayValue();
                    if (displayValue2 == null) {
                        cVar.m(20);
                    } else {
                        cVar.C(20, displayValue2);
                    }
                    String strM474getRecurringIdsIL_j68 = recurringInfo.m474getRecurringIdsIL_j68();
                    if (strM474getRecurringIdsIL_j68 == null) {
                        strM474getRecurringIdsIL_j68 = null;
                    }
                    if (strM474getRecurringIdsIL_j68 == null) {
                        cVar.m(21);
                    } else {
                        cVar.C(21, strM474getRecurringIdsIL_j68);
                    }
                    cVar.j(22, recurringInfo.getItemsLeft());
                } else {
                    cVar.m(20);
                    cVar.m(21);
                    cVar.m(22);
                }
                PaymentIcons icons = selectedPaymentMethods.getIcons();
                if (icons != null) {
                    List<Icon> smallIcons = icons.getSmallIcons();
                    if (smallIcons != null) {
                        bVar.getClass();
                        strC = bVar.c(new m90.d(Icon.INSTANCE.serializer(), 0), smallIcons);
                    } else {
                        strC = null;
                    }
                    if (strC == null) {
                        cVar.m(23);
                    } else {
                        cVar.C(23, strC);
                    }
                    List<Icon> largeIcons = icons.getLargeIcons();
                    if (largeIcons != null) {
                        bVar.getClass();
                        strC2 = bVar.c(new m90.d(Icon.INSTANCE.serializer(), 0), largeIcons);
                    } else {
                        strC2 = null;
                    }
                    if (strC2 == null) {
                        cVar.m(24);
                    } else {
                        cVar.C(24, strC2);
                    }
                } else {
                    cVar.m(23);
                    cVar.m(24);
                }
                Price availableAmount = selectedPaymentMethods.getAvailableAmount();
                if (availableAmount != null) {
                    cVar.C(25, availableAmount.getCurrency());
                    cVar.j(26, availableAmount.getDecimals());
                    cVar.j(27, availableAmount.getMinorUnits());
                } else {
                    cVar.m(25);
                    cVar.m(26);
                    cVar.m(27);
                }
                aj.c basketCheckoutData = resumePaymentData.getBasketCheckoutData();
                if (basketCheckoutData == null) {
                    cVar.m(28);
                    cVar.m(29);
                    cVar.m(30);
                } else {
                    List list = basketCheckoutData.f1494a;
                    list.getClass();
                    cVar.C(28, bVar.c(new m90.d(BasketBriefItem.INSTANCE.serializer(), 0), list));
                    cVar.C(29, basketCheckoutData.f1495b);
                    cVar.C(30, basketCheckoutData.f1496c);
                }
                break;
            case 3:
                ViewedRecipe viewedRecipe = (ViewedRecipe) obj;
                cVar.getClass();
                viewedRecipe.getClass();
                cVar.j(1, viewedRecipe.getId());
                cVar.C(2, viewedRecipe.getRecipeJson());
                cVar.C(3, viewedRecipe.getRecipeName());
                cVar.j(4, viewedRecipe.getViewedAt());
                break;
            case 4:
                qb.a aVar = (qb.a) obj;
                cVar.getClass();
                aVar.getClass();
                cVar.C(1, aVar.f36786a);
                cVar.C(2, aVar.f36787b);
                break;
            case 5:
                qb.c cVar2 = (qb.c) obj;
                cVar.getClass();
                cVar2.getClass();
                cVar.C(1, cVar2.f36790a);
                cVar.j(2, cVar2.f36791b.longValue());
                break;
            case 6:
                qb.f fVar = (qb.f) obj;
                cVar.getClass();
                fVar.getClass();
                cVar.C(1, fVar.f36794a);
                cVar.j(2, fVar.f36795b);
                cVar.j(3, fVar.f36796c);
                break;
            case 7:
                qb.i iVar = (qb.i) obj;
                cVar.getClass();
                iVar.getClass();
                cVar.C(1, iVar.f36801a);
                cVar.C(2, iVar.f36802b);
                break;
            case 8:
                qb.k kVar = (qb.k) obj;
                cVar.getClass();
                kVar.getClass();
                cVar.C(1, kVar.f36805a);
                ib.h hVar = ib.h.f23726b;
                cVar.k(2, ex.i.L(kVar.f36806b));
                break;
            case 9:
                qb.o oVar = (qb.o) obj;
                cVar.getClass();
                oVar.getClass();
                cVar.C(1, oVar.f36828a);
                cVar.j(2, xz.b.K(oVar.f36829b));
                cVar.C(3, oVar.f36830c);
                cVar.C(4, oVar.f36831d);
                ib.h hVar2 = ib.h.f23726b;
                cVar.k(5, ex.i.L(oVar.f36832e));
                cVar.k(6, ex.i.L(oVar.f36833f));
                cVar.j(7, oVar.f36834g);
                cVar.j(8, oVar.f36835h);
                cVar.j(9, oVar.f36836i);
                cVar.j(10, oVar.f36838k);
                ib.a aVar2 = oVar.l;
                aVar2.getClass();
                int i15 = qb.z.$EnumSwitchMapping$1[aVar2.ordinal()];
                if (i15 == 1) {
                    i11 = 0;
                } else if (i15 != 2) {
                    e40.a.f();
                } else {
                    i11 = 1;
                }
                cVar.j(11, i11);
                cVar.j(12, oVar.f36839m);
                cVar.j(13, oVar.f36840n);
                cVar.j(14, oVar.f36841o);
                cVar.j(15, oVar.f36842p);
                cVar.j(16, oVar.f36843q ? 1L : 0L);
                d0 d0Var = oVar.f36844r;
                d0Var.getClass();
                int i16 = qb.z.$EnumSwitchMapping$3[d0Var.ordinal()];
                if (i16 == 1) {
                    i12 = 0;
                } else if (i16 != 2) {
                    e40.a.f();
                } else {
                    i12 = 1;
                }
                cVar.j(17, i12);
                cVar.j(18, oVar.f36845s);
                cVar.j(19, oVar.f36846t);
                cVar.j(20, oVar.f36847u);
                cVar.j(21, oVar.f36848v);
                cVar.j(22, oVar.f36849w);
                String str14 = oVar.f36850x;
                if (str14 == null) {
                    cVar.m(23);
                } else {
                    cVar.C(23, str14);
                }
                Boolean bool = oVar.f36851y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.m(24);
                } else {
                    cVar.j(24, r5.intValue());
                }
                ib.e eVar2 = oVar.f36837j;
                cVar.j(25, xz.b.G(eVar2.f23711a));
                cVar.k(26, xz.b.s(eVar2.f23712b));
                cVar.j(27, eVar2.f23713c ? 1L : 0L);
                cVar.j(28, eVar2.f23714d ? 1L : 0L);
                cVar.j(29, eVar2.f23715e ? 1L : 0L);
                cVar.j(30, eVar2.f23716f ? 1L : 0L);
                cVar.j(31, eVar2.f23717g);
                cVar.j(32, eVar2.f23718h);
                cVar.k(33, xz.b.J(eVar2.f23719i));
                break;
            default:
                qb.x xVar = (qb.x) obj;
                cVar.getClass();
                xVar.getClass();
                cVar.C(1, xVar.f36873a);
                cVar.C(2, xVar.f36874b);
                break;
        }
    }

    @Override // bx.k
    public final String s() {
        switch (this.f20829h) {
            case 0:
                return "INSERT OR REPLACE INTO `biodata` (`id`,`secret`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `impressions` (`sessionId`,`timeStampUtc`,`timeStampLocal`,`itemId`,`contextType`,`itemStock`,`discoverBucketId`,`itemPositionHorizontal`,`itemPositionVertical`,`coverPictureId`,`logoPictureId`,`deeplinkId`,`platform`,`version`,`storeId`,`itemType`,`storeName`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
            case 2:
                return "INSERT OR REPLACE INTO `ResumePaymentData` (`orderCreatedAt`,`orderId`,`paymentId`,`itemId`,`isMultiItem`,`returnUrl`,`listOfPayments`,`providerType`,`paymentProvider`,`paymentType`,`cardIdentifier`,`displayValue`,`hasVouchersEnabled`,`adyenPayload`,`saveCard`,`cardStatus`,`showZipcode`,`isPreferred`,`adyenEnvironment`,`recurringInfo_displayValue`,`recurringInfo_recurringId`,`recurringInfo_itemsLeft`,`smallIcons`,`largeIcons`,`currency`,`decimals`,`minorUnits`,`basketBriefItems`,`basketCountry`,`basketId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR ABORT INTO `viewed_recipes` (`id`,`recipe_json`,`recipe_name`,`viewed_at`) VALUES (nullif(?, 0),?,?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 7:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 9:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public /* synthetic */ a(Object obj, int i11) {
        this.f20829h = i11;
    }
}
