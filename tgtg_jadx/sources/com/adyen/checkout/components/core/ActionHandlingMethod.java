package com.adyen.checkout.components.core;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/components/core/ActionHandlingMethod;", "", "(Ljava/lang/String;I)V", "PREFER_NATIVE", "PREFER_WEB", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ActionHandlingMethod {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActionHandlingMethod[] $VALUES;
    public static final ActionHandlingMethod PREFER_NATIVE = new ActionHandlingMethod("PREFER_NATIVE", 0);
    public static final ActionHandlingMethod PREFER_WEB = new ActionHandlingMethod("PREFER_WEB", 1);

    private static final /* synthetic */ ActionHandlingMethod[] $values() {
        return new ActionHandlingMethod[]{PREFER_NATIVE, PREFER_WEB};
    }

    static {
        ActionHandlingMethod[] actionHandlingMethodArr$values = $values();
        $VALUES = actionHandlingMethodArr$values;
        $ENTRIES = n.w(actionHandlingMethodArr$values);
    }

    private ActionHandlingMethod(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ActionHandlingMethod valueOf(String str) {
        return (ActionHandlingMethod) Enum.valueOf(ActionHandlingMethod.class, str);
    }

    public static ActionHandlingMethod[] values() {
        return (ActionHandlingMethod[]) $VALUES.clone();
    }
}
