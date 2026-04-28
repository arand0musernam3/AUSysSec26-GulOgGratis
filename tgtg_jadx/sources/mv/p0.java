package mv;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.style.StyleSpan;
import c5.a1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemState;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f30209a = new a1(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f30210b = new a1(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f30211c = new a1(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f30212d = new a1(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a1 f30213e = new a1(5);

    public static final boolean A(String str) {
        return DateUtils.isToday(h(str));
    }

    public static final boolean B(String str) {
        return C(str) || A(str) || ((int) a(h(str), false)) <= 0;
    }

    public static final boolean C(String str) {
        return DateUtils.isToday(h(str) - 86400000);
    }

    public static final String D(String str, String str2) {
        if (str == null || str2 == null) {
            return "-";
        }
        String str3 = Instant.parse(str).atZone(ZoneId.of(str2)).toLocalTime().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.getDefault()));
        str3.getClass();
        return str3;
    }

    public static final LocalDate E(String str) {
        str.getClass();
        LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        localDate.getClass();
        return localDate;
    }

    public static final Date F(String str) {
        if (str == null) {
            return null;
        }
        try {
            a1 a1Var = f30211c;
            Object obj = a1Var.get();
            obj.getClass();
            ((SimpleDateFormat) obj).setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
            Object obj2 = a1Var.get();
            obj2.getClass();
            String strReplace = str.replace('T', ' ');
            strReplace.getClass();
            return ((SimpleDateFormat) obj2).parse(strReplace);
        } catch (Exception e5) {
            sa0.a.f38953a.d(e5);
            return null;
        }
    }

    public static final String G(Context context, String str) {
        return g(context, F(str));
    }

    public static final String H(String str) {
        Date dateF = F(str);
        if (dateF == null) {
            return "-";
        }
        a1 a1Var = f30212d;
        Object obj = a1Var.get();
        obj.getClass();
        ((SimpleDateFormat) obj).setTimeZone(TimeZone.getDefault());
        Object obj2 = a1Var.get();
        obj2.getClass();
        String str2 = ((SimpleDateFormat) obj2).format(dateF);
        str2.getClass();
        return str2;
    }

    public static final Date I(String str) {
        str.getClass();
        Object obj = f30210b.get();
        obj.getClass();
        return ((SimpleDateFormat) obj).parse(str);
    }

    public static final long a(long j9, boolean z11) {
        if (j9 == 0) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j9);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(o());
        if (z11) {
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
        }
        return (calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000;
    }

    public static final long b(long j9) {
        if (j9 == 0) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j9);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(o());
        return (calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 3600000;
    }

    public static final String c(Context context, String str) {
        context.getClass();
        long jH = h(str);
        if (jH == 0) {
            return "-";
        }
        String dateTime = DateUtils.formatDateTime(context, jH, 20);
        dateTime.getClass();
        return dateTime;
    }

    public static final String d(Context context, String str) {
        context.getClass();
        long jH = h(str);
        if (jH == 0) {
            return "-";
        }
        String dateTime = DateUtils.formatDateTime(context, jH, 16);
        dateTime.getClass();
        return dateTime;
    }

    public static final String e(Context context, String str) {
        context.getClass();
        long jH = h(str);
        if (jH == 0) {
            return "-";
        }
        String dateTime = DateUtils.formatDateTime(context, jH, 65536);
        dateTime.getClass();
        return dateTime;
    }

    public static final String f(Date date) {
        if (date == null) {
            return "-";
        }
        Object obj = f30212d.get();
        obj.getClass();
        String str = ((SimpleDateFormat) obj).format(date);
        str.getClass();
        return str;
    }

    public static final String g(Context context, Date date) {
        if (date == null) {
            return "-";
        }
        if (context == null || DateFormat.is24HourFormat(context)) {
            Object obj = f30212d.get();
            obj.getClass();
            String str = ((SimpleDateFormat) obj).format(date);
            str.getClass();
            return str;
        }
        Object obj2 = f30213e.get();
        obj2.getClass();
        String str2 = ((SimpleDateFormat) obj2).format(date);
        str2.getClass();
        return str2;
    }

    public static final long h(String str) {
        Date dateF = F(str);
        if (dateF != null) {
            return dateF.getTime();
        }
        return 0L;
    }

    public static final int i(String str) {
        str.getClass();
        LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        localDate.getClass();
        localDateNow.getClass();
        localDate.getClass();
        return (int) ChronoUnit.DAYS.between(localDateNow, localDate);
    }

    public static final String j(String str) {
        String str2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault()).format(ZonedDateTime.parse(str).withZoneSameInstant(ZoneId.systemDefault()));
        str2.getClass();
        return str2;
    }

    public static final String k(String str) {
        String str2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).withLocale(Locale.getDefault()).format(ZonedDateTime.parse(str).withZoneSameInstant(ZoneId.systemDefault()));
        str2.getClass();
        return str2;
    }

    public static final String l(long j9) {
        long j11 = j9 / ((long) 1000);
        long j12 = 60;
        long j13 = j11 / j12;
        long j14 = j11 % j12;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j13), Long.valueOf(j14)}, 2));
    }

    public static final SpannableStringBuilder m(Context context, PickupInterval pickupInterval, ItemState itemState, boolean z11, boolean z12) {
        context.getClass();
        if (itemState != ItemState.INACTIVE_TODAY) {
            if ((pickupInterval != null ? pickupInterval.getIntervalStart() : null) != null && pickupInterval.getIntervalEnd() != null) {
                String intervalStart = pickupInterval.getIntervalStart();
                intervalStart.getClass();
                if (A(intervalStart)) {
                    return new SpannableStringBuilder(r8.k.m(context.getString(R.string.generic_collection_time_label_today), ": ", u(context, pickupInterval)));
                }
                String intervalStart2 = pickupInterval.getIntervalStart();
                intervalStart2.getClass();
                if (C(intervalStart2)) {
                    return new SpannableStringBuilder(r8.k.m(context.getString(R.string.generic_collection_time_label_tomorrow), ": ", u(context, pickupInterval)));
                }
                String strE = z12 ? e(context, pickupInterval.getIntervalStart()) : d(context, pickupInterval.getIntervalStart());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r8.k.m(strE, z11 ? " • " : " ", u(context, pickupInterval)));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, strE.length(), 33);
                return spannableStringBuilder;
            }
        }
        return new SpannableStringBuilder(context.getString(R.string.store_item_label_closed));
    }

    public static final String n(String str) {
        ZonedDateTime zonedDateTime;
        DateTimeFormatter dateTimeFormatterWithLocale = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault());
        try {
            zonedDateTime = ZonedDateTime.parse(str);
        } catch (NullPointerException e5) {
            sa0.a.f38953a.c(j4.s.k("util.formatToDate exception,  date=", str, ",    ex=", e5.getMessage()), new Object[0]);
            zonedDateTime = null;
        } catch (DateTimeParseException e11) {
            sa0.a.f38953a.c(j4.s.k("util.formatToDate exception,  date=", str, ",    ex=", e11.getMessage()), new Object[0]);
            zonedDateTime = null;
        }
        String str2 = zonedDateTime != null ? zonedDateTime.format(dateTimeFormatterWithLocale) : null;
        return str2 == null ? "" : str2;
    }

    public static final long o() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ft.d dVar = ft.e.f17923d;
        if (dVar.f17913i == null) {
            SharedPreferences sharedPreferences = ft.e.f17920a;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
                sharedPreferences = null;
            }
            dVar.f17913i = Long.valueOf(sharedPreferences.getLong("timeScrew", 0L));
        }
        Long l = ft.e.f17923d.f17913i;
        return jCurrentTimeMillis - (l != null ? l.longValue() : 0L);
    }

    public static final String p(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMMM", Locale.getDefault());
        try {
            Date dateF = F(str);
            if (dateF != null) {
                String str2 = simpleDateFormat.format(dateF);
                if (str2 != null) {
                    return str2;
                }
            }
            return null;
        } catch (Exception e5) {
            sa0.a.f38953a.c(e0.f.k("exception parsing dayMonth date, e = ", e5.getMessage()), new Object[0]);
            return null;
        }
    }

    public static final String q() {
        Object obj = f30209a.get();
        obj.getClass();
        String str = ((SimpleDateFormat) obj).format(new Date());
        str.getClass();
        return str;
    }

    public static final String r(int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, i11 - 1);
        calendar.set(1, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM yyyy");
        simpleDateFormat.setCalendar(calendar);
        String str = simpleDateFormat.format(calendar.getTime());
        str.getClass();
        return str;
    }

    public static final String s(Context context, PickupInterval pickupInterval) {
        context.getClass();
        pickupInterval.getClass();
        return g(context, F(pickupInterval.getIntervalStart()));
    }

    public static final String t(Context context, BasicItem basicItem) {
        context.getClass();
        basicItem.getClass();
        PickupInterval pickupIntervalL = d.l(basicItem);
        String intervalStart = pickupIntervalL.getIntervalStart();
        if (!d.p(basicItem)) {
            if (pickupIntervalL.getIntervalStart() == null || pickupIntervalL.getIntervalEnd() == null || d.j(basicItem) == ItemState.INACTIVE_TODAY) {
                String string = context.getString(R.string.store_item_label_closed);
                string.getClass();
                return string;
            }
            if (A(intervalStart)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string2 = context.getString(R.string.discover_pickup_time_today);
                string2.getClass();
                return String.format(string2, Arrays.copyOf(new Object[]{u(context, pickupIntervalL)}, 1));
            }
            if (!C(intervalStart)) {
                String string3 = m(context, pickupIntervalL, d.j(basicItem), true, false).toString();
                string3.getClass();
                return string3;
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string4 = context.getString(R.string.discover_pickup_time_tomorrow);
            string4.getClass();
            return String.format(string4, Arrays.copyOf(new Object[]{u(context, pickupIntervalL)}, 1));
        }
        if (pickupIntervalL.getIntervalStart() == null || pickupIntervalL.getIntervalEnd() == null) {
            String string5 = context.getString(R.string.store_item_label_closed);
            string5.getClass();
            return string5;
        }
        if (d.j(basicItem) == ItemState.INACTIVE_TODAY || d.j(basicItem) == ItemState.SOLD_OUT || d.j(basicItem) == ItemState.SALES_ENDED) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String string6 = context.getString(R.string.table_reservation_item_view_typical_collect);
            string6.getClass();
            return String.format(string6, Arrays.copyOf(new Object[]{s(context, pickupIntervalL)}, 1));
        }
        if (A(intervalStart)) {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String string7 = context.getString(R.string.table_reservation_item_view_collect);
            string7.getClass();
            return String.format(string7, Arrays.copyOf(new Object[]{s(context, pickupIntervalL)}, 1));
        }
        if (!C(intervalStart)) {
            String string8 = m(context, pickupIntervalL, d.j(basicItem), true, false).toString();
            string8.getClass();
            return string8;
        }
        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
        String string9 = context.getString(R.string.table_reservation_item_view_typical_collect);
        string9.getClass();
        return String.format(string9, Arrays.copyOf(new Object[]{s(context, pickupIntervalL)}, 1));
    }

    public static final String u(Context context, PickupInterval pickupInterval) {
        context.getClass();
        pickupInterval.getClass();
        return r8.k.m(g(context, F(pickupInterval.getIntervalStart())), " - ", g(context, F(pickupInterval.getIntervalEnd())));
    }

    public static final String v(Context context, String str) {
        context.getClass();
        Date dateF = F(str);
        if (dateF == null) {
            dateF = new Date();
        }
        String str2 = new SimpleDateFormat(DateFormat.is24HourFormat(context) ? "HH:mm MMM dd" : "hh:mm a MMM dd", Locale.getDefault()).format(dateF);
        str2.getClass();
        return str2;
    }

    public static final String w() {
        Object obj = f30210b.get();
        obj.getClass();
        String str = ((SimpleDateFormat) obj).format(new Date());
        str.getClass();
        return str;
    }

    public static final ArrayList x(Calendar calendar) {
        calendar.getClass();
        calendar.set(7, calendar.getFirstDayOfWeek());
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 7; i11++) {
            Date time = calendar.getTime();
            time.getClass();
            arrayList.add(time);
            if (i11 < 6) {
                calendar.add(6, 1);
            } else {
                calendar.set(7, calendar.getFirstDayOfWeek());
            }
        }
        return arrayList;
    }

    public static final boolean y(String str) {
        return (str == null || str.length() == 0 || Duration.between(ZonedDateTime.now(), ZonedDateTime.parse(str)).toDays() >= ((long) 30)) ? false : true;
    }

    public static final boolean z(Date date, Date date2) {
        date.getClass();
        date2.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }
}
