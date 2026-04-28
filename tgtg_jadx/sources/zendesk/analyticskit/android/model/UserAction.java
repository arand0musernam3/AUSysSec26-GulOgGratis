package zendesk.analyticskit.android.model;

import e0.f;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, d2 = {"Lzendesk/analyticskit/android/model/UserAction;", "", "", "category", "action", AnnotatedPrivateKey.LABEL, "Lzendesk/analyticskit/android/model/Value;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/model/Value;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/model/Value;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_analyticskit_analyticskit_android", "(Lzendesk/analyticskit/android/model/UserAction;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lzendesk/analyticskit/android/model/Value;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/analyticskit/android/model/Value;)Lzendesk/analyticskit/android/model/UserAction;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCategory", "getAction", "getLabel", "Lzendesk/analyticskit/android/model/Value;", "getValue", "Companion", "$serializer", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String action;

    @NotNull
    private final String category;

    @NotNull
    private final String label;

    @NotNull
    private final Value value;

    public /* synthetic */ UserAction(int i11, String str, String str2, String str3, Value value, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, UserAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.category = str;
        this.action = str2;
        this.label = str3;
        this.value = value;
    }

    public static /* synthetic */ UserAction copy$default(UserAction userAction, String str, String str2, String str3, Value value, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userAction.category;
        }
        if ((i11 & 2) != 0) {
            str2 = userAction.action;
        }
        if ((i11 & 4) != 0) {
            str3 = userAction.label;
        }
        if ((i11 & 8) != 0) {
            value = userAction.value;
        }
        return userAction.copy(str, str2, str3, value);
    }

    public static final /* synthetic */ void write$Self$zendesk_analyticskit_analyticskit_android(UserAction self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.category);
        output.q(serialDesc, 1, self.action);
        output.q(serialDesc, 2, self.label);
        output.i(serialDesc, 3, Value$$serializer.INSTANCE, self.value);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Value getValue() {
        return this.value;
    }

    @NotNull
    public final UserAction copy(@NotNull String category, @NotNull String action, @NotNull String label, @NotNull Value value) {
        category.getClass();
        action.getClass();
        label.getClass();
        value.getClass();
        return new UserAction(category, action, label, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAction)) {
            return false;
        }
        UserAction userAction = (UserAction) other;
        return Intrinsics.areEqual(this.category, userAction.category) && Intrinsics.areEqual(this.action, userAction.action) && Intrinsics.areEqual(this.label, userAction.label) && Intrinsics.areEqual(this.value, userAction.value);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + l1.b(l1.b(this.category.hashCode() * 31, 31, this.action), 31, this.label);
    }

    @NotNull
    public String toString() {
        String str = this.category;
        String str2 = this.action;
        String str3 = this.label;
        Value value = this.value;
        StringBuilder sbT = f.t("UserAction(category=", str, ", action=", str2, ", label=");
        sbT.append(str3);
        sbT.append(", value=");
        sbT.append(value);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/analyticskit/android/model/UserAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/analyticskit/android/model/UserAction;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UserAction$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserAction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Value value) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        value.getClass();
        this.category = str;
        this.action = str2;
        this.label = str3;
        this.value = value;
    }
}
