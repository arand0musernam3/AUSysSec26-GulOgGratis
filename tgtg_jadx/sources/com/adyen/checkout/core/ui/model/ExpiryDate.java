package com.adyen.checkout.core.ui.model;

import com.adyen.checkout.core.internal.ui.model.ExpiryDateExtKt;
import i4.a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/core/ui/model/ExpiryDate;", "", "expiryMonth", "", "expiryYear", "(II)V", "getExpiryMonth", "()I", "getExpiryYear", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toMMyyString", "", "toString", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ExpiryDate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DATE_FORMAT = "MM/yy";
    public static final int MAXIMUM_EXPIRED_MONTHS = 3;
    public static final int MAXIMUM_YEARS_IN_FUTURE = 30;
    private static final int YEARS_IN_CENTURY = 100;

    @NotNull
    private static final SimpleDateFormat dateFormat;
    private final int expiryMonth;
    private final int expiryYear;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.ROOT);
        dateFormat = simpleDateFormat;
        simpleDateFormat.setLenient(false);
    }

    public ExpiryDate(int i11, int i12) {
        this.expiryMonth = i11;
        this.expiryYear = i12;
    }

    public static /* synthetic */ ExpiryDate copy$default(ExpiryDate expiryDate, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = expiryDate.expiryMonth;
        }
        if ((i13 & 2) != 0) {
            i12 = expiryDate.expiryYear;
        }
        return expiryDate.copy(i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getExpiryYear() {
        return this.expiryYear;
    }

    @NotNull
    public final ExpiryDate copy(int expiryMonth, int expiryYear) {
        return new ExpiryDate(expiryMonth, expiryYear);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiryDate)) {
            return false;
        }
        ExpiryDate expiryDate = (ExpiryDate) other;
        return this.expiryMonth == expiryDate.expiryMonth && this.expiryYear == expiryDate.expiryYear;
    }

    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    public final int getExpiryYear() {
        return this.expiryYear;
    }

    public int hashCode() {
        return Integer.hashCode(this.expiryYear) + (Integer.hashCode(this.expiryMonth) * 31);
    }

    @NotNull
    public final String toMMyyString() {
        return ExpiryDateExtKt.toMMyyString(String.valueOf(this.expiryMonth), String.valueOf(this.expiryYear));
    }

    @NotNull
    public String toString() {
        return k.g(this.expiryMonth, this.expiryYear, "ExpiryDate(expiryMonth=", ", expiryYear=", ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/core/ui/model/ExpiryDate$Companion;", "", "()V", "DATE_FORMAT", "", "MAXIMUM_EXPIRED_MONTHS", "", "MAXIMUM_YEARS_IN_FUTURE", "YEARS_IN_CENTURY", "dateFormat", "Ljava/text/SimpleDateFormat;", "fixCalendarYear", "", "calendar", "Ljava/util/Calendar;", "from", "Lcom/adyen/checkout/core/ui/model/ExpiryDate;", "expiryDate", "getExpiryCalendar", "getExpiryCalendar$checkout_core_release", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void fixCalendarYear(Calendar calendar) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 30);
            if (calendar.get(1) / 100 < calendar2.get(1) / 100) {
                calendar.add(1, 100);
            }
        }

        @NotNull
        public final ExpiryDate from(@NotNull String expiryDate) {
            expiryDate.getClass();
            try {
                Calendar expiryCalendar$checkout_core_release = getExpiryCalendar$checkout_core_release(expiryDate);
                return new ExpiryDate(expiryCalendar$checkout_core_release.get(2) + 1, expiryCalendar$checkout_core_release.get(1));
            } catch (ParseException unused) {
                return ExpiryDateExtKt.INVALID_DATE;
            }
        }

        @NotNull
        public final Calendar getExpiryCalendar$checkout_core_release(@NotNull String expiryDate) throws ParseException {
            expiryDate.getClass();
            Date date = ExpiryDate.dateFormat.parse(expiryDate);
            if (date == null) {
                a.f("Required value was null.");
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            fixCalendarYear(calendar);
            calendar.add(2, 1);
            calendar.add(5, -1);
            return calendar;
        }

        private Companion() {
        }
    }
}
