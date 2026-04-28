package com.app.tgtg.model.remote.user.requests;

import a80.a;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/CollectionTime;", "", "rawValue", "", "fullLabelRes", "", "shortLabelRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "getRawValue", "()Ljava/lang/String;", "getFullLabelRes", "()I", "getShortLabelRes", "EARLY_MORNING", "LATE_MORNING", "MIDDAY", "AFTERNOON", "EVENING", "LATE_NIGHT", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CollectionTime {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CollectionTime[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int fullLabelRes;

    @NotNull
    private final String rawValue;
    private final int shortLabelRes;
    public static final CollectionTime EARLY_MORNING = new CollectionTime("EARLY_MORNING", 0, "early_morning", R.string.preferred_collection_time_early_morning, R.string.preferred_collection_time_early_morning_short);
    public static final CollectionTime LATE_MORNING = new CollectionTime("LATE_MORNING", 1, "late_morning", R.string.preferred_collection_time_late_morning, R.string.preferred_collection_time_late_morning_short);
    public static final CollectionTime MIDDAY = new CollectionTime("MIDDAY", 2, "midday", R.string.preferred_collection_time_midday, R.string.preferred_collection_time_midday_short);
    public static final CollectionTime AFTERNOON = new CollectionTime("AFTERNOON", 3, "afternoon", R.string.preferred_collection_time_afternoon, R.string.preferred_collection_time_afternoon_short);
    public static final CollectionTime EVENING = new CollectionTime("EVENING", 4, "evening", R.string.preferred_collection_time_evening, R.string.preferred_collection_time_evening_short);
    public static final CollectionTime LATE_NIGHT = new CollectionTime("LATE_NIGHT", 5, "late_night", R.string.preferred_collection_time_late_night, R.string.preferred_collection_time_late_night_short);

    private static final /* synthetic */ CollectionTime[] $values() {
        return new CollectionTime[]{EARLY_MORNING, LATE_MORNING, MIDDAY, AFTERNOON, EVENING, LATE_NIGHT};
    }

    static {
        CollectionTime[] collectionTimeArr$values = $values();
        $VALUES = collectionTimeArr$values;
        $ENTRIES = n.w(collectionTimeArr$values);
        INSTANCE = new Companion(null);
    }

    private CollectionTime(String str, int i11, String str2, int i12, int i13) {
        this.rawValue = str2;
        this.fullLabelRes = i12;
        this.shortLabelRes = i13;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CollectionTime valueOf(String str) {
        return (CollectionTime) Enum.valueOf(CollectionTime.class, str);
    }

    public static CollectionTime[] values() {
        return (CollectionTime[]) $VALUES.clone();
    }

    public final int getFullLabelRes() {
        return this.fullLabelRes;
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }

    public final int getShortLabelRes() {
        return this.shortLabelRes;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/CollectionTime$Companion;", "", "<init>", "()V", "fromRawValue", "Lcom/app/tgtg/model/remote/user/requests/CollectionTime;", "raw", "", "toRawValues", "", "times", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCollectionTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionTime.kt\ncom/app/tgtg/model/remote/user/requests/CollectionTime$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1#2:45\n1586#3:46\n1661#3,3:47\n*S KotlinDebug\n*F\n+ 1 CollectionTime.kt\ncom/app/tgtg/model/remote/user/requests/CollectionTime$Companion\n*L\n40#1:46\n40#1:47,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CollectionTime fromRawValue(@NotNull String raw) {
            Object next;
            raw.getClass();
            Iterator<E> it = CollectionTime.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((CollectionTime) next).getRawValue(), raw)) {
                    break;
                }
            }
            return (CollectionTime) next;
        }

        @NotNull
        public final List<String> toRawValues(@NotNull List<? extends CollectionTime> times) {
            times.getClass();
            ArrayList arrayList = new ArrayList(e0.o(times, 10));
            Iterator<T> it = times.iterator();
            while (it.hasNext()) {
                arrayList.add(((CollectionTime) it.next()).getRawValue());
            }
            return arrayList;
        }

        private Companion() {
        }
    }
}
