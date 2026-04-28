package com.app.tgtg.model.remote;

import a80.a;
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
@h(with = UserTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/app/tgtg/model/remote/UserType;", "", "<init>", "(Ljava/lang/String;I)V", "USER", "CHARITY_USER", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final UserType USER = new UserType("USER", 0);
    public static final UserType CHARITY_USER = new UserType("CHARITY_USER", 1);
    public static final UserType UNKNOWN = new UserType("UNKNOWN", 2);

    private static final /* synthetic */ UserType[] $values() {
        return new UserType[]{USER, CHARITY_USER, UNKNOWN};
    }

    static {
        UserType[] userTypeArr$values = $values();
        $VALUES = userTypeArr$values;
        $ENTRIES = n.w(userTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private UserType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static UserType valueOf(String str) {
        return (UserType) Enum.valueOf(UserType.class, str);
    }

    public static UserType[] values() {
        return (UserType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/UserType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/UserType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
