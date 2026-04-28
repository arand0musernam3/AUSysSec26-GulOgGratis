package com.adyen.checkout.voucher.internal.ui.model;

import com.adyen.checkout.components.core.action.VoucherAction;
import com.adyen.checkout.components.core.internal.util.DateUtils;
import com.adyen.checkout.voucher.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.collections.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\r"}, d2 = {"createEntityInformationField", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;", "action", "Lcom/adyen/checkout/components/core/action/VoucherAction;", "createExpirationInformationField", "shopperLocale", "Ljava/util/Locale;", "createPhoneNumberField", "createShopperReferenceField", "createStoreNumberField", "getInformationFields", "", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherPaymentMethodConfig;", "voucher_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class VoucherPaymentMethodConfigKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoucherPaymentMethodConfig.values().length];
            try {
                iArr[VoucherPaymentMethodConfig.BOLETO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoucherPaymentMethodConfig.ECONTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoucherPaymentMethodConfig.MULTIBANCO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final VoucherInformationField createEntityInformationField(VoucherAction voucherAction) {
        String entity = voucherAction.getEntity();
        if (entity == null) {
            return null;
        }
        return new VoucherInformationField(R.string.checkout_voucher_expiration_entity, entity);
    }

    private static final VoucherInformationField createExpirationInformationField(VoucherAction voucherAction, Locale locale) {
        String stringDate$default;
        String expiresAt = voucherAction.getExpiresAt();
        if (expiresAt == null || (stringDate$default = DateUtils.formatStringDate$default(DateUtils.INSTANCE, expiresAt, locale, null, 4, null)) == null) {
            return null;
        }
        return new VoucherInformationField(R.string.checkout_voucher_expiration_date, stringDate$default);
    }

    private static final VoucherInformationField createPhoneNumberField(VoucherAction voucherAction) {
        String maskedTelephoneNumber = voucherAction.getMaskedTelephoneNumber();
        if (maskedTelephoneNumber == null) {
            return null;
        }
        return new VoucherInformationField(R.string.checkout_voucher_phone_number, maskedTelephoneNumber);
    }

    private static final VoucherInformationField createShopperReferenceField(VoucherAction voucherAction) {
        String merchantReference = voucherAction.getMerchantReference();
        if (merchantReference == null) {
            return null;
        }
        return new VoucherInformationField(R.string.checkout_voucher_shopper_reference, merchantReference);
    }

    private static final VoucherInformationField createStoreNumberField(VoucherAction voucherAction) {
        String collectionInstitutionNumber = voucherAction.getCollectionInstitutionNumber();
        if (collectionInstitutionNumber == null) {
            return null;
        }
        return new VoucherInformationField(R.string.checkout_voucher_collection_institution_number, collectionInstitutionNumber);
    }

    @Nullable
    public static final List<VoucherInformationField> getInformationFields(@NotNull VoucherPaymentMethodConfig voucherPaymentMethodConfig, @NotNull VoucherAction voucherAction, @NotNull Locale locale) {
        voucherPaymentMethodConfig.getClass();
        voucherAction.getClass();
        locale.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[voucherPaymentMethodConfig.ordinal()];
        if (i11 == 1) {
            return d0.i(createExpirationInformationField(voucherAction, locale));
        }
        if (i11 == 2) {
            return y.w(new VoucherInformationField[]{createStoreNumberField(voucherAction), createExpirationInformationField(voucherAction, locale), createPhoneNumberField(voucherAction)});
        }
        if (i11 != 3) {
            return null;
        }
        return y.w(new VoucherInformationField[]{createEntityInformationField(voucherAction), createExpirationInformationField(voucherAction, locale), createShopperReferenceField(voucherAction)});
    }
}
