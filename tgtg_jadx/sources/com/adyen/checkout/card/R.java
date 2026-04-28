package com.adyen.checkout.card;

/* JADX INFO: loaded from: classes.dex */
public final class R {

    public static final class dimen {
        public static int brand_logo_height = 0x7f070067;
        public static int brand_logo_width = 0x7f070068;
        public static int payment_method_margin = 0x7f07045e;

        private dimen() {
        }
    }

    public static final class drawable {
        public static int ic_camera = 0x7f08026f;
        public static int ic_card = 0x7f080270;

        private drawable() {
        }
    }

    public static final class id {
        public static int addressFormInput = 0x7f0a0068;
        public static int autoCompleteTextView_addressLookup = 0x7f0a0091;
        public static int autoCompleteTextView_installments = 0x7f0a0093;
        public static int cardBrandLogo_container = 0x7f0a0132;
        public static int cardBrandLogo_container_primary = 0x7f0a0133;
        public static int cardBrandLogo_container_secondary = 0x7f0a0134;
        public static int cardBrandLogo_imageView_primary = 0x7f0a0135;
        public static int cardBrandLogo_imageView_secondary = 0x7f0a0136;
        public static int editText_cardHolder = 0x7f0a0270;
        public static int editText_cardNumber = 0x7f0a0271;
        public static int editText_expiryDate = 0x7f0a0273;
        public static int editText_kcpBirthDateOrTaxNumber = 0x7f0a0275;
        public static int editText_kcpCardPassword = 0x7f0a0276;
        public static int editText_postalCode = 0x7f0a0278;
        public static int editText_securityCode = 0x7f0a027a;
        public static int editText_socialSecurityNumber = 0x7f0a027b;
        public static int fragmentContainer_cardScanning = 0x7f0a02e6;
        public static int imageView_brandLogo = 0x7f0a0343;
        public static int imageView_cardBrandLogo = 0x7f0a0344;
        public static int radioButton_cardBrand = 0x7f0a0518;
        public static int recyclerView_cardList = 0x7f0a052c;
        public static int recyclerView_cobadgeBrands = 0x7f0a052d;
        public static int scan_button = 0x7f0a0550;
        public static int switch_storePaymentMethod = 0x7f0a05f8;
        public static int textInputLayout_addressLookup = 0x7f0a061b;
        public static int textInputLayout_cardHolder = 0x7f0a061f;
        public static int textInputLayout_cardNumber = 0x7f0a0620;
        public static int textInputLayout_expiryDate = 0x7f0a0623;
        public static int textInputLayout_installments = 0x7f0a0625;
        public static int textInputLayout_kcpBirthDateOrTaxNumber = 0x7f0a0626;
        public static int textInputLayout_kcpCardPassword = 0x7f0a0627;
        public static int textInputLayout_postalCode = 0x7f0a0629;
        public static int textInputLayout_securityCode = 0x7f0a062b;
        public static int textInputLayout_socialSecurityNumber = 0x7f0a062c;
        public static int textView_cardBrandName = 0x7f0a0638;
        public static int textView_cobadgeBrandsDescription = 0x7f0a0639;
        public static int textView_cobadgeBrandsHeader = 0x7f0a063a;
        public static int textView_installmentOption = 0x7f0a0648;

        private id() {
        }
    }

    public static final class layout {
        public static int brand_logo = 0x7f0d0041;
        public static int card_brand_item = 0x7f0d004e;
        public static int card_view = 0x7f0d004f;
        public static int fragment_card_scanning = 0x7f0d00c2;
        public static int installment_view = 0x7f0d00d1;
        public static int stored_card_view = 0x7f0d0182;

        private layout() {
        }
    }

