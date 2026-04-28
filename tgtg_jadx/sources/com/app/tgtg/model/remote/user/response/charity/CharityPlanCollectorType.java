package com.app.tgtg.model.remote.user.response.charity;

import a80.a;
import com.app.tgtg.R;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = CharityPlanCollectorTypeSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityPlanCollectorType;", "", "nameRes", "", "<init>", "(Ljava/lang/String;II)V", "getNameRes", "()I", "PRIMARY", "BACKUP", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CharityPlanCollectorType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CharityPlanCollectorType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int nameRes;

    @g("PRIMARY")
    public static final CharityPlanCollectorType PRIMARY = new CharityPlanCollectorType("PRIMARY", 0, R.string.charity_plan_primary_collector);

    @g("BACKUP")
    public static final CharityPlanCollectorType BACKUP = new CharityPlanCollectorType("BACKUP", 1, R.string.charity_plan_backup_collector);

    @g("UNKNOWN")
    public static final CharityPlanCollectorType UNKNOWN = new CharityPlanCollectorType("UNKNOWN", 2, 0);

    private static final /* synthetic */ CharityPlanCollectorType[] $values() {
        return new CharityPlanCollectorType[]{PRIMARY, BACKUP, UNKNOWN};
    }

    static {
        CharityPlanCollectorType[] charityPlanCollectorTypeArr$values = $values();
        $VALUES = charityPlanCollectorTypeArr$values;
        $ENTRIES = n.w(charityPlanCollectorTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private CharityPlanCollectorType(String str, int i11, int i12) {
        this.nameRes = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CharityPlanCollectorType valueOf(String str) {
        return (CharityPlanCollectorType) Enum.valueOf(CharityPlanCollectorType.class, str);
    }

    public static CharityPlanCollectorType[] values() {
        return (CharityPlanCollectorType[]) $VALUES.clone();
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityPlanCollectorType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityPlanCollectorType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CharityPlanCollectorTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
