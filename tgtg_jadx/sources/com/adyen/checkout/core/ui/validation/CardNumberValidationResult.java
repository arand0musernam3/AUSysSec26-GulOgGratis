package com.adyen.checkout.core.ui.validation;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult;", "", "Invalid", "Valid", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid;", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Valid;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CardNumberValidationResult {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid;", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult;", "IllegalCharacters", "LuhnCheck", "TooLong", "TooShort", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Invalid extends CardNumberValidationResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid$IllegalCharacters;", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid;", "()V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IllegalCharacters implements Invalid {
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid$LuhnCheck;", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid;", "()V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LuhnCheck implements Invalid {
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid$TooLong;", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid;", "()V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TooLong implements Invalid {
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid$TooShort;", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Invalid;", "()V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TooShort implements Invalid {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult$Valid;", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult;", "()V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Valid implements CardNumberValidationResult {
    }
}
