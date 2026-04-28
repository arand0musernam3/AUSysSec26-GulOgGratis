package zendesk.ui.android.conversation.waittimebanner;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "", "<init>", "()V", "Cleared", "Assigned", "Queued", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType$Assigned;", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType$Cleared;", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType$Queued;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class WaitTimeBannerType {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType$Assigned;", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Assigned extends WaitTimeBannerType {
        public static final int $stable = 0;

        @NotNull
        public static final Assigned INSTANCE = new Assigned();

        private Assigned() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Assigned);
        }

        public int hashCode() {
            return -1011248552;
        }

        @NotNull
        public String toString() {
            return "Assigned";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType$Cleared;", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cleared extends WaitTimeBannerType {
        public static final int $stable = 0;

        @NotNull
        public static final Cleared INSTANCE = new Cleared();

        private Cleared() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Cleared);
        }

        public int hashCode() {
            return 1805919714;
        }

        @NotNull
        public String toString() {
            return "Cleared";
        }
    }

    public /* synthetic */ WaitTimeBannerType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WaitTimeBannerType() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType$Queued;", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "shouldShowResponseTime", "", "responseTime", "Lzendesk/ui/android/conversation/waittimebanner/ResponseTime;", "shouldShowQueue", "queuePosition", "", "lowestQueuePosition", "<init>", "(ZLzendesk/ui/android/conversation/waittimebanner/ResponseTime;ZII)V", "getShouldShowResponseTime", "()Z", "getResponseTime", "()Lzendesk/ui/android/conversation/waittimebanner/ResponseTime;", "getShouldShowQueue", "getQueuePosition", "()I", "getLowestQueuePosition", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Queued extends WaitTimeBannerType {
        public static final int $stable = 0;
        private final int lowestQueuePosition;
        private final int queuePosition;

        @NotNull
        private final ResponseTime responseTime;
        private final boolean shouldShowQueue;
        private final boolean shouldShowResponseTime;

        public /* synthetic */ Queued(boolean z11, ResponseTime responseTime, boolean z12, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, responseTime, z12, (i13 & 8) != 0 ? 1 : i11, (i13 & 16) != 0 ? 1 : i12);
        }

        public static /* synthetic */ Queued copy$default(Queued queued, boolean z11, ResponseTime responseTime, boolean z12, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z11 = queued.shouldShowResponseTime;
            }
            if ((i13 & 2) != 0) {
                responseTime = queued.responseTime;
            }
            if ((i13 & 4) != 0) {
                z12 = queued.shouldShowQueue;
            }
            if ((i13 & 8) != 0) {
                i11 = queued.queuePosition;
            }
            if ((i13 & 16) != 0) {
                i12 = queued.lowestQueuePosition;
            }
            int i14 = i12;
            boolean z13 = z12;
            return queued.copy(z11, responseTime, z13, i11, i14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShouldShowResponseTime() {
            return this.shouldShowResponseTime;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ResponseTime getResponseTime() {
            return this.responseTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShouldShowQueue() {
            return this.shouldShowQueue;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getQueuePosition() {
            return this.queuePosition;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getLowestQueuePosition() {
            return this.lowestQueuePosition;
        }

        @NotNull
        public final Queued copy(boolean shouldShowResponseTime, @NotNull ResponseTime responseTime, boolean shouldShowQueue, int queuePosition, int lowestQueuePosition) {
            responseTime.getClass();
            return new Queued(shouldShowResponseTime, responseTime, shouldShowQueue, queuePosition, lowestQueuePosition);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Queued)) {
                return false;
            }
            Queued queued = (Queued) other;
            return this.shouldShowResponseTime == queued.shouldShowResponseTime && Intrinsics.areEqual(this.responseTime, queued.responseTime) && this.shouldShowQueue == queued.shouldShowQueue && this.queuePosition == queued.queuePosition && this.lowestQueuePosition == queued.lowestQueuePosition;
        }

        public final int getLowestQueuePosition() {
            return this.lowestQueuePosition;
        }

        public final int getQueuePosition() {
            return this.queuePosition;
        }

        @NotNull
        public final ResponseTime getResponseTime() {
            return this.responseTime;
        }

        public final boolean getShouldShowQueue() {
            return this.shouldShowQueue;
        }

        public final boolean getShouldShowResponseTime() {
            return this.shouldShowResponseTime;
        }

        public int hashCode() {
            return Integer.hashCode(this.lowestQueuePosition) + k.b(this.queuePosition, k.e((this.responseTime.hashCode() + (Boolean.hashCode(this.shouldShowResponseTime) * 31)) * 31, 31, this.shouldShowQueue), 31);
        }

        @NotNull
        public String toString() {
            boolean z11 = this.shouldShowResponseTime;
            ResponseTime responseTime = this.responseTime;
            boolean z12 = this.shouldShowQueue;
            int i11 = this.queuePosition;
            int i12 = this.lowestQueuePosition;
            StringBuilder sb2 = new StringBuilder("Queued(shouldShowResponseTime=");
            sb2.append(z11);
            sb2.append(", responseTime=");
            sb2.append(responseTime);
            sb2.append(", shouldShowQueue=");
            sb2.append(z12);
            sb2.append(", queuePosition=");
            sb2.append(i11);
            sb2.append(", lowestQueuePosition=");
            return k.i(i12, ")", sb2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Queued(boolean z11, @NotNull ResponseTime responseTime, boolean z12, int i11, int i12) {
            super(null);
            responseTime.getClass();
            this.shouldShowResponseTime = z11;
            this.responseTime = responseTime;
            this.shouldShowQueue = z12;
            this.queuePosition = i11;
            this.lowestQueuePosition = i12;
        }
    }
}
