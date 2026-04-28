package com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model;

import a80.a;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/HiddenStoreUnlockState;", "", "state", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getState", "()Ljava/lang/String;", "OK", "ALREADY_UNLOCKED", "CODE_INVALID", "NONE", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HiddenStoreUnlockState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HiddenStoreUnlockState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String state;
    public static final HiddenStoreUnlockState OK = new HiddenStoreUnlockState("OK", 0, "OK");
    public static final HiddenStoreUnlockState ALREADY_UNLOCKED = new HiddenStoreUnlockState("ALREADY_UNLOCKED", 1, "ALREADY_UNLOCKED");
    public static final HiddenStoreUnlockState CODE_INVALID = new HiddenStoreUnlockState("CODE_INVALID", 2, "CODE_INVALID");
    public static final HiddenStoreUnlockState NONE = new HiddenStoreUnlockState("NONE", 3, "NONE");

    private static final /* synthetic */ HiddenStoreUnlockState[] $values() {
        return new HiddenStoreUnlockState[]{OK, ALREADY_UNLOCKED, CODE_INVALID, NONE};
    }

    static {
        HiddenStoreUnlockState[] hiddenStoreUnlockStateArr$values = $values();
        $VALUES = hiddenStoreUnlockStateArr$values;
        $ENTRIES = n.w(hiddenStoreUnlockStateArr$values);
        INSTANCE = new Companion(null);
    }

    private HiddenStoreUnlockState(String str, int i11, String str2) {
        this.state = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static HiddenStoreUnlockState valueOf(String str) {
        return (HiddenStoreUnlockState) Enum.valueOf(HiddenStoreUnlockState.class, str);
    }

    public static HiddenStoreUnlockState[] values() {
        return (HiddenStoreUnlockState[]) $VALUES.clone();
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/HiddenStoreUnlockState$Companion;", "", "<init>", "()V", "fromString", "Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/HiddenStoreUnlockState;", "hiddenStoreUnlockState", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHiddenStoreUnlockState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HiddenStoreUnlockState.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/HiddenStoreUnlockState$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayExt.kt\ncom/tgtg/core/common/ext/ArrayExtKt\n*L\n1#1,17:1\n37#2,2:18\n4#3,3:20\n*S KotlinDebug\n*F\n+ 1 HiddenStoreUnlockState.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/HiddenStoreUnlockState$Companion\n*L\n13#1:18,2\n13#1:20,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HiddenStoreUnlockState fromString(@Nullable String hiddenStoreUnlockState) {
            int i11 = 0;
            Object[] array = HiddenStoreUnlockState.getEntries().toArray(new HiddenStoreUnlockState[0]);
            Object obj = HiddenStoreUnlockState.NONE;
            int length = array.length;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Object obj2 = array[i11];
                if (Intrinsics.areEqual(((HiddenStoreUnlockState) obj2).getState(), hiddenStoreUnlockState)) {
                    obj = obj2;
                    break;
                }
                i11++;
            }
            return (HiddenStoreUnlockState) obj;
        }

        private Companion() {
        }
    }
}
