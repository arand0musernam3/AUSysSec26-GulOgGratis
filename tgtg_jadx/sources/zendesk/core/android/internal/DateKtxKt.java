package zendesk.core.android.internal;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0015\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0001H\u0007\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0014\u0010\r\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0014\u0010\u000e\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0014\u0010\u000f\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0014\u0010\u0010\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0006\u0010\u0013\u001a\u00020\b\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0012\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0016\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0016\u001a\u001a\u0010\u001b\u001a\u00020\b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n\u001a\u0014\u0010\u001d\u001a\u00020\b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0012H\u0002\u001a\u001c\u0010\u001e\u001a\u00020\b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"toDate", "Ljava/util/Date;", "", "(Ljava/lang/Double;)Ljava/util/Date;", "toTimestamp", "", "toUnixTimeStamp", "timeOnly", "", "locale", "Ljava/util/Locale;", "is24HourFormat", "", "dayAndMonth", "fullMonthAndDay", "monthDayAndYear", "fullMonthDayAndYear", "iso8601DateFormat", "Ljava/text/SimpleDateFormat;", "currentIso8601UtcTimestamp", "plusMinutes", "minutes", "", "plusDays", "days", "plusMillis", "millis", "formatToLocalisedNumbers", "formatter", "formatToLocalisedNumbersWithDecimalStyle", "formatToLocalisedNumbersWithReplace", "zendesk.core_core-utilities"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DateKtxKt {

    @NotNull
    private static final SimpleDateFormat iso8601DateFormat;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateKtxConstants.ISO_8601_UTC_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
        iso8601DateFormat = simpleDateFormat;
    }

    @NotNull
    public static final String currentIso8601UtcTimestamp() {
        String str = iso8601DateFormat.format(new Date());
        str.getClass();
        return str;
    }

    @InternalZendeskApi
    @NotNull
    public static final String dayAndMonth(@NotNull Date date, @NotNull Locale locale) {
        date.getClass();
        locale.getClass();
        String str = new SimpleDateFormat(DateKtxConstants.DAY_MONTH_PATTERN, locale).format(date);
        str.getClass();
        return str;
    }

    @NotNull
    public static final String formatToLocalisedNumbers(@NotNull Date date, @NotNull SimpleDateFormat simpleDateFormat, @NotNull Locale locale) {
        date.getClass();
        simpleDateFormat.getClass();
        locale.getClass();
        return formatToLocalisedNumbersWithDecimalStyle(date, simpleDateFormat);
    }

    private static final String formatToLocalisedNumbersWithDecimalStyle(Date date, SimpleDateFormat simpleDateFormat) {
        String str = simpleDateFormat.format(date);
        str.getClass();
        return str;
    }

    private static final String formatToLocalisedNumbersWithReplace(Date date, SimpleDateFormat simpleDateFormat, Locale locale) {
        String str = simpleDateFormat.format(date);
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        Regex regex = new Regex("\\d");
        str.getClass();
        return regex.f(str, new a(numberInstance, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formatToLocalisedNumbersWithReplace$lambda$2(NumberFormat numberFormat, MatchResult matchResult) {
        matchResult.getClass();
        String str = numberFormat.format(Integer.valueOf(Integer.parseInt(matchResult.getValue())));
        str.getClass();
        return str;
    }

    @InternalZendeskApi
    @NotNull
    public static final String fullMonthAndDay(@NotNull Date date, @NotNull Locale locale) {
        date.getClass();
        locale.getClass();
        String str = new SimpleDateFormat(DateKtxConstants.FULL_MONTH_DAY_PATTERN, locale).format(date);
        str.getClass();
        return str;
    }

    @InternalZendeskApi
    @NotNull
    public static final String fullMonthDayAndYear(@NotNull Date date, @NotNull Locale locale) {
        date.getClass();
        locale.getClass();
        String str = new SimpleDateFormat(DateKtxConstants.FULL_MONTH_DAY_YEAR_PATTERN, locale).format(date);
        str.getClass();
        return str;
    }

    @InternalZendeskApi
    @NotNull
    public static final String monthDayAndYear(@NotNull Date date, @NotNull Locale locale) {
        date.getClass();
        locale.getClass();
        String str = new SimpleDateFormat(DateKtxConstants.MONTH_DAY_YEAR_PATTERN, locale).format(date);
        str.getClass();
        return str;
    }

    @NotNull
    public static final Date plusDays(@NotNull Date date, int i11) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, i11);
        Date time = calendar.getTime();
        time.getClass();
        return time;
    }

    @NotNull
    public static final Date plusMillis(@NotNull Date date, int i11) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(14, i11);
        Date time = calendar.getTime();
        time.getClass();
        return time;
    }

    @NotNull
    public static final Date plusMinutes(@NotNull Date date, int i11) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(12, i11);
        Date time = calendar.getTime();
        time.getClass();
        return time;
    }

    @InternalZendeskApi
    @NotNull
    public static final String timeOnly(@NotNull Date date, @NotNull Locale locale, boolean z11) {
        date.getClass();
        locale.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(z11 ? DateKtxConstants.TIME_24_FORMAT_PATTERN : DateKtxConstants.TIME_12_FORMAT_PATTERN, locale);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(date);
        str.getClass();
        return str;
    }

    @InternalZendeskApi
    @Nullable
    public static final Date toDate(@Nullable Double d3) {
        if (d3 != null) {
            return toDate(d3.doubleValue());
        }
        return null;
    }

    @InternalZendeskApi
    public static final long toTimestamp(@NotNull Date date) {
        date.getClass();
        return date.getTime();
    }

    @InternalZendeskApi
    public static final long toUnixTimeStamp(@NotNull Date date) {
        date.getClass();
        return date.getTime() / 1000;
    }

    @InternalZendeskApi
    @NotNull
    public static final Date toDate(double d3) {
        return new Date(((long) d3) * 1000);
    }
}
