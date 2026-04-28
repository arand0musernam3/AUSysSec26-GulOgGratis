package zendesk.ui.android.conversation.waittimebanner;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "", "resId", "", "<init>", "(I)V", "getResId", "()I", "WithinDays", "AboutDays", "DailyRange", "WithinHours", "AboutHours", "HourlyRange", "WithinMinutes", "AboutMinutes", "MinuteRange", "WithinMinute", "AboutMinute", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$AboutDays;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$AboutHours;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$AboutMinute;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$AboutMinutes;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$DailyRange;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$HourlyRange;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$MinuteRange;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$WithinDays;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$WithinHours;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$WithinMinute;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$WithinMinutes;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class QueuedBannerStatusType {
    public static final int $stable = 0;
    private final int resId;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$AboutDays;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "upperDays", "", "<init>", "(I)V", "getUpperDays", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AboutDays extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int upperDays;

        public AboutDays(int i11) {
            super(R.string.zuia_static_wait_time_banner_join_about_days, null);
            this.upperDays = i11;
        }

        public static /* synthetic */ AboutDays copy$default(AboutDays aboutDays, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aboutDays.upperDays;
            }
            return aboutDays.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getUpperDays() {
            return this.upperDays;
        }

        @NotNull
        public final AboutDays copy(int upperDays) {
            return new AboutDays(upperDays);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AboutDays) && this.upperDays == ((AboutDays) other).upperDays;
        }

        public final int getUpperDays() {
            return this.upperDays;
        }

        public int hashCode() {
            return Integer.hashCode(this.upperDays);
        }

        @NotNull
        public String toString() {
            return k.h(this.upperDays, "AboutDays(upperDays=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$AboutHours;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "upperHours", "", "<init>", "(I)V", "getUpperHours", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AboutHours extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int upperHours;

        public AboutHours(int i11) {
            super(R.string.zuia_static_wait_time_banner_join_about_hours, null);
            this.upperHours = i11;
        }

        public static /* synthetic */ AboutHours copy$default(AboutHours aboutHours, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aboutHours.upperHours;
            }
            return aboutHours.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getUpperHours() {
            return this.upperHours;
        }

        @NotNull
        public final AboutHours copy(int upperHours) {
            return new AboutHours(upperHours);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AboutHours) && this.upperHours == ((AboutHours) other).upperHours;
        }

        public final int getUpperHours() {
            return this.upperHours;
        }

        public int hashCode() {
            return Integer.hashCode(this.upperHours);
        }

        @NotNull
        public String toString() {
            return k.h(this.upperHours, "AboutHours(upperHours=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$AboutMinutes;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "upperMinutes", "", "<init>", "(I)V", "getUpperMinutes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AboutMinutes extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int upperMinutes;

        public AboutMinutes(int i11) {
            super(R.string.zuia_static_wait_time_banner_join_about_minutes, null);
            this.upperMinutes = i11;
        }

        public static /* synthetic */ AboutMinutes copy$default(AboutMinutes aboutMinutes, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aboutMinutes.upperMinutes;
            }
            return aboutMinutes.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getUpperMinutes() {
            return this.upperMinutes;
        }

        @NotNull
        public final AboutMinutes copy(int upperMinutes) {
            return new AboutMinutes(upperMinutes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AboutMinutes) && this.upperMinutes == ((AboutMinutes) other).upperMinutes;
        }

        public final int getUpperMinutes() {
            return this.upperMinutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.upperMinutes);
        }

        @NotNull
        public String toString() {
            return k.h(this.upperMinutes, "AboutMinutes(upperMinutes=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$DailyRange;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "lowerDays", "", "upperDays", "<init>", "(II)V", "getLowerDays", "()I", "getUpperDays", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DailyRange extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int lowerDays;
        private final int upperDays;

        public DailyRange(int i11, int i12) {
            super(R.string.zuia_static_wait_time_banner_join_days, null);
            this.lowerDays = i11;
            this.upperDays = i12;
        }

        public static /* synthetic */ DailyRange copy$default(DailyRange dailyRange, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = dailyRange.lowerDays;
            }
            if ((i13 & 2) != 0) {
                i12 = dailyRange.upperDays;
            }
            return dailyRange.copy(i11, i12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getLowerDays() {
            return this.lowerDays;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getUpperDays() {
            return this.upperDays;
        }

        @NotNull
        public final DailyRange copy(int lowerDays, int upperDays) {
            return new DailyRange(lowerDays, upperDays);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DailyRange)) {
                return false;
            }
            DailyRange dailyRange = (DailyRange) other;
            return this.lowerDays == dailyRange.lowerDays && this.upperDays == dailyRange.upperDays;
        }

        public final int getLowerDays() {
            return this.lowerDays;
        }

        public final int getUpperDays() {
            return this.upperDays;
        }

        public int hashCode() {
            return Integer.hashCode(this.upperDays) + (Integer.hashCode(this.lowerDays) * 31);
        }

        @NotNull
        public String toString() {
            return k.g(this.lowerDays, this.upperDays, "DailyRange(lowerDays=", ", upperDays=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$HourlyRange;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "lowerHours", "", "upperHours", "<init>", "(II)V", "getLowerHours", "()I", "getUpperHours", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HourlyRange extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int lowerHours;
        private final int upperHours;

        public HourlyRange(int i11, int i12) {
            super(R.string.zuia_static_wait_time_banner_join_hours, null);
            this.lowerHours = i11;
            this.upperHours = i12;
        }

        public static /* synthetic */ HourlyRange copy$default(HourlyRange hourlyRange, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = hourlyRange.lowerHours;
            }
            if ((i13 & 2) != 0) {
                i12 = hourlyRange.upperHours;
            }
            return hourlyRange.copy(i11, i12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getLowerHours() {
            return this.lowerHours;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getUpperHours() {
            return this.upperHours;
        }

        @NotNull
        public final HourlyRange copy(int lowerHours, int upperHours) {
            return new HourlyRange(lowerHours, upperHours);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HourlyRange)) {
                return false;
            }
            HourlyRange hourlyRange = (HourlyRange) other;
            return this.lowerHours == hourlyRange.lowerHours && this.upperHours == hourlyRange.upperHours;
        }

        public final int getLowerHours() {
            return this.lowerHours;
        }

        public final int getUpperHours() {
            return this.upperHours;
        }

        public int hashCode() {
            return Integer.hashCode(this.upperHours) + (Integer.hashCode(this.lowerHours) * 31);
        }

        @NotNull
        public String toString() {
            return k.g(this.lowerHours, this.upperHours, "HourlyRange(lowerHours=", ", upperHours=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$MinuteRange;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "lowerMinutes", "", "upperMinutes", "<init>", "(II)V", "getLowerMinutes", "()I", "getUpperMinutes", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MinuteRange extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int lowerMinutes;
        private final int upperMinutes;

        public MinuteRange(int i11, int i12) {
            super(R.string.zuia_static_wait_time_banner_join_minutes, null);
            this.lowerMinutes = i11;
            this.upperMinutes = i12;
        }

        public static /* synthetic */ MinuteRange copy$default(MinuteRange minuteRange, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = minuteRange.lowerMinutes;
            }
            if ((i13 & 2) != 0) {
                i12 = minuteRange.upperMinutes;
            }
            return minuteRange.copy(i11, i12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getLowerMinutes() {
            return this.lowerMinutes;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getUpperMinutes() {
            return this.upperMinutes;
        }

        @NotNull
        public final MinuteRange copy(int lowerMinutes, int upperMinutes) {
            return new MinuteRange(lowerMinutes, upperMinutes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MinuteRange)) {
                return false;
            }
            MinuteRange minuteRange = (MinuteRange) other;
            return this.lowerMinutes == minuteRange.lowerMinutes && this.upperMinutes == minuteRange.upperMinutes;
        }

        public final int getLowerMinutes() {
            return this.lowerMinutes;
        }

        public final int getUpperMinutes() {
            return this.upperMinutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.upperMinutes) + (Integer.hashCode(this.lowerMinutes) * 31);
        }

        @NotNull
        public String toString() {
            return k.g(this.lowerMinutes, this.upperMinutes, "MinuteRange(lowerMinutes=", ", upperMinutes=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$WithinDays;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "upperDays", "", "<init>", "(I)V", "getUpperDays", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WithinDays extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int upperDays;

        public WithinDays(int i11) {
            super(R.string.zuia_static_wait_time_banner_join_within_days, null);
            this.upperDays = i11;
        }

        public static /* synthetic */ WithinDays copy$default(WithinDays withinDays, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = withinDays.upperDays;
            }
            return withinDays.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getUpperDays() {
            return this.upperDays;
        }

        @NotNull
        public final WithinDays copy(int upperDays) {
            return new WithinDays(upperDays);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithinDays) && this.upperDays == ((WithinDays) other).upperDays;
        }

        public final int getUpperDays() {
            return this.upperDays;
        }

        public int hashCode() {
            return Integer.hashCode(this.upperDays);
        }

        @NotNull
        public String toString() {
            return k.h(this.upperDays, "WithinDays(upperDays=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$WithinHours;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "upperHours", "", "<init>", "(I)V", "getUpperHours", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WithinHours extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int upperHours;

        public WithinHours(int i11) {
            super(R.string.zuia_static_wait_time_banner_join_within_hours, null);
            this.upperHours = i11;
        }

        public static /* synthetic */ WithinHours copy$default(WithinHours withinHours, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = withinHours.upperHours;
            }
            return withinHours.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getUpperHours() {
            return this.upperHours;
        }

        @NotNull
        public final WithinHours copy(int upperHours) {
            return new WithinHours(upperHours);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithinHours) && this.upperHours == ((WithinHours) other).upperHours;
        }

        public final int getUpperHours() {
            return this.upperHours;
        }

        public int hashCode() {
            return Integer.hashCode(this.upperHours);
        }

        @NotNull
        public String toString() {
            return k.h(this.upperHours, "WithinHours(upperHours=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$WithinMinutes;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "upperMinutes", "", "<init>", "(I)V", "getUpperMinutes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WithinMinutes extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int upperMinutes;

        public WithinMinutes(int i11) {
            super(R.string.zuia_static_wait_time_banner_join_within_minutes, null);
            this.upperMinutes = i11;
        }

        public static /* synthetic */ WithinMinutes copy$default(WithinMinutes withinMinutes, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = withinMinutes.upperMinutes;
            }
            return withinMinutes.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getUpperMinutes() {
            return this.upperMinutes;
        }

        @NotNull
        public final WithinMinutes copy(int upperMinutes) {
            return new WithinMinutes(upperMinutes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithinMinutes) && this.upperMinutes == ((WithinMinutes) other).upperMinutes;
        }

        public final int getUpperMinutes() {
            return this.upperMinutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.upperMinutes);
        }

        @NotNull
        public String toString() {
            return k.h(this.upperMinutes, "WithinMinutes(upperMinutes=", ")");
        }
    }

    private QueuedBannerStatusType(int i11) {
        this.resId = i11;
    }

    public final int getResId() {
        return this.resId;
    }

    public /* synthetic */ QueuedBannerStatusType(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$AboutMinute;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "minute", "", "<init>", "(I)V", "getMinute", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AboutMinute extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int minute;

        public /* synthetic */ AboutMinute(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 1 : i11);
        }

        public static /* synthetic */ AboutMinute copy$default(AboutMinute aboutMinute, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aboutMinute.minute;
            }
            return aboutMinute.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMinute() {
            return this.minute;
        }

        @NotNull
        public final AboutMinute copy(int minute) {
            return new AboutMinute(minute);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AboutMinute) && this.minute == ((AboutMinute) other).minute;
        }

        public final int getMinute() {
            return this.minute;
        }

        public int hashCode() {
            return Integer.hashCode(this.minute);
        }

        @NotNull
        public String toString() {
            return k.h(this.minute, "AboutMinute(minute=", ")");
        }

        public AboutMinute() {
            this(0, 1, null);
        }

        public AboutMinute(int i11) {
            super(R.string.zuia_static_wait_time_banner_join_about_minute, null);
            this.minute = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType$WithinMinute;", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "minute", "", "<init>", "(I)V", "getMinute", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WithinMinute extends QueuedBannerStatusType {
        public static final int $stable = 0;
        private final int minute;

        public /* synthetic */ WithinMinute(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 1 : i11);
        }

        public static /* synthetic */ WithinMinute copy$default(WithinMinute withinMinute, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = withinMinute.minute;
            }
            return withinMinute.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMinute() {
            return this.minute;
        }

        @NotNull
        public final WithinMinute copy(int minute) {
            return new WithinMinute(minute);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithinMinute) && this.minute == ((WithinMinute) other).minute;
        }

        public final int getMinute() {
            return this.minute;
        }

        public int hashCode() {
            return Integer.hashCode(this.minute);
        }

        @NotNull
        public String toString() {
            return k.h(this.minute, "WithinMinute(minute=", ")");
        }

        public WithinMinute() {
            this(0, 1, null);
        }

        public WithinMinute(int i11) {
            super(R.string.zuia_static_wait_time_banner_join_within_minute, null);
            this.minute = i11;
        }
    }
}
