package com.app.tgtg.model.remote.user.response;

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
@h(with = AddressFieldSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/AddressField;", "", "<init>", "(Ljava/lang/String;I)V", "NAME", "EMAIL", "PHONE_NUMBER", "PHONE_COUNTRY_CODE", "ADDRESS_LINE1", "ADDRESS_LINE2", "STREET_NAME", "HOUSE_NUMBER", "HOUSE_NUMBER_ADDITION", "CITY", "POSTAL_CODE", "COUNTRY_CODE", "STATE", "DELIVERY_ACCESS_CODE", "DELIVERY_NO_ACCESS_CODE", "DELIVERY_INSTRUCTIONS", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddressField {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AddressField[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AddressField NAME = new AddressField("NAME", 0);
    public static final AddressField EMAIL = new AddressField("EMAIL", 1);
    public static final AddressField PHONE_NUMBER = new AddressField("PHONE_NUMBER", 2);
    public static final AddressField PHONE_COUNTRY_CODE = new AddressField("PHONE_COUNTRY_CODE", 3);
    public static final AddressField ADDRESS_LINE1 = new AddressField("ADDRESS_LINE1", 4);
    public static final AddressField ADDRESS_LINE2 = new AddressField("ADDRESS_LINE2", 5);
    public static final AddressField STREET_NAME = new AddressField("STREET_NAME", 6);
    public static final AddressField HOUSE_NUMBER = new AddressField("HOUSE_NUMBER", 7);
    public static final AddressField HOUSE_NUMBER_ADDITION = new AddressField("HOUSE_NUMBER_ADDITION", 8);
    public static final AddressField CITY = new AddressField("CITY", 9);
    public static final AddressField POSTAL_CODE = new AddressField("POSTAL_CODE", 10);
    public static final AddressField COUNTRY_CODE = new AddressField("COUNTRY_CODE", 11);
    public static final AddressField STATE = new AddressField("STATE", 12);
    public static final AddressField DELIVERY_ACCESS_CODE = new AddressField("DELIVERY_ACCESS_CODE", 13);
    public static final AddressField DELIVERY_NO_ACCESS_CODE = new AddressField("DELIVERY_NO_ACCESS_CODE", 14);
    public static final AddressField DELIVERY_INSTRUCTIONS = new AddressField("DELIVERY_INSTRUCTIONS", 15);
    public static final AddressField UNKNOWN = new AddressField("UNKNOWN", 16);

    private static final /* synthetic */ AddressField[] $values() {
        return new AddressField[]{NAME, EMAIL, PHONE_NUMBER, PHONE_COUNTRY_CODE, ADDRESS_LINE1, ADDRESS_LINE2, STREET_NAME, HOUSE_NUMBER, HOUSE_NUMBER_ADDITION, CITY, POSTAL_CODE, COUNTRY_CODE, STATE, DELIVERY_ACCESS_CODE, DELIVERY_NO_ACCESS_CODE, DELIVERY_INSTRUCTIONS, UNKNOWN};
    }

    static {
        AddressField[] addressFieldArr$values = $values();
        $VALUES = addressFieldArr$values;
        $ENTRIES = n.w(addressFieldArr$values);
        INSTANCE = new Companion(null);
    }

    private AddressField(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AddressField valueOf(String str) {
        return (AddressField) Enum.valueOf(AddressField.class, str);
    }

    public static AddressField[] values() {
        return (AddressField[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/AddressField$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/AddressField;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AddressFieldSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
