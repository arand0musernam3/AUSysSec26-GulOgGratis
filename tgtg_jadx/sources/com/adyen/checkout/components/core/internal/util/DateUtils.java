package com.adyen.checkout.components.core.internal.util;

import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import j4.s;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004J\"\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/components/core/internal/util/DateUtils;", "", "()V", "DEFAULT_INPUT_DATE_FORMAT", "", "formatDateToString", "calendar", "Ljava/util/Calendar;", "pattern", "formatStringDate", "date", "shopperLocale", "Ljava/util/Locale;", "inputFormat", "matchesFormat", "", "format", "parseDateToView", "month", "year", "toServerDateFormat", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDateUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateUtils.kt\ncom/adyen/checkout/components/core/internal/util/DateUtils\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n16#2,17:97\n21#2,12:115\n21#2,12:127\n1#3:114\n*S KotlinDebug\n*F\n+ 1 DateUtils.kt\ncom/adyen/checkout/components/core/internal/util/DateUtils\n*L\n53#1:97,17\n75#1:115,12\n92#1:127,12\n*E\n"})
public final class DateUtils {

    @NotNull
    private static final String DEFAULT_INPUT_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    @NotNull
    public static final DateUtils INSTANCE = new DateUtils();

    private DateUtils() {
    }

    public static /* synthetic */ String formatDateToString$default(DateUtils dateUtils, Calendar calendar, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = DEFAULT_INPUT_DATE_FORMAT;
        }
        return dateUtils.formatDateToString(calendar, str);
    }

    public static /* synthetic */ String formatStringDate$default(DateUtils dateUtils, String str, Locale locale, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = DEFAULT_INPUT_DATE_FORMAT;
        }
        return dateUtils.formatStringDate(str, locale, str2);
    }

    @NotNull
    public static final String parseDateToView(@NotNull String month, @NotNull String year) {
        month.getClass();
        year.getClass();
        return k.m(month, ExpiryDateInput.SEPARATOR, b0.y(2, year));
    }

    @NotNull
    public static final String toServerDateFormat(@NotNull Calendar calendar) {
        calendar.getClass();
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(calendar.getTime());
        str.getClass();
        return str;
    }

    @Nullable
    public final String formatDateToString(@NotNull Calendar calendar, @NotNull String pattern) {
        calendar.getClass();
        pattern.getClass();
        try {
            return new SimpleDateFormat(pattern, Locale.US).format(calendar.getTime());
        } catch (IllegalArgumentException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (!companion.getLogger().shouldLog(adyenLogLevel)) {
                return null;
            }
            String name = DateUtils.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), a0.p("Provided pattern ", pattern, " is invalid"), e5);
            return null;
        }
    }

    @Nullable
    public final String formatStringDate(@NotNull String date, @NotNull Locale shopperLocale, @NotNull String inputFormat) {
        date.getClass();
        shopperLocale.getClass();
        inputFormat.getClass();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(inputFormat, shopperLocale);
            DateFormat dateInstance = DateFormat.getDateInstance(3, shopperLocale);
            Date date2 = simpleDateFormat.parse(date);
            if (date2 != null) {
                return dateInstance.format(date2);
            }
            return null;
        } catch (ParseException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (!companion.getLogger().shouldLog(adyenLogLevel)) {
                return null;
            }
            String name = DateUtils.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), s.k("Provided date ", date, " does not match the given format ", inputFormat), e5);
            return null;
        }
    }

    public final boolean matchesFormat(@NotNull String date, @NotNull String format) {
        date.getClass();
        format.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.US);
        simpleDateFormat.setLenient(false);
        try {
            simpleDateFormat.parse(date);
            return true;
        } catch (ParseException unused) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            if (AdyenLogger.INSTANCE.getLogger().shouldLog(adyenLogLevel)) {
                String name = DateUtils.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                AdyenLogger.INSTANCE.getLogger().log(adyenLogLevel, "CO.".concat(name), s.k("Provided date ", date, " does not match the given format ", format), null);
            }
            return false;
        }
    }
}
