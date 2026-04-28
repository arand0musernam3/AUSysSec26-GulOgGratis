package com.app.tgtg.model.local;

import a80.a;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/local/CollectionDayModel;", "", "nameRes", "", "<init>", "(Ljava/lang/String;II)V", "getNameRes", "()I", "TODAY", "TOMORROW", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CollectionDayModel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CollectionDayModel[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CollectionDayModel TODAY = new CollectionDayModel("TODAY", 0, R.string.filters_collection_day_today_option);
    public static final CollectionDayModel TOMORROW = new CollectionDayModel("TOMORROW", 1, R.string.filters_collection_day_tomorrow_option);
    private final int nameRes;

    private static final /* synthetic */ CollectionDayModel[] $values() {
        return new CollectionDayModel[]{TODAY, TOMORROW};
    }

    static {
        CollectionDayModel[] collectionDayModelArr$values = $values();
        $VALUES = collectionDayModelArr$values;
        $ENTRIES = n.w(collectionDayModelArr$values);
        INSTANCE = new Companion(null);
    }

    private CollectionDayModel(String str, int i11, int i12) {
        this.nameRes = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CollectionDayModel valueOf(String str) {
        return (CollectionDayModel) Enum.valueOf(CollectionDayModel.class, str);
    }

    public static CollectionDayModel[] values() {
        return (CollectionDayModel[]) $VALUES.clone();
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/local/CollectionDayModel$Companion;", "", "<init>", "()V", "fromStringToList", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/local/CollectionDayModel;", "Lkotlin/collections/ArrayList;", "input", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCollectionDayModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDayModel.kt\ncom/app/tgtg/model/local/CollectionDayModel$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,33:1\n1586#2:34\n1661#2,3:35\n1915#2:38\n1916#2:41\n14048#3,2:39\n*S KotlinDebug\n*F\n+ 1 CollectionDayModel.kt\ncom/app/tgtg/model/local/CollectionDayModel$Companion\n*L\n14#1:34\n14#1:35,3\n16#1:38\n16#1:41\n17#1:39,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ArrayList<CollectionDayModel> fromStringToList(@Nullable String input) {
            if (input != null) {
                ArrayList<CollectionDayModel> arrayList = new ArrayList<>();
                List listSplit$default = StringsKt__StringsKt.split$default(input, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
                ArrayList<String> arrayList2 = new ArrayList(e0.o(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList2.add(StringsKt.e0((String) it.next()).toString());
                }
                for (String str : arrayList2) {
                    for (CollectionDayModel collectionDayModel : CollectionDayModel.values()) {
                        if (y.k(str, collectionDayModel.name(), true)) {
                            arrayList.add(collectionDayModel);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    return arrayList;
                }
            }
            return new ArrayList<>();
        }

        private Companion() {
        }
    }
}
