package com.braze.ui.inappmessage;

import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.Locale;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAY_NOW", "DISPLAY_LATER", "DISCARD", "REENQUEUE", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InAppMessageOperation {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ InAppMessageOperation[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final InAppMessageOperation DISPLAY_NOW = new InAppMessageOperation("DISPLAY_NOW", 0);
    public static final InAppMessageOperation DISPLAY_LATER = new InAppMessageOperation("DISPLAY_LATER", 1);
    public static final InAppMessageOperation DISCARD = new InAppMessageOperation("DISCARD", 2);
    public static final InAppMessageOperation REENQUEUE = new InAppMessageOperation("REENQUEUE", 3);

    private static final /* synthetic */ InAppMessageOperation[] $values() {
        return new InAppMessageOperation[]{DISPLAY_NOW, DISPLAY_LATER, DISCARD, REENQUEUE};
    }

    static {
        InAppMessageOperation[] inAppMessageOperationArr$values = $values();
        $VALUES = inAppMessageOperationArr$values;
        $ENTRIES = n.w(inAppMessageOperationArr$values);
        INSTANCE = new Companion(null);
    }

    private InAppMessageOperation(String str, int i11) {
    }

    @Nullable
    public static final InAppMessageOperation fromValue(@Nullable String str) {
        return INSTANCE.fromValue(str);
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static InAppMessageOperation valueOf(String str) {
        return (InAppMessageOperation) Enum.valueOf(InAppMessageOperation.class, str);
    }

    public static InAppMessageOperation[] values() {
        return (InAppMessageOperation[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation$Companion;", "", "<init>", "()V", "fromValue", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "value", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nInAppMessageOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageOperation.kt\ncom/braze/ui/inappmessage/InAppMessageOperation$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,16:1\n295#2,2:17\n*S KotlinDebug\n*F\n+ 1 InAppMessageOperation.kt\ncom/braze/ui/inappmessage/InAppMessageOperation$Companion\n*L\n13#1:17,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final InAppMessageOperation fromValue(@Nullable String value) {
            Object upperCase;
            Iterator<E> it = InAppMessageOperation.getEntries().iterator();
            while (true) {
                upperCase = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String strName = ((InAppMessageOperation) next).name();
                if (value != null) {
                    Locale locale = Locale.US;
                    locale.getClass();
                    upperCase = value.toUpperCase(locale);
                    upperCase.getClass();
                }
                if (Intrinsics.areEqual(strName, upperCase)) {
                    upperCase = next;
                    break;
                }
            }
            return (InAppMessageOperation) upperCase;
        }

        private Companion() {
        }
    }
}
