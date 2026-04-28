package com.app.tgtg.model.local;

import a80.a;
import com.app.tgtg.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/app/tgtg/model/local/SortingPreference;", "", "nameRes", "", "<init>", "(Ljava/lang/String;II)V", "getNameRes", "()I", "RELEVANCE", "DISTANCE", "PRICE", "RATING", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SortingPreference {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SortingPreference[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int nameRes;
    public static final SortingPreference RELEVANCE = new SortingPreference("RELEVANCE", 0, R.string.discover_search_sorting_by_relevance);
    public static final SortingPreference DISTANCE = new SortingPreference("DISTANCE", 1, R.string.discover_search_sorting_by_distance);
    public static final SortingPreference PRICE = new SortingPreference("PRICE", 2, R.string.discover_search_sorting_by_price);
    public static final SortingPreference RATING = new SortingPreference("RATING", 3, R.string.discover_search_sorting_by_rating);

    private static final /* synthetic */ SortingPreference[] $values() {
        return new SortingPreference[]{RELEVANCE, DISTANCE, PRICE, RATING};
    }

    static {
        SortingPreference[] sortingPreferenceArr$values = $values();
        $VALUES = sortingPreferenceArr$values;
        $ENTRIES = n.w(sortingPreferenceArr$values);
        INSTANCE = new Companion(null);
    }

    private SortingPreference(String str, int i11, int i12) {
        this.nameRes = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SortingPreference valueOf(String str) {
        return (SortingPreference) Enum.valueOf(SortingPreference.class, str);
    }

    public static SortingPreference[] values() {
        return (SortingPreference[]) $VALUES.clone();
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/app/tgtg/model/local/SortingPreference$Companion;", "", "<init>", "()V", "getValueByString", "Lcom/app/tgtg/model/local/SortingPreference;", "strVal", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSortingPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortingPreference.kt\ncom/app/tgtg/model/local/SortingPreference$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,23:1\n14048#2,2:24\n*S KotlinDebug\n*F\n+ 1 SortingPreference.kt\ncom/app/tgtg/model/local/SortingPreference$Companion\n*L\n13#1:24,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SortingPreference getValueByString(@NotNull String strVal) {
            strVal.getClass();
            for (SortingPreference sortingPreference : SortingPreference.values()) {
                if (y.k(strVal, sortingPreference.name(), true)) {
                    return sortingPreference;
                }
            }
            return SortingPreference.RELEVANCE;
        }

        private Companion() {
        }
    }
}