    public static final class string {
        public static int card_number_4digit = 0x7f1400fb;
        public static int checkout_card_brand_not_supported = 0x7f1401fd;
        public static int checkout_card_dual_brand_description = 0x7f1401fe;
        public static int checkout_card_dual_brand_title = 0x7f1401ff;
        public static int checkout_card_expiry_date_format_label = 0x7f140200;
        public static int checkout_card_expiry_date_hint = 0x7f140201;
        public static int checkout_card_expiry_date_optional_hint = 0x7f140202;
        public static int checkout_card_formatted_brand_name_not_supported = 0x7f140203;
        public static int checkout_card_holder_hint = 0x7f140204;
        public static int checkout_card_installments_option_one_time = 0x7f140205;
        public static int checkout_card_installments_option_regular = 0x7f140206;
        public static int checkout_card_installments_option_regular_with_price = 0x7f140207;
        public static int checkout_card_installments_option_revolving = 0x7f140208;
        public static int checkout_card_installments_title = 0x7f140209;
        public static int checkout_card_number_hint = 0x7f14020a;
        public static int checkout_card_number_not_valid = 0x7f14020b;
        public static int checkout_card_postal_not_valid = 0x7f14020c;
        public static int checkout_card_scan_button = 0x7f14020d;
        public static int checkout_card_security_code_format_3_digits = 0x7f14020e;
        public static int checkout_card_security_code_format_4_digits = 0x7f14020f;
        public static int checkout_card_security_code_hint = 0x7f140210;
        public static int checkout_card_security_code_optional_hint = 0x7f140211;
        public static int checkout_expiry_date_not_valid = 0x7f140216;
        public static int checkout_expiry_date_not_valid_too_far_in_future = 0x7f140217;
        public static int checkout_expiry_date_not_valid_too_old = 0x7f140218;
        public static int checkout_holder_name_not_valid = 0x7f140219;
        public static int checkout_kcp_birth_date_or_tax_number_hint = 0x7f14021a;
        public static int checkout_kcp_birth_date_or_tax_number_invalid = 0x7f14021b;
        public static int checkout_kcp_password_hint = 0x7f14021c;
        public static int checkout_kcp_password_invalid = 0x7f14021d;
        public static int checkout_kcp_tax_number_hint = 0x7f14021e;
        public static int checkout_security_code_not_valid = 0x7f14023f;
        public static int checkout_social_security_number_hint = 0x7f140241;
        public static int checkout_social_security_number_not_valid = 0x7f140242;
        public static int store_payment_method = 0x7f140acd;

        private string() {
        }
    }

    public static final class style {
        public static int AdyenCheckout_Card = 0x7f150021;
        public static int AdyenCheckout_Card_AddressLookup = 0x7f150022;
        public static int AdyenCheckout_Card_AddressLookup_DropdownTextInputEditText = 0x7f150023;
        public static int AdyenCheckout_Card_AddressLookup_DropdownTextInputLayout = 0x7f150024;
        public static int AdyenCheckout_Card_BrandListLogo = 0x7f150025;
        public static int AdyenCheckout_Card_BrandRecognitionLogo = 0x7f150026;
        public static int AdyenCheckout_Card_BrandRecognitionLogoContainer = 0x7f150027;
        public static int AdyenCheckout_Card_BrandRecognitionLogoContainerGroup = 0x7f150028;
        public static int AdyenCheckout_Card_BrandSelection = 0x7f150029;
        public static int AdyenCheckout_Card_BrandSelection_Description = 0x7f15002a;
        public static int AdyenCheckout_Card_BrandSelection_Header = 0x7f15002b;
        public static int AdyenCheckout_Card_BrandSelection_Item = 0x7f15002c;
        public static int AdyenCheckout_Card_BrandSelection_Item_Logo = 0x7f15002d;
        public static int AdyenCheckout_Card_BrandSelection_Item_RadioButton = 0x7f15002e;
        public static int AdyenCheckout_Card_BrandSelection_Item_Title = 0x7f15002f;
        public static int AdyenCheckout_Card_CardNumberInput = 0x7f150030;
        public static int AdyenCheckout_Card_ExpiryDateInput = 0x7f150031;
        public static int AdyenCheckout_Card_HolderNameInput = 0x7f150032;
        public static int AdyenCheckout_Card_KcpBirthDateOrTaxNumber = 0x7f150033;
        public static int AdyenCheckout_Card_KcpCardPassword = 0x7f150034;
        public static int AdyenCheckout_Card_ScanButton = 0x7f150035;
        public static int AdyenCheckout_Card_SecurityCodeInput = 0x7f150036;
        public static int AdyenCheckout_Card_SocialSecurityNumberInput = 0x7f150037;
        public static int AdyenCheckout_Card_StorePaymentSwitch = 0x7f150038;
        public static int AdyenCheckout_DropdownTextInputLayout_Installments = 0x7f150046;
        public static int AdyenCheckout_Image_CardLogo = 0x7f15004f;
        public static int AdyenCheckout_InstallmentOptionTextView = 0x7f150053;

        private style() {
        }
    }

    private R() {
    }
}
