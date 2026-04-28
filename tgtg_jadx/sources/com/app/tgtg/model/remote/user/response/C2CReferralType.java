package com.app.tgtg.model.remote.user.response;

import a80.a;
import i90.g;
import i90.h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = C2CReferralTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/C2CReferralType;", "", "<init>", "(Ljava/lang/String;I)V", "ALWAYS_ON", "PERSON_A_INCENTIVIZED", "ALWAYS_ON_PERSON_A_INCENTIVISED", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class C2CReferralType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ C2CReferralType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("ALWAYS_ON")
    public static final C2CReferralType ALWAYS_ON = new C2CReferralType("ALWAYS_ON", 0);

    @g("PERSON_A_INCENTIVIZED")
    public static final C2CReferralType PERSON_A_INCENTIVIZED = new C2CReferralType("PERSON_A_INCENTIVIZED", 1);

    @g("ALWAYS_ON_PERSON_A_INCENTIVISED")
    public static final C2CReferralType ALWAYS_ON_PERSON_A_INCENTIVISED = new C2CReferralType("ALWAYS_ON_PERSON_A_INCENTIVISED", 2);
    public static final C2CReferralType UNKNOWN = new C2CReferralType("UNKNOWN", 3);

    private static final /* synthetic */ C2CReferralType[] $values() {
        return new C2CReferralType[]{ALWAYS_ON, PERSON_A_INCENTIVIZED, ALWAYS_ON_PERSON_A_INCENTIVISED, UNKNOWN};
    }

    static {
        C2CReferralType[] c2CReferralTypeArr$values = $values();
        $VALUES = c2CReferralTypeArr$values;
        $ENTRIES = n.w(c2CReferralTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private C2CReferralType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static C2CReferralType valueOf(String str) {
        return (C2CReferralType) Enum.valueOf(C2CReferralType.class, str);
    }

    public static C2CReferralType[] values() {
        return (C2CReferralType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/C2CReferralType$Companion;", "", "<init>", "()V", "findByKey", "Lcom/app/tgtg/model/remote/user/response/C2CReferralType;", "key", "", "default", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nC2CReferralResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 C2CReferralResponse.kt\ncom/app/tgtg/model/remote/user/response/C2CReferralType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C2CReferralType findByKey$default(Companion companion, String str, C2CReferralType c2CReferralType, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                c2CReferralType = C2CReferralType.UNKNOWN;
            }
            return companion.findByKey(str, c2CReferralType);
        }

        @NotNull
        public final C2CReferralType findByKey(@NotNull String key, @NotNull C2CReferralType c2CReferralType) {
            Object next;
            key.getClass();
            c2CReferralType.getClass();
            Iterator<E> it = C2CReferralType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (y.k(((C2CReferralType) next).name(), key, true)) {
                    break;
                }
            }
            C2CReferralType c2CReferralType2 = (C2CReferralType) next;
            return c2CReferralType2 == null ? c2CReferralType : c2CReferralType2;
        }

        @NotNull
        public final KSerializer serializer() {
            return C2CReferralTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
