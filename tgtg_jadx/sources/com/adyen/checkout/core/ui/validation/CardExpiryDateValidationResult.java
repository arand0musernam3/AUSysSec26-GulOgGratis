package com.adyen.checkout.core.ui.validation;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult;", "", "Invalid", "Valid", "Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Invalid;", "Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Valid;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CardExpiryDateValidationResult {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Invalid;", "Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult;", "NonParseableDate", "TooFarInTheFuture", "TooOld", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Invalid extends CardExpiryDateValidationResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Invalid$NonParseableDate;", "Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Invalid;", "()V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NonParseableDate implements Invalid {
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Invalid$TooFarInTheFuture;", "Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Invalid;", "()V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TooFarInTheFuture implements Invalid {
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Invalid$TooOld;", "Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Invalid;", "()V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TooOld implements Invalid {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult$Valid;", "Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult;", "()V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Valid implements CardExpiryDateValidationResult {
    }
}
