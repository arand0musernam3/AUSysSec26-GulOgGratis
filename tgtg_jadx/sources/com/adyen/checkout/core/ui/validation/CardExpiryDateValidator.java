package com.adyen.checkout.core.ui.validation;

import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.ui.model.ExpiryDate;
import com.adyen.checkout.core.ui.validation.CardExpiryDateValidationResult;
import e0.f;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0004J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidator;", "", "()V", "DATE_FORMAT", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "dateExists", "", "expiryDate", "isInMaxYearRange", "expiryDateCalendar", "Ljava/util/Calendar;", "calendar", "isInMinMonthRange", "validateExpiryDate", "Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult;", "Lcom/adyen/checkout/core/ui/model/ExpiryDate;", "validateExpiryDate$checkout_core_release", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardExpiryDateValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardExpiryDateValidator.kt\ncom/adyen/checkout/core/ui/validation/CardExpiryDateValidator\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,98:1\n16#2,17:99\n*S KotlinDebug\n*F\n+ 1 CardExpiryDateValidator.kt\ncom/adyen/checkout/core/ui/validation/CardExpiryDateValidator\n*L\n93#1:99,17\n*E\n"})
public final class CardExpiryDateValidator {

    @NotNull
    private static final String DATE_FORMAT = "MM/yy";

    @NotNull
    public static final CardExpiryDateValidator INSTANCE = new CardExpiryDateValidator();

    @NotNull
    private static final SimpleDateFormat dateFormat;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.ROOT);
        dateFormat = simpleDateFormat;
        simpleDateFormat.setLenient(false);
    }

    private CardExpiryDateValidator() {
    }

    private final boolean dateExists(String expiryDate) {
        try {
            return dateFormat.parse(expiryDate) != null;
        } catch (ParseException unused) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.WARN;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (!companion.getLogger().shouldLog(adyenLogLevel)) {
                return false;
            }
            String name = CardExpiryDateValidator.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("Invalid expiry date: ", expiryDate), null);
            return false;
        }
    }

    private final boolean isInMaxYearRange(Calendar expiryDateCalendar, Calendar calendar) {
        Object objClone = calendar.clone();
        objClone.getClass();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) objClone;
        gregorianCalendar.add(1, 30);
        return expiryDateCalendar.get(1) <= gregorianCalendar.get(1);
    }

    private final boolean isInMinMonthRange(Calendar expiryDateCalendar, Calendar calendar) {
        Object objClone = calendar.clone();
        objClone.getClass();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) objClone;
        gregorianCalendar.add(2, -3);
        return expiryDateCalendar.compareTo((Calendar) gregorianCalendar) >= 0;
    }

    @NotNull
    public final CardExpiryDateValidationResult validateExpiryDate(@NotNull ExpiryDate expiryDate) {
        expiryDate.getClass();
        String mMyyString = expiryDate.toMMyyString();
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        return validateExpiryDate$checkout_core_release(mMyyString, calendar);
    }

    @NotNull
    public final CardExpiryDateValidationResult validateExpiryDate$checkout_core_release(@NotNull String expiryDate, @NotNull Calendar calendar) throws ParseException {
        expiryDate.getClass();
        calendar.getClass();
        if (!dateExists(expiryDate)) {
            return new CardExpiryDateValidationResult.Invalid.NonParseableDate();
        }
        Calendar expiryCalendar$checkout_core_release = ExpiryDate.INSTANCE.getExpiryCalendar$checkout_core_release(expiryDate);
        boolean zIsInMaxYearRange = isInMaxYearRange(expiryCalendar$checkout_core_release, calendar);
        return (isInMinMonthRange(expiryCalendar$checkout_core_release, calendar) && zIsInMaxYearRange) ? new CardExpiryDateValidationResult.Valid() : !zIsInMaxYearRange ? new CardExpiryDateValidationResult.Invalid.TooFarInTheFuture() : new CardExpiryDateValidationResult.Invalid.TooOld();
    }

    @NotNull
    public final CardExpiryDateValidationResult validateExpiryDate(@NotNull String expiryDate) {
        expiryDate.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        return validateExpiryDate$checkout_core_release(expiryDate, calendar);
    }
}
