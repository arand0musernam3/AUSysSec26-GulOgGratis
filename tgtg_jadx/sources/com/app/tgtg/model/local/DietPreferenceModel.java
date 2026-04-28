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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/local/DietPreferenceModel;", "", "nameRes", "", "<init>", "(Ljava/lang/String;II)V", "getNameRes", "()I", "VEGETARIAN", "VEGAN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DietPreferenceModel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DietPreferenceModel[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int nameRes;
    public static final DietPreferenceModel VEGETARIAN = new DietPreferenceModel("VEGETARIAN", 0, R.string.generic_preference_vegetarian);
    public static final DietPreferenceModel VEGAN = new DietPreferenceModel("VEGAN", 1, R.string.generic_preference_vegan);

    private static final /* synthetic */ DietPreferenceModel[] $values() {
        return new DietPreferenceModel[]{VEGETARIAN, VEGAN};
    }

    static {
        DietPreferenceModel[] dietPreferenceModelArr$values = $values();
        $VALUES = dietPreferenceModelArr$values;
        $ENTRIES = n.w(dietPreferenceModelArr$values);
        INSTANCE = new Companion(null);
    }

    private DietPreferenceModel(String str, int i11, int i12) {
        this.nameRes = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static DietPreferenceModel valueOf(String str) {
        return (DietPreferenceModel) Enum.valueOf(DietPreferenceModel.class, str);
    }

    public static DietPreferenceModel[] values() {
        return (DietPreferenceModel[]) $VALUES.clone();
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/local/DietPreferenceModel$Companion;", "", "<init>", "()V", "fromStringToList", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/local/DietPreferenceModel;", "Lkotlin/collections/ArrayList;", "input", "", "fromString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDietPreferenceModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DietPreferenceModel.kt\ncom/app/tgtg/model/local/DietPreferenceModel$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,44:1\n1586#2:45\n1661#2,3:46\n1915#2:49\n1916#2:52\n14048#3,2:50\n14048#3,2:53\n*S KotlinDebug\n*F\n+ 1 DietPreferenceModel.kt\ncom/app/tgtg/model/local/DietPreferenceModel$Companion\n*L\n14#1:45\n14#1:46,3\n16#1:49\n16#1:52\n17#1:50,2\n34#1:53,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final DietPreferenceModel fromString(@Nullable String input) {
            if (input == null) {
                return null;
            }
            for (DietPreferenceModel dietPreferenceModel : DietPreferenceModel.values()) {
                if (input.equalsIgnoreCase(dietPreferenceModel.name())) {
                    return dietPreferenceModel;
                }
            }
            return null;
        }

        @NotNull
        public final ArrayList<DietPreferenceModel> fromStringToList(@Nullable String input) {
            if (input != null) {
                ArrayList<DietPreferenceModel> arrayList = new ArrayList<>();
                List listSplit$default = StringsKt__StringsKt.split$default(input, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
                ArrayList<String> arrayList2 = new ArrayList(e0.o(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList2.add(StringsKt.e0((String) it.next()).toString());
                }
                for (String str : arrayList2) {
                    for (DietPreferenceModel dietPreferenceModel : DietPreferenceModel.values()) {
                        if (y.k(str, dietPreferenceModel.name(), true)) {
                            arrayList.add(dietPreferenceModel);
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
